/*Họ và tên: Trần Đức Việt
 MSSV: 20198275
 */
package Tuan3;

import java.util.ArrayList;

/*
 * Bài 06: Cho một dãy số tự nhiên, hãy in ra tất cả các số hạng của dãy trên thỏa mãn: số này là ước số thực sự của 1 số hạng khác trong dãy trên.
 * */
public class Bai6 {

	private String s = "";

	// Phương thuswcs xắp xếp tăng dần
	public void xapxep(int b[]) {
		int c;
		for (int i = 0; i < (b.length - 1); i++) {
			for (int j = i + 1; j < b.length; j++) {
				if (b[i] > b[j]) {
					c = b[i];
					b[i] = b[j];
					b[j] = c;
				}
			}
		}
	}

	// Phương thức tìm ước của dãy của số a
	public static int[] timUoc(int a) {
		int b[] = new int[a];
		int c;
		int j = 0;
		for (int i = 1; i < a; i++) {
			if (a % i == 0) {
				b[j++] = i;
			}
		}
		c = j;
		int d[] = new int[c];
		for (int i = 0; i < c; i++) {
			d[i] = b[i];
		}
		return d;
	}

	// phương thức khởi tạo
	public Bai6(int a[]) {
		ArrayList<ArrayList<Integer>> l = new ArrayList<ArrayList<Integer>>();
		xapxep(a);
		int c = a.length;
		int r = a[a.length - 1];
		int[][] d = new int[c][r];
		int n = 1;
		for (int i = 0; i < a.length; i++) {
			ArrayList<Integer> t = new ArrayList<>();
			d[i][0] = a[i];
			t.add(a[i]);
			for (int j = i + 1; j < a.length; j++) {
				// tim uoc cua arr[i]
				int[] temp = timUoc(a[j]);
				for (int z = 0; z < temp.length; z++) {

					if (a[i] == temp[z]) {
						d[i][n] = a[j];
						t.add(a[j]);
						n++;
					}

				}

			}
			l.add(t);
			n = 1;
		}
		for (int i = 0; i < l.size(); i++) {
			if (l.get(i).size() == 1) {
				continue;
			}
			s = s + l.get(i).get(0) + " là ước của ";
			for (int j = 1; j < l.get(i).size(); j++) {

				s = s + String.valueOf((l.get(i)).get(j)) + " ";

			}
			s = s + "trong dãy \n";
		}
		System.out.print(s);

	}

	// phuong thức lấy xâu kết quả
	public String getKetQua() {
		return s;
	}

}
