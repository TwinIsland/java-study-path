package homework;

import javax.swing.*;
import java.awt.*;

public class draw_tree {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel(){
            @Override
            public void paint(Graphics graphics) {
                super.paint(graphics);
                graphics.drawString("by alex",10,10);
                graphics.setColor(Color.orange);
                graphics.fillRect(155,100,65,190);
                graphics.setColor(Color.red);
                graphics.fillOval(140,30,90,100);
            }

        };
        frame.add(panel);
        frame.setVisible(true);
        frame.setSize(300,300);

    }

}

