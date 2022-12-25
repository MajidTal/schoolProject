package src;

import java.util.ArrayList;

public class Student {

	private String StuName;
	private String Stugender;

	course co = new course();
    ArrayList<course> courseList = new ArrayList<course>();
	
	public void setName(String name)

	{
		this.StuName = name;
	}

	public String getName() {

		return StuName;
	}

	public void setStugender(String gender) {
		this.Stugender = gender;
	}

	public String getStugender() {
		return Stugender;
	}

}
