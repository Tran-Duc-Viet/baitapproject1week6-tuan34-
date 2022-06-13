/*Họ và tên: Trần Đức Việt
 MSSV: 20198275
 */
package Tuan1;
/*
 * Bài 02: In ra màn hình 20 số nguyên tố đầu tiên
 */
public class Bai2 {
	private String s="";
	//phương thức khởi tạo bài 2
	public Bai2() {
		int[]a=new int[100];
		
		int j=0;
		for (int i=0;i<100;i++) {
			if (checkNguyenTo(i)) {
					a[j]=i;
					if(j==19)break;
					j++;
			}
		}
		for(int i=0;i<20;i++) {
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
