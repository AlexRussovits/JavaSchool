/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import Entity.Reader;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class ReaderProvider {

    private Reader reader;
    public Reader createReader() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---Ввод читателя---");
        System.out.println("Имя читателя");
        String name = scanner.nextLine();
        System.out.println("Фамилия читателя");
        String surname = scanner.nextLine();
        System.out.println("День");
        int day = scanner.nextInt();
        System.out.println("Месяц");
        int month = scanner.nextInt();
        System.out.println("Год");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Телефон");
        String phone = scanner.nextLine();
        return reader;
            
    }
}
