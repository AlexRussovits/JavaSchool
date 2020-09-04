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
public interface Saveble {
    public void saveBooks(ArrayList<Book> books);
    public Collection<? extends Book> loadBooks();
    public void saveReaders(ArrayList<Reader> readers);
    public Collection<? extends Reader> loadReaders();
    public void saveHistories(ArrayList<History> histories);
    public Collection<? extends History> loadHistories();
}
