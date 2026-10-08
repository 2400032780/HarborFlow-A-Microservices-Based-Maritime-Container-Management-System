package com.example.gateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;
@Component
public class JwtFilter implements GlobalFilter, Ordered {
 @Autowired JwtUtil jwt;
 public Mono<Void> filter(ServerWebExchange ex, GatewayFilterChain chain){
  String path=ex.getRequest().getURI().getPath();
  if(path.startsWith("/auth/")) return chain.filter(ex);
  String h=ex.getRequest().getHeaders().getFirst("Authorization");
  if(h!=null && h.startsWith("Bearer ") && jwt.valid(h.substring(7))) return chain.filter(ex);
  ex.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED); return ex.getResponse().setComplete();
 }
 public int getOrder(){return -1;}
}
