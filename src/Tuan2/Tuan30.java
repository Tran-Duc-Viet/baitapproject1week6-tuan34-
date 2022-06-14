/*Họ và tên: Trần Đức Việt
 MSSV: 20198275
 */
package Tuan2;

//Giao diện các bài tuần 30
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

public class Tuan30 extends JFrame {
	private JFrame frame;
	private JPanel JPanemain, panelBai1;
	private JPanel contentPane;
	private JButton btnBai1, btnBai2, btnBai3, btnBai4, btnInBai1;
	private JTextArea textKetQuaBai1;
	private JPanel panelBai2;
	private JTextPane DeBaiBai2;
	private JButton btnInBai2;
	private JTextArea textKetQuaBai2;
	private JTextField layNBai1;
	private JTextField layNBai2;
	private JPanel panelBai3;
	private JTextPane DeBaiBai3;
	private JButton btnInBai3;
	private JTextArea textKetQuaBai3;
	private JLabel lblNhapNBai3;
	private JTextField layNBai3;
	private JLabel lblKtQuaBai3;
	private JPanel panelBai4;
	private JTextPane DeBaiBai4;
	private JButton btnInBai4;
	private JTextArea textKetQuaBai4;
	private JLabel lblNhapNBai4;
	private JTextField layNBai4;
	private JLabel lblKtQuaBai4;
	private JButton btnClose;

	/**
	 * Launch the application.
	 */

	public Tuan30() {
		initialize();
	}

