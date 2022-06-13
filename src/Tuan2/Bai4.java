/*Họ và tên: Trần Đức Việt
 MSSV: 20198275
 */
package Tuan2;
/*
 * Bài 04: Dãy Fibonaxi 1, 2, 3, … F(k) = F(k-1) + F(k-2). Tính số Fibonaxi thứ N.
 * */
public class Bai4 {
	String a;
	//Phương thức tính số fibonaxi thứ n
	int fibonaxi(int n) {
		int sum=0;
		if(n>2) {
			sum=fibonaxi(n-1)+fibonaxi(n-2);
			return sum;
		}
		return n;
		
	}
	//Phương thức khởi tạo
	public Bai4 (int n) {
		int s=fibonaxi(n);
		a=String.valueOf(s);
	
	}
	//Phương thức lấy kết quả
	public String getSoFibonaxi() {
		return a;
	}
	

}
