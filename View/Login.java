import javax.swing.*;

public class Login{

public static  void main(String [] args){

  int  xCordinate =50;
  int yCordinate =100;
	
	JFrame frame =new JFrame();
	
  JTextField userName,password; 
	JLabel userNameField,passwordField ; 
    
	//-------------------------------  user name -----------------------------------//
    userNameField=new JLabel("User Name:");  
    userNameField.setBounds(xCordinate-40,yCordinate, 100,30);

    userName=new JTextField("Your user name ");  
    userName.setBounds(xCordinate+50,yCordinate, 200,30);
    
    frame.add(userName);
    frame.add(userNameField);
		
	
    //--------------------------- Password ----------------------------//
    passwordField=new JLabel("Password:");  
    passwordField.setBounds(xCordinate-40,yCordinate+40, 100,30);

    password=new JTextField("password ");  
    password.setBounds(xCordinate+50,yCordinate+40, 200,30);
    
    frame.add(passwordField); 
    frame.add(password); 
	
	
	//---------------------------- Button ------------------------//
	  JButton loginButton =new JButton("Login");  
    loginButton.setBounds(xCordinate,yCordinate+150,95,30);
	
    JButton signupButton =new JButton("SignUp");  
    signupButton.setBounds(xCordinate+100,yCordinate+150,95,30);	
	
	
    frame.add(loginButton); 
    frame.add(signupButton); 	

	
	
	
	frame.setSize(500,500);
  frame.setTitle("Login");
  frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	frame.setLayout(null);
	frame.setVisible(true);

}

}