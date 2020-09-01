package com.contracts;

import javafx.application.Application;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BenefitsOfContractsEmploymentApplication {

    public static void main(String[] args) {
        /**
         * This is how normal Spring Boot app would be launched
         */
        // SpringApplication.run(BenefitsOfContractsEmploymentApplication.class, args);

        /**
         * Spring Boot app launches JavaFX app
         */
        Application.launch(JavaFxApplication.class, args);
    }

}
