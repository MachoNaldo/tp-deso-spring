package grupo1noche.tpspring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import grupo1noche.tpspring.model.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long>{
    Iterable<Cliente> findByNombreContainingIgnoreCase(String nombre);
}