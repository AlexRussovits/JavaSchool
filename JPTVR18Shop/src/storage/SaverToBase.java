/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storage;

import entity.History;
import entity.Product;
import entity.User;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author pupil
 */
public class SaverToBase implements Saveble{
    private EntityManager em;
    private EntityTransaction tx;

    public SaverToBase() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPTVR18ShopPU");
        this.em = emf.createEntityManager();
        this.tx = em.getTransaction();
    }
    
    @Override
    public void saveProducts(ArrayList<Product> products) {
        tx.begin();
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);      
            if(product.getId() == null) {
                em.persist(product);
            }
        }
        tx.commit();
    }

    @Override
    public Collection<? extends Product> loadProducts() {
        try {
            return em.createQuery("SELECT product FROM Product product").getResultList();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public void saveUsers(ArrayList<User> users) {
        tx.begin();
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            if(user.getId() == null) {
                em.persist(user);
            }           
        }
        tx.commit();
    }

    @Override
    public Collection<? extends User> loadUsers() {        
        try {
            return em.createQuery("SELECT user FROM User user").getResultList();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public void saveHistories(ArrayList<History> histories) {
        tx.begin();
        for (int i = 0; i < histories.size(); i++) {
            History history = histories.get(i);
            if(history.getId() == null) {
                em.persist(history);
            }
        }
        tx.commit();
    }

    @Override
    public Collection<? extends History> loadHistories() {
        try {
            return em.createQuery("SELECT history FROM History history").getResultList();
        } 
        catch (Exception e) {
            return null;
        }    
    }
    
}
