package org.sid.demo1_book.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book,Long> {

    List<Book> getBookByTitre(String titre);
}
