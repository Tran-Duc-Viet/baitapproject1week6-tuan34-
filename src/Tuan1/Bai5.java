/*Họ và tên: Trần Đức Việt
 MSSV: 20198275
 */
package Tuan1;
/*
 * Bài 05: In ra màn hình các số nằm giữa 1000 và 2000 đồng thời chia hết cho 3,5,7
 */
public class Bai5{
	private String s="";
	//phương thức khởi tạo bài 5
	public Bai5() {
		int[]a=new int[1000];
		int j=0;
		for(int i=1000;i<2000;i++) {
			if(i%3==0)
				if(i%5==0)
					if(i%7==0) {
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
