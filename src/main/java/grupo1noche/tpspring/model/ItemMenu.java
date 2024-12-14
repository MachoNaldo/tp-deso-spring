package grupo1noche.tpspring.model;

import lombok.*;
import jakarta.persistence.*;


@Data
@AllArgsConstructor

@MappedSuperclass
@Entity(name = "itemMenu")

public abstract class ItemMenu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMenu;
    @Column(name = "item")
    private String nombreItem;
    @Column(name = "precio")
    private Integer precio;
    @Column(name = "categoria")
    private Categoria categoria;
    @Column(name = "vendedor")
    private Vendedor vendedor;

    public abstract double peso();
    
    public abstract double getPeso();

    public abstract boolean esComida();

    public abstract boolean esBebida();
    
    public abstract boolean tieneAlcohol();
    
    public abstract boolean esGaseosa();

    public abstract boolean aptoVegano();
    

}
