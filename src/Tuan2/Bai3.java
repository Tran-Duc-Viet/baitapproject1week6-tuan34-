/*Họ và tên: Trần Đức Việt
 MSSV: 20198275
 */
package Tuan2;
/*
 * Bài 03: Cho số tự nhiên N bất kỳ,

tính tổng S=1+1/(1+2!) + 1/(1+2!+3!)+ ..+ 1/(1+2!+3!+..+N!)
 * */

public class Bai3 {
	String a;
	//Phương thức tính giai thừa
	double giaithua (int n) {
		double temp=1;
		if(n>1) {
			for(int i=1;i<=n;i++) {
				temp=temp*i;
			}
		}
		return temp;
	}
	//Phương thức tính tổng phần mẫu
	double tongmau(int n) {
		double sum=0;
		for(int i=1;i<=n;i++) {
			sum+=giaithua(i);
			}
		return sum;
	}
	//Phương thức tính tổng S=1+1/(1+2!) + 1/(1+2!+3!)+ ..+ 1/(1+2!+3!+..+N!)
	double tong(int n) {
		double tong=0.0;
		for(int i=1;i<=n;i++) {
			double b=tongmau(i);
			tong+=(1/b);
		}
		return tong;
	}
	//Phương thức khởi tạo
	public Bai3 (int n) {
		double s=tong(n);
		a=String.valueOf(s);
	
	}
	//Phương thức lấy kết quả
	public String getTong() {
		return a;
	}
	

}
