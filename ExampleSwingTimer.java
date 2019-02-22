import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class ExampleSwingTimer {
    JFrame f = new JFrame();
    JLabel l = new JLabel("wassup");
    int seconds =0;
    
    Timer myTimer = new Timer(1000, new TimerListener());
    public ExampleSwingTimer(){
       
        
        //int period = 1000;
        //Timer myTimer = new Timer(period, new TimerListener());
        myTimer.start();
        f.add(l);
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(200, 200);
        f.setVisible(true);
        
    }
    public static void main(){
        ExampleSwingTimer ex = new ExampleSwingTimer();
    }
    class TimerListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event){
            seconds++;
            l.setText( seconds+" seconds");
            f.repaint();
            if(seconds==5){
                myTimer.stop();
            }
        }

    }
}
