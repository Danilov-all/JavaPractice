package ru.mirea.practice3.human;

import java.util.Arrays;

public class Human {
    Leg[] legs = {new Leg("Левая нога"), new Leg("Правая нога")};
    Head head = new Head();
    Hand[] hands = {new Hand("Левая рука"), new Hand("Правая рука")};

    @Override
    public String toString() {
        return "Human{" +
                "legs=" + Arrays.toString(legs) +
                ", head=" + head +
                ", hands=" + Arrays.toString(hands) +
                '}';
    }

    public void print(){
        System.out.println(this);
    }
}
