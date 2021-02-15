/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr19startdev1;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author pupil
 */
class Task6 {

    void run() {
        System.out.println("----- Задача 6 ------");
        System.out.println("Создаем ДВУХМЕРНЫЙ ЗУБЧАТЫЙ массив  из 10х(5,6,7,8,9) ячеек типа int, \nзаполняем его случайными числами и выводим \nего значения в цикле");
        Random random = new Random();
        int [][] numbersArray = new int [10][];
        numbersArray[0] = new int [1];
        numbersArray[1] = new int [2];
        numbersArray[2] = new int [3];
        numbersArray[3] = new int [4];
        numbersArray[4] = new int [5];
        numbersArray[5] = new int [6];
        numbersArray[6] = new int [7];
        numbersArray[7] = new int [8];
        numbersArray[8] = new int [9];
        numbersArray[9] = new int [10];
        System.out.println("Массив");
        for (int i = 0; i < numbersArray.length; i++) {
            System.out.println(Arrays.toString(numbersArray[i]));
        }
    }
    
}
