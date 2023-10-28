package milansomyk.springboothw.mapper;

import milansomyk.springboothw.dto.MongoCarDto;
import milansomyk.springboothw.entity.MongoCar;
import org.springframework.stereotype.Component;

@Component
public class MongoCarMapper {
    public MongoCarDto toDto(MongoCar car){
        return MongoCarDto.builder()
                .id(car.getId())
                .power(car.getPower())
                .model(car.getModel())
                .producer(car.getProducer())
                .build();
    }
    public MongoCar toCar(MongoCarDto carDto){
        return new MongoCar(carDto.getModel(), carDto.getProducer(),carDto.getPower());
    }
}
