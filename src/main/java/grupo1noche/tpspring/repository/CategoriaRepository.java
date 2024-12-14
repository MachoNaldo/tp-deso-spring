package grupo1noche.tpspring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import grupo1noche.tpspring.model.Categoria;

@Repository
public interface CategoriaRepository extends CrudRepository<Categoria,Long>{

}
