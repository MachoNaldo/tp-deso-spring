package grupo1noche.tpspring.model;

import lombok.*;
import jakarta.persistence.*;

@Data
@AllArgsConstructor

@Table(name = "cliente")

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
