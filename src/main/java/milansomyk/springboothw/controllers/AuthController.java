package milansomyk.springboothw.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import milansomyk.springboothw.dto.JwtResponse;
import milansomyk.springboothw.dto.RefreshRequest;
import milansomyk.springboothw.dto.SignInRequest;
import milansomyk.springboothw.service.JwtService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthController {
    private final AuthenticationManager authenticationManager;
    private final UserDetailsService userDetailsService;
    private final JwtService jwtService;
    private final ObjectMapper objectMapper;
    @PostMapping("/api/auth/signin")
    public ResponseEntity<JwtResponse> signIn(@RequestBody SignInRequest signInRequest){
        try {
            Authentication authentication = UsernamePasswordAuthenticationToken
                    .unauthenticated(signInRequest.getUsername(), signInRequest.getPassword());
            authenticationManager.authenticate(authentication);
        } catch (AuthenticationException e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new JwtResponse(null,null, e.getMessage()));
        }
        UserDetails userDetails = userDetailsService.loadUserByUsername(signInRequest.getUsername());
        String token = jwtService.generateToken(userDetails);
        String refresh = jwtService.generateRefreshToken(userDetails);
        return ResponseEntity.ok(new JwtResponse(token, refresh, null));
    }
    @PostMapping("/api/auth/refresh")
    public ResponseEntity<JwtResponse> refresh(@RequestBody RefreshRequest refreshRequest){
        String refreshToken = refreshRequest.getRefresh();
        if (jwtService.isTokenExpired(refreshToken)){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new JwtResponse(null, null, "refresh token expired"));
        }
        String username = jwtService.extractUsername(refreshToken);
        UserDetails userDetails = userDetailsService.loadUserByUsername(username);
        String access = jwtService.generateToken(userDetails);
        if (jwtService.extractDuration(refreshToken).toHours()<12){
            String newRefresh = jwtService.generateRefreshToken(userDetails);
            return ResponseEntity.ok(new JwtResponse(access, newRefresh, null));
        }
        return ResponseEntity.ok(new JwtResponse(access, refreshToken, null));
    }
}
