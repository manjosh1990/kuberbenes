package com.manjosh.kube.bookmarker.api;

import com.manjosh.kube.bookmarker.domain.Bookmark;
import com.manjosh.kube.bookmarker.domain.BookmarkService;
import com.manjosh.kube.bookmarker.domain.BookmarksDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/bookmarks")
@RequiredArgsConstructor
public class BookmarkController {

    private final BookmarkService bookmarkService;
    @GetMapping
    public BookmarksDTO getBookMarks(@RequestParam(name="page", defaultValue = "1") Integer page,
                                     @RequestParam(name = "query",defaultValue = "") String query){
        if(query== null || query.trim().length()==0)
            return bookmarkService.getBookmarks(page);

        return bookmarkService.searchBookmarks(query,page);
    }
}
