package day5;

public class Teacher extends User {

 public	String maGV;

	void inThongTin() {
		
		// in thông tin sinh viên dạng cột
		
		System.out.printf("%-25s %-12s %-10s\n", "Họ Tên", "Năm sinh", "Mã Giao Viên");
		System.out.printf("%-25s %-12s %-10s\n", hoTen, ngaySinh, maGV);

	}

}
