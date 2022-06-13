/*Họ và tên: Trần Đức Việt
 MSSV: 20198275
 */
package Tuan1;

//Giao diện các bài tuần 29
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
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

public class Tuan29 extends JFrame {
	private JFrame frame;
	private JPanel JPanemain, panelBai1;
	private JPanel contentPane;
	private JButton btnBai1, btnBai2, btnBai3, btnBai4, btnBai6, btnInBai1, btnBai5;
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
	private JButton btnBai7;
	private JPanel panelBai5;
	private JTextPane DeBaiBai5;
	private JButton btnInBai5;
	private JTextArea textKetQuaBai5;
	private JPanel panelBai6;
	private JTextPane DeBaiBai6;
	private JButton btnInBai6;
	private JTextArea textKetQuaBai6;
	private JPanel panelBai7;
	private JTextPane DeBaiBai7;
	private JButton btnInBai7;
	private JTextArea textKetQuaBai7;
	private JLabel lblKetQua;
	private JButton btnClose;

	/**
	 * Launch the application.
	 */

	public Tuan29() {
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

		btnBai7 = new JButton("Bài 7");
		btnBai7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnBai7.setBounds(10, 316, 146, 41);
		frame.getContentPane().add(btnBai7);

		btnBai5 = new JButton("Bài 5");
		btnBai5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnBai5.setBounds(10, 214, 146, 41);
		frame.getContentPane().add(btnBai5);
		
		btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.setBounds(10, 367, 146, 41);
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
		DeBaiBai1.setBounds(10, 10, 386, 28);
		DeBaiBai1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		DeBaiBai1.setText("Bài 01: In ra màn hình tất cả các hợp số <100");
		panelBai1.add(DeBaiBai1);
		DeBaiBai1.setEditable(false);

		btnInBai1 = new JButton("In");
		btnInBai1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnInBai1.setBounds(261, 391, 173, 56);
		panelBai1.add(btnInBai1);

		textKetQuaBai1 = new JTextArea();
		textKetQuaBai1.setSelectedTextColor(Color.BLACK);
		textKetQuaBai1.setBackground(Color.WHITE);
		textKetQuaBai1.setBounds(98, 89, 550, 223);
		panelBai1.add(textKetQuaBai1);
		textKetQuaBai1.setEditable(false);
		textKetQuaBai1.setLineWrap(true);
		textKetQuaBai1.setEditable(false);

		lblKetQua = new JLabel("Kết quả:");
		lblKetQua.setHorizontalAlignment(SwingConstants.LEFT);
		lblKetQua.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblKetQua.setBounds(20, 48, 82, 31);
		panelBai1.add(lblKetQua);

		panelBai2 = new JPanel();
		JPanemain.add(panelBai2, "panelBai2");
		panelBai2.setLayout(null);

		DeBaiBai2 = new JTextPane();
		DeBaiBai2.setBounds(10, 10, 436, 28);
		DeBaiBai2.setText("Bài 02: In ra màn hình 20 số nguyên tố đầu tiên");
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
		textKetQuaBai2.setBounds(98, 89, 550, 223);
		textKetQuaBai2.setBackground(Color.WHITE);
		panelBai2.add(textKetQuaBai2);
		textKetQuaBai2.setEditable(false);
		textKetQuaBai2.setLineWrap(true);
		textKetQuaBai2.setEditable(false);

		lblKetQua = new JLabel("Kết quả:");
		lblKetQua.setHorizontalAlignment(SwingConstants.LEFT);
		lblKetQua.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblKetQua.setBounds(20, 48, 82, 31);
		panelBai2.add(lblKetQua);

		panelBai3 = new JPanel();
		JPanemain.add(panelBai3, "panelBai3");
		panelBai3.setLayout(null);

		DeBaiBai3 = new JTextPane();
		DeBaiBai3.setText("Bài 03: In ra màn hình tất cả các số nguyên tố từ 1000 đến 2000");
		DeBaiBai3.setForeground(Color.BLACK);
		DeBaiBai3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		DeBaiBai3.setBackground(SystemColor.menu);
		DeBaiBai3.setBounds(10, 10, 638, 28);
		panelBai3.add(DeBaiBai3);
		DeBaiBai3.setEditable(false);

		btnInBai3 = new JButton("In");
		btnInBai3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnInBai3.setBounds(261, 391, 173, 56);
		panelBai3.add(btnInBai3);

		textKetQuaBai3 = new JTextArea();
		textKetQuaBai3.setBackground(SystemColor.white);
		textKetQuaBai3.setBounds(98, 89, 550, 223);
		panelBai3.add(textKetQuaBai3);
		textKetQuaBai3.setEditable(false);
		textKetQuaBai3.setLineWrap(true);
		textKetQuaBai3.setEditable(false);

		lblKetQua = new JLabel("Kết quả:");
		lblKetQua.setHorizontalAlignment(SwingConstants.LEFT);
		lblKetQua.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblKetQua.setBounds(20, 48, 82, 31);
		panelBai3.add(lblKetQua);

		panelBai4 = new JPanel();
		panelBai4.setLayout(null);
		JPanemain.add(panelBai4, "panelBai4");

		DeBaiBai4 = new JTextPane();
		DeBaiBai4.setText("Bài 04: In ra màn hình các số <100 và chia hết cho 3,7");
		DeBaiBai4.setForeground(Color.BLACK);
		DeBaiBai4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		DeBaiBai4.setBackground(SystemColor.menu);
		DeBaiBai4.setBounds(10, 10, 685, 28);
		panelBai4.add(DeBaiBai4);
		DeBaiBai4.setEditable(false);

		btnInBai4 = new JButton("In");
		btnInBai4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnInBai4.setBounds(261, 391, 173, 56);
		panelBai4.add(btnInBai4);

		textKetQuaBai4 = new JTextArea();
		textKetQuaBai4.setBackground(SystemColor.white);
		textKetQuaBai4.setBounds(98, 89, 550, 223);
		panelBai4.add(textKetQuaBai4);
		textKetQuaBai4.setEditable(false);
		textKetQuaBai4.setLineWrap(true);
		textKetQuaBai4.setEditable(false);

		lblKetQua = new JLabel("Kết quả:");
		lblKetQua.setHorizontalAlignment(SwingConstants.LEFT);
		lblKetQua.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblKetQua.setBounds(20, 48, 82, 31);
		panelBai4.add(lblKetQua);

		panelBai5 = new JPanel();
		panelBai5.setLayout(null);
		JPanemain.add(panelBai5, "panelBai5");

		DeBaiBai5 = new JTextPane();
		DeBaiBai5.setText("Bài 05: In ra màn hình các số nằm giữa 1000 và 2000 đồng thời chia hết cho 3,5,7");
		DeBaiBai5.setForeground(Color.BLACK);
		DeBaiBai5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		DeBaiBai5.setBackground(SystemColor.menu);
		DeBaiBai5.setBounds(10, 10, 685, 28);
		panelBai5.add(DeBaiBai5);
		DeBaiBai5.setEditable(false);

		btnInBai5 = new JButton("In");
		btnInBai5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnInBai5.setBounds(261, 391, 173, 56);
		panelBai5.add(btnInBai5);

		textKetQuaBai5 = new JTextArea();
		textKetQuaBai5.setBackground(SystemColor.white);
		textKetQuaBai5.setBounds(98, 89, 550, 223);
		panelBai5.add(textKetQuaBai5);
		textKetQuaBai5.setEditable(false);
		textKetQuaBai5.setLineWrap(true);
		textKetQuaBai5.setEditable(false);

		lblKetQua = new JLabel("Kết quả:");
		lblKetQua.setHorizontalAlignment(SwingConstants.LEFT);
		lblKetQua.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblKetQua.setBounds(20, 48, 82, 31);
		panelBai5.add(lblKetQua);

		panelBai6 = new JPanel();
		panelBai6.setLayout(null);
		JPanemain.add(panelBai6, "panelBai6");

		DeBaiBai6 = new JTextPane();
		DeBaiBai6.setText(
				"Bài 06: In ra màn hình 5 số hoàn hảo đầu tiên (Số hoàn hảo là số có tổng bằng các ước số của mình kể cả 1");
		DeBaiBai6.setForeground(Color.BLACK);
		DeBaiBai6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		DeBaiBai6.setBackground(SystemColor.white);
		DeBaiBai6.setBounds(10, 10, 720, 56);
		panelBai6.add(DeBaiBai6);
		DeBaiBai6.setEditable(false);

		btnInBai6 = new JButton("In");
		btnInBai6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnInBai6.setBounds(261, 391, 173, 56);
		panelBai6.add(btnInBai6);

		textKetQuaBai6 = new JTextArea();
		textKetQuaBai6.setBackground(SystemColor.white);
		textKetQuaBai6.setBounds(98, 89, 550, 223);
		panelBai6.add(textKetQuaBai6);
		textKetQuaBai6.setEditable(false);
		textKetQuaBai6.setLineWrap(true);
		textKetQuaBai6.setEditable(false);

		lblKetQua = new JLabel("Kết quả:");
		lblKetQua.setHorizontalAlignment(SwingConstants.LEFT);
		lblKetQua.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblKetQua.setBounds(20, 63, 82, 31);
		panelBai6.add(lblKetQua);

		panelBai7 = new JPanel();
		panelBai7.setLayout(null);
		JPanemain.add(panelBai7, "panelBai7");

		DeBaiBai7 = new JTextPane();
		DeBaiBai7.setText(
				"Bài 07: Trong các số tự nhiên <=100 hãy đếm xem có bao nhiêu số\r\n\r\na. Chia hết cho 5\r\n\r\nb. Chia 5 dư 1\r\n\r\nc. Chia 5 dư 2\r\n\r\nd. Chia 5 dư 3");
		DeBaiBai7.setForeground(Color.BLACK);
		DeBaiBai7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		DeBaiBai7.setBackground(SystemColor.menu);
		DeBaiBai7.setBounds(10, 10, 720, 204);
		panelBai7.add(DeBaiBai7);
		DeBaiBai7.setEditable(false);

		btnInBai7 = new JButton("In");
		btnInBai7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnInBai7.setBounds(261, 448, 173, 56);
		panelBai7.add(btnInBai7);

		textKetQuaBai7 = new JTextArea();
		textKetQuaBai7.setBackground(SystemColor.white);
		textKetQuaBai7.setBounds(93, 265, 550, 173);
		panelBai7.add(textKetQuaBai7);
		textKetQuaBai7.setEditable(false);
		textKetQuaBai7.setLineWrap(true);
		textKetQuaBai7.setEditable(false);

		lblKetQua = new JLabel("Kết quả:");
		lblKetQua.setHorizontalAlignment(SwingConstants.LEFT);
		lblKetQua.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblKetQua.setBounds(40, 224, 82, 31);
		panelBai7.add(lblKetQua);


		setActionBtnBai1();
		setActionBtnBai2();
		setActionBtnBai3();
		setActionBtnBai4();
		setActionBtnBai5();
		setActionBtnBai6();
		setActionBtnBai7();

	}

