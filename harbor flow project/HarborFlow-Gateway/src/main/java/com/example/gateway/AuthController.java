package com.example.gateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
public class AuthController {
 @Autowired JwtUtil jwt;
 @PostMapping("/auth/login")
 public String login(@RequestParam String username,@RequestParam String password){
  if("admin".equals(username)&&"admin".equals(password)) return jwt.generate(username);
  return "Invalid Credentials";
 }
}
