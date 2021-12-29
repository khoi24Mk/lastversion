package frame;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

public class mainFrame extends JFrame{


    public mainFrame() throws SQLException {
        super("sth");

        this.setSize(500,500);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel jpTable = new tableModel();
        JPanel jpInfo = new JPanel();
        jpInfo.setBounds(10,200,500,400);
        jpInfo.setLayout(null);


        JLabel LID = new JLabel("ID");
        LID.setBounds(10,10,200,30);
        JLabel Lname = new JLabel("Name");
        Lname.setBounds(10,50,200,30);
        JLabel LDOB = new JLabel("DOB");
        LDOB.setBounds(270,50,200,30);
        JLabel Ladd = new JLabel("Address");
        Ladd.setBounds(10,90,400,30);
        JLabel Lstatus = new JLabel("Status");
        Lstatus.setBounds(10,130,200,30);
        JLabel Ltreatment = new JLabel("Treatment");
        Ltreatment.setBounds(10,170,500,30);

        jpInfo.add(Lname);
        jpInfo.add(LDOB);
        jpInfo.add(Ladd);
        jpInfo.add(Lstatus);
        jpInfo.add(Ltreatment);

        this.add(jpInfo);
        this.add(jpTable);


        this.setVisible(true);
    }
}
