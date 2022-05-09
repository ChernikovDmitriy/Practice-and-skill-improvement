package com.jwt.security.spring;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Spring Security - JWT")
                                .version("1.0.0")
                                .contact(
                                        new Contact()
                                                .email("mi@tut.uz")
                                                .url("https://easy.uz")
                                                .name("Ktoto Tam")
                )
                );
    }

}
