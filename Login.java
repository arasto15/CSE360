package application;
import java.util.ArrayList;
import javax.swing.JFrame;

public class Login {
	
    public static void main(String[] a) {
    	
        LoginFrame frame = new LoginFrame();
        frame.setTitle("Patient Portal");
        frame.setVisible(true);
        frame.setBounds(900, 400, 600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

    }
};