package ru.mirea.practice7;

public class Silky extends Dog{

    String name;
    double  height;

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void displayHeight() {
        System.out.println(height);
    }
}
