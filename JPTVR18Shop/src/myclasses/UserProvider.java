/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import entity.User;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class UserProvider {
    public User createUser () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Создание пользователя");
        System.out.println("Имя: ");
        String fname = scanner.nextLine();
        System.out.println("Фамилия: ");
        String lname = scanner.nextLine();
        System.out.println("Адрес: ");
        String address = scanner.nextLine();
        System.out.println("Э-майл");
        String Email = scanner.nextLine();
        System.out.println("Телефон");
        String phone = scanner.nextLine();
        return null;
    }
}
