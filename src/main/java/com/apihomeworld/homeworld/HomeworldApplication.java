package com.apihomeworld.homeworld;

import com.apihomeworld.homeworld.Security.dao.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@Configuration
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class HomeworldApplication {

    public static void main(String[] args) {
        SpringApplication.run(HomeworldApplication.class, args);
    }

}
