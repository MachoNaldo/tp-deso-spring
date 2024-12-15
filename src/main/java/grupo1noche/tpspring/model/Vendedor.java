package grupo1noche.tpspring.model;

import lombok.*;
import jakarta.persistence.*;



@Data
@AllArgsConstructor

@Entity
@Table(name = "vendedor")

public class Vendedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idVendedor;

    @Column(name = "direccion")
    private String direccionVendedor;

    @Column(name = "nombre")
    private String nombre;

}
