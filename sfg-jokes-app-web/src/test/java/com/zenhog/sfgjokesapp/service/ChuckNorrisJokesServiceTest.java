package com.zenhog.sfgjokesapp.service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ChuckNorrisJokesServiceTest {

    JokesService jokesService;

    @Before
    public void setUp() throws Exception {
        this.jokesService = new ChuckNorrisJokesService();
    }

    @Test
    public void getQuote() {
        String quote = jokesService.getJoke();
        assertNotNull(quote);
    }
}