	// Phương thức set action cho các nút và in kết quả
	// Thiết lập action cho buton in của bài 1
	public void setActionBtnInBai1() {
		btnInBai1.addActionListener((e) -> {
			Bai1 bai1 = new Bai1();
			setTextKetQuaBai1(bai1.getString());

		});
	}

	// In kết quả bài 1 lên màn hình
	public void setTextKetQuaBai1(String s) {
		textKetQuaBai1.setText(s);
	}

	// Thiết lập action cho button bài 1
	public void setActionBtnBai1() {
		btnBai1.addActionListener((e) -> {
			textKetQuaBai1.setText("");
			CardLayout cl = (CardLayout) JPanemain.getLayout();
			cl.show(JPanemain, "panelBai1");
			setActionBtnInBai1();

		});
	}

	// Thiết lập action cho button bài 2
	public void setActionBtnBai2() {
		btnBai2.addActionListener((e) -> {
			textKetQuaBai2.setText("");
			CardLayout cl = (CardLayout) JPanemain.getLayout();
			cl.show(JPanemain, "panelBai2");
			setActionBtnInBai2();

		});
	}

	// Thiết lập action cho button bài 3
	public void setActionBtnBai3() {
		btnBai3.addActionListener((e) -> {
			textKetQuaBai3.setText("");
			CardLayout cl = (CardLayout) JPanemain.getLayout();
			cl.show(JPanemain, "panelBai3");
			setActionBtnInBai3();

		});
	}

