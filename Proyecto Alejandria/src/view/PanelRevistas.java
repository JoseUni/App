
package view;

import controller.HomeController;

public class PanelRevistas extends javax.swing.JPanel {
    private HomeController HomeC;

    
    public PanelRevistas() {
        initComponents();
    }

    public PanelRevistas(HomeController pHomeC) {
        HomeC=pHomeC;
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        _ADDRevista = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        _PanelesRevista = new javax.swing.JPanel();

        setBackground(new java.awt.Color(204, 204, 204));
        setMaximumSize(new java.awt.Dimension(673, 437));
        setMinimumSize(new java.awt.Dimension(673, 437));
        setPreferredSize(new java.awt.Dimension(673, 437));

        jLabel1.setText("Revistas");

        _ADDRevista.setBackground(new java.awt.Color(204, 204, 204));
        _ADDRevista.setText("Añadir Revista");
        _ADDRevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _ADDRevistaActionPerformed(evt);
            }
        });

        _PanelesRevista.setBackground(new java.awt.Color(102, 102, 102));
        _PanelesRevista.setLayout(new java.awt.GridLayout(0, 1));
        jScrollPane1.setViewportView(_PanelesRevista);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(_ADDRevista, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(_ADDRevista, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void _ADDRevistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__ADDRevistaActionPerformed
        CrearRevista newLibro=new CrearRevista(null,true);
        newLibro.setModel(this.HomeC.getModel());
        newLibro.setVisible(true);
    }//GEN-LAST:event__ADDRevistaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton _ADDRevista;
    private javax.swing.JPanel _PanelesRevista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    void showAllRevistas() {
    
    
    }
}
