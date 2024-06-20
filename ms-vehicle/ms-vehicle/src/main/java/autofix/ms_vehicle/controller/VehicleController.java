package autofix.ms_vehicle.controller;

import autofix.ms_vehicle.entity.VehicleEntity;
import autofix.ms_vehicle.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    @Autowired
    VehicleService vehicleService;

    @GetMapping("/hello")
    public String sayHello() {
        return "Hola";
    }

    @GetMapping("/bye")
    public String sayBye() {
        return "Bye";
    }

    @GetMapping("/")
    public ResponseEntity<List<VehicleEntity>> getAll(){
        List<VehicleEntity> vehicles = vehicleService.getAll();
        if(vehicles.isEmpty())
            return ResponseEntity.noContent().build();
        return ResponseEntity.ok(vehicles);
    }

    @GetMapping("/{id}")
    public ResponseEntity<VehicleEntity> getById(@PathVariable("id") int id){
        VehicleEntity vehicle = vehicleService.getVehicleById(id);
        if(vehicle == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(vehicle);
    }

    @PostMapping("/")
    public ResponseEntity<VehicleEntity> save(@RequestBody VehicleEntity vehicle){
        VehicleEntity newVehicle = vehicleService.save(vehicle);
        System.out.println("Recibido VehicleEntity: " + vehicle.toString());
        return ResponseEntity.ok(newVehicle);
    }



}
