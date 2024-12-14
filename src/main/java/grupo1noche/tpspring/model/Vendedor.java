package grupo1noche.tpspring.model;

import lombok.*;
import jakarta.persistence.*;

import java.util.List;

@Data
@AllArgsConstructor
@Table(name = "vendedor")

public class Vendedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idVendedor;
    @Column(name = "direccion")
    private String direccionVendedor;
    @Column(name = "nombre")
    private String nombreVendedor;
    @OneToMany(mappedBy = "listaItems", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ItemMenu> listaItemMenus;

}
