
package javaapplication82;
import  javax.swing.table.DefaultTableModel;
import  javax.swing.table.DefaultTableModel;
import  javaapplication82.tablaProductosGUI;

public class productosFor extends javax.swing.JFrame {
    
    public static int i=0;
    
    
    DefaultTableModel dtm = new DefaultTableModel();
    public static int NR= 5; //numero de productos introducidos
    
    public productosFor() {
        initComponents();
        String[] titulo = {"CodProd", "Producto", "Cantidad", "Precio", "Grab"};
        dtm.setColumnIdentifiers(titulo);
        jTable1.setModel(dtm);
        tablaProductosGUI.Inicializa();
        tablaProductosGUI.datos();
        //tablaProductosGUI.calculos();
        verRegistro();
    }
    
    public void AgregarRenglones(){
       for(int k=0; k<NR; k++)
        dtm.addRow(new Object[]{"","","","",""});
    }
    
    public void EliminarRenglones(){
        int nreng = dtm.getRowCount();
        if(nreng>0){
          for(int k=1; k<=nreng; k++)  
            dtm.removeRow(0);
        }    
    }
    
    public void roundabaut(){
       
    }
    
    public void verRegistro(){
        double st,imp,tot;
        st = tablaProductosGUI.p[1].subTotal;
        st = (int)(st*100);
        st = st/100.0;

        imp = tablaProductosGUI.p[1].impuesto;
        imp = (int)(imp*100);
        imp = imp/100.0;
        
        tot = tablaProductosGUI.p[1].total;
        tot = (int)(tot*100);
        tot = tot/100.0;
    
        txt_CodProducto.setText(javaapplication82.tablaProductosGUI.p[i].codProducto);
        txt_NombreProducto.setText(javaapplication82.tablaProductosGUI.p[i].nombreProducto);
        txt_Cantidad.setText(String.valueOf(javaapplication82.tablaProductosGUI.p[i].cantidad));
        txt_Precio.setText(String.valueOf(javaapplication82.tablaProductosGUI.p[i].precio));
        txt_Grababilidad.setText(String.valueOf(javaapplication82.tablaProductosGUI.p[i].grababilidad));
        txt_SubTotal.setText(String.valueOf(st));
        txt_Impuesto.setText(String.valueOf(imp));
        txt_Total.setText(String.valueOf(tot));
    }
    

    
    public void listar(){
        EliminarRenglones();
        AgregarRenglones();
//        for(int k=0; k<=NR; k++){
//          int n=k-1;
//          dtm.setValueAt(tablaProductosGUI.p[i].codProducto,n,1);
//          dtm.setValueAt(tablaProductosGUI.p[i].nombreProducto,n,2);
//          dtm.setValueAt(tablaProductosGUI.p[i].cantidad,n,3);
//          dtm.setValueAt(tablaProductosGUI.p[i].precio,n,4);
//          dtm.setValueAt(tablaProductosGUI.p[i].grababilidad,n,5);
//          dtm.setValueAt(tablaProductosGUI.p[i].impuesto,n,6);
//          dtm.setValueAt(tablaProductosGUI.p[i].total,n,7);
//        }
//        
        dtm.setValueAt("P01", 0, 0);
        dtm.setValueAt("P02", 1, 0);
        dtm.setValueAt("P03", 2, 0);
        dtm.setValueAt("P04", 3, 0);
        dtm.setValueAt("P05", 4, 0);
        
        dtm.setValueAt("QUESO", 0, 1);
        dtm.setValueAt("PAPAS", 1, 1);
        dtm.setValueAt("MARGARINA", 2, 1);
        dtm.setValueAt("HUEVOS", 3, 1);
        dtm.setValueAt("CHILE (4OZ)", 4, 1);
        dtm.setValueAt("CHILE (4OZ)", 4, 1);
        
        dtm.setValueAt(3, 0, 2);
        dtm.setValueAt(2, 1, 2);
        dtm.setValueAt(1, 2, 2);
        dtm.setValueAt(2, 3, 2);
        dtm.setValueAt(3, 4, 2);
        
        dtm.setValueAt(47.50, 0, 3);
        dtm.setValueAt(8.45, 1, 3);
        dtm.setValueAt(9.30, 2, 3);
        dtm.setValueAt(45.00, 3, 3);
        dtm.setValueAt(7.20, 4, 3);
        
        dtm.setValueAt(false, 0, 4);
        dtm.setValueAt(false, 1, 4);
        dtm.setValueAt(true, 2, 4);
        dtm.setValueAt(false, 3, 4);
        dtm.setValueAt(true, 4, 4);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txt_CodProducto = new javax.swing.JTextField();
        txt_NombreProducto = new javax.swing.JTextField();
        txt_Cantidad = new javax.swing.JTextField();
        txt_Precio = new javax.swing.JTextField();
        txt_Grababilidad = new javax.swing.JTextField();
        txt_SubTotal = new javax.swing.JTextField();
        txt_Impuesto = new javax.swing.JTextField();
        txt_Total = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_next = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        btn_primero = new javax.swing.JButton();
        btn_ultimo = new javax.swing.JButton();
        btn_calcular = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Agregar Renglones");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Eliminar Renglones");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Listar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txt_CodProducto.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        txt_CodProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txt_NombreProducto.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        txt_NombreProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txt_Cantidad.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        txt_Cantidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txt_Precio.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        txt_Precio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txt_Grababilidad.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        txt_Grababilidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txt_SubTotal.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        txt_SubTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txt_Impuesto.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        txt_Impuesto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txt_Total.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        txt_Total.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NOM_PRODUCTO");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("COD_PRODUCTO");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CANTIDAD");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("GRABABILIDAD");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PRECIO");

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("IMPUESTO");

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("SUBTOTAL");

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("TOTAL");

        btn_next.setText("Siguiente");
        btn_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextActionPerformed(evt);
            }
        });

        btn_back.setText("Anterior");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        btn_primero.setText("primero");
        btn_primero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_primeroActionPerformed(evt);
            }
        });

        btn_ultimo.setText("ultimo");
        btn_ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ultimoActionPerformed(evt);
            }
        });

        btn_calcular.setText("calcular ");
        btn_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_next)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_back)
                        .addGap(54, 54, 54)
                        .addComponent(btn_primero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_ultimo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_calcular))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                            .addComponent(txt_CodProducto, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_NombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Grababilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Impuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_SubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_CodProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_NombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Grababilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_SubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Impuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(btn_next)
                    .addComponent(btn_back)
                    .addComponent(btn_primero)
                    .addComponent(btn_ultimo)
                    .addComponent(btn_calcular))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AgregarRenglones();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        EliminarRenglones();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        EliminarRenglones();
        AgregarRenglones();
        listar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
        i+=1;
        if(i>5){
            i=5;
        }
        verRegistro();     
    }//GEN-LAST:event_btn_nextActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        i = i - 1;
        if(i<5){
            i=1;
        }
        verRegistro();   
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_primeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_primeroActionPerformed
        i=1;
        verRegistro();
    }//GEN-LAST:event_btn_primeroActionPerformed

    private void btn_ultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ultimoActionPerformed
        i=NR;
        verRegistro();
    }//GEN-LAST:event_btn_ultimoActionPerformed

    private void btn_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularActionPerformed
           tablaProductosGUI.calculos();
           verRegistro();
    }//GEN-LAST:event_btn_calcularActionPerformed


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
            java.util.logging.Logger.getLogger(productosFor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(productosFor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(productosFor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(productosFor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new productosFor().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_calcular;
    private javax.swing.JButton btn_next;
    private javax.swing.JButton btn_primero;
    private javax.swing.JButton btn_ultimo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txt_Cantidad;
    private javax.swing.JTextField txt_CodProducto;
    private javax.swing.JTextField txt_Grababilidad;
    private javax.swing.JTextField txt_Impuesto;
    private javax.swing.JTextField txt_NombreProducto;
    private javax.swing.JTextField txt_Precio;
    private javax.swing.JTextField txt_SubTotal;
    private javax.swing.JTextField txt_Total;
    // End of variables declaration//GEN-END:variables
}
