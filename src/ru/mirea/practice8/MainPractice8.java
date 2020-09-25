package ru.mirea.practice8;

import java.util.Scanner;

public class MainPractice8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        FurnitureShop shop = new FurnitureShop();
        System.out.println("Здравствуйте! Что бы хотели купить? 1 - bed(кровать) 2 - cabinet(шкаф) 3 - все вместе");
        int x = in.nextInt();
        switch (x){
            case(1):
                shop.add_furniture(new bed(150, "birch wood"));
                shop.display();
                break;
            case(2):
                shop.add_furniture(new cabinet(90, "dark wood"));
                shop.display();
                break;
            case(3):
                shop.add_furniture(new bed(150, "birch wood"));
                shop.add_furniture(new cabinet(90, "dark wood"));
                shop.display();
                break;
        }
    }
}
