package ro.dg.bookservice.service;

import org.springframework.stereotype.Service;
import ro.dg.bookservice.domain.Rating;

import java.util.List;
import java.util.Map;

@Service
public class RatingService {
    public List<Rating> findAllRatings() {
        return null;
    }

    public List<Rating> findRatingsByBookId(Long bookId) {
        return null;
    }

    public Rating createRating(Rating rating) {
        return null;
    }

    public void deleteRating(Long ratingId) {

    }

    public Rating updateRating(Rating rating, Long ratingId) {
        return null;
    }

    public Rating updateRating(Map<String,String> updates, Long ratingId) {
        return null;
    }
}
