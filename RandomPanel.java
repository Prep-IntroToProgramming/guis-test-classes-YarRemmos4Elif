import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class RandomPanel extends JPanel{
   @Override
    public void paintComponent(Graphics g){
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        int red = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        Color randomColor = new Color(red, green, blue);
        g.setColor(randomColor);
        g.fillOval(0, 0, 10, 100);
    }
}
