import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class ChallengeGui{
        JFrame newFrame = new JFrame();
        JButton button = new JButton("click me first");
        JButton button2 = new JButton("click me");
        private class Button1Listener implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent event){
                System.out.println("You chose Button 1");
            }
        }
        private class Button2Listener implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent event){
                System.out.println("You chose Button 2");
            }
        }
  
    public ChallengeGui() {
        button = new JButton("click me");
        newFrame = new JFrame();
        newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        newFrame.add(BorderLayout.NORTH,button);
        newFrame.add(BorderLayout.SOUTH, button2);
        //frame.add(label);
        
        button.addActionListener(new Button1Listener());
        button2.addActionListener(new Button2Listener());
        newFrame.setSize(300, 300);
        newFrame.setVisible(true);
    }
    
    public static void main(String[] args) {
        ChallengeGui gui = new ChallengeGui();
    }
        //public void actionPerformed(ActionEvent event) {
        
    
       
}
