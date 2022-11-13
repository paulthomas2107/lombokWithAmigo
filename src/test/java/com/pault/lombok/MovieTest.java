package com.pault.lombok;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest extends Movie {
  
    private Movie movie;

    @BeforeEach
    void setUp() throws MalformedURLException {

        movie = Movie.builder()
                .title("The Lord of The Rings: The Fellowship of The Ring")
                .description("Set in Middle Earth with Hobbits and Trolls etc.")
                .country("New Zealand / United States")
                .language("English")
                .rating(8)
                .officialSite(new URL("https://www.lordoftherings.com"))
                .id(1L)
                .minutes(120)
                .cast(Arrays.asList("Paul", "Caitlin", "Rory"))
                .build();
    }

    @Test
    void testGetId() {
        assertNotNull(movie);
        assertEquals(1L, movie.getId());
    }

    @Test
    void testSetId() {
        assertNotNull(movie);
        movie.setId(2L);
        assertEquals(2, movie.getId());
    }

    @Test
    void testGetTitle() {
        assertNotNull(movie);
        assertEquals("The Lord of The Rings: The Fellowship of The Ring", movie.getTitle());
    }

    @Test
    void testSetTitle() {
        assertNotNull(movie);
        movie.setTitle("The House at Downing ~Street");
        assertEquals("The House at Downing ~Street", movie.getTitle());
    }

    @Test
    void testGetDescription() {
        assertNotNull(movie);
        assertEquals("Set in Middle Earth with Hobbits and Trolls etc.", movie.getDescription());
    }

    @Test
    void testSetDescription() {
        assertNotNull(movie);
        movie.setDescription("The usual amount of gore !!!");
        assertEquals("The usual amount of gore !!!", movie.getDescription());
    }

    @Test
    void testGetCountry() {
        assertNotNull(movie);
        assertEquals("New Zealand / United States", movie.getCountry());
    }

    @Test
    void testSetCountry() {
        assertNotNull(movie);
        movie.setCountry("Germany");
        assertEquals("Germany", movie.getCountry());
    }

    @Test
    void testGetRating() {
        assertNotNull(movie);
        assertEquals(8, movie.getRating());
    }

    @Test
    void testSetRating() {
        assertNotNull(movie);
        movie.setRating(129);
        assertEquals(129, movie.getRating());
    }

    @Test
    void testGetOfficialSite() throws MalformedURLException {
        assertNotNull(movie);
        assertEquals(new URL("https://www.lordoftherings.com"), movie.getOfficialSite());
    }

    @Test
    void testSetOfficialSite() throws MalformedURLException {
        assertNotNull(movie);
        movie.setOfficialSite(new URL("http://www.gore.net"));
        assertEquals(new URL("http://www.gore.net"), movie.getOfficialSite());
    }

    @Test
    void testGetLanguage() {
        assertNotNull(movie);
        assertEquals("English", movie.getLanguage());
    }

    @Test
    void testSetLanguage() {
        assertNotNull(movie);
        movie.setLanguage("Chinese");
        assertEquals("Chinese", movie.getLanguage() );
    }

    @Test
    void testGetMinutesPlusX() {
        assertNotNull(movie);
        assertEquals(121, movie.getMinutesPlusX(1));
    }


    @Test
    void testSetCast() {
        assertNotNull(movie);
        movie.setCast(Arrays.asList("Paul", "Caitlin", "Rory"));
        assertEquals(Arrays.asList("Paul", "Caitlin", "Rory"), movie.getCast());
    }

    @Test
    void testGetCast() {
        assertNotNull(movie);
        assertEquals(Arrays.asList("Paul", "Caitlin", "Rory"), movie.getCast());
    }

}