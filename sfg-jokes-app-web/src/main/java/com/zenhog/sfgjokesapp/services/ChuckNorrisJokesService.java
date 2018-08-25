package com.zenhog.sfgjokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("default")
@Primary
public class ChuckNorrisJokesService implements JokesService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisJokesService(ChuckNorrisQuotes chuckNorrisQuotes) {

        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
