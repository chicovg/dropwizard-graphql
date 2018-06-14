package com.chicovg.dwgraphql.client.newyorktimes;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.auto.value.AutoValue;

@AutoValue
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class NewYorkTimesResponse<T> {

    @JsonProperty
    public abstract String status();

    @JsonProperty
    public abstract ResponseData<T> response();

    @JsonCreator
    public static <T> NewYorkTimesResponse<T> create(@JsonProperty("status") String status,
                                                     @JsonProperty("response") ResponseData<T> response) {
        return new AutoValue_NewYorkTimesResponse<>(status, response);
    }
}
