package com.github.shoppingcarts.main;

import com.github.shoppingcarts.models.CreditCard;
import com.github.shoppingcarts.models.Product;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CreditCard card = new CreditCard();
        List<Product> listProduct = new Vector<>();

        System.out.println("Digite o limite do seu cartão: ");
        double limitCard = sc.nextDouble();
        card.setLimit(limitCard);
        System.out.println("Limite de R$ " + card.getLimit() + " estabelecido.");

        boolean loop = true;
        while (loop) {
            System.out.println("\nDigite o que quer comprar: ");
            String name = sc.next();
            System.out.println("Qual o valor desse produto: " + name);
            double value = sc.nextInt();
            if (limitCard < value){
                System.out.println("Sem limite!");
                break;
            }
            double newLimit = limitCard - value;
            limitCard = newLimit;

            Product product = new Product();
            product.setNameProduct(name);
            product.setValueProduct(value);
            listProduct.add(product);

            System.out.println("""
                    Deseja comprar mais alguma coisa? 
                    [1] para continuar.
                    [2] para encerrar a compra.""");
            int purchaseSequence = sc.nextInt();
            if (purchaseSequence == 2) {
                break;
            }

        }
        Collections.sort(listProduct);
        String finalMessage = String.format("""
                Lista de compras:
                %s
                
                Limite do cartão : %s
                """,listProduct,limitCard);
        System.out.println(finalMessage);
    }
}