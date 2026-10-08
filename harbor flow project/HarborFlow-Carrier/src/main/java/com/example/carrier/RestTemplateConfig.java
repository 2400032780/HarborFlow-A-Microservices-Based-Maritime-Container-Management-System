package com.example.carrier;
import org.springframework.context.annotation.*;
import org.springframework.web.client.RestTemplate;
@Configuration public class RestTemplateConfig { @Bean public RestTemplate rt(){return new RestTemplate();} }
