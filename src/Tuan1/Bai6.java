/*Họ và tên: Trần Đức Việt
 MSSV: 20198275
 */
package Tuan1;
/*
 *Bài 06: In ra màn hình 5 số hoàn hảo đầu tiên (Số hoàn hảo là số có tổng bằng các ước số của mình kể cả 1)
 */
public class Bai6{
	private String s="";
	//phương thức khởi tạo bài 6
	public Bai6() {
		int[]c=new int[1000];
		int count = 0;
		for (int i = 0; i < 100; i++) {
			int a = (int) Math.pow(2.0, (double) (i - 1));
			int b = (int) Math.pow(2.0, i) - 1;
			if (checkNguyenTo(b)) {
				int sohoanhao = a * b;
				if (kiemtrasohoanhao(sohoanhao)) {
					c[count]=sohoanhao;
					count += 1;
					if (count == 5)
						break;
				}
			}
		}
		for(int i=0;i<count;i++) {
			String k=String.valueOf(c[i])+" ";
			s=s.concat(k);
		}
		
	}
	//hàm lấy xâu kết quả
	public String getString() {
			return s;
		}
		//tinh tong cac uoc cua mot so
	public static boolean kiemtrasohoanhao(int n) {
		int sum = 0;
		for(int i=1;i<=n/2;i++){
		    if(n%i==0) 
		        sum+=i;
		    }
		    if(sum==n)return true;
		    return false;
	}
		//Phương thức check số nguyên tố
		public static boolean checkNguyenTo( int n) {
			if(n<2) {
				return false;
			}
			int a = (int) Math.sqrt(n);
		    for (int i = 2; i <= a; i++) {
		        if (n % i == 0) {
		                return false;
		        }
		    }
		    return true;
				
		}


}
