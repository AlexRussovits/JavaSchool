/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacontrol1;

import java.util.Scanner;
import myclasses.Task1;
import myclasses.Task2;

/**
 *
 * @author pupil
 */
public class JavaControl1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите задачу: ");
        System.out.println("1. Погода");
        System.out.println("2.Алфавит");
        System.out.println("Выберите номер задачу: ");
        int numberTask = scanner.nextInt();
        switch(numberTask){
            case 1:
                Task1 task1 = new Task1();
                task1.run();
                break;
            case 2:
                Task2 task2 = new Task2();
                task2.alphabet();
                break;
        }    
    }           
}
