package ru.mirea.practice5;

public class CircleMovable extends Circle implements Movable {

    public CircleMovable(Point center, double radius) {
        super(center, radius);
    }

    @Override
    public void move(int x, int y) {
        ((PointMovable)getCenter()).move(9,4);
    }
}