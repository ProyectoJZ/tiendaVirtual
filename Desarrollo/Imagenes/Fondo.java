import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;



public class Fondo extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FondoPantalla mimarco = new FondoPantalla("/photoruner.jpg");
			//mimarco. .setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}
}

class FondoPantalla implements Border {

	private BufferedImage mImagen = null;
	
	/**
	 * Create the frame.
	 */
	public FondoPantalla(String ruta) throws IOException {
		mImagen = ImageIO.read(new File(ruta));
	}

	public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
		if (mImagen != null) {
			g.drawImage(mImagen, 0, 0, width, height, null);
		}
	}
	
	public Insets getBorderInsets(Component c) {
		return new Insets(0,0,0,0);
	}
	
	public boolean isBorderOpaque() {
		return(true);
	}
	
	public void setBorder(JFrame frame) {
		JPanel panel = (JPanel) frame.getContentPane();
		panel.setBorder(this);
	}
}
