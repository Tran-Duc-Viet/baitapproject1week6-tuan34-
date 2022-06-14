/*Họ và tên: Trần Đức Việt
 MSSV: 20198275
 */
package Tuan3;

//Giao diện các bài tuần 31
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.border.MatteBorder;

public class Tuan31 extends JFrame {
	private JFrame frame;
	private JPanel JPanemain, panelBai1;
	private JPanel contentPane;
	private JButton btnBai1, btnBai2, btnBai3, btnBai4, btnBai6, btnXapXep, btnBai5;
	private JTextArea textKetQuaBai1;
	private JPanel panelBai2;
	private JTextPane DeBaiBai2;
	private JButton btnInBai2;
	private JTextArea textKetQuaBai2;
	private JPanel panelBai3;
	private JTextPane DeBaiBai3;
	private JButton btnInBai3;
	private JTextArea textKetQuaBai3;
	private JPanel panelBai4;
	private JTextPane DeBaiBai4;
	private JButton btnInBai4;
	private JTextArea textKetQuaBai4;
	private JPanel panelBai5;
	private JTextPane DeBaiBai5;
	private JButton btnInBai5;
	private JTextArea textKetQuaBai5;
	private JPanel panelBai6;
	private JTextPane DeBaiBai6;
	private JButton btnInBai6;
	private JTextArea textKetQuaBai6;
	private JLabel lblNhapPhanTuCuaDayBai1, lblNhapPhanTuCuaDayBai2, lblNhapPhanTuCuaDayBai3, lblNhapPhanTuCuaDayBai4,
			lblNhapPhanTuCuaDayBai5, lblNhapPhanTuCuaDayBai6;
	private JTextField layDayBai1, layDayBai2, layDayBai3, layDayBai4, layDayBai5, layDayBai6;
	private JLabel lblMauDayNhap;
	private JLabel lblMauDayNhapBai1;
	private JScrollPane scrollPane;
	private JButton btnClose;

	/**
	 * Launch the application.
	 */

