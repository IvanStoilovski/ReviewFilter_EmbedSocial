package com.example.embedsocialzadacha.service;

import com.example.embedsocialzadacha.model.Review;

import java.util.List;

public interface ReviewService {
    List<Review> findAll();
    public void saveOrUpdate(String id, String reviewId, String reviewFullText,
                             String reviewText, String numLikes, String numComments, String numShares,
                             String rating, String reviewCreatedOn, String reviewCreatedOnDate,
                             String reviewCreatedOnTime, String reviewerId, String reviewerUrl, String reviewerName,
                             String reviewerEmail, String sourceType, String isVerified, String source, String sourceName,
                             String sourceId, List tags, String href, String logoHref, List photos);
    public void saveAll(List<Review> reviews);

}
