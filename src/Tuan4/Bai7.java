/*Họ và tên: Trần Đức Việt
 MSSV: 20198275
 */
//Đề bài: Cho danh sách họ tên đầy đủ học sinh. Hãy đếm xem có bao nhiêu bạn tên “An”.
package Tuan4;

import java.util.ArrayList;

public class Bai7 {
	private String s = "";

	// Phương thức lấy tên
	public static String layTen(String hoTen) {
		int n;
		String kq;
		n = hoTen.lastIndexOf(" ");
		kq = hoTen.substring(n + 1);
		return kq;

	}

	// Phương thức đếm số người tên An có trong ds
	public static int demSoNguoiTen(ArrayList<String> ds) {
		int dem = 0;
		for (int i = 0; i < ds.size(); i++) {
			String s1 = layTen(ds.get(i));
			if (s1.equals("An")) {
				dem++;
			}
		}
		return dem;
	}

	// Phương thức khởi tạo
	public Bai7(ArrayList<String> data) {
		ArrayList<String> ds = data;
		int so = demSoNguoiTen(ds);
		s = s + "Số người tên An có trong danh sách: " + String.valueOf(so);

	}

	// Phương thức trả kết quả
	public String getKetQua() {
		return s;
	}

}
