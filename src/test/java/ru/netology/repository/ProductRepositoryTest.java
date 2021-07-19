package ru.netology.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.exception.NotFoundException;

import static org.junit.jupiter.api.Assertions.*;

public class ProductRepositoryTest {
    private final ProductRepository repository = new ProductRepository();
    private final Book firstBook = new Book(1, "The Master and Margarita", 500, "Mikhail Bulgakov");
    private final Book secondBook = new Book(2, "A dog's heart", 1000, "Mikhail Bulgakov");

    private final Smartphone firstSmartphone = new Smartphone(3, "s8", 59_000, "samsung");
    private final Smartphone secondSmartphone = new Smartphone(4, "a50", 17_000, "samsung");


    @BeforeEach
    public void setUp() {
        repository.save(firstBook);
        repository.save(secondBook);
        repository.save(firstSmartphone);
        repository.save(secondSmartphone);
    }

    @Test
    public void mustDeleteAnExistingElement() {
        Product[] expected = new Product[]{firstBook, secondBook, firstSmartphone};
        Product[] actual = repository.removeById(4);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldThrowAnExceptionWhenTryingToDeleteNonExistentElement() {
        int id = 5;

        assertThrows(NotFoundException.class, () -> repository.removeById(5));
        assertThrows(NotFoundException.class, () -> repository.removeById(5), "Element with id: " + id + " not found");
    }
}
