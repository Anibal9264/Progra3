/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piasystemairline.Presentation.EdicionModelAvion;

import java.awt.Dimension;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import piasystemairline.Logic.ModeloAvion;

public class View extends javax.swing.JInternalFrame implements Observer {

    public View() {
        initComponents();
    }

    Model modelo;
    Controller controller;
    
    void setControlador(Controller c) {
      this.controller = c;
    }

    void setModelEdit(Model m) {
     this.modelo = m;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        trademark = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        capacity = new javax.swing.JTextField();
        numberRows = new javax.swing.JTextField();
        CB_SeatRows = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        shared = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        add = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        delate = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(98, 240, 238));

        jLabel1.setText("TradeMark");

        jLabel2.setText("Age");

        jLabel3.setText("Capacity");

        jLabel4.setText("Number of Rows");

        jLabel5.setText("Seats for Rows");

        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });

        jLabel6.setText("ID");

        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idKeyReleased(evt);
            }
        });

        shared.setIcon(new javax.swing.ImageIcon(getClass().getResource("/piasystemairline/Presentation/iconos/icons8-google_web_search.png"))); // NOI18N
        shared.setEnabled(false);
        shared.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sharedActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/piasystemairline/Presentation/iconos/icons8-circled_left_2.png"))); // NOI18N
        jButton2.setText("Closed");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/piasystemairline/Presentation/iconos/icons8-add.png"))); // NOI18N
        add.setText("Add");
        add.setEnabled(false);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/piasystemairline/Presentation/iconos/icons8-edit.png"))); // NOI18N
        edit.setText("Edit");
        edit.setEnabled(false);
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        delate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/piasystemairline/Presentation/iconos/icons8-trash.png"))); // NOI18N
        delate.setText("Delate");
        delate.setEnabled(false);
        delate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delateActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(98, 240, 238));
        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel7.setText(" Aircraft Models Management");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(add)
                        .addGap(161, 161, 161))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(shared, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(trademark, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(capacity, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numberRows, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CB_SeatRows, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(95, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(edit)
                .addGap(39, 39, 39)
                .addComponent(delate)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(shared, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(trademark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(capacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numberRows, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CB_SeatRows, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(11, 11, 11))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add)
                    .addComponent(edit)
                    .addComponent(jButton2)
                    .addComponent(delate))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       LimpiarTodo();
       this.setVisible(false);
       controller.MenuAvionShow();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
         ModeloAvion m = new ModeloAvion(id.getText(),Integer. parseInt(age.getText()),
                    trademark.getText(),Integer. parseInt(capacity.getText()),
                    Integer. parseInt(numberRows.getText()),CB_SeatRows.getSelectedIndex()+6);
        try {
            controller.Add(m);
        } catch (Exception ex) {
            id.setText("Avion YA EXISTE!!");
        }
    }//GEN-LAST:event_addActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
         ModeloAvion m = new ModeloAvion(id.getText(),Integer. parseInt(age.getText()),
                    trademark.getText(),Integer. parseInt(capacity.getText()),
                    Integer. parseInt(numberRows.getText()),CB_SeatRows.getSelectedIndex()+6);
        try {
            controller.Modificar(m);
        } catch (Exception ex) {}
    }//GEN-LAST:event_editActionPerformed

    private void idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyPressed
      
    }//GEN-LAST:event_idKeyPressed

    private void idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyTyped

    }//GEN-LAST:event_idKeyTyped

    private void idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyReleased
     if(id.getText().isEmpty()){
        add.setEnabled(false);
        edit.setEnabled(false);
        shared.setEnabled(false);
        delate.setEnabled(false);
      }else{
        add.setEnabled(true);
        edit.setEnabled(true);
        shared.setEnabled(true);
        delate.setEnabled(true);
      }
    }//GEN-LAST:event_idKeyReleased

    private void sharedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sharedActionPerformed
        try {    
            RenderModeloAvion(controller.getModeloAvion(id.getText()));
        } catch (Exception ex) {
            id.setText("NO EXISTE!!");
        }
    }//GEN-LAST:event_sharedActionPerformed

    private void delateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delateActionPerformed
        try {
            controller.Delate(id.getText());
            LimpiarTodo();
        } catch (Exception ex) {
            
        }
    }//GEN-LAST:event_delateActionPerformed
   
   private void RenderModeloAvion(ModeloAvion m){
        age.setText(Integer.toString(m.getAge()));
        capacity.setText(Integer.toString(m.getCapacity()));
        numberRows.setText(Integer.toString(m.getNumberRows()));
        trademark.setText(m.getTrademark());
        CB_SeatRows.setSelectedIndex(m.getSeatsPeRrow()-6);
   }
    
  

   public void LimpiarTodo(){
    age.setText("");
    capacity.setText("");
    id.setText("");
    numberRows.setText("");
    trademark.setText("");
   }
   private void rellenerCombo(){
       for (int i = 6; i < 10; i++) {
           CB_SeatRows.addItem(Integer.toString(i));
          }
   }
    private void Centrar() {
    Dimension desktopSize = this.getSize();
    this.setLocation((desktopSize.width),
    (desktopSize.height/2 - JFrame.HEIGHT));
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CB_SeatRows;
    private javax.swing.JButton add;
    private javax.swing.JTextField age;
    private javax.swing.JTextField capacity;
    private javax.swing.JButton delate;
    private javax.swing.JButton edit;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField numberRows;
    private javax.swing.JButton shared;
    private javax.swing.JTextField trademark;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        rellenerCombo();
        Centrar();
    }
}
