package milansomyk.springboothw.service;

import lombok.Data;
import milansomyk.springboothw.entity.Car;
import milansomyk.springboothw.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Data
@Service

public class CarService {
    private final CarRepository carRepository;

    public List<Car> getAll(){
        return this.carRepository.findAll();
    }
    public Optional<Car> getById(int id){
        return this.carRepository.findById(id);
    }
    public Car create(Car car){
        return this.carRepository.save(car);
    }
    public void deleteById(int id){
        this.carRepository.deleteById(id);
    }
    public List<Car> getByProducer(String producer){ return this.carRepository.getCarsByProducer(producer);}
}
