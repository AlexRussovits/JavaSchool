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
        switch (i) {
            case 0:
            case 1:
            case 11:
                switch (Weather[i].length) {
                    case 30:
                        for(int j = 0; j < 30; j++) {
                            Weather[i][j] = rnd.nextInt(16+(-12+1)+(-16));
                        }   break;
                    case 31:
                        for (int j = 0; j < 31; j++) {
                            Weather[i][j] = rnd.nextInt(16+(-12+1)+(-16));
                        }   break;
                    case 29:
                        for (int j = 0; j < 29; j++) {
                            Weather[i][j] = rnd.nextInt(16+(-13+1)+(-13));
                        }   break;
                    default:
                        break;
                }   break;
            case 2:
            case 3:
            case 4:
                switch (Weather[i].length) {
                    case 30:
                        for(int j = 0; j < 30; j++) {
                            Weather[i][j] = rnd.nextInt(22-(6+1)+ 6);
                        }   break;
                    case 31:
                        for (int j = 0; j < 31; j++) {
                            Weather[i][j] = rnd.nextInt(22-(6+1)+ 6);
                        }   break;
                    case 29:
                        for (int j = 0; j < 29; j++) {
                            Weather[i][j] = rnd.nextInt(22-(6+1)+ 6);
                        }   break;
                    default:
                        break;
                }  break;
            case 5:
            case 6:
            case 7:
                switch (Weather[i].length) {
                    case 30:
                        for(int j = 0; j < 30; j++) {
                            Weather[i][j] = rnd.nextInt(25-(6+1)+ 6);
                        }   break;
                    case 31:
                        for (int j = 0; j < 31; j++) {
                            Weather[i][j] = rnd.nextInt(25-(6+1)+ 6);
                        }   break;
                    case 29:
                        for (int j = 0; j < 29; j++) {
                            Weather[i][j] = rnd.nextInt(25-(6+1)+ 6);
                        }   break;
                    default:
                        break;
                }  break;
            case 8:
            case 9:
            case 10:
                switch (Weather[i].length) {
                    case 30:
                        for(int j = 0; j < 30; j++) {
                            Weather[i][j] = rnd.nextInt(14-(0+1)+ 3);
                        }   break;
                    case 31:
                        for (int j = 0; j < 31; j++) {
                            Weather[i][j] = rnd.nextInt(14-(0+1)+ 3);
                        }   break;
                    case 29:
                        for (int j = 0; j < 29; j++) {
                            Weather[i][j] = rnd.nextInt(14-(0+1)- 3);
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
        
        int min = 50;
        int max = 0;
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
   }
}

