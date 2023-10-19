package milansomyk.springboothw.controllers;

import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import milansomyk.springboothw.dto.CarDto;
import milansomyk.springboothw.service.CarService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/cars")
public class CarController {
    private final CarService carService;

    @GetMapping
    public ResponseEntity<List<CarDto>> getAll(){
        return ResponseEntity.ok(this.carService.getAll());
    }


    @PostMapping
    public ResponseEntity<CarDto> create(@RequestBody CarDto carDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(carService.create(carDto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<CarDto> getById(@PathVariable int id){return ResponseEntity.of(this.carService.getById(id));}

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable int id){this.carService.deleteById(id);}

    @GetMapping("/power/{value}")
    public ResponseEntity<List<CarDto>> getByPower(@PathVariable int value){return ResponseEntity.ok(this.carService.getByPower(value));}

    @GetMapping("/producer/{value}")
    public ResponseEntity<List<CarDto>> getByBroducer(@PathVariable String value){return ResponseEntity.ok(this.carService.getByProducer(value));}
}
