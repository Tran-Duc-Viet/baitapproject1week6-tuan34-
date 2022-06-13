/*Họ và tên: Trần Đức Việt
 MSSV: 20198275
 */
//Đề bài: Cho trước 1 xâu ký tự là họ tên người đầy đủ, hãy tách ra phần họ của người này.
package Tuan4;

public class Bai4 {
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

	// Phương thức lấy họ
	public static String layHo(String hoTen) {
		int n;
		String kq;
		n = hoTen.indexOf(" ");
		kq = hoTen.substring(0, n);
		return kq;
	}

	// Phương thức khởi tạo
	public Bai4(String xau) {
		String s = xau;
		String ho = layHo(xoaDauCach(s));
		this.s = this.s + "Họ:\n"+ ho;
	}

	// Phương thức trả kết quả
	public String getKetQua() {
		return s;
	}

}
