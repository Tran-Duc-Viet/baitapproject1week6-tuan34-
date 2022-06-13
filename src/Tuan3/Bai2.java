/*Họ và tên: Trần Đức Việt
 MSSV: 20198275
 */
package Tuan3;

/*
 * Bài 02: Cho dãy số tự nhiên, in ra màn hình tất cả các số nguyên tố của dãy này.
 * */
public class Bai2 {
	private String s = "";

	// Phương thức check số nguyên tố
	public boolean checkNguyenTo(int n) {
		if (n < 2) {
			return false;
		}
		int a = (int) Math.sqrt(n);
		for (int i = 2; i <= a; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;

	}

	// phương thức check so có trong dãy hay không
	public boolean checkSo(int b[], int a) {
		for (int i = 0; i < b.length; i++) {
			if (b[i] == a) {
				return true;
			}
		}
		return false;

	}

	// phương thức khởi tạo
	public Bai2(int a[]) {
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			if (checkNguyenTo(a[i])) {
				if (!checkSo(b, a[i])) {
					b[i] = a[i];
				}
			}

		}

		for (int i = 0; i < a.length; i++) {
			if (b[i] != 0) {
				s = s + String.valueOf(b[i]) + " ";
			}
		}
		if (s.equals("")) {
			s = s + "Không có";
		}

	}

	// phuong thức lấy xâu kết quả
	public String getKetQua() {
		return s;
	}

}
