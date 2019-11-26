/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import Entity.Book;
import Entity.History;
import Entity.Reader;
import java.util.Date;

/**
 *
 * @author pupil
 */
public class HistoryProvider {
    public History createHistory(Book book,  Reader reader) {
        History history = new History();                
        history.setBook(book);
        history.setReader(reader);
        history.setDateofissue(new Date());
        
        return history;
        
    }

    public History returnBook(History history) {
        history.setReturnDate(new Date());
        
        return history;
        
    }
}
