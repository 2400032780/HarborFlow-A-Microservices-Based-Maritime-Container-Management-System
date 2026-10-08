package com.example.container;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@SpringBootApplication @EnableDiscoveryClient
public class HarborflowContainerApplication { public static void main(String[] args){SpringApplication.run(HarborflowContainerApplication.class,args);} }
