import javax.swing.*;

public class Result {
  JFrame frame;

  Result() {

    frame = new JFrame();


    //----------------------------  Confirm-button ------------------------//

    JButton searchButton = new JButton("Comfirm");
    searchButton.setBounds(50,200 , 95, 30);

    frame.add(searchButton);

//----------------------------  Result-Table ------------------------//

    String data[][] = { { "101", "Amit", "670000" ,"Amit", "670000" }, { "102", "Jai", "780000","Amit", "670000"  }, { "101", "Sachin", "700000","Amit", "670000"  } };
    String column[] = { "Location", "Wheel", "TotalNumber","Hourly Rate ","options" };

    JTable resultTable = new JTable(data, column);
    resultTable.setBounds(1, 1, 200, 300);
    JScrollPane sp = new JScrollPane(resultTable);
    frame.add(sp);

    

    
    frame.setSize(500, 500);
    frame.setVisible(true);
  }

  public static void main(String[] args) {
    new Result();
  }
}