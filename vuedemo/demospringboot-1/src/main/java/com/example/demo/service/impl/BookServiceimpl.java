package com.example.demo.service.impl;

import com.example.demo.bean.Book;
import com.example.demo.mapper.BookMapper;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceimpl implements BookService {
    @Autowired
    BookMapper bookMapper;
    @Override
    public List<Book> getAllBook() {
        System.out.println("123");
        return bookMapper.getAllBook();
    }
}
