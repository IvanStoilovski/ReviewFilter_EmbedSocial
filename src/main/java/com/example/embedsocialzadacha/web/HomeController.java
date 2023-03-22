package com.example.embedsocialzadacha.web;

import com.example.embedsocialzadacha.model.Review;
import com.example.embedsocialzadacha.service.ReviewService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping({"/home","/"})
public class HomeController {
    private final ReviewService reviewService;

    public HomeController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping
    public String home(Model model)
    {
        List<Review> list=reviewService.sortWithParameters(false,2,true,true);
        model.addAttribute("reviews", list);
        return "home";
    }
}
