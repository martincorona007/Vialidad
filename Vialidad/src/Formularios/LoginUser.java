package Formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import pri.DbConnection;

import java.awt.Toolkit;
import javax.swing.JProgressBar;

public class LoginUser extends JFrame {

	private JPanel contentPane;
	public static JTextField txtUsuario;
	public static JPasswordField txtPasswordUser;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginUser frame = new LoginUser();
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
	public LoginUser() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(LoginUser.class.getResource("/Pictures/Users-icon.png")));
		setTitle("Login Usuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 50, 809, 662);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel labelLoginUsu = new JLabel("");
		labelLoginUsu .setIcon(new ImageIcon(LoginUser.class.getResource("/Pictures/rsz_user.png")));
		labelLoginUsu .setBounds(275, 66, 275, 316);
		contentPane.add(labelLoginUsu);
		
		JLabel lblUsuario= new JLabel("Usuario");
		lblUsuario.setBounds(125, 397, 104, 37);
		contentPane.add(lblUsuario);
		
		JLabel lblpass = new JLabel("Constrase\u00F1a");
		lblpass.setBounds(125, 468, 104, 37);
		contentPane.add(lblpass);
		
		txtUsuario = new JTextField();
		txtUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		txtUsuario.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtUsuario.setBounds(251, 393, 299, 37);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtPasswordUser = new JPasswordField();
		txtPasswordUser.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtPasswordUser.setBounds(251, 468, 299, 37);
		contentPane.add(txtPasswordUser);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ingresar();
			}
		});
		btnAceptar.setBounds(608, 541, 109, 44);
		contentPane.add(btnAceptar);
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				regresar();
			}
		});
		btnRegresar.setBounds(489, 541,109, 44);
		contentPane.add(btnRegresar);
	}

	protected void regresar() {
		// TODO Auto-generated method stub
		LoginPrincipal pri=new LoginPrincipal();
		pri.setVisible(true);
		this.dispose();
	}

	protected void ingresar() {
		try{
			if(txtUsuario.getText().length()>0 && txtPasswordUser.getPassword().length>0 ){
				
				if(checkUser(txtUsuario.getText(),txtPasswordUser.getPassword())){
					
						ConsultUser at=new ConsultUser();
						at.setVisible(true);
						this.dispose();
					
					
				}else{
					JOptionPane.showMessageDialog(null, "El nombre de usuario y/o contrasenia no son validos.");
                    JOptionPane.showMessageDialog(null, txtUsuario.getText()+" " +txtPasswordUser.getPassword() );
                    txtUsuario.setText("");    //limpiar campos
                    txtPasswordUser.setText("");        
                     
                    txtUsuario.requestFocusInWindow();
				}
			}else{
				JOptionPane.showMessageDialog(null, "Debe escribir nombre de usuario y contrasenia.\n" +"NO puede dejar ningun campo vacio");
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		
		
		
	}
	boolean checkUser(String User,char[] cs){
		try{
			DbConnection con=new DbConnection();//database
			String usuario=LoginUser.txtUsuario.getText();
			String contra=String.valueOf(LoginUser.txtPasswordUser.getPassword());
			
			//int resultado=0;
			String SSQL="SELECT * FROM usuario WHERE nombre='"+usuario+"' AND passord='"+contra+"'";
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
	
	public JTextField getTextTypeUserLogin() {
		return txtUsuario;
	}
	public JPasswordField getTextPassUserLogin() {
		return txtPasswordUser;
	}
    
	}

