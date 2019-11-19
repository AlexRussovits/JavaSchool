/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class Task1 {
    public void run (){
    //Scanner scanner = new Scanner (System.in);
    int [][] Weather = new int [12][];           
    Weather[0] =  new int[31];
    Weather[1] =  new int[29];
    Weather[2] =  new int[31];
    Weather[3] =  new int[30];
    Weather[4] =  new int[31];
    Weather[5] =  new int[30];
    Weather[6] =  new int[31];
    Weather[7] =  new int[31];
    Weather[8] =  new int[30];
    Weather[9] =  new int[31];
    Weather[10] =  new int[30];
    Weather[11] =  new int[31];
    Random rnd = new Random();
    for (int i= 0;i<Weather.length;i++) {
        for (int j=0; j< Weather.length;j++) {    
           Weather [i][j] = rnd.nextInt(30);
           System.out.println(Weather[i][j]+", ");
            }
        }
  }
}