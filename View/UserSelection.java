import javax.swing.*;

public class UserSelection{

public static  void main(String [] args){
	
	int  xCordinate =30;
    int yCordinate =40;
	
	JFrame frame =new JFrame();
	
	 
    //-----------Partner button-------//

      JButton partnerButton =new JButton("  Partner");  
     partnerButton.setBounds(xCordinate+80,yCordinate+80,95,30);

    frame.add(partnerButton); 

    

    //------------SIGNUP BUTTON------///

    JButton clientButton = new JButton("  Client");  
     clientButton.setBounds(xCordinate+80,yCordinate+120,95,30);

    frame.add(clientButton); 

    

    
	frame.setSize(400,300);
	frame.setTitle("  User Selection Page ");
	frame.setLayout(null);
	frame.setVisible(true);

}

}