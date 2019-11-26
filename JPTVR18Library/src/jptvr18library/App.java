/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr18library;

import Entity.Book;
import Entity.History;
import Entity.Reader;
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
   private Book book; 
   private Reader reader;
   private History history;
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
                   book = bookProvider.createBook();
                   break;
           // Список книг
               case 2:
                   System.out.println(book.toString());
                   break;
           // Новый читатель
               case 3:
                   ReaderProvider readerProvider = new ReaderProvider();
                   reader = readerProvider.createReader();
                   break;
           // Выдача книги
               case 4:
                   HistoryProvider historyProvider = new HistoryProvider();
                   history = historyProvider.createHistory(book,reader);
                   break;
           // Возвращение книги
               case 5:
                   historyProvider = new HistoryProvider();
                   history = historyProvider.returnBook(history);
                   break;
                   
               case 6:
                   System.out.printf("Читатель %s %s читает %s%n1",history.getReader().getName(), history.getReader().getSurname(),history.getBook().getName());
                   break;
                   
               default:
                   System.out.println("Данной команды не существует");
                   break;
           }
       } while (true);
    }
  
}
