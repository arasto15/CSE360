package application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class LoginFrame extends JFrame implements ActionListener {

    Container container = getContentPane();
    JLabel userL = new JLabel("USERNAME");
    JLabel passL = new JLabel("PASSWORD");
    JTextField userF = new JTextField("A");
    JPasswordField passF = new JPasswordField("1");
    JButton loginButton = new JButton("LOGIN");
    JButton registerButton = new JButton("REGISTER");
    JCheckBox show = new JCheckBox("Show Password");
    JLabel test = new JLabel("TEST");
    
    LoginFrame() {
        setLayoutManager();
        setPos();
        addComponentsToContainer();
        addActionEvent();
    }

    public void setLayoutManager() {
        container.setLayout(null);
    }

    public void setPos() {
        userL.setBounds(150, 100, 100, 25);
        passL.setBounds(300, 100, 100, 25);
        userF.setBounds(150, 120, 125, 35);
        passF.setBounds(300, 120, 125, 35);
        show.setBounds(150, 250, 150, 30);
        loginButton.setBounds(150, 160, 125, 50);
        registerButton.setBounds(300, 160, 125, 50);
        //test.setBounds(200, 50, 300, 25);
    }

    public void addComponentsToContainer() {
        container.add(userL);
        container.add(passL);
        container.add(userF);
        container.add(passF);
        container.add(show);
        container.add(loginButton);
        container.add(registerButton);
        container.add(test);
        //Date date = new Date(88, 04, 19);
        //SimpleDateFormat s = new SimpleDateFormat("MM-dd-yyyy");
        //test.setText(s.format(date));
    }

    public void addActionEvent() {
        loginButton.addActionListener(this);
        registerButton.addActionListener(this);
        show.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String userText;
            String pwdText;
            userText = userF.getText();
            pwdText = passF.getText();
            if (userText.equalsIgnoreCase("A") && pwdText.equalsIgnoreCase("1")) {
                JOptionPane.showMessageDialog(this, "Login Successful");
                super.setVisible(false);
                Home newHome = new Home();
                newHome.setTitle("Patient Management System");
                newHome.setVisible(true);
                newHome.setBounds(700, 400, 900, 600);
                newHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                newHome.setResizable(false);
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
            }
        }
        
        if (e.getSource() == registerButton) {
            //userF.setText("");
            //passF.setText("");
            JOptionPane.showMessageDialog(this, "Registration");
            //super.setVisible(false);
            RegisterFrame newRegister = new RegisterFrame();
            newRegister.setTitle("Patient Registration");
            newRegister.setVisible(true);
            newRegister.setBounds(700, 400, 600, 700);
            newRegister.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            newRegister.setResizable(false);
        }
        
        if (e.getSource() == show) {
            if (show.isSelected()) {
                passF.setEchoChar((char) 0);
            } else {
                passF.setEchoChar('*');
            }
        }
    }
}
