/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author pupil
 */
public class Book {
    private String nameBook;
    private Author[] authors;
    private String annotation;
    private String isbn;
    private int publishedYear;

    public Book() {
        
    }

    public Book(String nameBook, Author[] authors, String annotation, String isbn, int publishedYear) {
        this.nameBook = nameBook;
        this.authors = authors;
        this.annotation = annotation;
        this.isbn = isbn;
        this.publishedYear = publishedYear;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nameBook);
        hash = 97 * hash + Arrays.deepHashCode(this.authors);
        hash = 97 * hash + Objects.hashCode(this.annotation);
        hash = 97 * hash + Objects.hashCode(this.isbn);
        hash = 97 * hash + this.publishedYear;
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
        final Book other = (Book) obj;
        if (this.publishedYear != other.publishedYear) {
            return false;
        }
        if (!Objects.equals(this.nameBook, other.nameBook)) {
            return false;
        }
        if (!Objects.equals(this.annotation, other.annotation)) {
            return false;
        }
        if (!Objects.equals(this.isbn, other.isbn)) {
            return false;
        }
        if (!Arrays.deepEquals(this.authors, other.authors)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String authorsStr = "";
        for (int i = 0; i < authors.length; i++) {
            Author author = authors[i];
            authorsStr += author.getName()+ " "+ author.getLastname()+ ", ";
        }        
        return "Book{" + "nameBook=" + nameBook + ", authors=" + authors + ", annotation=" + annotation + ", isbn=" + isbn + ", publishedYear=" + publishedYear + '}';
    }

    
    
}
