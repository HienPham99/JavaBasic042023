package day5;

public class Student extends AbstractUser {
	//Atribute
	//String hoTen; //25 ký tự
	//String ngaySing; //12 ký tự
	 public String maSV; //10 ký tự
	
	//Method=behavior
	 void inThongTin() {
		//in thông tin sinh viên dạng cột
//		System.out.printf("%-25s %-12s %-10s\n","Name" ,"Nam sinh", " Ma SV ");
//		System.out.println();
//		
//		System.out.printf("%-25s %-12s %-10s\n", "Pham Thi Hien", "08/09/2009", "789");
//		
//		System.out.printf("%-25s %-12s %-10s\n", "Nguyen Ngoc Minh Chau", "06/08/2019", "5889");
		 
		 System.out.printf("%-25s %-12s %-10s\n", "Họ Tên", "Năm sinh", "Mã sinh Viên");
		 System.out.printf("%-25s %-12s %-10s\n", hoTen, ngaySinh, maSV);
//		
	}

}
