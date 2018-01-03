package View;
import javax.swing.*;
import eventHandlers.PartnerSignUpEventHandler;


public class PartnerSignUp extends JPanel {

    public JComboBox vehicleTypeComboBox, vehicleNumberComboBox;

    public JTextField name, password, address, mobile, email, photo, Facility;

    public JLabel nameField, passwordField, addressField, mobileField, emailFeild, photoField, vehicleTypeField,
            vehicleNumberField, securityTypeField, facilityField;

    public JRadioButton options1, options2, options3;

    public JButton uploadButton, confirmButton;

    public ButtonGroup bg, bg2;

    private static PartnerSignUp ref;

    public static PartnerSignUp getRef() {
        if (ref == null)
            ref = new PartnerSignUp();
        return ref;
    }

    private PartnerSignUp() {
        createGui();
    }

    public void createGui() {

        this.setLayout(null);

        int xCordinate = 80;
        int yCordinate = 100;

        //-------------------------------  name -----------------------------------//
        this.nameField = new JLabel("  Name ");
        this.nameField.setBounds(xCordinate - 40, yCordinate, 100, 30);
        this.name = new JTextField("  Your name ");
        this.name.setBounds(xCordinate + 40, yCordinate, 200, 30);
        this.add(nameField);
        this.add(name);

        //-------------------- password--------------//

        this.passwordField = new JLabel("  Password  ");
        this.passwordField.setBounds(xCordinate - 40, yCordinate + 40, 100, 30);
        this.password = new JTextField("  Valid password ");
        this.password.setBounds(xCordinate + 40, yCordinate + 40, 200, 30);
        this.add(passwordField);
        this.add(password);

        //--------------------------- Adress----------------------------//
        this.addressField = new JLabel("  Address ");
        this.addressField.setBounds(xCordinate - 40, yCordinate + 80, 100, 30);
        this.address = new JTextField("  valid address ");
        this.address.setBounds(xCordinate + 40, yCordinate + 80, 200, 30);
        this.add(addressField);
        this.add(address);

        //--------------------------- Mobile----------------------------//

        this.mobileField = new JLabel("  Mobile ");
        this.mobileField.setBounds(xCordinate - 40, yCordinate + 120, 100, 30);
        this.mobile = new JTextField(" valid Mobile no ");
        this.mobile.setBounds(xCordinate + 40, yCordinate + 120, 200, 30);
        this.add(mobileField);
        this.add(mobile);

        //---------------------------- Email ------------------------//
        this.emailFeild = new JLabel("  Email ");
        this.emailFeild.setBounds(xCordinate - 40, yCordinate + 160, 100, 30);
        this.email = new JTextField("  Email id ");
        this.email.setBounds(xCordinate + 40, yCordinate + 160, 200, 30);
        this.add(emailFeild);
        this.add(email);

        //---------------------------- Photo ------------------------//

        this.photoField = new JLabel("  Photo ");
        this.photoField.setBounds(xCordinate - 40, yCordinate + 200, 100, 30);
        this.photo = new JTextField("  Upload a photo ");
        this.photo.setBounds(xCordinate + 40, yCordinate + 200, 200, 30);
        this.add(photoField);
        this.add(photo);

        //----------------photo button---------------//

        this.uploadButton = new JButton("  Upload ");
        this.uploadButton.setBounds(xCordinate + 240, yCordinate + 200, 100, 30);
        this.add(uploadButton);

        //----------space size---------//------------------------------------------------------------////////

        this.vehicleTypeField = new JLabel("  Wheel ");
        this.vehicleTypeField.setBounds(xCordinate - 40, yCordinate + 240, 100, 30);

        String wheels[] = { "  2", "  3", "  4" };
        this.vehicleTypeComboBox = new JComboBox(wheels);
        this.vehicleTypeComboBox.setBounds(xCordinate + 40, yCordinate + 240, 200, 30);
        this.add(vehicleTypeField);
        this.add(vehicleTypeComboBox);

        //---------------------------- vehicleNumber-combobox ------------------------//

        this.vehicleNumberField = new JLabel("  Vehicle ");
        this.vehicleNumberField.setBounds(xCordinate - 40, yCordinate + 280, 150, 30);

        String numbers[] = { "  1", "  2", "  3", "  4", "  5", "  6", "  7", "  8", "  9", "  10" };
        this.vehicleNumberComboBox = new JComboBox(numbers);
        this.vehicleNumberComboBox.setBounds(xCordinate + 40, yCordinate + 280, 200, 30);
        this.add(vehicleNumberField);
        this.add(vehicleNumberComboBox);

        //----------------------------  SecurityOptions-combobox-facility ------------------------//

        this.securityTypeField = new JLabel("  Facility  ");
        this.securityTypeField.setBounds(xCordinate - 40, yCordinate + 320, 100, 30);
        this.options1 = new JRadioButton("  CCTV");
        this.options2 = new JRadioButton("  Guard");
        this.options1.setBounds(xCordinate + 40, yCordinate + 320, 100, 30);
        this.options2.setBounds(xCordinate + 120, yCordinate + 320, 100, 30);

        this.bg = new ButtonGroup();
        this.bg.add(options1);
        this.bg.add(options2);

        this.add(options1);
        this.add(options2);
        this.add(securityTypeField);

        //--------------------Options-----------/////

        this.securityTypeField = new JLabel("  Options  ");
        this.securityTypeField.setBounds(xCordinate - 40, yCordinate + 360, 100, 30);
        this.options1 = new JRadioButton("  Car Wash ");
        this.options2 = new JRadioButton("  Servicing ");
        this.options1.setBounds(xCordinate + 40, yCordinate + 360, 100, 30);
        this.options2.setBounds(xCordinate + 120, yCordinate + 360, 100, 30);

        this.bg2 = new ButtonGroup();
        this.bg2.add(options1);
        this.bg2.add(options2);

        this.add(options1);
        this.add(options2);
        this.add(securityTypeField);
        this.add(options1);
        this.add(options2);
        this.add(securityTypeField);

        //----------------confirm----------//

        this.confirmButton = new JButton("  Confirm");
        this.confirmButton.setBounds(xCordinate + 40, yCordinate + 400, 95, 30);
        this.add(confirmButton);

    }

}