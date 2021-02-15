/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr19startdev1;

import java.util.Random;

/**
 *
 * @author pupil
 */
class Task4 {

    void run() {
        System.out.println("----- Задача 4 ------");
        System.out.println("Создаем одномерный массив  из 10 ячеек типа int, \nзаполняем его случайными ЧЕТНЫМИ числами и выводим \nего значения в цикле");
        int n = 10;
        int numbers[] = new int [n];
        Random random = new Random ();
        int randomNum = 0;
        for (int i = 0; i < numbers.length; i++){
            do {
                randomNum = random.nextInt(19-0+1)-0;
            } while (randomNum % 2 != 0);
            numbers[i] = randomNum;
        }
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%4d", numbers[i]);
        }
        System.out.printf("%-3d",  randomNum );
        System.out.println("----- конец задачи 4 ------");            
    }
    
}
