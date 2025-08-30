
package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.util.*; // to get the date clas packages

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Withdrawl extends JFrame implements ActionListener {
    
    JTextField amount;
    JButton Withdraw,back;
    String pinnumber;
    
    Withdrawl(String pinnumber){
        this.pinnumber = pinnumber;
    setLayout(null);
            
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
    Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);      // to set size of our image icon
    ImageIcon i3 = new ImageIcon(i2);
    JLabel image =new JLabel(i3);
    image.setBounds(0,0,900,800); //to set the position of our label
    add (image);
    
    JLabel text = new JLabel("Enter the Amount you want to Withdraw");  // writing text over our page
    text.setBounds(180, 260, 700, 35);   //setting locatin of our text and label size of our text
    text.setForeground(Color.WHITE);
    text.setFont(new Font("system",Font.BOLD,16));
    image.add(text);
    
    amount = new JTextField();// to create entries text box in which user can input their pin no.
    amount.setBounds(170, 330, 320, 25);
    amount.setFont(new Font("Arial",Font.BOLD,22));  //to set the font size of text and font type which we entering
    add (amount);
    
    Withdraw = new JButton("Withdrawl");
    Withdraw.setBounds(355, 420, 150, 30);
    Withdraw.addActionListener(this);
    image.add(Withdraw);
    
    back = new JButton("BACK");
    back.setBounds(355, 470, 150, 30);
    back.addActionListener(this);
    image.add(back);
    
    setSize(900,900);          //to set the size of the page
    setLocation(300,0);       // to set the location of that page
    setUndecorated(true);
    setVisible(true);  
    
    }
    
    public void actionPerformed(ActionEvent ae){
      if(ae.getSource()== Withdraw){
        String number = amount.getText();  // amount fill by the user
        Date date = new Date();    // on which date user try to deposit
        
        if (number.equals("")) { 
                JOptionPane.showMessageDialog(null, " Please Enter the Amount you want tpo Withdraw");
            } 
        else {
              try{
                Conn c = new Conn();  // to establish the connection with the database to call the conn class
               // String query = " insert into signup values('" + pinnumber + "', '" + date + "', ' Withdrawl ', '" + number+"')";
                  String query = "INSERT INTO bank (pin, date, type, amount) VALUES ('" + pinnumber + "', '" + date + "', 'Withdrawl', '" + number + "')";
      
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, " Rs" +number+ "Withdrawl Successfully");
                
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
              } catch(Exception e){
                  System.out.println(e);
              }
        }
     }
      else if(ae.getSource()== back){
         new Transactions(pinnumber).setVisible(true);
      
     }
  }
    
    public static void main(String args[]){
     new Withdrawl("");
  }
}

