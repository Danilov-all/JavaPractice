package ru.mirea.practice6;

import java.util.Scanner;

public class MainPractice6 {
    public static void main(String[] args) {
        ////////// Task 3 //////////
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;
        for (int a: arr1) {
            sum += a;
        }
        System.out.println("Число суммы массива = " + sum);
        ////////// Task 4 //////////
        for (String a : args) {
            System.out.println(a);
        }
        ////////// Task 5 //////////
        System.out.println("Гармонический ряд: ");
        for (int i=1; i<=10; i++) {
            System.out.printf("%.3f  ", 1.0 / i);
            System.out.println();
        }
        ////////// Task 6 //////////
        int[] arr = new int[10];
        int x;
        for (int i=0; i<10; i++) {
            arr[i] = ((int) (Math.random() * 1000));
        }
        System.out.println("Исходный массив: ");
        for (int a: arr) {
            System.out.println(a + " ");
        }
        for (int i=0; i<10; i++) {
            for (int k=i+1; k<10; k++) {
                if (arr[i] > arr[k]) {
                    x = arr[i];
                    arr[i] = arr[k];
                    arr[k] = x;
                }
            }
        }
        System.out.println("\n"+"Отсортированный массив: ");
        for (int a: arr) {
            System.out.println(a+" ");
        }
        ////////// Task 7 //////////
        System.out.println("Факториал числа 9 = " + fact(9));
    }
    static long fact(int x) {
        long fact = 1;
        for (int i = 1; i <= x; i++)
            fact *= i;
        return fact;
    }
}
