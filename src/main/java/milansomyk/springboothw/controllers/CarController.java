package milansomyk.springboothw.controllers;

import lombok.RequiredArgsConstructor;
import milansomyk.springboothw.entity.Car;
import milansomyk.springboothw.service.CarService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/cars")
public class CarController {
    private final CarService carService;

    @GetMapping
    public ResponseEntity<List<Car>> getAll(){
        return ResponseEntity.ok(this.carService.getAll());
    }

    @PostMapping
    public ResponseEntity<Car> create(@RequestBody Car car){
        return ResponseEntity.ok(carService.create(car));
    }
}
