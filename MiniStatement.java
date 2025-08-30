
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class MiniStatement extends JFrame {
    
    MiniStatement(String pinnumber){
    
    setTitle("Mini Statement");
    
    setLayout(null);
    
    JLabel mini = new JLabel();
    add(mini);
    
    JLabel bank = new JLabel("Indian Bank");  // writing text over our page
    bank.setBounds(150, 20, 100, 20);   //setting locatin of our text and label size of our text
    add(bank);
    
    JLabel card = new JLabel();  // writing text over our page
    card.setBounds(20, 80, 300, 20);   //setting locatin of our text and label size of our text
    add(card);
    
    JLabel balance = new JLabel();  // writing text over our page
    balance.setBounds(20, 80, 300, 20);   //setting locatin of our text and label size of our text
    add(balance);
    
    try{
                Conn conn = new Conn();  // to establish the connection with the database to call the conn class
                
                ResultSet rs =conn.s.executeQuery("select * from login where pin ='"+pinnumber+"'"); 
                
                while(rs.next()){
                    card.setText("Card Number:" +rs.getString("cardnumber").substring(0, 4)+"XXXXXXXX" +rs.getString("cardnumber").substring(12));
                }
                
              } catch(Exception e){
                  System.out.println(e);
              }
        
    
    try{
                Conn conn = new Conn();  // to establish the connection with the database to call the conn class
                int bal = 0;
                ResultSet rs =conn.s.executeQuery("select * from login where pin ='"+pinnumber+"'"); 
                
                while(rs.next()){
                   mini.setText(mini.getText() + "<html>" + rs.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type" +"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" +rs.getString("amount") + "<br><br><html>" ));
                   
              if (rs.getString("type").equals("Deposit")) {
               bal += Integer.parseInt(rs.getString("amount")); // to increase the balance when a person deposit some amount of money
             } else {
               bal -= Integer.parseInt(rs.getString("amount")); // to decrease the balance when a person withdrawl some amount of money
           }
                }
                
                 balance.setText("Your current account balance is rs" +bal);
                
              } catch(Exception e){
                  System.out.println(e);
              }
     
             mini.setBounds (20,140,400,200);
    
    setSize(400,600);          //to set the size of the page
    setLocation(20,20);       // to set the location of that page
    setVisible(true);  
    }
    
    public static void main(String args[]){
     new MiniStatement("");
  }
}
