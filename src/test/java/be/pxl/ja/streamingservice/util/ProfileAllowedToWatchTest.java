package be.pxl.ja.streamingservice.util;

import be.pxl.ja.streamingservice.model.Content;
import be.pxl.ja.streamingservice.model.Movie;
import be.pxl.ja.streamingservice.model.Profile;
import be.pxl.ja.streamingservice.model.Rating;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class ProfileAllowedToWatchTest {

    Profile profile;

    @BeforeEach
    public void init() {
        profile = new Profile();
    }

    @Test
    public void returnsFalseWhenDateOfBirthIsNull(){
        Content content = new Movie("Movie", Rating.LITTLE_KIDS);
        assertFalse(profile.allowedToWatch(content));
    }

    @Test
    public void littleKidsContentNotAllowed(){
        profile.setDateOfBirth(LocalDate.of(2026,1,1));
        Content content = new Movie("Movie", Rating.LITTLE_KIDS);
        assertFalse(profile.allowedToWatch(content));
    }

    @Test
    public void littleKidsContentAllowed(){
        profile.setDateOfBirth(LocalDate.of(2017, 1, 1));
        Content content = new Movie("Movie", Rating.LITTLE_KIDS);
        assertTrue(profile.allowedToWatch(content));
    }

    @Test
    public void olderKidsContentNotAllowed(){
        profile.setDateOfBirth(LocalDate.of(2019,1,1));
        Content content = new Movie("Movie", Rating.OLDER_KIDS);
        assertFalse(profile.allowedToWatch(content));
    }

    @Test
    public void olderKidsContentAllowed(){
        profile.setDateOfBirth(LocalDate.of(2010, 1, 1));
        Content content = new Movie("Movie", Rating.OLDER_KIDS);
        assertTrue(profile.allowedToWatch(content));
    }

    @Test
    public void teensContentNotAllowed(){
        profile.setDateOfBirth(LocalDate.of(2014,1,1));
        Content content = new Movie("Movie", Rating.TEENS);
        assertFalse(profile.allowedToWatch(content));
    }

    @Test
    public void teensContentAllowed(){
        profile.setDateOfBirth(LocalDate.of(2005, 1, 1));
        Content content = new Movie("Movie", Rating.TEENS);
        assertTrue(profile.allowedToWatch(content));
    }

    @Test
    public void matureContentNotAllowed(){
        profile.setDateOfBirth(LocalDate.of(2010,1,1));
        Content content = new Movie("Movie", Rating.MATURE);
        assertFalse(profile.allowedToWatch(content));
    }

    @Test
    public void matureContentAllowed(){
        profile.setDateOfBirth(LocalDate.of(2001, 1, 1));
        Content content = new Movie("Movie", Rating.MATURE);
        assertTrue(profile.allowedToWatch(content));
    }
}
