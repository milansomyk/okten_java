package milansomyk.springboothw.repository;

import milansomyk.springboothw.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {
    List<Car> getCarsByPower(int power);
    List<Car> getCarsByProducer(String producer);
}
