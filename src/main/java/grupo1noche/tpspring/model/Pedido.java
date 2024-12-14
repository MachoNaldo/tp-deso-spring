package grupo1noche.tpspring.model;

import lombok.*;
import jakarta.persistence.*;

@Data
@AllArgsConstructor

@Table(name = "pedido")

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
