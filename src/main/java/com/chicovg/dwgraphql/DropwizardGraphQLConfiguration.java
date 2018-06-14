package com.chicovg.dwgraphql;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.client.HttpClientConfiguration;
import io.dropwizard.client.JerseyClientConfiguration;
import org.hibernate.validator.constraints.*;

import javax.validation.Valid;
import javax.validation.constraints.*;

public class DropwizardGraphQLConfiguration extends Configuration {

    private String nytArticlesSearchUrl;

    @Valid
    @NotNull
    @JsonProperty
    private JerseyClientConfiguration httpClient = new JerseyClientConfiguration();

    public JerseyClientConfiguration getJerseyClientConfiguration() {
        return httpClient;
    }

    @NotNull
    @JsonProperty
    public String getNytArticlesSearchUrl() {
        return nytArticlesSearchUrl;
    }

    @JsonProperty
    public void setNytArticlesSearchUrl(String nytArticlesSearchUrl) {
        this.nytArticlesSearchUrl = nytArticlesSearchUrl;
    }
}
