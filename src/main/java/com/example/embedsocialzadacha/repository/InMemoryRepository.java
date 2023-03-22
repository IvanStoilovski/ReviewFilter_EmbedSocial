package com.example.embedsocialzadacha.repository;

import com.example.embedsocialzadacha.bootstrap.DataHolder;
import com.example.embedsocialzadacha.model.Review;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class InMemoryRepository {
    public List<Review> findAll()
    {
        return DataHolder.inMemoryReviewList;
    }
    public List<Review>findAllStartingFromReview(Integer CompareRating)
    {
        return DataHolder.inMemoryReviewList.stream().filter(f->f.getRating()>=CompareRating).collect(Collectors.toList());
    }
    public void save (String id, String reviewId, String reviewFullText,
                      String reviewText, String numLikes, String numComments, String numShares,
                      String rating, String reviewCreatedOn, String reviewCreatedOnDate,
                      String reviewCreatedOnTime, String reviewerId, String reviewerUrl, String reviewerName,
                      String reviewerEmail, String sourceType, String isVerified, String source, String sourceName,
                      String sourceId, List tags, String href, String logoHref, List photos)
    {
        DataHolder.inMemoryReviewList.removeIf(f->f.getId().equals(id));
        DataHolder.inMemoryReviewList.add(new Review(id,reviewId,reviewFullText,reviewText,numLikes,numComments,numShares,rating,reviewCreatedOn,
                reviewCreatedOnDate,reviewCreatedOnTime,reviewerId,reviewerUrl,reviewerName,reviewerEmail,sourceType,isVerified,source,
                sourceName,sourceId,tags,href,logoHref,photos));
    }
    public void saveAll(List<Review> reviews)
    {
        DataHolder.inMemoryReviewList.addAll(reviews);
    }
}