	// Thiết lập action cho button bài 4
	public void setActionBtnBai4() {
		btnBai4.addActionListener((e) -> {
			textKetQuaBai4.setText("");
			CardLayout cl = (CardLayout) JPanemain.getLayout();
			cl.show(JPanemain, "panelBai4");
			setActionBtnInBai4();

		});
	}

	// Thiết lập action cho button bài 5
	public void setActionBtnBai5() {
		btnBai5.addActionListener((e) -> {
			textKetQuaBai5.setText("");
			CardLayout cl = (CardLayout) JPanemain.getLayout();
			cl.show(JPanemain, "panelBai5");
			setActionBtnInBai5();

		});
	}

	// Thiết lập action cho buton in của bài 2
	public void setActionBtnInBai2() {
		btnInBai2.addActionListener((e) -> {
			Bai2 bai2 = new Bai2();
			setTextKetQuaBai2(bai2.getString());

		});
	}

	// In kết quả bài 2 lên màn hình
	public void setTextKetQuaBai2(String s) {
		textKetQuaBai2.setText(s);
	}

	// Thiết lập action cho button bài 7
	public void setActionBtnBai7() {
		btnBai7.addActionListener((e) -> {
			textKetQuaBai7.setText("");
			CardLayout cl = (CardLayout) JPanemain.getLayout();
			cl.show(JPanemain, "panelBai7");
			setActionBtnInBai7();

		});
	}

