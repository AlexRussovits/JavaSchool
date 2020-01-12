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
import myclasses.HistoryProvider;
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
    SaverToFile stf = new SaverToFile();
    private int income = 0;

    public App() {
        this.products.addAll(this.stf.loadProducts()); 
        this.users.addAll(this.stf.loadUsers());
        this.histories.addAll(this.stf.loadHistories());
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
            System.out.println("5. Список историй");
            System.out.println("6. Создать историю");
            System.out.println("7. Прибыль");
            System.out.println("Выберите задачу: ");
            Scanner scanner = new Scanner(System.in);
            int task = scanner.nextInt();
            
            switch(task) {
                case 0:
                    System.out.println("Выход из программы");
                    repeat = false;
                    break;
                    
                    // Новый товар
                case 1:
                    ProductProvider productProvider = new ProductProvider();
                    products.add(productProvider.createProduct());
                    this.stf.saveProducts(this.products);
                    break; 
                    
                // Новый пользователь
                case 2:
                    UserProvider userProvider = new UserProvider();
                    users.add(userProvider.createUser());
                    this.stf.saveUsers(this.users);
                    break;
                // Список товаров   
                case 3:
                    for (Product product : products) {
                        System.out.println(product.toString());
                    }
                    break;
                // Список пользователей   
                case 4:
                    for (User user : users) {
                        System.out.println(user.toString());
                    }
                    break;
                // Список историй
                case 5:
                    for(History history: histories){
                        System.out.println(history.toString());
                    }
                    break;
                // Создать историю  
                case 6:
                    HistoryProvider historyProvider = new HistoryProvider();
                    histories.add(historyProvider.createHistory(this.products, this.users, this.histories));
                    this.stf.saveHistories(this.histories);
                    break;
                // Прибыль
                case 7:
                    for (History history : histories) {
                        int price = history.getProduct().getPrice();
                        int countP = history.getCountofproduct();
                        this.income = price * countP;
                    }
                    System.out.println("Прибыль магазина: "+ this.income);
            }
            
        }
        while(repeat);
    }
    
}
