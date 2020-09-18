package ru.mirea.practice2;

import java.util.ArrayList;

public class DogsKennel {
    private ArrayList<Dog> dogs;

    public DogsKennel() {
        this.dogs = new ArrayList<Dog>();
    }

    public void addDog(String name, int age) {
        this.dogs.add(new Dog(name, age));
    }

    public void printDogs() {
        for(Dog dog : dogs)
            System.out.println(dog.toString());
    }
}