package com.zenhog.sfgjokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ChuckNorrisJokesServiceTest {

    JokesService jokesService;

    @Before
    public void setUp() throws Exception {
        this.jokesService = new ChuckNorrisJokesService(new ChuckNorrisQuotes());
    }

    @Test
    public void getQuote() {
        String quote = jokesService.getJoke();
        assertNotNull(quote);
    }
}
