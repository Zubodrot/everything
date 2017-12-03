package ru.isbo1016.chumakov.prak3.pt2;

public class MovableCircle implements Movable {
    private int radius;

    private MovablePoint center = new MovablePoint(0,0,0,0);

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center.x = x;
        this.center.y = y;
        this.center.ySpeed = ySpeed;
        this.center.xSpeed = xSpeed;
        this.radius = radius;
    }

    @Override
    public String toString()
    {
        return "Location of circle " + this.center.x + "; " + this.center.y + " Speed is " + center.xSpeed + ";" + center.ySpeed + ", Radius is " + radius;
    }

    public void moveUp() {
        center.y = center.y + center.ySpeed;
    }

    public void moveDown() {
        center.y = center.y - center.ySpeed;
    }

    public void moveRight() {
        center.x = center.x + center.xSpeed;
    }

    public void moveLeft() {
        center.x = center.x - center.xSpeed;
    }
}

