package milansomyk.springboothw.configs;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.File;

public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        String path = "file:///"+System.getProperty("user.home")+ File.separator + "cars" + File.separator;
        registry
                .addResourceHandler("/media/**")
                .addResourceLocations(path);
    }
}
