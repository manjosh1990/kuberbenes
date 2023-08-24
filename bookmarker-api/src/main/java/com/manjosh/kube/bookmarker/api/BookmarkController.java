package com.manjosh.kube.bookmarker.api;

import com.manjosh.kube.bookmarker.domain.Bookmark;
import com.manjosh.kube.bookmarker.domain.BookmarkService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/bookmarks")
@RequiredArgsConstructor
public class BookmarkController {

    private final BookmarkService bookmarkService;
    @GetMapping
    public List<Bookmark> getBookMarks(){
        return bookmarkService.getBookmarks();
    }
}
