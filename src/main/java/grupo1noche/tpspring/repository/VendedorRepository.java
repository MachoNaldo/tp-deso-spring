package grupo1noche.tpspring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import grupo1noche.tpspring.model.Vendedor;

@Repository
public interface VendedorRepository extends CrudRepository<Vendedor, Long>{
    Iterable<Vendedor> findByNombreContainingIgnoreCase(String nombre);
}