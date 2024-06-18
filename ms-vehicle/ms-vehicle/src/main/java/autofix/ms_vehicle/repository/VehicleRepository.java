package autofix.ms_vehicle.repository;

import autofix.ms_vehicle.entity.VehicleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository <VehicleEntity, Integer> {
}
