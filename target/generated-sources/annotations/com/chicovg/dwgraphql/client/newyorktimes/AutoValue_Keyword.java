

package com.chicovg.dwgraphql.client.newyorktimes;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_Keyword extends Keyword {

  private final String name;
  private final String value;
  private final Integer rank;
  private final String major;

  AutoValue_Keyword(
      @Nullable String name,
      @Nullable String value,
      @Nullable Integer rank,
      @Nullable String major) {
    this.name = name;
    this.value = value;
    this.rank = rank;
    this.major = major;
  }

  @Nullable
  @JsonProperty(value = "name")
  @Override
  public String name() {
    return name;
  }

  @Nullable
  @JsonProperty(value = "value")
  @Override
  public String value() {
    return value;
  }

  @Nullable
  @JsonProperty(value = "rank")
  @Override
  public Integer rank() {
    return rank;
  }

  @Nullable
  @JsonProperty(value = "major")
  @Override
  public String major() {
    return major;
  }

  @Override
  public String toString() {
    return "Keyword{"
         + "name=" + name + ", "
         + "value=" + value + ", "
         + "rank=" + rank + ", "
         + "major=" + major
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Keyword) {
      Keyword that = (Keyword) o;
      return ((this.name == null) ? (that.name() == null) : this.name.equals(that.name()))
           && ((this.value == null) ? (that.value() == null) : this.value.equals(that.value()))
           && ((this.rank == null) ? (that.rank() == null) : this.rank.equals(that.rank()))
           && ((this.major == null) ? (that.major() == null) : this.major.equals(that.major()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= (name == null) ? 0 : name.hashCode();
    h$ *= 1000003;
    h$ ^= (value == null) ? 0 : value.hashCode();
    h$ *= 1000003;
    h$ ^= (rank == null) ? 0 : rank.hashCode();
    h$ *= 1000003;
    h$ ^= (major == null) ? 0 : major.hashCode();
    return h$;
  }

}
