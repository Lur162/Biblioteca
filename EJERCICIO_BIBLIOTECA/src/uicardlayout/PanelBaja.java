package uicardlayout;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class PanelBaja extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public PanelBaja() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Panel de Baja");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 36));
		lblNewLabel.setBounds(163, 36, 450, 62);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID Socio");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(36, 273, 221, 34);
		add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(267, 273, 312, 34);
		add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Dar de Baja");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(634, 422, 137, 34);
		add(btnNewButton);

	}

}
