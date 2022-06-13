/*Họ và tên: Trần Đức Việt
 MSSV: 20198275
 */
package Tuan5Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import Tuan5Controller.KySuController.themBtnAction;
import Tuan5Controller.KySuController.xemDSBtnAction;
import Tuan5View.NhanVienView;
import Tuan5Model.entity.Nhanvien;
import Tuan5Model.model.NhanVienModel;
//Lớp điều khiển cửa giao diện nhân viên
public class NhanVienController {
	private NhanVienView nhanVienView=new NhanVienView();
	private NhanVienModel nhanVienModel=new NhanVienModel(nhanVienView);
//Phương thức khởi tạo lớp NhanVienController
	public NhanVienController() {
		nhanVienView.initialize();
		//đặt hiệu ứng cho các nút trong giao diện nhân viên
		nhanVienView.setActionAddButton(new themBtnAction());
		nhanVienView.setActionXemDsButton(new xemDSBtnAction()); 
		nhanVienView.setActionListenerFind( new findAction());
		try {
			nhanVienView.setDataForTable(nhanVienModel.getData());;
		} catch (Exception e){
			nhanVienView.showMessage(e.getMessage());
		}
		
	}
	//lớp hiệu ứng của nút thêm
	class themBtnAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			try {
				String[]t=new String[5];
				t[0]=nhanVienView.getHoTen();
				t[1]=nhanVienView.getTuoi();
				t[2]=nhanVienView.getGioiTinh();
				t[3]=nhanVienView.getDiaChi();
				t[4]=nhanVienView.getCongViec();
				Nhanvien nhanVien=new Nhanvien(t);
				nhanVienModel.them(nhanVien);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				nhanVienView.showMessage(e.getMessage());
			}
		}
	}
	//lớp hiệu ứng của nút tìm kiếm
	class findAction implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			try {
				nhanVienModel.timKiem(nhanVienView.getTextToFind());;
			} catch (Exception e){
				nhanVienView.showMessage(e.getMessage());
			}
		}
	}
	
		
	
//lớp hiệu ứng của nút xem danh sách
	class xemDSBtnAction implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			try {
				nhanVienModel.xemDS();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				nhanVienView.showMessage(e.getMessage());
			}
		}
	}

}

