package autofix.ms_vehicle.entity;

import jakarta.persistence.*;
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

    @Column(name = "patente", unique = true, nullable = false)
    private String patente;
    private String marca;
    private String modelo;
    private String tipo_vehiculo;
    private Integer ano_fabricacion;
    private String tipo_motor;
    private Integer num_asientos;
    private Integer kilometraje;
    private String estado;

}
