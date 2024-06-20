package autofix.ms_vehicle.service;

import autofix.ms_vehicle.entity.VehicleEntity;
import autofix.ms_vehicle.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class VehicleService {

    @Autowired
    VehicleRepository vehicleRepository;

    @Autowired
    RestTemplate restTemplate;

    public List<VehicleEntity> getAll(){
        return vehicleRepository.findAll();
    }

    public VehicleEntity getVehicleById(int id){
        return vehicleRepository.findById(id).orElse(null);
    }

    public VehicleEntity save(VehicleEntity vehicle){
        return vehicleRepository.save(vehicle);
    }

}
