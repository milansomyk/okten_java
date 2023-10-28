package milansomyk.springboothw.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@Data
@NoArgsConstructor
@Entity
@EnableAutoConfiguration
@Table(name = "cars", schema = "public")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String model;
    private String producer;
    private Integer power;
    private String photo;

    public Car(String model, String producer, Integer power, String photo){
        this.model = model;
        this.producer = producer;
        this.power = power;
        this.photo = photo;
    }
}
