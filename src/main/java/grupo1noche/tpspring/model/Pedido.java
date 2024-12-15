package grupo1noche.tpspring.model;

import lombok.*;
import jakarta.persistence.*;

@Data
@AllArgsConstructor

@Entity
@Table(name = "pedido")

public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPedido;

    @OneToOne
    @JoinColumn(name = "cliente_id", referencedColumnName = "idCliente")
    private Cliente cliente;

    @OneToOne
    @JoinColumn(name = "pago_id", referencedColumnName = "id_pago")
    private Pago pago;
    
    @Enumerated(EnumType.STRING)
    private Estado estado;

    @Column(name = "total")
    private Integer total;


}
