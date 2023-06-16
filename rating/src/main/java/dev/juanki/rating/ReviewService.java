package dev.juanki.rating;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import static org.springframework.data.mongodb.core.aggregation.SelectionOperators.First.first;
import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;
import static org.springframework.data.mongodb.core.query.Update.update;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;


    @Autowired
    private MongoTemplate mongoTemplate;

    public Review createReview(String reviewBody, String imdbId) {      //we create the review asociated with the intern
        Review review = reviewRepository.insert(new Review(reviewBody));


        mongoTemplate.update(Intern.class)
                .matching(where("imdbId").is(imdbId))
                .apply(new Update().push("reviewIds").value(review))
                .first(); // this is the line that is giving me the error

        return review;
    }

}
