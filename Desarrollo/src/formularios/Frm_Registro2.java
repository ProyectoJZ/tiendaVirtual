package formularios;

import java.awt.EventQueue;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;

//import gráficos.Lamina_radio.Evento_radio;

import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frm_Registro2 extends JFrame {

	private JPanel contentPane;
	private JTextField txfNombre;
	private JTextField txfApellido;
	private JTextField txfFechaNaci;
	private JTextField txfTelefono;
	private JTextField textField_4;
	private JTextField txfCorreo;
	private JTextField txfDireccion;
	private JTextField txfMonicipio;
	private JTextField txfProvincia;
	private JTextField textCdpostal;
	private JTextField txfBic;
	private JTextField txfIban;
	private JTextField textField_2;
	private JTextField txfBanco;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame.setDefaultLookAndFeelDecorated(true);
					Frm_Registro2 frame = new Frm_Registro2();

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
	public Frm_Registro2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 200, 578, 435);
		setTitle("Registro de Personas");
		
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		Image miicono = mipantalla.getImage("src/formularios/809461.png");
	    setIconImage(miicono);
	    
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
		setContentPane(contentPane);
	 
	    
	    JTabbedPane tabbePane=new JTabbedPane();  
	    tabbePane.setBounds(0,0,562, 385);  
	    
	    contentPane.add(tabbePane);  
	    
	    JPanel datosPersona=new JPanel();
	    datosPersona.setToolTipText("Datos personales");
	    datosPersona.setBackground(SystemColor.inactiveCaption);
	    tabbePane.add("Datos Persona",datosPersona);
	    
	    tabbePane.setToolTipTextAt(0, "Datos Personales Cliente");
	    
		Panel_Formulario panelRegistro = new Panel_Formulario("/photoruner.jpg");
		getContentPane().add(panelRegistro);
		

	    JLabel lblNombre = new JLabel("Nombre ...:");
	    lblNombre.setFont(new Font("SansSerif", Font.BOLD, 13));
	    
	    JLabel lblApellidos = new JLabel("Apellidos ...:");
	    lblApellidos.setFont(new Font("SansSerif", Font.BOLD, 13));
	    
	    JLabel lbDireccion = new JLabel(" Direccion ...:");
	    lbDireccion.setFont(new Font("SansSerif", Font.BOLD, 13));
	    
	    JLabel lblMunicipio = new JLabel("Municipio ...:");
	    lblMunicipio.setFont(new Font("SansSerif", Font.BOLD, 13));
	    
	    JLabel lblProvicia = new JLabel("Provicia ...:");
	    lblProvicia.setFont(new Font("SansSerif", Font.BOLD, 13));
	    
	    JLabel lblFechaNaci = new JLabel("Fecha Nacimiento ...:");
	    lblFechaNaci.setToolTipText("dd/mm/aaaa");
	    lblFechaNaci.setFont(new Font("SansSerif", Font.BOLD, 13));
	    
	    JLabel lblTelefono = new JLabel("Tel\u00E9fono ...:");
	    lblTelefono.setFont(new Font("SansSerif", Font.BOLD, 13));
	    
	    JLabel lblCorreoEle = new JLabel("Correo Electr\u00F3nico ...:");
	    lblCorreoEle.setFont(new Font("SansSerif", Font.BOLD, 13));
	    
	    JLabel lblDispostal = new JLabel("Dto.Postal ...:");
	    lblDispostal.setFont(new Font("SansSerif", Font.BOLD, 13));
	    
	    txfNombre = new JTextField();
	    txfNombre.setColumns(10);
	    
	    txfApellido = new JTextField();
	    txfApellido.setColumns(10);
	    
	    txfFechaNaci = new JTextField();
	    txfFechaNaci.setColumns(10);
	    
	    txfTelefono = new JTextField();
	    txfTelefono.setColumns(10);
	    
		//Creamos el objeto de la ButtonGroup que servirá para agrupar los botones.
		ButtonGroup grupoRadio = new ButtonGroup();
	    
	    JRadioButton rdbtnMujer = new JRadioButton("Mujer");
	    rdbtnMujer.setFont(new Font("SansSerif", Font.BOLD, 13));
	    
	    JRadioButton rdbtnVaron = new JRadioButton("Hombre");
	    rdbtnVaron.setFont(new Font("SansSerif", Font.BOLD, 13));
	    
		/*Añadimos los botones al objeto grupoRadio, con lo que quedan agrupado
		 * los botones.
		 */

	    rdbtnMujer.addActionListener(new Evento_radio());
	    rdbtnVaron.addActionListener(new Evento_radio());

		grupoRadio.add(rdbtnMujer);
		grupoRadio.add(rdbtnVaron);
	    
	    textField_4 = new JTextField();
	    textField_4.setColumns(10);
	    
	    txfCorreo = new JTextField();
	    txfCorreo.setColumns(10);
	    
	    txfDireccion = new JTextField();
	    txfDireccion.setColumns(10);
	    
	    txfMonicipio = new JTextField();
	    txfMonicipio.setColumns(10);
	    
	    txfProvincia = new JTextField();
	    txfProvincia.setColumns(10);
	    
	    textCdpostal = new JTextField();
	    textCdpostal.setColumns(10);
	    
	    JButton btnRegresar = new JButton("Volver");
	    btnRegresar.setFont(new Font("SansSerif", Font.BOLD, 13));
	    btnRegresar.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
				//Frm_Inicio inicio = new Frm_Inicio();
				//inicio.setVisible(true);
				dispose();
	    	}
	    });
	    
	    JButton btnAceptar = new JButton("Aceptar");
	    btnAceptar.setFont(new Font("SansSerif", Font.BOLD, 13));
	    btnAceptar.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {

	    		
	    	}
	    });
	    
	    JButton btnCancelar = new JButton("Cancelar");
	    btnCancelar.setFont(new Font("SansSerif", Font.BOLD, 13));
	    
	    GroupLayout gl_datosPersona = new GroupLayout(datosPersona);
	    
	    gl_datosPersona.setHorizontalGroup(
	    	gl_datosPersona.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_datosPersona.createSequentialGroup()
	    			.addGap(61)
	    			.addGroup(gl_datosPersona.createParallelGroup(Alignment.TRAILING)
	    				.addGroup(gl_datosPersona.createSequentialGroup()
	    					.addComponent(lblMunicipio)
	    					.addGap(18)
	    					.addComponent(txfMonicipio, GroupLayout.PREFERRED_SIZE, 320, GroupLayout.PREFERRED_SIZE))
	    				.addGroup(gl_datosPersona.createParallelGroup(Alignment.LEADING)
	    					.addGroup(gl_datosPersona.createSequentialGroup()
	    						.addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
	    						.addPreferredGap(ComponentPlacement.RELATED)
	    						.addComponent(txfNombre, GroupLayout.PREFERRED_SIZE, 320, GroupLayout.PREFERRED_SIZE))
	    					.addGroup(gl_datosPersona.createSequentialGroup()
	    						.addComponent(lbDireccion, GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
	    						.addPreferredGap(ComponentPlacement.RELATED)
	    						.addComponent(txfDireccion, GroupLayout.PREFERRED_SIZE, 320, GroupLayout.PREFERRED_SIZE))
	    					.addGroup(gl_datosPersona.createSequentialGroup()
	    						.addComponent(lblApellidos, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
	    						.addPreferredGap(ComponentPlacement.RELATED)
	    						.addComponent(txfApellido, GroupLayout.PREFERRED_SIZE, 320, GroupLayout.PREFERRED_SIZE))
	    					.addGroup(gl_datosPersona.createSequentialGroup()
	    						.addComponent(lblCorreoEle, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
	    						.addPreferredGap(ComponentPlacement.RELATED)
	    						.addComponent(txfCorreo, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE))
	    					.addGroup(gl_datosPersona.createSequentialGroup()
	    						.addGroup(gl_datosPersona.createParallelGroup(Alignment.LEADING)
	    							.addGroup(gl_datosPersona.createSequentialGroup()
	    								.addComponent(lblFechaNaci, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
	    								.addPreferredGap(ComponentPlacement.RELATED)
	    								.addComponent(txfFechaNaci, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
	    							.addGroup(gl_datosPersona.createSequentialGroup()
	    								.addComponent(lblTelefono, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
	    								.addPreferredGap(ComponentPlacement.RELATED)
	    								.addComponent(txfTelefono, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)))
	    						.addPreferredGap(ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
	    						.addGroup(gl_datosPersona.createParallelGroup(Alignment.LEADING)
	    							.addComponent(rdbtnMujer)
	    							.addComponent(rdbtnVaron, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)))
	    					.addGroup(gl_datosPersona.createSequentialGroup()
	    						.addGroup(gl_datosPersona.createParallelGroup(Alignment.TRAILING, false)
	    							.addComponent(btnRegresar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	    							.addComponent(lblProvicia, GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
	    						.addGroup(gl_datosPersona.createParallelGroup(Alignment.LEADING)
	    							.addGroup(gl_datosPersona.createSequentialGroup()
	    								.addPreferredGap(ComponentPlacement.RELATED)
	    								.addComponent(txfProvincia, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE))
	    							.addGroup(Alignment.TRAILING, gl_datosPersona.createSequentialGroup()
	    								.addGap(94)
	    								.addComponent(btnCancelar)))
	    						.addGroup(gl_datosPersona.createParallelGroup(Alignment.LEADING)
	    							.addGroup(gl_datosPersona.createSequentialGroup()
	    								.addPreferredGap(ComponentPlacement.RELATED)
	    								.addComponent(lblDispostal, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
	    								.addPreferredGap(ComponentPlacement.RELATED)
	    								.addComponent(textCdpostal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    							.addGroup(Alignment.TRAILING, gl_datosPersona.createSequentialGroup()
	    								.addGap(57)
	    								.addComponent(btnAceptar))))))
	    			.addGap(734)
	    			.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 320, GroupLayout.PREFERRED_SIZE)
	    			.addContainerGap())
	    );
	    gl_datosPersona.setVerticalGroup(
	    	gl_datosPersona.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_datosPersona.createSequentialGroup()
	    			.addContainerGap(201, Short.MAX_VALUE)
	    			.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    			.addGap(136))
	    		.addGroup(gl_datosPersona.createSequentialGroup()
	    			.addGap(25)
	    			.addGroup(gl_datosPersona.createParallelGroup(Alignment.LEADING)
	    				.addGroup(gl_datosPersona.createSequentialGroup()
	    					.addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
	    					.addGap(11)
	    					.addComponent(lblApellidos, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
	    				.addGroup(gl_datosPersona.createSequentialGroup()
	    					.addComponent(txfNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    					.addPreferredGap(ComponentPlacement.UNRELATED)
	    					.addComponent(txfApellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
	    			.addPreferredGap(ComponentPlacement.UNRELATED)
	    			.addGroup(gl_datosPersona.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(lblFechaNaci, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(txfFechaNaci, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(rdbtnVaron, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
	    			.addPreferredGap(ComponentPlacement.UNRELATED)
	    			.addGroup(gl_datosPersona.createParallelGroup(Alignment.LEADING)
	    				.addGroup(gl_datosPersona.createSequentialGroup()
	    					.addGroup(gl_datosPersona.createParallelGroup(Alignment.BASELINE)
	    						.addComponent(lblTelefono, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(txfTelefono, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    					.addPreferredGap(ComponentPlacement.UNRELATED)
	    					.addGroup(gl_datosPersona.createParallelGroup(Alignment.BASELINE)
	    						.addComponent(lblCorreoEle, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(txfCorreo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    					.addGap(21)
	    					.addGroup(gl_datosPersona.createParallelGroup(Alignment.BASELINE)
	    						.addComponent(lbDireccion, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(txfDireccion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    					.addGap(11)
	    					.addGroup(gl_datosPersona.createParallelGroup(Alignment.BASELINE)
	    						.addComponent(lblMunicipio, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(txfMonicipio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
	    				.addComponent(rdbtnMujer))
	    			.addPreferredGap(ComponentPlacement.RELATED)
	    			.addGroup(gl_datosPersona.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(lblProvicia, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(lblDispostal, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(txfProvincia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(textCdpostal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    			.addPreferredGap(ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
	    			.addGroup(gl_datosPersona.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(btnRegresar)
	    				.addComponent(btnAceptar)
	    				.addComponent(btnCancelar))
	    			.addContainerGap())
	    );
	    datosPersona.setLayout(gl_datosPersona);
	    JPanel datosBanco=new JPanel();  
	    
	    tabbePane.add("Datos Banco",datosBanco);
	    
	    JLabel lblCodCliente = new JLabel("Identificaci\u00F3n Cliente ....");
	    lblCodCliente.setFont(new Font("SansSerif", Font.BOLD, 13));
	    
	    JLabel lblBic = new JLabel("BIC ....");
	    lblBic.setFont(new Font("SansSerif", Font.BOLD, 13));
	    
	    JLabel lblIban = new JLabel("IBAN ....");
	    lblIban.setFont(new Font("SansSerif", Font.BOLD, 13));
	    
	    JLabel lblBanco = new JLabel("BANCO ..");
	    lblBanco.setFont(new Font("SansSerif", Font.BOLD, 13));
	    
	    JLabel lblFechaCaducidad = new JLabel("Fcha. Caducidad :");
	    lblFechaCaducidad.setFont(new Font("SansSerif", Font.BOLD, 13));
	    
	    txfBic = new JTextField();
	    txfBic.setColumns(10);
	    
	    txfIban = new JTextField();
	    txfIban.setColumns(10);
	    
	    textField_2 = new JTextField();
	    textField_2.setColumns(10);
	    
	    txfBanco = new JTextField();
	    txfBanco.setColumns(10);
	    
	    textField_5 = new JTextField();
	    textField_5.setColumns(10);
	    
	    JButton btnCancelBanco = new JButton("Salir");
	    btnCancelBanco.setFont(new Font("SansSerif", Font.BOLD, 13));
	    
	    JButton btnAceptarBanco = new JButton("Grabar");
	    btnAceptarBanco.setFont(new Font("SansSerif", Font.BOLD, 13));
	    btnAceptarBanco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		}); 
	    GroupLayout gl_datosBanco = new GroupLayout(datosBanco);
	    gl_datosBanco.setHorizontalGroup(
	    	gl_datosBanco.createParallelGroup(Alignment.TRAILING)
	    		.addGroup(gl_datosBanco.createSequentialGroup()
	    			.addContainerGap(23, Short.MAX_VALUE)
	    			.addGroup(gl_datosBanco.createParallelGroup(Alignment.LEADING)
	    				.addGroup(gl_datosBanco.createSequentialGroup()
	    					.addComponent(lblCodCliente, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
	    					.addPreferredGap(ComponentPlacement.UNRELATED)
	    					.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE))
	    				.addGroup(gl_datosBanco.createSequentialGroup()
	    					.addGroup(gl_datosBanco.createParallelGroup(Alignment.LEADING)
	    						.addComponent(lblBic, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(lblIban, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
	    					.addGap(18)
	    					.addGroup(gl_datosBanco.createParallelGroup(Alignment.LEADING)
	    						.addGroup(gl_datosBanco.createSequentialGroup()
	    							.addComponent(txfBic, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    							.addGap(39)
	    							.addComponent(lblBanco, GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
	    						.addComponent(txfIban, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE))
	    					.addPreferredGap(ComponentPlacement.RELATED)
	    					.addGroup(gl_datosBanco.createParallelGroup(Alignment.TRAILING)
	    						.addGroup(gl_datosBanco.createSequentialGroup()
	    							.addComponent(lblFechaCaducidad)
	    							.addPreferredGap(ComponentPlacement.RELATED)
	    							.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE))
	    						.addComponent(txfBanco, GroupLayout.PREFERRED_SIZE, 253, GroupLayout.PREFERRED_SIZE))))
	    			.addGap(23))
	    		.addGroup(gl_datosBanco.createSequentialGroup()
	    			.addGap(38)
	    			.addComponent(btnCancelBanco, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
	    			.addPreferredGap(ComponentPlacement.RELATED, 261, Short.MAX_VALUE)
	    			.addComponent(btnAceptarBanco, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
	    			.addGap(72))
	    );
	    gl_datosBanco.setVerticalGroup(
	    	gl_datosBanco.createParallelGroup(Alignment.LEADING)
	    		.addGroup(gl_datosBanco.createSequentialGroup()
	    			.addGap(100)
	    			.addGroup(gl_datosBanco.createParallelGroup(Alignment.LEADING)
	    				.addComponent(lblCodCliente, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    			.addGap(18)
	    			.addGroup(gl_datosBanco.createParallelGroup(Alignment.LEADING)
	    				.addComponent(lblBic, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(txfBic, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(lblBanco, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(txfBanco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    			.addGap(22)
	    			.addGroup(gl_datosBanco.createParallelGroup(Alignment.LEADING)
	    				.addComponent(lblIban, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(txfIban, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(lblFechaCaducidad, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(textField_5, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    			.addPreferredGap(ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
	    			.addGroup(gl_datosBanco.createParallelGroup(Alignment.LEADING)
	    				.addComponent(btnAceptarBanco)
	    				.addComponent(btnCancelBanco))
	    			.addGap(40))
	    );
	    datosBanco.setLayout(gl_datosBanco);
	    contentPane.setSize(400,400);  
	    contentPane.setLayout(null);  
	    contentPane.setVisible(true);  
	}
	
	//Clase oyente que debe implementar la interface ActionListener
	private class Evento_radio implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
				
			//Aquí realizamos el tratamiento de los botónes. 
			//Con el método getSource obtenemos el objeto tratado (aquí los botones).
		/*	if(e.getSource()==rdbtnMujer) {
				size += 10;
			}else if(e.getSource()==rdbtnVaron) {
				size += 16;
			}*/
			
			//Modificamos el tamaño del tipo de texto tratado.
			//texto.setFont(new Font("Serif", Font.PLAIN, size));
		}
	}
}
