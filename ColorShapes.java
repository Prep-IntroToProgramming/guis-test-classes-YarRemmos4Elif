import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class ColorShapes extends JPanel{
    int xPosition;
    int yPosition;
    @Override
    public void paintComponent(Graphics g){
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        int red = 0;
        int blue = 0;
        int green = 255;
        Color gColor = new Color(red, green, blue);
        g.setColor(gColor);
        g.fillOval(xPosition+1, yPosition+1, 100, 100);
        

    }

    public static void main(){
        
        JFrame f = new JFrame();
        ColorShapes i = new ColorShapes();
        f.add(i);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300, 300);
        f.setVisible(true);
        while(true){
            i.xPosition++;
            i.yPosition++;
            f.repaint();
        }
    }
}

