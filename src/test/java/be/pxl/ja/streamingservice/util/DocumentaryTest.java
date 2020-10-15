package be.pxl.ja.streamingservice.util;

import be.pxl.ja.streamingservice.model.Documentary;
import be.pxl.ja.streamingservice.model.Genre;
import be.pxl.ja.streamingservice.model.Rating;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DocumentaryTest {

    private static final String TITEL = "Planet Earth";

    @Test
    public void documentaryConstructor() {
        Documentary documentary = new Documentary(TITEL, Rating.TEENS);

        assertEquals(TITEL, documentary.getTitle());
        assertEquals(Rating.TEENS, documentary.getMaturityRating());
        assertEquals(Genre.DOCUMENTARY, documentary.getGenre());
    }
}
