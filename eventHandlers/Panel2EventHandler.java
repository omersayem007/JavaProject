package eventHandlers;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import wk9_navigation.ApplicationFrame;
import wk9_navigation.Panel1;
import wk9_navigation.Panel2;

public class Panel2EventHandler implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		ApplicationFrame ref = ApplicationFrame.getRef();
		ref.remove(Panel2.getRef());
		ref.add(Panel1.getRef(), BorderLayout.CENTER);
		ref.paintAll(ref.getGraphics());
		
	}

}
