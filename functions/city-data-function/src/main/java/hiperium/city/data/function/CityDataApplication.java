package hiperium.city.data.function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The CityDataApplication class is the entry point for running the application.
 * It is annotated with @SpringBootApplication, indicating that it is a Spring Boot application.
 */
@SpringBootApplication
public class CityDataApplication {

    /**
     * The main method of the CityDataApplication class.
     * It is the entry point for running the application.
     *
     * @param args an array of command line arguments passed to the application
     */
    public static void main(String[] args) {
        SpringApplication.run(CityDataApplication.class, args);
    }
}
