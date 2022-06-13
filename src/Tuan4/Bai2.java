/*Họ và tên: Trần Đức Việt
 MSSV: 20198275
 */
//Đề bài: Cho trước xâu ký tự bất kỳ. Hãy đếm xem trong xâu có bao nhiêu lần xuất hiện xâu con “abc”.
package Tuan4;

public class Bai2 {
	private String s="";
	//Phương thức khởi tạo
	public Bai2(String xau) {
		String s1 = xau;
		String s2 = "abc";
		int b = s1.length();
		int c = s2.length();
		String[] temp = s1.split(s2);
		String s = "";
		for (int i = 0; i < temp.length; i++) {
			s += temp[i];
		}
		int d = s.length();
		int ketqua = (b - d) / c;
		this.s=this.s+"Số xâu con abc trong xâu là: "+String.valueOf(ketqua);

	}
	//Phương thức trả kết quả
		public String getKetQua() {
			return s;
		}

}
