package grupo1noche.tpspring.model;

import lombok.*;
import jakarta.persistence.*;

@Data
@AllArgsConstructor

@Table(name = "categoria")

public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCategoria;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "tipo_item")
    private String tipo_item;
}
