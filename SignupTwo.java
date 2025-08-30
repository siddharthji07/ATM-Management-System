
package bank.management.system;
import javax.swing.*;  //to import the JFrame class packages
import java.awt.*;     //to import the color class packages

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SignupTwo extends JFrame implements ActionListener{  // this is signup class in which JFrmame is inherited
    
    long random;  //global declaration of long
    JTextField pan,aadhar; //global declaration of all text values
    JButton next; //global declartion of next button
    JRadioButton syes,sno,eyes,eno; //global declaration of all radioButtons
    JComboBox religion,category,occupation,education,income;
    String formno; // globally declare formno to show that both data belong to same person
             
    SignupTwo(String formno){   // constructor of our signup class
    this.formno = formno;
        
        setLayout(null); // to customized the location of our text at head position where we want otherwise by default it came center alinged
        
        setTitle("NEW ACCOUNT APPLICATION FORM- PAGE 2");
        
        
        JLabel additionalDetails = new JLabel("Page 2: additional Details");  // to set the perosnal details label
        additionalDetails.setFont(new Font("Raleway", Font.BOLD,22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails );
        
        JLabel name = new JLabel("Religion:");  // to aet the name label
        name.setFont(new Font("Raleway", Font.BOLD,22));
        name.setBounds(120, 140, 100, 30);
        add(name);
        
        String valReligion[]={"Hindu","Muslim","christian","sikh","others"};  // to set the multiple option button 
        religion = new JComboBox(valReligion);
        religion.setBounds(300, 140, 400, 30);   //to set the text ovet our page
        religion.setBackground(Color.WHITE);
        add(religion);
        
        
        JLabel fname = new JLabel("Category:");  // to aet the Fathers name label
        fname.setFont(new Font("Raleway", Font.BOLD,22));
        fname.setBounds(120, 190, 200, 30);
        add(fname);
        
        String valcategory[]= { "General", "OBC", "SC", "ST", "others"};
        category = new JComboBox(valcategory);
        category.setBounds(300, 190, 400, 30);   //to set the text ovet our page
        category.setBackground(Color.WHITE);
        add(category);
        
        
        
        JLabel dob = new JLabel("Income:");  // to aet the date of birth label
        dob.setFont(new Font("Raleway", Font.BOLD,22));
        dob.setBounds(120, 240, 200, 30);
        add(dob);
        
        String valIncome[]= { "null", "<1,50,000", "<2,50,000", "<5,00,000", "upto 10,00,000"};
        income = new JComboBox(valIncome);
        income.setBounds(300, 240, 400, 30);   //to set the text ovet our page
        income.setBackground(Color.WHITE);
        add(income);
       
        
        JLabel gender = new JLabel("Educational");  // to aet the gender label
        gender.setFont(new Font("Raleway", Font.BOLD,22));
        gender.setBounds(120, 290, 200, 30);
        add(gender);
        
        String educationvalue[]= { "Non-Graduation", "Graduate", "Post-graduation", "Doctrate", "others"};
        education = new JComboBox(educationvalue);
        education.setBounds(300, 310, 400, 30);   //to set the text ovet our page
        education.setBackground(Color.WHITE);
        add(education);
    
       
        
        JLabel email = new JLabel("Qualification:");  // to aet the name label
        email.setFont(new Font("Raleway", Font.BOLD,22));
        email.setBounds(120, 315, 200, 30);
        add(email);
        
       
        
        JLabel marital = new JLabel("Occupation:");  // to aet the name label
        marital.setFont(new Font("Raleway", Font.BOLD,22));
        marital.setBounds(120, 390, 200, 30);
        add(marital);
        
        String occupationvalue[]= { "Salaried", "Self employed","Buisness","Student","Retired", "others"};
        occupation = new JComboBox(occupationvalue);
        occupation.setBounds(300, 390, 400, 30);   //to set the text ovet our page
        occupation.setBackground(Color.WHITE);
        add(occupation);
    
        
        
        JLabel address = new JLabel("PAN Number:");  // to aet the name label
        address.setFont(new Font("Raleway", Font.BOLD,22));
        address.setBounds(120, 440, 200, 30);
        add(address);
        
        pan = new JTextField();  // to generate a text filed in front of name label
        pan.setFont(new Font("Raleway", Font.BOLD,16));  //to set the font type of the text entered in that textfield
        pan.setBounds(300, 440, 400, 30);   //to set the text ovet our page
        add(pan);
        
        JLabel city = new JLabel("Aadhar Number:");  // to aet the name label
        city.setFont(new Font("Raleway", Font.BOLD,22));
        city.setBounds(120, 490, 200, 30);
        add(city);
        
        aadhar = new JTextField();  // to generate a text filed in front of fathersname label
        aadhar.setFont(new Font("Raleway", Font.BOLD,16));  //to set the font type of the text entered in that textfield
        aadhar.setBounds(300, 490, 400, 30);   //to set the text ovet our page
        add(aadhar);
        
        JLabel state = new JLabel("Senior Citizen:");  // to aet the name label
        state.setFont(new Font("Raleway", Font.BOLD,22));
        state.setBounds(120, 540, 200, 30);
        add(state);
        
        syes = new JRadioButton("YES");   // for male radio buuton creation to select gender
        syes.setBounds(350, 540, 60, 30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("NO");   // for male radio buuton creation to select gender
        sno.setBounds(500, 540, 60, 30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup seniorcitizen = new ButtonGroup();   // for select only one button at a time
        seniorcitizen .add(syes);
        seniorcitizen .add(sno);
       
        
       
        
        JLabel pincode = new JLabel("Existing Account:");  // to aet the name label
        pincode.setFont(new Font("Raleway", Font.BOLD,22));
        pincode.setBounds(120, 590, 200, 30);
        add(pincode);
        
        eyes = new JRadioButton("YES");   // for male radio buuton creation to select gender
        eyes.setBounds(350, 590, 60, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("NO");   // for male radio buuton creation to select gender
        eno.setBounds(500, 590, 60, 30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup Accountinfo = new ButtonGroup();   // for select only one button at a time
        Accountinfo.add(eyes);
        Accountinfo.add(eno);
        
        
      
        
        next = new JButton("NEXT");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
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
       String sreligion = (String) religion.getSelectedItem(); // using gettext we get values from textfield
       
       String scategory = (String) category.getSelectedItem(); 
       
       String sincome = (String) income.getSelectedItem(); 
       
       String seducation = (String) education.getSelectedItem(); 
       
       String soccupation = (String) occupation.getSelectedItem(); 
       
       String seniorcitizen = null;    // to get gender value first we did it null then select it by using condition
       if(syes.isSelected()){
           seniorcitizen = "YES";
       }
       else if(syes.isSelected()){
           seniorcitizen = "NO";
       }
       
       
      
       
       String existingaccount = null;           // to get gender value first we did it null then select it by using condition
       if(eyes.isSelected()){
           existingaccount = "YES";
       }
       if(eno.isSelected()){
           existingaccount = "NO";
       }
       
       
       String span = pan.getText();  // to get address value  
       String saadhar = aadhar.getText();   //to get aadhar value
      
         try {
            Conn c = new Conn();
            String query2 = " insert into signuptwo values('" + formno + "', '" + sreligion + "', '" + scategory + "', '"
                    + sincome + "', '" + seducation + "', '" + soccupation + "', '" + span + "', '" + saadhar + "', '"
                    + seniorcitizen + "', '" + existingaccount + "')";
            c.s.executeUpdate(query2);
            
                setVisible(false);
                new SignupThree(formno).setVisible(true);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String args[]) {
        new SignupTwo("");
    }
}