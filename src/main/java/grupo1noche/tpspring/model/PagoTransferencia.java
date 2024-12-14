package grupo1noche.tpspring.model;

import jakarta.persistence.*;

@DiscriminatorValue("TARJETA")

public class PagoTransferencia extends Pago {

    public PagoTransferencia(){
        super();
    }

    @Override
    public void pagar(int tot) {
        double total = (double) tot;
        total = total + (total * 0.02);
        System.out.println("Procesando pago. El monto a pagar es de " + total);
        System.out.println("Pago Confirmado. Total:" + total);

    }
}
