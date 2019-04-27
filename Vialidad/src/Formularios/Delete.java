package Formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.Statement;

import pri.DbConnection;
import java.awt.Toolkit;

public class Delete extends JFrame {

	private JPanel contentPane;
	private JTextField textDelete;
	private static DbConnection BD;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Delete frame = new Delete();
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
	public Delete() {
		setTitle("Eliminar");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Delete.class.getResource("/Pictures/admin-System-icon.png")));
		BD=new DbConnection();//insttance
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 200, 342, 188);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("Numero de Folio:");
		lblNewLabel.setBounds(21, 11, 144, 45);
		contentPane.add(lblNewLabel);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					Statement stmt = (Statement) BD.getConnection().createStatement();
					stmt.execute("DELETE FROM vehiculo WHERE Id_FolioNUM="+textDelete.getText());
					JOptionPane.showMessageDialog(null,"Se ha eliminado correctamente");
					dispo();
				} catch (SQLException e) {
					JOptionPane.showMessageDialog(null,"No ha eliminado correctamente");
					e.printStackTrace();
				}
				 
			}
		});
		
		btnAceptar.setBounds(198, 81, 110, 45);
		contentPane.add(btnAceptar);
		
		textDelete = new JTextField();
		textDelete.setBounds(127, 11, 184, 45);
		contentPane.add(textDelete);
		textDelete.setColumns(10);
	}
	protected void dispo(){
		AdminActivity k=new AdminActivity();
		k.setVisible(true);
		this.dispose();
	}

}
