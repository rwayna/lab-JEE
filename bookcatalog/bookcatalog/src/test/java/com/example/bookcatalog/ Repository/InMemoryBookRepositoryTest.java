package com.example.bookcatalog.repository;

import com.example.bookcatalog.model.Book;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InMemoryBookRepositoryTest {
    @Test
    void testSaveAndFindBook() {
        BookRepository repository = new InMemoryBookRepository(); // Correction ici
        Book book = new Book(null, "Test Book", "Author", "1234567890", null, 100, "Genre");
        Book savedBook = repository.save(book);
        assertNotNull(savedBook.getId());
    }
}