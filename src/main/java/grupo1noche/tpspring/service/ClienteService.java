package grupo1noche.tpspring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import grupo1noche.tpspring.model.Cliente;
import grupo1noche.tpspring.repository.ClienteRepository;

@Service
public class ClienteService {
    @Autowired
    ClienteRepository repoCliente;

    public Iterable<Cliente> listarClientes(){
        return repoCliente.findAll();
    }
    public void crearNuevoCliente(Cliente c){
        repoCliente.save(c);
        return;
    }
    public void modificarCliente(Cliente cliente) {

        Cliente clienteExistente = repoCliente.findById(cliente.getIdCliente())
            .orElseThrow(() -> new RuntimeException("Cliente no encontrado"));
        
        clienteExistente.setDireccion(cliente.getDireccion());
        clienteExistente.setNombre(cliente.getNombre());
        clienteExistente.setCuit(cliente.getCuit());
        clienteExistente.setEmail(cliente.getEmail());
        repoCliente.save(clienteExistente);
        return;
    }

    public void eliminarCliente(long id) {
        repoCliente.deleteById(id);
        return;
    }

    public Cliente buscarCliente(long id) {
        return repoCliente.findById(id).orElseThrow(() -> new RuntimeException("Cliente no encontrado"));
    }

    public Iterable<Cliente> buscarPorNombre(String nombre) {
        return repoCliente.findByNombreContainingIgnoreCase(nombre);
    }

}
