package com.example.embedsocialzadacha.web;

import com.example.embedsocialzadacha.model.Review;
import com.example.embedsocialzadacha.service.ReviewService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping({"/home","/"})
public class HomeController {
    private final ReviewService reviewService;

    public HomeController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping
    public String home()
    {
        return "filterForm";
    }
    @PostMapping("/filter")
    public String filterReviews(Model model,
                                @RequestParam Boolean highestRating,
                                @RequestParam Integer minRating,
                                @RequestParam Boolean oldest,
                                @RequestParam Boolean prioritizeText)
    {
        List<Review> list=reviewService.sortWithParameters(highestRating,minRating,oldest,prioritizeText);
        model.addAttribute("reviews", list);
        return "filtered";
    }
    @GetMapping("/filtered")
    public String showFiltered()
    {
        return "filtered";
    }
}
