package milansomyk.springboothw.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;
import org.bson.types.ObjectId;

@Data
@Builder
public class MongoCarDto {
    private ObjectId id;
    @NotBlank(message = "model required")
    @Size(min = 2, max = 20, message = "model: min: {min}, max: {max} characters")
    private String model;

    @NotBlank(message = "producer required")
    @Size(min = 2, max = 20, message = "producer: min: {min}, max: {max} characters")
    private String producer;

    @Min(value = 50, message = "power: min: {value}")
    private Integer power;
}
