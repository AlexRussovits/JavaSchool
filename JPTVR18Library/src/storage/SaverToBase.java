/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storage;

import Entity.Book;
import Entity.History;
import Entity.Reader;
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
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPTVR18LibraryPU"); 
        this.em = emf.createEntityManager();
        this.tx = em.getTransaction();
    }
    
    
    @Override
    public void saveBooks(ArrayList<Book> books){
        tx.begin();
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if(book.getId() == null){
                em.persist(book);
            }
            
        }
        tx.commit();

    }
    @Override
    public Collection<? extends Book> loadBooks(){
        try {
            return em.createQuery("SELECT book FROM Book book")
                .getResultList();
        } catch (Exception e) {
            return null;
        }
    }
    @Override
    public void saveReaders(ArrayList<Reader> readers){
        tx.begin();
        for (int i = 0; i < readers.size(); i++) {
            Reader reader = readers.get(i);
            if(reader.getId() == null){
                em.persist(reader);
            }
        }
        tx.commit();
    }
    @Override
    public Collection<? extends Reader> loadReaders(){
       try {
            return em.createQuery("SELECT reader FROM Reader reader")
                .getResultList();
        } catch (Exception e) {
            return null;
        }
    }
    @Override
    public void saveHistories(ArrayList<History> histories){
        tx.begin();
        for (int i = 0; i < histories.size(); i++) {
            History history = histories.get(i);
            if(history.getId() == null){
                em.persist(history);
            }
        }
        tx.commit();
    }
    @Override
    public Collection<? extends History> loadHistories(){
        try {
            return em.createQuery("SELECT history FROM History history")
                .getResultList();
        } catch (Exception e) {
            return null;
        }
    }
}
