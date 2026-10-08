package com.example.gateway;
import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import javax.crypto.SecretKey;
import org.springframework.stereotype.Component;
@Component
public class JwtUtil {
 private final SecretKey key=Keys.hmacShaKeyFor("HarborFlowSecretKeyForJwtAuthentication2026".getBytes(StandardCharsets.UTF_8));
 public String generate(String username){return Jwts.builder().subject(username).issuedAt(new Date()).expiration(new Date(System.currentTimeMillis()+3600000)).signWith(key).compact();}
 public boolean valid(String token){try{Jwts.parser().verifyWith(key).build().parseSignedClaims(token);return true;}catch(Exception e){return false;}}
}
