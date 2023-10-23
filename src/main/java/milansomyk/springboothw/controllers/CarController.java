package milansomyk.springboothw.controllers;

import com.fasterxml.jackson.annotation.JsonView;
import jakarta.validation.Valid;
import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import milansomyk.springboothw.dto.CarDto;
import milansomyk.springboothw.service.CarService;
import milansomyk.springboothw.view.Views;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/cars")

public class CarController {
    private final CarService carService;

    @JsonView(value = {Views.Level3.class})
    @GetMapping
    public ResponseEntity<List<CarDto>> getAll(){
        return ResponseEntity.ok(this.carService.getAll());
    }


    @PostMapping
    public ResponseEntity<CarDto> create(@RequestBody @Valid CarDto carDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(carService.create(carDto));
    }
    @JsonView(value = {Views.Level1.class})
    @GetMapping("/{id}")
    public ResponseEntity<CarDto> getById(@PathVariable int id){return ResponseEntity.of(this.carService.getById(id));}

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable int id){this.carService.deleteById(id);}

    @JsonView(value = {Views.Level2.class})
    @GetMapping("/power/{value}")
    public ResponseEntity<List<CarDto>> getByPower(@PathVariable int value){return ResponseEntity.ok(this.carService.getByPower(value));}

    @JsonView(value = {Views.Level2.class})
    @GetMapping("/producer/{value}")
    public ResponseEntity<List<CarDto>> getByBroducer(@PathVariable String value){return ResponseEntity.ok(this.carService.getByProducer(value));}

    @PostMapping("/{id}/photo")
    @SneakyThrows
    @JsonView(Views.Level1.class)
    public ResponseEntity<CarDto> uploadPhoto(@PathVariable int id, MultipartFile photo) {
        return ResponseEntity.ok(this.carService.addPhotoByCarId(id,photo));
    }
}
