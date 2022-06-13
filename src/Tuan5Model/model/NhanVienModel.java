/*Họ và tên: Trần Đức Việt
 MSSV: 20198275
 */
package Tuan5Model.model;

import java.util.ArrayList;
import Tuan5View.NhanVienView;
import Tuan5Model.entity.*;
//Lớp thao tác dữ liệu nhân viên
public class NhanVienModel {
	private NhanVienView nhanVienView=null;
	protected ArrayList<Nhanvien> nvList = new ArrayList<Nhanvien>();//ds nhân viên
	//phuong thức khởi tạo
	public NhanVienModel(NhanVienView nhanVienView) {
		this.nhanVienView=nhanVienView;
	}
	//phương thức thêm mới nhân viên vào danh sách nhân viên
	public void them(Nhanvien nhanVien) {
		if(!nvList.contains(nhanVien)) {
			nvList.add(nhanVien);
		}
		nhanVienView.setDataForTable(nvList);
		
	}
	//phương thức xem danh sách nhân viên
	public void xemDS() {

		nhanVienView.setDataForTable(nvList);
		
	}
	//phương thức lấy danh sách nhân viên
	public ArrayList<Nhanvien> getData(){
		ArrayList<Nhanvien> dulieu = new ArrayList<Nhanvien>();
		for (Nhanvien i : nvList){
				dulieu.add(i);
			}
		
		return dulieu;
	}
	//phuog thức tìm danh sách nhân viên có họ tên nào đó
	public void timKiem(String name) {
		ArrayList<Nhanvien> dulieu = new ArrayList<Nhanvien>();
		for (Nhanvien i : nvList) 
			if (i.getHoTen().toUpperCase().contains(name.toUpperCase())) {
				dulieu.add(i);
			}
		
		nhanVienView.setDataForTable(dulieu);
	}
}
