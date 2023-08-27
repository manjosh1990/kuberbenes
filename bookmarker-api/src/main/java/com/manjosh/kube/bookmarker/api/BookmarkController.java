package com.manjosh.kube.bookmarker.api;

import com.manjosh.kube.bookmarker.domain.BookmarkDTO;
import com.manjosh.kube.bookmarker.domain.BookmarkService;
import com.manjosh.kube.bookmarker.domain.BookmarksDTO;
import com.manjosh.kube.bookmarker.domain.CreateBookmarkRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/bookmarks")
@RequiredArgsConstructor
public class BookmarkController {

    private final BookmarkService bookmarkService;

    @GetMapping
    public BookmarksDTO getBookMarks(@RequestParam(name = "page", defaultValue = "1") Integer page,
                                     @RequestParam(name = "query", defaultValue = "") String query) {
        if (query == null || query.trim().length() == 0)
            return bookmarkService.getBookmarks(page);

        return bookmarkService.searchBookmarks(query, page);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BookmarkDTO createBookmark(@RequestBody @Valid CreateBookmarkRequest request) {
        return bookmarkService.createBookmark(request);
    }
}
