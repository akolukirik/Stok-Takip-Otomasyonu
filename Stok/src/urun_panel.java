import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class urun_panel extends JFrame {

	private JPanel contentPane;

	DefaultTableModel modelim = new DefaultTableModel();

	Object[] kolonlar = { "tec_urunid", "teknolojiid", "p_id", "marka", "model", "fiyat", "adet" };
	Object[] satirlar = new Object[7];

	DefaultTableModel modelim2 = new DefaultTableModel();
	Object[] kolonlar2 = { "g_urunid", "gamingid", "p_id", "marka", "model", "fiyat", "adet" };
	Object[] satirlar2 = new Object[7];

	DefaultTableModel modelim3 = new DefaultTableModel();
	Object[] kolonlar3 = { "be_urunid", "beyazesyaid", "p_id", "marka", "model", "fiyat", "adet" };
	Object[] satirlar3 = new Object[7];

	DefaultTableModel modelim4 = new DefaultTableModel();
	Object[] kolonlar4 = { "a_urunid", "aksesuarid", "p_id", "marka", "model", "fiyat", "adet" };
	Object[] satirlar4 = new Object[7];

	private JTextField txt1;
	private JTextField txt6;
	private JTextField txt4;
	private JTextField txt2;
	private JTextField txt5;

	static admin a = new admin();

	private JTable table;
	private JTextField txt11;
	private JTable table_1;
	private JTextField txt21;
	private JTable table_2;
	private JTextField txt31;
	private JTable table_3;
	private JTextField txt16;
	private JTextField txt14;
	private JTextField txt12;
	private JTextField txt15;
	private JTextField txt26;
	private JTextField txt24;
	private JTextField txt22;
	private JTextField txt25;
	private JTextField txt36;
	private JTextField txt34;
	private JTextField txt32;
	private JTextField txt35;
	private JTextField txt7;
	private JTextField txt17;
	private JTextField txt27;
	private JTextField txt37;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					urun_panel frame = new urun_panel();
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
	public urun_panel() {

		setTitle("\u00DCr\u00FCn i\u015Flemleri");
		setIconImage(Toolkit.getDefaultToolkit().getImage((this.getClass().getResource("/p.png"))));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 180, 1040, 701);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(82, 56, 880, 560);
		tabbedPane.setForeground(Color.BLACK);
		tabbedPane.setBackground(Color.WHITE);
		contentPane.add(tabbedPane);

		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 0, 102));
		panel.setBackground(Color.RED);
		tabbedPane.addTab("Teknoloji", null, panel, null);
		panel.setLayout(null);

		JButton btnNewButton = new JButton("Listele");
		btnNewButton.setBounds(10, 11, 115, 40);
		btnNewButton.setBackground(Color.WHITE);
		panel.add(btnNewButton);

		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox.setBounds(241, 11, 115, 40);
		comboBox.setBackground(Color.WHITE);
		panel.add(comboBox);

		JLabel lblArama = new JLabel("Arama");
		lblArama.setBounds(188, 19, 70, 20);
		lblArama.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(lblArama);

		txt1 = new JTextField();
		txt1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt1.setBounds(366, 16, 115, 30);
		panel.add(txt1);
		txt1.setColumns(10);

		JButton btnNewButton_1 = new JButton("Ara");

		btnNewButton_1.setBounds(491, 11, 115, 40);
		btnNewButton_1.setBackground(Color.WHITE);
		panel.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("G\u00FCncelle");

		btnNewButton_2.setBounds(686, 133, 115, 40);
		btnNewButton_2.setBackground(Color.WHITE);
		panel.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Ekle");

		btnNewButton_3.setBounds(686, 11, 115, 40);
		btnNewButton_3.setBackground(Color.WHITE);
		panel.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("Sil");

		btnNewButton_4.setBounds(686, 72, 115, 40);
		btnNewButton_4.setBackground(Color.WHITE);
		panel.add(btnNewButton_4);

		txt6 = new JTextField();
		txt6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt6.setBounds(754, 373, 115, 30);
		panel.add(txt6);
		txt6.setColumns(10);

		txt4 = new JTextField();
		txt4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt4.setBounds(754, 305, 115, 30);
		panel.add(txt4);
		txt4.setColumns(10);

		txt2 = new JTextField();
		txt2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt2.setBounds(616, 235, 115, 30);
		panel.add(txt2);
		txt2.setColumns(10);

		txt5 = new JTextField();
		txt5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt5.setBounds(616, 373, 115, 30);
		panel.add(txt5);
		txt5.setColumns(10);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(616, 303, 115, 30);
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(comboBox_1);

		JLabel lblNewLabel = new JLabel("tec_urunid");
		lblNewLabel.setBounds(616, 210, 115, 18);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("teknolojiid");
		lblNewLabel_1.setBounds(754, 210, 106, 18);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("p_id");
		lblNewLabel_2.setBounds(616, 278, 46, 18);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("marka");
		lblNewLabel_3.setBounds(754, 276, 46, 18);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("model");
		lblNewLabel_4.setBounds(616, 349, 46, 18);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("adet");
		lblNewLabel_5.setBounds(616, 414, 46, 18);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(lblNewLabel_5);

		JButton btnNewButton_5 = new JButton("Ana Sayfa");
		btnNewButton_5.setBounds(754, 482, 115, 40);

		btnNewButton_5.setBackground(Color.WHITE);
		panel.add(btnNewButton_5);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 67, 598, 455);
		panel.add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);

		////////////////////////////////////////////////

		comboBox.setModel(new DefaultComboBoxModel(
				new String[] { "tec_urunid", "teknolojiid", "p_id", "marka", "model", "fiyat", "adet" }));

		JComboBox cb1 = new JComboBox();
		cb1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cb1.setBackground(Color.WHITE);
		cb1.setBounds(754, 235, 115, 30);
		panel.add(cb1);

		txt7 = new JTextField();
		txt7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt7.setColumns(10);
		txt7.setBounds(616, 443, 115, 30);
		panel.add(txt7);

		JLabel lblFiyat = new JLabel("fiyat");
		lblFiyat.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFiyat.setBounds(754, 351, 46, 14);
		panel.add(lblFiyat);

		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBackground(Color.WHITE);
		lblNewLabel_7.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_7.setIcon(new ImageIcon(this.getClass().getResource("/2.png")));
		lblNewLabel_7.setBounds(0, 0, 875, 532);
		panel.add(lblNewLabel_7);

		String sorgu = "SELECT * FROM personel order by p_id";

		ResultSet rs = baglanti.yap(sorgu);

		try {
			while (rs.next()) {
				comboBox_1.addItem(rs.getInt("p_id"));

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		String sorgu5 = "SELECT * FROM teknoloji order by teknolojiid";

		ResultSet rs5 = baglanti.yap(sorgu5);

		try {
			while (rs5.next()) {
				cb1.addItem(rs5.getInt("teknolojiid"));

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		///////////////////////

		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				a.setVisible(true);
				setVisible(false);
			}

		});

		//////////////////////////////////////

		modelim.setColumnCount(0);
		modelim.setRowCount(0);
		modelim.setColumnIdentifiers(kolonlar);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String sorgu = "select * from tec_urun order by tec_urunid";

				modelim.setRowCount(0);

				ResultSet rs = baglanti.yap(sorgu);

				try {
					while (rs.next()) {
						satirlar[0] = rs.getInt("tec_urunid");
						satirlar[1] = rs.getInt("teknolojiid");
						satirlar[2] = rs.getInt("p_id");
						satirlar[3] = rs.getString("marka");
						satirlar[4] = rs.getString("model");
						satirlar[5] = rs.getInt("fiyat");
						satirlar[6] = rs.getInt("adet");

						modelim.addRow(satirlar);

					}
				} catch (SQLException e) {

					e.printStackTrace();
				}

				table.setModel(modelim);

			}
		});

		/// Ekle

		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String marka, model, tec_urunid, fiyat, adet;

				int p_id, teknolojiid;

				tec_urunid = txt2.getText();
				teknolojiid = (int) cb1.getSelectedItem();
				p_id = (int) comboBox_1.getSelectedItem();
				marka = txt4.getText();
				model = txt5.getText();
				fiyat = txt6.getText();
				adet = txt7.getText();

				String sorgu = " INSERT INTO tec_urun (tec_urunid,teknolojiid,p_id,marka,model,fiyat,adet) VALUES ("
						+ tec_urunid + "," + teknolojiid + "," + p_id + ",'" + marka + "'" + ",'" + model + "'" + ", "
						+ fiyat + "," + adet + ")";

				System.out.println(sorgu);

				baglanti.ekle(sorgu);

			}
		});

		// Click

		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txt2.setText((String) modelim.getValueAt(table.getSelectedRow(), 0).toString());
				cb1.setSelectedItem(modelim.getValueAt(table.getSelectedRow(), 1));
				comboBox_1.setSelectedItem(modelim.getValueAt(table.getSelectedRow(), 2));
				txt4.setText((String) modelim.getValueAt(table.getSelectedRow(), 3));
				txt5.setText((String) modelim.getValueAt(table.getSelectedRow(), 4));
				txt6.setText((String) modelim.getValueAt(table.getSelectedRow(), 5).toString());
				txt7.setText((String) modelim.getValueAt(table.getSelectedRow(), 6).toString());

			}
		});

		// Güncelle

		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String marka, model, tec_urunid, fiyat, adet;
				int p_id, teknolojiid;

				tec_urunid = txt2.getText();
				teknolojiid = (int) cb1.getSelectedItem();
				p_id = (int) comboBox_1.getSelectedItem();
				marka = txt4.getText();
				model = txt5.getText();
				fiyat = txt6.getText();
				adet = txt7.getText();

				String sorgu = "UPDATE tec_urun Set tec_urunid=" + tec_urunid + "," + "teknolojiid=" + teknolojiid + ","
						+ "p_id=" + p_id + "," + "marka=" + "'" + marka + "'" + "," + "model=" + "'" + model + "'" + ","
						+ "fiyat=" + fiyat + "," + "adet=" + adet + " WHERE tec_urunid=" + tec_urunid;

				System.out.println(sorgu);

				baglanti.guncelle(sorgu);
			}
		});

		// Sil

		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String tec_urunid, sorgu;

				tec_urunid = txt2.getText();

				sorgu = "DELETE FROM tec_urun WHERE tec_urunid=" + tec_urunid;

				baglanti.sil(sorgu);

			}
		});

		// Arama

		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				modelim.setRowCount(0);

				String a = txt1.getText();

				String sorgu = null;

				ResultSet rs = null;

				int s = comboBox.getSelectedIndex();

				if (s == 0) {
					sorgu = "SELECT * from tec_urun  WHERE tec_urunid=" + Integer.parseInt(a);
				} else if (s == 1) {
					sorgu = "SELECT * from tec_urun  WHERE teknolojiid=" + Integer.parseInt(a);
				} else if (s == 2) {
					sorgu = "SELECT * from tec_urun  WHERE p_id=" + Integer.parseInt(a);
				} else if (s == 3) {
					sorgu = "SELECT * from tec_urun  WHERE marka like'" + a + "%'";
				} else if (s == 4) {
					sorgu = "SELECT * from tec_urun  WHERE model like'" + a + "%'";
				} else if (s == 5) {
					sorgu = "SELECT * from tec_urun  WHERE fiyat=" + Integer.parseInt(a);
				} else if (s == 6) {
					sorgu = "SELECT * from tec_urun  WHERE adet=" + Integer.parseInt(a);
				}

				// String sorgu = "SELECT * from tec_urun WHERE marka like'" + a + "%'";

				System.out.println(sorgu);

				rs = baglanti.ara(sorgu);

				try {
					while (rs.next()) {
						satirlar[0] = rs.getInt("tec_urunid");
						satirlar[1] = rs.getInt("teknolojiid");
						satirlar[2] = rs.getInt("p_id");
						satirlar[3] = rs.getString("marka");
						satirlar[4] = rs.getString("model");
						satirlar[5] = rs.getInt("fiyat");
						satirlar[6] = rs.getInt("adet");

						modelim.addRow(satirlar);

					}
				} catch (SQLException e) {

					e.printStackTrace();
				}
				table.setModel(modelim);

			}
		});

		////////////////////////////////////////////////////////////////////////

		JPanel panel_1 = new JPanel();

		panel_1.setBackground(Color.GRAY);
		tabbedPane.addTab("Gaming", null, panel_1, null);
		panel_1.setLayout(null);

		JButton button = new JButton("Listele");
		button.setBackground(Color.WHITE);
		button.setBounds(10, 11, 115, 40);
		panel_1.add(button);

		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox_2.setBackground(Color.WHITE);
		comboBox_2.setBounds(241, 11, 115, 40);
		panel_1.add(comboBox_2);

		JLabel label = new JLabel("Arama");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(188, 19, 70, 20);
		panel_1.add(label);

		txt11 = new JTextField();
		txt11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt11.setColumns(10);
		txt11.setBounds(366, 16, 115, 30);
		panel_1.add(txt11);

		JButton btnAra = new JButton("Ara");

		btnAra.setBackground(Color.WHITE);
		btnAra.setBounds(491, 11, 115, 40);
		panel_1.add(btnAra);

		JButton btnGncelle = new JButton("G\u00FCncelle");

		btnGncelle.setBackground(Color.WHITE);
		btnGncelle.setBounds(686, 133, 115, 40);
		panel_1.add(btnGncelle);

		JButton btnEkle = new JButton("Ekle");

		btnEkle.setBackground(Color.WHITE);
		btnEkle.setBounds(686, 11, 115, 40);
		panel_1.add(btnEkle);

		JButton btnSil = new JButton("Sil");

		btnSil.setBackground(Color.WHITE);
		btnSil.setBounds(686, 72, 115, 40);
		panel_1.add(btnSil);

		JLabel lblGurunid = new JLabel("g_urunid");
		lblGurunid.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGurunid.setBounds(616, 210, 102, 18);
		panel_1.add(lblGurunid);

		JLabel lblG = new JLabel("gamingid");
		lblG.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblG.setBounds(754, 210, 84, 18);
		panel_1.add(lblG);

		JButton button_5 = new JButton("Ana Sayfa");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				a.setVisible(true);
				setVisible(false);

			}
		});
		button_5.setBackground(Color.WHITE);
		button_5.setBounds(754, 482, 115, 40);
		panel_1.add(button_5);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 67, 598, 455);
		panel_1.add(scrollPane_1);

		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);

		comboBox_2.setModel(new DefaultComboBoxModel(
				new String[] { "g_urunid", "gamingid", "p_id", "marka", "model", "fiyat", "adet" }));

		txt16 = new JTextField();
		txt16.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt16.setColumns(10);
		txt16.setBounds(754, 373, 115, 30);
		panel_1.add(txt16);

		txt14 = new JTextField();
		txt14.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt14.setColumns(10);
		txt14.setBounds(754, 305, 115, 30);
		panel_1.add(txt14);

		txt12 = new JTextField();
		txt12.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt12.setColumns(10);
		txt12.setBounds(616, 235, 115, 30);
		panel_1.add(txt12);

		txt15 = new JTextField();
		txt15.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt15.setColumns(10);
		txt15.setBounds(616, 373, 115, 30);
		panel_1.add(txt15);

		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox_3.setBackground(Color.WHITE);
		comboBox_3.setBounds(616, 303, 115, 30);
		panel_1.add(comboBox_3);

		JLabel label_1 = new JLabel("p_id");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(616, 278, 46, 18);
		panel_1.add(label_1);

		JLabel label_2 = new JLabel("marka");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBounds(754, 276, 46, 18);
		panel_1.add(label_2);

		JLabel label_3 = new JLabel("model");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_3.setBounds(616, 349, 46, 18);
		panel_1.add(label_3);

		JLabel label_4 = new JLabel("adet");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_4.setBounds(616, 415, 46, 18);
		panel_1.add(label_4);

		txt17 = new JTextField();
		txt17.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt17.setColumns(10);
		txt17.setBounds(616, 443, 115, 30);
		panel_1.add(txt17);

		JComboBox cb2 = new JComboBox();
		cb2.setBackground(Color.WHITE);
		cb2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cb2.setBounds(754, 235, 115, 30);
		panel_1.add(cb2);

		JLabel lblNewLabel_8 = new JLabel("fiyat");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(754, 348, 46, 20);
		panel_1.add(lblNewLabel_8);

		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setIcon(new ImageIcon(this.getClass().getResource("/2.png")));
		lblNewLabel_9.setBounds(0, 0, 875, 532);
		panel_1.add(lblNewLabel_9);

		String sorgu2 = "SELECT * FROM personel order by p_id";

		ResultSet rs2 = baglanti.yap(sorgu2);

		try {
			while (rs2.next()) {
				comboBox_3.addItem(rs2.getInt("p_id"));

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		String sorgu6 = "SELECT * FROM gaming ";

		ResultSet rs6 = baglanti.yap(sorgu6);

		try {
			while (rs6.next()) {
				cb2.addItem(rs6.getInt("gamingid"));

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		modelim2.setColumnCount(0);
		modelim2.setRowCount(0);
		modelim2.setColumnIdentifiers(kolonlar2);

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String sorgu = "select * from g_urun order by g_urunid";

				modelim2.setRowCount(0);

				ResultSet rs = baglanti.yap(sorgu);

				try {
					while (rs.next()) {
						satirlar2[0] = rs.getInt("g_urunid");
						satirlar2[1] = rs.getInt("gamingid");
						satirlar2[2] = rs.getInt("p_id");
						satirlar2[3] = rs.getString("marka");
						satirlar2[4] = rs.getString("model");
						satirlar2[5] = rs.getInt("fiyat");
						satirlar2[6] = rs.getInt("adet");

						modelim2.addRow(satirlar2);

					}
				} catch (SQLException e) {

					e.printStackTrace();
				}

				table_1.setModel(modelim2);

			}
		});

		// Click

		table_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				txt12.setText((String) modelim2.getValueAt(table_1.getSelectedRow(), 0).toString());
				cb2.setSelectedItem(modelim2.getValueAt(table_1.getSelectedRow(), 1));
				comboBox_3.setSelectedItem(modelim2.getValueAt(table_1.getSelectedRow(), 2));
				txt14.setText((String) modelim2.getValueAt(table_1.getSelectedRow(), 3));
				txt15.setText((String) modelim2.getValueAt(table_1.getSelectedRow(), 4));
				txt16.setText((String) modelim2.getValueAt(table_1.getSelectedRow(), 5).toString());
				txt17.setText((String) modelim2.getValueAt(table_1.getSelectedRow(), 6).toString());

			}
		});

		// Ekle

		btnEkle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String marka, model, g_urunid, fiyat, adet;
				int p_id, gamingid;

				g_urunid = txt12.getText();
				gamingid = (int) cb2.getSelectedItem();
				p_id = (int) comboBox_3.getSelectedItem();
				marka = txt14.getText();
				model = txt15.getText();
				fiyat = txt16.getText();
				adet = txt17.getText();

				String sorgu = " INSERT INTO g_urun (g_urunid,gamingid,p_id,marka,model,fiyat,adet) VALUES (" + g_urunid
						+ "," + gamingid + "," + p_id + ",'" + marka + "'" + ",'" + model + "'" + ", " + fiyat + ","
						+ adet + ")";

				System.out.println(sorgu);

				baglanti.ekle(sorgu);

			}
		});

		// Sil

		btnSil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String g_urunid, sorgu;

				g_urunid = txt12.getText();

				sorgu = "DELETE FROM g_urun WHERE g_urunid=" + g_urunid;

				System.out.println(sorgu);

				baglanti.sil(sorgu);

			}
		});

		// Güncelle

		btnGncelle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String marka, model, g_urunid, fiyat, adet;
				int p_id, gamingid;

				g_urunid = txt12.getText();
				gamingid = (int) cb2.getSelectedItem();
				p_id = (int) comboBox_3.getSelectedItem();
				marka = txt14.getText();
				model = txt15.getText();
				fiyat = txt16.getText();
				adet = txt17.getText();

				String sorgu = "UPDATE g_urun Set g_urunid=" + g_urunid + "," + "gamingid=" + gamingid + "," + "p_id="
						+ p_id + "," + "marka=" + "'" + marka + "'" + "," + "model=" + "'" + model + "'" + ","
						+ "fiyat=" + fiyat + "," + "adet=" + adet + " WHERE g_urunid=" + g_urunid;

				System.out.println(sorgu);

				baglanti.guncelle(sorgu);

			}
		});

		// Ara

		btnAra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				modelim2.setRowCount(0);

				String a = txt11.getText();

				String sorgu = null;

				ResultSet rs = null;

				int s = comboBox_2.getSelectedIndex();

				if (s == 0) {
					sorgu = "SELECT * from g_urun  WHERE g_urunid=" + Integer.parseInt(a);
				} else if (s == 1) {
					sorgu = "SELECT * from g_urun  WHERE gamingid=" + Integer.parseInt(a);
				} else if (s == 2) {
					sorgu = "SELECT * from g_urun  WHERE p_id=" + Integer.parseInt(a);
				} else if (s == 3) {
					sorgu = "SELECT * from g_urun  WHERE marka like'" + a + "%'";
				} else if (s == 4) {
					sorgu = "SELECT * from g_urun WHERE model like'" + a + "%'";
				} else if (s == 5) {
					sorgu = "SELECT * from g_urun WHERE fiyat=" + Integer.parseInt(a);
				} else if (s == 6) {
					sorgu = "SELECT * from g_urun  WHERE adet=" + Integer.parseInt(a);
				}

				System.out.println(sorgu);

				rs = baglanti.ara(sorgu);

				try {
					while (rs.next()) {
						satirlar2[0] = rs.getInt("g_urunid");
						satirlar2[1] = rs.getInt("gamingid");
						satirlar2[2] = rs.getInt("p_id");
						satirlar2[3] = rs.getString("marka");
						satirlar2[4] = rs.getString("model");
						satirlar2[5] = rs.getInt("fiyat");
						satirlar2[6] = rs.getInt("adet");

						modelim2.addRow(satirlar2);

					}
				} catch (SQLException e) {

					e.printStackTrace();
				}
				table_1.setModel(modelim2);

			}
		});

		//////////////////////////////////////////////////////

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(153, 204, 204));
		tabbedPane.addTab("Beyaz Eþya", null, panel_2, null);
		panel_2.setLayout(null);

		JButton button_6 = new JButton("Listele");
		button_6.setBackground(Color.WHITE);
		button_6.setBounds(10, 11, 115, 40);
		panel_2.add(button_6);

		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox_4.setBackground(Color.WHITE);
		comboBox_4.setBounds(241, 11, 115, 40);
		panel_2.add(comboBox_4);

		JLabel label_7 = new JLabel("Arama");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_7.setBounds(188, 19, 70, 20);
		panel_2.add(label_7);

		txt21 = new JTextField();
		txt21.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt21.setColumns(10);
		txt21.setBounds(366, 16, 115, 30);
		panel_2.add(txt21);

		JButton btnAra_1 = new JButton("Ara");
		btnAra_1.setBackground(Color.WHITE);
		btnAra_1.setBounds(491, 11, 115, 40);
		panel_2.add(btnAra_1);

		JButton btnGncelle_1 = new JButton("G\u00FCncelle");
		btnGncelle_1.setBackground(Color.WHITE);
		btnGncelle_1.setBounds(686, 133, 115, 40);
		panel_2.add(btnGncelle_1);

		JButton btnEkle_1 = new JButton("Ekle");

		btnEkle_1.setBackground(Color.WHITE);
		btnEkle_1.setBounds(686, 11, 115, 40);
		panel_2.add(btnEkle_1);

		JButton btnSil_1 = new JButton("Sil");
		btnSil_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSil_1.setBackground(Color.WHITE);
		btnSil_1.setBounds(686, 72, 115, 40);
		panel_2.add(btnSil_1);

		JLabel lblBeurunid = new JLabel("be_urunid");
		lblBeurunid.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBeurunid.setBounds(616, 210, 115, 18);
		panel_2.add(lblBeurunid);

		JLabel lblBeyazesyaid = new JLabel("beyazesyaid");
		lblBeyazesyaid.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBeyazesyaid.setBounds(754, 210, 106, 18);
		panel_2.add(lblBeyazesyaid);

		JButton button_11 = new JButton("Ana Sayfa");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				a.setVisible(true);
				setVisible(false);

			}
		});
		button_11.setBackground(Color.WHITE);
		button_11.setBounds(754, 482, 115, 40);
		panel_2.add(button_11);

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 67, 598, 455);
		panel_2.add(scrollPane_2);

		table_2 = new JTable();
		scrollPane_2.setViewportView(table_2);

		comboBox_4.setModel(new DefaultComboBoxModel(
				new String[] { "be_urunid", "beyazesyaid", "p_id", "marka", "model", "fiyat", "adet" }));

		txt26 = new JTextField();
		txt26.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt26.setColumns(10);
		txt26.setBounds(754, 373, 115, 30);
		panel_2.add(txt26);

		txt24 = new JTextField();
		txt24.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt24.setColumns(10);
		txt24.setBounds(754, 305, 115, 30);
		panel_2.add(txt24);

		txt22 = new JTextField();
		txt22.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt22.setColumns(10);
		txt22.setBounds(616, 235, 115, 30);
		panel_2.add(txt22);

		txt25 = new JTextField();
		txt25.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt25.setColumns(10);
		txt25.setBounds(616, 373, 115, 30);
		panel_2.add(txt25);

		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox_5.setBackground(Color.WHITE);
		comboBox_5.setBounds(616, 303, 115, 30);
		panel_2.add(comboBox_5);

		JLabel label_5 = new JLabel("p_id");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_5.setBounds(616, 278, 46, 18);
		panel_2.add(label_5);

		JLabel label_6 = new JLabel("marka");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_6.setBounds(754, 276, 46, 18);
		panel_2.add(label_6);

		JLabel label_10 = new JLabel("model");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_10.setBounds(616, 349, 46, 18);
		panel_2.add(label_10);

		JLabel label_11 = new JLabel("adet");
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_11.setBounds(616, 418, 46, 18);
		panel_2.add(label_11);

		txt27 = new JTextField();
		txt27.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt27.setColumns(10);
		txt27.setBounds(616, 443, 115, 30);
		panel_2.add(txt27);

		JComboBox cb3 = new JComboBox();
		cb3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cb3.setBackground(Color.WHITE);
		cb3.setBounds(754, 235, 115, 30);
		panel_2.add(cb3);

		JLabel lblNewLabel_11 = new JLabel("fiyat");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_11.setBounds(754, 349, 46, 18);
		panel_2.add(lblNewLabel_11);

		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon(this.getClass().getResource("/2.png")));
		lblNewLabel_10.setBounds(0, 0, 875, 532);
		panel_2.add(lblNewLabel_10);

		String sorgu3 = "SELECT * FROM personel order by p_id";

		ResultSet rs3 = baglanti.yap(sorgu3);

		try {
			while (rs3.next()) {
				comboBox_5.addItem(rs3.getInt("p_id"));

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		String sorgu7 = "SELECT * FROM beyaz_esya";

		ResultSet rs7 = baglanti.yap(sorgu7);

		try {
			while (rs7.next()) {
				cb3.addItem(rs7.getInt("beyazesyaid"));

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		modelim3.setColumnCount(0);
		modelim3.setRowCount(0);
		modelim3.setColumnIdentifiers(kolonlar3);

		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String sorgu = "SELECT * FROM be_urun order by be_urunid";

				modelim3.setRowCount(0);

				ResultSet rs = baglanti.yap(sorgu);

				try {
					while (rs.next()) {
						satirlar3[0] = rs.getInt("be_urunid");
						satirlar3[1] = rs.getInt("beyazesyaid");
						satirlar3[2] = rs.getInt("p_id");
						satirlar3[3] = rs.getString("marka");
						satirlar3[4] = rs.getString("model");
						satirlar3[5] = rs.getInt("fiyat");
						satirlar3[6] = rs.getInt("adet");

						modelim3.addRow(satirlar3);

					}
				} catch (SQLException e) {

					e.printStackTrace();
				}

				table_2.setModel(modelim3);

			}
		});

		// Ekle

		btnEkle_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String marka, model, be_urunid, fiyat, adet;
				int p_id, beyazesyaid;

				be_urunid = txt22.getText();
				beyazesyaid = (int) cb3.getSelectedItem();
				p_id = (int) comboBox_5.getSelectedItem();
				marka = txt24.getText();
				model = txt25.getText();
				fiyat = txt26.getText();
				adet = txt27.getText();

				String sorgu = " INSERT INTO be_urun (be_urunid,beyazesyaid,p_id,marka,model,fiyat,adet) VALUES ("
						+ be_urunid + "," + beyazesyaid + "," + p_id + ",'" + marka + "'" + ",'" + model + "'" + ", "
						+ fiyat + "," + adet + ")";

				System.out.println(sorgu);

				baglanti.ekle(sorgu);

			}
		});

		// Click

		table_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				txt22.setText((String) modelim3.getValueAt(table_2.getSelectedRow(), 0).toString());
				cb3.setSelectedItem(modelim3.getValueAt(table_2.getSelectedRow(), 1));
				comboBox_5.setSelectedItem(modelim3.getValueAt(table_2.getSelectedRow(), 2));
				txt24.setText((String) modelim3.getValueAt(table_2.getSelectedRow(), 3));
				txt25.setText((String) modelim3.getValueAt(table_2.getSelectedRow(), 4));
				txt26.setText((String) modelim3.getValueAt(table_2.getSelectedRow(), 5).toString());
				txt27.setText((String) modelim3.getValueAt(table_2.getSelectedRow(), 6).toString());

			}
		});

		// Sil

		btnSil_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String be_urunid, sorgu;

				be_urunid = txt22.getText();

				sorgu = "DELETE FROM be_urun WHERE be_urunid=" + be_urunid;

				System.out.println(sorgu);

				baglanti.sil(sorgu);

			}
		});

		// Güncelle

		btnGncelle_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String marka, model, be_urunid, fiyat, adet;
				int p_id, beyazesyaid;

				be_urunid = txt22.getText();
				beyazesyaid = (int) cb3.getSelectedItem();
				p_id = (int) comboBox_5.getSelectedItem();
				p_id = (int) comboBox_5.getSelectedItem();
				marka = txt24.getText();
				model = txt25.getText();
				fiyat = txt26.getText();
				adet = txt27.getText();

				String sorgu = "UPDATE be_urun Set be_urunid=" + be_urunid + "," + "beyazesyaid=" + beyazesyaid + ","
						+ "p_id=" + p_id + "," + "marka=" + "'" + marka + "'" + "," + "model=" + "'" + model + "'" + ","
						+ "fiyat=" + fiyat + "," + "adet=" + adet + " WHERE be_urunid=" + be_urunid;

				System.out.println(sorgu);

				baglanti.guncelle(sorgu);

			}
		});

		// Ara

		btnAra_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				modelim3.setRowCount(0);

				String a = txt21.getText();

				String sorgu = null;

				ResultSet rs = null;

				int s = comboBox_4.getSelectedIndex();

				if (s == 0) {
					sorgu = "SELECT * from be_urun  WHERE be_urunid=" + Integer.parseInt(a);
				} else if (s == 1) {
					sorgu = "SELECT * from be_urun  WHERE beyazesyaid=" + Integer.parseInt(a);
				} else if (s == 2) {
					sorgu = "SELECT * from be_urun  WHERE p_id=" + Integer.parseInt(a);
				} else if (s == 3) {
					sorgu = "SELECT * from be_urun  WHERE marka like'" + a + "%'";
				} else if (s == 4) {
					sorgu = "SELECT * from be_urun WHERE model like'" + a + "%'";
				} else if (s == 5) {
					sorgu = "SELECT * from be_urun WHERE fiyat=" + Integer.parseInt(a);
				} else if (s == 6) {
					sorgu = "SELECT * from be_urun  WHERE adet=" + Integer.parseInt(a);
				}

				System.out.println(sorgu);

				rs = baglanti.ara(sorgu);

				try {
					while (rs.next()) {
						satirlar3[0] = rs.getInt("be_urunid");
						satirlar3[1] = rs.getInt("beyazesyaid");
						satirlar3[2] = rs.getInt("p_id");
						satirlar3[3] = rs.getString("marka");
						satirlar3[4] = rs.getString("model");
						satirlar3[5] = rs.getInt("fiyat");
						satirlar3[6] = rs.getInt("adet");

						modelim3.addRow(satirlar3);

					}
				} catch (SQLException e) {

					e.printStackTrace();
				}
				table_2.setModel(modelim3);

			}
		});

		/////////////////////////////////////////////////////

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(153, 204, 204));
		tabbedPane.addTab("Aksesuar", null, panel_3, null);
		panel_3.setLayout(null);

		JButton button_12 = new JButton("Listele");

		button_12.setBackground(Color.WHITE);
		button_12.setBounds(10, 11, 115, 40);
		panel_3.add(button_12);

		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox_6.setBackground(Color.WHITE);
		comboBox_6.setBounds(241, 11, 115, 40);
		panel_3.add(comboBox_6);

		JLabel label_14 = new JLabel("Arama");
		label_14.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_14.setBounds(188, 19, 70, 20);
		panel_3.add(label_14);

		txt31 = new JTextField();
		txt31.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt31.setColumns(10);
		txt31.setBounds(366, 16, 115, 30);
		panel_3.add(txt31);

		JButton btnAra_2 = new JButton("Ara");
		btnAra_2.setBackground(Color.WHITE);
		btnAra_2.setBounds(491, 11, 115, 40);
		panel_3.add(btnAra_2);

		JButton btnGncelle_2 = new JButton("G\u00FCncelle");
		btnGncelle_2.setBackground(Color.WHITE);
		btnGncelle_2.setBounds(686, 133, 115, 40);
		panel_3.add(btnGncelle_2);

		JButton btnEkle_2 = new JButton("Ekle");

		btnEkle_2.setBackground(Color.WHITE);
		btnEkle_2.setBounds(686, 11, 115, 40);
		panel_3.add(btnEkle_2);

		JButton btnSil_2 = new JButton("Sil");
		btnSil_2.setBackground(Color.WHITE);
		btnSil_2.setBounds(686, 72, 115, 40);
		panel_3.add(btnSil_2);

		JLabel lblAurunid = new JLabel("a_urunid");
		lblAurunid.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAurunid.setBounds(616, 210, 115, 18);
		panel_3.add(lblAurunid);

		JLabel lblAksesuarid = new JLabel("aksesuarid");
		lblAksesuarid.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAksesuarid.setBounds(754, 210, 106, 18);
		panel_3.add(lblAksesuarid);

		JButton button_17 = new JButton("Ana Sayfa");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				a.setVisible(true);
				setVisible(false);

			}
		});
		button_17.setBackground(Color.WHITE);
		button_17.setBounds(754, 482, 115, 40);
		panel_3.add(button_17);

		comboBox_6.setModel(new DefaultComboBoxModel(
				new String[] { "a_urunid", "aksesuarid", "p_id", "marka", "model", "fiyat", "adet" }));

		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(10, 67, 598, 455);
		panel_3.add(scrollPane_3);

		table_3 = new JTable();
		scrollPane_3.setViewportView(table_3);

		txt36 = new JTextField();
		txt36.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt36.setColumns(10);
		txt36.setBounds(754, 373, 115, 30);
		panel_3.add(txt36);

		txt34 = new JTextField();
		txt34.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt34.setColumns(10);
		txt34.setBounds(754, 305, 115, 30);
		panel_3.add(txt34);

		txt32 = new JTextField();
		txt32.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt32.setColumns(10);
		txt32.setBounds(616, 235, 115, 30);
		panel_3.add(txt32);

		txt35 = new JTextField();
		txt35.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt35.setColumns(10);
		txt35.setBounds(616, 373, 115, 30);
		panel_3.add(txt35);

		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox_7.setBackground(Color.WHITE);
		comboBox_7.setBounds(616, 303, 115, 30);
		panel_3.add(comboBox_7);

		JLabel label_12 = new JLabel("p_id");
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_12.setBounds(616, 278, 46, 18);
		panel_3.add(label_12);

		JLabel label_13 = new JLabel("marka");
		label_13.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_13.setBounds(754, 276, 46, 18);
		panel_3.add(label_13);

		JLabel label_17 = new JLabel("model");
		label_17.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_17.setBounds(616, 349, 46, 18);
		panel_3.add(label_17);

		JLabel label_18 = new JLabel("adet");
		label_18.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_18.setBounds(616, 418, 46, 18);
		panel_3.add(label_18);

		txt37 = new JTextField();
		txt37.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt37.setColumns(10);
		txt37.setBounds(616, 443, 115, 30);
		panel_3.add(txt37);

		JLabel lblNewLabel_12 = new JLabel("fiyat");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_12.setBounds(754, 349, 46, 18);
		panel_3.add(lblNewLabel_12);

		JComboBox cb4 = new JComboBox();
		cb4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cb4.setBackground(Color.WHITE);
		cb4.setBounds(754, 235, 115, 30);
		panel_3.add(cb4);

		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setBackground(Color.WHITE);
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_13.setIcon(new ImageIcon(this.getClass().getResource("/2.png")));
		lblNewLabel_13.setBounds(0, 0, 875, 532);
		panel_3.add(lblNewLabel_13);

		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(this.getClass().getResource("/ap.png")));
		lblNewLabel_6.setBounds(0, 0, 1032, 662);
		contentPane.add(lblNewLabel_6);

		String sorgu4 = "SELECT * FROM personel order by p_id";

		ResultSet rs4 = baglanti.yap(sorgu4);

		try {
			while (rs4.next()) {
				comboBox_7.addItem(rs4.getInt("p_id"));

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		String sorgu8 = "SELECT * FROM aksesuar order by aksesuarid";

		ResultSet rs8 = baglanti.yap(sorgu8);

		try {
			while (rs8.next()) {
				cb4.addItem(rs8.getInt("aksesuarid"));

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		modelim4.setColumnCount(0);
		modelim4.setRowCount(0);
		modelim4.setColumnIdentifiers(kolonlar4);

		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String sorgu = "SELECT * FROM a_urun order by a_urunid";

				modelim4.setRowCount(0);

				ResultSet rs = baglanti.yap(sorgu);

				try {
					while (rs.next()) {
						satirlar4[0] = rs.getInt("a_urunid");
						satirlar4[1] = rs.getInt("aksesuarid");
						satirlar4[2] = rs.getInt("p_id");
						satirlar4[3] = rs.getString("marka");
						satirlar4[4] = rs.getString("model");
						satirlar4[5] = rs.getInt("fiyat");
						satirlar4[6] = rs.getInt("adet");

						modelim4.addRow(satirlar4);

					}
				} catch (SQLException e) {

					e.printStackTrace();
				}

				table_3.setModel(modelim4);

			}
		});

		// Ekle

		btnEkle_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String marka, model, a_urunid, fiyat, adet;
				int p_id, aksesuarid;

				a_urunid = txt32.getText();
				aksesuarid = (int) cb4.getSelectedItem();
				p_id = (int) comboBox_7.getSelectedItem();
				marka = txt34.getText();
				model = txt35.getText();
				fiyat = txt36.getText();
				adet = txt37.getText();

				String sorgu = " INSERT INTO a_urun (a_urunid,aksesuarid,p_id,marka,model,fiyat,adet) VALUES ("
						+ a_urunid + "," + aksesuarid + "," + p_id + ",'" + marka + "'" + ",'" + model + "'" + ", "
						+ fiyat + "," + adet + ")";

				System.out.println(sorgu);

				baglanti.ekle(sorgu);

			}
		});

		// Click

		table_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				txt32.setText((String) modelim4.getValueAt(table_3.getSelectedRow(), 0).toString());
				cb4.setSelectedItem(modelim4.getValueAt(table_3.getSelectedRow(), 1));
				comboBox_7.setSelectedItem(modelim4.getValueAt(table_3.getSelectedRow(), 2));
				txt34.setText((String) modelim4.getValueAt(table_3.getSelectedRow(), 3));
				txt35.setText((String) modelim4.getValueAt(table_3.getSelectedRow(), 4));
				txt36.setText((String) modelim4.getValueAt(table_3.getSelectedRow(), 5).toString());
				txt37.setText((String) modelim4.getValueAt(table_3.getSelectedRow(), 6).toString());

			}
		});

		// Sil

		btnSil_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String a_urunid, sorgu;

				a_urunid = txt32.getText();

				sorgu = "DELETE FROM a_urun WHERE a_urunid=" + a_urunid;

				System.out.println(sorgu);

				baglanti.sil(sorgu);

			}
		});

		// Güncelle

		btnGncelle_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String marka, model, a_urunid, fiyat, adet;
				int p_id, aksesuarid;

				a_urunid = txt32.getText();
				aksesuarid = (int) cb4.getSelectedItem();
				p_id = (int) comboBox_7.getSelectedItem();
				marka = txt34.getText();
				model = txt35.getText();
				fiyat = txt36.getText();
				adet = txt37.getText();

				String sorgu = "UPDATE a_urun Set a_urunid=" + a_urunid + "," + "aksesuarid=" + aksesuarid + ","
						+ "p_id=" + p_id + "," + "marka=" + "'" + marka + "'" + "," + "model=" + "'" + model + "'" + ","
						+ "fiyat=" + fiyat + "," + "adet=" + adet + " WHERE a_urunid=" + a_urunid;

				System.out.println(sorgu);

				baglanti.guncelle(sorgu);

			}
		});

		// Ara

		btnAra_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				modelim4.setRowCount(0);

				String a = txt31.getText();

				String sorgu = null;

				ResultSet rs = null;

				int s = comboBox_6.getSelectedIndex();

				if (s == 0) {
					sorgu = "SELECT * from a_urun  WHERE aksesuarid=" + Integer.parseInt(a);
				} else if (s == 1) {
					sorgu = "SELECT * from a_urun  WHERE aksesuarid=" + Integer.parseInt(a);
				} else if (s == 2) {
					sorgu = "SELECT * from a_urun  WHERE p_id=" + Integer.parseInt(a);
				} else if (s == 3) {
					sorgu = "SELECT * from a_urun  WHERE marka like'" + a + "%'";
				} else if (s == 4) {
					sorgu = "SELECT * from a_urun WHERE model like'" + a + "%'";
				} else if (s == 5) {
					sorgu = "SELECT * from a_urun WHERE fiyat=" + Integer.parseInt(a);
				} else if (s == 6) {
					sorgu = "SELECT * from a_urun  WHERE adet=" + Integer.parseInt(a);
				}

				System.out.println(sorgu);

				rs = baglanti.ara(sorgu);

				try {
					while (rs.next()) {
						satirlar4[0] = rs.getInt("a_urunid");
						satirlar4[1] = rs.getInt("aksesuarid");
						satirlar4[2] = rs.getInt("p_id");
						satirlar4[3] = rs.getString("marka");
						satirlar4[4] = rs.getString("model");
						satirlar4[5] = rs.getInt("fiyat");
						satirlar4[6] = rs.getInt("adet");

						modelim4.addRow(satirlar4);

					}
				} catch (SQLException e) {

					e.printStackTrace();
				}
				table_3.setModel(modelim4);

			}
		});

	}
}
