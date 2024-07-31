package autofix.ms_vehicle.controller;

import autofix.ms_vehicle.entity.VehicleEntity;
//import autofix.ms_vehicle.model.RepairEntity;
import autofix.ms_vehicle.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/vehicles")
public class VehicleController {

    @Autowired
    VehicleService vehicleService;

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

    @GetMapping("/{patente}")
    public ResponseEntity<VehicleEntity> getByPatente(@PathVariable("patente") String patente){
        VehicleEntity vehicle = vehicleService.getVehicleByPatente(patente);
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


//    @GetMapping("/byRepair/{vehicleId}")
//    public ResponseEntity<List<RepairEntity>> getVehicleByRepairId(@PathVariable("vehicleId") int vehicleId) {
//        List<RepairEntity> repairs = vehicleService.getRepairsByVehicleId(vehicleId);
//        if (repairs == null || repairs.isEmpty()) {
//            return ResponseEntity.notFound().build();
//        }
//        return ResponseEntity.ok(repairs);
//    }




}
