
package quiz.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{
    
    Score(String name, int score) {
        setBounds(300,100,650,700);
        getContentPane() .setBackground(new Color(240, 234, 214));
        setLayout(null); 
        
        
        JLabel sco = new JLabel("Your Score is : " + score );
        sco.setBounds(190, 150, 400,100);
        sco.setFont ( new Font("Inter" , Font.BOLD, 30));
        sco.setForeground(new Color( 0, 99, 124));
        add(sco);

        
        JLabel thank = new JLabel(" Thankyou " + name + " For taking the Quiz.");
        thank.setBounds(100, 500, 700, 100);
        thank.setFont ( new Font("Inter" , Font.BOLD, 25));
        thank.setForeground(new Color( 0, 99, 124));
        add(thank);
        
        JButton play = new JButton ("Play Again");
         play.setBounds(230, 300, 200, 50 );
         play.setFont(new Font("Inter", Font.PLAIN, 18));
         play.setBackground(Color.WHITE);
         play.setForeground(Color.BLACK);
         play.addActionListener(this);
         
         add(play);
        
        
        JLabel qno = new JLabel();
        qno.setBounds( 60, 60, 80, 80);
        qno.setFont(new Font("Inter", Font.PLAIN,18));
        add(qno);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }
    
    
    public static void main(String[] args)
    {
        new Score("User", 0);
    }
}
