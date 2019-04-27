package Formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import java.awt.Dimension;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextPane;
import java.awt.Window.Type;
import java.awt.Toolkit;

public class Codificaciones extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private JTable table_4;
	private JTable table_5;
	private JTable table_6;
	private JTable table_7;
	private JTable table_8;
	private JTable table_9;
	private JTable table_10;
	private JTable table_11;
	private JTable table_12;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Codificaciones frame = new Codificaciones();
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
	public Codificaciones() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Codificaciones.class.getResource("/Pictures/car-icon2.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(90, 10, 1250, 740);
		contentPane = new JPanel();
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCodificaciones = new JLabel("CODIFICACIONES");
		lblCodificaciones.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblCodificaciones.setBackground(Color.LIGHT_GRAY);
		lblCodificaciones.setBounds(554, 0, 254, 27);
		contentPane.add(lblCodificaciones);
		
		JLabel lblNewLabel = new JLabel("\"USO DEL VEH\u00CDCULO\"");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel.setBounds(10, 24, 456, 27);
		contentPane.add(lblNewLabel);
		
		String[] columns ={" "," "};
		Object[][] data={
				{01,"ABARROTES"},
				{02,"ALCOHOLES"},
				{03,"ALIMENTOS VARIOS"},
				{04,"ANUNCIOS"},
				{05,"ARTICULOS DEPORTIVOS"},
				{05,"ARTICULOS PARA EL HOGAR"},
		};
		final JFrame frame=new JFrame("USO DEL VEH\u00CDCULO");
		table = new JTable(data,columns);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{new Integer(1), "ABARROTES"},
				{new Integer(2), "ALCOHOLES"},
				{new Integer(3), "ALIMENTOS VARIOS"},
				{new Integer(4), "ANUNCIOS"},
				{new Integer(5), "ARTICULOS DEPORTIVOS"},
				{"6", "ARTICULOS PARA EL HOGAR"},
				{"7", "AVES Y DERIVADOS"},
				{"8", "BANQUETES"},
				{"9", "BEBIDAS EMBOTELLADAS"},
				{"10", "CARNES Y DERIVADOS"},
				{"11", "COMBUSTIBLES"},
				{"12", "DESPERDICIOS INDUSTRIALES"},
				{"13", "EFECTIVO Y VALORES"},
				{"14", "ESCOLAR"},
				{"15", "FLORES"},
				{"16", "FLORES,FRUTAS, LEGUMBRES Y ABARROTES"},
				{"17", "FUNERARIOS"},
				{"18", "GANADO EN GENERAL"},
				{"19", "GAS"},
				{"20", "HERRERIA"},
				{"21", "HIELO"},
				{"22", "JARDINERIA SIM"},
				{"23", "LACTEOS Y DERIVADOS"},
				{"24", "LAVANDERIA Y TINTORERIA"},
				{"25", "LITOG. PAPELERIA"},
				{"26", "MAQUINARIA EN GENERAL"},
				{"27", "MATERIALES CONSTRUCCION"},
				{"28", "MATERIALES ELECTRICOS"},
				{"29", "MUDANZAS"},
			},
			new String[] {
				" ", " "
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(20);
		table.getColumnModel().getColumn(1).setPreferredWidth(198);
		table.setMinimumSize(new Dimension(18, 40));
		table.setPreferredSize(new Dimension(70, 40));
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBounds(20, 62, 241, 540);
		contentPane.add(table);
		
		table_1 = new JTable();
		table_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"30", "MUEBLES EN GENERAL"},
				{"31", "NUPCIAL"},
				{"32", "PAN Y SIMILARES"},
				{"33", "PARTICULAR"},
				{"34", "PAPEL INDUSTRIAL"},
				{"35", "PAPELERIA EN GENERAL"},
				{"36", "PALETERIA"},
				{"37", "PINTURA Y SIM"},
				{"38", "PLASTICOS"},
				{"39", "PRODUCTOS AGRICOLAS"},
				{"40", "PRODUCTOS FORESTALES"},
				{"41", "PRODUCTOS MARINOS"},
				{"42", "PRODUCTOS QUIMICOS"},
				{"43", "PULQUE"},
				{"44", "TEXTILES"},
				{"45", "TURITICOS"},
				{"46", "TRANSPORTE EN GENERAL"},
				{"47", "VIDRIERIA"},
				{"48", "VEHICULOS"},
				{"49", "OTROS"},
				{"50", "PASAJE"},
				{"51", "CARGA"},
			},
			new String[] {
				"", ""
			}
		));
		table_1.getColumnModel().getColumn(0).setPreferredWidth(34);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(146);
		table_1.setBounds(271, 62, 214, 352);
		contentPane.add(table_1);
		
		JLabel lblProcedencia = new JLabel("PROCEDENCIA");
		lblProcedencia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblProcedencia.setBounds(304, 425, 131, 27);
		contentPane.add(lblProcedencia);
		
		table_2 = new JTable();
		table_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{"1", "NACIONAL"},
				{"2", "REGULARIZADO"},
				{"3", "FRONTERIZO O IMPORTADO"},
			},
			new String[] {
				"", ""
			}
		));
		table_2.getColumnModel().getColumn(0).setPreferredWidth(30);
		table_2.getColumnModel().getColumn(1).setPreferredWidth(154);
		table_2.setBounds(271, 453, 214, 149);
		contentPane.add(table_2);
		
		JLabel label = new JLabel("\"USO DEL VEH\u00CDCULO\"");
		label.setVerticalTextPosition(SwingConstants.BOTTOM);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(504, 25, 456, 27);
		contentPane.add(label);
		
		table_3 = new JTable();
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
				{"11", "CONVERTIBLE"},
				{"12", "COUPE"},
				{"13", "JEEP"},
				{"14", "LIMOUSINE"},
				{"15", "SEDAN"},
				{"16", "SPORT"},
				{"17", "VAGONETA"},
				{"18", "NO ESPECIFICADO"},
				{"51", "MINIVAN"},
				{"52", "VAN"},
			},
			new String[] {
				"", ""
			}
		));
		table_3.getColumnModel().getColumn(0).setPreferredWidth(26);
		table_3.getColumnModel().getColumn(1).setPreferredWidth(127);
		table_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_3.setBounds(495, 73, 225, 160);
		contentPane.add(table_3);
		
		JLabel lblautomoviles = new JLabel("1. \"AUTOMOVILES\"");
		lblautomoviles.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblautomoviles.setBounds(531, 48, 142, 27);
		contentPane.add(lblautomoviles);
		
		JLabel lblcamiones = new JLabel("2. \"CAMIONES\"");
		lblcamiones.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblcamiones.setBounds(531, 237, 142, 27);
		contentPane.add(lblcamiones);
		
		table_4 = new JTable();
		table_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_4.setModel(new DefaultTableModel(
			new Object[][] {
				{"31", "AUTOTANQUE"},
				{"32", "CABINA"},
				{"33", "CAJA"},
				{"34", "CASETA"},
				{"35", "CELDILLAS"},
				{"36", "CHASIS"},
				{"37", "ESTACAS"},
				{"38", "MICROBUS"},
				{"39", "OMNIBUS"},
				{"40", "PANEL"},
				{"41", "PICK UP"},
				{"42", "PIPA"},
				{"43", "PLATAFORMA"},
				{"44", "REDILLAS CONVERTIBLE"},
				{"45", "REFRIGERADOR"},
				{"46", "TANQUE"},
				{"47", "TRACTOR"},
				{"48", "VANETTE"},
				{"49", "VOLTEO"},
				{"50", "NO ESPECIFICADO"},
				{"80", "MINIBUS"},
				{"81", "AUTOBUS"},
			},
			new String[] {
				"", ""
			}
		));
		table_4.getColumnModel().getColumn(0).setPreferredWidth(23);
		table_4.getColumnModel().getColumn(1).setPreferredWidth(127);
		table_4.setBounds(495, 258, 225, 352);
		contentPane.add(table_4);
		
		JTextPane txtpnimportanteAlAdquirir = new JTextPane();
		txtpnimportanteAlAdquirir.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnimportanteAlAdquirir.setText("\"IMPORTANTE: AL ADQUIRIR UN VEHICULO REGISTRELO A SU NOMBRE, AL COMPRAR O VENDER UN VEHICULO, ES OBLIGACION Y RESPONSABILIDAD DE LOS CONTRATANTES REALIZAR LOS TRAMITES CORRESPODIENTES DE CAMBIO DE PROPIETARIO ANTE LAS AUTORIDADES CORRESPONDIENTES (PLAZO 30 DIAS). AVISE OPORTUNAMENTE SU CAMBIO DE DOMICILIO (MISMO PLAZO). EL INCUMPLIMIENTO A ESTAS DISPOSICIONES SERA SANCIONADO DE CONFORMIDAD CON LAS NORAS LEGALES CORRESPONDIENTES, INDEPENDIENTEMENTE DE LA RESPONSABILIDAD CIVIL O PENAL QUE RESULTE\"");
		txtpnimportanteAlAdquirir.setBounds(51, 613, 1131, 78);
		contentPane.add(txtpnimportanteAlAdquirir);
		
		JLabel lblremolques = new JLabel("3. \"REMOLQUES\"");
		lblremolques.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblremolques.setBounds(771, 48, 142, 27);
		contentPane.add(lblremolques);
		
		table_5 = new JTable();
		table_5.setModel(new DefaultTableModel(
			new Object[][] {
				{"61", "CAJA "},
				{"62", "DOLLY"},
				{"63", "HABITACION"},
				{"64", "INDUSTRIAL"},
				{"65", "JAULA"},
				{"66", "PLATAFORMA"},
				{"67", "REFRIGERADOR"},
				{"68", "TANQUES(S) O(R)"},
				{"69", "NO ESPECIFICADO"},
			},
			new String[] {
				"", ""
			}
		));
		table_5.getColumnModel().getColumn(0).setPreferredWidth(32);
		table_5.getColumnModel().getColumn(1).setPreferredWidth(115);
		table_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_5.setBounds(730, 73, 254, 144);
		contentPane.add(table_5);
		
		JLabel lbldiversos = new JLabel("4. \"DIVERSOS\"");
		lbldiversos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbldiversos.setBounds(771, 220, 142, 27);
		contentPane.add(lbldiversos);
		
		table_6 = new JTable();
		table_6.setModel(new DefaultTableModel(
			new Object[][] {
				{"71", "AMBULANCIA"},
				{"72", "CARROZA"},
				{"73", "EQUIPO ESPECIAL"},
				{"74", "GRUAS"},
				{"75", "REVOLVEDORA"},
				{"76", "NO ESPECIFICADO"},
			},
			new String[] {
				"", ""
			}
		));
		table_6.getColumnModel().getColumn(0).setPreferredWidth(30);
		table_6.getColumnModel().getColumn(1).setPreferredWidth(124);
		table_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_6.setBounds(730, 245, 254, 96);
		contentPane.add(table_6);
		
		JLabel lblvehiculoOficial = new JLabel(" \"VEHICULO OFICIAL\"");
		lblvehiculoOficial.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblvehiculoOficial.setBounds(771, 344, 189, 27);
		contentPane.add(lblvehiculoOficial);
		
		table_7 = new JTable();
		table_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_7.setModel(new DefaultTableModel(
			new Object[][] {
				{"1", "GOBIERNO FEDERAL"},
				{"2", "GOBIERNO ESTATAL"},
				{"3", "GOBIERNO MUNICIPAL"},
			},
			new String[] {
				"", ""
			}
		));
		table_7.getColumnModel().getColumn(0).setPreferredWidth(27);
		table_7.getColumnModel().getColumn(1).setPreferredWidth(126);
		table_7.setBounds(730, 370, 254, 48);
		contentPane.add(table_7);
		
		JLabel lblUsoExclusivoDe = new JLabel("USO EXCLUSIVO DE LA S.C.T.");
		lblUsoExclusivoDe.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblUsoExclusivoDe.setBounds(740, 425, 244, 27);
		contentPane.add(lblUsoExclusivoDe);
		
		table_8 = new JTable();
		table_8.setModel(new DefaultTableModel(
			new Object[][] {
				{"00", "01", "02", "03", "04"},
				{"05", "06", "07", "08", "09"},
			},
			new String[] {
				"", "", "", "", ""
			}
		));
		table_8.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_8.setBounds(730, 453, 254, 32);
		contentPane.add(table_8);
		
		JLabel lblservicio = new JLabel("\"SERVICIO\"");
		lblservicio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblservicio.setBounds(1062, 48, 142, 27);
		contentPane.add(lblservicio);
		
		table_9 = new JTable();
		table_9.setModel(new DefaultTableModel(
			new Object[][] {
				{"1", "PARTICULAR"},
				{"2", "SERVICIO PUBLICO LOCAL"},
				{"3", "DIPLOMATICO Y CONSULAR"},
				{"4", "SERV. PUB. FEDERAL"},
				{"5", null},
			},
			new String[] {
				"", ""
			}
		));
		table_9.getColumnModel().getColumn(0).setPreferredWidth(35);
		table_9.getColumnModel().getColumn(1).setPreferredWidth(141);
		table_9.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_9.setBounds(994, 73, 230, 80);
		contentPane.add(table_9);
		
		JLabel lblcombustibles = new JLabel("\"COMBUSTIBLES\"");
		lblcombustibles.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblcombustibles.setBounds(1051, 156, 142, 27);
		contentPane.add(lblcombustibles);
		
		table_10 = new JTable();
		table_10.setModel(new DefaultTableModel(
			new Object[][] {
				{"1", "GASOLINA"},
				{"2", "GAS"},
				{"3", "DIESEL"},
				{"4", "OTROS"},
				{"5", "NO USA"},
				{"10", "ELETRICO"},
				{"11", "GAS NATURAL"},
			},
			new String[] {
				"", ""
			}
		));
		table_10.getColumnModel().getColumn(0).setPreferredWidth(35);
		table_10.getColumnModel().getColumn(1).setPreferredWidth(144);
		table_10.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_10.setBounds(994, 178, 230, 112);
		contentPane.add(table_10);
		
		JLabel lblmovimientos = new JLabel("\"MOVIMIENTOS\"");
		lblmovimientos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblmovimientos.setBounds(1051, 288, 142, 27);
		contentPane.add(lblmovimientos);
		
		table_11 = new JTable();
		table_11.setModel(new DefaultTableModel(
			new Object[][] {
				{"1", "ALTA"},
				{"2", "BAJA"},
				{"3", "SUBSTITUCION"},
				{"4", "CAMBIO DE PROPIETARIO"},
				{"5", "CAMBIO DE DOMICILIO"},
				{"6", "CAMBIO DE MOTOR"},
				{"7", "DUPLICADO"},
				{"8", "CAMBIO DE VEHICULO"},
				{"9", "CAMBIO DE SERVICIO"},
				{"10", "CAMBIO DE COLOR"},
				{"11", "CANJE O REFRENDO"},
				{"12", "REPOSICION TARJETA "},
				{null, "DE CIRCULACION"},
			},
			new String[] {
				"", ""
			}
		));
		table_11.getColumnModel().getColumn(0).setPreferredWidth(24);
		table_11.getColumnModel().getColumn(1).setPreferredWidth(133);
		table_11.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_11.setBounds(994, 311, 230, 208);
		contentPane.add(table_11);
		
		JLabel lbltaxis = new JLabel("\"TAXIS\"");
		lbltaxis.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbltaxis.setBounds(1082, 521, 142, 27);
		contentPane.add(lbltaxis);
		
		table_12 = new JTable();
		table_12.setModel(new DefaultTableModel(
			new Object[][] {
				{"1", "SIN INTERINARIO FIJO"},
				{"2", "RUTAS"},
				{"3", "SITIO"},
			},
			new String[] {
				"", ""
			}
		));
		table_12.getColumnModel().getColumn(0).setPreferredWidth(33);
		table_12.getColumnModel().getColumn(1).setPreferredWidth(127);
		table_12.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_12.setBounds(994, 553, 230, 49);
		contentPane.add(table_12);
	}
}
