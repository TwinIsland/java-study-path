package classwork;

import java.awt.*;
import java.applet.*;

public class graph extends Applet {

    public void paint(Graphics g) {
        int a = 1;
        g.setColor(Color.darkGray);
        for (int b=0;b<150;b++){
            a ++;
            g.drawRect(a,a,a,a);
        }
    }
}