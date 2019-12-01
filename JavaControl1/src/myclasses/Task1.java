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
        for(int i = 0; i < Weather.length; i++){
            if(i == 0 || i == 1 || i == 11){
                if(Weather[i].length == 30){
                    for(int j = 0; j < 30; j++){
                        Weather[i][j] = rnd.nextInt(14 - (-12 + 1)) + (-12);
                    }      
                }else if(Weather[i].length == 29){
                    for(int j = 0; j < 29; j++){
                        Weather[i][j] = rnd.nextInt(14 - (-12 + 1)) + (-12);
                    } 
                }else if(Weather[i].length == 31){
                    for(int j = 0; j < 31; j++){
                        Weather[i][j] = rnd.nextInt(14 - (-12 + 1)) + (-12);
                    } 
                }
            }else if(i == 2 || i == 3 || i == 4){
                if(Weather[i].length == 30){
                    for(int j = 0; j < 30; j++){
                        Weather[i][j] = rnd.nextInt(21 - (5 + 1)) + 5;
                    }      
                }else if(Weather[i].length == 29){
                    for(int j = 0; j < 29; j++){
                        Weather[i][j] = rnd.nextInt(21 - (5 + 1)) + 5;
                    } 
                }else if(Weather[i].length == 31){
                    for(int j = 0; j < 31; j++){
                        Weather[i][j] = rnd.nextInt(21 - (5 + 1)) + 5;
                    } 
                } 
            }else if(i == 5 || i == 6 || i == 7){
                if(Weather[i].length == 30){
                    for(int j = 0; j < 30; j++){
                        Weather[i][j] = rnd.nextInt(25 - (11 + 1)) + 11;
                    }      
                }else if(Weather[i].length == 29){
                    for(int j = 0; j < 29; j++){
                        Weather[i][j] = rnd.nextInt(25 - (11 + 1)) + 11;
                    } 
                }else if(Weather[i].length == 31){
                    for(int j = 0; j < 31; j++){
                        Weather[i][j] = rnd.nextInt(25 - (11 + 1)) + 11;
                    } 
                } 
            }else if(i == 8 || i == 9 || i == 10){
                if(Weather[i].length == 30){
                    for(int j = 0; j < 30; j++){
                        Weather[i][j] = rnd.nextInt(6-0+1) + 0;
                    }      
                }else if(Weather[i].length == 29){
                    for(int j = 0; j < 29; j++){
                        Weather[i][j] = rnd.nextInt(6 - (-1 + 1)) + (-1);
                    } 
                }else if(Weather[i].length == 31){
                    for(int j = 0; j < 31; j++){
                        Weather[i][j] = rnd.nextInt(5 - (-3 + 1)) + (-3);
                    } 
                } 
            }
        }
        
        
        System.out.print("Введите месяц: ");
        int month = scanner.nextInt();
        System.out.print("Введите день: ");
        int day = scanner.nextInt();
        
        for(int i = 0; i < Weather.length; i++){
            if(i == month){
                if(Weather[i].length == 30){
                    for(int j = 0; j < 30; j++){
                        if(j == day){
                            System.out.println("Температура: " + Weather[i][j]);
                        }
                    }      
                }else if(Weather[i].length == 29){
                    for(int j = 0; j < 29; j++){
                        if(j == day){
                            System.out.println("Температура: " + Weather[i][j]);
                        }
                    } 
                }else if(Weather[i].length == 31){
                    for(int j = 0; j < 31; j++){
                        if(j == day){
                            System.out.println("Температура: " + Weather[i][j]);
                        }
                    } 
                }  
            }
        }
        
        int max = 0;
        int min = 100;        
        for(int i = 0; i < Weather.length; i++){
            if(i == month){
                if(Weather[i].length == 30){
                    for(int j = 0; j < 30; j++){
                        if(Weather[i][j] > max){
                            max = Weather[i][j];
                        }
                        if(Weather[i][j] < min){
                            min = Weather[i][j];
                        }
                    }      
                }else if(Weather[i].length == 29){
                    for(int j = 0; j < 29; j++){
                        if(Weather[i][j] > max){
                            max = Weather[i][j];
                        }
                        if(Weather[i][j] < min){
                            min = Weather[i][j];
                        }
                    } 
                }else if(Weather[i].length == 31){
                    for(int j = 0; j < 31; j++){
                        if(Weather[i][j] > max){
                            max = Weather[i][j];
                        }
                        if(Weather[i][j] < min){
                            min = Weather[i][j];
                        }
                    } 
                }  
            }
        }  
        
        System.out.println("Самая высокая температура: " + max);
        System.out.println("Самая низкая температура: " + min);
        
        int avg = 0;
        for(int i = 0; i < Weather.length; i++){
            System.out.println("Месяц: " + i);
            if(Weather[i].length == 30){
                for(int j = 0; j < 30; j++){
                    avg = avg + Weather[i][j];
                }   
                avg = avg / 30;
                System.out.println("Среднее ареф.: " + avg);
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


