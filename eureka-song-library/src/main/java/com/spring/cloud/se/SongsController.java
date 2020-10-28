package com.spring.cloud.se;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/songs")
public class SongsController {

    private final SongsProvider songsProvider;

    @GetMapping("/{id}")
    public Song getSong(@PathVariable("id") Integer id) {
        log.info("Received song request. Id: " + id);
        return songsProvider.getById(id);
    }
}