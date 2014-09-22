/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.HomeController;
import java.util.ArrayList;
import model.library.Libro;

/**
 *
 * @author Adriana
 */
public class PanelLibros extends javax.swing.JPanel {

    private HomeController HomeC;
    public PanelLibros() {
        initComponents();
    }

    public PanelLibros(HomeController pHomeC) {
        HomeC=pHomeC;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        _ADDLibro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        _PanelesLibro = new javax.swing.JPanel();

        setBackground(new java.awt.Color(204, 204, 204));
        setMaximumSize(new java.awt.Dimension(673, 437));
        setMinimumSize(new java.awt.Dimension(673, 437));

        jLabel1.setText("Libros");

        _ADDLibro.setBackground(new java.awt.Color(204, 204, 204));
        _ADDLibro.setText("Añadir");
        _ADDLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _ADDLibroActionPerformed(evt);
            }
        });

        _PanelesLibro.setBackground(new java.awt.Color(102, 102, 102));
        _PanelesLibro.setLayout(new java.awt.GridLayout(0, 1));
        jScrollPane1.setViewportView(_PanelesLibro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_ADDLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(_ADDLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void _ADDLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__ADDLibroActionPerformed
        CrearLibro newLibro=new CrearLibro(null,true);
        newLibro.setModel(this.HomeC.getModel());
        newLibro.setVisible(true);
    }//GEN-LAST:event__ADDLibroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton _ADDLibro;
    private javax.swing.JPanel _PanelesLibro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public void showAllLibros() {
        try{
            this._PanelesLibro.removeAll();
            ArrayList<Libro> lista=this.HomeC.getModel().getDataAccess().consultaLibros();
            for(int contador=0;contador<lista.size();contador++){
                MostrarLibro newPanelLibro=new MostrarLibro(lista.get(contador));
                this._PanelesLibro.add(newPanelLibro);
                this._PanelesLibro.updateUI();
            }
        }catch(Exception e){
        
        }
    }

    
}
