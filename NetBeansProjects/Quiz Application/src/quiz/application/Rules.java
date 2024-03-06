
package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {
    
    String name;
    JButton start, back;
    
    Rules(String name){
        
          this.name = name;
        getContentPane() .setBackground(new Color(240, 234, 214));
          setLayout(null);
        
        JLabel heading = new JLabel("WELCOME TO OUR QUIZAREA RULES");
        heading.setBounds(50, 20, 700, 45);
        heading.setFont ( new Font("Inter" , Font.BOLD, 20));
        heading.setForeground(new Color( 0, 99, 124));
        add(heading);
        
        
         JLabel rules = new JLabel();
         rules.setBounds(20, 90, 700, 450);
        rules.setFont ( new Font("Inter" , Font.PLAIN, 16));
        rules.setForeground(Color.BLACK);
        rules.setText(
        "<html>"+ 
                "1. Users must sign in to participate in the Quiz." + "<br><br>" +
                "2. Quizzes will consist of multiple-choice questions.\n" +
                "Each question will have four answer options." + "<br><br>" +
                "3. Users have a maximum of 20 seconds to answer each question." + "<br><br>" +
                "4. Users can attempt each question only once." + "<br><br>" +
                "5. Correct answers earn users 10 point.\n"+
                "Incorrect answers do not subtract points." + "<br><br>" +
                "6. Quizzes are for fun, with no physical or monetary prizes." + "<br><br>" +
                "7. Cheating or using external resources is not allowed." + "<br><br>" +
                "8. User data is protected and not shared with third parties." + "<br><br>" +
                "9. The app is designed to be accessible to all users, including those with disabilities." + "<br><br>" +
                "10. Have fun and enjoy the quiz experience." + "<br><br>" +
            "<html>"
        );
        add(rules);
        
         back = new JButton("Back");
        back.setBounds(230, 550, 150, 40);
        back.setFont(new Font("Inter", Font.PLAIN, 18));
        back.setForeground(Color.BLACK);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(450, 550, 150, 40);
        start.setFont(new Font("Inter", Font.PLAIN, 18));
        start.setForeground(Color.BLACK);
        start.addActionListener(this);
        add(start);
        
        
        setSize(800,700);
        setLocation(250,100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == start){
            setVisible(false);
            new Quiz(name);
        }
        else{
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
        new Rules("User");
    }
    
}
