package day2;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			switch (n) {
			case 2:
				System.out.println("Thứ " + n);
				break;
			case 3:
				System.out.println("Thứ " + n);
				break;
			case 4:
				System.out.println("Thứ " + n);
				break;
			case 5:
				System.out.println("Thứ " + n);
				break;
			case 6:
				System.out.println("Thứ " + n);
				break;
			case 7:
				System.out.println("Thứ " + n);
				break;
			case 8:
				System.out.println("Chủ nhật");
				break;
			default:
				System.out.println("Vui lòng nhật lại n");
				break;

			}

		}

	}
}
