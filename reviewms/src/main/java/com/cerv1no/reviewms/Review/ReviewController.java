package com.cerv1no.reviewms.Review;

import com.cerv1no.reviewms.Review.messaging.ReviewMessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    private final ReviewService reviewService;
    private final ReviewMessageProducer reviewMessageProducer;

    public ReviewController (ReviewService reviewService, ReviewMessageProducer reviewMessageProducer) {
        this.reviewService = reviewService;
        this.reviewMessageProducer = reviewMessageProducer;
    }

    @GetMapping
    public ResponseEntity<List<Review>> getAllReviews(@RequestParam Long companyId) {
        return new ResponseEntity<>(reviewService.getAllReviews(companyId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> addReview(@RequestParam Long companyId, @RequestBody Review review) {
        if (reviewService.addReview(companyId, review)) {
            reviewMessageProducer.sendMessage(review);
            return new ResponseEntity<>("review added successfully", HttpStatus.OK);
        }
        else
            return new ResponseEntity<>("review not added successfully", HttpStatus.NOT_FOUND);
    }

    @GetMapping("{reviewId}")
    public  ResponseEntity<Review> getReview(@PathVariable Long reviewId) {
        return new ResponseEntity<>(reviewService.getReview(reviewId), HttpStatus.OK);
    }

    @PutMapping("{reviewId}")
    public  ResponseEntity<String> updateReview(@PathVariable Long reviewId,
                                                @RequestBody Review review) {
        if (reviewService.updateReview(reviewId, review))
            return new ResponseEntity<>("Review successfully updated", HttpStatus.OK);
        else
            return new ResponseEntity<>("Review not successfully updated", HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("{reviewId}")
    public ResponseEntity<String> deleteReview(@PathVariable Long reviewId) {
        if (reviewService.deleteReview(reviewId))
            return new ResponseEntity<>("Review successfully deleted", HttpStatus.OK);
        else
            return new ResponseEntity<>("Review not successfully deleted", HttpStatus.NOT_FOUND);
    }

    @GetMapping("/averageRating")
    public Double getAverageReview(@RequestParam Long companyId) {
        List<Review> reviewList = reviewService.getAllReviews(companyId);
        return reviewList.stream().mapToDouble(Review::getRating).
                average().orElse(0.0);
    }
}
