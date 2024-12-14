package grupo1noche.tpspring.model;

import lombok.*;
import jakarta.persistence.*;

@Data
@NoArgsConstructor

@Table(name = "pago")
@MappedSuperclass

public abstract class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPago;


    public abstract void pagar(int total);
}
