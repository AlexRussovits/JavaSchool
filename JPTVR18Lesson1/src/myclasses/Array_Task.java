/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import java.util.Random;

/**
 *
 * @author pupil
 */
public class Array_Task {
   public void running() {
       int [] numbers = new int [10];
       Random random = new Random();
       for (int i = 0; i < numbers.length; i++) {
           numbers[i] = random.nextInt(100);
           System.out.printf("%5d", numbers[i]);
       }
       
   }
}
