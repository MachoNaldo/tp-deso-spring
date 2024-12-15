package grupo1noche.tpspring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import grupo1noche.tpspring.model.ItemMenu;

@Repository
public interface ItemMenuRepository extends CrudRepository<ItemMenu, Long>{

}