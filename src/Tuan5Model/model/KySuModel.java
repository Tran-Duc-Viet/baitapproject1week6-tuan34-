/*Họ và tên: Trần Đức Việt
 MSSV: 20198275
 */
package Tuan5Model.model;

import java.util.ArrayList;
import Tuan5Model.entity.*;
import Tuan5View.KySuView;
import Tuan5Model.entity.Congnhan;
//lớp thao tác với dữ liệu của ký sư
public class KySuModel {
	private KySuView kySuView=null;
	protected ArrayList<Kysu> ksList = new ArrayList<Kysu>();//ds ký sư
//phuownng thức khởi tạo
	public KySuModel(KySuView kySuView) {
		this.kySuView=kySuView;
	}
//phương thức thêm ký sư mới vào ds ký sư
	public void them(Kysu Kysu) {
		if(!ksList.contains(Kysu)) {
			ksList.add(Kysu);
		}
		kySuView.setDataForTable(ksList);
		
	}
//phương thức xem danh sách
	public void xemDS() {

		kySuView.setDataForTable(ksList);
		
	}
//phương thức lấy danh sách ký sư
	public ArrayList<Kysu> getData(){
		ArrayList<Kysu> dulieu = new ArrayList<Kysu>();
		for (Kysu i : ksList) { 
				dulieu.add(i);
				}
			
		
		return dulieu;
	}
//phương thức tìm kiếm danh sách nhứng người có họ tên nào đó
	public void timKiem(String name) {
		ArrayList<Kysu> dulieu = new ArrayList<Kysu>();
		for (Kysu i : ksList) 
			if (i.getHoTen().toUpperCase().contains(name.toUpperCase())) {
				dulieu.add(i);
			}
		
		kySuView.setDataForTable(dulieu);
	}

}
