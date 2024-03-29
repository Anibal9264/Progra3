/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piasystemairline.Presentation.App;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import piasystemairline.Logic.fondo;

public class PiaAPP extends javax.swing.JFrame implements Observer{

    public PiaAPP() {
        cargarFondo();
        initComponents();
        PantallaCompleta();
        salir.setVisible(false);
        Aministra.setVisible(false);
    }
    ModelApp modelo;
    ControllerApp controller;
    
    void setModel(ModelApp model) {
        this.modelo = model;
    }

    void setControlador(ControllerApp aThis) {
         this.controller = aThis;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        historia = new javax.swing.JButton();
        contactenos = new javax.swing.JButton();
        referente = new javax.swing.JButton();
        buscarVuelo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        descuentos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        singup = new javax.swing.JMenuItem();
        singin = new javax.swing.JMenuItem();
        salir = new javax.swing.JMenuItem();
        Aministra = new javax.swing.JMenu();
        Aircraft = new javax.swing.JMenuItem();
        Cities = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        Routes = new javax.swing.JMenuItem();
        Payment = new javax.swing.JMenuItem();
        Reports = new javax.swing.JMenuItem();
        other = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo.setBackground(new java.awt.Color(255, 255, 255));

        historia.setBackground(new java.awt.Color(51, 0, 255));
        historia.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        historia.setText("Historia");
        historia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        historia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historiaActionPerformed(evt);
            }
        });

        contactenos.setBackground(new java.awt.Color(51, 0, 255));
        contactenos.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        contactenos.setText("Contactenos");
        contactenos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        contactenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactenosActionPerformed(evt);
            }
        });

        referente.setBackground(new java.awt.Color(51, 0, 255));
        referente.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        referente.setText("Referente institucional");
        referente.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        referente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                referenteActionPerformed(evt);
            }
        });

        buscarVuelo.setBackground(new java.awt.Color(51, 0, 255));
        buscarVuelo.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        buscarVuelo.setText("Buscar Vuelo");
        buscarVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarVueloActionPerformed(evt);
            }
        });

        descuentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        descuentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                descuentosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(descuentos);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Routes with Discount");

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(contactenos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(historia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(referente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(210, 210, 210)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscarVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(101, 101, 101))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buscarVuelo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addComponent(referente, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(historia, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(contactenos, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(62, 62, 62))
        );

        jMenu1.setText("PIA AIRLINE");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("USER");
        jMenu2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jMenu2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jMenu2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jMenu2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        singup.setText("Sign up");
        singup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singupActionPerformed(evt);
            }
        });
        jMenu2.add(singup);

        singin.setText("Sign in");
        singin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singinActionPerformed(evt);
            }
        });
        jMenu2.add(singin);

        salir.setText("Log out");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jMenu2.add(salir);

        jMenuBar1.add(jMenu2);

        Aministra.setText(" Administration");

        Aircraft.setText("Aircraft");
        Aircraft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AircraftActionPerformed(evt);
            }
        });
        Aministra.add(Aircraft);

        Cities.setText("Cities and Countries");
        Cities.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CitiesActionPerformed(evt);
            }
        });
        Aministra.add(Cities);

        jMenuItem1.setText("Routes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Aministra.add(jMenuItem1);

        Routes.setText("Flights");
        Routes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoutesActionPerformed(evt);
            }
        });
        Aministra.add(Routes);

        Payment.setText("Payment Methods");
        Payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentActionPerformed(evt);
            }
        });
        Aministra.add(Payment);

        Reports.setText("Reports");
        Reports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportsActionPerformed(evt);
            }
        });
        Aministra.add(Reports);

        other.setText("Add Other Admin");
        other.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherActionPerformed(evt);
            }
        });
        Aministra.add(other);

        jMenuBar1.add(Aministra);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void historiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historiaActionPerformed
        int reply;
        JPanel pane = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0, 
        GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, 
        new Insets(2, 2, 2, 2), 0, 0);
        pane.add(new JLabel("PIA AIRLINES nace en 2014 con la mision de brindar"
                + " un servicio de calidad y de bajo costo a todos los costarricenses"), gbc);
        gbc.gridy = 1;

        
        reply = JOptionPane.showConfirmDialog(null, pane, "HISTORIA",
        JOptionPane.CLOSED_OPTION);
    }//GEN-LAST:event_historiaActionPerformed

    private void contactenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactenosActionPerformed
        int reply;
        JPanel pane = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0, 
        GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, 
        new Insets(2, 2, 2, 2), 0, 0);
        pane.add(new JLabel("EMAIL: servicioalcliente@piaairlines.com \t TEL: (+506)2255-5252"), gbc);
        gbc.gridy = 1;

        
        reply = JOptionPane.showConfirmDialog(null, pane, "CONTACTENOS",
        JOptionPane.CLOSED_OPTION);
    }//GEN-LAST:event_contactenosActionPerformed

    private void referenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_referenteActionPerformed
        
        int reply;
        JPanel pane = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0, 
        GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, 
        new Insets(2, 2, 2, 2), 0, 0);
        pane.add(new JLabel("Premio a la iniciativa empresarial mas innovadora"
                + "en responsabilidad social empresarial, Premios cinco dias a"
                + "la innovacion empresarial 2019"), gbc);
        gbc.gridy = 1;

        
        reply = JOptionPane.showConfirmDialog(null, pane, "REFERENCIA INSTITUCIONAL",
        JOptionPane.CLOSED_OPTION);

    }//GEN-LAST:event_referenteActionPerformed

    private void singinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singinActionPerformed

        if ("Sign in".equals(singin.getText())) {
           singup.setEnabled(false);
           singin.setEnabled(false);
           controller.SinginShow();
        }else{
          QuitarTodo();
          controller.RegistroShow();
        }
    }//GEN-LAST:event_singinActionPerformed

    private void singupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singupActionPerformed
        QuitarTodo();
         singup.setEnabled(false);
         singin.setEnabled(false);
         singup.setEnabled(false);
         singin.setEnabled(false);
        if ("Sign up".equals(singup.getText())) {
            controller.EdcionPersonaShow(); 
        }else{
            try {
                controller.CargarDatosPersonas();
            } catch (Exception ex) {
            }
        }
    }//GEN-LAST:event_singupActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
     singup.setText("Sign up");
     singin.setText("Sign in");
     salir.setVisible(false);
     Aministra.setVisible(false);
     jMenu2.setText("USER");
     controller.SalirUser();
    }//GEN-LAST:event_salirActionPerformed

    private void buscarVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarVueloActionPerformed
        QuitarTodo();
        controller.EdicionVueloShowV2();
    }//GEN-LAST:event_buscarVueloActionPerformed

    private void AircraftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AircraftActionPerformed
        QuitarTodo();
        controller.EdcionAvionShow();
    }//GEN-LAST:event_AircraftActionPerformed

    private void CitiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CitiesActionPerformed
        QuitarTodo();
        controller.EdicionCiudadesPaises();
    }//GEN-LAST:event_CitiesActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        QuitarTodo();
        controller.EdcionRutaShow();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void RoutesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoutesActionPerformed
        QuitarTodo();
        controller.EdicionVueloShowV1();
    }//GEN-LAST:event_RoutesActionPerformed

    private void PaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentActionPerformed
        QuitarTodo();
        controller.EdicionFormaPago();
    }//GEN-LAST:event_PaymentActionPerformed

    private void otherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherActionPerformed
        QuitarTodo();
        controller.EdcionPersonaShow();
    }//GEN-LAST:event_otherActionPerformed

    private void descuentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_descuentosMouseClicked
    if (evt.getClickCount() == 2) {
        int fila = this.descuentos.rowAtPoint(evt.getPoint());
        controller.EnviarVueloClick(fila);
        }
    }//GEN-LAST:event_descuentosMouseClicked

    private void ReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportsActionPerformed
        QuitarTodo();
        controller.ReporteDeApp();
        
