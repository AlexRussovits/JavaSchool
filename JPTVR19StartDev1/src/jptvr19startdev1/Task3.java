/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr19startdev1;

import static java.lang.Math.random;
import java.util.Random;

/**
 *
 * @author pupil
 */
class Task3 {

    void run() {
        System.out.println("----- Задача 3 ------");
        System.out.println("Создаем одномерный массив  из 10 ячеек типа int, \nзаполняем его случайными числами и выводим \nего значения в цикле");
        Random random = new Random();
        int numbers[] = new int[10];
        int max = 50;
        int min = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(49 + 1);
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%4d", numbers[i]);
        }
      int sum = 0;
           for(int i = 0; i < numbers.length; i++){
               sum = sum + numbers[i];
           }
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }if (min < numbers[i]) {
                min = numbers[i];
            }
        }
        
        System.out.println("Сумма всех чисел массива: "+sum);
        System.out.println("min = " +min);
        System.out.println("max = " +max);
        System.out.println("----------------------------- конец задачи 3 --------------------------------------");
        
    }
    
}
