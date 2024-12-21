package org.sid.demo1_book.service;

import org.sid.demo1_book.dto.BookDto;

import java.util.List;

public interface BookService {
      BookDto saveBook(BookDto bookDto);
      List<BookDto> getBookByTitre(String titre);
     List<BookDto> saveBooks(List<BookDto> bookDtos);

}
