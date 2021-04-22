import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Window.Type;

public class admin extends JFrame {

	private JPanel contentPane;
	
	urun_panel up = new urun_panel();
	personel p = new personel();
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					admin frame = new admin();
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
	public admin() {
		
		setBackground(Color.BLACK);
		setOpacity(1.0f);
		setType(Type.POPUP);
		setTitle("Stok Otomasyon");
		setFont(new Font("Dialog", Font.PLAIN, 12));
		setIconImage(Toolkit.getDefaultToolkit().getImage((this.getClass().getResource("/a.png"))));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(650, 250, 567, 460);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setForeground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(168, 29, 200, 200);
		Image img = new ImageIcon(this.getClass().getResource("/pic0.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		contentPane.add(lblNewLabel);

		JButton btnNewButton = new JButton("");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setIcon(new ImageIcon(this.getClass().getResource("/a.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				p.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setBounds(178, 264, 60, 60);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setIcon(new ImageIcon(this.getClass().getResource("/p.png")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				up.setVisible(true);
				setVisible(false);
				
			}
		});
		btnNewButton_1.setBounds(307, 264, 60, 60);
		contentPane.add(btnNewButton_1);
		
		JLabel lblPersonelIlemleri = new JLabel("Personel \u0130\u015Flemleri");
		lblPersonelIlemleri.setForeground(Color.WHITE);
		lblPersonelIlemleri.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPersonelIlemleri.setBounds(150, 233, 120, 20);
		contentPane.add(lblPersonelIlemleri);
		
		JLabel lblNewLabel_1 = new JLabel("\u00DCr\u00FCn \u0130\u015Flemleri");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(294, 233, 120, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(this.getClass().getResource("/aa.png")));
		lblNewLabel_2.setBounds(0, 0, 640, 420);
		contentPane.add(lblNewLabel_2);
	}
}
