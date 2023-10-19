package milansomyk.springboothw.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CarDto {
    private Integer id;

    @NotBlank(message = "model required")
    @Size(min = 2, max = 20, message = "min: {min} max: {max} characters")
    private String model;

    @NotBlank(message = "producer required")
    @Size(min = 2, max = 20, message = "min: {min} max: {max} characters")
    private String producer;

    @NotBlank(message = "power required")
    @Min(value = 50, message = "min power: {value}")
    private Integer power;
}
