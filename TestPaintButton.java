import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class TestPaintButton{
    public static void main(){
       JFrame f = new JFrame();
       PaintedButton i = new PaintedButton();
       f.add(i);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f.setSize(300, 300);
       f.setVisible(true);
    }
}
