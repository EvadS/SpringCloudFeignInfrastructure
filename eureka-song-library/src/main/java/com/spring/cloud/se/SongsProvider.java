package com.spring.cloud.se;


import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class SongsProvider {

    private static final List<Song> SONGS = Arrays.asList(
            new Song("Hysteria ", "Muse"),
            new Song("Hells Bells ", "AC/DC"),
            new Song("Stairway to Heaven ", "Led Zeppelin"),
            new Song("In the End", "Linkin Park"),
            new Song("Sound of Silence", "Disturbed"),
            new Song("Beat It", "Michael Jackson"),
            new Song("One", "Metallica"),
            new Song("The Times They are a Changing", "Bob Dylan"),
            new Song("Bohemian Rhapsody", "Queen"),
            new Song("Hallelujah", "Jeff Buckley")
    );

    public Song getById(Integer id) {
        return SONGS.get(id % SONGS.size());
    }
}
