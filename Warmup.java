import java.awt.*;
import javax.swing.*;
public class Warmup{
    
    public static void main(String[] args){
        JFrame f= new JFrame();
        JLabel l = new JLabel("<html><i><b><u> HELLO MY NAME IS <br> DOG</u></i></b> </html>;");
        f.add(l);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300,300);
        f.setVisible(true);
    }
}
