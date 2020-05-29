package PurpleSteps3D;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

 class PurpleSteps3d {
    public static void mainDraw(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/assets/r4.png]
        int xKordinata = 2;
        int yKordinata = 2;
        int meret = 2;
        int ismetles = 6;
        int novekedes = 2;
        for (int i = 0; i <ismetles ; i++) {
            graphics.setColor(new Color(168,52,235));
            graphics.fillRect(xKordinata* ((int)Math.pow(novekedes,i)),yKordinata*((int)Math.pow(novekedes,i)),meret*((int)Math.pow(novekedes,i)),meret*((int)Math.pow(novekedes,i)));
            graphics.setColor(Color.BLACK);
            graphics.drawRect(xKordinata* ((int)Math.pow(novekedes,i)),yKordinata*((int)Math.pow(novekedes,i)),meret*((int)Math.pow(novekedes,i)),meret*((int)Math.pow(novekedes,i)));

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