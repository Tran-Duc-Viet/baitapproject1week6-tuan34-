package Mainmenu;
/*Họ và tên: Trần Đức Việt
MSSV: 20198275
*/

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Tuan1.Tuan29;
import Tuan2.Tuan30;
import Tuan3.Tuan31;
import Tuan4.Tuan32;
import Tuan5Controller.CanBoController;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainView {
	private JFrame frame;
	private JLabel lblBaiTapCacTuan;
	private JButton btnTuan1,btnTuan2,btnTuan3,btnTuan4,btnTuan5;
	

	/**
	 * Launch the application.
	 */
	
	public MainView() {
		initialize();
	}

	/**
	 * Create the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.menu);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 458, 446);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Giao diện menu - Trần Đức Việt - MSSV: 20198275");
		frame.setVisible(true);
		
		lblBaiTapCacTuan = new JLabel("BÀI TẬP CÁC TUẦN ");
		lblBaiTapCacTuan.setHorizontalAlignment(SwingConstants.CENTER);
		lblBaiTapCacTuan.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBaiTapCacTuan.setBounds(92, 10, 224, 75);
		frame.getContentPane().add(lblBaiTapCacTuan);
		//Đặt action nút tuần 1 
		btnTuan1 = new JButton("Tuần 1(Tuần 29)");
		btnTuan1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tuan29 tuan29=new Tuan29();
			}
		});
		btnTuan1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTuan1.setBounds(92, 118, 224, 44);
		frame.getContentPane().add(btnTuan1);
		
		btnTuan2 = new JButton("Tuần 2(Tuần 30)");
		//Đặt action nút tuần 2
		btnTuan2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tuan30 tuan30=new Tuan30();
			}
		});
		btnTuan2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTuan2.setBounds(92, 172, 224, 44);
		frame.getContentPane().add(btnTuan2);
		
		btnTuan3 = new JButton("Tuần 3(Tuần 31)");
		//Đặt action nút tuần 3
		btnTuan3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tuan31 tuan31=new Tuan31();
			}
		});
		btnTuan3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTuan3.setBounds(92, 226, 224, 44);
		frame.getContentPane().add(btnTuan3);
		
		btnTuan4 = new JButton("Tuần 4(Tuần 32)");
		//Đặt action nút tuần 4
		btnTuan4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tuan32 tuan32=new Tuan32();
			}
		});
		btnTuan4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTuan4.setBounds(92, 280, 224, 44);
		frame.getContentPane().add(btnTuan4);
		
		btnTuan5 = new JButton("Tuần 5(Tuần 33)");
		//Đặt action nút tuần 5
		btnTuan5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CanBoController tuan33=new CanBoController();
			}
		});
		btnTuan5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTuan5.setBounds(92, 334, 224, 44);
		frame.getContentPane().add(btnTuan5);
	}
}
