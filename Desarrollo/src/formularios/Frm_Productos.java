package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.SwingConstants;
import javax.swing.JScrollBar;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;

public class Frm_Productos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame.setDefaultLookAndFeelDecorated(true);
					Frm_Productos frame = new Frm_Productos();
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
	public Frm_Productos() {
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Descripción de Productos");
		setBounds(400, 200, 500, 400);

		//Este método devuelve un objeto de clase Toolkit	
		Toolkit mipantalla=Toolkit.getDefaultToolkit();
		Dimension dimensionPantalla = mipantalla.getScreenSize();
		
		int alturaPantalla = dimensionPantalla.height;
		int anchoPantalla = dimensionPantalla.width;
		
		/**Se calcula para realizar el tamaño y posición del marco 
		 * que tenga el marco las medidas correspondientes a la mitad
		 *  de las medidas de mi pantalla.
		 */
		
		Panel_Formulario panelProductos = new Panel_Formulario("/photoruner.jpg");
		getContentPane().add(panelProductos);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frm_Galeria frmGaleria = new Frm_Galeria();
				frmGaleria.setVisible(true);
				dispose();
			}
		});
		btnVolver.setFont(new Font("Bodoni MT Black", Font.PLAIN, 14));
		btnVolver.setBounds(10, 312, 135, 23);
		panelProductos.add(btnVolver);
		
		JLabel lblDescProductos = new JLabel("Nuestros Productos");
		lblDescProductos.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescProductos.setForeground(Color.YELLOW);
		lblDescProductos.setFont(new Font("Bodoni MT Black", Font.PLAIN, 22));
		lblDescProductos.setBounds(31, 24, 443, 32);
		panelProductos.add(lblDescProductos);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(330, 186, 56, -83);
		panelProductos.add(scrollPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(225, 87, 228, 193);
		panelProductos.add(scrollPane_1);
		
		JTextArea textArea = new JTextArea();
		scrollPane_1.setViewportView(textArea);
		
		JPanel panel = new JPanel();
		panel.setBounds(31, 87, 164, 193);
		panelProductos.add(panel);
		
		JButton btnComprar = new JButton("Comprar");
		btnComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnComprar.setFont(new Font("Bodoni MT Black", Font.PLAIN, 14));
		btnComprar.setBounds(318, 312, 135, 23);
		panelProductos.add(btnComprar);
		
		Image miicono = mipantalla.getImage("src/formularios/809461.png");
	    setIconImage(miicono);
	    
		setVisible(true);		
	
	}
}

