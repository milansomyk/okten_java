package milansomyk.springboothw.repository;

import milansomyk.springboothw.entity.MongoCar;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoCarRepository extends MongoRepository<MongoCar,ObjectId> {

}
