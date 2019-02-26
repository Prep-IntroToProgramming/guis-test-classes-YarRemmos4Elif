import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ColorShapes extends JPanel{
    int xPosition;
    int yPosition;
    Timer newTimer = new Timer(17, new TimerListener());

    @Override
    public void paintComponent(Graphics g){
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        int red = 0;
        int blue = 0;
        int green = 255;
        Color gColor = new Color(red, green, blue);
        g.setColor(gColor);
        g.fillOval(xPosition, yPosition, 100, 100);

    }

    public static void main(){

        JFrame f = new JFrame();
        ColorShapes i = new ColorShapes();
        i.newTimer.start();
        f.add(i);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300, 300);
        f.setVisible(true);

        //while(true){
        // i.xPosition++;
        // i.yPosition++;
        //f.repaint();
        //}
    }
    class TimerListener implements ActionListener{//Make a variable that can be either 1 or -1
        @Override
        public void actionPerformed(ActionEvent event){
            int direction;
            xPosition++;
            yPosition++;
            ColorShapes.this.repaint();
            /*if(xPosition>f.getSize()){
                xPosition--;
            } else if(xPosition==0){
                xPosition++;
            } 
            if(yPosition==300){
                yPosition--;

            } else if(yPosition==0){
                yPosition++;
            }*/
        }
    }
}

