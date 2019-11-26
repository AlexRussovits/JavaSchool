/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import Entity.Book;
import Entity.History;
import Entity.Reader;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class HistoryProvider {
    private Scanner scanner = new Scanner(System.in);
    public History createHistory(ArrayList<Book> books,  ArrayList<Reader> readers) {
        System.out.println("Список книг: ");
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            System.out.println(i + book.toString());
        }
        System.out.println("Выберите книгу: ");
        int indexBook = scanner.nextInt();
        Book book = books.get(indexBook);
        
        System.out.println("Список читателей: ");
        for (int i = 0; i < readers.size(); i++) {
            Reader reader = readers.get(i);
            System.out.println(i + reader.toString());
        }
        System.out.println("Выберите читателя: ");
        int indexReader = scanner.nextInt();
        Reader reader = readers.get(indexReader);
        Date date = new Date();       
        
        History history = new History();
       
        history.setBook(book);
        history.setReader(reader);
        history.setDateofissue(new Date());
        
        return history;
        
    }

    public ArrayList<History> returnBook(ArrayList<History> histories) {
        


//histories.setReturnDate(new Date());
        
        return histories;
        
    }
}
