package pikachu.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pikachu.demo.mappers.BookMapper;
import pikachu.demo.models.Book;

import java.util.concurrent.Callable;

@RestController
public class BookController {
    @Autowired
    private BookMapper bookMapper;

    @GetMapping("/books/{id}")
    public Callable<Book> book(@PathVariable Integer id) {
        return () -> bookMapper.findByPrimaryKey(id);
    }
}
