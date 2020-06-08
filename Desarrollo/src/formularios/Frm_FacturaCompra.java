package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class Frm_FacturaCompra extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frm_FacturaCompra frame = new Frm_FacturaCompra();
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
	public Frm_FacturaCompra() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 549, 350);
		setTitle("Formulario Facturas");
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		Image miicono = mipantalla.getImage("src/formularios/809461.png");
	    setIconImage(miicono);
	    
		Panel_Formulario panelFactura = new Panel_Formulario("/photoruner.jpg");
		getContentPane().add(panelFactura);
		
		JLabel lblInformacinDeProductos = new JLabel("Informaci\u00F3n de los Productos facturados");
		lblInformacinDeProductos.setHorizontalAlignment(SwingConstants.CENTER);
		lblInformacinDeProductos.setForeground(Color.WHITE);
		lblInformacinDeProductos.setFont(new Font("Bodoni MT Black", Font.BOLD, 18));
		lblInformacinDeProductos.setBounds(21, 11, 492, 32);
		panelFactura.add(lblInformacinDeProductos);
		
		JLabel lblProducto = new JLabel("Codigo del producto ");
		lblProducto.setForeground(Color.WHITE);
		lblProducto.setFont(new Font("Bodoni MT Black", Font.PLAIN, 13));
		lblProducto.setBounds(31, 54, 187, 26);
		panelFactura.add(lblProducto);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(189, 57, 86, 20);
		panelFactura.add(textField);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(377, 56, 89, 23);
		panelFactura.add(btnBuscar);
		
		JLabel lblNombreDelProducto = new JLabel("Nombre del producto ");
		lblNombreDelProducto.setForeground(Color.WHITE);
		lblNombreDelProducto.setFont(new Font("Bodoni MT Black", Font.PLAIN, 13));
		lblNombreDelProducto.setBounds(31, 88, 159, 26);
		panelFactura.add(lblNombreDelProducto);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(189, 91, 171, 20);
		panelFactura.add(textField_1);
		
		JLabel lblTipoDelProducto = new JLabel("Tipo del producto ");
		lblTipoDelProducto.setForeground(Color.WHITE);
		lblTipoDelProducto.setFont(new Font("Bodoni MT Black", Font.PLAIN, 13));
		lblTipoDelProducto.setBounds(31, 125, 148, 26);
		panelFactura.add(lblTipoDelProducto);
		
		JComboBox jcbProducto = new JComboBox();
		jcbProducto.setEditable(true);
		jcbProducto.setBounds(189, 125, 109, 22);
		panelFactura.add(jcbProducto);
		
		table = new JTable();
		table.setBounds(45, 176, 421, 102);
		panelFactura.add(table);
		setVisible(true);
	}
}
