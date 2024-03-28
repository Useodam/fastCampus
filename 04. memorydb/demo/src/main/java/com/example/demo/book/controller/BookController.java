package com.example.demo.book.controller;

import com.example.demo.book.db.entity.BookEntity;
import com.example.demo.book.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/book")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @PostMapping("")
    public BookEntity create(@RequestBody BookEntity bookEntity){
        return bookService.create(bookEntity);
    }

    public List<BookEntity> findAll(){
        return bookService.findAll();
    }


}
