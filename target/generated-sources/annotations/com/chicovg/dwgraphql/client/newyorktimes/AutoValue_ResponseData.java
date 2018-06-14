

package com.chicovg.dwgraphql.client.newyorktimes;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_ResponseData<T> extends ResponseData<T> {

  private final T docs;

  AutoValue_ResponseData(
      T docs) {
    if (docs == null) {
      throw new NullPointerException("Null docs");
    }
    this.docs = docs;
  }

  @JsonProperty(value = "docs")
  @Override
  public T docs() {
    return docs;
  }

  @Override
  public String toString() {
    return "ResponseData{"
         + "docs=" + docs
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ResponseData) {
      ResponseData<?> that = (ResponseData<?>) o;
      return (this.docs.equals(that.docs()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= docs.hashCode();
    return h$;
  }

}
