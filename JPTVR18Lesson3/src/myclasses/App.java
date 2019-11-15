/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

/**
 *
 * @author pupil
 */
public class App {

    public void run() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Author author1 = new Author();
        author1.setName("Ilja");
        author1.setLastname("Sizov");
        author1.setDay(1);
        author1.setMonth(1);
        author1.setYear(2002);
        
        Author author2 = new Author("Denis","Sedov",1,5,2000);
        
        Author[] authors = {author1,author2};
        
        Book book1 = new Book("MyBook", authors , "Kniga o nashei schastlivoi zhisni", "123-123123" , 2019);
        System.out.println("Содержание созданной книги: ");
        System.out.println(book1.toString());
    }
    
}
