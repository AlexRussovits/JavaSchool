/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr19startdev1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
class Task2 {

    void run() {
        System.out.println("Задача 2");
        System.out.println("Загадно числ от 5 до 10...");
        Random random = new Random();
        System.out.println("Отгадай его - ");
        int myNumber = random.nextInt((10-5)+1)+5;
        Scanner scanner = new Scanner (System.in);
        int gamerNumber = scanner.nextInt();
        
        if (gamerNumber == myNumber) {
            System.out.println("Ты выиграл");        
        }else {
            System.out.println("Ты проиграл, было задумано число - " + myNumber);
        }
        System.out.println("----------------------Конец задачи---------------------");
    }
  
}