	public Tuan31() {
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
		frame.setTitle("Giao diện tuần 3(tuần 31) - Trần Đức Việt - MSSV: 20198275");
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

		btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.setBounds(10, 316, 146, 41);
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
		JPanemain.setBounds(166, 10, 740, 514);
		frame.getContentPane().add(JPanemain);
		JPanemain.setLayout(new CardLayout(0, 0));

		panelBai1 = new JPanel();
		panelBai1.setBackground(SystemColor.menu);
		JPanemain.add(panelBai1, "panelBai1");
		panelBai1.setLayout(null);

		JTextPane DeBaiBai1 = new JTextPane();
		DeBaiBai1.setBackground(SystemColor.menu);
		DeBaiBai1.setForeground(SystemColor.desktop);
		DeBaiBai1.setBounds(10, 10, 720, 28);
		DeBaiBai1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		DeBaiBai1.setText("Bài 01: Cho một dãy số tự nhiên, viết chương trình sắp xếp dãy này theo thứ tự giảm dần.");
		panelBai1.add(DeBaiBai1);
		DeBaiBai1.setEditable(false);

		btnXapXep = new JButton("Xắp xếp");
		btnXapXep.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnXapXep.setBounds(261, 391, 173, 56);
		panelBai1.add(btnXapXep);

		textKetQuaBai1 = new JTextArea();
		textKetQuaBai1.setSelectedTextColor(Color.BLACK);
		textKetQuaBai1.setBackground(Color.WHITE);
		textKetQuaBai1.setBounds(99, 236, 550, 125);
		panelBai1.add(textKetQuaBai1);
		textKetQuaBai1.setEditable(false);
		textKetQuaBai1.setLineWrap(true);

		lblNhapPhanTuCuaDayBai1 = new JLabel("Nhập dãy:");
		lblNhapPhanTuCuaDayBai1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNhapPhanTuCuaDayBai1.setBounds(10, 167, 81, 43);
		panelBai1.add(lblNhapPhanTuCuaDayBai1);

		layDayBai1 = new JTextField();
		layDayBai1.setBounds(99, 166, 550, 60);
		panelBai1.add(layDayBai1);
		layDayBai1.setColumns(10);

		lblMauDayNhap = new JLabel("Nhập dãy như này:\r\n30 40 50 60");
		lblMauDayNhap.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMauDayNhap.setBounds(10, 89, 629, 56);
		panelBai1.add(lblMauDayNhap);

		panelBai2 = new JPanel();
		JPanemain.add(panelBai2, "panelBai2");
		panelBai2.setLayout(null);

		DeBaiBai2 = new JTextPane();
		DeBaiBai2.setBounds(10, 10, 720, 28);
		DeBaiBai2.setText("Bài 02: Cho dãy số tự nhiên, in ra màn hình tất cả các số nguyên tố của dãy này");
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

		lblNhapPhanTuCuaDayBai2 = new JLabel("Nhập dãy:");
		lblNhapPhanTuCuaDayBai2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNhapPhanTuCuaDayBai2.setBounds(10, 167, 81, 43);
		panelBai2.add(lblNhapPhanTuCuaDayBai2);

		layDayBai2 = new JTextField();
		layDayBai2.setBounds(99, 166, 550, 60);
		panelBai2.add(layDayBai2);
		layDayBai2.setColumns(10);

		lblMauDayNhap = new JLabel("Nhập dãy như này:\r\n30 40 50 60");
		lblMauDayNhap.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMauDayNhap.setBounds(10, 89, 629, 56);
		panelBai2.add(lblMauDayNhap);

		panelBai3 = new JPanel();
		JPanemain.add(panelBai3, "panelBai3");
		panelBai3.setLayout(null);

		DeBaiBai3 = new JTextPane();
		DeBaiBai3.setText(
				"Bài 03: Cho một dãy các số tự nhiên, tìm và in ra 1 giá trị min của dãy này và tất cả các chỉ số ứng với giá trị min này.");
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

		lblNhapPhanTuCuaDayBai3 = new JLabel("Nhập dãy:");
		lblNhapPhanTuCuaDayBai3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNhapPhanTuCuaDayBai3.setBounds(10, 167, 81, 43);
		panelBai3.add(lblNhapPhanTuCuaDayBai3);

		layDayBai3 = new JTextField();
		layDayBai3.setBounds(99, 166, 550, 60);
		panelBai3.add(layDayBai3);
		layDayBai3.setColumns(10);

		lblMauDayNhap = new JLabel("Nhập dãy như này:\r\n30 40 50 60");
		lblMauDayNhap.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMauDayNhap.setBounds(10, 89, 629, 56);
		panelBai3.add(lblMauDayNhap);

		panelBai4 = new JPanel();
		panelBai4.setLayout(null);
		JPanemain.add(panelBai4, "panelBai4");

		DeBaiBai4 = new JTextPane();
		DeBaiBai4.setText(
				"Bài 04: Cho một dãy các số tự nhiên, tìm và in ra 1 giá trị max của dãy này và tất cả các chỉ số ứng với giá trị max này");
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
		;
		panelBai4.add(textKetQuaBai4);
		textKetQuaBai4.setEditable(false);
		textKetQuaBai4.setLineWrap(true);

		lblNhapPhanTuCuaDayBai4 = new JLabel("Nhập dãy:");
		lblNhapPhanTuCuaDayBai4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNhapPhanTuCuaDayBai4.setBounds(10, 167, 81, 43);
		panelBai4.add(lblNhapPhanTuCuaDayBai4);

		layDayBai4 = new JTextField();
		layDayBai4.setBounds(99, 166, 550, 60);
		panelBai4.add(layDayBai4);
		layDayBai4.setColumns(10);

		lblMauDayNhap = new JLabel("Nhập dãy như này:\r\n30 40 50 60");
		lblMauDayNhap.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMauDayNhap.setBounds(10, 89, 629, 56);
		panelBai4.add(lblMauDayNhap);

		panelBai5 = new JPanel();
		panelBai5.setLayout(null);
		JPanemain.add(panelBai5, "panelBai5");

		DeBaiBai5 = new JTextPane();
		DeBaiBai5.setText(
				"Bài 05: Cho một dãy số tự nhiên, hãy đếm xem trong dãy số trên có bao nhiêu số nguyên tố, có bao nhiêu hợp số.");
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

		lblNhapPhanTuCuaDayBai5 = new JLabel("Nhập dãy:");
		lblNhapPhanTuCuaDayBai5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNhapPhanTuCuaDayBai5.setBounds(10, 167, 81, 43);
		panelBai5.add(lblNhapPhanTuCuaDayBai5);

		layDayBai5 = new JTextField();
		layDayBai5.setBounds(99, 166, 550, 60);
		panelBai5.add(layDayBai5);
		layDayBai5.setColumns(10);

		lblMauDayNhap = new JLabel("Nhập dãy như này:\r\n30 40 50 60");
		lblMauDayNhap.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMauDayNhap.setBounds(10, 89, 629, 56);
		panelBai5.add(lblMauDayNhap);

		panelBai6 = new JPanel();
		JPanemain.add(panelBai6, "panelBai6");
		panelBai6.setLayout(null);

		DeBaiBai6 = new JTextPane();
		DeBaiBai6.setBounds(10, 10, 720, 56);
		DeBaiBai6.setText(
				"Bài 06: Cho một dãy số tự nhiên, hãy in ra tất cả các số hạng của dãy trên thỏa mãn: số này là ước số thực sự của 1 số hạng khác trong dãy trên.");
		DeBaiBai6.setForeground(Color.BLACK);
		DeBaiBai6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		DeBaiBai6.setBackground(SystemColor.white);
		panelBai6.add(DeBaiBai6);
		DeBaiBai6.setEditable(false);

		btnInBai6 = new JButton("In");
		btnInBai6.setBounds(261, 391, 173, 56);
		btnInBai6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelBai6.add(btnInBai6);

		lblNhapPhanTuCuaDayBai6 = new JLabel("Nhập dãy:");
		lblNhapPhanTuCuaDayBai6.setBounds(10, 167, 81, 43);
		lblNhapPhanTuCuaDayBai6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panelBai6.add(lblNhapPhanTuCuaDayBai6);

		layDayBai6 = new JTextField();
		layDayBai6.setBounds(99, 166, 550, 60);
		panelBai6.add(layDayBai6);
		layDayBai6.setColumns(10);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(99, 247, 550, 112);
		panelBai6.add(scrollPane);

		textKetQuaBai6 = new JTextArea();
		textKetQuaBai6.setLineWrap(true);
		textKetQuaBai6.setEditable(false);
		textKetQuaBai6.setBackground(Color.WHITE);
		scrollPane.setViewportView(textKetQuaBai6);
		textKetQuaBai6.setEditable(false);

		lblMauDayNhap = new JLabel("Nhập dãy như này:\r\n30 40 50 60");
		lblMauDayNhap.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMauDayNhap.setBounds(10, 89, 629, 56);
		panelBai6.add(lblMauDayNhap);

		setActionBtnBai1();
		setActionBtnBai2();
		setActionBtnBai3();
		setActionBtnBai4();
		setActionBtnBai5();
		setActionBtnBai6();

	}

