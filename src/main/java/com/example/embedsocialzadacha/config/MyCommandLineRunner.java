package com.example.embedsocialzadacha.config;

import com.example.embedsocialzadacha.bootstrap.DataHolder;
import com.example.embedsocialzadacha.service.impl.ReviewServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyCommandLineRunner implements CommandLineRunner {
    private final String reviewsJON = "data/reviews.json";

    @Override
    public void run(String... args) throws Exception {
        if(DataHolder.inMemoryReviewList.size()==0)
        {
          try{

          }
          catch (Exception ex)
          {
              System.out.println("Cannot save review "+ex.getMessage());
          }
        }
    }
}
