package grupo1noche.tpspring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import grupo1noche.tpspring.model.Pago;

@Repository
public interface PagoRepository extends CrudRepository<Pago, Long>{

}