/*Họ và tên: Trần Đức Việt
 MSSV: 20198275
 */
package Tuan1;
/*
 * Bài 03: In ra màn hình tất cả các số nguyên tố từ 1000 đến 2000
 */
public class Bai3{
	private String s="";
	//phương thức khởi tạo bài 3
	public Bai3() {
		int[]a=new int[1000];
		
		int j=0;
		for (int i=1000;i<=2000;i++) {
			if (checkNguyenTo(i)) {
					a[j]=i;
					j++;
			}
		}
		for(int i=0;i<j-1;i++) {
			String b=String.valueOf(a[i])+" ";
			s=s.concat(b);
		}
		
	}
	//phương thức check số nguyên tố
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
	//hàm lấy xâu kết quả
		public String getString() {
			return s;
		}


}