	// Thiết lập action cho buton in của bài 3
	public void setActionBtnInBai3() {
		btnInBai3.addActionListener((e) -> {
			Bai3 bai3 = new Bai3();
			setTextKetQuaBai3(bai3.getString());

		});
	}

	// In kết quả bài 3 lên màn hình
	public void setTextKetQuaBai3(String s) {
		textKetQuaBai3.setText(s);
	}

	// Thiết lập action cho button bài 6
	public void setActionBtnBai6() {
		btnBai6.addActionListener((e) -> {
			textKetQuaBai6.setText("");
			CardLayout cl = (CardLayout) JPanemain.getLayout();
			cl.show(JPanemain, "panelBai6");
			setActionBtnInBai6();

		});
	}

	// Thiết lập action cho buton in của bài 4
	public void setActionBtnInBai4() {
		btnInBai4.addActionListener((e) -> {
			Bai4 bai4 = new Bai4();
			setTextKetQuaBai4(bai4.getString());

		});
	}

	// In kết quả bài 4 lên màn hình
	public void setTextKetQuaBai4(String s) {
		textKetQuaBai4.setText(s);
	}

	// Thiết lập action cho buton in của bài 5
	public void setActionBtnInBai5() {
		btnInBai5.addActionListener((e) -> {
			Bai5 bai5 = new Bai5();
			setTextKetQuaBai5(bai5.getString());

		});
	}

	// In kết quả bài 5 lên màn hình
	public void setTextKetQuaBai5(String s) {
		textKetQuaBai5.setText(s);
	}

	// Thiết lập action cho buton in của bài 6
	public void setActionBtnInBai6() {
		btnInBai6.addActionListener((e) -> {
			setTextKetQuaBai6("");
			Bai6 bai6 = new Bai6();
			setTextKetQuaBai6(bai6.getString());

		});
	}

	// In kết quả bài 6 lên màn hình
	public void setTextKetQuaBai6(String s) {
		textKetQuaBai6.setText(s);
	}

	// Thiết lập action cho buton in của bài 7
	public void setActionBtnInBai7() {
		btnInBai7.addActionListener((e) -> {
			textKetQuaBai7.setText("");
			Bai7 bai7 = new Bai7();
			textKetQuaBai7.append(bai7.getStringCaua() + "\n" + bai7.getStringCaub() + "\n" + bai7.getStringCauc()
					+ "\n" + bai7.getStringCaud());

		});
	}
	
}
