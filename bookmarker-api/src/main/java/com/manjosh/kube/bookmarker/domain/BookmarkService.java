package com.manjosh.kube.bookmarker.domain;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class BookmarkService {
    private final BookmarkRepository bookmarkRepository;

    @Transactional(readOnly=true)
    public List<Bookmark> getBookmarks(){
        return bookmarkRepository.findAll();
    }
}
