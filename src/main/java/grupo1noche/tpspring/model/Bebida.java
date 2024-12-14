package grupo1noche.tpspring.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

@Getter
@Setter


@Table(name = "bebida")

public class Bebida extends ItemMenu {

    @Column(name = "volumenEnMl")
    private double volumenEnMl;
    @Column(name = "esConAlcohol")
    private boolean esConAlcohol;
    @Column(name = "esGaseosa")
    private boolean esGaseosa;
    

    public Bebida(Long id, String nombre,int precio, Categoria categoria,Vendedor vendedor, double volumenEnMl, boolean esConAlcohol, boolean esGaseosa) {
        super(id,nombre,precio,categoria,vendedor);
        this.volumenEnMl = volumenEnMl;
        this.esConAlcohol = esConAlcohol;
        this.esGaseosa = esGaseosa;
    }

    @Override
    public double peso() {
        double pesoBase = esConAlcohol ? volumenEnMl * 0.99 : volumenEnMl * 1.04;
        return pesoBase * 1.2;
    }

    @Override
    public double getPeso() {
        return volumenEnMl;
    }

    @Override
    public boolean esComida() {
        return false;
    }

    @Override
    public boolean esBebida() {
        return true;
    }

    @Override
    public boolean aptoVegano() {
        return false;
    }

    public boolean tieneAlcohol() {
        return this.esConAlcohol;
    }
    
    @Override
    public boolean esGaseosa() {
        return this.esGaseosa;
    }

}