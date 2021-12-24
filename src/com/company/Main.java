package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("1.Заповнити масив тільки парними числами");
        int[] array = new int[10];
        int[] array2 = {140, 14, 17, 13, 15, 28, 56,};
        int[] array3random = new int[5];
        for (var i = 0; i < array2.length; i++) {
            if (i % 2 == 0)
                System.out.println(i);

        }

        System.out.println("2.Заповнити масив рандомними числами");
        Random random = new Random();
        for (int i = 0; i < array3random.length; i++) {
            array3random[i] = random.nextInt(100);
            System.out.println(array3random[i]);

        }
        System.out.println("3.Вивести середнє значення масиву");
        int summ = 0;
        for (int i = 0; i <= array.length; i++) {
            summ = summ + i;
        }
        System.out.println(summ / 2);

        System.out.println("4.Вивести суму всіх значень кратних 3");
        int summ3 = 0;
        for (int i = 0; i < array3random.length; i++) {
            if (i % 3 == 0) {
                summ3 += i;
            }
        }
        System.out.println(summ3);

        System.out.println("5.Вивести значення всіх парних індексів масиву");
        for (int i = 0; i < array.length; i += 2) {
            System.out.println(i);
        }
        System.out.println("6.Просортувати масив в порядку зростання");
        for (int i : array2) {
            System.out.println(i);
        }
        System.out.println("7. Вивести найменше значення в масиві");
        int min = array2[0];
        for (int j : array2) {
            if (min > j) min = j;
        }
        System.out.println(min);
        System.out.println("8. Вивести найбільше значення масиву");
        int max = array2[0];
        for (int j : array2) {
            if (max < j) max = j;
        }
        System.out.println(max);

        System.out.println("9. Вивести суму значень всіх парних індексів");
        int summeven = 0;
        for(int i = 0 ;i < array2.length;i += 2){
            summeven += array2[i];

        }
        System.out.println(summeven);
        System.out.println("0. Вивести перших 20 символів з таблиці ASCI");
        char[] asci = new char[20];
        for (char i = 32; i < 52; i++) {
            System.out.print(i);
        }



    }


}

