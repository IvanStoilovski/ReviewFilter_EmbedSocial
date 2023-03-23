package com.example.embedsocialzadacha.repository;

import com.example.embedsocialzadacha.bootstrap.DataHolder;
import com.example.embedsocialzadacha.model.Review;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Comparator;
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
    public List<Review> filterByMinRating(List<Review> list, Integer rating)
    {
        return list.stream().filter(f->f.getRating()>=rating).collect(Collectors.toList());
    }
    public void sortByRatingAndDatePriority(List<Review> reviews, Boolean highestFirst, Boolean oldest)
    {
        if(highestFirst && !oldest)
        {
            reviews.sort(Comparator.comparing(Review::getRating).reversed());
        }
        else if(highestFirst)
        {

            reviews.sort(Comparator.comparing(Review::getRating).reversed().thenComparing(Review::getReviewCreatedOnDate));
        }
        else if(!oldest)
        {
            reviews.sort(Comparator.comparing(Review::getRating));
        }
        else if(oldest)
        {
            reviews.sort(Comparator.comparing(Review::getRating).thenComparing(Review::getReviewCreatedOnDate));
        }
    }
    public List<Review> SortWithParameters(Boolean highestRating, Integer minRating, Boolean oldest, Boolean prioritizeText)
    {
        List<Review> listWithMinRating=filterByMinRating(findAll(),minRating);
        List<Review> temp = new ArrayList<>();
        if(prioritizeText)
        {
            List<Review> tempWithText = listWithMinRating.stream().filter(f -> f.getReviewText().length()>0).collect(Collectors.toList());
            sortByRatingAndDatePriority(tempWithText,highestRating, oldest);
            List<Review> tempWithoutText = listWithMinRating.stream().filter(f -> f.getReviewText().length() == 0).collect(Collectors.toList());
            sortByRatingAndDatePriority(tempWithoutText,highestRating, oldest);
            temp.addAll(tempWithText);
            temp.addAll(tempWithoutText);
        }
        else {
            temp = listWithMinRating;
            sortByRatingAndDatePriority(temp,highestRating, oldest);
        }
        return temp;
    }

}
