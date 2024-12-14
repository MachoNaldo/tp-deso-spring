package grupo1noche.tpspring.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

@Getter
@Setter

@Table(name = "plato")

public class Plato extends ItemMenu {

    @Column(name = "peso")
    private double peso;
    @Column(name = "esVegano")
    private boolean esVegano;

    public Plato(Long id,String nombre,int precio,Categoria categoria,Vendedor vendedor, double peso, boolean esVegano) {
        super(id,nombre,precio,categoria,vendedor);
        this.peso = peso;
        this.esVegano = esVegano;
    }

    @Override
    public double peso() {
        return this.peso * 1.1;
    }

    @Override
    public boolean esComida() {
        return true;
    }

    @Override
    public boolean esBebida() {
        return false;
    }

    @Override
    public boolean aptoVegano() {
        return this.esVegano;
    }

    @Override
    public boolean tieneAlcohol(){
     return false;
    }
    
    @Override
    public boolean esGaseosa() {
        return false;
    }
}
