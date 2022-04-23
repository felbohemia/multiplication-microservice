package mcroservices.book.multiplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ComponentScan({"mcroservices.book.multiplication","configuration","challenge", "controllers"})
public class MultiplicationApplication {
	public static void main(String[] args) {
		SpringApplication.run(MultiplicationApplication.class, args);
	}
}
