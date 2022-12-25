package src;

import java.util.ArrayList;

public class teacher {
	private String teName;
	private int teAge;

	Student st = new Student();
  ArrayList<Student> studentList = new ArrayList<Student>();
	public void setteName(String teName) {
		this.teName = teName;
	}

	public String getteName() {

		return teName;
	}

	public void setteAge(int setteAge) {
		this.teAge = setteAge;
	}

	public int getteAge() {

		return teAge;

	}

}
