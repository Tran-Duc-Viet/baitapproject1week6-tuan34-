/*Họ và tên: Trần Đức Việt
 MSSV: 20198275
 */
package Tuan5Model.model;
import Tuan5Model.entity.*;

import java.util.ArrayList;
import java.util.List;

import Tuan5View.CongNhanView;
//lớp thao tác với dữ liệu của công nhân
public class CongNhanModel {
	private CongNhanView congNhanView=null;
//danh sách công nhân
	protected ArrayList<Congnhan> cnList = new ArrayList<Congnhan>();
	//phuong thức khởi tạo 
	public CongNhanModel(CongNhanView congNhanView) {
		this.congNhanView=congNhanView;
	}
	//phương thức thêm công nhan mới vào ds
	public void them(Congnhan congnhan) {
		if(!cnList.contains(congnhan)) {
			cnList.add(congnhan);
		}
		congNhanView.setDataForTable(cnList);
		
	}
	//phuong thức xem ds
	public void xemDS() {

		congNhanView.setDataForTable(cnList);
		
	}
	//phương thức lấy ds công nhân
	public ArrayList<Congnhan> getData(){
		ArrayList<Congnhan> dulieu = new ArrayList<Congnhan>();
		for (Congnhan i : cnList){
				dulieu.add(i);
			}
		
		return dulieu;
	}
	// phuong thức tìm kiếm danh sách người có họ tên nào đó
	public void timKiem(String name) {
		ArrayList<Congnhan> dulieu = new ArrayList<Congnhan>();
		for (Congnhan i : cnList) 
			if (i.getHoTen().toUpperCase().equals(name.toUpperCase())) {
				dulieu.add(i);
			}
		congNhanView.setDataForTable(dulieu);
	}
	

}
