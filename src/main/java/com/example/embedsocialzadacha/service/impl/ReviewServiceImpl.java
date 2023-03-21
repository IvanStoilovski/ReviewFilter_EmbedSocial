package com.example.embedsocialzadacha.service.impl;

import com.example.embedsocialzadacha.model.Review;
import com.example.embedsocialzadacha.repository.InMemoryRepository;
import com.example.embedsocialzadacha.service.ReviewService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReviewServiceImpl implements ReviewService {
    private final InMemoryRepository inMemoryRepository;

    public ReviewServiceImpl(InMemoryRepository inMemoryRepository) {
        this.inMemoryRepository = inMemoryRepository;
    }

    @Override
    public List<Review> findAll() {
        return inMemoryRepository.findAll();
    }

    @Override
    public void saveOrUpdate(String id, String reviewId, String reviewFullText, String reviewText,
                             String numLikes, String numComments, String numShares, String rating,
                             String reviewCreatedOn, String reviewCreatedOnDate, String reviewCreatedOnTime,
                             String reviewerId, String reviewerUrl, String reviewerName, String reviewerEmail,
                             String sourceType, String isVerified, String source, String sourceName, String sourceId,
                             String tags, String href, String logoHref, String photos) {
        inMemoryRepository.save(id,reviewId,reviewFullText,reviewText,numLikes,numComments,numShares,rating,reviewCreatedOn,
                reviewCreatedOnDate,reviewCreatedOnTime,reviewerId,reviewerUrl,reviewerName,reviewerEmail,sourceType,isVerified,source,
                sourceName,sourceId,tags,href,logoHref,photos);
    }
}
