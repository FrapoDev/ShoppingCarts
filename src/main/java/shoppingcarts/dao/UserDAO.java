package main.java.shoppingcarts.dao;

import jakarta.persistence.EntityManager;
import main.java.shoppingcarts.models.User;

import java.util.List;

public class UserDAO {
    EntityManager em;
    public UserDAO(EntityManager em) {
        this.em = em;
    }

    public void registerUser(User user){
        em.getTransaction().begin();
        em.persist(user);
    }
    public List<User> listAllUsers(){
        return null;
    }
    public User listOneUserID(Long id){
        return null;
    }
    public void deleteAllUsers(){

    }
    public void deleteOneUser(){

    }
}
