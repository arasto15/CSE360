package application;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Appointment {
    public static int counter;
    public Date date;
    SimpleDateFormat s = new SimpleDateFormat("MM-dd-yyyy");
    
    public Appointment()
    {
    	date = new Date(00, 01, 01);
        counter++;
    }
    
    public Appointment(int year, int month, int day)
    {
    	date = new Date(year - 1900, month - 1, day);
        counter++;
    }
    public Date getDate()
    {
          return date;
    }
    public void setDate(int year, int month, int day)
    {
    	this.date.setYear(year);
    	this.date.setMonth(month);
    	this.date.setDate(day);
    }
    public String toString()
    {
          return date.getMonth() + "/" + date.getDate() + "/" + date.getYear(); 
    }
}



