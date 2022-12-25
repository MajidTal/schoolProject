package src;

import java.util.ArrayList;
import java.util.Scanner;

public class mainpage {

	public static void main(String[] args) {

		ArrayList<shope> shopeList = new ArrayList<shope>();
		shope sh = new shope();
		Scanner sc = new Scanner(System.in);

		boolean cond1 = true;

		while (cond1) {
			System.out.println("Enter the shop name");
			sh.setShopName(sc.next());
			System.out.println("Enter the location of shope");
			sh.setShoplocation(sc.next());
			shopeList.add(sh);

			boolean cond2 = true;
			while (cond2) {
				product pr = new product();
				System.out.println("Enter the proudct name");
				pr.setProName(sc.next());
				System.out.println("Enter the price of product");
				pr.setProprice(sc.nextInt());
				sh.prodctArray.add(pr);

				boolean cond3 = true;
				while (cond3) {
					coffee co = new coffee();

					System.out.println("Enter the color of coffee :");
					co.setColorOfCoffee(sc.next());
					System.out.println("Enter the type of coffee :");
					co.setTypeOfCoffee(sc.next());
					sh.pr.coffeelist.add(co);
					
					cond1 = false;
					System.out.println("Do you want to add a new coffee");
					String a = sc.next();
					if (a.equals("yes")) {

						cond3 = true;

					}
					cond3 = false;
				}
			}
			System.out.println("Do you want to add a new product");
			String b = sc.next();

			if (b.equals("no")) {

				cond2 = false;
			}
		}
		System.out.println("Do you want to add a new shop");
		String cc = sc.next();

		if (cc.equals("no")) {
			cond1 = false;
		}

		for (shope element2 : shopeList) {
			System.out.println("---------------shope details-------------");
			System.out.println("The shope name is: " + element2.getShopName());
			System.out.println("The location of product is: " + element2.getShoplocation());

		}

		for (product element1 : sh.prodctArray) {
			System.out.println("---------------product details-------------");
			System.out.println("The product name is: " + element1.getProName());
			System.out.println("The product price is: " + element1.getProprice());

		}
		for (coffee elemant : sh.pr.coffeelist) {

			System.out.println("------------coffee Detalis-----------");
			System.out.println("The color of coffee is: " + elemant.getColorOfCoffee());
			System.out.println("The type of coffee is:  " + elemant.getTypeOfCoffee());

		}

		sc.close();
	}

}
