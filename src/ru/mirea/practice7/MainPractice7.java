package ru.mirea.practice7;

public class MainPractice7 {
    public static void main(String[] args){
        Dish plate = new Plate(1,10);

        Dish pan = new Pan(20,100);

        plate.calcVolume();
        ((Pan)pan).makeBorsh();

    }
}
