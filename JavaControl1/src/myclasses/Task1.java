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
    public void run(){
        Scanner scanner = new Scanner(System.in);
        int[][] Weather = new int[12][];
        Random rnd = new Random();
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
        
        
        int max =0 ,min = 0, maxNumber = 0, minNumber = 0, sum = 0, element = 0;
        
        for(int i = 0; i < Weather.length; i++){
            for(int j = 0; j < Weather[i].length; j++){
                if(i == 0 || i == 1 || i == 11){ // Январь // Феварль // Декабрь
                    min = -30;
                    max = -5;
                }
                if (i == 2 || i == 3 || i == 4){ // Март Апрель Май
                    min = -5;
                    max = 10;
                }
                if(i == 5 || i == 6 || i == 7){ // Июнь Июль Август
                    min = 10;
                    max = 25;
                }
                if(i == 8 || i == 9 || i == 10){ // Сентябрь Октябрь // Ноябрь
                    min = -5;
                    max = 15;
                }
                   Weather[i][j] = rnd.nextInt(max - min + 1) + min; 
                   System.out.printf("%-5d",Weather[i][j]);
                   if (i == 0 && j == 0){
                      minNumber = Weather[i][j];
                   }
                   if (Weather[i][j]< minNumber) {
                        minNumber =  Weather[i][j];
                   }
                   if (Weather[i][j]>maxNumber) {
                       maxNumber = Weather[i][j];
                   }
                   sum += Weather[i][j];
                   element++;
            }
            System.out.println("");
           
        }   
        
        // 2 вариант
//        for(int i = 0; i < Weather.length; i++){
//            if(i == 0 || i == 1 || i == 11){ // Январь // Феварль // Декабрь
//                if(Weather[i].length == 30){
//                    for(int j = 0; j < 30; j++){
//                        Weather[i][j] = rnd.nextInt(14 - (-12 + 1)) + (-12);
//                    }      
//                }else if(Weather[i].length == 29){
//                    for(int j = 0; j < 29; j++){
//                        Weather[i][j] = rnd.nextInt(14 - (-11 + 1)) + (-11); // Диапазон температуры воздуха при выборе дня и месяца пользователем
//                    } 
//                }else if(Weather[i].length == 31){
//                    for(int j = 0; j < 31; j++){
//                        Weather[i][j] = rnd.nextInt(14 - (-10 + 1)) + (-10);
//                    } 
//                }
//            }else if(i == 2 || i == 3 || i == 4){ // Март Апрель Май
//                if(Weather[i].length == 30){
//                    for(int j = 0; j < 30; j++){
//                        Weather[i][j] = rnd.nextInt(21 - (3 + 1)) + 3;
//                    }      
//                }else if(Weather[i].length == 29){
//                    for(int j = 0; j < 29; j++){
//                        Weather[i][j] = rnd.nextInt(21 - (4 + 1)) + 4;
//                    } 
//                }else if(Weather[i].length == 31){
//                    for(int j = 0; j < 31; j++){
//                        Weather[i][j] = rnd.nextInt(21 - (7 + 1)) + 7;
//                    } 
//                } 
//            }else if(i == 5 || i == 6 || i == 7){ // Июнь Июль Август
//                if(Weather[i].length == 30){
//                    for(int j = 0; j < 30; j++){
//                        Weather[i][j] = rnd.nextInt(25 - (10 + 1)) + 10;
//                    }      
//                }else if(Weather[i].length == 29){
//                    for(int j = 0; j < 29; j++){
//                        Weather[i][j] = rnd.nextInt(25 - (13 + 1)) + 13;
//                    } 
//                }else if(Weather[i].length == 31){
//                    for(int j = 0; j < 31; j++){
//                        Weather[i][j] = rnd.nextInt(25 - (11 + 1)) + 11;
//                    } 
//                } 
//            }else if(i == 8 || i == 9 || i == 10){ // Сентябрь Октябрь // Ноябрь
//                if(Weather[i].length == 30){
//                    for(int j = 0; j < 30; j++){
//                        Weather[i][j] = rnd.nextInt(6-0+1) + 0;
//                    }      
//                }else if(Weather[i].length == 29){
//                    for(int j = 0; j < 29; j++){
//                        Weather[i][j] = rnd.nextInt(6 - (-1 + 1)) + (-1);
//                    } 
//                }else if(Weather[i].length == 31){
//                    for(int j = 0; j < 31; j++){
//                        Weather[i][j] = rnd.nextInt(5 - (-3 + 1)) + (-3);
//                    } 
//                } 
//            }
//        }
//        
//        
        System.out.print("Введите месяц: ");
        int month = scanner.nextInt();
        System.out.print("Введите день: ");
        int day = scanner.nextInt();
        
        System.out.println("Температура: " + Weather[month-1][day-1]);
        
        //int sum = 0;
         for(int j = 0; j < Weather[month-1].length; j++){
             
         }
//        for(int i = 0; i < Weather.length; i++){
//            if(i == month){
//                if(Weather[i].length == 30){
//                    for(int j = 0; j < 30; j++){
//                        if(j == day){
//                            System.out.println("Температура: " + Weather[i][j]);
//                        }
//                    }      
//                }else if(Weather[i].length == 29){ // Текущая температура воздуха в данный момент , введённым пользователем 
//                    for(int j = 0; j < 29; j++){
//                        if(j == day){
//                            System.out.println("Температура: " + Weather[i][j]);
//                        }
//                    } 
//                }else if(Weather[i].length == 31){
//                    for(int j = 0; j < 31; j++){
//                        if(j == day){
//                            System.out.println("Температура: " + Weather[i][j]);
//                        }
//                    } 
//                }  
//            }
//        }
        
        int maxt = 0;
        int mint = 100;        
        for(int i = 0; i < Weather.length; i++){
            if(i == month){
                if(Weather[i].length == 30){
                    for(int j = 0; j < 30; j++){
                        if(Weather[i][j] > maxt){
                            maxt = Weather[i][j];
                        }
                        if(Weather[i][j] < mint){
                            mint = Weather[i][j]; // Максимальная и минимальная температура воздуха за весь месяц , введённым пользователем
                        }
                    }      
                }else if(Weather[i].length == 29){
                    for(int j = 0; j < 29; j++){
                        if(Weather[i][j] > maxt){
                            maxt = Weather[i][j];
                        }
                        if(Weather[i][j] < mint){
                            mint = Weather[i][j];
                        }
                    } 
                }else if(Weather[i].length == 31){
                    for(int j = 0; j < 31; j++){
                        if(Weather[i][j] > maxt){
                            maxt = Weather[i][j];
                        }
                        if(Weather[i][j] < mint){
                            mint = Weather[i][j];
                        }
                    } 
                }  
            }
        }  
        
        System.out.println("Самая высокая температура: " + maxt);
        System.out.println("Самая низкая температура: " + mint);
        
        int avg = 0;
        for(int i = 0; i < Weather.length; i++){
            System.out.println("Месяц: " + i);
            if(Weather[i].length == 30){
                for(int j = 0; j < 30; j++){
                    avg = avg + Weather[i][j];
                }   
                avg = avg / 30;
                System.out.println("Среднее ареф.: " + avg); // Высчитывается среднее арифметическое температуры воздуха за весь месяц, введёным пользователем
            }else if(Weather[i].length == 29){
                for(int j = 0; j < 29; j++){
                    avg = avg + Weather[i][j];
                }
                avg = avg / 29;
                System.out.println("Среднее ареф.: " + avg);
            }else if(Weather[i].length == 31){
                for(int j = 0; j < 31; j++){
                    avg = avg + Weather[i][j]; 
                } 
                avg = avg / 31;
                System.out.println("Среднее ареф.: " + avg);
            }
        }
        
    }
}


