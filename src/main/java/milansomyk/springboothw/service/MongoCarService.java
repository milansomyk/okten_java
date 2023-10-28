package milansomyk.springboothw.service;

import lombok.Data;
import milansomyk.springboothw.dto.MongoCarDto;
import milansomyk.springboothw.entity.MongoCar;
import milansomyk.springboothw.mapper.MongoCarMapper;
import milansomyk.springboothw.repository.MongoCarRepository;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Data
@Service
public class MongoCarService {
    private final MongoCarRepository mongoCarRepository;
    private final MongoCarMapper mongoCarMapper;
    public List<MongoCarDto> getAll(){
        return mongoCarRepository.findAll().stream().map(mongoCarMapper::toDto).toList();
    }
    public MongoCarDto create(MongoCarDto carDto){
        MongoCar savedCar = mongoCarRepository.save(mongoCarMapper.toCar(carDto));
        return mongoCarMapper.toDto(savedCar);
    }
    public Optional<MongoCarDto> getById(ObjectId id){
        MongoCarDto dto = mongoCarMapper.toDto(this.mongoCarRepository.findById(id).get());
        return Optional.ofNullable(dto);
    }
    public void deleteById(ObjectId id){this.mongoCarRepository.deleteById(id);}
}
