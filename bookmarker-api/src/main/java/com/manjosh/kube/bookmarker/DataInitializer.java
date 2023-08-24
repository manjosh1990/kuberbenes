package com.manjosh.kube.bookmarker;

import com.manjosh.kube.bookmarker.domain.Bookmark;
import com.manjosh.kube.bookmarker.domain.BookmarkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {
    private final BookmarkRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Bookmark(null,"google","https://www.google.com", Instant.now()));
        repository.save(new Bookmark(null,"twitter","https://www.twitter.com", Instant.now()));
        repository.save(new Bookmark(null,"facebook","https://www.facebook.com", Instant.now()));
        repository.save(new Bookmark(null,"yahoo","https://www.yahoo.in", Instant.now()));
        repository.save(new Bookmark(null,"youtube","https://www.youtube.com", Instant.now()));
    }
}