	/**
	 * Create the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 920, 561);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Giao diện tuần 2(tuần 30) - Trần Đức Việt - MSSV: 20198275");
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
		
		btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.setBounds(10, 214, 146, 41);
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
		JPanemain.add(panelBai1, "panelBai1");
		panelBai1.setLayout(null);

		JTextPane DeBaiBai1 = new JTextPane();
		DeBaiBai1.setBackground(SystemColor.menu);
		DeBaiBai1.setForeground(SystemColor.desktop);
		DeBaiBai1.setBounds(10, 10, 638, 92);
		DeBaiBai1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		DeBaiBai1.setText(
				"Bài 01: Cho số tự nhiên N bất kỳ\r\n\r\nTính tổng S=1+1/(1+2) + 1/(1+2+3) +…+ 1/(1+2+3+..+N)");
		panelBai1.add(DeBaiBai1);
		DeBaiBai1.setEditable(false);

		btnInBai1 = new JButton("In");
		btnInBai1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnInBai1.setBounds(261, 391, 173, 56);
		panelBai1.add(btnInBai1);

		textKetQuaBai1 = new JTextArea();
		textKetQuaBai1.setSelectedTextColor(Color.BLACK);
		textKetQuaBai1.setBackground(Color.WHITE);
		textKetQuaBai1.setBounds(39, 200, 638, 152);
		panelBai1.add(textKetQuaBai1);
		textKetQuaBai1.setEditable(false);
		textKetQuaBai1.setLineWrap(true);

		JLabel lblNhapN = new JLabel("Nhập N:");
		lblNhapN.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNhapN.setBounds(40, 112, 83, 36);
		panelBai1.add(lblNhapN);

		layNBai1 = new JTextField();
		layNBai1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		layNBai1.setBackground(SystemColor.menu);
		layNBai1.setBounds(104, 112, 143, 36);
		panelBai1.add(layNBai1);
		layNBai1.setColumns(10);

		JLabel lblKtQuaBai1 = new JLabel("Kết quả:");
		lblKtQuaBai1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblKtQuaBai1.setBounds(39, 154, 83, 36);
		panelBai1.add(lblKtQuaBai1);

		panelBai2 = new JPanel();
		JPanemain.add(panelBai2, "panelBai2");
		panelBai2.setLayout(null);

		DeBaiBai2 = new JTextPane();
		DeBaiBai2.setBounds(10, 10, 605, 86);
		DeBaiBai2.setText("Bài 02: Cho số tự nhiên N bất kỳ, tính tổng\r\n\r\nS= 1+ 1/2! + 1/3! + … + 1/N!");
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
		textKetQuaBai2.setBounds(39, 200, 638, 152);
		textKetQuaBai2.setBackground(Color.WHITE);
		panelBai2.add(textKetQuaBai2);
		textKetQuaBai2.setEditable(false);
		textKetQuaBai2.setLineWrap(true);

		JLabel lblNhapNBai2 = new JLabel("Nhập N:");
		lblNhapNBai2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNhapNBai2.setBounds(40, 112, 83, 36);
		panelBai2.add(lblNhapNBai2);

		layNBai2 = new JTextField();
		layNBai2.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		layNBai2.setBackground(SystemColor.menu);
		layNBai2.setBounds(104, 112, 143, 36);
		panelBai2.add(layNBai2);
		layNBai2.setColumns(10);
		JLabel lblKtQuaBai2 = new JLabel("Kết quả:");
		lblKtQuaBai2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblKtQuaBai2.setBounds(39, 154, 83, 36);
		panelBai2.add(lblKtQuaBai2);

		panelBai3 = new JPanel();
		panelBai3.setLayout(null);
		JPanemain.add(panelBai3, "panelBai3");

		DeBaiBai3 = new JTextPane();
		DeBaiBai3.setText(
				"Bài 03: Cho số tự nhiên N bất kỳ:\r\n\r\nTính tổng S=1+1/(1+2!) + 1/(1+2!+3!)+ ..+ 1/(1+2!+3!+..+N!)");
		DeBaiBai3.setForeground(Color.BLACK);
		DeBaiBai3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		DeBaiBai3.setBackground(SystemColor.menu);
		DeBaiBai3.setBounds(10, 10, 605, 86);
		panelBai3.add(DeBaiBai3);
		DeBaiBai3.setEditable(false);

		btnInBai3 = new JButton("In");
		btnInBai3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnInBai3.setBounds(261, 391, 173, 56);
		panelBai3.add(btnInBai3);

		textKetQuaBai3 = new JTextArea();
		textKetQuaBai3.setSelectedTextColor(Color.BLACK);
		textKetQuaBai3.setLineWrap(true);
		textKetQuaBai3.setEditable(false);
		textKetQuaBai3.setBackground(Color.WHITE);
		textKetQuaBai3.setBounds(39, 200, 638, 152);
		panelBai3.add(textKetQuaBai3);
		textKetQuaBai3.setEditable(false);

		lblNhapNBai3 = new JLabel("Nhập N:");
		lblNhapNBai3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNhapNBai3.setBounds(40, 112, 83, 36);
		panelBai3.add(lblNhapNBai3);

		layNBai3 = new JTextField();
		layNBai3.setColumns(10);
		layNBai3.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		layNBai3.setBackground(SystemColor.menu);
		layNBai3.setBounds(104, 112, 143, 36);
		panelBai3.add(layNBai3);

		lblKtQuaBai3 = new JLabel("Kết quả:");
		lblKtQuaBai3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblKtQuaBai3.setBounds(39, 154, 83, 36);
		panelBai3.add(lblKtQuaBai3);

		panelBai4 = new JPanel();
		panelBai4.setLayout(null);
		JPanemain.add(panelBai4, "panelBai4");

		DeBaiBai4 = new JTextPane();
		DeBaiBai4.setText("Bài 04: Dãy Fibonaxi 1, 2, 3, … F(k) = F(k-1) + F(k-2). Tính số Fibonaxi thứ N");
		DeBaiBai4.setForeground(Color.BLACK);
		DeBaiBai4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		DeBaiBai4.setBackground(SystemColor.menu);
		DeBaiBai4.setBounds(10, 10, 605, 86);
		panelBai4.add(DeBaiBai4);
		DeBaiBai4.setEditable(false);

		btnInBai4 = new JButton("In");
		btnInBai4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnInBai4.setBounds(261, 391, 173, 56);
		panelBai4.add(btnInBai4);

		textKetQuaBai4 = new JTextArea();
		textKetQuaBai4.setSelectedTextColor(Color.BLACK);
		textKetQuaBai4.setLineWrap(true);
		textKetQuaBai4.setEditable(false);
		textKetQuaBai4.setBackground(Color.WHITE);
		textKetQuaBai4.setBounds(39, 200, 638, 152);
		panelBai4.add(textKetQuaBai4);
		textKetQuaBai4.setEditable(false);

		lblNhapNBai4 = new JLabel("Nhập N:");
		lblNhapNBai4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNhapNBai4.setBounds(40, 112, 83, 36);
		panelBai4.add(lblNhapNBai4);

		layNBai4 = new JTextField();
		layNBai4.setColumns(10);
		layNBai4.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		layNBai4.setBackground(SystemColor.menu);
		layNBai4.setBounds(104, 112, 143, 36);
		panelBai4.add(layNBai4);

		lblKtQuaBai4 = new JLabel("Kết quả:");
		lblKtQuaBai4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblKtQuaBai4.setBounds(39, 154, 83, 36);
		panelBai4.add(lblKtQuaBai4);
		
		
		setActionBtnBai1();
		setActionBtnBai2();
		setActionBtnBai3();
		setActionBtnBai4();

	}

	// Phương thức set action cho các nút và in kết quả
	// Thiết lập action cho buton in của bài 1
	public void setActionBtnInBai1() {
		btnInBai1.addActionListener((e) -> {
			textKetQuaBai1.setText("");
			Bai1 bai1 = new Bai1(Integer.parseInt(getNBai1()));
			setTextKetQuaBai1(bai1.getTong());

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
			layNBai1.setText("");
			cl.show(JPanemain, "panelBai1");
			setActionBtnInBai1();

		});
	}

	// Thiết lập action cho button bài 2
	public void setActionBtnBai2() {
		btnBai2.addActionListener((e) -> {
			CardLayout cl = (CardLayout) JPanemain.getLayout();
			textKetQuaBai2.setText("");
			textKetQuaBai2.setText("");
			layNBai2.setText("");
			cl.show(JPanemain, "panelBai2");
			setActionBtnInBai2();

		});
	}

	// Thiết lập action cho button bài 3
	public void setActionBtnBai3() {
		btnBai3.addActionListener((e) -> {
			CardLayout cl = (CardLayout) JPanemain.getLayout();
			textKetQuaBai3.setText("");
			layNBai3.setText("");
			cl.show(JPanemain, "panelBai3");
			setActionBtnInBai3();

		});
	}

	// Thiết lập action cho button bài 4
	public void setActionBtnBai4() {
		btnBai4.addActionListener((e) -> {
			CardLayout cl = (CardLayout) JPanemain.getLayout();
			textKetQuaBai4.setText("");
			layNBai4.setText("");
			cl.show(JPanemain, "panelBai4");
			setActionBtnInBai4();

		});
	}

	// Thiết lập action cho buton in của bài 2
	public void setActionBtnInBai2() {
		btnInBai2.addActionListener((e) -> {
			textKetQuaBai2.setText("");
			Bai2 bai2 = new Bai2(Integer.parseInt(getNBai2()));
			setTextKetQuaBai2(bai2.getTong());

		});
	}

	// In kết quả bài 2 lên màn hình
	public void setTextKetQuaBai2(String s) {
		textKetQuaBai2.setText(s);
	}

	// Thiết lập action cho buton in của bài 3
	public void setActionBtnInBai3() {
		btnInBai3.addActionListener((e) -> {
			textKetQuaBai3.setText("");
			Bai3 bai3 = new Bai3(Integer.parseInt(getNBai3()));
			setTextKetQuaBai3(bai3.getTong());

		});
	}

	// In kết quả bài 3 lên màn hình
	public void setTextKetQuaBai3(String s) {
		textKetQuaBai3.setText(s);
	}

	// Thiết lập action cho buton in của bài 4
	public void setActionBtnInBai4() {
		btnInBai4.addActionListener((e) -> {
			textKetQuaBai4.setText("");
			Bai4 bai4 = new Bai4(Integer.parseInt(getNBai4()));
			setTextKetQuaBai4(bai4.getSoFibonaxi());

		});
	}

	// In kết quả bài 4 lên màn hình
	public void setTextKetQuaBai4(String s) {
		textKetQuaBai4.setText(s);
	}

	// Phương thức lấy N bài 1
	public String getNBai1() {
		String s = layNBai1.getText();
		return s;
	}

	// Phương thức lấy N bài 2
	public String getNBai2() {
		String s = layNBai2.getText();
		return s;
	}

	// Phương thức lấy N bài 3
	public String getNBai3() {
		String s = layNBai3.getText();
		return s;
	}

	// Phương thức lấy N bài 4
	public String getNBai4() {
		String s = layNBai4.getText();
		return s;
	}

}
