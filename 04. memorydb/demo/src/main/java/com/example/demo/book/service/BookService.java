package com.example.demo.book.service;

import com.example.demo.book.db.entity.BookEntity;
import com.example.demo.book.db.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    // create, update
    public BookEntity create(BookEntity bookEntity){
        return bookRepository.save(bookEntity);
    }
    // all
    public List<BookEntity> findAll(){
        return bookRepository.findAll();
    }

    // delete
    // findone

}
