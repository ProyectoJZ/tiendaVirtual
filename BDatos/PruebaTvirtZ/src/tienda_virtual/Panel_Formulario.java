/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda_virtual;

/**
 *
 * @author Trabajo
 */
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Panel_Formulario extends JPanel {
	
		ImageIcon imagen;
		String nombre;
		
		public Panel_Formulario(String nombre) {
			this.nombre = nombre;
			
			setLayout(null);
			 
		}
		
		public void paint(Graphics g) {
			Dimension tamanio = getSize();
			imagen = new ImageIcon(getClass().getResource(nombre));
			g.drawImage(imagen.getImage(), 0, 0, tamanio.width, tamanio.height, null);
			setOpaque(false);
			super.paint(g);
		}

}
