
package view;

import controller.HomeController;


public class PanelPeliculas extends javax.swing.JPanel {
    private HomeController HomeC;

    
    public PanelPeliculas() {
        initComponents();
    }

    public PanelPeliculas(HomeController pHomeC) {
        HomeC=pHomeC;
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        _ADDPelicula = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        _PanelesPelicula = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(673, 437));
        setMinimumSize(new java.awt.Dimension(673, 437));
        setPreferredSize(new java.awt.Dimension(673, 437));

        jLabel1.setText("Peliculas");

        _ADDPelicula.setText("Añadir");
        _ADDPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _ADDPeliculaActionPerformed(evt);
            }
        });

        _PanelesPelicula.setLayout(new java.awt.GridLayout(0, 1));
        jScrollPane1.setViewportView(_PanelesPelicula);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                        .addComponent(_ADDPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_ADDPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void _ADDPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__ADDPeliculaActionPerformed
        CrearPelicula newLibro=new CrearPelicula(null,true);
        newLibro.setModel(this.HomeC.getModel());
        newLibro.setVisible(true);
    }//GEN-LAST:event__ADDPeliculaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton _ADDPelicula;
    private javax.swing.JPanel _PanelesPelicula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
