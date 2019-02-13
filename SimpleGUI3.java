import javax.swing.*;
import java.awt.event.*;

public class SimpleGUI3 implements ActionListener{ 
    JFrame frame;
    JButton button;
    int number=0;
    int x =300;
    JLabel label = new JLabel("Swing is pretty cool");
    public SimpleGUI3() {
        button = new JButton("click me");
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(button);
        //frame.add(label);
        
        button.addActionListener(this);
        frame.setSize(x, x);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        number++;
        button.setText("I've been clicked "+ number+" times.");
        frame.setSize(x/2,x/2);
        frame.add(label);
    }
    
    public static void main(String[] args) {
        SimpleGUI3 gui = new SimpleGUI3();
    }
} 
