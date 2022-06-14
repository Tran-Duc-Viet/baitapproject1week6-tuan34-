/*Họ và tên: Trần Đức Việt
 MSSV: 20198275
 */
package Tuan4;

import java.awt.BorderLayout;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import javax.swing.JSeparator;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class Tuan32 extends JFrame {
	private JFrame frame;
	private JPanel JPanemain, panelBai1, panelBai2, panelBai3, panelBai4, panelBai5, panelBai6, panelBai7, panelBai8,
			panelBai9;
	private JPanel contentPane;
	private JButton btnBai1, btnBai2, btnBai3, btnBai4, btnBai6, btnBai5, btnBai7, btnBai8, btnBai9, btnClose,
			btnThemHocSinhVaoDanhSachBai7, btnThemHocSinhVaoDanhSachBai8, btnThemHocSinhVaoDanhSachBai9;
	private JTextArea textKetQuaBai1, textKetQuaBai2, textKetQuaBai3, textKetQuaBai4, textKetQuaBai5, textKetQuaBai6,
			textKetQuaBai7, textKetQuaBai8, textKetQuaBai9;
	private JTextPane DeBaiBai1, DeBaiBai2, DeBaiBai3, DeBaiBai4, DeBaiBai5, DeBaiBai6, DeBaiBai7, DeBaiBai8, DeBaiBai9;
	private JButton btnInBai1, btnInBai2, btnInBai3, btnInBai4, btnInBai5, btnInBai6, btnInBai7, btnInBai8, btnInBai9;
	private JLabel lblNhapXauBai1, lblNhapXauBai2, lblNhapXauBai3, lblNhapXauBai4, lblNhapXauBai5, lblNhapXauBai6,
			lblNhapTenHocSinh, lblDanhsachHocSinh,lblNhapXauCon;
	private JTextField layDayBai1, layXauBai2, layXauBai3, layXauBai4, layXauBai5, layXauBai6, layTenHocSinhBai7,
			layTenHocSinhBai8, layTenHocSinhBai9;
	protected ArrayList<String> dsList;
	private JScrollPane scrollPane1, scrollPane2, scrollPane3;
	private JTable danhSachHocSinhBai7, danhSachHocSinhBai8, danhSachHocSinhBai9;
	private DefaultTableModel model;
	private JTextField layXauCon;

	/**
	 * Launch the application.
	 */

	public Tuan32() {
		initialize();
	}

	/**
	 * Create the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.menu);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 920, 561);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Giao diện tuần 4(tuần 32) - Trần Đức Việt - MSSV: 20198275");
		frame.setVisible(true);

		btnBai1 = new JButton("Bài 1");
		btnBai1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnBai1.setBounds(10, 10, 146, 41);
		frame.getContentPane().add(btnBai1);

		btnBai2 = new JButton("Bài 2");
		btnBai2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnBai2.setBounds(10, 61, 146, 41);
		frame.getContentPane().add(btnBai2);

		btnBai3 = new JButton("Bài 3");
		btnBai3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnBai3.setBounds(10, 112, 146, 41);
		frame.getContentPane().add(btnBai3);

		btnBai4 = new JButton("Bài 4");
		btnBai4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnBai4.setBounds(10, 163, 146, 41);
		frame.getContentPane().add(btnBai4);

		btnBai6 = new JButton("Bài 6");
		btnBai6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnBai6.setBounds(10, 265, 146, 41);
		frame.getContentPane().add(btnBai6);

		btnBai5 = new JButton("Bài 5");
		btnBai5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnBai5.setBounds(10, 214, 146, 41);
		frame.getContentPane().add(btnBai5);

		btnBai7 = new JButton("Bài 7");
		btnBai7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnBai7.setBounds(10, 316, 146, 41);
		frame.getContentPane().add(btnBai7);

		btnBai8 = new JButton("Bài 8");
		btnBai8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnBai8.setBounds(10, 367, 146, 41);
		frame.getContentPane().add(btnBai8);

		btnBai9 = new JButton("Bài 9");
		btnBai9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnBai9.setBounds(10, 418, 146, 41);
		frame.getContentPane().add(btnBai9);

		btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.setBounds(10, 469, 146, 41);
		frame.getContentPane().add(btnClose);
		btnClose.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				frame.dispose();
			}
		});

		JPanemain = new JPanel();
		JPanemain.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		JPanemain.setBackground(Color.WHITE);
		JPanemain.setBounds(166, 10, 740, 514);
		frame.getContentPane().add(JPanemain);
		JPanemain.setLayout(new CardLayout(0, 0));

		panelBai1 = new JPanel();
		panelBai1.setBackground(SystemColor.menu);
		JPanemain.add(panelBai1, "panelBai1");
		panelBai1.setLayout(null);

		DeBaiBai1 = new JTextPane();
		DeBaiBai1.setBackground(SystemColor.menu);
		DeBaiBai1.setForeground(SystemColor.desktop);
		DeBaiBai1.setBounds(10, 10, 720, 56);
		DeBaiBai1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		DeBaiBai1.setText(
				"Bài 01: Cho trước 1 xâu ký tự là họ tên người đầy đủ nhưng khi nhập có thể thừa một số dấu cách. Hãy xóa đi các dấu cách thừa và in ra họ tên chính xác.");
		panelBai1.add(DeBaiBai1);
		DeBaiBai1.setEditable(false);

		btnInBai1 = new JButton("In");
		btnInBai1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnInBai1.setBounds(261, 391, 173, 56);
		panelBai1.add(btnInBai1);

		layDayBai1 = new JTextField();
		layDayBai1.setBounds(99, 86, 550, 60);
		panelBai1.add(layDayBai1);
		layDayBai1.setColumns(10);

		textKetQuaBai1 = new JTextArea();
		textKetQuaBai1.setSelectedTextColor(Color.BLACK);
		textKetQuaBai1.setBackground(Color.WHITE);
		textKetQuaBai1.setBounds(99, 208, 550, 153);
		panelBai1.add(textKetQuaBai1);
		textKetQuaBai1.setEditable(false);
		textKetQuaBai1.setLineWrap(true);

		lblNhapXauBai1 = new JLabel("Nhập Xâu:");
		lblNhapXauBai1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNhapXauBai1.setBounds(10, 92, 81, 43);
		panelBai1.add(lblNhapXauBai1);

		panelBai2 = new JPanel();
		JPanemain.add(panelBai2, "panelBai2");
		panelBai2.setLayout(null);

		DeBaiBai2 = new JTextPane();
		DeBaiBai2.setBounds(10, 10, 720, 56);
		DeBaiBai2.setText(
				"Bài 02: Cho trước xâu ký tự bất kỳ. Hãy đếm xem trong xâu có bao nhiêu lần xuất hiện xâu con “abc”");
		DeBaiBai2.setForeground(Color.BLACK);
		DeBaiBai2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		DeBaiBai2.setBackground(SystemColor.menu);
		panelBai2.add(DeBaiBai2);
		DeBaiBai2.setEditable(false);

		btnInBai2 = new JButton("In");
		btnInBai2.setBounds(261, 391, 173, 56);
		btnInBai2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelBai2.add(btnInBai2);

		textKetQuaBai2 = new JTextArea();
		textKetQuaBai2.setSelectedTextColor(Color.BLACK);
		textKetQuaBai2.setBounds(99, 236, 550, 125);
		textKetQuaBai2.setBackground(Color.WHITE);
		panelBai2.add(textKetQuaBai2);
		textKetQuaBai2.setEditable(false);
		textKetQuaBai2.setLineWrap(true);

		lblNhapXauBai2 = new JLabel("Nhập xâu:");
		lblNhapXauBai2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNhapXauBai2.setBounds(10, 88, 81, 43);
		panelBai2.add(lblNhapXauBai2);

		layXauBai2 = new JTextField();
		layXauBai2.setBounds(109, 84, 550, 56);
		panelBai2.add(layXauBai2);
		layXauBai2.setColumns(10);
		
		lblNhapXauCon = new JLabel("Nhập xâu con:");
		lblNhapXauCon.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNhapXauCon.setBounds(10, 152, 105, 43);
		panelBai2.add(lblNhapXauCon);
		
		layXauCon = new JTextField();
		layXauCon.setColumns(10);
		layXauCon.setBounds(109, 148, 550, 56);
		panelBai2.add(layXauCon);

		panelBai3 = new JPanel();
		JPanemain.add(panelBai3, "panelBai3");
		panelBai3.setLayout(null);

		DeBaiBai3 = new JTextPane();
		DeBaiBai3.setText("Bài 03: Cho trước 1 xâu ký tự là họ tên người đầy đủ, hãy tách ra phần tên của người này");
		DeBaiBai3.setForeground(Color.BLACK);
		DeBaiBai3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		DeBaiBai3.setBackground(SystemColor.menu);
		DeBaiBai3.setBounds(10, 10, 720, 56);
		panelBai3.add(DeBaiBai3);
		DeBaiBai3.setEditable(false);

		btnInBai3 = new JButton("In");
		btnInBai3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnInBai3.setBounds(261, 391, 173, 56);
		panelBai3.add(btnInBai3);

		textKetQuaBai3 = new JTextArea();
		textKetQuaBai3.setBackground(SystemColor.white);
		textKetQuaBai3.setBounds(99, 236, 550, 125);
		panelBai3.add(textKetQuaBai3);
		textKetQuaBai3.setEditable(false);
		textKetQuaBai3.setLineWrap(true);

		lblNhapXauBai3 = new JLabel("Nhập Xâu:");
		lblNhapXauBai3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNhapXauBai3.setBounds(10, 76, 81, 43);
		panelBai3.add(lblNhapXauBai3);

		layXauBai3 = new JTextField();
		layXauBai3.setBounds(99, 76, 550, 60);
		panelBai3.add(layXauBai3);
		layXauBai3.setColumns(10);

		panelBai4 = new JPanel();
		panelBai4.setLayout(null);
		JPanemain.add(panelBai4, "panelBai4");

		DeBaiBai4 = new JTextPane();
		DeBaiBai4.setText("Bài 04: Cho trước 1 xâu ký tự là họ tên người đầy đủ, hãy tách ra phần họ của người này");
		DeBaiBai4.setForeground(Color.BLACK);
		DeBaiBai4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		DeBaiBai4.setBackground(SystemColor.menu);
		DeBaiBai4.setBounds(10, 10, 720, 56);
		panelBai4.add(DeBaiBai4);
		DeBaiBai4.setEditable(false);

		btnInBai4 = new JButton("In");
		btnInBai4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnInBai4.setBounds(261, 391, 173, 56);
		panelBai4.add(btnInBai4);

		textKetQuaBai4 = new JTextArea();
		textKetQuaBai4.setBackground(SystemColor.white);
		textKetQuaBai4.setBounds(99, 236, 550, 125);
		panelBai4.add(textKetQuaBai4);
		textKetQuaBai4.setEditable(false);
		textKetQuaBai4.setLineWrap(true);

		lblNhapXauBai4 = new JLabel("Nhập xâu:");
		lblNhapXauBai4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNhapXauBai4.setBounds(10, 76, 81, 43);
		panelBai4.add(lblNhapXauBai4);

		layXauBai4 = new JTextField();
		layXauBai4.setBounds(99, 76, 550, 60);
		panelBai4.add(layXauBai4);
		layXauBai4.setColumns(10);

		panelBai5 = new JPanel();
		panelBai5.setLayout(null);
		JPanemain.add(panelBai5, "panelBai5");

		DeBaiBai5 = new JTextPane();
		DeBaiBai5.setText(
				"Bài 05: Cho một xâu ký tự bao gồm toàn các ký tự 0,1. Hãy biến đổi xâu này theo cách 0🡪1, 1🡪0 và in ra kết quả.");
		DeBaiBai5.setForeground(Color.BLACK);
		DeBaiBai5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		DeBaiBai5.setBackground(SystemColor.menu);
		DeBaiBai5.setBounds(10, 10, 720, 56);
		panelBai5.add(DeBaiBai5);
		DeBaiBai5.setEditable(false);

		btnInBai5 = new JButton("In");
		btnInBai5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnInBai5.setBounds(261, 391, 173, 56);
		panelBai5.add(btnInBai5);

		textKetQuaBai5 = new JTextArea();
		textKetQuaBai5.setBackground(SystemColor.white);
		textKetQuaBai5.setBounds(99, 236, 550, 125);
		panelBai5.add(textKetQuaBai5);
		textKetQuaBai5.setEditable(false);
		textKetQuaBai5.setLineWrap(true);

		lblNhapXauBai5 = new JLabel("Nhập xâu:");
		lblNhapXauBai5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNhapXauBai5.setBounds(10, 76, 81, 43);
		panelBai5.add(lblNhapXauBai5);

		layXauBai5 = new JTextField();
		layXauBai5.setBounds(99, 76, 550, 60);
		panelBai5.add(layXauBai5);
		layXauBai5.setColumns(10);

		panelBai6 = new JPanel();
		JPanemain.add(panelBai6, "panelBai6");
		panelBai6.setLayout(null);

		DeBaiBai6 = new JTextPane();
		DeBaiBai6.setBounds(10, 10, 720, 56);
		DeBaiBai6.setText("Bài 06: Cho trước xâu ký tự S, in ra xâu S1 ngược lại xâu S.");
		DeBaiBai6.setForeground(Color.BLACK);
		DeBaiBai6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		DeBaiBai6.setBackground(SystemColor.menu);
		panelBai6.add(DeBaiBai6);
		DeBaiBai6.setEditable(false);

		btnInBai6 = new JButton("In");
		btnInBai6.setBounds(261, 391, 173, 56);
		btnInBai6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelBai6.add(btnInBai6);

		lblNhapXauBai6 = new JLabel("Nhập xâu:");
		lblNhapXauBai6.setBounds(10, 76, 81, 43);
		lblNhapXauBai6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panelBai6.add(lblNhapXauBai6);

		layXauBai6 = new JTextField();
		layXauBai6.setBounds(99, 76, 550, 60);
		panelBai6.add(layXauBai6);
		layXauBai6.setColumns(10);

		textKetQuaBai6 = new JTextArea();
		textKetQuaBai6.setBackground(SystemColor.white);
		textKetQuaBai6.setBounds(99, 236, 550, 125);
		panelBai6.add(textKetQuaBai6);
		textKetQuaBai6.setEditable(false);
		textKetQuaBai6.setLineWrap(true);

		panelBai7 = new JPanel();
		panelBai7.setLayout(null);
		JPanemain.add(panelBai7, "panelBai7");

		DeBaiBai7 = new JTextPane();
		DeBaiBai7.setText("Bài 7: Cho danh sách họ tên đầy đủ học sinh. Hãy đếm xem có bao nhiêu bạn tên “An”.");
		DeBaiBai7.setForeground(Color.BLACK);
		DeBaiBai7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		DeBaiBai7.setEditable(false);
		DeBaiBai7.setBackground(SystemColor.menu);
		DeBaiBai7.setBounds(10, 10, 720, 56);
		panelBai7.add(DeBaiBai7);

		btnInBai7 = new JButton("In");
		btnInBai7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnInBai7.setBounds(401, 390, 173, 56);
		panelBai7.add(btnInBai7);

		textKetQuaBai7 = new JTextArea();
		textKetQuaBai7.setLineWrap(true);
		textKetQuaBai7.setEditable(false);
		textKetQuaBai7.setBackground(Color.WHITE);
		textKetQuaBai7.setBounds(261, 234, 456, 125);
		panelBai7.add(textKetQuaBai7);

		lblNhapTenHocSinh = new JLabel("Nhập tên học sinh:");
		lblNhapTenHocSinh.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNhapTenHocSinh.setBounds(223, 76, 130, 33);
		panelBai7.add(lblNhapTenHocSinh);

		layTenHocSinhBai7 = new JTextField();
		layTenHocSinhBai7.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		layTenHocSinhBai7.setBackground(SystemColor.menu);
		layTenHocSinhBai7.setBounds(363, 76, 254, 38);
		panelBai7.add(layTenHocSinhBai7);
		layTenHocSinhBai7.setColumns(10);

		btnThemHocSinhVaoDanhSachBai7 = new JButton("Thêm");
		btnThemHocSinhVaoDanhSachBai7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnThemHocSinhVaoDanhSachBai7.setBounds(627, 76, 103, 39);
		panelBai7.add(btnThemHocSinhVaoDanhSachBai7);

		scrollPane1 = new JScrollPane();
		scrollPane1.setBounds(10, 115, 230, 366);
		panelBai7.add(scrollPane1);

		danhSachHocSinhBai7 = new JTable();
		danhSachHocSinhBai7.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		scrollPane1.setViewportView(danhSachHocSinhBai7);

		lblDanhsachHocSinh = new JLabel("Danh sách học sinh:");
		lblDanhsachHocSinh.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDanhsachHocSinh.setBounds(10, 76, 130, 33);
		panelBai7.add(lblDanhsachHocSinh);

		panelBai8 = new JPanel();
		panelBai8.setLayout(null);
		JPanemain.add(panelBai8, "panelBai8");

		DeBaiBai8 = new JTextPane();
		DeBaiBai8.setText(
				"Bài 8: Cho danh sách họ tên đầy đủ học sinh. Hãy đếm xem có bao nhiêu bạn có phần đệm là “Thị”.");
		DeBaiBai8.setForeground(Color.BLACK);
		DeBaiBai8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		DeBaiBai8.setEditable(false);
		DeBaiBai8.setBackground(SystemColor.menu);
		DeBaiBai8.setBounds(10, 10, 720, 56);
		panelBai8.add(DeBaiBai8);

		btnInBai8 = new JButton("In");
		btnInBai8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnInBai8.setBounds(368, 390, 173, 56);
		panelBai8.add(btnInBai8);

		textKetQuaBai8 = new JTextArea();
		textKetQuaBai8.setLineWrap(true);
		textKetQuaBai8.setEditable(false);
		textKetQuaBai8.setBackground(Color.WHITE);
		textKetQuaBai8.setBounds(221, 234, 496, 125);
		panelBai8.add(textKetQuaBai8);

		lblNhapTenHocSinh = new JLabel("Nhập tên học sinh:");
		lblNhapTenHocSinh.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNhapTenHocSinh.setBounds(223, 76, 130, 33);
		panelBai8.add(lblNhapTenHocSinh);

		layTenHocSinhBai8 = new JTextField();
		layTenHocSinhBai8.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		layTenHocSinhBai8.setBackground(SystemColor.menu);
		layTenHocSinhBai8.setBounds(363, 76, 254, 38);
		panelBai8.add(layTenHocSinhBai8);
		layTenHocSinhBai8.setColumns(10);

		btnThemHocSinhVaoDanhSachBai8 = new JButton("Thêm");
		btnThemHocSinhVaoDanhSachBai8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnThemHocSinhVaoDanhSachBai8.setBounds(627, 76, 103, 39);
		panelBai8.add(btnThemHocSinhVaoDanhSachBai8);

		scrollPane2 = new JScrollPane();
		scrollPane2.setBounds(10, 115, 188, 366);
		panelBai8.add(scrollPane2);

		danhSachHocSinhBai8 = new JTable();
		scrollPane2.setViewportView(danhSachHocSinhBai8);

		lblDanhsachHocSinh = new JLabel("Danh sách học sinh:");
		lblDanhsachHocSinh.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDanhsachHocSinh.setBounds(10, 76, 130, 33);
		panelBai8.add(lblDanhsachHocSinh);

		panelBai9 = new JPanel();
		panelBai9.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panelBai9.setLayout(null);
		JPanemain.add(panelBai9, "panelBai9");

		DeBaiBai9 = new JTextPane();
		DeBaiBai9.setText(
				"Bài 9: Cho danh sách họ tên đầy đủ học sinh. Hãy đếm xem có bao nhiêu bạn có tên bắt đầu bằng chữ “H”.");
		DeBaiBai9.setForeground(Color.BLACK);
		DeBaiBai9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		DeBaiBai9.setEditable(false);
		DeBaiBai9.setBackground(SystemColor.menu);
		DeBaiBai9.setBounds(10, 10, 720, 56);
		panelBai9.add(DeBaiBai9);

		btnInBai9 = new JButton("In");
		btnInBai9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnInBai9.setBounds(368, 390, 173, 56);
		panelBai9.add(btnInBai9);

		textKetQuaBai9 = new JTextArea();
		textKetQuaBai9.setLineWrap(true);
		textKetQuaBai9.setEditable(false);
		textKetQuaBai9.setBackground(Color.WHITE);
		textKetQuaBai9.setBounds(221, 234, 496, 125);
		panelBai9.add(textKetQuaBai9);

		lblNhapTenHocSinh = new JLabel("Nhập tên học sinh:");
		lblNhapTenHocSinh.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNhapTenHocSinh.setBounds(223, 76, 130, 33);
		panelBai9.add(lblNhapTenHocSinh);

		layTenHocSinhBai9 = new JTextField();
		layTenHocSinhBai9.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		layTenHocSinhBai9.setBackground(SystemColor.menu);
		layTenHocSinhBai9.setBounds(363, 76, 254, 38);
		panelBai9.add(layTenHocSinhBai9);
		layTenHocSinhBai9.setColumns(10);

		btnThemHocSinhVaoDanhSachBai9 = new JButton("Thêm");
		btnThemHocSinhVaoDanhSachBai9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnThemHocSinhVaoDanhSachBai9.setBounds(627, 76, 103, 39);
		panelBai9.add(btnThemHocSinhVaoDanhSachBai9);

		scrollPane3 = new JScrollPane();
		scrollPane3.setBounds(10, 115, 188, 366);
		panelBai9.add(scrollPane3);

		danhSachHocSinhBai9 = new JTable();
		scrollPane3.setViewportView(danhSachHocSinhBai9);

		lblDanhsachHocSinh = new JLabel("Danh sách học sinh:");
		lblDanhsachHocSinh.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDanhsachHocSinh.setBounds(10, 76, 130, 33);
		panelBai9.add(lblDanhsachHocSinh);

		setActionBtnBai1();
		setActionBtnBai2();
		setActionBtnBai3();
		setActionBtnBai4();
		setActionBtnBai5();
		setActionBtnBai6();
		setActionBtnBai7();
		setActionBtnBai8();
		setActionBtnBai9();

	}

	// Phương thức set action cho các nút và in kết quả
	// Lấy xâu bài 1
	public String layXauBai1() {
		String s = layDayBai1.getText();
		return s;

	}

	// Thiết lập action cho buton in của bài 1
	public void setActionBtnInBai1() {
		btnInBai1.addActionListener((e) -> {
			textKetQuaBai1.setText("");
			Bai1 bai1 = new Bai1(layXauBai1());
			textKetQuaBai1.append("Họ tên chính xác là:" + "\n" + bai1.getKetQua());

		});
	}

	// Thiết lập action cho button bài 1
	public void setActionBtnBai1() {
		btnBai1.addActionListener((e) -> {
			CardLayout cl = (CardLayout) JPanemain.getLayout();
			textKetQuaBai1.setText("");
			layDayBai1.setText("");
			cl.show(JPanemain, "panelBai1");
			setActionBtnInBai1();

		});
	}

	// Lấy xâu bài 2
	public String layXauBai2() {
		String s = layXauBai2.getText();
		return s;

	}

	// Thiết lập action cho button bài 2
	public void setActionBtnBai2() {
		btnBai2.addActionListener((e) -> {
			CardLayout cl = (CardLayout) JPanemain.getLayout();
			textKetQuaBai2.setText("");
			layXauBai2.setText("");
			cl.show(JPanemain, "panelBai2");
			setActionBtnInBai2();

		});
	}

	// Thiết lập action cho button bài 3
	public void setActionBtnBai3() {
		btnBai3.addActionListener((e) -> {
			CardLayout cl = (CardLayout) JPanemain.getLayout();
			textKetQuaBai3.setText("");
			layXauBai3.setText("");
			cl.show(JPanemain, "panelBai3");
			setActionBtnInBai3();

		});
	}

	// Thiết lập action cho button bài 4
	public void setActionBtnBai4() {
		btnBai4.addActionListener((e) -> {
			CardLayout cl = (CardLayout) JPanemain.getLayout();
			textKetQuaBai4.setText("");
			layXauBai4.setText("");
			cl.show(JPanemain, "panelBai4");
			setActionBtnInBai4();

		});
	}

	// Thiết lập action cho button bài 5
	public void setActionBtnBai5() {
		btnBai5.addActionListener((e) -> {
			CardLayout cl = (CardLayout) JPanemain.getLayout();
			textKetQuaBai5.setText("");
			layXauBai5.setText("");
			cl.show(JPanemain, "panelBai5");
			setActionBtnInBai5();

		});
	}

	// Thiết lập action cho buton in của bài 2
	public void setActionBtnInBai2() {
		btnInBai2.addActionListener((e) -> {
			textKetQuaBai2.setText("");
			Bai2 bai2 = new Bai2(layXauBai2(),layXauCon.getText());
			textKetQuaBai2.append(bai2.getKetQua());

		});
	}

	// Lấy xâu bài 3
	public String layXauBai3() {
		String s = layXauBai3.getText();
		return s;

	}

	// Thiết lập action cho buton in của bài 3
	public void setActionBtnInBai3() {
		btnInBai3.addActionListener((e) -> {
			textKetQuaBai3.setText("");
			Bai3 bai3 = new Bai3(layXauBai3());
			textKetQuaBai3.append(bai3.getKetQua());

		});
	}

	// Thiết lập action cho button bài 6
	public void setActionBtnBai6() {
		btnBai6.addActionListener((e) -> {
			CardLayout cl = (CardLayout) JPanemain.getLayout();
			textKetQuaBai6.setText("");
			layXauBai6.setText("");
			cl.show(JPanemain, "panelBai6");
			setActionBtnInBai6();

		});
	}

	// Lấy dãy bài 4
	public String layXauBai4() {
		String s = layXauBai4.getText();
		return s;

	}

	// Thiết lập action cho buton in của bài 4
	public void setActionBtnInBai4() {
		btnInBai4.addActionListener((e) -> {
			textKetQuaBai4.setText("");
			Bai4 bai4 = new Bai4(layXauBai4());
			textKetQuaBai4.append(bai4.getKetQua());

		});
	}

	// Lấy dãy bài 5
	public String layDayBai5() {
		String s = layXauBai5.getText();
		return s;

	}

	// Thiết lập action cho buton in của bài 5
	public void setActionBtnInBai5() {
		btnInBai5.addActionListener((e) -> {
			textKetQuaBai5.setText("");
			Bai5 bai5 = new Bai5(layDayBai5());
			textKetQuaBai5.append(bai5.getKetQua());

		});
	}

	// Lấy dãy bài 6
	public String layDayBai6() {
		String s = layXauBai6.getText();
		return s;

	}

	// Thiết lập action cho buton in của bài 6
	public void setActionBtnInBai6() {
		btnInBai6.addActionListener((e) -> {
			textKetQuaBai6.setText("");
			Bai6 bai6 = new Bai6(layDayBai6());
			textKetQuaBai6.append(bai6.getKetQua());

		});
	}

	// Thiết lập action cho button bài 7
	public void setActionBtnBai7() {
		btnBai7.addActionListener((e) -> {
			CardLayout cl = (CardLayout) JPanemain.getLayout();
			dsList = new ArrayList<String>();
			textKetQuaBai7.setText("");
			layTenHocSinhBai7.setText("");
			setDataForTableBai7(dsList);
			cl.show(JPanemain, "panelBai7");
			setActionBtnInBai7();
			setActionBtnThemHocSinhVaoDanhSachBai7();

		});
	}

	// Thiết lập action cho buton thêm học sinh vao danh sách bài 7
	public void setActionBtnThemHocSinhVaoDanhSachBai7() {
		btnThemHocSinhVaoDanhSachBai7.addActionListener((e) -> {
			Bai1 bai1 = new Bai1(layTenHocSinhBai7.getText());
			dsList.add(bai1.getKetQua());
			layTenHocSinhBai7.setText("");
			setDataForTableBai7(dsList);
		});
	}

	// phương thức thiết lập và truyền thông tin vào bảng bài 7
	public void setDataForTableBai7(ArrayList<String> data) {
		model = new DefaultTableModel();
		model.addColumn("Tên học sinh");
		for (int i = 0; i < data.size(); i++) {
			String s = data.get(i);
			Object[] row = { s };
			model.addRow(row);
		}
		danhSachHocSinhBai7.setModel(model);
	}

	// Thiết lập action cho buton thêm học sinh vao danh sách bài 8
	public void setActionBtnThemHocSinhVaoDanhSachBai8() {
		btnThemHocSinhVaoDanhSachBai8.addActionListener((e) -> {
			Bai1 bai1 = new Bai1(layTenHocSinhBai8.getText());
			dsList.add(bai1.getKetQua());
			layTenHocSinhBai8.setText("");
			setDataForTableBai8(dsList);
		});
	}

	// phương thức thiết lập và truyền thông tin vào bảng bài 8
	public void setDataForTableBai8(ArrayList<String> data) {
		model = new DefaultTableModel();
		model.addColumn("Tên học sinh");
		for (int i = 0; i < data.size(); i++) {
			String s = data.get(i);
			Object[] row = { s };
			model.addRow(row);
		}
		danhSachHocSinhBai8.setModel(model);
	}

	// Thiết lập action cho buton thêm học sinh vao danh sách bài 9
	public void setActionBtnThemHocSinhVaoDanhSachBai9() {
		btnThemHocSinhVaoDanhSachBai9.addActionListener((e) -> {
			Bai1 bai1 = new Bai1(layTenHocSinhBai9.getText());
			dsList.add(bai1.getKetQua());
			layTenHocSinhBai9.setText("");
			setDataForTableBai9(dsList);
		});
	}

	// phương thức thiết lập và truyền thông tin vào bảng bài 9
	public void setDataForTableBai9(ArrayList<String> data) {
		model = new DefaultTableModel();
		model.addColumn("Tên học sinh");
		for (int i = 0; i < data.size(); i++) {
			String s = data.get(i);
			Object[] row = { s };
			model.addRow(row);
		}
		danhSachHocSinhBai9.setModel(model);
	}

	// Thiết lập action cho buton in của bài 7
	public void setActionBtnInBai7() {
		btnInBai7.addActionListener((e) -> {
			textKetQuaBai7.setText("");
			Bai7 bai7 = new Bai7(dsList);
			textKetQuaBai7.append(bai7.getKetQua());

		});
	}

	// Thiết lập action cho button bài 8
	public void setActionBtnBai8() {
		btnBai8.addActionListener((e) -> {
			CardLayout cl = (CardLayout) JPanemain.getLayout();
			dsList = new ArrayList<String>();
			textKetQuaBai8.setText("");
			layTenHocSinhBai8.setText("");
			setDataForTableBai8(dsList);
			cl.show(JPanemain, "panelBai8");
			setActionBtnInBai8();
			setActionBtnThemHocSinhVaoDanhSachBai8();
		});
	}

	// Thiết lập action cho button bài 9
	public void setActionBtnBai9() {
		btnBai9.addActionListener((e) -> {
			CardLayout cl = (CardLayout) JPanemain.getLayout();
			dsList = new ArrayList<String>();
			textKetQuaBai9.setText("");
			layTenHocSinhBai9.setText("");
			setDataForTableBai9(dsList);
			cl.show(JPanemain, "panelBai9");
			setActionBtnInBai9();
			setActionBtnThemHocSinhVaoDanhSachBai9();
		});
	}

	// Thiết lập action cho buton in của bài 8
	public void setActionBtnInBai8() {
		btnInBai8.addActionListener((e) -> {
			textKetQuaBai8.setText("");
			Bai8 bai8 = new Bai8(dsList);
			System.out.print(bai8.getKetQua());
			textKetQuaBai8.append(bai8.getKetQua());
		});
	}

	// Thiết lập action cho buton in của bài 9
	public void setActionBtnInBai9() {
		btnInBai9.addActionListener((e) -> {
			textKetQuaBai9.setText("");
			Bai9 bai9 = new Bai9(dsList);
			textKetQuaBai9.append(bai9.getKetQua());
		});
	}
}