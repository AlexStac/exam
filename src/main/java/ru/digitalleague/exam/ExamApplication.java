package ru.digitalleague.exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import ru.digitalleague.exam.config.ApplicationConfiguration;

@SpringBootApplication
@Import(ApplicationConfiguration.class)
public class ExamApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamApplication.class, args);
    }

}
