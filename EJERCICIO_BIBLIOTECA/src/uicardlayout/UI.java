package uicardlayout;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UI extends JFrame {

	private JPanel contentPane;
	private PanelAlta pnlAlta;
	private PanelBaja pnlBaja;

	public PanelAlta getPnlAlta() {
		return pnlAlta;
	}

	public void setPnlAlta(PanelAlta pnlAlta) {
		this.pnlAlta = pnlAlta;
	}

	public PanelBaja getPnlBaja() {
		return pnlBaja;
	}

	public void setPnlBaja(PanelBaja pnlBaja) {
		this.pnlBaja = pnlBaja;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI frame = new UI();
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
	public UI() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 859, 587);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Alta");
		String nombreAlta = "alta";
		
		
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 22));
		menuBar.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Baja");
	
		mntmNewMenuItem_1.setFont(new Font("Segoe UI", Font.PLAIN, 22));
		menuBar.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu = new JMenu("Archivo");
		mnNewMenu.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		menuBar.add(mnNewMenu);
		
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Salir sin guardar");
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Guardar");
		mnNewMenu.add(mntmNewMenuItem_2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0,0));
		
		//crear los paneles
		pnlAlta= new PanelAlta();
		pnlBaja= new PanelBaja();
		//insertar los paneles en el principal
		contentPane.add(pnlAlta,nombreAlta);
		String nombreBaja = "baja";
		contentPane.add(pnlBaja,nombreBaja);
		//activar la navegacion
		CardLayout layout=(CardLayout) contentPane.getLayout();
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
								
				layout.show(contentPane, nombreAlta);
			}
		});
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layout.show(contentPane, nombreBaja);
			}
		});
		
		
	}
}
