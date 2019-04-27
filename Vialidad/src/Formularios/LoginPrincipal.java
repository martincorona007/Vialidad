package Formularios;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;

public class LoginPrincipal extends JFrame {

	private JPanel windowLogin_Principal;
	private JLabel label_admin;
	private JLabel label_usuario;
	private JButton btnSalir;
	private JButton btnUsuario;
	private JButton btnAdministrador;
	private JPanel jContentPane=null;
	private JLabel LabelBackground;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPrincipal frame = new LoginPrincipal();
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
	public LoginPrincipal() {
		setTitle("Login Principal");
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(LoginPrincipal.class.getResource("/Pictures/car-icon2.png")));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 50, 809, 662);
		
		windowLogin_Principal = new JPanel();
	
		windowLogin_Principal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(windowLogin_Principal);
		windowLogin_Principal.setLayout(null);
		
	    label_admin = new JLabel("");
		label_admin.setIcon(new ImageIcon(LoginPrincipal.class.getResource("/Pictures/rsz_adminn.png")));
		label_admin.setBounds(64, 65, 332, 315);
		windowLogin_Principal.add(label_admin);
		
		label_usuario = new JLabel("");
		label_usuario.setIcon(new ImageIcon(LoginPrincipal.class.getResource("/Pictures/rsz_user.png")));
		label_usuario.setBounds(469, 87, 268, 256);
		windowLogin_Principal.add(label_usuario);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent atg0){
				salir();
			}
		});
		btnSalir.setBounds(342, 556, 122, 30);
		windowLogin_Principal.add(btnSalir);
		
		btnAdministrador = new JButton("Administrador");
		btnAdministrador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ingresarAdmin();
			}
		});
		
		btnAdministrador.setBounds(138, 368, 122, 30);
		windowLogin_Principal.add(btnAdministrador);
		
		btnUsuario = new JButton("Usuario");
		btnUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ingresarUsuar();
			}
		});
		btnUsuario.setBounds(560, 369,122, 29);
		windowLogin_Principal.add(btnUsuario);
		
		LabelBackground = new JLabel("New label");
		LabelBackground.setIcon(new ImageIcon(LoginPrincipal.class.getResource("/Pictures/rsz_found_services.jpg")));
		LabelBackground.setBounds(0, 0, 793, 624);
		windowLogin_Principal.add(LabelBackground);
		
		
		
		
	}

	protected void ingresarUsuar() {
		LoginUser loginuser=new LoginUser();
		loginuser.setVisible(true);
		this.dispose();
		
	}

	protected void ingresarAdmin() {
		LoginAdministrator loginAdmin=new LoginAdministrator();
		loginAdmin.setVisible(true);
		this.dispose();
	}

	protected void salir() {
		System.exit(0);
		
	}
	
}
