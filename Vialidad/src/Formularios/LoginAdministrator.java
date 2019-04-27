package Formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.*;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import pri.DbConnection;

//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//import javax.swing.ImageIcon;
import java.awt.Color;
//import javax.swing.JButton;
//import javax.swing.JTextField;
//import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.event.ChangeListener;



import javax.swing.event.ChangeEvent;
//import javax.swing.JProgressBar;

public class LoginAdministrator extends JFrame {

	private JPanel contentPane;
	private static JTextField txtAdmin;
	private static JPasswordField txtpasswordAdmin;
	public static JProgressBar progressBar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginAdministrator frame = new LoginAdministrator();
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
	public LoginAdministrator() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(LoginAdministrator.class.getResource("/Pictures/admin-System-icon.png")));
		setTitle("Administrador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 50, 809, 662);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelLoginAdmin = new JLabel("");
		labelLoginAdmin.setIcon(new ImageIcon(LoginAdministrator.class.getResource("/Pictures/rsz_adminn.png")));
		labelLoginAdmin.setBounds(276, 25, 275, 316);
		contentPane.add(labelLoginAdmin);
		
		JLabel lblAdministrador = new JLabel("Administrador");
		lblAdministrador.setBounds(125, 397, 104, 37);
		contentPane.add(lblAdministrador);
		
		JLabel lblConstrasea = new JLabel("Constrase\u00F1a");
		lblConstrasea.setBounds(125, 468, 104, 37);
		contentPane.add(lblConstrasea);
		
		txtAdmin = new JTextField();
		txtAdmin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtAdmin.setBounds(251, 393, 299, 37);
		contentPane.add(txtAdmin);
		txtAdmin.setColumns(10);
		
		txtpasswordAdmin = new JPasswordField();
		txtpasswordAdmin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtpasswordAdmin.setBounds(251, 468, 299, 37);
		contentPane.add(txtpasswordAdmin);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					ingresar();
				
			}
		});
		btnAceptar.setBounds(608, 541, 109, 44);
		contentPane.add(btnAceptar);
		
		JButton btnRgeresar = new JButton("Rgeresar");
		btnRgeresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent r) {
				regresar();
			}
		});
		/*
		btnRgeresar.setBounds(485, 541, 109,44);
		contentPane.add(btnRgeresar);
		progressBar = new JProgressBar();
		progressBar.setBounds(179, 355, 417, 14);
		progressBar.setValue(0);
		progressBar.setStringPainted(true);
		this.add(progressBar);
		this.setSize(450,450);
		this.setLayout(null);
		*/
	}

	

	protected void regresar() {
		LoginPrincipal pri=new LoginPrincipal();
		pri.setVisible(true);
		this.dispose();
		
	}

	protected void ingresar() {
	
		try{
			if(txtAdmin.getText().length()>0 && txtpasswordAdmin.getPassword().length>0 ){
				
				if(checkUser(txtAdmin.getText(),txtpasswordAdmin.getPassword())){
					
						AdminActivity at=new AdminActivity();
						at.setVisible(true);
						this.dispose();
					
					
				}else{
					JOptionPane.showMessageDialog(null, "El nombre de usuario y/o contrasenia no son validos.");
                    JOptionPane.showMessageDialog(null, txtAdmin.getText()+" " +txtpasswordAdmin.getPassword() );
                    txtAdmin.setText("");    //limpiar campos
                    txtpasswordAdmin.setText("");        
                     
                    txtAdmin.requestFocusInWindow();
				}
			}else{
				JOptionPane.showMessageDialog(null, "Debe escribir nombre de usuario y contrasenia.\n" +"NO puede dejar ningun campo vacio");
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		
		/*DbConnection con=new DbConnection();//database
		String admin=LoginAdministrator.txtAdmin.getText();
		String contra=String.valueOf(LoginAdministrator.txtpasswordAdmin.getPassword());
		
		int resultado=0;
		String SSQL="SELECT * FROM administrador WHERE nombre='"+admin+"' AND passord=shal('"+contra+"')";
		// Statement stmt=connection.createStatement();
		 Statement stmt=con.getConnection().createStatement();  
		 ResultSet rs=stmt.executeQuery(SSQL);
		   //rs=stmt.getResultSet();
		   	
		 if(rs.first()){
		   		
		   JOptionPane.showMessageDialog(null,"Acceso correcto");
			AdminActivity at=new AdminActivity();
			at.setVisible(true);
			this.dispose();
		
		 }else{
		   		JOptionPane.showMessageDialog(null,"Acceso Denegado");	
		   	}
		*/
	}
	boolean checkUser(String User,char[] cs){
		try{
			DbConnection con=new DbConnection();//database
			String admin=LoginAdministrator.txtAdmin.getText();
			String contra=String.valueOf(LoginAdministrator.txtpasswordAdmin.getPassword());
			
			//int resultado=0;
			String SSQL="SELECT * FROM administrador WHERE nombre='"+admin+"' AND passord='"+contra+"'";
			// Statement stmt=connection.createStatement();
			 Statement stmt=con.getConnection().createStatement();  
			 ResultSet rs=stmt.executeQuery(SSQL);
			   
			 //rs=stmt.getResultSet();
			 //////////////////
			//DbConnection con=new DbConnection();
			    // Preparamos la consulta
	            //Statement instruccionSQL = con.createStatement();
	            //ResultSet resultadosConsulta = instruccionSQL.executeQuery ("SELECT * FROM usuarios WHERE usuario='"+elUsr+"' AND password='"+ elPw+"'");
	 
	            if( rs.first() )        // si es valido el primer reg. hay una fila, tons el usuario y su pw existen
	                return true;        //usuario validado correctamente
	            else
	                return false; 
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
}
