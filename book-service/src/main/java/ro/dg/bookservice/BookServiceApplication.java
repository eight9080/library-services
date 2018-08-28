package ro.dg.bookservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookServiceApplication {

	public String message;
	public String message2;
	public String message3;

	public static void main(String[] args) {
		SpringApplication.run(BookServiceApplication.class, args);
	}


}
