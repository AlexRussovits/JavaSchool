/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr18library;

import Entity.Book;
import Entity.History;
import Entity.Reader;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import myclasses.BookProvider;
import myclasses.HistoryProvider;
import myclasses.ReaderProvider;
import storage.Saveble;
import storage.SaverToBase;
import storage.SaverToFile;

/**
 *
 * @author pupil
 */
public class App {
   private ArrayList<Book> books = new ArrayList<>(); 
   private ArrayList<Reader> readers = new ArrayList<>();
   private ArrayList<History> histories = new ArrayList<>();
    //SaverToFile saverToFile;
   private Saveble saveble;
    public App() {
        //this.saverToFile = new SaverToFile();
        this.saveble = new SaverToBase();
        this.books.addAll(saveble.loadBooks());
        this.readers.addAll(saveble.loadReaders());
        //this.histories.addAll(saverToFile.loadHistories());
    }  
   
   
   public void run() {
       System.out.println("Консольная библиотека");
       OUTER:
       do {
           System.out.println("0. Выход из программы");
           System.out.println("1. Новая книга");
           System.out.println("2. Список книг");
           System.out.println("3. Новый читатель");
           System.out.println("4. Выдача книги");
           System.out.println("5. Возвращение книги");
           System.out.println("6. Список выданных книг");
           System.out.println("7. Вывод читателей");
           System.out.println("Выберите задачу: ");
           Scanner scanner = new Scanner(System.in);
           int task = scanner.nextInt();
           switch (task) {
               case 0:
                   System.out.println("Закрытие программы");
                   break OUTER;
           //Новая книга
               case 1:
                   BookProvider bookProvider = new BookProvider();
                   books.add(bookProvider.createBook());
                   saveble.saveBooks(books);
                   break;
           // Список книг
               case 2:
                   boolean flag = true;
                    for (int i = 0; i < books.size(); i++) {
                       for(History history: histories){
                           if(history.getBook().equals(books.get(i)) 
                                    && history.getReturnDate()== null){
                               flag = false;
                               break;
                           }
                       }
                       if(flag){
                           System.out.println(i+1+". "+books.get(i).toString());
                       }
                       flag=true; 
                    }
                    break;
           // Новый читатель
               case 3:
                   ReaderProvider readerProvider = new ReaderProvider();
                   readers.add(readerProvider.createReader());
                   saveble.saveReaders(readers);
                   break;
           // Выдача книги
               case 4:
                   HistoryProvider historyProvider = new HistoryProvider();
                   History history = historyProvider.createHistory(books,readers,histories);
                   if(history != null){
                        histories.add(history);
                        saveble.saveHistories(histories);
                    }
                   break;
           // Возвращение книги
               case 5:
                    historyProvider = new HistoryProvider();
                    historyProvider.returnBook(histories);
                    saveble.saveHistories(histories);
                    break;
                   
                    // Список читателей
               case 6:
                   history = null;
                    for (int i = 0; i < histories.size(); i++) {
                        history = histories.get(i);
                        if(history.getReturnDate()==null){
                            System.out.printf("Читатель %s %s читает %s%n",
                                history.getReader().getName(),
                                history.getReader().getSurname(),
                                history.getBook().getName()
                            );
                        }
                   }
                    break;
               case 7:
                   for (int i = 0; i < readers.size(); i++) {
                       System.out.println(readers.get(i).toString());
                      
                   }
                   break;
                   
               default:
                   System.out.println("Данной команды не существует");
                   break;
           }
       } while (true);
    }
  
}
