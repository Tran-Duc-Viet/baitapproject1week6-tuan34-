/*Họ và tên: Trần Đức Việt
 MSSV: 20198275
 */
//Đề bài: Cho trước 1 xâu ký tự là họ tên người đầy đủ nhưng khi nhập có thể thừa một số dấu cách. Hãy xóa đi các dấu cách thừa và in ra họ tên chính xác.
package Tuan4;


public class Bai1 {
	private String s="";
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

	// Phương thức khởi tạo
	public Bai1(String s) {
		this.s = this.s+xoaDauCach(s);
	}
	//Phương thức trả kết quả
	public String getKetQua() {
		return s;
	}

}
