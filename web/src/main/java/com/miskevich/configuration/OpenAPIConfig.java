package com.miskevich.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI().info(apiInfo());
    }

    private Info apiInfo() {
        return new Info()
                .title("Rent API")
                .description("API for working with rent")
                .version("2.0")
                .contact(apiContact());

    }



    private Contact apiContact() {
        return new Contact()
                .name("Miskevich Evgeniy")
                .email("evgeniymiskevich@gmail.com");
    }
}
