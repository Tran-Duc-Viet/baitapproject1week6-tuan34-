/*Họ và tên: Trần Đức Việt
 MSSV: 20198275
 */
package Tuan1;
/*
 * Bài 04: In ra màn hình các số <100 và chia hết cho 3,7
 */

public class Bai4{
	private String s="";
	//phương thức khởi tạo bài 4
	public Bai4() {
		int[]a=new int[100];
		int j=0;
		for(int i=1;i<100;i++) {
			if((i%3==0)&&(i%7==0)) {
					a[j]=i;
					j++;
			}
		}
		for(int i=0;i<j-1;i++) {
			String b=String.valueOf(a[i])+" ";
			s=s.concat(b);
		}
		
	}
	
	//hàm lấy xâu kết quả
		public String getString() {
			return s;
		}


}
