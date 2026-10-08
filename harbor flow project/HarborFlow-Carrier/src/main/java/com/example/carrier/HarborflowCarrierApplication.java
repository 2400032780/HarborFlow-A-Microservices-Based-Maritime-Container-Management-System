package com.example.carrier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@SpringBootApplication @EnableDiscoveryClient
public class HarborflowCarrierApplication { public static void main(String[] args){SpringApplication.run(HarborflowCarrierApplication.class,args);} }
