package hw4;

import fourth.book.Book;
import fourth.book.BookRepository;
import fourth.book.BookService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BookServiceTest {

    @Test
    public void testFindBookById() {
        BookRepository mockRepository = mock(BookRepository.class);

        when(mockRepository.findById("123")).thenReturn(new Book("123", "Test Book", "Test Author"));

        BookService bookService = new BookService(mockRepository);

        Book result = bookService.findBookById("123");

        assertEquals("Test Book", result.getTitle());
        assertEquals("Test Author", result.getAuthor());
    }

    @Test
    public void testFindAllBooks() {
        BookRepository mockRepository = mock(BookRepository.class);

        when(mockRepository.findAll()).thenReturn(List.of(new Book("123", "Test Book", "Test Author")));

        BookService bookService = new BookService(mockRepository);

        List<Book> result = bookService.findAllBooks();

        assertEquals(1, result.size());
        assertEquals("Test Book", result.get(0).getTitle());
        assertEquals("Test Author", result.get(0).getAuthor());
    }
}