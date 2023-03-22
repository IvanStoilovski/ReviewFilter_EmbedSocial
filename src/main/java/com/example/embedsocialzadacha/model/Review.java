package com.example.embedsocialzadacha.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;

import java.time.OffsetDateTime;
import java.util.List;

public class Review {
    private String Id;
    private String reviewId;
    private String reviewFullText;
    private String reviewText;
    private Integer numLikes;
    private Integer numComments;
    private Integer numShares;
    private Integer rating;
    private String reviewCreatedOn;
    private OffsetDateTime reviewCreatedOnDate;
    private String reviewCreatedOnTime;
    private String reviewerId;
    private String reviewerUrl;
    private String reviewerName;
    private String reviewerEmail;
    private String sourceType;
    private Boolean isVerified;
    private String source;
    private String sourceName;
    private String sourceId;
    private List tags;
    private String href;
    private String logoHref;
    private List photos;

    public Review(@JsonProperty("id") String id, @JsonProperty("reviewId") String reviewId, @JsonProperty("reviewFullText") String reviewFullText,
                  @JsonProperty("reviewText") String reviewText,@JsonProperty("numLikes") String numLikes,@JsonProperty("numComments") String numComments,
                  @JsonProperty("numShares") String numShares, @JsonProperty("rating") String rating, @JsonProperty("reviewCreatedOn") String reviewCreatedOn,
                  @JsonProperty("reviewCreatedOnDate") String reviewCreatedOnDate,@JsonProperty("reviewCreatedOnTime") String reviewCreatedOnTime,
                  @JsonProperty("reviewerId") String reviewerId, @JsonProperty("reviewerUrl") String reviewerUrl,@JsonProperty("reviewerName") String reviewerName,
                  @JsonProperty("reviewerEmail") String reviewerEmail, @JsonProperty("sourceType") String sourceType,@JsonProperty("isVerified") String isVerified,
                  @JsonProperty("source") String source, @JsonProperty("sourceName") String sourceName, @JsonProperty("sourceId") String sourceId,
                  @JsonProperty("tags") List tags, @JsonProperty("href") String href,@JsonProperty("logoHref") String logoHref,@JsonProperty("photos") List photos) {
        Id = id;
        this.reviewId = reviewId;
        this.reviewFullText = reviewFullText;
        this.reviewText = reviewText;
        this.numLikes = Integer.parseInt(numLikes);
        this.numComments = Integer.parseInt(numComments);
        this.numShares = Integer.parseInt(numShares);
        this.rating = Integer.parseInt(rating);
        this.reviewCreatedOn = reviewCreatedOn;
        this.reviewCreatedOnDate = OffsetDateTime.parse(reviewCreatedOnDate);
        this.reviewCreatedOnTime = reviewCreatedOnTime;
        this.reviewerId = reviewerId;
        this.reviewerUrl = reviewerUrl;
        this.reviewerName = reviewerName;
        this.reviewerEmail = reviewerEmail;
        this.sourceType = sourceType;
        this.isVerified = Boolean.valueOf(isVerified);
        this.source = source;
        this.sourceName = sourceName;
        this.sourceId = sourceId;
        this.tags = tags;
        this.href = href;
        this.logoHref = logoHref;
        this.photos = photos;
    }

    public Review(String id, String reviewId, String reviewFullText, String reviewText, Integer numLikes, Integer numComments, Integer numShares,
                  Integer rating, String reviewCreatedOn, OffsetDateTime reviewCreatedOnDate, String reviewCreatedOnTime, String reviewerId,
                  String reviewerUrl, String reviewerName, String reviewerEmail, String sourceType, Boolean isVerified, String source, String sourceName,
                  String sourceId, List tags, String href, String logoHref, List photos) {
        Id = id;
        this.reviewId = reviewId;
        this.reviewFullText = reviewFullText;
        this.reviewText = reviewText;
        this.numLikes = numLikes;
        this.numComments = numComments;
        this.numShares = numShares;
        this.rating = rating;
        this.reviewCreatedOn = reviewCreatedOn;
        this.reviewCreatedOnDate = reviewCreatedOnDate;
        this.reviewCreatedOnTime = reviewCreatedOnTime;
        this.reviewerId = reviewerId;
        this.reviewerUrl = reviewerUrl;
        this.reviewerName = reviewerName;
        this.reviewerEmail = reviewerEmail;
        this.sourceType = sourceType;
        this.isVerified = isVerified;
        this.source = source;
        this.sourceName = sourceName;
        this.sourceId = sourceId;
        this.tags = tags;
        this.href = href;
        this.logoHref = logoHref;
        this.photos = photos;
    }

    public String getReviewFullText() {
        return reviewFullText;
    }

    public String getReviewText() {
        return reviewText;
    }

    public Integer getRating() {
        return rating;
    }

    public String getReviewCreatedOn() {
        return reviewCreatedOn;
    }

    public OffsetDateTime getReviewCreatedOnDate() {
        return reviewCreatedOnDate;
    }

    public String getReviewCreatedOnTime() {
        return reviewCreatedOnTime;
    }
    public String getId()
    {
        return Id;
    }

    public List getTags() {
        return tags;
    }

    public void setTags(List tags) {
        this.tags = tags;
    }

    public List getPhotos() {
        return photos;
    }

    public void setPhotos(List photos) {
        this.photos = photos;
    }
    public void printDetailsForTesting()
    {
        System.out.println("id: "+getId()+ " rating: "+getRating());
    }
}
