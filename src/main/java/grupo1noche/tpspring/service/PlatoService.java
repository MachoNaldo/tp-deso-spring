package grupo1noche.tpspring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import grupo1noche.tpspring.model.Plato;

import grupo1noche.tpspring.repository.ItemMenuRepository;

@Service
public class PlatoService {

    @Autowired
    ItemMenuRepository repoItemMenu;
    
    public void crearNuevoPlato(Plato p){
        repoItemMenu.save(p);
        return;
    }
    public void modificarPlato(Plato b) {
        Plato platoExistente = (Plato) repoItemMenu.findById(p.getIdMenu())
            .orElseThrow(() -> new RuntimeException("Plato no encontrado"));
            
        platoExistente.setCategoria(b.getCategoria());
        platoExistente.setEsConAlcohol(b.isEsConAlcohol());
        platoExistente.setEsGaseosa(b.isEsGaseosa());
        platoExistente.setNombreItem(b.getNombreItem());
        platoExistente.setVendedor(b.getVendedor());
        platoExistente.setPrecio(b.getPrecio());
        platoExistente.setVolumenEnMl(b.getVolumenEnMl());
        repoItemMenu.save(platoExistente);
        return;
    }
}