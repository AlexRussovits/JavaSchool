/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Task2 {
    public void alphabet(){
        Scanner scanner = new Scanner(System.in);
        String text = "Съешь ещё этих французских булок и галет, да выпей же чаю с молоком, как и я";
        text = text.replaceAll("\\scanner+", "");//Метод replaceAll() используется для того, чтобы заменить все вхождения подстроки по регулярному выражению.
                                                 // Если упростить, то в первом параметре вы определяете что нужно заменить вторым параметром. 
                                                 //При этом в первом параметре может быть как строка, так и регулярное выражение.
        text = text.toLowerCase();
        char[] wordsChars = text.toCharArray(); // Метод toCharArray() создает из строки массив чаров 
        
        System.out.println("Введите фразу: ");
        String phrase = scanner.nextLine();
        text = phrase.replaceAll("\\scanner+", "");
        text = phrase.toLowerCase();
        char [] charUser = phrase.toCharArray();
        HashSet hashSet = new HashSet();
        for(int i = 0;i < charUser.length;i++) {
            hashSet.add(charUser[i]);
        }
        int a = hashSet.size();
        if(a==33){
            System.out.println("Все 33 буквы");
        }else{
            System.out.println("Не весь алфавит собран");
        }
    }
}
