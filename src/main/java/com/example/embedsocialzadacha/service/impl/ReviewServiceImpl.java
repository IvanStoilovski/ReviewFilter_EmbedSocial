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
    public List<Review> sortWithParameters(Boolean highestRating, Integer minRating, Boolean oldest, Boolean prioritizeText) {
        return inMemoryRepository.SortWithParameters(highestRating, minRating, oldest, prioritizeText);
    }
}
