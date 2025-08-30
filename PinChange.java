
package bank.management.system;

import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PinChange extends JFrame implements ActionListener{
    JPasswordField pin,repin;
    JButton change,back;
    String pinnumber;
    
    PinChange(String pinnumber){
        this.pinnumber = pinnumber;
    setLayout(null);
            
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
    Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);      // to set size of our image icon
    ImageIcon i3 = new ImageIcon(i2);
    JLabel image =new JLabel(i3);
    image.setBounds(0,0,900,800); //to set the position of our label
    add(image);
    
    JLabel text = new JLabel("CHANGE YOUR PIN");  // writing text over our page
    text.setBounds(250, 260, 500, 35);   //setting locatin of our text and label size of our text
    text.setForeground(Color.WHITE);
    text.setFont(new Font("system",Font.BOLD,16));
    image.add(text);
    
    JLabel pintext = new JLabel("New PIN:");  // writing text over our page
    pintext.setBounds(165, 320, 500, 25);   //setting locatin of our text and label size of our text
    pintext.setForeground(Color.WHITE);
    pintext.setFont(new Font("system",Font.BOLD,16));
    image.add(pintext);
    
    pin = new JPasswordField();  // to generate a text filed in front of fathersname label
    pin.setFont(new Font("Raleway", Font.BOLD,25));  //to set the font type of the text entered in that textfield
    pin.setBounds(320, 320, 180, 25);   //to set the text ovet our page
    image.add(pin);
    
    JLabel repintext = new JLabel("RE- Enter New PIN:");  // writing text over our page
    repintext.setBounds(165, 365, 500, 35);   //setting locatin of our text and label size of our text
    repintext.setForeground(Color.WHITE);
    repintext.setFont(new Font("system",Font.BOLD,16));
    image.add(repintext);
    
    repin = new JPasswordField();  // to generate a text filed in front of fathersname label
    repin.setFont(new Font("Raleway", Font.BOLD,25));  //to set the font type of the text entered in that textfield
    repin.setBounds(320, 370, 180, 25);   //to set the text ovet our page
    image.add(repin);
    
    change = new JButton("CHANGE");  // to generate a change button
    change.setBounds(350, 425, 150, 25);   //to set the text ovet our page
    change.addActionListener(this);
    image.add(change); 
    
    back = new JButton("BACK");  // to generate a change button
    back.setBounds(350, 465, 150, 25);   //to set the text ovet our page
    back.addActionListener(this);
    image.add(back);
    
    setSize(900,900);          //to set the size of the page
    setLocation(300,0);       // to set the location of that page
    setUndecorated(true);
    setVisible(true);  
    
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== change){     // to change the pinnumber
        try{
           String npin = pin.getText();    // to retrive the new pin entered by the user
           String rpin = repin.getText();  // to retrive the repin entered by the user
           
           if(!npin.equals (rpin)){    // to compare both field are matching or not
             JOptionPane.showMessageDialog(null,"Entered pin Does Not Match"); 
             return;
           }
           if(npin.equals ("")){    // to compare both field are matching or not
             JOptionPane.showMessageDialog(null,"Please Enter PIN"); 
             return;
           }
           if(rpin.equals ("")){    // to compare both field are matching or not
             JOptionPane.showMessageDialog(null,"Please Enter PIN"); 
             return;
           }
           
           Conn conn = new Conn();
           String query1 = "update bank set pin ='"+rpin+"' where pin ='"+pinnumber+"'";
           String query2 = "update login set pin ='"+rpin+"' where pin ='"+pinnumber+"'";
           String query3 = "update signupthree set pin ='"+rpin+"' where pin ='"+pinnumber+"'";
           
           conn.s.executeUpdate(query1);
           conn.s.executeUpdate(query2);
           conn.s.executeUpdate(query3);
           
           JOptionPane.showMessageDialog(null,"PIN Changed Successfully"); 
           
        setVisible(false);
        new Transactions(rpin).setVisible(true); 
           
        }catch(Exception e){
            System.out.println(e);
        }
      }
        
            else{
               setVisible(false);
               new Transactions(pinnumber).setVisible(true); 
           }
        
    }
    
    public static void main(String args[]){
     new PinChange("").setVisible(true);
  }
}
