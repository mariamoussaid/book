package org.sid.demo1_book.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class BookDto {
    String titre;
    String publisher;
    Date datePublication;
    double price;
    String resume;

}
