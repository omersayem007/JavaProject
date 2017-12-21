
import javax.swing.*;

public class CreateAccount{

public static  void main(String [] args){
	
	int  xCordinate =80;
    int yCordinate =100;
	
	JFrame frame =new JFrame();

	JComboBox  vehicleTypeComboBox, vehicleNumberComboBox;
	
	JTextField name,password,address,mobile,email,photo,Facility; 
	
	JLabel nameField,passwordField,addressField,mobileField,emailFeild,photoField, vehicleTypeField, vehicleNumberField, securityTypeField,facilityField;  
    

    JRadioButton options1, options2, options3;

	//-------------------------------  name -----------------------------------//
    nameField=new JLabel("  Name ");  
    nameField.setBounds(xCordinate-40,yCordinate, 100,30);

    name=new JTextField("  Your name ");
    name.setBounds(xCordinate+40,yCordinate,200,30);

      frame.add(nameField);

      frame.add(name);

    //-------------------- password--------------//

    passwordField=new JLabel("  Password  ");  
    passwordField.setBounds(xCordinate-40,yCordinate+40, 100,30);

    password=new JTextField("  Valid password ");
    password.setBounds(xCordinate+40,yCordinate+40,200,30);

    frame.add(passwordField);
     frame.add(password); 

    
    //--------------------------- Adress----------------------------//
	addressField=new JLabel("  Address ");  
    addressField.setBounds(xCordinate-40,yCordinate+80, 100,30);

    address=new JTextField("  valid address ");  
    address.setBounds(xCordinate+40,yCordinate+80, 200,30); 

     frame.add(addressField);
      frame.add(address); 


    //--------------------------- Mobile----------------------------//

    mobileField=new JLabel("  Mobile ");  
    mobileField.setBounds(xCordinate-40,yCordinate+120, 100,30);


    mobile=new JTextField(" valid Mobile no ");  
    mobile.setBounds(xCordinate+40,yCordinate+120, 200,30); 

    frame.add(mobileField);
    frame.add(mobile); 
	
	
	//---------------------------- Email ------------------------//
	emailFeild=new JLabel("  Email ");  
    emailFeild.setBounds(xCordinate-40,yCordinate+160, 100,30);


	email=new JTextField("  Email id "); 
	email.setBounds(xCordinate+40,yCordinate+160, 200,30);

	 frame.add(emailFeild);
	 frame.add(email);
    	
	


	//---------------------------- Photo ------------------------//
	
	photoField=new JLabel("  Photo ");  
    photoField.setBounds(xCordinate-40,yCordinate+200, 100,30);

	photo=new JTextField("  Upload a photo "); 
	photo.setBounds(xCordinate+40,yCordinate+200, 200,30);

	frame.add(photoField);
	frame.add(photo); 

	//----------------photo button---------------//

	JButton uploadButton =new JButton("  Upload ");  
    uploadButton.setBounds(xCordinate+240,yCordinate+200,100,30);

    frame.add(uploadButton); 


    //----------space size---------//------------------------------------------------------------////////


  vehicleTypeField = new JLabel("  Wheel ");
    vehicleTypeField.setBounds(xCordinate-40, yCordinate +240, 100, 30);

    String wheels[] = {  "  2", "  3", "  4" };
    vehicleTypeComboBox = new JComboBox(wheels);
    vehicleTypeComboBox.setBounds(xCordinate + 40, yCordinate + 240, 200, 30);

    frame.add(vehicleTypeField);
    frame.add(vehicleTypeComboBox);

    //---------------------------- vehicleNumber-combobox ------------------------//

    vehicleNumberField = new JLabel("  Vehicle ");
                                     

    vehicleNumberField.setBounds(xCordinate - 40, yCordinate + 280, 150, 30);


                                     

    String numbers[] = { "  1", "  2", "  3","  4", "  5", "  6","  7","  8","  9", "  10"};
    vehicleNumberComboBox = new JComboBox(numbers);
    vehicleNumberComboBox.setBounds(xCordinate +40, yCordinate + 280, 200, 30);

    frame.add(vehicleNumberField);
    frame.add(vehicleNumberComboBox);

    
    //----------------------------  SecurityOptions-combobox-facility ------------------------//

    securityTypeField = new JLabel("  Facility  ");
    securityTypeField.setBounds(xCordinate - 40, yCordinate + 320, 100, 30);


    options1 = new JRadioButton("  CCTV");
    options2 = new JRadioButton("  Guard");
    

    options1.setBounds(xCordinate + 40, yCordinate + 320, 100, 30);
    options2.setBounds(xCordinate + 120, yCordinate + 320, 100, 30);
    
    

    ButtonGroup bg = new ButtonGroup();
    bg.add(options1);
    bg.add(options2);

    frame.add(options1);
   
    frame.add(options2);
   
    frame.add(securityTypeField);




    //--------------------Options-----------/////



    securityTypeField = new JLabel("  Options  ");
    securityTypeField.setBounds(xCordinate - 40, yCordinate + 360, 100, 30);


    options1 = new JRadioButton("  Car Wash ");
    options2 = new JRadioButton("  Servicing ");
    

    options1.setBounds(xCordinate + 40, yCordinate + 360, 100, 30);
    options2.setBounds(xCordinate + 120, yCordinate + 360, 100, 30);
    
   

    ButtonGroup bg2 = new ButtonGroup();
    bg2.add(options1);
    bg2.add(options2);

      frame.add(options1);
 
    frame.add(options2);
   
   frame.add(securityTypeField);


    frame.add(options1);
   
    frame.add(options2);

   frame.add(securityTypeField);





    //----------------confirm----------//
	
    JButton confirmButton =new JButton("  Confirm");  
    confirmButton.setBounds(xCordinate+40,yCordinate+400,95,30);

     frame.add(confirmButton); 


	frame.setSize(700,800);
	frame.setTitle(" Create a account");
	frame.setLayout(null);
	frame.setVisible(true);

}

}