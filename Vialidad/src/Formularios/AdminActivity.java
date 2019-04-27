package Formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class AdminActivity extends JFrame {

	private JPanel contentPane;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminActivity frame = new AdminActivity();
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
	public AdminActivity() {
		setTitle("Administrador");
		setIconImage(Toolkit.getDefaultToolkit().getImage(AdminActivity.class.getResource("/Pictures/admin-System-icon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450,200, 450, 363);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnInsertar = new JButton("Insertar");
		btnInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					insert();
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnInsertar.setBounds(33, 262, 89, 40);
		contentPane.add(btnInsertar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modificar();
			}
		});
		btnModificar.setBounds(168, 262, 89, 40);
		contentPane.add(btnModificar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eliminar();
			}
		});
		btnEliminar.setBounds(299, 262, 89, 40);
		contentPane.add(btnEliminar);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(AdminActivity.class.getResource("/Pictures/rsz_adminn.png")));
		label.setBounds(70, 0, 256, 245);
		contentPane.add(label);
	}

	protected void eliminar() {
		// TODO Auto-generated method stub
		Delete de=new Delete();
		de.setVisible(true);
		this.dispose();
	}

	protected void modificar() {
		// TODO Auto-generated method stub
		Modify mo=new Modify();
		mo.setVisible(true);
		this.dispose();
	}

	protected void insert() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
		// TODO Auto-generated method stub
		Insert in=new Insert();
		in.setVisible(true);
		this.dispose();
	}
}
