
package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    
    JButton rules, exit ;
    JTextField tfname, tfage, tfmail, tfedu;
    Login(){
        
        getContentPane() .setBackground(new Color(240, 234, 214));
        setLayout(null); 
        
        JLabel heading = new JLabel("QUIZAREA");
        heading.setBounds(80, 60, 500, 80);
        heading.setFont ( new Font("Inter" , Font.BOLD, 60));
        heading.setForeground(new Color( 0, 99, 124));
        add(heading);
        
         JLabel introd = new JLabel();
         introd.setBounds(90, 50, 400, 500);
        introd.setFont ( new Font("Inter" , Font.PLAIN, 17));
        introd.setForeground(new Color( 0, 99, 124));
        introd.setText(
        "<html>"+ 
                "Welcome to Quizarea!," + "<br><br>" +
                 " the ultimate quiz application that will test your knowledge and challenge your wits!" + "<br><br>" +
                 " Whether you're a trivia enthusiast or just looking for some brain-teasing fun," + "<br><br>" + 
                 " Quizarea has something for everyone." + "<br><br>" +
                 " Are you up for the challenge?" + "<br><br>" +
                "<html>"
           );
        add(introd);
        
        
        
        JLabel name = new JLabel(" Enter your Full Name ");
        name.setBounds(520, 120, 200, 20);
        name.setFont ( new Font("Inter" , Font.BOLD, 18));
        name.setForeground(new Color(0, 99, 124));
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(520, 150, 300, 30);
        tfname.setFont(new Font("Times New Romans", Font.PLAIN, 15));
        tfname.setForeground( Color.BLACK);
        add(tfname);
        
        
        
         JLabel age = new JLabel("Enter your Age");
        age.setBounds(520, 200, 200, 20);
        age.setFont ( new Font("Inter" , Font.BOLD, 18));
        age.setForeground(new Color(0, 99, 124));
        add(age);
        
         tfage = new JTextField();
        tfage.setBounds(520, 230, 300, 30);
        tfage.setFont(new Font("Times New Romans", Font.PLAIN, 15));
        tfage.setForeground( Color.BLACK);
        add(tfage);
        
        
        
         JLabel edu = new JLabel("Enter your Education Level");
        edu.setBounds(520, 280, 400, 20);
        edu.setFont ( new Font("Inter" , Font.BOLD, 18));
        edu.setForeground(new Color(0, 99, 124));
        add(edu);
        
         tfedu = new JTextField();
        tfedu.setBounds(520, 310, 300, 30);
        tfedu.setFont(new Font("Times New Romans", Font.PLAIN, 15));
        tfedu.setForeground( Color.BLACK);
        add(tfedu);
        
        
        
        JLabel email = new JLabel("Enter your Email");
        email.setBounds(520, 360, 200, 20);
        email.setFont ( new Font("Inter" , Font.BOLD, 18));
        email.setForeground(new Color(0, 99, 124));
        add(email);
        
         tfmail = new JTextField();
        tfmail.setBounds(520, 390, 300, 30);
        tfmail.setFont(new Font("Times New Romans", Font.PLAIN, 15));
        tfmail.setForeground( Color.BLACK);
        add(tfmail);
        
        
                
        rules = new JButton("Rules");
        rules.setBounds(490, 470, 150, 40);
        rules.setFont(new Font("Inter", Font.PLAIN, 18));
        rules.setForeground(Color.DARK_GRAY);
        rules.addActionListener(this);
        add(rules);
        
        exit = new JButton("Exit");
        exit.setBounds(715, 470, 150, 40);
        exit.setFont(new Font("Inter", Font.PLAIN, 18));
        exit.setForeground(Color.DARK_GRAY);
        exit.addActionListener(this);
        add(exit);
        
        
        
        setSize(900, 600);
        setLocation(200,100);
         setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) {
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
            }
        else if (ae.getSource() == exit) {
            setVisible(false);
            
        }
    }
    
    public static void main(String[] args)
    {
       new Login(); 
    }
}
