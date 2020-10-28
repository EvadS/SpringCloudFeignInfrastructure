package com.spring.cloud.se;

import org.springframework.stereotype.Component;

/***
 *  the logic that will be triggered when the servers are unavailable (th
 */
@Component
public class FallbackSongClient implements SongClient {

    @Override
    public Song getById(Long id) {
        return new Song("Unknown Track", "John Doe");
    }
}