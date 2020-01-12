/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import entity.History;
import entity.Product;
import entity.User;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class HistoryProvider {
    private Scanner scanner = new Scanner(System.in);
    public History createHistory(ArrayList<Product> products,  ArrayList<User> users, ArrayList<History> histories){
     int i = 0; // нужна для того, чтобы пользователь мог выбрать правильный товар / продукт
        for (Product product : products) {
            System.out.println(i + ". " + product.toString()); //View = " 0. productInfo "
            i++;
        }
        System.out.print("Выбери продукт: ");
        int numProduct = this.scanner.nextInt();
        
        i = 0; // Переопределеям
        for (User user : users) {
            System.out.println(i + ". " + user.toString()); //View = " 0. userInfo "
            i++;
        }
        System.out.print("Выбери пользователя: ");
        int numUser = this.scanner.nextInt();
        
        System.out.print("Введи количество продуктов: ");
        int countProduct = this.scanner.nextInt();
        
        History h = new History(products.get(numProduct),users.get(numUser), countProduct);
        return h;
        
    }
}
