/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import java.util.Scanner;

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
    }
    
}
