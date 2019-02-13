import javax.swing.*;
import java.awt.*;
public class FiveButtons{ 
    public FiveButtons() {
        JFrame frame = new JFrame();
        JButton button = new JButton("click me");
        JButton cComponent = new JButton("Center");
        JButton nComponent = new JButton("North");
        JButton sComponent = new JButton("South");
        JButton eComponent = new JButton("East");
        JButton wComponent = new JButton("West");
        
        JLabel label = new JLabel("Swing is pretty cool");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(button);
        frame.add(label);
        frame.add(BorderLayout.CENTER, cComponent);
        frame.add(BorderLayout.NORTH, nComponent);
        frame.add(BorderLayout.SOUTH, sComponent);
        frame.add(BorderLayout.EAST, eComponent);
        frame.add(BorderLayout.WEST, wComponent);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        FiveButtons five = new FiveButtons();
    }
} 
