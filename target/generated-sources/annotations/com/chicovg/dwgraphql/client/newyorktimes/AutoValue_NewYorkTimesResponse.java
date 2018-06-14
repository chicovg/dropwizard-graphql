

package com.chicovg.dwgraphql.client.newyorktimes;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_NewYorkTimesResponse<T> extends NewYorkTimesResponse<T> {

  private final String status;
  private final ResponseData<T> response;

  AutoValue_NewYorkTimesResponse(
      String status,
      ResponseData<T> response) {
    if (status == null) {
      throw new NullPointerException("Null status");
    }
    this.status = status;
    if (response == null) {
      throw new NullPointerException("Null response");
    }
    this.response = response;
  }

  @JsonProperty
  @Override
  public String status() {
    return status;
  }

  @JsonProperty
  @Override
  public ResponseData<T> response() {
    return response;
  }

  @Override
  public String toString() {
    return "NewYorkTimesResponse{"
         + "status=" + status + ", "
         + "response=" + response
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof NewYorkTimesResponse) {
      NewYorkTimesResponse<?> that = (NewYorkTimesResponse<?>) o;
      return (this.status.equals(that.status()))
           && (this.response.equals(that.response()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= status.hashCode();
    h$ *= 1000003;
    h$ ^= response.hashCode();
    return h$;
  }

}
