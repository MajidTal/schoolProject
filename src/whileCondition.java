package src;

import java.util.ArrayList;
import java.util.Scanner;

public class whileCondition {

	public static void main(String[] args) {

		boolean condition = true;
		boolean condation1 = true;
		boolean condation2 = true;

		 // to let the user insert the values 
		Scanner SC = new Scanner(System.in);

		school scl = new school();

		ArrayList<Department> departmentArray = new ArrayList<Department>();

		while (condition) {

			System.out.println("press 1 to join the page");
			System.out.println("press 2 to exit the page");
			System.out.println("press 3 to print the results ");
			int input = SC.nextInt();
			if (input == 1) {
				Department de = new Department();

				System.out.println("Enter the Department ID");
				de.setIdOfDepartment(SC.nextInt());
				System.out.println("Enter the Department NAME");

				String nameString = SC.next();
				de.setNameOfDepartment(nameString);

				condation1 = true;

				while (condation1) {
					teacher te = new teacher();
					System.out.println("Enter the name of teacher");
					te.setteName(SC.next());

					System.out.println("Enter the age of teacher");
					te.setteAge(SC.nextInt());

					while (condation2) {
						Student st = new Student();
						System.out.println("Enter the student name");
						st.setName(SC.next());

						System.out.println("Enter the gender of student");
						st.setStugender(SC.next());

						te.studentList.add(st);

						boolean condation3 = true;
						while (condation3) {
							course co = new course();
							System.out.println(" Enter the name of the course");
							co.setCourseName(SC.next());
							System.out.println(" Enter the period of the course");
							co.setTimeOfCourse(SC.nextInt());
							st.courseList.add(co);

							boolean condation4 = true;
							while (condation4) {
								mark ma = new mark();
								System.out.println(" Enter the math mark please");
								ma.setMathMark(SC.nextInt());
								System.out.println(" Enter the IT mark please");
								ma.setITMark(SC.nextInt());
								co.markList.add(ma);

								System.out.println("Do you want to add mark again yes / no");
								String w = SC.next();

								if (w.equals("yes")) {
									System.out.println("Enter the details of the mark");
								} else if (w.equals("no")) {
									condation4 = false;
								}

							}

							System.out.println("Do you want to add others course yes / no");
							String ww = SC.next();
							if (ww.equals("yes")) {
								System.out.println("Enter the details of course");
							} else if (ww.equals("no")) {
								condation3 = false;
							}

						}

						System.out.println("Do you want add another student yes / no ");

						String zz = SC.next();

						if (zz.equals("yes")) {
							System.out.println("Enteryhe details of student");
						} else if (zz.equals("no")) {

							condation2 = false;
						}
						
						//Testing git

					}

					de.teacherArray.add(te);

					System.out.println("Do you want add another teacher yes / no ");
					String z = SC.next();
					if (z.equals("yes")) {

						System.out.println("Enter the new teacher details ");

					} else if (z.equals("no")) {
						condation1 = false;
					}

				}
				departmentArray.add(de);
				System.out.println("Do you want add another department yes / no ");
				String z = SC.next();

				if (z.equals("no")) {
					input = 1;
				}

			}

			if (input == 2) {
				System.out.println("goodbye");
				condition = false;

			}

			else if (input == 3) {

				for (Department element : departmentArray) {
					System.out.println("---------- department Details ------------");
					System.out.println("the Department name is " + element.getNameOfDepartment());
					System.out.println("the Department ID is " + element.getIdOfDepartment());
					System.out.println("---------------<>---------------");

					
					for (teacher elementT : element.teacherArray) {
						System.out.println("---------- Techer Details -------------");
						System.out.println("The Teacher name is: " + elementT.getteName());
						System.out.println("The Teacher age is: " + elementT.getteAge());
						System.out.println("---------------<>---------------");

						
						
						for (Student elementS : elementT.studentList) {
							System.out.println("---------- Student Details -------------");
							System.out.println("The Name of student is " + elementS.getName());
							System.out.println("The gender of student is " + elementS.getStugender());
							System.out.println("---------------<>---------------");


							for (course elementSS : elementS.courseList) {
								System.out.println("---------- Course Details -------------");
								System.out.println("The course name is " + elementSS.getCourseName());
								System.out.println("The period of course is " + elementSS.getTimeOfCourse());
								System.out.println("---------------<>---------------");


								for (mark elementsR : elementSS.markList) {
									System.out.println("---------- mark Details -------------");

									System.out.println("The math mark is " + elementsR.getMathMark());
									System.out.println("The IT mark is " + elementsR.getITMark());
									System.out.println("---------------<>---------------");


								}

							}

						}

					}
				}
			}

		}
	}
}
