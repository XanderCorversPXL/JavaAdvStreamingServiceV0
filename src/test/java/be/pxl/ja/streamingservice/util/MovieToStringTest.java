package be.pxl.ja.streamingservice.util;

import be.pxl.ja.streamingservice.model.Movie;
import be.pxl.ja.streamingservice.model.Rating;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

public class MovieToStringTest {

    private Movie movie;

    @BeforeEach
    public void init() {
        movie = new Movie("Titanic", Rating.TEENS);
    }

    @Test
    public void MovieWithTitleAndReleaseDateKnownShowsTheseInToString() {
        movie.setReleaseDate(LocalDate.of(1997, 1, 1));

        assertTrue(movie.toString().contains(Integer.toString(movie.getReleaseDate().getYear())) && movie.toString().contains(movie.getTitle()));
    }

    @Test
    public void MovieWithTitleAndNoReleaseDateOnlyShowsTitleInToString() {
        assertTrue(movie.toString().contains(movie.getTitle()));
        assertNull(movie.getReleaseDate());
    }
}
