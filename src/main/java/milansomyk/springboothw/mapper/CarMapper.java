package milansomyk.springboothw.mapper;

import milansomyk.springboothw.dto.CarDto;
import milansomyk.springboothw.entity.Car;
import org.springframework.stereotype.Component;

@Component
public class CarMapper {
    public CarDto toDto(Car car){
        return CarDto.builder()
                .id(car.getId())
                .power(car.getPower())
                .model(car.getModel())
                .producer(car.getProducer())
                .photo(car.getPhoto())
                .build();
    }
    public Car toCar(CarDto carDto){
        return new Car(carDto.getModel(), carDto.getProducer(),carDto.getPower(),carDto.getPhoto());
    }
}
