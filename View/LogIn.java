package View;
import javax.swing.*;
import eventHandlers.SignUpEventHandler;

public class  LogIn extends JPanel {

    private JTextField name, password;
    private JButton loginButton, signupButton;

    private JLabel nameField, passwordField;

    private static LogIn ref;

    public static LogIn getRef() {
        if (ref == null)
            ref = new LogIn();
        return ref;
    }

    private LogIn() {
        createGui();
    }

    public void createGui() {

        this.setLayout(null);

        int xCordinate = 50;
        int yCordinate = 100;

        //-------------------------------  name -----------------------------------//
        this.nameField = new JLabel("Name");
        this.nameField.setBounds(xCordinate - 40, yCordinate, 100, 30);
        this.name = new JTextField("Your name");
        this.name.setBounds(xCordinate + 40, yCordinate, 200, 30);

        this.add(this.name);
        this.add(this.nameField);

        //--------------------------- password ----------------------------//

        this.passwordField = new JLabel("  Password  ");
        this.passwordField.setBounds(xCordinate - 40, yCordinate + 40, 100, 30);

        this.password = new JTextField("  Valid password ");
        this.password.setBounds(xCordinate + 40, yCordinate + 40, 200, 30);

        this.add(this.passwordField);
        this.add(this.password);

        //-----------login button-------//

        this.loginButton = new JButton("login");
        this.loginButton.setBounds(xCordinate + 40, yCordinate + 80, 95, 30);

        this.add(this.loginButton);

        //------------SIGNUP BUTTON------///

        this.signupButton = new JButton("  Signup");
        this.signupButton.setBounds(xCordinate + 310, yCordinate - 90, 95, 30);

        this.add(this.signupButton);

        this.signupButton.addActionListener(new SignUpEventHandler());


    }

}