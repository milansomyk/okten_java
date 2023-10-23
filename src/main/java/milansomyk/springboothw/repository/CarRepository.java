package milansomyk.springboothw.repository;

import milansomyk.springboothw.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {
    List<Car> getCarsByPower(int power);
    List<Car> getCarsByProducer(String producer);

    @Modifying
    @Transactional
    @Query("update Car set photo = :bytes where id = :id")
    void updateCarPhotoById(@Param("id") int id, @Param("bytes") byte[] bytes);

}
