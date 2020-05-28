package ColoredBox;
import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
    public static void mainDraw(Graphics graphics) {
        // Draw a box that has different colored lines on each edge.
        int top = 10;
        int bottom = 310;
        int middle = 160;
            graphics.setColor(Color.BLACK);
            graphics.drawLine(top,top,middle,top);
            graphics.setColor(Color.RED);
            graphics.drawLine(middle,top,middle,middle);
            graphics.setColor(Color.BLUE);
            graphics.drawLine(top,top,top,middle);
            graphics.setColor(Color.GREEN);
            graphics.drawLine(top,middle,middle,middle);

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