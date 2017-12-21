
package View;
import javax.swing.*;

public class UserSelection extends JPanel {

    public JFrame frame;
    public JButton partnerButton, clientButton;

    private static UserSelection ref;

    public static UserSelection getRef() {
        if (ref == null)
            ref = new UserSelection();
        return ref;
    }

    private UserSelection() {
        createGui();
    }

    public void createGui() {

        this.setLayout(null);

        int xCordinate = 30;
        int yCordinate = 40;

        this.frame = new JFrame();

        //-----------Partner button-------//

        this.partnerButton = new JButton("  Partner");
        this.partnerButton.setBounds(xCordinate + 80, yCordinate + 80, 95, 30);

        this.add(this.partnerButton);

        //------------SIGNUP BUTTON------///

        this.clientButton = new JButton("  Client");
        this.clientButton.setBounds(xCordinate + 80, yCordinate + 120, 95, 30);
        this.add(this.clientButton);

    }

}