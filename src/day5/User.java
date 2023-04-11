package day5;

public class User {
	public String hoTen;
	public String ngaySinh;

	void inThongtin() {

		// In thông tin dạng cột

		System.out.printf("%-25s %-12s %-10s\n", "Name", "Nam sinh");
		System.out.println();
		System.out.printf("%-25s %-12s %-10s\n", hoTen, ngaySinh);

		// System.out.printf("%-25s %-12s %-10s\n", "Pham Thi Hien", "08/09/2009",
		// "789");

		// System.out.printf("%-25s %-12s %-10s\n", "Nguyen Ngoc Minh Chau",
		// "06/08/2019", "5889");

	}

}
