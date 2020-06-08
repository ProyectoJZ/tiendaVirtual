package formularios;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class Frm_Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame.setDefaultLookAndFeelDecorated(true);
		Marco_inicio marcoinicio   = new Marco_inicio();
		marcoinicio.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}
}

class Marco_inicio extends JFrame{

	public Marco_inicio() {

		setTitle("Descripción de Productos");
		setBounds(350, 150, 700, 500);
		Lamina_inicio laminainicio = new Lamina_inicio();
		add(laminainicio);
		setVisible(true);
	}
}	

class Lamina_inicio extends JPanel {

	public Lamina_inicio() {
		/*
		 * Realizaremos la  distribución en la lamina.
		 */
		setLayout(new BorderLayout());

		//Agregamos el boton a la lamina en función de su disposición.
		add(new Lamina_menu(),BorderLayout.NORTH);
		add(new Lamina_botones(),BorderLayout.WEST);
		add(new Lamina_topPanel(),BorderLayout.SOUTH);
		add(new LaminaConImagen(),BorderLayout.CENTER); 
		add(new Lamina_Password(),BorderLayout.EAST);
		
		
	}

}

class Lamina_menu extends JPanel{

	public Lamina_menu() {

		setLayout(new BorderLayout());

		JMenuBar mibarra = new JMenuBar();

		JMenu archivo = new JMenu("Archivo");
		JMenu edicion = new JMenu("Edición");
		JMenu herramientas = new JMenu("Herramientas");
		JMenu usuarios = new JMenu("Usuarios");

		JMenuItem guardar = new JMenuItem("Guardar");
		JMenuItem guardarcomo = new JMenuItem("Guardar como");

		archivo.add(guardar);
		archivo.add(guardarcomo);

		JMenuItem cortar = new JMenuItem("Cortar", new ImageIcon("bin/gráficos/th2.jpg"));
		JMenuItem copiar = new JMenuItem("Copiar", new ImageIcon("bin/gráficos/th5F8SX4AM.jpg"));

		//Con esta instrucción nos permite poner el texto antes que la imagen
		//copiar.setHorizontalTextPosition(SwingConstants.LEFT);

		JMenuItem pegar = new JMenuItem("Pegar", new ImageIcon("bin/gráficos/th9YJGWVKW.jpg"));

		edicion.add(cortar);
		edicion.add(copiar);
		edicion.add(pegar);

		JMenuItem generales = new JMenuItem("Generales");
		JMenuItem usuario1 = new JMenuItem("Usuario1");
		JMenuItem usuario2 = new JMenuItem("Usuario2");

		herramientas.add(generales);
		herramientas.addSeparator();
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		herramientas.add(usuarios);

		mibarra.add(archivo);
		mibarra.add(edicion);
		mibarra.add(herramientas);

		add(mibarra);
	}
}

class Lamina_botones extends JPanel{

	JPanel botones_lateral;

	public Lamina_botones(){

		botones_lateral = new JPanel();

		botones_lateral.setLayout(new BoxLayout(botones_lateral, BoxLayout.Y_AXIS));
		botones_lateral.setBorder(new LineBorder(Color.BLACK, 1));

		for (int i = 0; i < 4; i++) {
			botones_lateral.add(new JButton("Botonl" +(i+1))); 
		}

		add(botones_lateral);

	}
}

class Lamina_topPanel extends JPanel{

	public Lamina_topPanel() {

		JPanel topPanel = new JPanel();
		topPanel.setBorder(new LineBorder(Color.BLACK));
		topPanel.setLayout(new FlowLayout(5));

		JButton jbtsalir = new JButton("Salir");
		jbtsalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				}
		});
		JButton jbtcontinuar = new JButton("Continuar");

		Insets margenes = topPanel.getInsets();
		Dimension tam = jbtsalir.getPreferredSize();
		jbtsalir.setBounds(90 + margenes.left, 269 + margenes.top, tam.width, tam.height);

		tam = jbtcontinuar.getPreferredSize();
		jbtcontinuar.setBounds(150 + margenes.left, 269 + margenes.top, tam.width, tam.height);

		margenes = topPanel.getInsets();
		topPanel.setSize(300 + margenes.left + margenes.right, 125 + margenes.top + margenes.bottom);

		topPanel.add(jbtsalir);
		topPanel.add(jbtcontinuar);
		add(topPanel);

	}

}

class LaminaConImagen extends JPanel {

	private Image imagen; 

	public LaminaConImagen() {

		JLabel lblInicio = new JLabel("Productos Deportivos RUNNER");
		lblInicio.setHorizontalAlignment(SwingConstants.CENTER);
		lblInicio.setForeground(Color.YELLOW);
		lblInicio.setFont(new Font("Bodoni MT Black", Font.PLAIN, 22));
		lblInicio.setBounds(31, 24, 443, 32);
		add(lblInicio);
	}

	public void paintComponent(Graphics g) {

		imagen = new ImageIcon(getClass().getResource("/photoruner.jpg")).getImage();
		g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
		setOpaque(false);
		super.paintComponent(g);
	}
}

class Lamina_Password extends JPanel{

