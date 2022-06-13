/*Họ và tên: Trần Đức Việt
 MSSV: 20198275
 */
package Tuan3;
/*
 * Bài 05: Cho một dãy số tự nhiên, hãy đếm xem trong dãy số trên có bao nhiêu số nguyên tố, có bao nhiêu hợp số.
 * */
public class Bai5 {
	private String countNguyenTo="";
	private String countHopSo="";
	
	//Phương thức check số nguyên tố
	public boolean checkNguyenTo( int n) {
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
	//phương thức khởi tạo
	public Bai5(int a[]) {
		int countNguyenTo=demSoSoNguyenTo(a);
		int countHopSo=demSoHopSo(a);
		if(countNguyenTo==0) {
			this.countNguyenTo=this.countNguyenTo+"Không có";
		}else {
			this.countNguyenTo=this.countNguyenTo+String.valueOf(countNguyenTo);
		}
		if(countHopSo==0) {
			this.countHopSo=this.countHopSo+"Không có";
		}else {
			this.countHopSo=this.countHopSo+String.valueOf(countHopSo);
		}
		
		
	}
	//Phương thức demSoSoNguyenTo
	public int  demSoSoNguyenTo(int b[]) {
		int count=0;
		for(int i=0;i<b.length;i++) {
			if(checkNguyenTo(b[i])) {
				count++;
			}
		}
		return count;
	}
	//Phương thức check số họp số
	public boolean checkHopSo( int n) {
		if(n<2) {
			return false;
		}else if(checkNguyenTo(n)) {
			return false;
		}
		return true;
			
	}
	public int  demSoHopSo(int b[]) {
		int count=0;
		for(int i=0;i<b.length;i++) {
			if(checkHopSo(b[i])) {
				count++;
			}
		}
		return count;
	}
	//Phương thức lấy xâu đáp án
	public String getSoSoNguyenTo() {
		return countNguyenTo;
	}
	public String getSoSoHopSo() {
		return countHopSo;
	}
	

}
