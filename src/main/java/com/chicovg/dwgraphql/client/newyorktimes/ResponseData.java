package com.chicovg.dwgraphql.client.newyorktimes;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.auto.value.AutoValue;

@AutoValue
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class ResponseData<T> {

    @JsonProperty("docs")
    public abstract T docs();

    @JsonCreator
    public static <T> ResponseData<T> create(@JsonProperty("docs") T docs){
        return new AutoValue_ResponseData<>(docs);
    }
}
