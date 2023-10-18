package milansomyk.springboothw.controllers;

import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import milansomyk.springboothw.dto.CarDto;
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
    public ResponseEntity<List<CarDto>> getAll(){
        return ResponseEntity.ok(this.carService.getAll());
    }

    @GetMapping
    public ResponseEntity<CarDto> getById(@PathParam(value = "id") int id){return ResponseEntity.of(this.carService.getById(id));}

    @PostMapping
    public ResponseEntity<CarDto> create(@RequestBody CarDto carDto){
        return ResponseEntity.ok(carService.create(carDto));
    }

}
