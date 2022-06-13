/*Họ và tên: Trần Đức Việt
 MSSV: 20198275
 */
//Đề bài: Cho danh sách họ tên đầy đủ học sinh. Hãy đếm xem có bao nhiêu bạn có phần đệm là “Thị”.
package Tuan4;

import java.util.ArrayList;

public class Bai8 {
	private String s = "";

	
	// Phương thức lấy đệm
		public static String layDemDauTien(String hoTen) {
			int n, m;
			String kq;
			m = hoTen.indexOf(" ");
			n = hoTen.lastIndexOf(" ");
			kq = hoTen.substring(m+1, n); 
			String[] s = kq.split(" ");
			if(s.length>=2) {
				return s[0];
			}
			return kq;
		}
		
	// Hàm đếm số người có phần đệm là Thị có trong ds
		public static int demSoNguoiCoDemThi(ArrayList<String> ds) {
			int dem = 0;
			for (int i = 0; i < ds.size(); i++) {
				String s1 = layDemDauTien(ds.get(i));

				if (s1.equals("Thị")) {
					dem++;
				}
			}
			return dem;
		}



	// Phương thức khởi tạo
	public Bai8(ArrayList<String> data) {
		ArrayList<String> ds = data;
		int so = demSoNguoiCoDemThi(ds);
		s = s + "Số người có đệm Thị có trong danh sách: " + String.valueOf(so);

	}

	// Phương thức trả kết quả
	public String getKetQua() {
		return s;
	}

}
