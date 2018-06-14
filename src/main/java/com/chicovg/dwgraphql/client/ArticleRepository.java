package com.chicovg.dwgraphql.client;

import com.chicovg.dwgraphql.client.newyorktimes.Article;
import com.chicovg.dwgraphql.client.newyorktimes.NewYorkTimesResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.client.Client;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;
import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON_TYPE;
import static javax.ws.rs.core.Response.Status.OK;

public class ArticleRepository {

    private static final Logger LOGGER = LoggerFactory.getLogger(ArticleRepository.class);


    private Client timesClient;
    private String apiUrl;
    private String apiKey;

    public ArticleRepository(Client timesClient,
                             String apiUrl,
                             String apiKey) {
        this.timesClient = timesClient;
        this.apiUrl = apiUrl;
        this.apiKey = apiKey;
    }

    public List<Article> queryArticles() {
        Response response = this.timesClient.target(this.apiUrl)
                .queryParam("api-key", this.apiKey)
                .request(APPLICATION_JSON_TYPE)
                .get();

        if (OK.getStatusCode() == response.getStatus()) {
            NewYorkTimesResponse<List<Article>> articlesResponse =
                    response.readEntity(new GenericType<NewYorkTimesResponse<List<Article>>>(){});

            return articlesResponse.response().docs();

        } else {
            LOGGER.error("NY Times article search request failed, response was: " + response.readEntity(String.class));
            throw new WebApplicationException("NY Times article search request failed");
        }
    }
}
