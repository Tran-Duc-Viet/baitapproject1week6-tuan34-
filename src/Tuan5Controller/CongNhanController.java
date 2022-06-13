/*Họ và tên: Trần Đức Việt
 MSSV: 20198275
 */
package Tuan5Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


import Tuan5Model.entity.Congnhan;
import Tuan5Model.model.*;
import Tuan5View.CongNhanView;
//lớp điều khiển của giao diện công nhân
public class CongNhanController {
	private CongNhanView congNhanView=new CongNhanView();
	private CongNhanModel congNhanModel=new CongNhanModel(congNhanView);
	//phương thức khởi tạo lớp CongNhanController
	public CongNhanController() {
		congNhanView.initialize();
		//đặt hiệu ứng khi bấm nút cho các nút trong lớp congNhanView 
		congNhanView.setActionAddButton(new themBtnAction());
		congNhanView.setActionXemDSButton(new xemDSBtnAction());
		congNhanView.setActionListenerFind(new findAction());
		try {
			congNhanView.setDataForTable(congNhanModel.getData());
		} catch (Exception e){
			congNhanView.showMessage(e.getMessage());
		}
		
		
	}
	//lớp hiệu ứng của nút tìm kiếm
	class findAction implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			try {
				congNhanModel.timKiem(congNhanView.getTextToFind());;
			} catch (Exception e){
				congNhanView.showMessage(e.getMessage());
			}
		}

	}
	//lớp hiệu ứng của nút thêm
	class themBtnAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			try {
				String[]t=new String[5];
				t[0]=congNhanView.getHoTen();
				t[1]=congNhanView.getTuoi();
				t[2]=congNhanView.getGioiTinh();
				t[3]=congNhanView.getDiaChi();
				t[4]=congNhanView.getBac();
				Congnhan congNhan=new Congnhan(t);
				congNhanModel.them(congNhan);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				congNhanView.showMessage(e.getMessage());
			}
		}
	}
	//lớp hiệu ứng của nút xem danh sách
	class xemDSBtnAction implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			try {
				congNhanModel.xemDS();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				congNhanView.showMessage(e.getMessage());
			}
		}
	}
	
}
