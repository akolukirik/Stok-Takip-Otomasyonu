import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTabbedPane;
import java.awt.Color;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Window.Type;

import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.ImageIcon;

public class personel extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt3;
	private JTextField txt4;
	private JTextField txt6;
	private JTextField txt5;
	private JTable table;

	DefaultTableModel modelim = new DefaultTableModel();

	Object[] kolonlar = { "p_id", "p_adi", "p_soyadi", "p_calismagunu", "p_cinsiyet", "p_telefon", "p_tc",
			"p_calismasaat" };
	Object[] satirlar = new Object[8];
	private JTextField txt2;
	private final JLabel lblNewLabel = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					personel frame = new personel();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public personel() {

		setIconImage(Toolkit.getDefaultToolkit().getImage((this.getClass().getResource("/a.png"))));

		setBackground(Color.BLACK);
		setOpacity(1.0f);
		setType(Type.POPUP);
		setFont(new Font("Dialog", Font.PLAIN, 12));
		setTitle("Personel Ýþlemleri");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 180, 1071, 726);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton button = new JButton("Listele");
		button.setBackground(Color.WHITE);
		button.setBounds(101, 45, 115, 40);
		contentPane.add(button);

		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(332, 45, 115, 40);
		contentPane.add(comboBox);

		JLabel label = new JLabel("Arama");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(279, 53, 70, 20);
		contentPane.add(label);

		txt1 = new JTextField();
		txt1.setColumns(10);
		txt1.setBounds(457, 50, 115, 30);
		contentPane.add(txt1);

		JButton btnAra = new JButton("Ara");
		
		btnAra.setBackground(Color.WHITE);
		btnAra.setBounds(582, 45, 115, 40);
		contentPane.add(btnAra);

		JButton btnGncelle = new JButton("G\u00FCncelle");

		btnGncelle.setBackground(Color.WHITE);
		btnGncelle.setBounds(777, 167, 115, 40);
		contentPane.add(btnGncelle);

		JButton btnEkle = new JButton("Ekle");

		btnEkle.setBackground(Color.WHITE);
		btnEkle.setBounds(777, 45, 115, 40);
		contentPane.add(btnEkle);

		JButton btnSil = new JButton("Sil");

		btnSil.setBackground(Color.WHITE);
		btnSil.setBounds(777, 106, 115, 40);
		contentPane.add(btnSil);

		txt3 = new JTextField();
		txt3.setColumns(10);
		txt3.setBounds(845, 269, 115, 30);
		contentPane.add(txt3);

		txt4 = new JTextField();
		txt4.setColumns(10);
		txt4.setBounds(707, 337, 115, 30);
		contentPane.add(txt4);

		JLabel lblPid = new JLabel("p_id");
		lblPid.setForeground(Color.WHITE);
		lblPid.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPid.setBounds(707, 242, 46, 18);
		contentPane.add(lblPid);

		JLabel lblPadi = new JLabel("p_adi");
		lblPadi.setForeground(Color.WHITE);
		lblPadi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPadi.setBounds(845, 244, 46, 18);
		contentPane.add(lblPadi);

		JLabel lblPsoyadi = new JLabel("p_soyadi");
		lblPsoyadi.setForeground(Color.WHITE);
		lblPsoyadi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPsoyadi.setBounds(707, 312, 115, 18);
		contentPane.add(lblPsoyadi);

		JLabel lblPcalismagunu = new JLabel("p_calismagunu");
		lblPcalismagunu.setForeground(Color.WHITE);
		lblPcalismagunu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPcalismagunu.setBounds(845, 312, 106, 18);
		contentPane.add(lblPcalismagunu);

		JLabel lblPcinsiyet = new JLabel("p_cinsiyet");
		lblPcinsiyet.setForeground(Color.WHITE);
		lblPcinsiyet.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPcinsiyet.setBounds(707, 382, 97, 18);
		contentPane.add(lblPcinsiyet);

		JLabel lblPtelefon = new JLabel("p_telefon");
		lblPtelefon.setForeground(Color.WHITE);
		lblPtelefon.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPtelefon.setBounds(845, 382, 97, 18);
		contentPane.add(lblPtelefon);

		JButton button_5 = new JButton("Ana Sayfa");
		button_5.setBackground(Color.WHITE);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				admin a = new admin();
				a.setVisible(true);
				setVisible(false);
			}
		});
		button_5.setBounds(845, 587, 115, 40);
		contentPane.add(button_5);

		JLabel lblPtc = new JLabel("p_tc");
		lblPtc.setForeground(Color.WHITE);
		lblPtc.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPtc.setBounds(707, 457, 46, 18);
		contentPane.add(lblPtc);

		JLabel lblPcalismasaati = new JLabel("p_calismasaati");
		lblPcalismasaati.setForeground(Color.WHITE);
		lblPcalismasaati.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPcalismasaati.setBounds(845, 457, 106, 18);
		contentPane.add(lblPcalismasaati);

		txt6 = new JTextField();
		txt6.setColumns(10);
		txt6.setBounds(707, 482, 115, 30);
		contentPane.add(txt6);

		txt5 = new JTextField();
		txt5.setColumns(10);
		txt5.setBounds(845, 407, 115, 30);
		contentPane.add(txt5);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(101, 101, 598, 554);
		contentPane.add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
		scrollPane.setColumnHeaderView(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\aakol\\OneDrive\\Desktop\\pa.png"));

		comboBox.setModel(new DefaultComboBoxModel(new String[] { "p_id", "p_adi", "p_soyadi", "p_calismagunu",
				"p_cinsiyet", "p_telefon", "p_tc", "p_calismasaat" }));

		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBackground(Color.WHITE);
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] { "Kad\u0131n", "Erkek" }));
		comboBox_3.setBounds(707, 407, 115, 30);
		contentPane.add(comboBox_3);

		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBackground(Color.WHITE);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] { "Hafta i\u00E7i", "Hafta sonu" }));
		comboBox_2.setBounds(845, 337, 115, 30);
		contentPane.add(comboBox_2);

		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBackground(Color.WHITE);
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] { "0-8", "8-16", "16-24" }));
		comboBox_4.setBounds(845, 482, 115, 30);
		contentPane.add(comboBox_4);

		txt2 = new JTextField();
		txt2.setBounds(707, 269, 115, 30);
		contentPane.add(txt2);
		txt2.setColumns(10);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(this.getClass().getResource("/pa5.png")));
		label_1.setBounds(-32, -7, 1121, 698);
		contentPane.add(label_1);

		String sorgu = "SELECT * FROM personel order by p_id";
		
		ResultSet rs = baglanti.yap(sorgu);

	/*	try {
			while (rs.next()) {
				comboBox.addItem(rs.getInt("p_id"));

			}
		} catch (SQLException e) {

			e.printStackTrace();:
		}
*/
		modelim.setColumnCount(0);
		modelim.setRowCount(0);
		modelim.setColumnIdentifiers(kolonlar);

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String sorgu = "SELECT * FROM personel order by p_id";

				modelim.setRowCount(0);

				ResultSet rs = baglanti.yap(sorgu);

				try {
					while (rs.next()) {
						satirlar[0] = rs.getInt("p_id");
						satirlar[1] = rs.getString("p_adi");
						satirlar[2] = rs.getString("p_soyadi");
						satirlar[3] = rs.getString("p_calismagunu");
						satirlar[4] = rs.getString("p_cinsiyet");
						satirlar[5] = rs.getString("p_telefon");
						satirlar[6] = rs.getString("p_tc");
						satirlar[7] = rs.getString("p_calismasaat");

						modelim.addRow(satirlar);

					}
				} catch (SQLException e) {

					e.printStackTrace();
				}

				table.setModel(modelim);

			}
		});

		// Ekle

		btnEkle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String p_id, p_adi, p_soyadi, p_telefon, p_tc, p_calismagunu, p_cinsiyet, p_calismasaat;

				p_id = txt2.getText();
				p_adi = txt3.getText();
				p_soyadi = txt4.getText();
				p_calismagunu = comboBox_2.getSelectedItem().toString();
				p_cinsiyet = comboBox_3.getSelectedItem().toString();
				p_telefon = txt5.getText();
				p_tc = txt6.getText();
				p_calismasaat = comboBox_4.getSelectedItem().toString();

				String sorgu = " INSERT INTO personel (p_id,p_adi,p_soyadi,p_calismagunu,p_cinsiyet,p_telefon,p_tc,p_calismasaat) VALUES ("
						+ p_id + ",'" + p_adi + "','" + p_soyadi + "','" + p_calismagunu + "'" + ",'" + p_cinsiyet
						+ "'," + p_telefon + "," + p_tc + ",'" + p_calismasaat + "')";

				System.out.println(sorgu);

				baglanti.ekle(sorgu);

			}
		});

		// Sil

		btnSil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String p_id, sorgu;

				p_id = txt2.getText();

				sorgu = "DELETE FROM personel WHERE p_id=" + p_id;

				baglanti.sil(sorgu);

			}
		});

		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txt2.setText((String) modelim.getValueAt(table.getSelectedRow(), 0).toString());
				txt3.setText((String) modelim.getValueAt(table.getSelectedRow(), 1).toString());
				txt4.setText((String) modelim.getValueAt(table.getSelectedRow(), 2));
				comboBox_2.setSelectedItem(modelim.getValueAt(table.getSelectedRow(), 3));
				comboBox_3.setSelectedItem(modelim.getValueAt(table.getSelectedRow(), 4));
				txt5.setText((String) modelim.getValueAt(table.getSelectedRow(), 5));
				txt6.setText((String) modelim.getValueAt(table.getSelectedRow(), 6).toString());
				comboBox_4.setSelectedItem(modelim.getValueAt(table.getSelectedRow(), 7));

			}
		});

		// Güncelle

		btnGncelle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String p_id, p_adi, p_soyadi, p_telefon, p_tc, p_calismagunu, p_cinsiyet, p_calismasaat;

				p_id = txt2.getText();
				p_adi = txt3.getText();
				p_soyadi = txt4.getText();
				p_calismagunu = comboBox_2.getSelectedItem().toString();
				p_cinsiyet = comboBox_3.getSelectedItem().toString();
				p_telefon = txt5.getText();
				p_tc = txt6.getText();
				p_calismasaat = comboBox_4.getSelectedItem().toString();

				String sorgu = " UPDATE personel SET p_id=" + p_id + "," + "p_adi='" + p_adi + "'," + "p_soyadi='"
						+ p_soyadi + "'," + "p_calismagunu='" + p_calismagunu + "'," + "p_cinsiyet='" + p_cinsiyet
						+ "'," + "p_telefon='" + p_telefon + "'," + "p_tc='" + p_tc + "'," + "p_calismasaat='"
						+ p_calismasaat + "'" + " WHERE p_id=" + p_id;

				System.out.println(sorgu);

				baglanti.ekle(sorgu);

				

			}
		});
		
		
		// Ara
		
		btnAra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				modelim.setRowCount(0);

				String a = txt1.getText();

				String sorgu = null;

				ResultSet rs = null;

				int s = comboBox.getSelectedIndex();
				
				if (s == 0) {
					sorgu = "SELECT * from personel  WHERE p_id=" + Integer.parseInt(a);
				} else if (s == 1) {
					sorgu = "SELECT * from personel  WHERE p_adi like'" + a + "%'";
				} else if (s == 2) {
					sorgu = "SELECT * from personel  WHERE p_soyadi like'" + a + "%'";
				} else if (s == 3) {
					sorgu = "SELECT * from personel  WHERE p_calismagunu like'" + a + "%'";
				} else if (s == 4) {
					sorgu = "SELECT * from personel  WHERE p_cinsiyet like'" + a + "%'";
				} else if (s == 5) {
					sorgu = "SELECT * from personel  WHERE p_telefon like'" + a + "%'";
				} else if (s == 6) {
					sorgu = "SELECT * from personel  WHERE p_tc like'" + a + "%'";
				}
				else if (s == 7) {
					sorgu = "SELECT * from personel  WHERE p_calismasaat like '" + a + "%'";
				}
					
				
				System.out.println(sorgu);

				rs = baglanti.ara(sorgu);
				
				try {
					while (rs.next()) {
						satirlar[0] = rs.getInt("p_id");
						satirlar[1] = rs.getString("p_adi");
						satirlar[2] = rs.getString("p_soyadi");
						satirlar[3] = rs.getString("p_calismagunu");
						satirlar[4] = rs.getString("p_cinsiyet");
						satirlar[5] = rs.getString("p_telefon");
						satirlar[6] = rs.getString("p_tc");
						satirlar[7] = rs.getString("p_calismasaat");

						modelim.addRow(satirlar);

					}
				} catch (SQLException e) {

					e.printStackTrace();
				}

				table.setModel(modelim);


				
			}
		});
	}
}
