/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author pupil
 */
public class History implements Serializable {
    private Date dateofissue;
    private Date returnDate;
    private Book book;
    private Reader reader;
    
    public History() 
    {
        
    }

    public History(Date dateofissue, Date returnDate, Book book, Reader reader) {
        this.dateofissue = dateofissue;
        this.returnDate = returnDate;
        this.book = book;
        this.reader = reader;
    }

    public Date getDateofissue() {
        return dateofissue;
    }

    public void setDateofissue(Date dateofissue) {
        this.dateofissue = dateofissue;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    @Override
    public String toString() {
        return "History{" + "dateofissue=" + dateofissue + ", returnDate=" + returnDate + ", book=" + book.getName() + ", "+ book.getAuthor() + ", reader=" + reader.getName() + ", " + reader.getSurname() +  '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.dateofissue);
        hash = 23 * hash + Objects.hashCode(this.returnDate);
        hash = 23 * hash + Objects.hashCode(this.book);
        hash = 23 * hash + Objects.hashCode(this.reader);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final History other = (History) obj;
        if (!Objects.equals(this.dateofissue, other.dateofissue)) {
            return false;
        }
        if (!Objects.equals(this.returnDate, other.returnDate)) {
            return false;
        }
        if (!Objects.equals(this.book, other.book)) {
            return false;
        }
        if (!Objects.equals(this.reader, other.reader)) {
            return false;
        }
        return true;
    }

    public void SetReturnDate(Date date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
