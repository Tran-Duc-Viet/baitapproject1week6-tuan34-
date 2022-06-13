/*Họ và tên: Trần Đức Việt
 MSSV: 20198275
 */
//Đề bài: Cho trước 1 xâu ký tự là họ tên người đầy đủ, hãy tách ra phần tên của người này.
package Tuan4;

public class Bai3 {
	private String s = "";

	// Phương thức xóa dấu cách
	public static String xoaDauCach(String ten) {
		String[] s = ten.split(" ");
		ten = "";
		for (int i = 0; i < s.length; i++) {
			if (s[i].equals(" ") == false) {
				ten += " " + s[i];
				ten = ten.trim();
			}

		}
		return ten.trim();
	}

	// Phương thức lấy tên
	public static String layTen(String hoTen) {
		int n;
		String kq;
		n = hoTen.lastIndexOf(" ");
		kq = hoTen.substring(n + 1);
		return kq;

	}

	// Phương thức khởi tạo
	public Bai3(String xau) {
		String s = xau;
		String ten = layTen(xoaDauCach(s));
		this.s = this.s + "Tên:" + "\n" + ten;
	}

	// Phương thức trả kết quả
	public String getKetQua() {
		return s;
	}

}
