package day5;

public class Admin extends User {
	
public	String maNV;
	
	 void inThongTin() {

		// in thông tin sinh viên dạng cột
		
		System.out.printf("%-25s %-12s %-10s\n", "Họ Tên", "Năm sinh", "Mã Nhân Viên");
		System.out.printf("%-25s %-12s %-10s\n", hoTen, ngaySinh, maNV);

	}

}
