package org.sid.demo1_book;

import org.sid.demo1_book.dto.BookDto;
import org.sid.demo1_book.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Demo1BookApplication {

	public static void main(String[] args) {
		SpringApplication.run(Demo1BookApplication.class, args);
	}

	@Bean
	CommandLineRunner start(BookService bookService){
		return  args -> {
			bookService.saveBooks(
					List.of(
							BookDto.builder().titre("titre1").publisher("mohamed").price(12345).resume("autre").build(),
							BookDto.builder().titre("titre2").publisher("fati").price(65489).resume("ville").build(),
							BookDto.builder().titre("titre3").publisher("zaynab").price(89789).resume("lettre").build(),
							BookDto.builder().titre("titre4").publisher("mou").price(67489).resume("montagne").build()
					)

			);
		};
	}
}
