package milansomyk.springboothw.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CarDto {
    private Integer id;
    private String model;
    private String producer;
    private Integer power;
}
