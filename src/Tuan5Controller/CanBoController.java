/*Họ và tên: Trần Đức Việt
 MSSV: 20198275
 */
package Tuan5Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Tuan5View.CanBoView;


//lớp điều khiển giao diện cán bộ
public class CanBoController {
	private CanBoView canBoView=new CanBoView();
	//pương thức khởi tạo lớp CanBoController
	public CanBoController() {
		canBoView.initialize();
		canBoView.setActionCongNhan(new CongNhanBtn());
		canBoView.setActionKySu(new KySuBtn());
		canBoView.setActionNhanVien(new NhanVienBtn());
	}
	//lớp hành động cho nút công nhân
	class CongNhanBtn implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			new CongNhanController();
		}
	}
	//lớp hành động cho nút ký sư
	
	class KySuBtn implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			new KySuController();
		}
	}
	// lớp hành động cho nút nhân viên
	class NhanVienBtn implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			new NhanVienController();
		}
	}

}
