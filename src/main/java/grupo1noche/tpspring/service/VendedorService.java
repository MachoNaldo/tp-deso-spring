package grupo1noche.tpspring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import grupo1noche.tpspring.model.Vendedor;
import grupo1noche.tpspring.repository.VendedorRepository;

@Service
public class VendedorService {
    @Autowired
    VendedorRepository repoVendedor;

    public Iterable<Vendedor> listarVendedores(){
        return repoVendedor.findAll();
    }
    public void crearNuevoVendedor(Vendedor p){
        repoVendedor.save(p);
        return;
    }
    public void modificarVendedor(Vendedor vendedor) {

        Vendedor vendedorExistente = repoVendedor.findById(vendedor.getIdVendedor())
            .orElseThrow(() -> new RuntimeException("vendedor no encontrado"));
        
        vendedorExistente.setDireccionVendedor(vendedor.getDireccionVendedor());
        vendedorExistente.setNombre(vendedor.getNombre());
        repoVendedor.save(vendedorExistente);
        return;
    }

    public void eliminarVendedor(long id) {
        repoVendedor.deleteById(id);
        return;
    }

    public Vendedor buscarVendedor(long id) {
        return repoVendedor.findById(id).orElseThrow(() -> new RuntimeException("vendedor no encontrado"));
    }

    public Iterable<Vendedor> buscarPorNombre(String nombre) {
        return repoVendedor.findByNombreContainingIgnoreCase(nombre);
    }

}