package com.example.gate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@SpringBootApplication @EnableDiscoveryClient
public class HarborflowGateApplication { public static void main(String[] args){SpringApplication.run(HarborflowGateApplication.class,args);} }
