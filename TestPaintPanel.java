import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class TestPaintPanel{
   public static void main(){
       JFrame f = new JFrame();
       PaintedPanel i = new PaintedPanel();
       f.add(i);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f.setSize(300, 300);
       f.setVisible(true);
    }
}
