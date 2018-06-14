

package com.chicovg.dwgraphql.client.newyorktimes;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableList;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_Article extends Article {

  private final String webUrl;
  private final String snippet;
  private final String source;
  private final Headline headline;
  private final ImmutableList<Keyword> keywords;
  private final String pubDate;
  private final String documentType;
  private final String typeOfMaterial;
  private final String id;
  private final Integer word;
  private final Integer score;

  private AutoValue_Article(
      @Nullable String webUrl,
      @Nullable String snippet,
      @Nullable String source,
      @Nullable Headline headline,
      @Nullable ImmutableList<Keyword> keywords,
      @Nullable String pubDate,
      @Nullable String documentType,
      @Nullable String typeOfMaterial,
      @Nullable String id,
      @Nullable Integer word,
      @Nullable Integer score) {
    this.webUrl = webUrl;
    this.snippet = snippet;
    this.source = source;
    this.headline = headline;
    this.keywords = keywords;
    this.pubDate = pubDate;
    this.documentType = documentType;
    this.typeOfMaterial = typeOfMaterial;
    this.id = id;
    this.word = word;
    this.score = score;
  }

  @Nullable
  @JsonProperty(value = "web_url")
  @Override
  public String webUrl() {
    return webUrl;
  }

  @Nullable
  @JsonProperty(value = "snippet")
  @Override
  public String snippet() {
    return snippet;
  }

  @Nullable
  @JsonProperty(value = "source")
  @Override
  public String source() {
    return source;
  }

  @Nullable
  @JsonProperty(value = "headline")
  @Override
  public Headline headline() {
    return headline;
  }

  @Nullable
  @JsonProperty(value = "keywords")
  @Override
  public ImmutableList<Keyword> keywords() {
    return keywords;
  }

  @Nullable
  @JsonProperty(value = "pub_date")
  @Override
  public String pubDate() {
    return pubDate;
  }

  @Nullable
  @JsonProperty(value = "document_type")
  @Override
  public String documentType() {
    return documentType;
  }

  @Nullable
  @JsonProperty(value = "type_of_material")
  @Override
  public String typeOfMaterial() {
    return typeOfMaterial;
  }

  @Nullable
  @JsonProperty(value = "__id")
  @Override
  public String id() {
    return id;
  }

  @Nullable
  @JsonProperty(value = "word")
  @Override
  public Integer word() {
    return word;
  }

  @Nullable
  @JsonProperty(value = "score")
  @Override
  public Integer score() {
    return score;
  }

  @Override
  public String toString() {
    return "Article{"
         + "webUrl=" + webUrl + ", "
         + "snippet=" + snippet + ", "
         + "source=" + source + ", "
         + "headline=" + headline + ", "
         + "keywords=" + keywords + ", "
         + "pubDate=" + pubDate + ", "
         + "documentType=" + documentType + ", "
         + "typeOfMaterial=" + typeOfMaterial + ", "
         + "id=" + id + ", "
         + "word=" + word + ", "
         + "score=" + score
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Article) {
      Article that = (Article) o;
      return ((this.webUrl == null) ? (that.webUrl() == null) : this.webUrl.equals(that.webUrl()))
           && ((this.snippet == null) ? (that.snippet() == null) : this.snippet.equals(that.snippet()))
           && ((this.source == null) ? (that.source() == null) : this.source.equals(that.source()))
           && ((this.headline == null) ? (that.headline() == null) : this.headline.equals(that.headline()))
           && ((this.keywords == null) ? (that.keywords() == null) : this.keywords.equals(that.keywords()))
           && ((this.pubDate == null) ? (that.pubDate() == null) : this.pubDate.equals(that.pubDate()))
           && ((this.documentType == null) ? (that.documentType() == null) : this.documentType.equals(that.documentType()))
           && ((this.typeOfMaterial == null) ? (that.typeOfMaterial() == null) : this.typeOfMaterial.equals(that.typeOfMaterial()))
           && ((this.id == null) ? (that.id() == null) : this.id.equals(that.id()))
           && ((this.word == null) ? (that.word() == null) : this.word.equals(that.word()))
           && ((this.score == null) ? (that.score() == null) : this.score.equals(that.score()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= (webUrl == null) ? 0 : webUrl.hashCode();
    h$ *= 1000003;
    h$ ^= (snippet == null) ? 0 : snippet.hashCode();
    h$ *= 1000003;
    h$ ^= (source == null) ? 0 : source.hashCode();
    h$ *= 1000003;
    h$ ^= (headline == null) ? 0 : headline.hashCode();
    h$ *= 1000003;
    h$ ^= (keywords == null) ? 0 : keywords.hashCode();
    h$ *= 1000003;
    h$ ^= (pubDate == null) ? 0 : pubDate.hashCode();
    h$ *= 1000003;
    h$ ^= (documentType == null) ? 0 : documentType.hashCode();
    h$ *= 1000003;
    h$ ^= (typeOfMaterial == null) ? 0 : typeOfMaterial.hashCode();
    h$ *= 1000003;
    h$ ^= (id == null) ? 0 : id.hashCode();
    h$ *= 1000003;
    h$ ^= (word == null) ? 0 : word.hashCode();
    h$ *= 1000003;
    h$ ^= (score == null) ? 0 : score.hashCode();
    return h$;
  }

  static final class Builder extends Article.Builder {
    private String webUrl;
    private String snippet;
    private String source;
    private Headline headline;
    private ImmutableList<Keyword> keywords;
    private String pubDate;
    private String documentType;
    private String typeOfMaterial;
    private String id;
    private Integer word;
    private Integer score;
    Builder() {
    }
    @Override
    public Article.Builder webUrl(@Nullable String webUrl) {
      this.webUrl = webUrl;
      return this;
    }
    @Override
    public Article.Builder snippet(@Nullable String snippet) {
      this.snippet = snippet;
      return this;
    }
    @Override
    public Article.Builder source(@Nullable String source) {
      this.source = source;
      return this;
    }
    @Override
    public Article.Builder headline(@Nullable Headline headline) {
      this.headline = headline;
      return this;
    }
    @Override
    public Article.Builder keywords(@Nullable List<Keyword> keywords) {
      this.keywords = (keywords == null ? null : ImmutableList.copyOf(keywords));
      return this;
    }
    @Override
    public Article.Builder pubDate(@Nullable String pubDate) {
      this.pubDate = pubDate;
      return this;
    }
    @Override
    public Article.Builder documentType(@Nullable String documentType) {
      this.documentType = documentType;
      return this;
    }
    @Override
    public Article.Builder typeOfMaterial(@Nullable String typeOfMaterial) {
      this.typeOfMaterial = typeOfMaterial;
      return this;
    }
    @Override
    public Article.Builder id(@Nullable String id) {
      this.id = id;
      return this;
    }
    @Override
    public Article.Builder word(@Nullable Integer word) {
      this.word = word;
      return this;
    }
    @Override
    public Article.Builder score(@Nullable Integer score) {
      this.score = score;
      return this;
    }
    @Override
    public Article build() {
      return new AutoValue_Article(
          this.webUrl,
          this.snippet,
          this.source,
          this.headline,
          this.keywords,
          this.pubDate,
          this.documentType,
          this.typeOfMaterial,
          this.id,
          this.word,
          this.score);
    }
  }

}
