import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PongBase
{
    JFrame frame = new JFrame();
    // Declare a Swing Timer that fires ~60 times per second
    Timer myTimer = new Timer(17, new TListener());
    
    PaddlePanel panel = new PaddlePanel();
    int x;
    int y;

    public void PongBase() {
        myTimer.start();
        frame.add(panel);
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x = frame.getWidth()/2;
        y = frame.getHeight() - 30;
        frame.setVisible(true);
        
        // start the timer
    }
    
    public static void main(String[] args) {
        PongBase pb = new PongBase();
    }
    class TListener implements ActionListener {
        Point position = panel.getMousePosition();
        @Override
        public void actionPerformed(ActionEvent e){
            if(panel.getMousePosition()!= null){
               // x = position.getX();
            }else{
            }

            
        }
        
        // override the necessary method.
        
        // Inside, use getMousePosition() with the appropriate Swing component.
        // Make sure that the object returned is not null
        // Set the new x value, then repaint the frame.
    }

    class PaddlePanel extends JPanel {
        @Override
        public void paintComponent(Graphics g) {
            //g.setColor(Color.BLACK);
            g.fillRect(x, y, 30, 10);
            System.out.println(x);
        }
    }
}
