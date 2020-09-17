package io.daya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("io.daya.student")
@SpringBootApplication
public class StudentDataBaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentDataBaseApplication.class, args);
	}

}
