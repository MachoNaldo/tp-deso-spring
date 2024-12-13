package utn.isi.tp.demo_tp_deso.modelo;

import lombok.*;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Entity(name = "cliente")

public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCliente;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "cuit")
    private Integer cuit;
    @Column(name = "email")
    private String email;
    @Column(name = "direccion")
    private String direccion;
    @Column
    private Double lat;
    @Column
    private Double lng;

}
