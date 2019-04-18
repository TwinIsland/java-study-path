package homework;

import javax.swing.*;
import java.awt.*;

public class draw {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel(){
            @Override
            public void paint(Graphics graphics) {
                super.paint(graphics);
                Font font_style = new Font("Time New Roma",Font.ITALIC,10);
                graphics.setFont(font_style);

                graphics.drawString("By Wyatt",10,20);
                graphics.setColor(Color.green);
                graphics.fillOval(0,200,400,200);
                graphics.setColor(Color.yellow);
                graphics.fillOval(200,20,100,100);
                graphics.setColor(Color.red);
                graphics.fillOval(210,30,80,80);
                graphics.setColor(Color.black);

                graphics.drawOval(100, 70, 30, 30);
                graphics.drawRect(105, 100, 20, 30);
                graphics.drawLine(105, 100, 75, 120);
                graphics.drawLine(125, 100, 150, 120);
                graphics.drawLine(105, 130, 75, 150);
                graphics.drawLine(125, 130, 150, 150);
            }

        };
        frame.add(panel);
        frame.setVisible(true);
        frame.setSize(300,300);

    }

}

