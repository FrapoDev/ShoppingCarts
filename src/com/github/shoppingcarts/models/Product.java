package com.github.shoppingcarts.models;

public class Product implements Comparable<Product> {
    private String nameProduct;
    private double valueProduct;

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getValueProduct() {
        return valueProduct;
    }

    public void setValueProduct(double valueProduct) {
        this.valueProduct = valueProduct;
    }

    @Override
    public String toString() {
        return this.nameProduct + " - Valor: " + this.valueProduct + "\n";
    }

    @Override
    public int compareTo(Product outherProduct) {
        if (this.valueProduct > outherProduct.valueProduct){
            return 1;
        } else if (outherProduct.valueProduct < this.valueProduct) {
            return 0;
        } else {
            return -1;
        }
    }
}

