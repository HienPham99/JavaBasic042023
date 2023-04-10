package day3;

public class LoopAndArray {

	public static void main(String[] args) {
		// inMang();
		// inMang2();
		// SumAndAverage();
		// SumAndAverageEx2();
		// SumAndAverageEx3();
		// SumAndAverageEx5();
		// SumSquares();
		// HarmonicSum();
		// HarmonicSum1();
		// SquareBoard();
		CheckerBoard();
	}

	// B_Loop
	// Bài 1:
	public static void inMang() {
		int a[] = new int[] { 1, 3, 5, 8, 9 };
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

	public static void inMang2() {
		int a[] = new int[5];
		a[0] = 1;
		a[1] = 3;
		a[2] = 5;
		a[3] = 8;
		a[4] = 9;
		for (int i = 0; i <= a.length - 1; i++) {
			System.out.println(a[i]);
		}

	}

	// Bài 2:

	public static void SumAndAverage() {
		int sum = 0;
		float avg = 0;

		for (int i = 0; i <= 100; i++) {
			sum = sum + i;
		}

		avg = (float) sum / 100;

		System.out.println("The sum is: " + sum);
		System.out.println("The avg is: " + avg);

	}

	// Bài 3:
	public static void SumAndAverageEx2() {
		int sum = 0;
		int count = 0;
		double aveg = 0;
		for (int i = 111; i <= 8899; i++) {
			sum = sum + i;
			count++;
		}
		aveg = (double) sum / count;
		System.out.println("The sum is: " + sum);
		System.out.println("The aveg is: " + Math.round(aveg * 100.0) / 100.0);

	}

	// Bài 4:

	public static void SumAndAverageEx3() {

		int sum = 0;
		int count = 0;
		for (int i = 1; i < 100; i++) {
			if (i % 2 != 0) {
				// System.out.println("Các số lẻ gồm: " + i);
				sum = sum + i;
				count = count + 2;
			}

		}
		System.out.println("The sum is: " + sum);
		float avg = 0;
		avg = (float) sum / count;
		System.out.println("The avg is: " + avg);

	}

	// Bài 5:
	public static void SumAndAverageEx5() {

		int sum = 0;
		int count = 0;
		float avg = 0;
		for (int i = 0; i < 100; i++) {
			if (i % 7 == 0)
				System.out.println("Các số chia hết cho 7 là: " + i);
			sum = sum + i;
			count = count + 1;
		}
		System.out.println("The sum is: " + sum);
		avg = (float) sum / count;
		System.out.println("The avg is: " + avg);
	}

	// Bài 6:
	public static void SumSquares() {
		int bp = 0;
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			bp = i * i;
			System.out.println("Dãy số tính bình phương là: " + bp);
			sum = sum + bp;
		}
		System.out.println("The Sum of squares is: " + sum);

	}

	// Bài 7:

	public static double HarmonicSum() {
		double har = 0;
		// int sum = 0;
		for (int i = 1; i <= 50000; i++) {
			har += (double) 1 / i;
			// sum = (float) sum + har;
		}
		System.out.println("Kết quả HarmonicSum left to right là: " + har);
		return har;
	}

	public static double HarmonicSum1() {
		double har = 0;
		for (int i = 50000; i >= 1; i--) {
			har = har + (double) 1 / i;

		}
		System.out.println("Kết quả HarmonicSum right to left là: " + har);
		return har;

	}

	// Bài 8:

	public static void SquareBoard() {
		int a = 5;
		int b = 5;
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				System.out.print("# ");
			}
			System.out.println(" ");
		}

	}

	// Bài 9

	public static void CheckerBoard() {
		int a = 7;
		int b = 7;
		for (int i = 1; i <= a; i++) {
			if (i % 2 == 0) {
				System.out.print(" ");
			}
			for (int j = 1; j <= b; j++) {
				System.out.print("# ");

			}
			System.out.println();
		}

	}
	
	//Bài 10:
	
	
	
	
}
