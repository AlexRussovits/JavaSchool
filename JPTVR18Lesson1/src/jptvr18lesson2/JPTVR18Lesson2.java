/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr18lesson2;

/**
 *
 * @author pupil
 */
public class JPTVR18Lesson2 {
        public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите задачу:");
        System.out.println("1. Массив");
        System.out.println("Введите номер задачи: ");
        int numberTask = scanner.nextInt();
        switch (numberTask) {
            case 1:    
                Array_Task array_task = new Array_Task();
                Array_Task.Array_Task();
                break;
        
        }

    }

    
}
