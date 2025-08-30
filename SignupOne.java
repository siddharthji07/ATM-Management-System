
package bank.management.system;
import javax.swing.*;  //to import the JFrame class packages
import java.awt.*;     //to import the color class packages
import java.util.*;     //to import the random class packages
import com.toedter.calendar.JDateChooser; // to import calender choosing package

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SignupOne extends JFrame implements ActionListener{  // this is signup class in which JFrmame is inherited
    
    long random;  //global declaration of long
    JTextField NameTextField,fNameTextField,emailTextField,addressTextField,cityNameTextField,stateNameTextField,pinTextField; //global declaration of all text values
    JButton next; //global declaration of next
    JRadioButton male,female,others,married,unmarried,other; //global declaration of all radioButtons
    JDateChooser datechooser; //global declaration of datechooser
            
    SignupOne(){   // constructor of our signup class
        
        setLayout(null); // to customized the location of our text at head position where we want otherwise by default it came center alinged
        
        Random ran = new  Random();   //for random numbers generation
        random = Math.abs(ran.nextLong()%9000L+ 1000L);  // to set the size of that random number
        
        JLabel formNo = new JLabel("APPLICATION FORM NO: "+ random);  // to the the application number label
        formNo.setFont(new Font("Raleway", Font.BOLD,38));
        formNo.setBounds(140, 20, 600, 40);
        add(formNo);
        
        JLabel personDetails = new JLabel("page 1: personal Details");  // to set the perosnal details label
        personDetails.setFont(new Font("Raleway", Font.BOLD,22));
        personDetails.setBounds(290, 80, 400, 30);
        add(personDetails);
        
        JLabel name = new JLabel("Name:");  // to aet the name label
        name.setFont(new Font("Raleway", Font.BOLD,22));
        name.setBounds(120, 140, 100, 30);
        add(name);
        
        NameTextField = new JTextField();  // to generate a text filed in front of name label
        NameTextField.setFont(new Font("Raleway", Font.BOLD,16));  //to set the font type of the text entered in that textfield
        NameTextField.setBounds(300, 140, 400, 30);   //to set the text ovet our page
        add(NameTextField);
        
        JLabel fname = new JLabel("Father's Name:");  // to aet the Fathers name label
        fname.setFont(new Font("Raleway", Font.BOLD,22));
        fname.setBounds(120, 190, 200, 30);
        add(fname);
        
        fNameTextField = new JTextField();  // to generate a text filed in front of fathersname label
        fNameTextField.setFont(new Font("Raleway", Font.BOLD,16));  //to set the font type of the text entered in that textfield
        fNameTextField.setBounds(300, 190, 400, 30);   //to set the text ovet our page
        add(fNameTextField);
        
        
        JLabel dob = new JLabel("Date of Birth:");  // to aet the date of birth label
        dob.setFont(new Font("Raleway", Font.BOLD,22));
        dob.setBounds(120, 240, 200, 30);
        add(dob);
        
        datechooser = new JDateChooser();
        datechooser.setBounds(300, 240, 200, 30);
        add(datechooser);
        
        JLabel gender = new JLabel("Gender:");  // to aet the gender label
        gender.setFont(new Font("Raleway", Font.BOLD,22));
        gender.setBounds(120, 290, 200, 30);
        add(gender);
        
        male = new JRadioButton("Male");   // for male radio buuton creation to select gender
        male.setBounds(300, 290, 60, 30);
        male.setBackground(Color.WHITE);
        add(male);
        
        female = new JRadioButton("Female");  // for female radio buuton creation to select gender
        female.setBounds(450, 290, 120, 30);
        female.setBackground(Color.WHITE);
        add(female);
        
        others = new JRadioButton("Others");   // for others radio buuton creation to select gender
        others.setBounds(600, 290, 180, 20);
        others.setBackground(Color.WHITE);
        add(others);
        
        ButtonGroup gendergroup = new ButtonGroup();   // for select only one button at a time
        gendergroup.add(male);
        gendergroup.add(female);
        gendergroup.add(others);
       
        
        JLabel email = new JLabel("Email Address:");  // to aet the name label
        email.setFont(new Font("Raleway", Font.BOLD,22));
        email.setBounds(120, 340, 200, 30);
        add(email);
        
        emailTextField = new JTextField();  // to generate a text filed in front of email label
        emailTextField.setFont(new Font("Raleway", Font.BOLD,16));  //to set the font type of the text entered in that textfield
        emailTextField.setBounds(300, 340, 400, 30);   //to set the text ovet our page
        add(emailTextField);
        
        JLabel marital = new JLabel("Marital Status:");  // to aet the name label
        marital.setFont(new Font("Raleway", Font.BOLD,22));
        marital.setBounds(120, 390, 200, 30);
        add(marital);
        
        unmarried = new JRadioButton("Unmarried");   // for unmarried radio buuton creation to select gender
        unmarried.setBounds(300, 390, 100, 30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
        married = new JRadioButton("Married");   // for married radio buuton creation to select gender
        married.setBounds(450, 390, 100, 30);
        married.setBackground(Color.WHITE);
        add(married);
        
        other = new JRadioButton("Other");   // for others radio buuton creation to select gender
        other.setBounds(630, 390, 100, 30);
        other.setBackground(Color.WHITE);
        add(other);
        
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(unmarried);
        maritalgroup.add(married);
        maritalgroup.add(others);
        
        JLabel address = new JLabel("Address:");  // to aet the name label
        address.setFont(new Font("Raleway", Font.BOLD,22));
        address.setBounds(120, 440, 200, 30);
        add(address);
        
        addressTextField = new JTextField();  // to generate a text filed in front of name label
        addressTextField.setFont(new Font("Raleway", Font.BOLD,16));  //to set the font type of the text entered in that textfield
        addressTextField.setBounds(300, 440, 400, 30);   //to set the text ovet our page
        add(addressTextField);
        
        JLabel city = new JLabel("City:");  // to aet the name label
        city.setFont(new Font("Raleway", Font.BOLD,22));
        city.setBounds(120, 490, 200, 30);
        add(city);
        
        cityNameTextField = new JTextField();  // to generate a text filed in front of fathersname label
        cityNameTextField.setFont(new Font("Raleway", Font.BOLD,16));  //to set the font type of the text entered in that textfield
        cityNameTextField.setBounds(300, 490, 400, 30);   //to set the text ovet our page
        add(cityNameTextField);
        
        JLabel state = new JLabel("State:");  // to aet the name label
        state.setFont(new Font("Raleway", Font.BOLD,22));
        state.setBounds(120, 540, 200, 30);
        add(state);
        
        stateNameTextField = new JTextField();  // to generate a text filed in front of fathersname label
        stateNameTextField.setFont(new Font("Raleway", Font.BOLD,16));  //to set the font type of the text entered in that textfield
        stateNameTextField.setBounds(300, 540, 400, 30);   //to set the text ovet our page
        add(stateNameTextField);
        
        JLabel pincode = new JLabel("PinCode:");  // to aet the name label
        pincode.setFont(new Font("Raleway", Font.BOLD,22));
        pincode.setBounds(120, 590, 200, 30);
        add(pincode);
        
        pinTextField = new JTextField();  // to generate a text filed in front of name label
        pinTextField.setFont(new Font("Raleway", Font.BOLD,16));  //to set the font type of the text entered in that textfield
        pinTextField.setBounds(300, 590, 400, 30);   //to set the text ovet our page
        add(pinTextField);
        
        next = new JButton("NEXT");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);    //to set the backgound color of our page
        
        setSize(850,800);          //to set the size of the page
        setLocation(350,10);       // to set the location of that page
        setVisible(true);          // to make visible to the page we made
    }
    public void actionPerformed(ActionEvent ae){
        
       String  formno = ""+ random; // random is a long value so we used as a string by concataion to get values
       String name = NameTextField.getText(); // using gettext we get values from textfield
       String fname = fNameTextField.getText();
       String dob = ((JTextField) datechooser.getDateEditor().getUiComponent()).getText(); //to get values of date we use dateeditor and uicomponenet
       
       String gender = null;    // to get gender value first we did it null then select it by using condition
       if(male.isSelected()){
           gender = "male";
       }
       else if(female.isSelected()){
           gender = "female";
       }
       else if(others.isSelected()){
           gender = "others";
       }
       
       String email = emailTextField.getText();  // to get email value 
       
       String marital = null;           // to get gender value first we did it null then select it by using condition
       if(unmarried.isSelected()){
           marital = "unmarried";
       }
       if(married.isSelected()){
           marital = "married";
       }
       if(other.isSelected()){
           marital = "other";
       }
       
       String address = addressTextField.getText();  // to get address value  
       String city = cityNameTextField.getText();    //to get city value
       String state = stateNameTextField.getText();  // to get state value
       String pin = pinTextField.getText();           // to get pin value
      
    
      try {
            if (name.equals("")) { 
                JOptionPane.showMessageDialog(null, " name is required");
            } 
            else {
                Conn c = new Conn();  // to establish the connection with the database to call the conn class
                String query = " insert into signup values('" + formno + "', '" + name + "', '" + fname + "', '" + dob
                        + "', '" + gender + "', '" + email + "', '" + marital + "', '" + address + "', '" + city + "', '"
                        + state + "', '" + pin + "')";
                c.s.executeUpdate(query);

                setVisible(false);
                new SignupTwo(formno).setVisible(true);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
     }
    //"string"+variable+"string";
    
    
 public static void main (String args[]){
     new SignupOne();      // sinupone class object
     
 }   

}