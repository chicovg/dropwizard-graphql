# DropwizardGraphQL

A simple graph ql server built using dropwizard and graphql-java.  Fetches data from the New York Times article search API:

http://developer.nytimes.com/

How to start the DropwizardGraphQL application
---

1. Run `mvn clean install` to build your application
1. Set the nytimes API key: `export NYT_ARTICLES_API_KEY=<put key here>`
1. Start application with `java -jar target/dropwizard-graphql-1.0-SNAPSHOT.jar server config.yml`
1. Go to `http://localhost:8080/ui` to try a graphql query.

Health Check
---

To see your applications health enter url `http://localhost:8081/healthcheck`
