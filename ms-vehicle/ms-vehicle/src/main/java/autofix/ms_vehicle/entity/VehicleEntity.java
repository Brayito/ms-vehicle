package autofix.ms_vehicle.entity;

import jakarta.persistence.*;

@Entity
public class VehicleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "patente")
    String patente;

    @Column(name = "marca")
    String marca;

    @Column(name = "modelo")
    String modelo;

    @Column(name = "tipo_vehiculo")
    String tipo_vehiculo;

    @Column(name = "ano_fabricacion")
    Integer ano_fabricacion;

    @Column(name = "tipo_motor")
    String tipo_motor;

    @Column(name = "num_asientos")
    Integer num_asientos;
}
