package application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AddAppointmentFrame extends JFrame implements ActionListener {

	 Container container = getContentPane();
	    JLabel yearL = new JLabel("YEAR");
	    JLabel monthL = new JLabel("MONTH");
	    JLabel dayL = new JLabel("DAY");
	    JTextField yearF = new JTextField("2021");
	    JTextField monthF = new JTextField("10");
	    JTextField dayF = new JTextField("24");
	    JButton addButton = new JButton("SCHEDULE");
	    JButton cancelButton = new JButton("CANCEL");
	    JCheckBox show = new JCheckBox("Show Password");
	  	JLabel info = new JLabel("Please enter appointment details");
	   
	  	String[] choices = { "CHOICE 1", "CHOICE 2", "CHOICE 3", "CHOICE 4",
                "CHOICE 5", "CHOICE 6" };

	    final JComboBox<String> cb = new JComboBox<String>(choices);
	  	
	    AddAppointmentFrame()
		{
	    	setLayoutManager();
	        setPos();
	        addComponentsToContainer();
	        addActionEvent();
		}
		
		private void setLayoutManager() 
		{
	        container.setLayout(null);
		}

		private void setPos() 
		{
	        yearL.setBounds(150, 70, 100, 35);
	        monthL.setBounds(150, 110, 100, 35);
	        dayL.setBounds(150, 150, 100, 35);
	        yearF.setBounds(250, 70, 175, 35);
	        monthF.setBounds(250, 110, 175, 35);
	        dayF.setBounds(250, 150, 175, 35);
	        show.setBounds(150, 250, 150, 30);
	        addButton.setBounds(150, 190, 125, 50);
	        cancelButton.setBounds(300, 190, 125, 50);
	        cb.setBounds(300, 240, 125, 50);
	    	info.setBounds(150, 300, 450, 35);
	    	Font font = new Font("Verdana", Font.BOLD, 14);
	    	info.setFont(font);
	    	info.setForeground(Color.RED);
		}
		
		private void addComponentsToContainer()
		{

	        container.add(yearL);
	        container.add(monthL);
	        container.add(dayL);
	        container.add(yearF);
	        container.add(monthF);
	        container.add(dayF);
	        container.add(show);
	        container.add(addButton);
	        container.add(cancelButton);
	        container.add(info);
	        //container.add(cb);
		}
		
		private void addActionEvent() 
		{
	        addButton.addActionListener(this);
	        cancelButton.addActionListener(this);
	        show.addActionListener(this);
		}

		@Override
		public void actionPerformed(ActionEvent e) 
		{
	        if (e.getSource() == addButton) 
	        {
	            boolean isEmptyFields = false;
	            
	            //If any field is empty, set isEmptyFields flag to true
	            if (dayF.getText().equals("") || monthF.getText().equals("") || yearF.getText().equals("") || monthF.getText().equals("") || dayF.getText().equals("") )
	            {
	            	// Display error message if there are empty fields
	            	isEmptyFields = true;
	            	info.setText("Please fill all fields");
	            }

	            // If all fields are filled, try to add 
	            if(!isEmptyFields) {
	            	try 
	            	{
	    		        int yearText = Integer.parseInt(yearF.getText());
	    		        int monthext = Integer.parseInt(monthF.getText());
	    		        int dayText = Integer.parseInt(dayF.getText());
	    	            JOptionPane.showMessageDialog(this, "Account Added to Database");
	    	            super.setVisible(false);
	            	} //end of try
	    	        catch (NumberFormatException E) 
	            	{
	    	
	    	        	info.setText("Please enter integer values for Date of Birth and ID.");
	    	        } 
	    	        catch (Exception E) 
	            	{
	    	            // Catches generic exception and displays message
	    	        	info.setText("Appointment was not added - Appointment already exists. ");
	    	        }
	            }

	        }
		
	        if (e.getSource() == cancelButton) {
	            JOptionPane.showMessageDialog(this, "Canceled Account Registration");
	            super.setVisible(false);
	        }
	        
	        if (e.getSource() == show) {
	            if (show.isSelected()) {

	            } else {

	            }
	        }
		}
	}
