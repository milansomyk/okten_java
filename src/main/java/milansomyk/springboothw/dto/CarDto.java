package milansomyk.springboothw.dto;

import com.fasterxml.jackson.annotation.JsonView;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;
import milansomyk.springboothw.view.Views;

@Data
@Builder
public class CarDto {
    @JsonView(value = {Views.Level1.class})
    private Integer id;

    @JsonView(value = {Views.Level1.class, Views.Level2.class, Views.Level3.class})
    @NotBlank(message = "model required")
    @Size(min = 2, max = 20, message = "model: min: {min}, max: {max} characters")
    private String model;

    @JsonView(value = {Views.Level1.class, Views.Level2.class, Views.Level3.class})
    @NotBlank(message = "producer required")
    @Size(min = 2, max = 20, message = "producer: min: {min}, max: {max} characters")
    private String producer;

    @JsonView(value = {Views.Level1.class, Views.Level2.class})
    @Min(value = 50, message = "power: min: {value}")
    private Integer power;
}
