package main.java.shoppingcarts.dao;

import jakarta.persistence.EntityManager;
import main.java.shoppingcarts.models.Product;
import java.util.List;

public class ProductDAO {
    EntityManager em;
    public ProductDAO(EntityManager em) {
        this.em = em;
    }

    public void registerProduct(Product product){
        em.getTransaction().begin();
        this.em.persist(product);
    }

    public List<Product> readAllProducts(){
        return null;
    }
    public Product listOneProductID(Long id){
        return null;
    }
    public void deleteAllProducts(){

    }
    public void deleteOneProduct(){

    }
}