	public Lamina_Password() {

		JPanel pswPanel = new JPanel();
		pswPanel.setBounds(150, 150, 100, 150);
		pswPanel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		pswPanel.setLayout(new BoxLayout(pswPanel,BoxLayout.Y_AXIS));

		JLabel lblSesiRegi = new JLabel("<html>Iniciar Sesion/<p>registrase<p></html>");
		lblSesiRegi.setHorizontalAlignment(JLabel.CENTER);
		lblSesiRegi.setFont(new Font("Verdana", Font.BOLD, 12));
		lblSesiRegi.setForeground(Color.BLACK);
		//lblInicio.setBounds(31, 24, 443, 32);
		pswPanel.add(lblSesiRegi);

		JLabel jlbusuario = new JLabel("<html><p>Usuario</html>");
		jlbusuario.setHorizontalAlignment(JLabel.CENTER);
		jlbusuario.setFont(new Font("Verdana", Font.BOLD, 12));
		jlbusuario.setForeground(Color.BLACK);
		jlbusuario.setToolTipText("Introduzca su usuario");
		//jlbusuario.setBounds(15, 5, 100, 60);
		pswPanel.add(jlbusuario); 

		JTextField jtfusuario = new JTextField(15);
		//jtfusuario.setBounds(170, 5, 100, 60);
		pswPanel.add(jtfusuario);
		jtfusuario.setColumns(10);

		JLabel jlbpassword = new JLabel("<html><p>Password</html>");
		jlbpassword.setHorizontalAlignment(JLabel.CENTER);
		jlbpassword.setFont(new Font("Verdana", Font.BOLD, 12));
		jlbpassword.setForeground(Color.BLACK);
		jlbpassword.setToolTipText("Introduzca su Password");
		//jlbpassword.setBounds(15, 75, 100, 60);
		pswPanel.add(jlbpassword);

		jpfpassword = new JPasswordField(8);
		//jpfpassword.setBounds(170, 75, 100, 60);
		pswPanel.add(jpfpassword); 
		jpfpassword.setColumns(10);

		JButton jbtcomprobar = new JButton("Comprobar");
		jbtcomprobar.setVerticalAlignment(JButton.CENTER);
		//jbtcomprobar.setBounds(200, 150, 250, 50);
		pswPanel.add(jbtcomprobar);

		JLabel jlbRegistro = new JLabel("Introduce tus datos");
		jlbRegistro.setHorizontalAlignment(JLabel.LEFT);
		jlbRegistro.setFont(new Font("Verdana", Font.BOLD, 12));
		jlbRegistro.setForeground(Color.BLACK);
		jlbRegistro.setToolTipText("Datos nuevo registro");
		//jlbpassword.setBounds(15, 75, 100, 60);
		pswPanel.add(jlbRegistro);

		jbtRegistro = new JButton("Registrame");
		jbtRegistro.setVerticalAlignment(JButton.CENTER);
		//jbtcomprobar.setBounds(200, 150, 250, 50);
		jbtRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			//	if(!jcbProducto.isEnabled()) {
					Frm_Registro2 registros = new Frm_Registro2();
					registros.setVisible(true);
				}
		});
		pswPanel.add(jbtRegistro);

		Insets margenes = pswPanel.getInsets();
		Dimension tam = jlbusuario.getPreferredSize();
		jlbusuario.setBounds(25 + margenes.left, 15 + margenes.top, tam.width, tam.height);
		tam = jtfusuario.getPreferredSize();
		jtfusuario.setBounds(170 + margenes.left, 15 + margenes.top, tam.width, tam.height);

		tam = jlbpassword.getPreferredSize();
		jlbpassword.setBounds(25 + margenes.left, 75 + margenes.top, tam.width, tam.height);
		tam = jpfpassword.getPreferredSize();
		jpfpassword.setBounds(170 + margenes.left, 75 + margenes.top, tam.width, tam.height);

		tam = jbtcomprobar.getPreferredSize();
		jbtcomprobar.setBounds(25 + margenes.left, 150 + margenes.top, tam.width, tam.height);

		tam = jlbRegistro.getPreferredSize();
		jlbRegistro.setBounds(25 + margenes.left, 175 + margenes.top, tam.width, tam.height);
		tam = jbtRegistro.getPreferredSize();
		jbtRegistro.setBounds(170 + margenes.left, 175 + margenes.top, tam.width, tam.height);


		margenes = pswPanel.getInsets();
		pswPanel.setSize(300 + margenes.left + margenes.right, 125 + margenes.top + margenes.bottom);

		add(pswPanel);

		//Creamos una instancia de la clase oyente  
		Comprueba_Pass el_evento = new Comprueba_Pass();

		//Ahora lo que se realizar es poner a la escucha el jpfpassword.
		jpfpassword.getDocument().addDocumentListener(el_evento);
		

	}

	//Clase oyente y receptara del evento que implementa la interface DocumentListener.
	private class Comprueba_Pass implements DocumentListener  {

		@Override
		public void insertUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub

			char [] contrasena;
			//Devuelve el texto contenido en este TextComponent
			contrasena = jpfpassword.getPassword();

			if(contrasena.length < 8 || contrasena.length > 12) {
				//Establecemos el color de fondo de este componente.				
				jpfpassword.setBackground(Color.RED);
			} else {
				jpfpassword.setBackground(Color.WHITE);
			}

		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			char [] contrasena;
			contrasena = jpfpassword.getPassword();

			if(contrasena.length < 8 || contrasena.length > 12) {
				jpfpassword.setBackground(Color.RED);
			} else {
				jpfpassword.setBackground(Color.WHITE);
			} 
		}

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub

		}
	}
	
	//Referencia del objeto de tipo JPasswordField .
	private JPasswordField jpfpassword; 
	private JButton jbtRegistro;


}
