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
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.PreparedStatement;

import pri.DbConnection;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Toolkit;

public class Insert extends JFrame {

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
	private JTextField txtFolio_ID;
	private JTextField textKeyVehicular;
	private JTextField textPasajKG;
	private JTextField textVersion;
	private JTextField textModelo; 
	private JTextField textLFDExpedicion;
	private JComboBox comboBoxMov;
	private JComboBox comboBoxProce; 
	private JComboBox comboBoxCombus;
	private JComboBox comboxBoxServi;
	private JComboBox comboBoxUso;
	private JComboBox comboBoxClase;
	private JComboBox comboBoxTipo;
	private JComboBox comboBoxCilindros;
	private JComboBox comboBoxPuerta;
	private static DbConnection BD;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Insert frame = new Insert();
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
	
	public Insert()throws ClassNotFoundException,java.sql.SQLException,InstantiationException,IllegalAccessException{
		setTitle("Insertar");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Insert.class.getResource("/Pictures/admin-System-icon.png")));
		BD=new DbConnection();//insttance
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(90, 50, 1250, 740);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblPropietario = new JLabel("PROPIETARIO:");
		lblPropietario.setBounds(10, 223, 96, 14);
		contentPane.add(lblPropietario);
		
		JLabel lblLugarYFecha = new JLabel("LUGAR Y FECHA DE EXPEDICION:");
		lblLugarYFecha.setBounds(10, 248, 169, 14);
		contentPane.add(lblLugarYFecha);
		
		JLabel lblRecaudadora = new JLabel("RECAUDADORA:");
		lblRecaudadora.setBounds(10, 273, 96, 14);
		contentPane.add(lblRecaudadora);
		
		JLabel lblDatosDelVehiculo = new JLabel("DATOS DEL VEHICULO");
		lblDatosDelVehiculo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDatosDelVehiculo.setBounds(567, 313, 147, 14);
		contentPane.add(lblDatosDelVehiculo);
		
		JLabel lblCp = new JLabel("C.P.:");
		lblCp.setBounds(879, 223, 46, 14);
		contentPane.add(lblCp);
		
		JLabel lblFolioNum = new JLabel("FOLIO NUM:");
		lblFolioNum.setBounds(879, 248, 78, 14);
		contentPane.add(lblFolioNum);
		
		JLabel lblClaveVehicular = new JLabel("CLAVE VEHICULAR:");
		lblClaveVehicular.setBounds(879, 273, 112, 14);
		contentPane.add(lblClaveVehicular);
		
		JLabel lblPlacas = new JLabel("PLACAS:");
		lblPlacas.setBounds(41, 351, 46, 14);
		contentPane.add(lblPlacas);
		
		JLabel lblMarca = new JLabel("MARCA:");
		lblMarca.setBounds(41, 390, 46, 14);
		contentPane.add(lblMarca);
		
		JLabel lblLineaOSumbarca = new JLabel("LINEA O SUMBARCA:");
		lblLineaOSumbarca.setBounds(41, 431, 112, 14);
		contentPane.add(lblLineaOSumbarca);
		
		JLabel lblVersion = new JLabel("VERSION:");
		lblVersion.setBounds(41, 468, 65, 14);
		contentPane.add(lblVersion);
		
		JLabel lblModelo = new JLabel("MODELO:");
		lblModelo.setBounds(41, 504, 46, 14);
		contentPane.add(lblModelo);
		
		JLabel lblColor = new JLabel("COLOR 1:");
		lblColor.setBounds(409, 351, 78, 14);
		contentPane.add(lblColor);
		
		JLabel lblColor_1 = new JLabel("COLOR 2:");
		lblColor_1.setBounds(409, 390, 65, 14);
		contentPane.add(lblColor_1);
		
		JLabel lblNoSerie = new JLabel("No. SERIE: ");
		lblNoSerie.setBounds(409, 431, 65, 14);
		contentPane.add(lblNoSerie);
		
		JLabel lblNoMotor = new JLabel("No. MOTOR:");
		lblNoMotor.setBounds(409, 468, 78, 14);
		contentPane.add(lblNoMotor);
		
		JLabel lblNrpvdocReg = new JLabel("N.R.P.V. (DOC. REG)");
		lblNrpvdocReg.setBounds(409, 504, 112, 14);
		contentPane.add(lblNrpvdocReg);
		
		JLabel lblMov = new JLabel("MOV.");
		lblMov.setBounds(751, 351, 46, 14);
		contentPane.add(lblMov);
		
		JLabel lblProced = new JLabel("PROCED.:");
		lblProced.setBounds(751, 390, 78, 14);
		contentPane.add(lblProced);
		
		JLabel lblComb = new JLabel("COMB.:");
		lblComb.setBounds(751, 431, 78, 14);
		contentPane.add(lblComb);
		
		JLabel lblServicio = new JLabel("SERVICIO:");
		lblServicio.setBounds(751, 468, 65, 14);
		contentPane.add(lblServicio);
		
		JLabel lblUso = new JLabel("USO:");
		lblUso.setBounds(751, 504, 46, 14);
		contentPane.add(lblUso);
		
		JLabel lblClase = new JLabel("CLASE:");
		lblClase.setBounds(1008, 351, 46, 14);
		contentPane.add(lblClase);
		
		JLabel lblTipo = new JLabel("TIPO:");
		lblTipo.setBounds(1008, 390, 46, 14);
		contentPane.add(lblTipo);
		
		JLabel lblCilindros = new JLabel("CILINDROS:");
		lblCilindros.setBounds(1008, 431, 78, 14);
		contentPane.add(lblCilindros);
		
		JLabel lblPuertas = new JLabel("PUERTAS:");
		lblPuertas.setBounds(1008, 468, 78, 14);
		contentPane.add(lblPuertas);
		
		JLabel lblPasajkg = new JLabel("PASAJ./KG:");
		lblPasajkg.setBounds(1008, 504, 96, 14);
		contentPane.add(lblPasajkg);
		
		
		
		JButton btnNewButton = new JButton("Ver Codificaciones");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			seeCody();
			}
		});
		btnNewButton.setBounds(961, 636, 119, 40);
		contentPane.add(btnNewButton);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				try {	
					String query="INSERT INTO vehiculo (Id_FolioNUM,Propietario,CP,LFExpedicion,ClaveVehicular,Recaudadora,Placas,Marca,LSubmarca,Version,Modelo,Color_1,Color_2,N_Serie,N_Motor,NRPVDOC_REG,Movimiento,Procedencia,Combustibles,Servicio,Uso,Clase,Tipo,Cilindros,Puertas,PasajKG) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				PreparedStatement statement = (PreparedStatement) BD.getConnection().prepareStatement(query);
					//InsertToDataBase(txtFolio_ID.getText(),textPropietario.getText(),textCP.getText(),textLFDExpedicion.getText(),textKeyVehicular.getText(),textRecaudadora.getText(),textPlacas.getText(),textMarca.getText(),textLSubmarca.getText(),textVersion.getText(),textModelo.getText(),textColor_1.getText(),textColor_2.getText(),textSerie.getText(),textMotor.getText(),textNRPVDOC_REG.getText(),comboBoxMov.getSelectedItem().toString(),comboBoxProce.getSelectedItem().toString(),comboBoxCombus.getSelectedItem().toString(),comboxBoxServi.getSelectedItem().toString(),comboBoxUso.getSelectedItem().toString(),comboBoxClase.getSelectedItem().toString(),comboBoxTipo.getSelectedItem().toString(),comboBoxCilindros.getSelectedItem().toString(),comboBoxPuerta.getSelectedItem().toString(),textPasajKG.getText());
				statement.setInt(1, Integer.parseInt(txtFolio_ID.getText()));
				statement.setString(2,textPropietario.getText());
				statement.setString(3,textCP.getText());
				statement.setString(4,textLFDExpedicion.getText());
				statement.setString(5,textKeyVehicular.getText());
				statement.setInt(6, Integer.parseInt(textRecaudadora.getText()));
				statement.setString(7,textPlacas.getText());
				statement.setString(8,textMarca.getText());
				statement.setString(9,textLSubmarca.getText());
				statement.setString(10,textVersion.getText());
				statement.setString(11,textModelo.getText());
				statement.setString(12,textColor_1.getText());
				statement.setString(13,textColor_2.getText());
				statement.setString(14,textSerie.getText());
				statement.setString(15,textMotor.getText());
				statement.setInt(16, Integer.parseInt(textNRPVDOC_REG.getText()));
				statement.setInt(17,Integer.parseInt(comboBoxMov.getSelectedItem().toString()));
				statement.setInt(18,Integer.parseInt(comboBoxProce.getSelectedItem().toString()));
				statement.setInt(19,Integer.parseInt(comboBoxCombus.getSelectedItem().toString()));
				statement.setInt(20,Integer.parseInt(comboxBoxServi.getSelectedItem().toString()));
				statement.setInt(21,Integer.parseInt(comboBoxUso.getSelectedItem().toString()));
				statement.setInt(22,Integer.parseInt(comboBoxClase.getSelectedItem().toString()));
				statement.setInt(23,Integer.parseInt(comboBoxTipo.getSelectedItem().toString()));
				statement.setInt(24,Integer.parseInt(comboBoxCilindros.getSelectedItem().toString()));
				statement.setInt(25,Integer.parseInt(comboBoxPuerta.getSelectedItem().toString()));
				statement.setString(26,textPasajKG.getText());
				
				statement.executeUpdate();
				BD.desconectar();
				
				JOptionPane.showMessageDialog(null,"Datos almacenados correctamente");
				
				
				dispo();
				
					/*Statement stmt=BD.getConnection().createStatement();
				String query="";
					stmt.executeUpdate(query);
					*/
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,"Datos almacenados Incorrectamente /o campo no llenado");
					e.printStackTrace();
				}
				
			}
		});
		
		btnAceptar.setBounds(1090, 636, 96, 40);
		contentPane.add(btnAceptar);
		
		textPropietario = new JTextField();
		textPropietario.setBounds(116, 220, 271, 20);
		contentPane.add(textPropietario);
		textPropietario.setColumns(10);
		
		textPlacas = new JTextField();
		textPlacas.setBounds(97, 348, 290, 20);
		contentPane.add(textPlacas);
		textPlacas.setColumns(10);
		
		textMarca = new JTextField();
		textMarca.setBounds(97, 387, 290, 20);
		contentPane.add(textMarca);
		textMarca.setColumns(10);
		
		textRecaudadora = new JTextField();
		textRecaudadora.setBounds(97, 273, 290, 20);
		contentPane.add(textRecaudadora);
		textRecaudadora.setColumns(10);
		
		textModelo = new JTextField();
		textModelo.setBounds(113, 501, 278, 20);
		contentPane.add(textModelo);
		textModelo.setColumns(10);
		
		textColor_1 = new JTextField();
		textColor_1.setBounds(480, 348, 234, 20);
		contentPane.add(textColor_1);
		textColor_1.setColumns(10);
		
		textColor_2 = new JTextField();
		textColor_2.setBounds(480, 387, 234, 20);
		contentPane.add(textColor_2);
		textColor_2.setColumns(10);
		
		textSerie = new JTextField();
		textSerie.setBounds(482, 428, 232, 20);
		contentPane.add(textSerie);
		textSerie.setColumns(10);
		
		textMotor = new JTextField();
		textMotor.setBounds(480, 465, 234, 20);
		contentPane.add(textMotor);
		textMotor.setColumns(10);
		
		textNRPVDOC_REG = new JTextField();
		textNRPVDOC_REG.setBounds(525, 501, 189, 20);
		contentPane.add(textNRPVDOC_REG);
		textNRPVDOC_REG.setColumns(10);
		
		textLSubmarca = new JTextField();
		textLSubmarca.setBounds(163, 428, 224, 20);
		contentPane.add(textLSubmarca);
		textLSubmarca.setColumns(10);
		String[] listPuertas={" ","1","2","3","4","5","6","7","8","9","10"};
		comboBoxPuerta = new JComboBox(listPuertas);
		comboBoxPuerta.setBounds(1076, 465, 141, 20);
		contentPane.add(comboBoxPuerta);
		
		textCP = new JTextField();
		textCP.setBounds(916, 220, 170, 20);
		contentPane.add(textCP);
		textCP.setColumns(10);
		
		txtFolio_ID = new JTextField();
		txtFolio_ID.setBounds(945, 245, 141, 20);
		contentPane.add(txtFolio_ID);
		txtFolio_ID.setColumns(10);
		
		textKeyVehicular = new JTextField();
		textKeyVehicular.setBounds(978, 270, 108, 20);
		contentPane.add(textKeyVehicular);
		textKeyVehicular.setColumns(10);
		String[] listProce={"","1","2","3"};
		comboBoxProce = new JComboBox(listProce);
		comboBoxProce.setBounds(816, 387, 175, 20);
		contentPane.add(comboBoxProce);
		String[] listUse={" ","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50","51"};
		comboBoxUso = new JComboBox(listUse);
		comboBoxUso.setBounds(788, 501, 203, 20);
		contentPane.add(comboBoxUso);
		String[] listService={" ","1","2","3","4","5"};
		comboxBoxServi = new JComboBox(listService);
		comboxBoxServi.setBounds(816, 463, 173, 25);
		contentPane.add(comboxBoxServi);
		String[] listCombus={" ","1","2","3","4","5","10","11"};
		comboBoxCombus = new JComboBox(listCombus);
		comboBoxCombus.setBounds(801, 428, 190, 20);
		contentPane.add(comboBoxCombus);
		
		String[] listMov={" ","1","2","3","4","5","6","7","8","9","10","11","12"};
		comboBoxMov = new JComboBox(listMov);
		
		comboBoxMov.setBounds(788, 348, 203, 20);
		contentPane.add(comboBoxMov);
		
		textPasajKG = new JTextField();
		textPasajKG.setBounds(1076, 501, 141, 20);
		contentPane.add(textPasajKG);
		textPasajKG.setColumns(10);
		String[] listCilindros={" ","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32"};
	    comboBoxCilindros = new JComboBox(listCilindros);
		comboBoxCilindros.setBounds(1076, 428, 141, 20);
		contentPane.add(comboBoxCilindros);
		
		textVersion = new JTextField();
		textVersion.setBounds(97, 465, 290, 20);
		contentPane.add(textVersion);
		textVersion.setColumns(10);
		
		textLFDExpedicion = new JTextField();
		textLFDExpedicion.setBounds(177, 245, 210, 20);
		contentPane.add(textLFDExpedicion);
		textLFDExpedicion.setColumns(10);
		 String[]classtype={"","1","2","3","4"};
		comboBoxClase = new JComboBox(classtype);
		comboBoxClase.setBounds(1076, 348, 141, 20);
		contentPane.add(comboBoxClase);
		String[] listype={" ","11","12","13","14","15","16","17","18","51","52","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50","80","81","61","62","63","64","65","66","67","68","69","71","72","73","74","75","76"};
		comboBoxTipo = new JComboBox(listype);
		comboBoxTipo.setBounds(1076, 387, 141, 20);
		contentPane.add(comboBoxTipo);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Insert.class.getResource("/Pictures/CARD_ICON.jpg")));
		label.setBounds(10, 11, 608, 198);
		contentPane.add(label);
	}

	
	/*public void InsertToDataBase(String Id_FolioNum,String Propietario,String CP,String LFExpedicion,String ClaveVeicular,String Recaudadora,String Placas,String Marca,String LSubmarca,String Version,String Modelo,String Color_1,String Color_2,String N_Serie,String N_Motor,String NRPVDOC_REG,String Movimiento,String Procedencia,String Combustibles,String Servicio,String Uso,String Clase,String Tipo,String Cilindros,String Puertas,String PasajKG){                
		
		try{
			DbConnection con=new DbConnection();
			String SSQL="INSERT INTO vehiculo(Id_FolioNUM,Propietario,CP,LFExpedicion,ClaveVehicular,Recaudadora,Placas,Marca,LSubmarca,Version,Modelo,Color_1,Color_2,N_Serie,N_Motor,NRPVDOC_REG,Movimiento,Procedencia,Combustibles,Servicio,Uso,Clase,Tipo,Cilindros,Puertas,PasajKG) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			//it just accept numbers
			//Statement stmt=con.getConnection().createStatement();  
			// ResultSet rs;
			// stmt.executeUpdate(SSQL);
			st=con.getConnection().createStatement();
					
			 JOptionPane.showMessageDialog(null,"Datos almacenados correctamente");
		}catch(Exception e){
			JOptionPane.showMessageDialog(null,"Datos almacenados Incorrectamente");
			e.printStackTrace();
		}
	}*/
	protected void seeCody() {
		// TODO Auto-generated method stub
		Codificaciones codi=new Codificaciones();
		codi.setVisible(true);
	
	}
	protected void dispo(){
		AdminActivity k=new AdminActivity();
		k.setVisible(true);
		this.dispose();
	}
	}


