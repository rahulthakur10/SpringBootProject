package com.authorbook.springboot.bootstrap;

import com.authorbook.springboot.domain.Author;
import com.authorbook.springboot.domain.Book;
import com.authorbook.springboot.domain.Publisher;
import com.authorbook.springboot.repositories.AuthorRepository;
import com.authorbook.springboot.repositories.BookRepository;
import com.authorbook.springboot.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository ;
    private final BookRepository bookRepository ;
    private final PublisherRepository publisherRepository ;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository= publisherRepository ;

    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Started in Bootstrap");

        Publisher publisher = new Publisher();
        publisher.setName("SFG Publishing");
        publisher.setCity("St Petersburg");
        publisher.setState("FL");

        publisherRepository.save(publisher);

        System.out.println("Publisher Count: " + publisherRepository.count());

        Author a1 = new Author("Rahul", "Thakur");
        Book b1 = new Book("Computer Application","123123");

        a1.getBooks().add(b1);
        b1.getAuthors().add(a1);

        authorRepository.save(a1);
        bookRepository.save(b1);

        Author a2 = new Author("Neeraj", "Chauhan");
        Book b2 = new Book("Physics","123321");

        a2.getBooks().add(b2);
        b2.getAuthors().add(a2);

        authorRepository.save(a2);
        bookRepository.save(b2);

        System.out.println("Started 2nd in Bootstrap");
        System.out.println("Number of Books: " + bookRepository.count());

    }
}
