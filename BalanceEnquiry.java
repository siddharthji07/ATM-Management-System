
package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.sql.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class BalanceEnquiry extends JFrame implements ActionListener {
    
    String pinnumber;
    JButton back;
    BalanceEnquiry(String pinnumber){
       this.pinnumber = pinnumber;
        setLayout(null);
    
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
    Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);      // to set size of our image icon
    ImageIcon i3 = new ImageIcon(i2);
    JLabel image =new JLabel(i3);
    image.setBounds(0,0,900,800); //to set the position of our label
    add(image);
    
    back = new JButton("BACK");  // to generate a change button
    back.setBounds(355, 470, 150, 30);   //to set the text ovet our page
    back.addActionListener(this);
    image.add(back); 
    
    Conn c = new Conn ();
    int balance = 0;
    try{
           ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");    
           
        while (rs.next()) {
        if (rs.getString("type").equals("Deposit")) {
            balance += Integer.parseInt(rs.getString("amount")); // to increase the balance when a person deposit some amount of money
        } else {
            balance -= Integer.parseInt(rs.getString("amount")); // to decrease the balance when a person withdrawl some amount of money
        }
    } 
       }catch(Exception e){
          System.out.println();
      }
    
    JLabel text = new JLabel("Your Current Account Balnce is: "+balance);  // writing text over our page
    text.setBounds(170, 280, 400, 30);   //setting locatin of our text and label size of our text
    text.setForeground(Color.WHITE);
    text.setFont(new Font("system",Font.BOLD,16));
    image.add(text);
    
    setSize(900,800);          //to set the size of the page
    setLocation(300,0);       // to set the location of that page
    setUndecorated(true);
    setVisible(true); 
    
    }
     public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Transactions(pinnumber).setVisible(true); 
     }
    
     public static void main(String args[]){
         
    new BalanceEnquiry("");
  }
     
}
