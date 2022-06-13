/*Họ và tên: Trần Đức Việt
 MSSV: 20198275
 */
//Đề bài: Cho trước xâu ký tự S, in ra xâu S1 ngược lại xâu S.
package Tuan4;

import java.util.Scanner;

public class Bai6 {
	private String s = "";

	// Phương thức in xâu ngược lại
	public String inXauNguocLai(String s) {
		int n = s.length();
		char s1[] = new char[n];
		for (int i = 0; i < n; i++) {
			s1[i] = s.charAt(i);
		}
		s = "";
		System.out.println("Xau nguoc lai:");
		for (int i = n - 1; i >= 0; i--) {
			s = s + s1[i];
		}
		return s;

	}

	// Phương thức khởi tạo
	public Bai6(String xau) {
		String s = xau;
		this.s = this.s + "Xâu ngược lại:\n" + inXauNguocLai(s);
	}

	// Phương thức trả kết quả
	public String getKetQua() {
		return s;
	}

}
