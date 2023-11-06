package milansomyk.springboothw.controllers;

import jakarta.annotation.security.RolesAllowed;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import milansomyk.springboothw.dto.MongoCarDto;
import milansomyk.springboothw.service.MongoCarService;
import org.bson.types.ObjectId;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/mongo-cars")
public class MongoCarController {
    private final MongoCarService mongoCarService;
    @GetMapping
    public ResponseEntity<List<MongoCarDto>> getAll() {return ResponseEntity.ok(this.mongoCarService.getAll());}
    @RolesAllowed("ADMIN")
    @PostMapping
    public ResponseEntity<MongoCarDto> create(@RequestBody @Valid MongoCarDto carDto){return ResponseEntity.ok(this.mongoCarService.create(carDto));}
    @GetMapping("/{id}")
    public ResponseEntity<MongoCarDto> getById(@PathVariable ObjectId id){return ResponseEntity.of(this.mongoCarService.getById(id));}
    @RolesAllowed("ADMIN")
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable ObjectId id){this.mongoCarService.deleteById(id);}
}
