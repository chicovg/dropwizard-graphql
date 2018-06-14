package com.chicovg.dwgraphql;

import com.chicovg.dwgraphql.client.ArticleRepository;
import com.chicovg.dwgraphql.core.Query;
import com.coxautodev.graphql.tools.SchemaParser;
import graphql.schema.GraphQLSchema;
import graphql.servlet.GraphQLServlet;
import graphql.servlet.SimpleGraphQLServlet;
import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.client.JerseyClientBuilder;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import javax.ws.rs.client.Client;
import java.util.Optional;

public class DropwizardGraphQLApplication extends Application<DropwizardGraphQLConfiguration> {

    public static void main(final String[] args) throws Exception {
        new DropwizardGraphQLApplication().run(args);
    }

    @Override
    public String getName() {
        return "DropwizardGraphQL";
    }

    @Override
    public void initialize(final Bootstrap<DropwizardGraphQLConfiguration> bootstrap) {
        bootstrap.addBundle(new AssetsBundle("/assets/", "/ui"));
    }

    @Override
    public void run(final DropwizardGraphQLConfiguration configuration,
                    final Environment environment) {

        final Client nyTimesClient = new JerseyClientBuilder(environment)
                .using(configuration.getJerseyClientConfiguration())
                .build("nyTimesClient");

        final ArticleRepository articleRepository = new ArticleRepository(nyTimesClient,
                configuration.getNytArticlesSearchUrl(),
                getRequiredEnv("NYT_ARTICLES_API_KEY"));

        final Query queryResolver = new Query(articleRepository);

        final GraphQLSchema schema = SchemaParser.newParser()
                .file("schema.graphqls")
                .resolvers(queryResolver)
                .build()
                .makeExecutableSchema();

        final GraphQLServlet servlet = new SimpleGraphQLServlet(schema);

        environment.servlets()
                .addServlet("graphql", servlet)
                .addMapping("/graphql");
    }

    private static String getRequiredEnv(String key) {
        return Optional.ofNullable(System.getenv(key))
                .orElseThrow(() -> new IllegalStateException("required environment variable " + key + " is missing!"));
    }

}
