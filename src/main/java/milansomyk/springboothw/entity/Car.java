package milansomyk.springboothw.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.ResponseEntity;

import java.util.List;

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

    public Car(String model, String producer, Integer power){
        this.model = model;
        this.producer = producer;
        this.power = power;
    }
}