	// Phương thức set action cho các nút và in kết quả
	// Lấy dãy bài 1
	public int[] layDayBai1() {
		String s = layDayBai1.getText();
		s.trim();
		String[] k = s.split(" ");
		int[] a = new int[k.length];
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(k[i]);
		}
		return a;

	}

	// Thiết lập action cho buton in của bài 1
	public void setActionBtnInBai1() {
		btnXapXep.addActionListener((e) -> {
			textKetQuaBai1.setText("");
			Bai1 bai1 = new Bai1(layDayBai1());
			setTextKetQuaBai1(bai1.getKetQua());

		});
	}

	// In kết quả bài 1 lên màn hình
	public void setTextKetQuaBai1(String s) {
		textKetQuaBai1.setText(s);
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

	// Lấy dãy bài 2
	public int[] layDayBai2() {
		String s = layDayBai2.getText();
		s.trim();
		String[] k = s.split(" ");
		int[] a = new int[k.length];
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(k[i]);
		}
		return a;

	}

	// Thiết lập action cho button bài 2
	public void setActionBtnBai2() {
		btnBai2.addActionListener((e) -> {
			CardLayout cl = (CardLayout) JPanemain.getLayout();
			textKetQuaBai2.setText("");
			layDayBai2.setText("");
			cl.show(JPanemain, "panelBai2");
			setActionBtnInBai2();

		});
	}

	// Thiết lập action cho button bài 3
	public void setActionBtnBai3() {
		btnBai3.addActionListener((e) -> {
			CardLayout cl = (CardLayout) JPanemain.getLayout();
			textKetQuaBai3.setText("");
			layDayBai3.setText("");
			cl.show(JPanemain, "panelBai3");
			setActionBtnInBai3();

		});
	}

	// Thiết lập action cho button bài 4
	public void setActionBtnBai4() {
		btnBai4.addActionListener((e) -> {
			CardLayout cl = (CardLayout) JPanemain.getLayout();
			textKetQuaBai4.setText("");
			layDayBai4.setText("");
			cl.show(JPanemain, "panelBai4");
			setActionBtnInBai4();

		});
	}

	// Thiết lập action cho button bài 5
	public void setActionBtnBai5() {
		btnBai5.addActionListener((e) -> {
			CardLayout cl = (CardLayout) JPanemain.getLayout();
			textKetQuaBai5.setText("");
			layDayBai5.setText("");
			cl.show(JPanemain, "panelBai5");
			setActionBtnInBai5();

		});
	}

	// Thiết lập action cho buton in của bài 2
	public void setActionBtnInBai2() {
		btnInBai2.addActionListener((e) -> {
			textKetQuaBai2.setText("");
			Bai2 bai2 = new Bai2(layDayBai2());
			setTextKetQuaBai2(bai2.getKetQua());

		});
	}

	// In kết quả bài 2 lên màn hình
	public void setTextKetQuaBai2(String s) {
		textKetQuaBai2.setText(s);
	}

	// Lấy dãy bài 3
	public int[] layDayBai3() {
		String s = layDayBai3.getText();
		s.trim();
		String[] k = s.split(" ");
		int[] a = new int[k.length];
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(k[i]);
		}
		return a;

	}

	// Thiết lập action cho buton in của bài 3
	public void setActionBtnInBai3() {
		btnInBai3.addActionListener((e) -> {
			textKetQuaBai3.setText("");
			Bai3 bai3 = new Bai3(layDayBai3());
			textKetQuaBai3.append("Giá trị Min trong dãy là: " + bai3.getMin() + "\n"
					+ "Các vị trí có giá trị min trong dãy là: " + bai3.getVitri());

		});
	}

	// Thiết lập action cho button bài 6
	public void setActionBtnBai6() {
		btnBai6.addActionListener((e) -> {
			CardLayout cl = (CardLayout) JPanemain.getLayout();
			textKetQuaBai6.setText("");
			layDayBai6.setText("");
			cl.show(JPanemain, "panelBai6");
			setActionBtnInBai6();

		});
	}

	// Lấy dãy bài 4
	public int[] layDayBai4() {
		String s = layDayBai4.getText();
		s.trim();
		String[] k = s.split(" ");
		int[] a = new int[k.length];
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(k[i]);
		}
		return a;

	}

	// Thiết lập action cho buton in của bài 4
	public void setActionBtnInBai4() {
		btnInBai4.addActionListener((e) -> {
			textKetQuaBai4.setText("");
			Bai4 bai4 = new Bai4(layDayBai4());
			textKetQuaBai4.append("Giá trị max trong dãy là: " + bai4.getMin() + "\n"
					+ "Các vị trí có giá trị max trong dãy là: " + bai4.getVitri());

		});
	}

	// In kết quả bài 4 lên màn hình
	public void setTextKetQuaBai4(String s) {
		textKetQuaBai4.setText(s);
	}

	// Lấy dãy bài 5
	public int[] layDayBai5() {
		String s = layDayBai5.getText();
		s.trim();
		String[] k = s.split(" ");
		int[] a = new int[k.length];
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(k[i]);
		}
		return a;

	}

	// Thiết lập action cho buton in của bài 5
	public void setActionBtnInBai5() {
		btnInBai5.addActionListener((e) -> {
			textKetQuaBai5.setText("");
			Bai5 bai5 = new Bai5(layDayBai5());
			textKetQuaBai5.append("Số số nguyên tố có trong dãy là: " + bai5.getSoSoNguyenTo() + "\n"
					+ "Số số hợp số có trong dãy là " + bai5.getSoSoHopSo());

		});
	}

	// Lấy dãy bài 6
	public int[] layDayBai6() {
		String s = layDayBai6.getText();
		s.trim();
		String[] k = s.split(" ");
		int[] a = new int[k.length];
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(k[i]);
		}

		return a;

	}

	// Thiết lập action cho buton in của bài 6
	public void setActionBtnInBai6() {
		btnInBai6.addActionListener((e) -> {
			textKetQuaBai6.setText("");
			Bai6 bai6 = new Bai6(layDayBai6());
			textKetQuaBai6.append(bai6.getKetQua());

		});
	}
}
