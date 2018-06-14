package com.chicovg.dwgraphql.client.newyorktimes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.auto.value.AutoValue;

import javax.annotation.Nullable;

@AutoValue
@JsonDeserialize(builder = AutoValue_Headline.Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class Headline {

    @Nullable
    @JsonProperty("main")
    public abstract String main();

    @Nullable
    @JsonProperty("kicker")
    public abstract String kicker();

    @Nullable
    @JsonProperty("content_kicker")
    public abstract String contentKicker();

    @Nullable
    @JsonProperty("name")
    public abstract String name();

    @Nullable
    @JsonProperty("seo")
    public abstract String seo();

    @Nullable
    @JsonProperty("sub")
    public abstract String sub();

    public static Builder builder() {
        return new AutoValue_Headline.Builder();
    }

    @AutoValue.Builder
    @JsonPOJOBuilder(withPrefix = "")
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static abstract class Builder {

        @JsonProperty("main")
        public abstract Builder main(String main);

        @JsonProperty("kicker")
        public abstract Builder kicker(String kicker);

        @JsonProperty("content_kicker")
        public abstract Builder contentKicker(String contentKicker);

        @JsonProperty("name")
        public abstract Builder name(String name);

        @JsonProperty("seo")
        public abstract Builder seo(String seo);

        @JsonProperty("sub")
        public abstract Builder sub(String sub);

        public abstract Headline build();
    }

}
