package com.pault.lombok;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest extends Movie {

    private Movie movie;

    @BeforeEach
    void setUp() throws MalformedURLException {
        movie = new Movie();
        movie.setTitle("The Lord of The Rings: The Fellowship of The Ring");
        movie.setDescription("Set in Middle Earth with Hobbits and Trolls etc.");
        movie.setCountry("New Zealand / United States");
        movie.setLanguage("English");
        movie.setRating(8);
        movie.setOfficialSite(new URL("https://www.lordoftherings.com"));
        movie.setId(1L);
    }

    @Test
    void testGetId() {
        assertNotNull(movie);
        assertEquals(1L, getId());
    }

    @Test
    void testSetId() {
    }

    @Test
    void testGetTitle() {
    }

    @Test
    void testSetTitle() {
    }

    @Test
    void testGetDescription() {
    }

    @Test
    void testSetDescription() {
    }

    @Test
    void testGetCountry() {
    }

    @Test
    void testSetCountry() {
    }

    @Test
    void testGetRating() {
    }

    @Test
    void testSetRating() {
    }

    @Test
    void testGetOfficialSite() {
    }

    @Test
    void testSetOfficialSite() {
    }

    @Test
    void testGetLanguage() {
    }

    @Test
    void testSetLanguage() {
    }
}