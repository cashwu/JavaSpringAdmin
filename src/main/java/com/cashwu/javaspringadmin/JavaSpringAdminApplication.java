package com.cashwu.javaspringadmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class JavaSpringAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaSpringAdminApplication.class, args);
    }

}
