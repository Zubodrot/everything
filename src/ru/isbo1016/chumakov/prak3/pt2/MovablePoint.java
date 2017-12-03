package ru.isbo1016.chumakov.prak3.pt2;

public class MovablePoint implements Movable{
    protected int x,y, xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "Location is " + x + ";" + y + " Speed is " + xSpeed + ";" + ySpeed;
    }

    @Override
    public void moveUp() {
        y = y + ySpeed;
    }

    @Override
    public void moveDown() {
        y = y- ySpeed;
    }

    @Override
    public void moveRight() {
        x = x + xSpeed;
    }

    @Override
    public void moveLeft() {
        x = x - xSpeed;
    }
}
