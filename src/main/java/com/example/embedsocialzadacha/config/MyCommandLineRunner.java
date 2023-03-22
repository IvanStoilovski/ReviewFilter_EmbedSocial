//package com.example.embedsocialzadacha.config;
//
//import com.example.embedsocialzadacha.bootstrap.DataHolder;
//import com.example.embedsocialzadacha.data.ReviewData;
//import com.example.embedsocialzadacha.model.Review;
//import com.example.embedsocialzadacha.service.ReviewService;
//import com.fasterxml.jackson.core.type.TypeReference;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.apache.tomcat.util.json.JSONParser;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Configuration;
//
//import java.io.InputStream;
//import java.util.ArrayList;
//import java.util.List;
//
//@Configuration
//public class MyCommandLineRunner implements CommandLineRunner {
//    private final String REVIEWS_JSON = "C:\\Users\\ivans\\OneDrive\\Desktop\\EmbedSocialZadacha\\src\\main\\resources\\data\\reviews.json";
//
//    @Autowired
//    private final ReviewService reviewService;
//
//    public MyCommandLineRunner(ReviewService reviewService) {
//        this.reviewService = reviewService;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        if(DataHolder.inMemoryReviewList.size()==0)
//        {
//          try{
//              TypeReference<List<ReviewData>> typeReference = new TypeReference<List<ReviewData>>(){};
//              InputStream inputStream = TypeReference.class.getResourceAsStream(REVIEWS_JSON);
//             // List<ReviewData> reviewData = new ObjectMapper().readValue(inputStream,typeReference);
//              List<ReviewData> reviewData = (List<ReviewData>) new JSONParser(inputStream);
//              if(reviewData!=null && !reviewData.isEmpty())
//              {
//                  List<Review> reviews = new ArrayList<>();
//                  reviewData.forEach(review -> reviews.add(new Review(review.getId(),review.getReviewId(),review.getReviewFullText(),review.getReviewText(),
//                          review.getNumLikes(),review.getNumComments(),review.getNumShares(), review.getRating(), review.getReviewCreatedOn(),
//                          review.getReviewCreatedOnDate(), review.getReviewCreatedOnTime(),
//                          review.getReviewerName(),review.getSourceType(),review.getVerified(),review.getSource(),
//                          review.getSourceName(),review.getSourceId())));
//                  reviewService.saveAll(reviews);
//                  System.out.println(DataHolder.inMemoryReviewList.size());
//              }
//          }
//          catch (Exception ex)
//          {
//              System.out.println("Cannot save review "+ex.getMessage());
//          }
//        }
//    }
//}
