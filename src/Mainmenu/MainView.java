package Mainmenu;

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
		frame.setBounds(100, 100, 262, 446);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		lblBaiTapCacTuan = new JLabel("BÀI TẬP CÁC TUẦN ");
		lblBaiTapCacTuan.setHorizontalAlignment(SwingConstants.CENTER);
		lblBaiTapCacTuan.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBaiTapCacTuan.setBounds(10, 10, 224, 75);
		frame.getContentPane().add(lblBaiTapCacTuan);
		
		btnTuan1 = new JButton("Tuần 1(Tuần 29)");
		btnTuan1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tuan29 tuan29=new Tuan29();
			}
		});
		btnTuan1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTuan1.setBounds(24, 118, 201, 44);
		frame.getContentPane().add(btnTuan1);
		
		btnTuan2 = new JButton("Tuần 2(Tuần 30)");
		btnTuan2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tuan30 tuan30=new Tuan30();
			}
		});
		btnTuan2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTuan2.setBounds(24, 172, 201, 44);
		frame.getContentPane().add(btnTuan2);
		
		btnTuan3 = new JButton("Tuần 3(Tuần 31)");
		btnTuan3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tuan31 tuan31=new Tuan31();
			}
		});
		btnTuan3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTuan3.setBounds(24, 226, 201, 44);
		frame.getContentPane().add(btnTuan3);
		
		btnTuan4 = new JButton("Tuần 4(Tuần 32)");
		btnTuan4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tuan32 tuan32=new Tuan32();
			}
		});
		btnTuan4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTuan4.setBounds(24, 280, 201, 44);
		frame.getContentPane().add(btnTuan4);
		
		btnTuan5 = new JButton("Tuần 5(Tuần 33)");
		btnTuan5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CanBoController tuan33=new CanBoController();
			}
		});
		btnTuan5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTuan5.setBounds(24, 334, 201, 44);
		frame.getContentPane().add(btnTuan5);
	}
}
