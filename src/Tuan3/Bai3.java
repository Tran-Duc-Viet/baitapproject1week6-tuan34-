/*Họ và tên: Trần Đức Việt
 MSSV: 20198275
 */
package Tuan3;
/*
 * Bài 03: Cho một dãy các số tự nhiên, tìm và in ra 1 giá trị min của dãy này và tất cả các chỉ số ứng với giá trị min này.
 * */
public class Bai3 {
	private String s="";
	private String vitri="";
	//Phương thức tim min trong dãy
	public int timMin(int b[]) {
		int min=b[0];
		for(int i=0;i<b.length;i++) {
			if(b[i]<min) {
				min=b[i];
			}
		}
		return min;
	}
		
	//phương thức khởi tạo
	public Bai3(int a[]) {
		int min=timMin(a);
		s=s+String.valueOf(min);
		for(int i=0;i<a.length;i++) {
			if(a[i]==min) {
				vitri=vitri+String.valueOf(i+1)+" ";
			}
		}
		
		
	}
	//phuong thức lấy xâu kết quả
	public String getMin() {
		return s;
	}
	//Phuong thức rả về vị trí của min
	public String getVitri() {
		return vitri;
	}
	

}
