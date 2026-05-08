package com.example.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.stereotype.Component;

@Component
public class JwtUtil {

    private final String SECRET =
"myverylongsecretkeyforjwtsecurity123456789abcdef";

    public String extractUsername(String token) {

        try {

            Claims claims = Jwts.parser()
                    .setSigningKey(SECRET)
                    .parseClaimsJws(token)
                    .getBody();

            return claims.getSubject();

        } catch (Exception e) {

            System.out.println("JWT ERROR: " + e.getMessage());

            throw new RuntimeException("Invalid Token");
        }
    }
}