/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr18shop;

import entity.History;
import entity.Product;
import entity.User;
import java.util.ArrayList;
import java.util.Scanner;
import myclasses.ProductProvider;
import myclasses.UserProvider;
import storage.SaverToFile;

/**
 *
 * @author pupil
 */




public class App {
    private ArrayList<Product> products = new ArrayList();
    private ArrayList<User> users = new ArrayList();
    private ArrayList<History> histories = new ArrayList();
    SaverToFile saverToFile;

    public App() {
        this.saverToFile = new SaverToFile();
        this.products.addAll(saverToFile.loadProducts()); 
        this.users.addAll(saverToFile.loadUsers());
        this.histories.addAll(saverToFile.loadHistories());
    }
    
    
    
    
    public void run () {
        System.out.println("Консольный магазин");
        boolean repeat = true;
        do {
            System.out.println("0. Выход из системы");
            System.out.println("1. Новый товар");
            System.out.println("2. Новый пользователь");
            System.out.println("3. Список товаров");
            System.out.println("4. Список пользователей");
            System.out.println("5. Покупка товара");
            System.out.println("6.Прибыль");
            System.out.println("Выберите задачу: ");
            Scanner scanner = new Scanner(System.in);
            int task = scanner.nextInt();
            
            switch(task) {
                case 0:
                    System.out.println("Выход из программы");
                    break;
                    
                    // Новый товар
                case 1:
                    ProductProvider productProvider = new ProductProvider();
                    products.add(productProvider.createProduct());
                    saverToFile.saveProducts(products);
                    break; 
                    
                // Новый пользователь
                case 2:
                    UserProvider userProvider = new UserProvider();
                    users.add(userProvider.createUser());
                    saverToFile.saveUsers(users);
                    
                 // Список товаров   
                case 3:
                    
                 // Список пользователей   
                case 4:
                    
                  // Покупка товара  
                case 5:
                    
                  // Прибыль  
                case 6:
            }
            
        }
        while(repeat);
    }
    
}
