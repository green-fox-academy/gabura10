package FunctionToCenter;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void  drawLine (Integer x, Integer y, Graphics graphics){
        int middle = 160;
        graphics.drawLine(x,y,middle,middle);
    }
    public static void mainDraw(Graphics graphics) {
        // Create a function that draws a single line and takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.
        int valtozo = 20;
        int xKordianata = 0;
        int yKordinata = 0;
        int ismetles = WIDTH/valtozo;
        int bottom = 320;
        for (int i = 0; i <ismetles ; i++) {
            drawLine(xKordianata+i*valtozo,yKordinata,graphics);
            drawLine(xKordianata,yKordinata+i*valtozo,graphics);
            drawLine(bottom,xKordianata+i*valtozo,graphics);
           drawLine(xKordianata+i*valtozo,bottom,graphics);

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