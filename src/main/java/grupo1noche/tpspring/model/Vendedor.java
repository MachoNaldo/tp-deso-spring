package utn.isi.tp.demo_tp_deso.modelo;

import lombok.*;
import jakarta.persistence.*;

import java.util.List;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "vendedor")

public class Vendedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idVendedor;
    @Column(name = "direccion")
    private String direccionVendedor;
    @Column(name = "nombre")
    private String nombreVendedor;
    @Column
    private Categoria categoria;
    @Column(name = "vendedor")
    private Vendedor direccion;
    @OneToMany(mappedBy = "listaItems", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ItemMenu> tareas;

}
