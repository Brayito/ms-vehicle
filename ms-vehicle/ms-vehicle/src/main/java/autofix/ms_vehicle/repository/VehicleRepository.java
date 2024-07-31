package autofix.ms_vehicle.repository;

import autofix.ms_vehicle.entity.VehicleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepository extends JpaRepository <VehicleEntity, Integer> {


    VehicleEntity findOneByPatente(String patente);
}
