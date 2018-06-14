package com.chicovg.dwgraphql.client.newyorktimes;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.auto.value.AutoValue;

import javax.annotation.Nullable;

@AutoValue
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class Keyword {

    @Nullable
    @JsonProperty("name")
    public abstract String name();

    @Nullable
    @JsonProperty("value")
    public abstract String value();

    @Nullable
    @JsonProperty("rank")
    public abstract Integer rank();

    @Nullable
    @JsonProperty("major")
    public abstract String major();

    @JsonCreator
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static Keyword create(@JsonProperty("name") String name,
                                 @JsonProperty("value") String value,
                                 @JsonProperty("rank") Integer rank,
                                 @JsonProperty("major") String major) {
        return new AutoValue_Keyword(name, value, rank, major);
    }
}
