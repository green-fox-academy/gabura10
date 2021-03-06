package PositionSquare;
import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PositionSquare {
    public static void  drawRectangle (Integer x, Integer y, Graphics graphics){
        int hosszusag = 50;
        graphics.drawRect(x,y,hosszusag,hosszusag);
    }

    public static void mainDraw(Graphics graphics){
        // create a function that draws one square and takes 3 parameters:
        // the x and y coordinates of the square's top left corner and the graphics
        // and draws a 50x50 square from that point.
        // draw 3 squares with that function.
        // avoid code duplication.
        Random random = new Random();
        int ismetlesSzam = 3;
        int xKordinata = 10;
        int yKordinata = 10;
        int tavolsag = 10;
        for (int i = 1; i < ismetlesSzam+1; i++) {
            drawRectangle(xKordinata+tavolsag*i, yKordinata+tavolsag*i,graphics);
        }




    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }

}