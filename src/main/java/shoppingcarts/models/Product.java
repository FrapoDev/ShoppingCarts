package main.java.shoppingcarts.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Product implements Comparable<Product> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private Long id;
    @Column(name = "name_product",unique = true)
    private String nameProduct;
    @Column(name = "value_product")
    private double valueProduct;

    public Product(String nameProduct, double valueProduct) {
        this.nameProduct = nameProduct;
        this.valueProduct = valueProduct;
    }

    @Override
    public String toString() {
        return this.nameProduct + " - Valor: " + this.valueProduct + "\n";
    }

    @Override
    public int compareTo(Product outherProduct) {
        if (this.valueProduct > outherProduct.valueProduct) {
            return 1;
        } else if (outherProduct.valueProduct < this.valueProduct) {
            return 0;
        } else {
            return -1;
        }
    }
}

