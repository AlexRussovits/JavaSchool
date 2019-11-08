/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr18lesson1;

import java.util.Scanner;
import myclasses.App;

/**
 *
 * @author pupil
 */
public class JPTVR18Lesson1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите задачу:");
        System.out.println("1. Игра - угадайка");
        
        App app = new App();
        app.run();

    }

}


