//package com.assignment.booking.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//@Configuration
//public class CorsConfig {
//
//    @Bean
//    public WebMvcConfigurer webMvcConfigurer(){
//
//        return new WebMvcConfigurer() {
//            @Override
//            public void addCorsMappings(CorsRegistry registry) {
//                registry.addMapping("/**")
//                        .allowedMethods("GET","POST","PUT","DELETE")
//                        .allowedHeaders("*")
//                        .allowedOrigins("http://127.0.0.1:5501")
//                         .allowCredentials(true);
//            }
//        };
//    }
//}
