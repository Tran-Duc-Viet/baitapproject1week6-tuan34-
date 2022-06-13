/*Họ và tên: Trần Đức Việt
 MSSV: 20198275
 */
package Tuan3;
/*
 * Bài 04: Cho một dãy các số tự nhiên, tìm và in ra 1 giá trị max của dãy này và tất cả các chỉ số ứng với giá trị max này.
 * */
public class Bai4 {
	private String s="";
	private String vitri="";
	//Phương thức tim max trong dãy
	public static int timMax(int b[]) {
		int max=b[0];
		for(int i=0;i<b.length;i++) {
			if(b[i]>max) {
				max=b[i];
			}
		}
		return max;
	}
		
	//phương thức khởi tạo
	public Bai4(int a[]) {
		int max=timMax(a);
		s=s+String.valueOf(max);
		for(int i=0;i<a.length;i++) {
			if(a[i]==max) {
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
