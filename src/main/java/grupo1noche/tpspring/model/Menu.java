package utn.isi.tp.demo_tp_deso.modelo;

import lombok.*;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "menu")

public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTIFY)

}
