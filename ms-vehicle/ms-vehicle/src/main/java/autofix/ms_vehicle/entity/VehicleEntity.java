package autofix.ms_vehicle.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity
public class VehicleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

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

    private Integer vehicleRepairId;

    @Override
    public String toString() {
        return "VehicleEntity{" +
                "id=" + id +
                ", patente='" + patente + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tipo_vehiculo='" + tipo_vehiculo + '\'' +
                ", ano_fabricacion=" + ano_fabricacion +
                ", tipo_motor='" + tipo_motor + '\'' +
                ", num_asientos=" + num_asientos +
                '}';
    }


}
