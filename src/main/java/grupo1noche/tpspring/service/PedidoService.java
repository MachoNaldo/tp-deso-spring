package grupo1noche.tpspring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import grupo1noche.tpspring.model.Pedido;
import grupo1noche.tpspring.repository.PedidoRepository;

@Service
public class PedidoService {
    @Autowired
    PedidoRepository repoPedido;

    public Iterable<Pedido> listarPedidos(){
        return repoPedido.findAll();
    }
    public void crearNuevoPedido(Pedido p){
        repoPedido.save(p);
        return;
    }
    public void modificarPedido(Pedido pedido) {

        Pedido pedidoExistente = repoPedido.findById(pedido.getIdPedido())
            .orElseThrow(() -> new RuntimeException("pedido no encontrado"));
        
        pedidoExistente.setCliente(pedido.getCliente());
        pedidoExistente.setEstado(pedido.getEstado());
        pedidoExistente.setPago(pedido.getPago());
        pedidoExistente.setTotal(pedido.getTotal());
        repoPedido.save(pedidoExistente);
        return;
    }

    public void eliminarPedido(long id) {
        repoPedido.deleteById(id);
        return;
    }

    public Pedido buscarPedido(long id) {
        return repoPedido.findById(id).orElseThrow(() -> new RuntimeException("pedido no encontrado"));
    }

    public Iterable<Pedido> buscarPorNombre(String nombre) {
        return repoPedido.findByNombreContainingIgnoreCase(nombre);
    }

}
