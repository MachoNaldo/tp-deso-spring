package grupo1noche.tpspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String mostrarMenuPrincipal(Model model) {
        return "index"; // Retorna el nombre de la vista (por ejemplo, una página HTML)
    }
/* 
    // Ruta para la página de "ItemMenu"
    @GetMapping("/itemmenu")
    public String mostrarItemMenu(Model model) {
        return "itemMenu"; // Nombre de la vista correspondiente
    }

    // Ruta para la página de "Pedido"
    @GetMapping("/pedido")
    public String mostrarPedido(Model model) {
        return "pedido"; // Nombre de la vista correspondiente
    }

    // Ruta para la página de "Pago"
    @GetMapping("/pago")
    public String mostrarPago(Model model) {
        return "pago"; // Nombre de la vista correspondiente
    }

    // Ruta para la página de "Cliente"
    @GetMapping("/cliente")
    public String mostrarCliente(Model model) {
        return "cliente"; // Nombre de la vista correspondiente
    }

    // Ruta para la página de "Vendedor"
    @GetMapping("/vendedor")
    public String mostrarVendedor(Model model) {
        return "vendedor"; // Nombre de la vista correspondiente
    }*/
}