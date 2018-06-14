package com.chicovg.dwgraphql.client.newyorktimes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.auto.value.AutoValue;
import com.google.common.collect.ImmutableList;

import javax.annotation.Nullable;
import java.util.List;

@AutoValue
@JsonDeserialize(builder = AutoValue_Article.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class Article {

    @Nullable
    @JsonProperty("web_url")
    public abstract String webUrl();

    @Nullable
    @JsonProperty("snippet")
    public abstract String snippet();

    @Nullable
    @JsonProperty("source")
    public abstract String source();

    @Nullable
    @JsonProperty("headline")
    public abstract Headline headline();

    @Nullable
    @JsonProperty("keywords")
    public abstract ImmutableList<Keyword> keywords();

    @Nullable
    @JsonProperty("pub_date")
    public abstract String pubDate();

    @Nullable
    @JsonProperty("document_type")
    public abstract String documentType();

    @Nullable
    @JsonProperty("type_of_material")
    public abstract String typeOfMaterial();

    @Nullable
    @JsonProperty("__id")
    public abstract String id();

    @Nullable
    @JsonProperty("word")
    public abstract Integer word();

    @Nullable
    @JsonProperty("score")
    public abstract Integer score();

    public static Builder builder() {
        return new AutoValue_Article.Builder();
    }

    @AutoValue.Builder
    @JsonPOJOBuilder(withPrefix = "")
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static abstract class Builder {

        @JsonProperty("web_url")
        public abstract Builder webUrl(String webUrl);

        @JsonProperty("snippet")
        public abstract Builder snippet(String snippet);

        @JsonProperty("source")
        public abstract Builder source(String source);

        @JsonProperty("headline")
        public abstract Builder headline(Headline headline);

        @JsonProperty("keywords")
        public abstract Builder keywords(List<Keyword> keywords);

        @JsonProperty("pub_date")
        public abstract Builder pubDate(String pubDate);

        @JsonProperty("document_type")
        public abstract Builder documentType(String documentType);

        @JsonProperty("type_of_material")
        public abstract Builder typeOfMaterial(String typeOfMaterial);

        @JsonProperty("__id")
        public abstract Builder id(String id);

        @JsonProperty("word")
        public abstract Builder word(Integer word);

        @JsonProperty("score")
        public abstract Builder score(Integer score);

        public abstract Article build();
    }
}
