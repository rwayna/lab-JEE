package com.example.bookcatalog.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI bookCatalogOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Book Catalog API")
                        .description("API for managing books")
                        .version("1.0.0"));
    }
}