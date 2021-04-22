import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Window.Type;

import javax.swing.JFormattedTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class giris extends JFrame {

	private JPanel contentPane;

	private JTextField textField;

	static String ad;
	static String sifre;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					giris frame = new giris();
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
	public giris() {
		setIconImage(Toolkit.getDefaultToolkit().getImage((this.getClass().getResource("/a.png"))));

		setBackground(Color.BLACK);
		setOpacity(1.0f);
		setType(Type.POPUP);
		setTitle("Giriþ Ekraný");
		setFont(new Font("Dialog", Font.PLAIN, 12));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(650, 250, 567, 460);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setForeground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Image img = new ImageIcon(this.getClass().getResource("/pic0.png")).getImage();

		JButton btnNewButton = new JButton("Giri\u015F");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				ad = textField.getText();
				sifre = passwordField.getText();

				String sorgu = "select count(id) as giris from giris where ad='" + ad + "' and sifre='" + sifre + "'";

				ResultSet rs = admin_baglanti.sorgu();
				rs = admin_baglanti.sorgula(sorgu);

				try {
					while (rs.next()) {
						if (rs.getInt("giris") == 1) {
							admin a = new admin();
							a.setVisible(true);
							setVisible(false);
						} else {
							btnNewButton.setText("hatalý giriþ");
						}
					}
				} catch (SQLException e) {

					e.printStackTrace();
				}

			}

		});
		btnNewButton.setBounds(215, 309, 115, 40);
		contentPane.add(btnNewButton);

		JLabel lblNewLabel_1 = new JLabel("Kullan\u0131c\u0131 Ad\u0131:");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(161, 214, 73, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblifre = new JLabel("\u015Eifre:");
		lblifre.setForeground(Color.WHITE);
		lblifre.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblifre.setBounds(161, 254, 73, 14);
		contentPane.add(lblifre);

		textField = new JTextField();
		textField.setBounds(263, 207, 115, 30);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon((this.getClass().getResource("/pic1.png"))));
		lblNewLabel.setBounds(172, 23, 207, 173);
		contentPane.add(lblNewLabel);

		passwordField = new JPasswordField();
		passwordField.setBounds(263, 254, 115, 30);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(this.getClass().getResource("/aa.png")));
		lblNewLabel_2.setBounds(0, 0, 640, 420);
		contentPane.add(lblNewLabel_2);

	}
}
