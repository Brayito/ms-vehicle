package autofix.ms_vehicle.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hola";
    }

    @GetMapping("/bye")
    public String sayBye() {
        return "Bye";
    }

    @GetMapping("/")
    public String home() {
        return "Bienvenidos a vehiculos AutoFix";
    }

}
