import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class CorsConfig : WebMvcConfigurer {
    override fun addCorsMappings(registry: CorsRegistry) {
        registry.addMapping("/**")
            .allowedOrigins("*") // Set the allowed origins, e.g. "*" for all origins, or specify specific origins
            .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Set the allowed HTTP methods
            .allowedHeaders("*") // Set the allowed headers, e.g. "*" for all headers, or specify specific headers
            .maxAge(3600) // Set the max age (in seconds) for caching of pre-flight responses
    }
}