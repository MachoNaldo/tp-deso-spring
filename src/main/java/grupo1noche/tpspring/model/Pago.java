package grupo1noche.tpspring.model;

import lombok.*;
import jakarta.persistence.*;

@Data
@NoArgsConstructor

@Entity
@Table(name = "pago")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_pago", discriminatorType = DiscriminatorType.STRING)

public abstract class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_pago;


    public abstract void pagar(int total);
}
