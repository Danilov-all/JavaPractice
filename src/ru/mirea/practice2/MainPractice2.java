package ru.mirea.practice2;

class Shape {
    private String type;
    public Shape(String s) {
        type = s;
    }
    @Override
    public String toString() {
        return "Фигура { Тип = " + type + " }";
    }
}

class Ball {}
class Book {}

public class MainPractice2 {
    public static void main(String[] args) {
        Shape shape = new Shape("circle");
        System.out.println(shape.toString());
        Ball ball = new Ball();
        Book book = new Book();

        DogsKennel dogsKennel = new DogsKennel();
        dogsKennel.addDog("Marta", 7);
        dogsKennel.addDog("Michele", 8);
        dogsKennel.addDog("Busya", 2);
        dogsKennel.printDogs();
    }
}