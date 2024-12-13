package utn.isi.tp.demo_tp_deso.modelo;

import lombok.*;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "pedido")

public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPedido;
    @Column(name = "cliente")
    private Cliente cliente;
    @Column(name = "pago")
    private Pago pago;
    @Column(name = "estado")
    private Estado estado;
    @Column(name = "total")
    private Integer total;


}
