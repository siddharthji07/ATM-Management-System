
package bank.management.system;
import javax.swing.*; // to made frame we take help of swing package
import java.awt.*; // to import image icons we use this package
import java.sql.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Login extends JFrame implements ActionListener{  // here we did inheritance of Jfarme from login class & here we used actionlistner for when we put any value and click signin or signup it will perform some action
    
 JButton login, clear ,signup;  // globally define to all these buttons
 JTextField cardTextField; // globally define to both the textfiel
 JPasswordField PINTextField; // to hide our pin when it entered globally define as password
    
 Login(){   // this is our constructor
         
 setTitle("AUTOMATED TAILER MACHINE"); 
 setLayout(null); // to get our customize layout of our icon
 
 ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));  // to set image over our frame 
 Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);      // to set size of our image icon
 ImageIcon i3 = new ImageIcon(i2);
 JLabel label =new JLabel(i3);
 label.setBounds(70,10,100,100); //to set the position of our label
 add (label);
 
 JLabel text = new JLabel("Welcome to ATM"); // writing text over our page
 text.setFont(new Font("Osward",Font.BOLD,38));// seting font style of our text
 text.setBounds(200, 40, 400, 40);   //setting locatin of our text and label size of our text
 add(text);
 
 JLabel cardno = new JLabel("Card No:"); // writing card no. text over our page
 cardno.setFont(new Font("raleway",Font.BOLD,32));// seting font style of our card no. text
 cardno.setBounds(120, 150, 150, 40);   //setting locatin of our card no. text and label size of our text
 add(cardno);
 
 JLabel PIN = new JLabel("PIN:"); // writing pin text over our page
 PIN.setFont(new Font("raleway",Font.BOLD,32));// seting font style of our pin text
 PIN.setBounds(120, 220, 250, 30);   //setting locatin of our text and label size of our pintext
 add(PIN);
 
 cardTextField = new JTextField();// to create entries text box in which user can input their card no.
 cardTextField.setBounds(300, 150, 230, 30);
 cardTextField.setFont(new Font("Arial",Font.BOLD,16)); // to set the font size of text and font type which we entering
 add (cardTextField);
 
 PINTextField = new JPasswordField();// to create entries text box in which user can input their pin no.
 PINTextField.setBounds(300, 220, 230, 30);
 PINTextField.setFont(new Font("Arial",Font.BOLD,20));  //to set the font size of text and font type which we entering
 add (PINTextField);
 
 login = new JButton("SIGN IN"); // to make sigin button
 login.setBounds(300, 300, 100, 30);     //size of the sigin button
 login.setBackground(Color.BLACK);       //background color of the button
 login.setForeground(Color.WHITE);        //front color of the button
 login.addActionListener(this);        //to catch the event of buttons it tells that there is a click on that button
 add(login);
 
 clear = new JButton("CLEAR"); // to make clear button
 clear.setBounds(430, 300, 100, 30);     //size of the clear button
 clear.setBackground(Color.BLACK);       //background color of the clear button
 clear.setForeground(Color.WHITE);      //front color of the clear button
 clear.addActionListener(this);       //to catch the event of buttons it tells that there is a click on that button
 add(clear);
 
 signup = new JButton("SIGNUP"); // to make signup button
 signup.setBounds(300, 350, 230, 30);     //size of the signup button
 signup.setBackground(Color.BLACK);       //background color of the signup button
 signup.setForeground(Color.WHITE);        //front color of the signup button
 signup.addActionListener(this);         //to catch the event of buttons it tells that there is a click on that button
 add(signup);
 
 getContentPane().setBackground(Color.WHITE); // To set background color of our image icon
 
 setSize(800, 480); // to set size of our frame
 setVisible(true);  // to get visible to our frame
 setLocation(350,200);
}
    @Override
    public void actionPerformed(ActionEvent ae){  // abstarct method overrididng of Actionlistner
        if(ae.getSource()== clear){
            cardTextField.setText(""); // to set the action performed after clicking the clear button all card  text inside get clear
            PINTextField.setText("");  // to set the action performed after clicking the clear button all pin text inside get clear
        }
        else if(ae.getSource() == login){
         Conn conn =  new Conn();
         
         String cardnumber = cardTextField.getText();
         String pin = PINTextField.getText();

         String query = "select * from login where cardnumber = '"+cardnumber+"' and pin ='"+pin+"'";

         try{
            ResultSet rs = conn.s.executeQuery(query);
            if(rs.next()){
                setVisible(false);
                new Transactions().setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null, " Incorrect Cardnumber or PIN");
            }
         }catch(Exception e){
            System.out.println(e);
         }
      }
        else if(ae.getSource()== signup){
            setVisible(false);
            new SignupOne().setVisible(true); // Fix: Added () to create an instance
        }
    }
            
    public static void main(String arg[]){
        new Login();
    }
}  
