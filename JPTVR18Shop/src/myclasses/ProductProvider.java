/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import entity.Product;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class ProductProvider {
    public Product createProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добавление товара");
        System.out.println("Название товара: ");
        String name = scanner.nextLine();
        System.out.println("Цена товара: ");
        int price = scanner.nextInt();
        scanner.nextLine();                  
        Product product = new Product(name,price);        
        return product;
        
    }
}
