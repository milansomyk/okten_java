package milansomyk.springboothw.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class JwtResponse {
    public final String token;
    public final String refresh;
    public final String error;
}
