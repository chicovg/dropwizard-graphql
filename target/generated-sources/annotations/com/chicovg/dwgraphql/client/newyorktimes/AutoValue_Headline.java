

package com.chicovg.dwgraphql.client.newyorktimes;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_Headline extends Headline {

  private final String main;
  private final String kicker;
  private final String contentKicker;
  private final String name;
  private final String seo;
  private final String sub;

  private AutoValue_Headline(
      @Nullable String main,
      @Nullable String kicker,
      @Nullable String contentKicker,
      @Nullable String name,
      @Nullable String seo,
      @Nullable String sub) {
    this.main = main;
    this.kicker = kicker;
    this.contentKicker = contentKicker;
    this.name = name;
    this.seo = seo;
    this.sub = sub;
  }

  @Nullable
  @JsonProperty(value = "main")
  @Override
  public String main() {
    return main;
  }

  @Nullable
  @JsonProperty(value = "kicker")
  @Override
  public String kicker() {
    return kicker;
  }

  @Nullable
  @JsonProperty(value = "content_kicker")
  @Override
  public String contentKicker() {
    return contentKicker;
  }

  @Nullable
  @JsonProperty(value = "name")
  @Override
  public String name() {
    return name;
  }

  @Nullable
  @JsonProperty(value = "seo")
  @Override
  public String seo() {
    return seo;
  }

  @Nullable
  @JsonProperty(value = "sub")
  @Override
  public String sub() {
    return sub;
  }

  @Override
  public String toString() {
    return "Headline{"
         + "main=" + main + ", "
         + "kicker=" + kicker + ", "
         + "contentKicker=" + contentKicker + ", "
         + "name=" + name + ", "
         + "seo=" + seo + ", "
         + "sub=" + sub
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Headline) {
      Headline that = (Headline) o;
      return ((this.main == null) ? (that.main() == null) : this.main.equals(that.main()))
           && ((this.kicker == null) ? (that.kicker() == null) : this.kicker.equals(that.kicker()))
           && ((this.contentKicker == null) ? (that.contentKicker() == null) : this.contentKicker.equals(that.contentKicker()))
           && ((this.name == null) ? (that.name() == null) : this.name.equals(that.name()))
           && ((this.seo == null) ? (that.seo() == null) : this.seo.equals(that.seo()))
           && ((this.sub == null) ? (that.sub() == null) : this.sub.equals(that.sub()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= (main == null) ? 0 : main.hashCode();
    h$ *= 1000003;
    h$ ^= (kicker == null) ? 0 : kicker.hashCode();
    h$ *= 1000003;
    h$ ^= (contentKicker == null) ? 0 : contentKicker.hashCode();
    h$ *= 1000003;
    h$ ^= (name == null) ? 0 : name.hashCode();
    h$ *= 1000003;
    h$ ^= (seo == null) ? 0 : seo.hashCode();
    h$ *= 1000003;
    h$ ^= (sub == null) ? 0 : sub.hashCode();
    return h$;
  }

  static final class Builder extends Headline.Builder {
    private String main;
    private String kicker;
    private String contentKicker;
    private String name;
    private String seo;
    private String sub;
    Builder() {
    }
    @Override
    public Headline.Builder main(@Nullable String main) {
      this.main = main;
      return this;
    }
    @Override
    public Headline.Builder kicker(@Nullable String kicker) {
      this.kicker = kicker;
      return this;
    }
    @Override
    public Headline.Builder contentKicker(@Nullable String contentKicker) {
      this.contentKicker = contentKicker;
      return this;
    }
    @Override
    public Headline.Builder name(@Nullable String name) {
      this.name = name;
      return this;
    }
    @Override
    public Headline.Builder seo(@Nullable String seo) {
      this.seo = seo;
      return this;
    }
    @Override
    public Headline.Builder sub(@Nullable String sub) {
      this.sub = sub;
      return this;
    }
    @Override
    public Headline build() {
      return new AutoValue_Headline(
          this.main,
          this.kicker,
          this.contentKicker,
          this.name,
          this.seo,
          this.sub);
    }
  }

}
