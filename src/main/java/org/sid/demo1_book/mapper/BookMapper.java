package org.sid.demo1_book.mapper;

import org.modelmapper.ModelMapper;
import org.sid.demo1_book.dao.Book;
import org.sid.demo1_book.dto.BookDto;
import org.springframework.stereotype.Component;
@Component
public class BookMapper {
    private  final  ModelMapper mapper = new ModelMapper();
      public Book fromBookDtoToBook(BookDto bookDto){
        return mapper.map(bookDto, Book.class);
    }

      public BookDto fromBookToBookDto(Book book){
        return mapper.map(book, BookDto.class);
    }

}
