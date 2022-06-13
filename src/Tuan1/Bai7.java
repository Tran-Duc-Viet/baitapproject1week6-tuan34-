/*Họ và tên: Trần Đức Việt
 MSSV: 20198275
 */
package Tuan1;
/*
 *Bài 07: Trong các số tự nhiên <=100 hãy đếm xem có bao nhiêu số

a. Chia hết cho 5

b. Chia 5 dư 1

c. Chia 5 dư 2

d. Chia 5 dư 3
 */
public class Bai7{
	private String sa;
	private String sb;
	private String sc;
	private String sd;
	//phương thức khởi tạo bài 6
	public Bai7() {
		int[]a=new int[1];
		//cau a
				int countcaua=0;
				for(int i=1;i<=100;i++) {
					if(i%5==0) {
						countcaua+=1;
					}	
				}
				sa="a, Có "+String.valueOf(countcaua)+" số";
				//cau b
				int countcaub=0;
				for(int i=1;i<=100;i++) {
					if(i%5==1) {
						countcaub+=1;
					}	
				}
				sb="b, Có "+String.valueOf(countcaub)+" số";
				//cau c
				int countcauc=0;
				for(int i=1;i<=100;i++) {
					if(i%5==1) {
						countcauc+=1;
					}	
				}
				sc="c, Có "+String.valueOf(countcauc)+" số";
				//cau d
				int countcaud=0;
				for(int i=1;i<=100;i++) {
					if(i%5==1) {
						countcaud+=1;
					}	
				}
				sd="d, Có "+String.valueOf(countcaud)+" số";
		
	}
	//hàm lấy xâu kết quả
	public String getStringCaua() {
			return sa;
			}
	public String getStringCaub() {
		return sb;
		}
	public String getStringCauc() {
		return sc;
		}
	public String getStringCaud() {
		return sd;
		}
	


}
