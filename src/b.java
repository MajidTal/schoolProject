package src;

import java.util.ArrayList;
import java.util.Scanner;

public class b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<course> a = new ArrayList<course>();

		boolean choice = true;

		while (choice) {
			course c = new course();
			System.out.println("enter course name :");
			c.setCourseName(sc.next()); // direct read from user
			System.out.println("enter course periond :");
			c.setTimeOfCourse(sc.nextInt());
			a.add(c);
			System.out.println("Do you want add another course if yes press 1");
			System.out.println("Do you don't want to add another course press 2");

			if (sc.nextInt() != 1) {
				choice = false;
				
				for (course element : a) {
					System.out.println("-------------------------");
					System.out.println(element.getCourseName());
					System.out.println(element.getTimeOfCourse());
				}
				System.out.println("good bye");

			}

		}
		sc.close();

	}
}
