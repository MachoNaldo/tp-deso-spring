package grupo1noche.tpspring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import grupo1noche.tpspring.model.ItemMenu;
import grupo1noche.tpspring.repository.ItemMenuRepository;



@Service
public class ItemMenuService {
    @Autowired
    ItemMenuRepository repoItemMenu;

    public void eliminarItemMenu(long idItem){
         repoItemMenu.deleteById(idItem);
         return;
    }
    
    public ItemMenu buscarItemMenu(long idItem){
        return repoItemMenu.findById(idItem).orElseThrow(() -> new RuntimeException("ItemMenu no encontrado"));
    }
    public Iterable<ItemMenu> listarItemMenu(){
        return repoItemMenu.findAll();
    }
}
