package Tuan5View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.JButton;

public class CanBoView {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JButton btnCongNhan,btnKySu,btnNhanVien,btnClose;

	/**
	 * Launch the application.
	 */
	
	public CanBoView() {
	}

	/**
	 * Create the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(SystemColor.menu);
		frame.setBounds(100, 100, 907, 508);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Giao diện main quản lý cán bộ - Trần Đức Việt - MSSV: 20198275");
		frame.setVisible(true);
		
		lblNewLabel = new JLabel("QUẢN LÝ CÁN BỘ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(316, 10, 252, 68);
		frame.getContentPane().add(lblNewLabel);
		
		btnCongNhan = new JButton("Quản lý công nhân");
		btnCongNhan.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCongNhan.setBounds(86, 145, 187, 68);
		frame.getContentPane().add(btnCongNhan);
	
		btnKySu = new JButton("Quản lý kỹ sư");
		btnKySu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnKySu.setBounds(357, 145, 187, 68);
		frame.getContentPane().add(btnKySu);
		
		btnNhanVien = new JButton("Quản lý nhân viên");
		btnNhanVien.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNhanVien.setBounds(626, 145, 187, 68);
		frame.getContentPane().add(btnNhanVien);
		
		btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnClose.setBounds(357, 252, 187, 68);
		frame.getContentPane().add(btnClose);
		btnClose.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("0");
				frame.setVisible(false);
				frame.dispose();
			}
		});
	}
	//các phương thức gắn hiệu ứng cho các nút công nhân, ký sư, nhân viên, close
		public void setActionCongNhan(ActionListener action) {
			btnCongNhan.addActionListener(action);
		}
		public void setActionKySu(ActionListener action) {
			btnKySu.addActionListener(action);
		}
		public void setActionNhanVien(ActionListener action) {
			btnNhanVien.addActionListener(action);
		}
		
	
}
