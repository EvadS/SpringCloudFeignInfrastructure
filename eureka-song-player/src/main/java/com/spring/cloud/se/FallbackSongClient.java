package com.spring.cloud.se;

import org.springframework.stereotype.Component;

@Component
public class FallbackSongClient implements SongClient {

    @Override
    public Song getById(Long id) {
        return new Song("Unknown Track", "John Doe");
    }
}