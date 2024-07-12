package autofix.ms_vehicle.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class VehicleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String patente;
    private String marca;
    private String modelo;
    private String tipo_vehiculo;
    private Integer ano_fabricacion;
    private String tipo_motor;
    private Integer num_asientos;

}
