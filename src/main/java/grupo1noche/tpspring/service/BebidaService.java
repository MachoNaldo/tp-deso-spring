package grupo1noche.tpspring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import grupo1noche.tpspring.model.Bebida;
import grupo1noche.tpspring.model.Cliente;
import grupo1noche.tpspring.repository.ItemMenuRepository;

@Service
public class BebidaService {

    @Autowired
    ItemMenuRepository repoItemMenu;
    
    public void crearNuevaBebida(Bebida b){
        repoItemMenu.save(b);
        return;
    }
    public void modificarCliente(Bebida b) {
        Bebida bebidaExistente = (Bebida) repoItemMenu.findById(b.getIdMenu())
            .orElseThrow(() -> new RuntimeException("Bebida no encontrada"));
            
        bebidaExistente.setCategoria(b.getCategoria());
        bebidaExistente.setEsConAlcohol(b.isEsConAlcohol());
        bebidaExistente.setEsGaseosa(b.isEsGaseosa());
        bebidaExistente.setNombreItem(b.getNombreItem());
        bebidaExistente.setVendedor(b.getVendedor());
        bebidaExistente.setPrecio(b.getPrecio());
        bebidaExistente.setVolumenEnMl(b.getVolumenEnMl());
        repoItemMenu.save(bebidaExistente);
         return;
    }
}
