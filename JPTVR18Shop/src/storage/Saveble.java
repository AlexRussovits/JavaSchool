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

/**
 *
 * @author pupil
 */
public interface Saveble {
    public void saveProducts(ArrayList<Product> products);
    public Collection<? extends Product> loadProducts();
    public void saveUsers(ArrayList<User> users);
    public Collection<? extends User> loadUsers();
    public void saveHistories(ArrayList<History> histories);
    public Collection<? extends History> loadHistories();
}
