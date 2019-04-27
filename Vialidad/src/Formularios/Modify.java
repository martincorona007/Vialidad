package Formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import pri.DbConnection;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Toolkit;

public class Modify extends JFrame {

	private JTextField textField;
	private JTable table;
	private JPanel contentPane;
	private JTextField textPropietario;
	private JTextField textPlacas;
	private JTextField textMarca;
	private JTextField textRecaudadora;
	private JTextField textColor_1;
	private JTextField textColor_2;
	private JTextField textSerie;
	private JTextField textMotor;
	private JTextField textNRPVDOC_REG;
	private JTextField textLSubmarca;
	private JTextField textCP;
	private JTextField textKeyVehicular;
	private JTextField textPasajKG;
	private JTextField textVersion;
	private JTextField textModelo; 
	private JTextField textLFDExpedicion;
	private static DbConnection BD;
	private JTextField textConsulta;
	private JTextField textUso;
	private JTextField textMov;
	private JTextField textProce;
	private JTextField textComb;
	private JTextField textServicio;
	private JTextField textClase;
	private JTextField textTipo;
	private JTextField textCilindros;
	private JTextField textPuertas;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Modify frame = new Modify();
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
	public Modify() {
		setTitle("Modificar");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Modify.class.getResource("/Pictures/admin-System-icon.png")));
		BD=new DbConnection();//insttance
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(90, 10, 1250, 740);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblPropietario = new JLabel("PROPIETARIO:");
		lblPropietario.setBounds(10, 95, 96, 14);
		contentPane.add(lblPropietario);
		
		JLabel lblLugarYFecha = new JLabel("LUGAR Y FECHA DE EXPEDICION:");
		lblLugarYFecha.setBounds(10, 120, 169, 14);
		contentPane.add(lblLugarYFecha);
		
		JLabel lblRecaudadora = new JLabel("RECAUDADORA:");
		lblRecaudadora.setBounds(10, 145, 96, 14);
		contentPane.add(lblRecaudadora);
		
		JLabel lblDatosDelVehiculo = new JLabel("DATOS DEL VEHICULO");
		lblDatosDelVehiculo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDatosDelVehiculo.setBounds(555, 184, 147, 14);
		contentPane.add(lblDatosDelVehiculo);
		
		JLabel lblCp = new JLabel("C.P.:");
		lblCp.setBounds(881, 82, 46, 14);
		contentPane.add(lblCp);
		
		JLabel lblClaveVehicular = new JLabel("CLAVE VEHICULAR:");
		lblClaveVehicular.setBounds(866, 162, 112, 14);
		contentPane.add(lblClaveVehicular);
		
		JLabel lblPlacas = new JLabel("PLACAS:");
		lblPlacas.setBounds(21, 212, 46, 14);
		contentPane.add(lblPlacas);
		
		JLabel lblMarca = new JLabel("MARCA:");
		lblMarca.setBounds(21, 237, 46, 14);
		contentPane.add(lblMarca);
		
		JLabel lblLineaOSumbarca = new JLabel("LINEA O SUMBARCA:");
		lblLineaOSumbarca.setBounds(21, 274, 112, 14);
		contentPane.add(lblLineaOSumbarca);
		
		JLabel lblVersion = new JLabel("VERSION:");
		lblVersion.setBounds(21, 302, 65, 14);
		contentPane.add(lblVersion);
		
		JLabel lblModelo = new JLabel("MODELO:");
		lblModelo.setBounds(21, 327, 46, 14);
		contentPane.add(lblModelo);
		
		JLabel lblColor = new JLabel("COLOR 1:");
		lblColor.setBounds(409, 212, 78, 14);
		contentPane.add(lblColor);
		
		JLabel lblColor_1 = new JLabel("COLOR 2:");
		lblColor_1.setBounds(409, 237, 65, 14);
		contentPane.add(lblColor_1);
		
		JLabel lblNoSerie = new JLabel("No. SERIE: ");
		lblNoSerie.setBounds(409, 274, 65, 14);
		contentPane.add(lblNoSerie);
		
		JLabel lblNoMotor = new JLabel("No. MOTOR:");
		lblNoMotor.setBounds(409, 302, 78, 14);
		contentPane.add(lblNoMotor);
		
		JLabel lblNrpvdocReg = new JLabel("N.R.P.V. (DOC. REG)");
		lblNrpvdocReg.setBounds(409, 327, 112, 14);
		contentPane.add(lblNrpvdocReg);
		
		JLabel lblMov = new JLabel("MOV.");
		lblMov.setBounds(738, 212, 46, 14);
		contentPane.add(lblMov);
		
		JLabel lblProced = new JLabel("PROCED.:");
		lblProced.setBounds(738, 237, 78, 14);
		contentPane.add(lblProced);
		
		JLabel lblComb = new JLabel("COMB.:");
		lblComb.setBounds(738, 274, 78, 14);
		contentPane.add(lblComb);
		
		JLabel lblServicio = new JLabel("SERVICIO:");
		lblServicio.setBounds(738, 302, 65, 14);
		contentPane.add(lblServicio);
		
		JLabel lblUso = new JLabel("USO:");
		lblUso.setBounds(738, 327, 46, 14);
		contentPane.add(lblUso);
		
		JLabel lblClase = new JLabel("CLASE:");
		lblClase.setBounds(1008, 212, 46, 14);
		contentPane.add(lblClase);
		
		JLabel lblTipo = new JLabel("TIPO:");
		lblTipo.setBounds(1008, 237, 46, 14);
		contentPane.add(lblTipo);
		
		JLabel lblCilindros = new JLabel("CILINDROS:");
		lblCilindros.setBounds(1008, 274, 78, 14);
		contentPane.add(lblCilindros);
		
		JLabel lblPuertas = new JLabel("PUERTAS:");
		lblPuertas.setBounds(1008, 302, 78, 14);
		contentPane.add(lblPuertas);
		
		JLabel lblPasajkg = new JLabel("PASAJ./KG:");
		lblPasajkg.setBounds(1008, 327, 96, 14);
		contentPane.add(lblPasajkg);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {	
					 Statement stmt=(Statement) BD.getConnection().createStatement();
					 ResultSet registro=stmt.executeQuery("SELECT Propietario,CP,LFExpedicion,ClaveVehicular,Recaudadora,Placas,Marca,LSubmarca,Version,Modelo,Color_1,Color_2,N_Serie,N_Motor,NRPVDOC_REG,Movimiento,Procedencia,Combustibles,Servicio,Uso,Clase,Tipo,Cilindros,Puertas,PasajKG FROM vehiculo WHERE Id_FolioNUM="+textConsulta.getText());
					if(registro.next()==true){
						
						textPropietario.setText(registro.getString("Propietario"));
						textCP.setText(registro.getString("CP"));
						textLFDExpedicion.setText(registro.getString("LFExpedicion"));
						textKeyVehicular.setText(registro.getString("ClaveVehicular"));
						textRecaudadora.setText(registro.getString("Recaudadora"));
						textPlacas.setText(registro.getString("Placas"));
						textMarca.setText(registro.getString("Marca"));
						textLSubmarca.setText(registro.getString("LSubmarca"));
						textVersion.setText(registro.getString("Version"));
						textModelo.setText(registro.getString("Modelo"));
						textColor_1.setText(registro.getString("Color_1"));
						textColor_2.setText(registro.getString("Color_2"));
						textSerie.setText(registro.getString("N_serie"));
						textMotor.setText(registro.getString("N_Motor"));
						textNRPVDOC_REG.setText(registro.getString("NRPVDOC_REG"));
						textMov.setText(registro.getString("Movimiento"));
						textProce.setText(registro.getString("Procedencia"));
						textComb.setText(registro.getString("Combustibles"));
						textServicio.setText(registro.getString("Servicio"));
						textUso.setText(registro.getString("Uso"));
						textClase.setText(registro.getString("Clase"));
						textTipo.setText(registro.getString("Tipo"));
						textCilindros.setText(registro.getString("Cilindros"));
						textPuertas.setText(registro.getString("Puertas"));
						textPasajKG.setText(registro.getString("PasajKG"));
						
						
						
					}else{
						JOptionPane.showMessageDialog(null,"NO existe el Folio ingresado");
						
					}
					
					
					
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null,"Datos almacenados Incorrectamente /o campo no llenado");
						e.printStackTrace();
					}
				
			}
		});
		
		btnAceptar.setBounds(655, 11, 96, 40);
		contentPane.add(btnAceptar);
		
		textPropietario = new JTextField();
		textPropietario.setBounds(116, 89, 271, 20);
		contentPane.add(textPropietario);
		textPropietario.setColumns(10);
		
		textPlacas = new JTextField();
		textPlacas.setBounds(109, 209, 290, 20);
		contentPane.add(textPlacas);
		textPlacas.setColumns(10);
		
		textMarca = new JTextField();
		textMarca.setBounds(109, 234, 290, 20);
		contentPane.add(textMarca);
		textMarca.setColumns(10);
		
		textRecaudadora = new JTextField();
		textRecaudadora.setBounds(97, 145, 290, 20);
		contentPane.add(textRecaudadora);
		textRecaudadora.setColumns(10);
		
		textModelo = new JTextField();
		textModelo.setBounds(121, 324, 278, 20);
		contentPane.add(textModelo);
		textModelo.setColumns(10);
		
		textColor_1 = new JTextField();
		textColor_1.setBounds(480, 209, 234, 20);
		contentPane.add(textColor_1);
		textColor_1.setColumns(10);
		
		textColor_2 = new JTextField();
		textColor_2.setBounds(480, 237, 234, 20);
		contentPane.add(textColor_2);
		textColor_2.setColumns(10);
		
		textSerie = new JTextField();
		textSerie.setBounds(482, 268, 232, 20);
		contentPane.add(textSerie);
		textSerie.setColumns(10);
		
		textMotor = new JTextField();
		textMotor.setBounds(480, 299, 234, 20);
		contentPane.add(textMotor);
		textMotor.setColumns(10);
		
		textNRPVDOC_REG = new JTextField();
		textNRPVDOC_REG.setBounds(525, 324, 189, 20);
		contentPane.add(textNRPVDOC_REG);
		textNRPVDOC_REG.setColumns(10);
		
		textLSubmarca = new JTextField();
		textLSubmarca.setBounds(175, 271, 224, 20);
		contentPane.add(textLSubmarca);
		textLSubmarca.setColumns(10);
		
		textCP = new JTextField();
		textCP.setBounds(916, 79, 170, 20);
		contentPane.add(textCP);
		textCP.setColumns(10);
		
		textKeyVehicular = new JTextField();
		textKeyVehicular.setBounds(978, 159, 108, 20);
		contentPane.add(textKeyVehicular);
		textKeyVehicular.setColumns(10);
	
		textPasajKG = new JTextField();
		textPasajKG.setBounds(1076, 324, 141, 20);
		contentPane.add(textPasajKG);
		textPasajKG.setColumns(10);
		
		textVersion = new JTextField();
		textVersion.setBounds(109, 299, 290, 20);
		contentPane.add(textVersion);
		textVersion.setColumns(10);
		
		textLFDExpedicion = new JTextField();
		textLFDExpedicion.setBounds(177, 117, 210, 20);
		contentPane.add(textLFDExpedicion);
		textLFDExpedicion.setColumns(10);
		
		JLabel lblNumeroDePlaca = new JLabel("Buscar Numero de Folio:");
		lblNumeroDePlaca.setBounds(86, 11, 141, 40);
		contentPane.add(lblNumeroDePlaca);
		
		textConsulta = new JTextField();
		textConsulta.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textConsulta.setBounds(246, 11, 275, 40);
		contentPane.add(textConsulta);
		textConsulta.setColumns(10);
		
		textUso = new JTextField();
		textUso.setBounds(769, 324, 229, 20);
		contentPane.add(textUso);
		textUso.setColumns(10);
		
		textMov = new JTextField();
		textMov.setBounds(769, 209, 229, 20);
		contentPane.add(textMov);
		textMov.setColumns(10);
		
		textProce = new JTextField();
		textProce.setBounds(788, 234, 210, 20);
		contentPane.add(textProce);
		textProce.setColumns(10);
		
		textComb = new JTextField();
		textComb.setBounds(798, 271, 200, 20);
		contentPane.add(textComb);
		textComb.setColumns(10);
		
		textServicio = new JTextField();
		textServicio.setBounds(788, 299, 202, 20);
		contentPane.add(textServicio);
		textServicio.setColumns(10);
		
		textClase = new JTextField();
		textClase.setBounds(1047, 209, 169, 20);
		contentPane.add(textClase);
		textClase.setColumns(10);
		
		textTipo = new JTextField();
		textTipo.setText("");
		textTipo.setBounds(1047, 234, 170, 20);
		contentPane.add(textTipo);
		textTipo.setColumns(10);
		
		textCilindros = new JTextField();
		textCilindros.setBounds(1069, 271, 148, 20);
		contentPane.add(textCilindros);
		textCilindros.setColumns(10);
		
		textPuertas = new JTextField();
		textPuertas.setBounds(1061, 299, 156, 20);
		contentPane.add(textPuertas);
		textPuertas.setColumns(10);
		
		JButton btnLimpiarDatos = new JButton("Limpiar Datos");
		btnLimpiarDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textConsulta.setText(""); 
				textPropietario.setText("");
				textCP.setText("");
				textLFDExpedicion.setText("");
				textKeyVehicular.setText("");
				textRecaudadora.setText("");
				textPlacas.setText("");
				textMarca.setText("");
				textLSubmarca.setText("");
				textVersion.setText("");
				textModelo.setText("");
				textColor_1.setText("");
				textColor_2.setText("");
				textSerie.setText("");
				textMotor.setText("");
				textNRPVDOC_REG.setText("");
				textMov.setText("");
				textProce.setText("");
				textComb.setText("");
				textServicio.setText("");
				textUso.setText("");
				textClase.setText("");
				textTipo.setText("");
				textCilindros.setText("");
				textPuertas.setText("");
				textPasajKG.setText("");
			}
		});
		btnLimpiarDatos.setBounds(762, 11, 119, 40);
		contentPane.add(btnLimpiarDatos);
		
		JButton btnNewButton = new JButton("Salir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			goOut();
			}
		});
		btnNewButton.setBounds(889, 11, 112, 40);
		contentPane.add(btnNewButton);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {	
					//InsertToDataBase(txtFolio_ID.getText(),textPropietario.getText(),textCP.getText(),textLFDExpedicion.getText(),textKeyVehicular.getText(),textRecaudadora.getText(),textPlacas.getText(),textMarca.getText(),textLSubmarca.getText(),textVersion.getText(),textModelo.getText(),textColor_1.getText(),textColor_2.getText(),textSerie.getText(),textMotor.getText(),textNRPVDOC_REG.getText(),comboBoxMov.getSelectedItem().toString(),comboBoxProce.getSelectedItem().toString(),comboBoxCombus.getSelectedItem().toString(),comboxBoxServi.getSelectedItem().toString(),comboBoxUso.getSelectedItem().toString(),comboBoxClase.getSelectedItem().toString(),comboBoxTipo.getSelectedItem().toString(),comboBoxCilindros.getSelectedItem().toString(),comboBoxPuerta.getSelectedItem().toString(),textPasajKG.getText());
				
				
		      
		    	
				//PreparedStatement statement = (PreparedStatement) BD.getConnection().prepareStatement(query);
				Statement SSQL=(Statement) BD.getConnection().createStatement();
				int cantidad=SSQL.executeUpdate("UPDATE vehiculo SET Propietario='"+textPropietario.getText()+"',CP='"+textCP.getText()+"',LFExpedicion='"+textLFDExpedicion.getText()+"',ClaveVehicular='"+textKeyVehicular.getText()+"',Recaudadora='"+Integer.parseInt(textRecaudadora.getText())+"',Placas='"+textPlacas.getText()+"',Marca='"+textMarca.getText()+"',LSubmarca='"+textLSubmarca.getText()+"',Version='"+textVersion.getText()+"',Modelo='"+textModelo.getText()+"',Color_1='"+textColor_1.getText()+"',Color_2='"+textColor_2.getText()+"',N_Serie='"+textSerie.getText()+"',N_Motor='"+textMotor.getText()+"',NRPVDOC_REG='"+Integer.parseInt(textNRPVDOC_REG.getText())+"',Movimiento='"+Integer.parseInt(textMov.getText())+"',Procedencia='"+Integer.parseInt(textProce.getText())+"',Combustibles='"+Integer.parseInt(textComb.getText())+"',Servicio='"+Integer.parseInt(textServicio.getText())+"',Uso='"+Integer.parseInt(textUso.getText())+"',Clase='"+Integer.parseInt(textClase.getText())+"',Tipo='"+Integer.parseInt(textTipo.getText())+"',Cilindros='"+Integer.parseInt(textCilindros.getText())+"',Puertas='"+Integer.parseInt(textPuertas.getText())+"',PasajKG='"+textPasajKG.getText()+"' WHERE Id_FolioNUM="+textConsulta.getText());
				if(cantidad==1){
					JOptionPane.showMessageDialog(null,"Datos Actualizados correctamente");
					dispo();
				}else{
					JOptionPane.showMessageDialog(null,"Error");
				}
				//BD.desconectar();
				
				
				
				
				
				
				
			} catch (Exception s) {
				JOptionPane.showMessageDialog(null,"Error");
					s.printStackTrace();
				}
				//updateTable();
			}
		});
		btnActualizar.setBounds(1015, 11, 89, 40);
		contentPane.add(btnActualizar);
	}
	protected void goOut() {
		System.exit(0);
		
	}
	protected void dispo(){
		AdminActivity k=new AdminActivity();
		k.setVisible(true);
		this.dispose();
	}
	
	
	}

