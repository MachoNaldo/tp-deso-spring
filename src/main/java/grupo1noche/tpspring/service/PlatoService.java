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
    public void modificarPlato(Plato p) {
        Plato platoExistente = (Plato) repoItemMenu.findById(p.getIdItem())
            .orElseThrow(() -> new RuntimeException("Plato no encontrado"));
            
        platoExistente.setCategoria(p.getCategoria());
        platoExistente.setNombreItem(p.getNombreItem());
        platoExistente.setVendedor(p.getVendedor());
        platoExistente.setPrecio(p.getPrecio());
        platoExistente.setEsVegano(p.isEsVegano());
        platoExistente.setPeso(p.getPeso());

        repoItemMenu.save(platoExistente);
        return;
    }
}