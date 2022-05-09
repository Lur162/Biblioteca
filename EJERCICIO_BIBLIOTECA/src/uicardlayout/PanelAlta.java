package uicardlayout;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class PanelAlta extends JPanel {
	private JTextField txtNombreAlta;
	private JTextField txtDniAlta;
	private JTextField TxtDireccionAlta;

	/**
	 * Create the panel.
	 */
	public PanelAlta() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Panel de Alta");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 36));
		lblNewLabel.setBounds(231, 26, 364, 74);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Introducir nombre socio:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(41, 179, 216, 36);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("D.N.I");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(41, 245, 250, 44);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Direcci\u00F3n");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(41, 309, 216, 30);
		add(lblNewLabel_3);
		
		txtNombreAlta = new JTextField();
		txtNombreAlta.setBounds(305, 189, 290, 24);
		add(txtNombreAlta);
		txtNombreAlta.setColumns(10);
		
		txtDniAlta = new JTextField();
		txtDniAlta.setBounds(305, 256, 290, 24);
		add(txtDniAlta);
		txtDniAlta.setColumns(10);
		
		TxtDireccionAlta = new JTextField();
		TxtDireccionAlta.setBounds(305, 318, 290, 21);
		add(TxtDireccionAlta);
		TxtDireccionAlta.setColumns(10);
		
		JButton btnDarAlta = new JButton("Dar de Alta");
		btnDarAlta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDarAlta.setBounds(634, 422, 137, 34);
		add(btnDarAlta);

	}
}