// TODO add your handling code here:
    }//GEN-LAST:event_ReportsActionPerformed

 public void QuitarTodo(){
         buscarVuelo.setVisible(false);
         contactenos.setVisible(false);
         historia.setVisible(false);
         referente.setVisible(false);
         descuentos.setVisible(false);
         jScrollPane1.setVisible(false);
         jLabel1.setVisible(false);
        

 }
 
public void PonerTodo(){
         buscarVuelo.setVisible(true);
         contactenos.setVisible(true);
         historia.setVisible(true);
         referente.setVisible(true);
         singup.setEnabled(true);
         singin.setEnabled(true);
         descuentos.setVisible(true);
         jScrollPane1.setVisible(true);
         jLabel1.setVisible(true);
         
 }
 public void IsAdmin(){
 
 }
 
 private void cargarFondo(){
  fondo image=new fondo();
  image.setImage("/piasystemairline/Presentation/iconos/a.jpg");
  setContentPane(image);
 }
 private void PantallaCompleta(){
  fondo.setOpaque(false);
  this.setExtendedState(JFrame.MAXIMIZED_BOTH);
  this.fondo.setBounds(this.getX(),this.getY(),this.getWidth(),this.getHeight());
}
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Aircraft;
    private javax.swing.JMenu Aministra;
    private javax.swing.JMenuItem Cities;
    private javax.swing.JMenuItem Payment;
    private javax.swing.JMenuItem Reports;
    private javax.swing.JMenuItem Routes;
    private javax.swing.JButton buscarVuelo;
    private javax.swing.JButton contactenos;
    private javax.swing.JTable descuentos;
    public javax.swing.JPanel fondo;
    private javax.swing.JButton historia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem other;
    private javax.swing.JButton referente;
    private javax.swing.JMenuItem salir;
    private javax.swing.JMenuItem singin;
    private javax.swing.JMenuItem singup;
    // End of variables declaration//GEN-END:variables

    void UserActivate(String name, char admin) {
      this.jMenu2.setText(name);
        if (admin == '1') {
        Aministra.setVisible(true);
        singup.setText("My Infomation");
        singin.setText("Previous Reservations");
        singup.setEnabled(true);
        singin.setEnabled(true);
        salir.setVisible(true);
        }else{    
        singup.setText("My Infomation");
        singin.setText("Previous Reservations");
        singup.setEnabled(true);
        singin.setEnabled(true);
        salir.setVisible(true);
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        controller.Obtenerlist();
        CargarJtable();
    }

    void ponersing() {
           singup.setEnabled(true);
           singin.setEnabled(true);
    }

     private void CargarJtable() {
        descuentos.setModel(new TableModel(modelo.getRutas()));
        for(int i = 0; i < this.descuentos.getRowCount(); i++) {
        this.descuentos.setRowHeight(i,30);
    }
    }

}