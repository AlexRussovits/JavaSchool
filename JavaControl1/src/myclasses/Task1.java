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
    Scanner scanner = new Scanner (System.in);
    int [][] Weather = new int [12][];           
    Weather[0] =  new int[31]; // Январь
    Weather[1] =  new int[29]; // Феварль
    Weather[2] =  new int[31]; // Март
    Weather[3] =  new int[30]; // Апрель
    Weather[4] =  new int[31]; // Май
    Weather[5] =  new int[30]; // Июнь
    Weather[6] =  new int[31]; // Июль
    Weather[7] =  new int[31]; // Август
    Weather[8] =  new int[30]; // Сентябрь
    Weather[9] =  new int[31]; // Октябрь 
    Weather[10] =  new int[30]; // Ноябрь
    Weather[11] =  new int[31]; // Декабрь
    int max = 0,min = 0;
    Random rnd = new Random();
        for (int i = 0; i < Weather.length; i++) {
            for (int j = 0; j < Weather[i].length; j++) {
                  Weather[i][j]=rnd.nextInt(max-min+1)-min;               
            }
            int[] is = Weather[i];
            
        }
    for (int i= 0;i<Weather.length;i++) {
        switch (i) {
            case 0:
            case 1:  // Зима
            case 11:
                switch (Weather[i].length) {
                    case 30:
                            max = 14;
                            min = -12;                         
                        for(int j = 0; j < 30; j++) {        
                            Weather[i][j] = rnd.nextInt(max-min+1)-min;
                        }   break;
                    case 31:
                            max = 14;
                            min = -12;                         
                        for (int j = 0; j < 31; j++) {                           
                            Weather[i][j] = rnd.nextInt(max-min+1)-min;
                        }   break;
                    case 29:
                            max = 14;
                            min = -12;                         
                        for (int j = 0; j < 29; j++) {                           
                            Weather[i][j] = rnd.nextInt(max-min+1)-min;
                        }   break;
                    default:
                        break;
                }   break;
            case 2:
            case 3: // Весна
            case 4:
                switch (Weather[i].length) {
                    case 30:
                            max = 21;
                            min = 5;                         
                        for(int j = 0; j < 30; j++) {                           
                            Weather[i][j] = rnd.nextInt(max-min+1)-min;
                        }   break;
                    case 31:
                            max = 21;
                            min = 5;                         
                        for (int j = 0; j < 31; j++) {
                            Weather[i][j] = rnd.nextInt(max-min+1)-min;
                        }   break;
                    case 29:
                            max = 21;
                            min = 5;                         
                        for (int j = 0; j < 29; j++) {                           
                            Weather[i][j] = rnd.nextInt(max-min+1)-min;
                        }   break;
                    default:
                        break;
                }  break;
            case 5:
            case 6: // Лето
            case 7:
                switch (Weather[i].length) {
                    case 30:
                            max = 25;
                            min = 11;  
                        for(int j = 0; j < 30; j++) {                           
                            Weather[i][j] = rnd.nextInt(max-min+1)-min;
                        }   break;
                    case 31:
                            max = 25;
                            min = 11;                          
                        for (int j = 0; j < 31; j++) {
                            Weather[i][j] = rnd.nextInt(max-min+1)-min;
                        }   break;
                    case 29:
                            max = 25;
                            min = 11;                          
                        for (int j = 0; j < 29; j++) {                          
                            Weather[i][j] = rnd.nextInt(max-min+1)-min;
                        }   break;
                    default:
                        break;
                }  break;
            case 8:
            case 9:
            case 10: // Осень
                switch (Weather[i].length) {
                    case 30:
                            max = 12;
                            min = 0;                         
                        for(int j = 0; j < 30; j++) {     
                            Weather[i][j] = rnd.nextInt(max-min+1)-min;
                        }   break;
                    case 31:
                            max = 12;
                            min = 0;                         
                        for (int j = 0; j < 31; j++) {                             
                            Weather[i][j] = rnd.nextInt(max-min+1)-min;
                        }   break;
                    case 29:
                            max = 12;
                            min = 0;                         
                        for (int j = 0; j < 29; j++) {                            
                            Weather[i][j] = rnd.nextInt(max-min+1)-min;
                        }   break;
                    default:
                        break;
                }  break;
            default:
                break;
        }
      }
    
        System.out.print("Введите месяц: ");
        int month = scanner.nextInt();
        System.out.println("Введите день: ");
        int day = scanner.nextInt();
        for (int i = 0; i<Weather.length;i++) {
            if (i == month) {
                switch (Weather.length) {
                    case 30:
                        for(int j = 0; j < 30; j++) {
                            if(j == day) {
                                System.out.println("Температура воздуха: " + Weather[i][j]);
                            }
                        }   break;
                    case 31:
                        for(int j = 0; j < 31; j++) {
                            if (j == day) {
                                System.out.println("Температура воздуха: " + Weather[i][j]);
                            }
                        }   break;
                    case 29:
                        for(int j = 0; j < 29; j++) {
                            if (j == day) {
                                System.out.println("Температура воздуха: " + Weather[i][j]);
                            }
                        }   break;
                    default:
                        break;
                }
            }
       }

    
        /*int min = 50;
        int max = 0;*/
        /*
        for(int i = 0; i < Weather.length;i++) {
            if(i == month) {
                switch (Weather[i].length) {
                    case 30:
                        for(int j = 0; j < 30; j++) {
                            if(Weather[i][j] > max) {
                                max = Weather[i][j];
                            }
                            if(Weather[i][j] < min) {
                                min = Weather[i][j];
                            }
                        }   break;
                    case 31:
                        for (int j = 0; j < 31; j++) {
                            if (Weather[i][j] > max) {
                                max = Weather[i][j];
                            }
                            if (Weather[i][j] < min) {
                                min = Weather[i][j];
                            }
                        }   break;
                    case 29:
                        for (int j = 0; j < 29 ; j++) {
                            if (Weather[i][j] > max) {
                                max = Weather[i][j];
                            }
                            
                            if (Weather[i][j] < min) {
                                min = Weather[i][j];
                            }
                        }   break;
                    default:
                        break;
                }
            }
        }
        System.out.println("Самая высокая температура"+ max);
        System.out.println("Самая низкая температура"+min);
        
        int avg = 0;
        for (int i = 0; i<Weather.length; i++) {
            System.out.println("Месяц: "+ i);
        switch (Weather.length) {
            case 30:
                for(int j = 0; j < 30; j++) {
                    avg = avg + Weather[i][j];
                }
                avg = avg / 30;
                System.out.println("Среднее арифметическое: "+avg);
                break;
            case 31:
                for(int j = 0; j < 31; j++) {
                    avg = avg + Weather[i][j];
                }
                avg = avg / 31;
                System.out.println("Среднее арифметическое: "+avg);
                break;
            case 29:
                for(int j = 0; j < 29; j++) {
                    avg = avg + Weather[i][j];
                }
                avg = avg / 29;
                System.out.println("Среднее арифметическое: "+avg);
                break;
            default:
                break;
        }
        }
        */
   }
}

