
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SignupThree extends JFrame implements ActionListener {
    
    JRadioButton r1,r2,r3,r4;  //radio buttons declaration
    JCheckBox c1,c2,c3,c4,c5,c6,c7;   //checkboxes declaration
    JButton submit, cancel;
    String formno;
    
    SignupThree(String formno){
        this.formno= formno;
         setLayout (null);
        
        JLabel l1 = new JLabel("Page 3 : Account Details");  // to set the perosnal details label
        l1.setFont(new Font("Raleway", Font.BOLD,22));
        l1.setBounds(280, 40, 400, 40);
        add(l1 );
        
        JLabel type = new JLabel("Account Type:");  // to set the perosnal details label
        type.setFont(new Font("Raleway", Font.BOLD,22));
        type.setBounds(100, 140, 250, 35);
        add(type);
        
        r1 = new JRadioButton("Saving Account");   // for male radio buuton creation to select gender
        r1.setFont(new Font("Raleway", Font.BOLD,16));
        r1.setBounds(100, 190, 150, 20);
        r1.setBackground(Color.WHITE);
        add(r1);
        
        r2 = new JRadioButton("Fixed Deposit Account");   // for male radio buuton creation to select gender
        r2.setFont(new Font("Raleway", Font.BOLD,16));
        r2.setBounds(350, 190, 250, 20);
        r2.setBackground(Color.WHITE);
        add(r2);
        
        r3 = new JRadioButton("Current Account");   // for current account radio buuton creation to select gender
        r3.setFont(new Font("Raleway", Font.BOLD,16));
        r3.setBounds(100, 230, 200, 20);
        r3.setBackground(Color.WHITE);
        add(r3);
        
        r4 = new JRadioButton("Reccuring Deposit Account");   // for male radio buuton creation to select gender
        r4.setFont(new Font("Raleway", Font.BOLD,16));
        r4.setBounds(350, 230, 250, 20);
        r4.setBackground(Color.WHITE);
        add(r4);
        
        ButtonGroup groupaccount = new ButtonGroup();   // for select only one button at a time
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);
        
        JLabel card = new JLabel("Card Number:");  // to set the perosnal details label
        card.setFont(new Font("Raleway", Font.BOLD,22));
        card.setBounds(100, 300, 200, 30);
        add(card);
        
        JLabel carddetail = new JLabel("Your 16 Digit CardNumber");  // to set the perosnal details label
        carddetail.setFont(new Font("Raleway", Font.BOLD,12));
        carddetail.setBounds(100, 330, 300, 20);
        add(carddetail);
        
        JLabel number = new JLabel("XXXX-XXXX-XXXX-4184");  // to set the perosnal details label
        number.setFont(new Font("Raleway", Font.BOLD,22));
        number.setBounds(330, 300, 300, 30);
        add(number);
        
        JLabel pin = new JLabel("PIN:");  // to set the perosnal details label
        pin.setFont(new Font("Raleway", Font.BOLD,22));
        pin.setBounds(100, 370, 200, 30);
        add(pin);
        
        JLabel pindetail = new JLabel("Your 4 Digit PinNumber");  // to set the perosnal details label
        pindetail.setFont(new Font("Raleway", Font.BOLD,12));
        pindetail.setBounds(100, 400, 300, 20);
        add(pindetail);
        
        JLabel pinnumber = new JLabel("XXXX");  // to set the perosnal details label
        pinnumber.setFont(new Font("Raleway", Font.BOLD,22));
        pinnumber.setBounds(330, 370, 300, 30);
        add(pinnumber);
        
        JLabel services = new JLabel("Services Required:");  // to set the perosnal details label
        services.setFont(new Font("Raleway", Font.BOLD,22));
        services.setBounds(100, 450, 200, 30);
        add(services);
        
        c1 = new JCheckBox("ATM CARD");   // for male radio buuton creation to select gender
        c1.setFont(new Font("Raleway", Font.BOLD,16));
        c1.setBounds(100, 500, 200, 30);
        c1.setBackground(Color.WHITE);
        add(c1);
        
        c2 = new JCheckBox("Internet Banking");   // for male radio buuton creation to select gender
        c2.setFont(new Font("Raleway", Font.BOLD,16));
        c2.setBounds(350, 500, 200, 30);
        c2.setBackground(Color.WHITE);
        add(c2);
        
        c3 = new JCheckBox("M0bile Banking");   // for male radio buuton creation to select gender
        c3.setFont(new Font("Raleway", Font.BOLD,16));
        c3.setBounds(100, 550, 200, 30);
        c3.setBackground(Color.WHITE);
        add(c3);
        
        c4 = new JCheckBox("Email & SMS Alert");   // for male radio buuton creation to select gender
        c4.setFont(new Font("Raleway", Font.BOLD,16));
        c4.setBounds(350, 550, 200, 30);
        c4.setBackground(Color.WHITE);
        add(c4);
        
        c5 = new JCheckBox("Cheque Book");   // for male radio buuton creation to select gender
        c5.setFont(new Font("Raleway", Font.BOLD,16));
        c5.setBounds(100, 600, 200, 30);
        c5.setBackground(Color.WHITE);
        add(c5);
        
        c6 = new JCheckBox("E-statement");   // for male radio buuton creation to select gender
        c6.setFont(new Font("Raleway", Font.BOLD,16));
        c6.setBounds(350, 600, 200, 30);
        c6.setBackground(Color.WHITE);
        add(c6);
        
        c7 = new JCheckBox("I here by Declares thet the above entered details are correct to the best of my knowledge");   // for male radio buuton creation to select gender
        c7.setFont(new Font("Raleway", Font.BOLD,12));
        c7.setBounds(100, 680, 600, 30);
        c7.setBackground(Color.WHITE);
        add(c7);
        
        submit = new JButton("Submit");    // to add the cancel button in our page
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.setBounds(250, 720, 100, 30);
        submit.addActionListener(this);
        add(submit);
        
        cancel = new JButton("Cancel");    // to add the cancel button in our page
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBounds(420, 720, 100, 30);
        cancel.addActionListener(this);
        add(cancel);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);          //to set the size of the page
        setLocation(350,0);       // to set the location of that page
        setVisible(true);  
       
   }
   
   public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit) {
           String accountType = null;
           
            if(r1.isSelected()){
               accountType = "Saving Account";
           }
           else if(r2.isSelected()){
               accountType = "Fixed Deposit Account";
           }
           else if(r3.isSelected()){
               accountType = "Current Account";
           }
            else if(r4.isSelected()){
               accountType = "Reccuring Deposit Account";
           }
            
            Random random = new Random();
            String cardnumber = ""+ Math.abs(random.nextLong()%90000000L)+ 5040936000000000L;
            String pinnumber = ""+ Math.abs(random.nextLong()%9000L);
            
            String facility = "";
            
            if(c1.isSelected()){
                facility = facility + "ATM Card"; 
            }
            else if(c2.isSelected()){
                facility = facility + "Internet Banking"; 
            }
             else if(c3.isSelected()){
                facility = facility + "Mobile Banking"; 
            }
             else if(c4.isSelected()){
                facility = facility + "Email & SMS Alert"; 
            }
            else if(c5.isSelected()){
                facility = facility + "Cheque Book"; 
            }
            else if(c6.isSelected()){
                facility = facility + "E-statement"; 
            }
            
            try{
                if (accountType == null || accountType.equals("")) {
                JOptionPane.showMessageDialog(null, "Account type is Required");
            }
                else{
                    Conn c = new Conn();
            
            String query1 = "insert into signupthree values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";

            
            String query2 = " insert into login values('" + formno + "', '" + cardnumber + "', '" + pinnumber + "',)";
                   c.s.executeUpdate(query1);
                   c.s.executeUpdate(query2);
                   
                   JOptionPane.showMessageDialog(null, "Card Number: " + cardnumber + "\nPin: " + pinnumber);
                   
                   setVisible(false);
                   new Deposit(pinnumber).setVisible(false);  // to open the deposit page just clicking on submit button
                
                }
            }catch(Exception e){
                System.out.println(e);
            }
        } 
        else if (ae.getSource() == cancel) {
            setVisible(false);
            new Login().setVisible(true);  // to open the login page if someone click on cancel at signup three page
                
        }
    }

    
public static void main(String args[]) {
        new SignupThree("");
    }
}