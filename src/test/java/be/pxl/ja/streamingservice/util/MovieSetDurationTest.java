package be.pxl.ja.streamingservice.util;

import be.pxl.ja.streamingservice.model.Movie;
import be.pxl.ja.streamingservice.model.Rating;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MovieSetDurationTest {
    @Test
    public void negativeDurationBecomesPositive() {
        Movie movie = new Movie("Titanic", Rating.OLDER_KIDS);

        movie.setDuration(-125);

        assertEquals(125, movie.getDuration());
    }

    @Test
    public void positiveDurationStaysUnchanged() {
        Movie movie = new Movie("Titanic", Rating.OLDER_KIDS);

        movie.setDuration(125);

        assertEquals(125, movie.getDuration());
    }
}
