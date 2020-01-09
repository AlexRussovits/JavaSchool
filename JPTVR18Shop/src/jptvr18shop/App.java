/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr18shop;

import java.util.Scanner;
import myclasses.UserProvider;

/**
 *
 * @author pupil
 */
public class App {
    public void run () {
        System.out.println("Консольный магазин");
        boolean repeat = true;
        do {
            System.out.println("0. Выход из системы");
            System.out.println("1. Новый товар");
            System.out.println("2. Список товаров");
            System.out.println("3. Покупка товара");
            System.out.println("4. Новый пользователь");
            System.out.println("5. Список пользователей");
            System.out.println("6.Прибыль");
            System.out.println("Выберите задачу: ");
            Scanner scanner = new Scanner(System.in);
            int task = scanner.nextInt();
            
            switch(task) {
                case 0:
                    System.out.println("Выход из программы");
                    break;
                    
                case 1:
                    UserProvider userProvider = new UserProvider();
                    
            }
        }
        while(repeat);
    }
    
}
