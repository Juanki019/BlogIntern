package dev.juanki.rating;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        System.out.println("Adding CORS mappings...");
        registry.addMapping("/api/v1/interns")
                .allowedOrigins("http://localhost:3000")
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                .allowCredentials(true);


        registry.addMapping("/api/v1/interns/{imdbid}")
                .allowedOrigins("http://localhost:3000")
                .allowedMethods("GET")
                .allowCredentials(true);

        // Configuración para /api/v1/reviews
        registry.addMapping("/api/v1/reviews")
                .allowedOrigins("http://localhost:3000")
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                .allowCredentials(true);




    }
}
