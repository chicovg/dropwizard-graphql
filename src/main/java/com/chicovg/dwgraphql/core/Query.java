package com.chicovg.dwgraphql.core;

import com.chicovg.dwgraphql.client.ArticleRepository;
import com.chicovg.dwgraphql.client.newyorktimes.Article;
import com.coxautodev.graphql.tools.GraphQLRootResolver;

import java.util.List;

public class Query implements GraphQLRootResolver {

    private ArticleRepository articleRepository;

    public Query(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public List<Article> articles() {
        return this.articleRepository.queryArticles();
    }
}
