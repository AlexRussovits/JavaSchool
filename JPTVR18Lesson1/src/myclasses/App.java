/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import java.util.Random; // Импортирует случайные числа
import java.util.Scanner; // Импортирует сканер

/**
 *
 * @author pupil
 */
public class App {
    public void run() {
        System.out.println("Привет, Юрий Валентинович Мельников!");
        Scanner scanner = new Scanner(System.in); // system.in Системный ввод (клавиатура)
        System.out.println("Напишите своё имя латинскими буквами: ");
        String myName = scanner.nextLine(); // Сканируем клавиатуру до нажатия клавиши Enter
        System.out.println("Hi, "+myName);
        Random random = new Random();
        do {
        int randomNumber = random.nextInt(5); // NextInt генерирует в диапозоне
        System.out.println("Задумано число от 0 до 4. Угадай?"); // Игра
        int userNumber = scanner.nextInt();
        if (userNumber == randomNumber) {   
            System.out.println("Ты угадал, молодец!");
            break;
        }
        else {
            System.out.println("Не повезло : (, задумано число: "+randomNumber);
        }
        
          }while(true);
    }
    
}
