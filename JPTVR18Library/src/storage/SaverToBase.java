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

/**
 *
 * @author pupil
 */
public class SaverToBase implements Saveble{
    @Override
    public void saveBooks(ArrayList<Book> books) {
        
    }
    @Override
    public Collection<? extends Book> loadBooks() {
        return null;
    }
    @Override
    public void saveReaders(ArrayList<Reader> readers) {
    
    }
    @Override
    public Collection<? extends Reader> loadReaders() {
        return null;
    }
    @Override
    public void saveHistories(ArrayList<History> histories) {
    
    }
    
    @Override
    public Collection<? extends History> loadHistories() {
        return null;
    }
}
