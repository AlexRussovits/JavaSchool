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
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class HistoryProvider {
    private Scanner scanner = new Scanner(System.in);
    public History createHistory(ArrayList<Product> products,  ArrayList<User> users, ArrayList<History> histories){
        HashSet<Product> setProducts = new HashSet<>();
        int countersoldProducts = 0;
        System.out.println("Список товаров: ");
        boolean flag = true;   
        for (int i = 0; i < products.size(); i++) {
            for(History history: histories) {
                if (history.getProduct().equals(products.get(i))) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                setProducts.add(products.get(i));
            }
            flag = true;
            if(setProducts.contains(products.get(i))) {
                System.out.println(i+1+". "+ products.get(i).toString());
                countersoldProducts++;
            }
        }
        
        if (countersoldProducts == 0) {
            System.out.println("Все товары проданы");
            return null;
        }
        
        System.out.println("Выберите товар: ");
        int indexProduct = scanner.nextInt();
        Product product = products.get(indexProduct - 1);
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            System.out.println(i+1+". "+ user.toString());
        }
        System.out.println("Cписок покупателя: ");
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            System.out.println(i + user.toString());
        }
        
        System.out.println("Выбор покупателя: ");
        int indexUser = scanner.nextInt();
        User user = users.get(indexUser);
        History history = new History (product,user);         
        return history;
    }
}
