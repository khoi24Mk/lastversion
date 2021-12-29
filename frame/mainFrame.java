package frame;

import javax.swing.*;
import java.sql.SQLException;

public class mainFrame extends JFrame{


    public mainFrame() throws SQLException {
        super("sth");

        this.setSize(500,500);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel jpTable = new tableModel();


        this.add(jpTable);
        this.setVisible(true);
    }
}
