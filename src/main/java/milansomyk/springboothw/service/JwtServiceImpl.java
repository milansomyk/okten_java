package milansomyk.springboothw.service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class JwtServiceImpl implements JwtService{
    @Value("${jwt.signingKey}")
    private String signingKey;
    private Key key;
    @PostConstruct
    public void setKey(){
        key = Keys.hmacShaKeyFor(signingKey.getBytes());
    }
    @Override
    public boolean isTokenExpired(String token) {
        return resolveClaim(token, Claims::getExpiration).before(new Date());
    }

    @Override
    public String extractUsername(String token) {
        return resolveClaim(token, Claims::getSubject);
    }

    @Override
    public String generateToken(UserDetails userDetails) {
        String roles = userDetails.getAuthorities()
                .stream()
                .map(GrantedAuthority::getAuthority)
                .collect(Collectors.joining(", "));
        return Jwts
                .builder()
                .setClaims(Map.of("roles", roles))
                .setSubject(userDetails.getUsername())
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 60 * 60 * 1000))
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();
    }
    private <T> T resolveClaim(String token, Function<Claims, T> resolver){
        Claims claims = extractClaims(token);
        return resolver.apply(claims);
    }
    private Claims extractClaims(String token){
        return Jwts.parserBuilder()
                .setSigningKey(key)
                .build()
                .parseClaimsJws(token)
                .getBody();
    }
}
