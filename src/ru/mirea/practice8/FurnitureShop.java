package ru.mirea.practice8;

import java.util.ArrayList;

public class FurnitureShop {
    ArrayList<furniture> arr = new ArrayList<furniture>();

    public void add_furniture(furniture x) {
        arr.add(x);
    }

    public void display() {
        for(furniture n: arr) {
            n.buy();
        }
    }
}
