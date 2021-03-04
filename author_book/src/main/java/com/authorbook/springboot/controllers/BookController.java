package com.authorbook.springboot.controllers;

/*

CREATED ON 03/03/21

 */


import com.authorbook.springboot.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    private final BookRepository bookRepository ;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public  String getBooks(Model model){

        model.addAttribute("books",bookRepository.findAll());

        return "books/list" ;
    }

}
