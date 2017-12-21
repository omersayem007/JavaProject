package eventHandlers;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.*;

public class SignUpEventHandler implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		ApplicationFrame ref = ApplicationFrame.getRef();
		ref.remove(LogIn.getRef());
		ref.add(UserSelection.getRef(), BorderLayout.CENTER);
		ref.paintAll(ref.getGraphics());
	
	}

}
