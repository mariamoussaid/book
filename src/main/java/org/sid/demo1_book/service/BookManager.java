package org.sid.demo1_book.service;

import org.sid.demo1_book.dao.Book;
import org.sid.demo1_book.dao.BookRepository;
import org.sid.demo1_book.dto.BookDto;
import org.sid.demo1_book.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookManager implements BookService {

     private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    public BookManager(BookRepository bookRepository, BookMapper bookMapper) {
        this.bookRepository = bookRepository;
        this.bookMapper = bookMapper;
    }


    @Override
    public BookDto saveBook(BookDto bookDto) {
        Book book = bookMapper.fromBookDtoToBook(bookDto);
        book = bookRepository.save(book);
        bookDto = bookMapper.fromBookToBookDto(book);
        return bookDto;
    }

    @Override
    public List<BookDto> getBookByTitre(String titre) {
        List<Book> books = bookRepository.getBookByTitre(titre);
        List<BookDto> bookDtos = new ArrayList<>();
        for (Book book : books) {
            bookDtos.add(bookMapper.fromBookToBookDto(book));
        }
        return bookDtos;
    }

    @Override
    public List<BookDto> saveBooks(List<BookDto> bookDtos) {
        List<Book> books = new ArrayList<>();
        for (BookDto bookDto : bookDtos) {
            books.add(bookMapper.fromBookDtoToBook(bookDto));
        }

        books = bookRepository.saveAll(books);

        List<BookDto> result = new ArrayList<>();
        for (Book book : books) {
            result.add(bookMapper.fromBookToBookDto(book));
        }
        return result;
    }
}
