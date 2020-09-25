package ru.mirea.practice6;

public class MovableRectangle extends Rectangle implements Movable {
    public MovableRectangle(Point x, Point y) {
        super(x, y);
    }

    public void move(int x, int y) {
        try {
            ((PointMovable)getX()).move(1, 1);
            ((PointMovable)getY()).move(1, 1);
        }
        catch (Exception e) {
            getX().x += x;
            getX().x += x;
            getY().y += y;
            getY().y += y;

        }
    }
}