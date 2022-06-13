/*Họ và tên: Trần Đức Việt
 MSSV: 20198275
 */
//Đề bài: Cho một xâu ký tự bao gồm toàn các ký tự 0,1. Hãy biến đổi xâu này theo cách 0🡪1, 1🡪0 và in ra kết quả.
package Tuan4;

public class Bai5 {
	private String s = "";

	// Phương thức biến đổi 1->0 và 0->1
	public String xaubiendoi10va01(String s) {
		char[] s1 = s.toCharArray();
		for (int i = 0; i < s1.length; i++) {
			if (s1[i] == '0') {
				s1[i] = '1';
			} else if (s1[i] == '1') {
				s1[i] = '0';
			}
		}
		s = "";
		for (int i = 0; i < s1.length; i++) {
			s += s1[i];
		}
		return s;
	}

	// Phương thức khởi tạo
	public Bai5(String xau) {
		String s = xau;
		this.s = this.s + "Xâu sau khi biến đổi là:\n" + xaubiendoi10va01(s);
	}

	// Phương thức trả kết quả
	public String getKetQua() {
		return s;
	}

}
