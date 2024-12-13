package utn.isi.tp.demo_tp_deso.modelo;

import lombok.*;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "itemMenu")

public class ItemMenu {

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
    private Vendedor direccion;


}
