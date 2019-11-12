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
public class Task2 {
    public void run() {
        System.out.println("Задача 2");
        System.out.println("Пользователь вводит трёхзначное число ");
        System.out.println("Найдите: Число единиц, десятков.");
        System.out.println("Сумма цифр");
        System.out.println("Для решения можно использовать арифметический оператор % - остаток от деления ");
        System.out.println("Решение:");
        System.out.println("Введите трёхзначное число: ");
        int decimalNum = 0, hundredNum=0, unitsNum=0 ,sum = 0;
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        
        do{
            unitsNum = number / 100;
            decimalNum = number / 10 % 10;
            hundredNum = number % 10;
            sum = unitsNum + decimalNum + hundredNum;
            System.out.println("В этом числе: ");
            System.out.println("Единицы: "+ unitsNum);
            System.out.println("Десятков: "+ decimalNum);
            System.out.println("Сотен: "+ hundredNum);
            System.out.println("Сумма чисел: "+ sum);
            break;
        } while(true);
    }
}
