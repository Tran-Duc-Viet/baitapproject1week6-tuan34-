/*Họ và tên: Trần Đức Việt
 MSSV: 20198275
 */
//Cho danh sách họ tên đầy đủ học sinh. Hãy đếm xem có bao nhiêu bạn có tên bắt đầu bằng chữ “H”.
package Tuan4;

import java.util.ArrayList;

public class Bai9 {
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
	public static int demSoNguoiTenBatDauBangH(ArrayList<String> ds) {
		int dem = 0;
		char c2 = 'H';
		for (int i = 0; i < ds.size(); i++) {
			String s1 = layTen(ds.get(i));
			char c1 = s1.charAt(0);
			if (c1 == c2) {
				dem++;
			}
		}
		return dem;
	}

	// Phương thức khởi tạo
	public Bai9(ArrayList<String> data) {
		ArrayList<String> ds = data;
		int so = demSoNguoiTenBatDauBangH(ds);
		s = s + "Số người tên bắt đầu bằng chữ H có trong danh sách là: " + String.valueOf(so);

	}

	// Phương thức trả kết quả
	public String getKetQua() {
		return s;
	}

}
