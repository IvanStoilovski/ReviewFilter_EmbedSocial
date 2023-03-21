package com.example.embedsocialzadacha.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;

import java.time.OffsetDateTime;

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
    private String tags;
    private String href;
    private String logoHref;
    private String photos;

    public Review(@JsonProperty("id") String id, String reviewId, String reviewFullText,
                  String reviewText, String numLikes, String numComments, String numShares,
                  String rating, String reviewCreatedOn, String reviewCreatedOnDate,
                  String reviewCreatedOnTime, String reviewerId, String reviewerUrl, String reviewerName,
                  String reviewerEmail, String sourceType, String isVerified, String source, String sourceName,
                  String sourceId, String tags, String href, String logoHref, String photos) {
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
}
