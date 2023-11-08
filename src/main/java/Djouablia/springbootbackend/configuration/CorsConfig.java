/*package Djouablia.springbootbackend.configuration;

        import org.springframework.context.annotation.Bean;
        import org.springframework.context.annotation.Configuration;
        import org.springframework.web.cors.CorsConfiguration;
        import org.springframework.web.cors.CorsConfigurationSource;
        import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
        import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {
    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration corsConfiguration = new CorsConfiguration();

        // Allow requests from your Angular app's origin
        //corsConfiguration.addAllowedOrigin("http://localhost:4200");

        // Allow requests from the specified origin
        corsConfiguration.addAllowedOrigin("https://moislam-webdev.github.io/EmployeeManager-Frontend/");

        // Allow specific headers
        corsConfiguration.addAllowedHeader("Authorization");
        corsConfiguration.addAllowedHeader("Content-Type");

        // Allow specific HTTP methods
        corsConfiguration.addAllowedMethod("GET");
        corsConfiguration.addAllowedMethod("POST");
        corsConfiguration.addAllowedMethod("PUT");
        corsConfiguration.addAllowedMethod("DELETE");

        // Allow credentials
        corsConfiguration.setAllowCredentials(true);

        source.registerCorsConfiguration("/**", corsConfiguration);
        return new CorsFilter((CorsConfigurationSource) source);
    }
}*/

