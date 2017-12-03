package ru.isbo1016.chumakov.lab5;

import java.awt.*;
import java.awt.event.* ;
import javax.swing.*;
import java.math.*;

public class lab51 extends JFrame{



    public static void main(String[] args) {

        MyFrame frame=new MyFrame();
        frame.setTitle("Лабораторная №5 Чумаков Дмитрий ИСБО-10-16");
        frame.setSize(1800, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 5));
        frame.setVisible(true);



        /*JPanel pnl [] = new JPanel[20];
        for (int i = 0; i < pnl.length; i++) {
            int r = (int) (Math.random() * 255);
            int b = (int) (Math.random() * 255);
            int g = (int) (Math.random() * 255);
            pnl[i] = new JPanel();
            pnl[i].setBackground(new Color(r, g, b));
            pnl[i].setVisible(true);
            frame.add(pnl[i]);
        }*/




    }


    public static class MyFrame extends JFrame{
        public void paint(Graphics g){

            Circle [] circles = new Circle [20];
            Rectangle [] rectangles = new Rectangle [20];
            Square [] squares = new Square [20];

            for(int i = 0; i<20; i++){
                //circles[i] = new Circle();
                //circles[i].x = (int)(Math.random()*1000);
                //circles[i].y = (int)(Math.random()*1000);
                //circles[i].radius = (int)(Math.random()*1200);
                int j = (int)(Math.random()*3);
                if (j == 1){
                    circles[i] = new Circle((int)(Math.random()*1000),"RED",(int)(Math.random()*1000),(int)(Math.random()*1000));
                }
                else {
                    circles[i] = new Circle((int) (Math.random() * 1000), "GREEN", (int) (Math.random() * 1000), (int) (Math.random() * 1000));
                }
            }

            for(int i = 0; i<20; i++){
               // rectangles[i].x = (int)(Math.random()*1000);
                //rectangles[i].y = (int)(Math.random()*1000);
                //rectangles[i].width = (int)(Math.random()*1500);
                //rectangles[i].length =   (int)(Math.random()*1500);
                int j = (int)(Math.random()*3);
                if (j == 1){
                    rectangles[i] = new Rectangle("BLUE", (int)(Math.random()*1000),(int)(Math.random()*1000),(int)(Math.random()*1500),(int)(Math.random()*1500));
                }
                else rectangles[i] = new Rectangle("YELLOW", (int)(Math.random()*1000),(int)(Math.random()*1000),(int)(Math.random()*1500),(int)(Math.random()*1500));
            }

            for(int i = 0; i<20; i++){
                //squares[i].x = (int)(Math.random()*1000);
                //squares[i].y = (int)(Math.random()*1000);
                //squares[i].side = (int)(Math.random()*1500);
                int j = (int)(Math.random()*3);
                if (j == 1){
                    squares[i] = new Square((int)(Math.random()*1500), "BLACK", (int)(Math.random()*1000), (int)(Math.random()*1000));
                }
                else squares[i] = new Square((int)(Math.random()*1500), "PINK", (int)(Math.random()*1000), (int)(Math.random()*1000));
            }

            for(int i = 0; i<20; i++){
                int j = (int)(Math.random()*4);
                if (j == 1){
                    g.drawOval(circles[i].x,circles[i].y,circles[i].radius,circles[i].radius);
                    if(circles[i].color == "RED"){
                        g.setColor(Color.RED);
                    }
                    else g.setColor(Color.GREEN);
                }
                else if (j == 2){
                    g.drawRect(rectangles[i].x,rectangles[i].y, rectangles[i].width,rectangles[i].length);
                    if (rectangles[i].color == "BLUE"){
                        g.setColor(Color.BLUE);
                    }
                    else g.setColor(Color.YELLOW);
                }
                else {
                    g.drawRect(squares[i].x,squares[i].y, squares[i].side,squares[i].side);
                    if (rectangles[i].color == "BLACK"){
                        g.setColor(Color.BLACK);
                    }
                    else g.setColor(Color.PINK);
                }
            }
        }
    }

    static abstract class Shape {
        protected String color;
        protected int x;
        protected int y;

        public Shape(String color, int x, int y) {
            this.color = color;
            this.x = x;
            this.y = y;
        }

        public Shape(){
            this.color = "Red";
            this.x = 1;
            this.y = 1;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }

    static   class Rectangle extends Shape {
        protected int width;
        protected int length;

        public Rectangle(){
            super();
            width = 1;
            length = 1;
        }

        public Rectangle(String color, int x, int y, int width, int length) {
            super(color, x, y);
            this.width = width;
            this.length = length;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

    }

    static class Circle extends Shape {
        protected int radius;
        public Circle(){
            super();
            radius = 1;
        }
        public Circle(int radius){
            super();
            this.radius = radius;
        }
        public Circle(int radius, String color, int x, int y){
            this.radius = radius;
            this.color = color;
            this.x = x;
        }
        public int getRadius() {
            return radius;
        }

        public void setRadius(int radius) {
            this.radius = radius;
        }

    }

    static class Square extends Rectangle {
        protected int side;

        public Square() {
            super();
            this.side = 1;
        }

        public Square(int side) {
            super();
            this.side = side;
        }

        public Square(int side, String color, int x, int y){
            this.color = color;
            this.x = x;
            this.y =y;
            this.side = side;
        }

        public double getSide() {
            return side;
        }

        public void setSide(int side) {
            this.side = side;
        }

        public void setWidth(){
            super.setWidth(side);
        }

        public void setLength(){
            super.setLength(side);
        }

    }
}
