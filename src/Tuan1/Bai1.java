/*Họ và tên: Trần Đức Việt
 MSSV: 20198275
 */
package Tuan1;
/*
 * Bài 01: In ra màn hình tất cả các hợp số <100
 */
public class Bai1 {
	private String s="";
	public static void main(String[]args) {
		Bai1 bai1=new Bai1();
	}
	//phương thức khởi tạo bài 1
	public Bai1() {
		int[]a=new int[100];
		
		int j=0;
		for (int i=0;i<100;i++) {
			if (checkNguyenTo(i)) {
				continue;
			}else {
				if(i!=0&&i!=1) {
					a[j]=i;
					j++;
				}
			}
		}
		for(int i=0;i<=j-1;i++) {
			if(i ==50) {
				String b=String.valueOf(a[i])+" "+"\n";
			}
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
