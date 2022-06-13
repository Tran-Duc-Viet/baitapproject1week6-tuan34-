/*Họ và tên: Trần Đức Việt
 MSSV: 20198275
 */
package Tuan2;

public class Bai2 {
	String a;
	//Phương thức tính giao thừa
	double giaithua (int a) {
		double temp=1;
		if(a>1) {
			for(int i=1;i<=a;i++) {
				temp=temp*i;
			}
		}
		return temp;
	}
	//Phương thức tính tổng S= 1+ 1/2! + 1/3! + … + 1/N! 
	double tong(int n) {
		double tong=0.0;
		for(int i=1;i<=n;i++) {
			double b=giaithua(i);
			tong+=(1/b);
		}
		return tong;
	}
	//Phương thức khởi tạo
	public Bai2 (int n) {
		double s=tong(n);
		a=String.valueOf(s);
	
	}
	//Phương thức ấy kết quả
	public String getTong() {
		return a;
	}
	

}
