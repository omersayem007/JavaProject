import javax.swing.*;

public class Search {

  public static void main(String[] args) {

    int xCordinate = 50;
    int yCordinate = 100;

    JFrame frame = new JFrame();

    JComboBox searchComboBox, vehicleTypeComboBox, vehicleNumberComboBox;

    JLabel searchField, vehicleTypeField, vehicleNumberField, securityTypeField;

    JRadioButton options1, options2, options3;

    //-------------------------------  Search-combobox -----------------------------------//
    searchField = new JLabel("Locaions:");
    searchField.setBounds(xCordinate - 40, yCordinate, 100, 30);

    searchComboBox = new JComboBox();
    searchComboBox.setBounds(xCordinate + 100, yCordinate, 200, 30);

    frame.add(searchField);
    frame.add(searchComboBox);

    //--------------------------- VehicleType-combobox ----------------------------//
    vehicleTypeField = new JLabel("Wheel:");
    vehicleTypeField.setBounds(xCordinate - 40, yCordinate + 40, 100, 30);

    String wheels[] = { "2", "3", "4" };
    vehicleTypeComboBox = new JComboBox(wheels);
    vehicleTypeComboBox.setBounds(xCordinate + 100, yCordinate + 40, 200, 30);

    frame.add(vehicleTypeField);
    frame.add(vehicleTypeComboBox);

    //---------------------------- vehicleNumber-combobox ------------------------//

    vehicleNumberField = new JLabel("Number of Vehicle:");
    vehicleNumberField.setBounds(xCordinate - 40, yCordinate + 80, 150, 30);

    String numbers[] = { "1", "2", "3","4", "5", "6","7","8","9", "10"};
    vehicleNumberComboBox = new JComboBox(numbers);
    vehicleNumberComboBox.setBounds(xCordinate + 100, yCordinate + 80, 200, 30);

    frame.add(vehicleNumberField);
    frame.add(vehicleNumberComboBox);

    //----------------------------  SecurityOptions-combobox ------------------------//

    securityTypeField = new JLabel("Options:");
    securityTypeField.setBounds(xCordinate - 40, yCordinate + 120, 100, 30);

    options1 = new JRadioButton("CCTV");
    options2 = new JRadioButton("Guard");
    options3 = new JRadioButton("Car Wash");

    options1.setBounds(xCordinate + 100, yCordinate + 120, 100, 30);
    options2.setBounds(xCordinate + 200, yCordinate + 120, 100, 30);
    options3.setBounds(xCordinate + 300, yCordinate + 120, 100, 30);

    ButtonGroup bg = new ButtonGroup();
    bg.add(options1);
    bg.add(options2);
    bg.add(options3);

    frame.add(options1);
    frame.add(options2);
    frame.add(options3);
    frame.add(securityTypeField);

    //----------------------------  Search-button ------------------------//

    JButton searchButton = new JButton("Search");
    searchButton.setBounds(xCordinate, yCordinate + 180, 95, 30);

    frame.add(searchButton);

    frame.setSize(500, 500);
    frame.setTitle("Search");
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);
    frame.setVisible(true);

  }

}
