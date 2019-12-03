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
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class HistoryProvider {
    private Scanner scanner = new Scanner(System.in);
    public History createHistory(ArrayList<Book> books,  ArrayList<Reader> readers) {
        HashSet<Book> setBooks = new HashSet<>();
        int counterPrintedBooks = 0;
        System.out.println("Список книг: ");
        boolean flag = true;
        
        for (int i = 0; i < books.size(); i++) {
            for(History history: histories) {
                if(history.getBook().equals(books.get(i))
                    && history.getReturnDate() == null) {
                    
                    flag = false;
                    break;
                }
                   
            }
            if (flag) {
                setBooks.add(books.get(i));
            }
            flag = true;
            
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
        History history = new History(new Date(), null, book, reader);
        
        /*
        II variant
        History history = new History();
        history.setBook(book);
        history.setReader(reader);
        history.setDateofissue(new Date());
        */
        return history;
        
    }

    public void returnBook(ArrayList<History> histories) {        
        System.out.println("----Возврат книги----");
        System.out.println("Список историй: ");
        for (int i = 0; i < histories.size(); i++) {
            History history = histories.get(i);
            System.out.println(i+". Читатель "+history.getReader().getName()+ " "+history.getReader().getSurname()+ " читает книгу: "+ history.getBook().getName());
        }
        System.out.println("Выберите нужный номер истории");
        int numHistory = scanner.nextInt();
        History history = histories.get(numHistory);
        history.SetReturnDate(new Date());
                        
    }
}
