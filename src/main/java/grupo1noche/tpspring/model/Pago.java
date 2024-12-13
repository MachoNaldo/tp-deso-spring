package utn.isi.tp.demo_tp_deso.modelo;

import lombok.*;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "pago")

public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPago;
    @Column(name = "tipoPago")
    private String nombrePago;

}
