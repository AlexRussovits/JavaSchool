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

/**
 *
 * @author pupil
 */
public class App {
   private ArrayList<Book> books = new ArrayList<>(); 
   private ArrayList<Reader> readers = new ArrayList<>();
   private ArrayList<History> histories = new ArrayList<>();
   
   
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
                   break;
           // Список книг
               case 2:
                   for (int i = 0; i < books.size(); i++) {
                       System.out.println(books.get(i).toString());
                       
                   }
                   break;
           // Новый читатель
               case 3:
                   ReaderProvider readerProvider = new ReaderProvider();
                   readers.add(readerProvider.createReader());
                   break;
           // Выдача книги
               case 4:
                   HistoryProvider historyProvider = new HistoryProvider();
                   histories.add(historyProvider.createHistory(books,readers));
                   break;
           // Возвращение книги
               case 5:
                   historyProvider = new HistoryProvider();
                   histories = historyProvider.returnBook(histories);
                   break;
                   
               case 6:
                   History history = null;
                   for (int i = 0; i < histories.size(); i++) {
                   System.out.printf("Читатель %s %s читает %s%n1",history.getReader().getName(), history.getReader().getSurname(),history.getBook().getName());
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
