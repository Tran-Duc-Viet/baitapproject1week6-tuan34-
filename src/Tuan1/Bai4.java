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
		s=s+"Các số chia hết cho 3:\n";
		for(int i=1;i<100;i++) {
			if(i%3==0){
				s=s+String.valueOf(i)+" ";			
			}
		}
		s=s+"\n";
		s=s+"Các số chia hết cho 7:\n";
		for(int i=1;i<100;i++) {
			if(i%7==0){
				s=s+String.valueOf(i)+" ";			
			}
		}
		s=s+"\n";
		
	}
	
	//hàm lấy xâu kết quả
		public String getString() {
			return s;
		}


}
