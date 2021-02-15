/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr19startdev1;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
class Task1 {
     public void run() {
        System.out.println("----- Задача 1 -----");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите градусы по Цельсию - ");
        double gradc = scanner.nextDouble();
        double result = gradc * 1.8 + 32;
        System.out.printf("По Фаренгейту - ");
        System.out.println(result);
        System.out.println("------------------------------------");
        
    }
    
    
}
