package ru.mirea.practice3.human;

public class Leg {
    String legOrientation; // левая или правая нога

    public Leg(String legOrientation) {
        this.legOrientation = legOrientation;
    }

    @Override
    public String toString() {
        return "Leg{" +
                "legOrientation='" + legOrientation + '\'' +
                '}';
    }
}
