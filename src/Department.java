package src;

import java.util.ArrayList;

public class Department {

	String depName;
	int depId;

	teacher te = new teacher();
	ArrayList<teacher> teacherArray = new ArrayList<teacher>();

	public void setNameOfDepartment(String name) {
		this.depName = name;
	}

	public String getNameOfDepartment() {
		return depName;
	}

	public void setIdOfDepartment(int ID) {
		this.depId = ID;
	}

	public int getIdOfDepartment() {
		return depId;
	}
}
