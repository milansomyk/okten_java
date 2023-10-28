package milansomyk.springboothw.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document("cars")
@NoArgsConstructor
@Data
public class MongoCar {
    @MongoId
    private ObjectId id;
    private String model;
    private String producer;
    private Integer power;
    public MongoCar(String model, String producer, Integer power){
        this.model = model;
        this.producer = producer;
        this.power = power;
    }
}
