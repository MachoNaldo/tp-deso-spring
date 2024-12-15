package grupo1noche.tpspring.model;

import lombok.*;
import jakarta.persistence.*;


@Data
@AllArgsConstructor

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "itemMenu")

public abstract class ItemMenu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idItem;
    @Column(name = "item")
    private String nombreItem;
    @Column(name = "precio")
    private Integer precio;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "vendedor_id")
    private Vendedor vendedor;

    public abstract double peso();
    
    public abstract double getPeso();

    public abstract boolean esComida();

    public abstract boolean esBebida();
    
    public abstract boolean tieneAlcohol();
    
    public abstract boolean esGaseosa();

    public abstract boolean aptoVegano();
    

}
