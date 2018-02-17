package pikachu.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController
public class BookController {
    @GetMapping("/books")
    public Callable<List<Book>> books() {
        return () -> IntStream.range(1, 3)
                .mapToObj(i -> new Book())
                .collect(Collectors.toList());
    }
}
