package milansomyk.springboothw.service;

import lombok.Data;
import milansomyk.springboothw.dto.CarDto;
import milansomyk.springboothw.entity.Car;
import milansomyk.springboothw.mapper.CarMapper;
import milansomyk.springboothw.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Data
@Service

public class CarService {
    private final CarRepository carRepository;
    private final CarMapper carMapper;
    public Optional<CarDto> getById(int id){
        Car car = carRepository.findById(id).get();
        CarDto dto = carMapper.toDto(car);
        return Optional.ofNullable(dto);
    }
    public CarDto create(CarDto carDto){
        Car car = carMapper.toCar(carDto);
        Car savedCar = carRepository.save(car);
        return carMapper.toDto(savedCar);
    }
    public void deleteById(int id){
        this.carRepository.deleteById(id);
    }

    public List<CarDto> getAll(){
        return carRepository.findAll()
                .stream()
                .map(carMapper::toDto)
                .toList();
    }
    public List<CarDto> getByPower(int power){
        return this.carRepository.getCarsByPower(power)
                .stream()
                .map(carMapper::toDto)
                .toList();
    }
    public List<CarDto> getByProducer (String producer){
        return this.carRepository.getCarsByProducer(producer)
                .stream()
                .map(carMapper::toDto)
                .toList();
    }
}
