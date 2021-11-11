package application;


import java.io.Serializable;
import java.util.ArrayList;


public class PatientManagement implements Serializable
{
	private static final long serialVersionUID = -3804180609467180366L;
	ArrayList<Patient> patientList;

	public PatientManagement() {

		patientList = new ArrayList<Patient>();
	}

	public int patientExists(String patientName, int DOB, int ID) {
		int temp = -1;
		for (int i = 0; i < patientList.size(); i++)
		{
			if (patientList.get(i).getName().equals(patientName) && patientList.get(i).getDOB() == DOB && patientList.get(i).getID() == ID)
			{
				temp = i;
			}
		}
		return temp;
	}

	public int idExists(int DOB, int ID) {
		int temp = -1;
		for (int i = 0; i < patientList.size(); i++)
		{
			if (this.patientList.get(i).getID() == ID)
			{
				temp = i;
			}
		}
		return temp;
	}

	public boolean addPatient(Patient newPatient) {
		boolean temp = true;
		if (patientExists(newPatient.getName(), newPatient.getDOB(), newPatient.getID()) > -1)
		{
			temp = false;
		}
		if (temp)
		{
			this.patientList.add(newPatient);
		}
		return temp;
	}

	public boolean removePatient(Patient newPatient) {
		int temp = -1;
		boolean temp2 = false;
		for (int i = 0; i < patientList.size(); i++)
		{
			if (patientExists(newPatient.getName(), newPatient.getDOB(), newPatient.getID()) > -1)
			{
				temp = i;
				temp2 = true;
			}
		}
		if (temp2)
		{
			this.patientList.remove(temp);
		}
		return temp2;
	}
	
	public boolean removePatientIndex(int index) {
		boolean temp = false;
		this.patientList.remove(index);
		return temp;
	}

	public String listPatients() {
		String temp = "\n";
		if (patientList.size() > 0)
		{
			for (int i = 0; i < patientList.size(); i++)
			{
				temp = temp + patientList.get(i).toString();
			} 
		} else {
				temp = "\nNo Patients\n\n";
		}
		temp = temp + "\n";
		return temp;
	}

	public void closePatientManagement() {
		for (int i = 0; i < patientList.size(); i++)
		{
			this.patientList.remove(i);
		}
	}
}