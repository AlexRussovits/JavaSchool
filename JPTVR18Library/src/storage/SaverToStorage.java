/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storage;

import Entity.Book;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pupil
 */
public class SaverToStorage {

    public void saveBooks(ArrayList<Book> books) {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null; 
        try {
            fileOutputStream = new FileOutputStream("Books.txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(books);
            objectOutputStream.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToStorage.class.getName()).log(Level.SEVERE, "Нет файла Books.txt", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaverToStorage.class.getName()).log(Level.SEVERE, "Ошибка записи Books.txt", ex);
        } finally{
            if(objectOutputStream != null){
                try {
                    objectOutputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(SaverToStorage.class.getName()).log(Level.SEVERE, "Ошибка освобождения ресурса", ex);
                }
            }
            if(fileOutputStream != null){
                try {
                    fileOutputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(SaverToStorage.class.getName()).log(Level.SEVERE, "Ошибка освобождения ресурса", ex);
                }
            }
        }
    }
        

    public Collection<? extends Book> loadBooks() {
        ArrayList<Book> books = new ArrayList<>();
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream= new FileInputStream("Books.txt");
            objectInputStream = new ObjectInputStream(fileInputStream);
            books = (ArrayList<Book>) objectInputStream.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToStorage.class.getName()).log(Level.SEVERE, "Ошибка чтения файла Books.txt", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaverToStorage.class.getName()).log(Level.SEVERE, "Ошибка чтения файла Books.txt", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SaverToStorage.class.getName()).log(Level.SEVERE, "Класс не найден", ex);
        }
        return books;
    }
}
