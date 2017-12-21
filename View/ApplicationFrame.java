package View;
import java.awt.BorderLayout;
import javax.swing.JFrame;

public class ApplicationFrame extends JFrame {
	private static ApplicationFrame ref;
	
	private ApplicationFrame(){
		ref = this;
		this.add(LogIn.getRef(), BorderLayout.CENTER);
		this.setBounds(100, 100, 500, 450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}		

	public static ApplicationFrame getRef(){
		if(ref==null)
			ref = new ApplicationFrame();
		return ref;
	}

}


