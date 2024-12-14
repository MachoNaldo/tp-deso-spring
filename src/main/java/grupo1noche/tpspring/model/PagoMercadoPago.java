package grupo1noche.tpspring.model;

import jakarta.persistence.*;

@DiscriminatorValue("MERCADOPAGO")

public class PagoMercadoPago extends Pago{
    
    public PagoMercadoPago(){
        super();
    }

    @Override
        public void pagar(int tot) {
        double total = (double) tot;
        total = total + (total * 0.04);
        System.out.println("Procesando pago. El monto a pagar es de " + total);
        System.out.println("Pago Confirmado. Total:" + total);
    }
}
