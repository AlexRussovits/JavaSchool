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
class Task5 {

    void run() {
        System.out.println("----- Задача 5 ------");
        System.out.println("Создаем ДВУХМЕРНЫЙ массив  из 10х5 ячеек типа int, \nзаполняем его случайными числами и выводим \nего значения в цикле");
        int numbers [][] = new int [5][10];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            for ( int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = random.nextInt(10);
                System.out.print(numbers[i][j] +"\t");
            }
            System.out.println();
        }
        
    }
    
}
