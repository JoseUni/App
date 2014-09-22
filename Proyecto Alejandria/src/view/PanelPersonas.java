
package view;

import controller.HomeController;
import java.util.ArrayList;
import javax.swing.JPanel;
import model.library.Persona;


public class PanelPersonas extends javax.swing.JPanel {
    private HomeController HomeC;

    
    public PanelPersonas() {
        initComponents();
    }

    public PanelPersonas(HomeController pHomeC) {
        HomeC=pHomeC;
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        _ADDPersona = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        _PanelesPersona = new javax.swing.JPanel();

        setBackground(new java.awt.Color(204, 204, 204));
        setMaximumSize(new java.awt.Dimension(673, 437));
        setMinimumSize(new java.awt.Dimension(673, 437));
        setPreferredSize(new java.awt.Dimension(673, 437));

        jLabel1.setText("Personas");

        _ADDPersona.setBackground(new java.awt.Color(204, 204, 204));
        _ADDPersona.setText("Añadir");
        _ADDPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _ADDPersonaActionPerformed(evt);
            }
        });

        _PanelesPersona.setBackground(new java.awt.Color(102, 102, 102));
        _PanelesPersona.setLayout(new java.awt.GridLayout(0, 1));
        jScrollPane1.setViewportView(_PanelesPersona);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_ADDPersona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(_ADDPersona, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void _ADDPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__ADDPersonaActionPerformed
        CrearPersona newLibro=new CrearPersona(null,true);
        newLibro.setModel(this.HomeC.getModel());
        newLibro.setVisible(true);
    }//GEN-LAST:event__ADDPersonaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton _ADDPersona;
    private javax.swing.JPanel _PanelesPersona;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public JPanel getPanelesPersona() {
        return _PanelesPersona;
    }

    public void setPanelesPersona(JPanel _PanelesPersona) {
        this._PanelesPersona = _PanelesPersona;
    }
    
    public void showAllPersonas(){
        try{
            this._PanelesPersona.removeAll();
            ArrayList<Persona> lista=this.HomeC.getModel().getDataAccess().consultaPersonas();
            for(int contador=0;contador<lista.size();contador++){
                MostrarPersona newPanelPersona=new MostrarPersona(lista.get(contador),this.HomeC.getModel(),this);
                this._PanelesPersona.add(newPanelPersona);
                this._PanelesPersona.updateUI();
            }
        }catch(Exception e){
        
        }
    }
}
