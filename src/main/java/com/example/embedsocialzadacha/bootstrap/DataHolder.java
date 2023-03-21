package com.example.embedsocialzadacha.bootstrap;

import com.example.embedsocialzadacha.model.Review;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Getter
public class DataHolder {
    public static List<Review> inMemoryReviewList = new ArrayList<>();
}
