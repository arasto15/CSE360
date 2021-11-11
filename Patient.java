package application;

import java.util.Date;

public class Patient
{
     private String name;
     private int DOB;
     private int ID;
     private String username;
     private String password;
     public static int counter;
     
     public Patient()
     {
           name = "?";
           DOB = 0;
           ID = 0;
           username = "?";
           password = "?";
           counter++;
     }
     
     public Patient(String name, int DOB, int ID)
     {
         this.name = name;
         this.DOB = 0;
         this.ID = 0;
         username = "?";
         password = "?";
         counter++;
     }
     public String getName()
     {
           return name;
     }
     public int getDOB()
     {
           return DOB;
     }
     public int getID()
     {
           return ID;
     }
     public void setName(String name)
     {
           this.name = name;
     }
     public void setDOB(int DOB)
     {
           this.DOB = DOB;
     }
     public void setID(int ID)
     {
           this.ID = ID;
     }
     public void setUsername(String user)
     {
           this.username = user;
     }
     public void setPassword(String pass)
     {
           this.password = pass;
     }
     public String toString()
     {
           return "Name: " + name + "     DOB: " + DOB + "     ID: " + ID; 
     }
}

