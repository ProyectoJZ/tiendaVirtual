/*
 * To change this li    @Override
    public int getWidth(ImageObserver io) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getHeight(ImageObserver io) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ImageProducer getSource() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Graphics getGraphics() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getProperty(String string, ImageObserver io) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
cense header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda_virtual;

import java.awt.Image;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Trabajo
 */
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import tienda_virtual.Panel_Formulario;

public class Frm_ConsultaProductos extends javax.swing.JFrame {

    Panel_Formulario panelConsulta = new Panel_Formulario("/Imagenes/photoruner.jpg");

    /**
     * Creates new form Frm_ConsultaDos
     */
    public Frm_ConsultaProductos() {
        contentPane = new JPanel();
        this.getContentPane().add(panelConsulta);
        this.setContentPane(contentPane);

        initComponents();
        miIniComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLbCodigoPro = new javax.swing.JLabel();
        jtfCodProducto = new javax.swing.JTextField();
        jlbNombrePro = new javax.swing.JLabel();
        jtfNomProducto = new javax.swing.JTextField();
        jlbTipoPro = new javax.swing.JLabel();
        jtfTipoProducto = new javax.swing.JTextField();
        jbtnConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProductos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consulta Productos");
        setName("jfmConProducto"); // NOI18N

        jPanel1.setName("jpnConProductos"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Broadway BT", 1, 20)); // NOI18N
        jLabel1.setText("Información de los Productos");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setName("jlbTitulo"); // NOI18N

        jLbCodigoPro.setFont(new java.awt.Font("Broadway BT", 1, 12)); // NOI18N
        jLbCodigoPro.setText("Codigo Producto ");
        jLbCodigoPro.setName("jlbCodProducto"); // NOI18N

        jtfCodProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        jtfCodProducto.setName("jtfCodProducto"); // NOI18N
        jtfCodProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCodProductoActionPerformed(evt);
            }
        });

        jlbNombrePro.setFont(new java.awt.Font("Broadway BT", 1, 12)); // NOI18N
        jlbNombrePro.setText("Nombre Producto");
        jlbNombrePro.setName("jlbNomProducto"); // NOI18N

        jtfNomProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153)));
        jtfNomProducto.setName("jtfNomProducto"); // NOI18N
        jtfNomProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNomProductoActionPerformed(evt);
            }
        });

        jlbTipoPro.setFont(new java.awt.Font("Broadway BT", 1, 12)); // NOI18N
        jlbTipoPro.setText("Tipo Producto");
        jlbTipoPro.setName("jlbTipProducto"); // NOI18N

        jtfTipoProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153)));
        jtfTipoProducto.setName("jtfTipProducto"); // NOI18N

        jbtnConsultar.setFont(new java.awt.Font("Broadway", 1, 12)); // NOI18N
        jbtnConsultar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 153), null, null));
        jbtnConsultar.setLabel("Consultar");
        jbtnConsultar.setName("jbtBuscaPro"); // NOI18N
        jbtnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnConsultarActionPerformed(evt);
            }
        });

        jtProductos.setBackground(new java.awt.Color(204, 204, 204));
        jtProductos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204), null, null));
        jtProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CodProducto", "Tipo", "Producto", "Descripcion", "Medidas", "Existencias", "Fecha", "Pvp"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtProductos.setEnabled(false);
        jtProductos.setName("jtProductos"); // NOI18N
        jScrollPane1.setViewportView(jtProductos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jlbNombrePro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLbCodigoPro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbTipoPro, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfTipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jtfNomProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfCodProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addComponent(jbtnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(113, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLbCodigoPro, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                    .addComponent(jtfCodProducto))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtfNomProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbtnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtfTipoProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                .addGap(10, 10, 10))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlbNombrePro, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlbTipoPro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void miIniComponents() {
        
        //contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        //contentPane.setLayout(new BorderLayout(0, 0));
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/OIPHMVE92YV.jpg")).getImage());
        jtfCodProducto.setText("");
        jtfNomProducto.setText("");
        jtfTipoProducto.setText("");

    }
    private void jtfCodProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCodProductoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jtfCodProductoActionPerformed

    private void jtfNomProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNomProductoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jtfNomProductoActionPerformed

    private void jbtnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnConsultarActionPerformed
        // TODO add your handling code here:
    
              
        wCodProd = jtfCodProducto.getText();
        wNomProd = jtfNomProducto.getText();
        wTipProd = jtfTipoProducto.getText();
        
            
        if (!wCodProd.equals("")) {
            if (!wNomProd.equals("")) {
                if (!wTipProd.equals("")) {
                    System.out.println("1, 2, 3 relleno");                          
                    where = " where idProducto = " + wCodProd
                            + " and nomProducto = "+ '"' + wNomProd + '"'
                            + " and tipoProducto = " + wTipProd;
                } else {
                    System.out.println("1 y 2 rellenos");
                    
                    where = " where idProducto = " + wCodProd
                            + " and nomProducto = "+ '"' + wNomProd + '"';
                }
            } else {
                if (!wTipProd.equals("")) {
                    System.out.println("1, 3 relleno");
                    where = " where tipoProducto = " + wTipProd;
                }else{
                     where = " where idProducto = " + wCodProd;
                  }
            }
        } else {
            if (!wNomProd.equals("")) {
                if (!wTipProd.equals("")) {
                    System.out.println("2 y 3 rellenos");
                    where = " where nomProducto = "+ '"' + wNomProd + '"' 
                            + " and tipoProducto = " + wTipProd;
                } else {
                        System.out.println("3 rellenos");
                        where = " where nomProducto = "+ '"' + wNomProd + '"';
                }
            } else {
                if (!wTipProd.equals("")) {
                        System.out.println("2  rellenos");
                        where = " where tipoProducto = " + wTipProd;
                }
            }  
        }
			
      try {
            DefaultTableModel modelo = new DefaultTableModel();
            jtProductos.setModel(modelo);

            Conexion consulta = new Conexion();
            rs = consulta.getConsulta(where);

            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            
            for (int i = 0; i < cantidadColumnas; i++) {
                modelo.addColumn(rsMd.getColumnLabel(i + 1));
            }

            int[] ancho = {50, 200, 50, 50};

            for (int i = 0; i < cantidadColumnas; i++) {
                jtProductos.getColumnModel().getColumn(i).setPreferredWidth(ancho[i]);
            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];

                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }

                modelo.addRow(filas);
            }
        } catch (Exception ex) {
            System.err.println(ex.toString());
        }
    }//GEN-LAST:event_jbtnConsultarActionPerformed

    /**
             * @param args the command line arguments
             */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frm_ConsultaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_ConsultaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_ConsultaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_ConsultaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new Frm_ConsultaProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLbCodigoPro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnConsultar;
    private javax.swing.JLabel jlbNombrePro;
    private javax.swing.JLabel jlbTipoPro;
    private javax.swing.JTable jtProductos;
    private javax.swing.JTextField jtfCodProducto;
    private javax.swing.JTextField jtfNomProducto;
    private javax.swing.JTextField jtfTipoProducto;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JPanel contentPane;
    private String wCodProd = "";
    private String wNomProd = "";
    private String wTipProd = "";
    private String where = "";
    private ResultSet rs = null;
     

}
