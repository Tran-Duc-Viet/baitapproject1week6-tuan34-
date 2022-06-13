/*Họ và tên: Trần Đức Việt
 MSSV: 20198275
 */
package Tuan2;
/*
 *Bài 01: Cho số tự nhiên N bất kỳ

Tính tổng S=1+1/(1+2) + 1/(1+2+3) +…+ 1/(1+2+3+..+N)
 */
public class Bai1 {
	String a;
	//Phương thức tính tổng S=1+1/(1+2) + 1/(1+2+3) +…+ 1/(1+2+3+..+N) 
	public double tinh(int n) {
		double sum=0;
		double tongso=0;
		for(int i=1;i<=n;i++) {
			tongso+=i;
			sum=sum+1/tongso;
		}
		return sum;
	}
	//Phương thức khởi tạo
	public Bai1 (int n) {
		double s=tinh(n);
		a=String.valueOf(s);
	
	}
	//Phương thức ấy kết quả
	public String getTong() {
		return a;
	}
	

}
