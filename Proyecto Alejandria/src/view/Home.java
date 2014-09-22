
package view;

import controller.HomeController;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import model.library.Libro;
import view.interfaces.interfaceHome;

public class Home extends javax.swing.JFrame implements interfaceHome{
    private int x;
    private int y;
    private HomeController HomeC;
    private PanelLibros _PanelLibro;
    private PanelPeliculas _PanelPelicula;
    private PanelRevistas _PanelRevistas;
    private PanelPersonas _PanelPersonas;
    
    
    public Home(HomeController pHomeC) {
        HomeC=pHomeC;
        initComponents();
        _PanelLibro=new PanelLibros(pHomeC);_PanelLibro.setVisible(true);
        _PanelPelicula=new PanelPeliculas(pHomeC);_PanelPelicula.setVisible(true);
        _PanelRevistas=new PanelRevistas(pHomeC);_PanelRevistas.setVisible(true);
        _PanelPersonas=new PanelPersonas(pHomeC);_PanelPersonas.setVisible(true);
        this._BLIBROS.addActionListener(HomeC);
        this._BPELICULAS.addActionListener(HomeC);
        this._BPERSONAS.addActionListener(HomeC);
        this._BREVISTAS.addActionListener(HomeC);
        this._BBuscar.addActionListener(HomeC);
    }
   
    protected void this_mousePressed(MouseEvent e) {
            x = e.getX();
            y = e.getY();
    }

    protected void this_mouseDragged(MouseEvent e) {
            Point point = MouseInfo.getPointerInfo().getLocation();
            setLocation(point.x - x, point.y - y);
    }

    public Home() {
        initComponents();
    }
    
    @Override
    public void showHome() {
        this.setVisible(true);
    }

    @Override
    public void showLibros() {
        this.panelsPane.removeAll();
        this.panelsPane.add(this._PanelLibro);
        this._PanelLibro.showAllLibros();
        this.panelsPane.updateUI();
    }

    @Override
    public void showRevistas() {
        this.panelsPane.removeAll();
        this.panelsPane.add(this._PanelRevistas);
        this._PanelRevistas.showAllRevistas();
        this.panelsPane.updateUI();
    }

    @Override
    public void showPersonas() {
        this.panelsPane.removeAll();
        this.panelsPane.add(this._PanelPersonas);
        this._PanelPersonas.showAllPersonas();
        this.panelsPane.updateUI();
    }

    @Override
    public void showPeliculas() {
        this.panelsPane.removeAll();
        this.panelsPane.add(this._PanelPelicula);
        this._PanelPelicula.showAllPeliculas();
        this.panelsPane.updateUI();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        _BLIBROS = new javax.swing.JButton();
        _BREVISTAS = new javax.swing.JButton();
        _BPELICULAS = new javax.swing.JButton();
        _BPERSONAS = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        _EntradaText = new javax.swing.JTextField();
        _EntradaFiltroTipo = new javax.swing.JComboBox();
        _BBuscar = new javax.swing.JButton();
        _EntradaFiltroBusq = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelsPane = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setBounds(new java.awt.Rectangle(200, 50, 775, 558));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        jPanel2.setPreferredSize(new java.awt.Dimension(890, 690));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        _BLIBROS.setBackground(new java.awt.Color(204, 204, 204));
        _BLIBROS.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        _BLIBROS.setForeground(new java.awt.Color(153, 153, 153));
        _BLIBROS.setText("Libros");
        _BLIBROS.setActionCommand("ButtonLibros");
        _BLIBROS.setBorder(null);
        _BLIBROS.setFocusPainted(false);
        _BLIBROS.setFocusable(false);

        _BREVISTAS.setBackground(new java.awt.Color(204, 204, 204));
        _BREVISTAS.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        _BREVISTAS.setForeground(new java.awt.Color(153, 153, 153));
        _BREVISTAS.setText("Revistas");
        _BREVISTAS.setActionCommand("ButtonRevistas");
        _BREVISTAS.setBorder(null);
        _BREVISTAS.setFocusPainted(false);
        _BREVISTAS.setFocusable(false);

        _BPELICULAS.setBackground(new java.awt.Color(204, 204, 204));
        _BPELICULAS.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        _BPELICULAS.setForeground(new java.awt.Color(153, 153, 153));
        _BPELICULAS.setText("Peliculas");
        _BPELICULAS.setActionCommand("ButtonPeliculas");
        _BPELICULAS.setBorder(null);
        _BPELICULAS.setFocusPainted(false);
        _BPELICULAS.setFocusable(false);

        _BPERSONAS.setBackground(new java.awt.Color(204, 204, 204));
        _BPERSONAS.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        _BPERSONAS.setForeground(new java.awt.Color(153, 153, 153));
        _BPERSONAS.setText("Personas");
        _BPERSONAS.setActionCommand("ButtonPersonas");
        _BPERSONAS.setBorder(null);
        _BPERSONAS.setFocusPainted(false);
        _BPERSONAS.setFocusable(false);

        jButton6.setBackground(new java.awt.Color(204, 204, 204));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton6.setForeground(new java.awt.Color(153, 153, 153));
        jButton6.setText("Salir");
        jButton6.setBorder(null);
        jButton6.setFocusPainted(false);
        jButton6.setFocusable(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        _EntradaFiltroTipo.setBackground(new java.awt.Color(204, 204, 204));
        _EntradaFiltroTipo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        _EntradaFiltroTipo.setForeground(new java.awt.Color(153, 153, 153));
        _EntradaFiltroTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Persona", "Libro", "Pelicula", "Revista" }));

        _BBuscar.setBackground(new java.awt.Color(204, 204, 204));
        _BBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        _BBuscar.setForeground(new java.awt.Color(153, 153, 153));
        _BBuscar.setText("Buscar");
        _BBuscar.setActionCommand("ButtonBuscar");

        _EntradaFiltroBusq.setBackground(new java.awt.Color(204, 204, 204));
        _EntradaFiltroBusq.setForeground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(_EntradaText, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_EntradaFiltroTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_EntradaFiltroBusq, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_BBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(_BBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(_EntradaFiltroBusq, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(_EntradaFiltroTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(_EntradaText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelsPane.setBackground(new java.awt.Color(153, 153, 153));
        panelsPane.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelsPane.setLayout(new java.awt.GridLayout(0, 1));
        jScrollPane1.setViewportView(panelsPane);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Alejandría");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 16, Short.MAX_VALUE))
                    .addComponent(_BLIBROS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(_BREVISTAS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(_BPELICULAS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(_BPERSONAS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(_BLIBROS, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_BPELICULAS, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_BREVISTAS, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_BPERSONAS, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 380, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 874, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        System.exit(0); 
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MouseEntered

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        Point point = MouseInfo.getPointerInfo().getLocation();
        setLocation(point.x - x, point.y - y);
    }//GEN-LAST:event_jPanel2MouseDragged

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton _BBuscar;
    private javax.swing.JButton _BLIBROS;
    private javax.swing.JButton _BPELICULAS;
    private javax.swing.JButton _BPERSONAS;
    private javax.swing.JButton _BREVISTAS;
    private javax.swing.JComboBox _EntradaFiltroBusq;
    private javax.swing.JComboBox _EntradaFiltroTipo;
    private javax.swing.JTextField _EntradaText;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelsPane;
    // End of variables declaration//GEN-END:variables

    

   
    
}
