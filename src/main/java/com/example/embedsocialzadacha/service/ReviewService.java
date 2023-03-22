package com.example.embedsocialzadacha.service;

import com.example.embedsocialzadacha.model.Review;

import java.util.List;

public interface ReviewService {
    List<Review> sortWithParameters(Boolean highestRating, Integer minRating, Boolean oldest, Boolean prioritizeText);

}
