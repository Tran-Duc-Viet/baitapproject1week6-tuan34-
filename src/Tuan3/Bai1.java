/*Họ và tên: Trần Đức Việt
 MSSV: 20198275
 */
package Tuan3;
/*
 * Bài 01: Cho một dãy số tự nhiên, viết chương trình sắp xếp dãy này theo thứ tự giảm dần.
 * */
public class Bai1 {
	private String s="";
	//Phương thức xắp xếp
	public void xapxep(int b[]) {
		int c=b[0];
		for(int i=0;i<(b.length-1);i++) {
			for(int j=i+1;j<b.length;j++) {
				if(b[i]<b[j]) {
					c=b[i];
					b[i]=b[j];
					b[j]=c;
				}
			}
		}
	}
	//phương thức khởi tạo
	public Bai1(int a[]) {
		xapxep(a);
		for(int i=0;i<a.length;i++) {
			s=s+String.valueOf(a[i])+" ";
		}
		
		
	}
	//phuong thức lấy xâu kết quả
	public String getKetQua() {
		return s;
	}
	

}
