package be.pxl.ja.streamingservice.util;

import be.pxl.ja.streamingservice.model.Movie;
import be.pxl.ja.streamingservice.model.Rating;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MovieIsLongPlayingTimeTest {

    private Movie movie;

    @BeforeEach
    public void init() {
        movie = new Movie("Titanic", Rating.TEENS);
    }

    @Test
    public void movieWithDurationShorterThenLongPlayingTimeReturnsFalse() {
        movie.setDuration(Movie.LONG_PLAYING_TIME - 1);

        assertFalse(movie.isLongPlayingTime());
    }

    @Test
    public void movieWithDurationExactlyLongPlayingTimeReturnsTrue() {
        movie.setDuration(Movie.LONG_PLAYING_TIME);

        assertTrue(movie.isLongPlayingTime());
    }

    @Test
    public void movieWithDurationLongerThenLongPlayingTimeReturnsTrue() {
        movie.setDuration(Movie.LONG_PLAYING_TIME + 1);

        assertTrue(movie.isLongPlayingTime());
    }
}
