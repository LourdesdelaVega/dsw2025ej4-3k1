/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;


import domain.Carnivoro;
import domain.Empleado;
import domain.Especie;
import domain.Herbivoro;
import domain.Pais;
import domain.Sector;
import domain.TipoAlimentacion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.InvalidPropertiesFormatException;
import javax.swing.JOptionPane;

/**
 *
 * @author thecl
 */
public class Agregaranimales extends javax.swing.JFrame {

    public Agregaranimales() {
        initComponents();
        cargarDatosComboBox(this);
         habilitarValorfijo(); 
         inicializarEventos(); 
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
        especietxt = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        paistxt = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        sectortxt = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        edadtxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tipotxt = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        valortxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        pesotxt = new javax.swing.JTextField();
        volver = new javax.swing.JButton();
        guardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Especie");

        especietxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rolando", "Rocio", "Ubaldo", "Tiziano", "Guadalupe", "Paula" }));
        especietxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                especietxtActionPerformed(evt);
            }
        });

        jLabel2.setText("Pais");

        paistxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Madagascar", "India", "Rusia", "Australia ", "Brasil" }));
        paistxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paistxtActionPerformed(evt);
            }
        });

        jLabel3.setText("Sector");

        sectortxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        jLabel4.setText("Edad");

        jLabel5.setText("Tipo de alimentacion");

        tipotxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carnivoro", "Herbivoro" }));
        tipotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipotxtActionPerformed(evt);
            }
        });

        jLabel6.setText("Valor fijo");

        valortxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valortxtActionPerformed(evt);
            }
        });

        jLabel7.setText("Peso");

        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(volver)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(paistxt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(edadtxt)
                            .addComponent(valortxt)
                            .addComponent(pesotxt)
                            .addComponent(tipotxt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(especietxt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sectortxt, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(110, 110, 110))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(guardar)
                        .addGap(80, 80, 80))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(especietxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(paistxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sectortxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(edadtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tipotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(valortxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(pesotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(volver)
                    .addComponent(guardar))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void especietxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_especietxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_especietxtActionPerformed

    private void paistxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paistxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paistxtActionPerformed

    private void valortxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valortxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valortxtActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        Controlador.volver(this);
        // TODO add your handling code here:
    }//GEN-LAST:event_volverActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        
        if (tipotxt.getSelectedItem().toString().equals(TipoAlimentacion.HERBIVORO.toString())) {
            try {
                Controlador.guardarAnimal(new Herbivoro(
                        this.getEdadtxt(), this.getPesotxt(), this.getEspecietxt(), this.getSectortxt(), this.getValortxt(), this.getPaistxt()
                ));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        else if(tipotxt.getSelectedItem().toString().equals(TipoAlimentacion.CARNIVORO.toString())){
            try{
                Controlador.guardarAnimal(new Carnivoro(this.getEdadtxt(), this.getPesotxt(), this.getEspecietxt(), this.getSectortxt(), this.getPaistxt()));   
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }


    }//GEN-LAST:event_guardarActionPerformed

    private void tipotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipotxtActionPerformed

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
            java.util.logging.Logger.getLogger(Agregaranimales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregaranimales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregaranimales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregaranimales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agregaranimales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField edadtxt;
    private javax.swing.JComboBox<String> especietxt;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<String> paistxt;
    private javax.swing.JTextField pesotxt;
    private javax.swing.JComboBox<String> sectortxt;
    private javax.swing.JComboBox<String> tipotxt;
    private javax.swing.JTextField valortxt;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables

    public int getEdadtxt() {
        return Integer.parseInt(edadtxt.getText());
    }

    //@Override
    //public int getDNI(){
    //    return Integer.parseInt(jTextField3.getText());
    //}
    public void setEdadtxt(String edad) {
        edadtxt.setText(edad);
    }

    public TipoAlimentacion getTipoAlimentacion(String tipo) {
        try {
            return TipoAlimentacion.valueOf(tipo);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, "Tipo de alimentación inválido", "Error", JOptionPane.ERROR_MESSAGE);
            return TipoAlimentacion.HERBIVORO; // o null, o lo que prefieras
        }
    }

    public Especie getEspecietxt() {
    // Buscá en la lista de especies la que tenga el nombre seleccionado
    for (Especie especie : Controlador.getEspecies()) {
        if (especie.getNombre().equals(especietxt.getSelectedItem().toString())) {
            return especie;
        }
    }
    // Si no se encontró, mostrale un error y retorná null (o manejalo según convenga)
    JOptionPane.showMessageDialog(this, "Especie no encontrada", "Error", JOptionPane.ERROR_MESSAGE);
    return null;
}


    public void setEspecietxt(javax.swing.JComboBox<String> especietxt) {
        this.especietxt = especietxt;
    }

    public void setPaistxt(javax.swing.JComboBox<String> paistxt) {
        this.paistxt = paistxt;
    }

    public Double getPesotxt() {
        return Double.valueOf(pesotxt.getText());
    }

    public void setPesotxt(javax.swing.JTextField pesotxt) {
        this.pesotxt = pesotxt;
    }

    public Sector getSectortxt() {
        ArrayList<Sector> sectores = Controlador.getSectores();
        for (Sector sector : sectores) {
            if (sector.getNumero() == Integer.parseInt(sectortxt.getSelectedItem().toString())) {
                return sector;
            }
        }
        
        return null;
    }

    public Pais getPaistxt() {
        ArrayList<Pais> paises = Controlador.getPaises();
        for (Pais pais : paises) {
            if (pais.getNombre().equals(paistxt.getSelectedItem().toString())) {
                return pais;
            }
        }
        
        return null;
    }

    
    public void setSectortxt(javax.swing.JComboBox<String> sectortxt) {
        this.sectortxt = sectortxt;
    }

    public String getTipotxt() {
        return tipotxt.getSelectedItem().toString();
    }

    public void setTipotxt(javax.swing.JComboBox<String> tipotxt) {
        this.tipotxt = tipotxt;
    }

    public Double getValortxt() {
        return Double.valueOf(valortxt.getText());
    }

    public void setValortxt(javax.swing.JTextField valortxt) {
        this.valortxt = valortxt;
    }

    public void cargarDatosComboBox(Agregaranimales vista) {
        // Cargar especies
        especietxt.removeAllItems();
        ArrayList<Especie> especies = Controlador.getEspecies();
        for (Especie especie : especies) {
            especietxt.addItem(especie.getNombre());
        }

        
        
        sectortxt.removeAllItems();
        ArrayList<Sector> sectores = Controlador.getSectores();
        for (Sector sector : sectores) {
            sectortxt.addItem(String.valueOf(sector.getNumero()));
        }

        
        paistxt.removeAllItems();
        ArrayList<Pais> paises = Controlador.getPaises();
        for (Pais pais : paises) {
            paistxt.addItem(pais.getNombre());
        }

        
        tipotxt.removeAllItems();
        for (TipoAlimentacion tipo : Controlador.getTiposAlimentacion()) {
            tipotxt.addItem(tipo.toString());

        }

        
    }

    
    public void habilitarValorfijo() {
          String tipoSeleccionado = tipotxt.getSelectedItem().toString();
    if (tipoSeleccionado.equals(TipoAlimentacion.HERBIVORO.toString())) {
        valortxt.setEnabled(true);
    } else {
        valortxt.setEnabled(false);
    }
}


     private void inicializarEventos() {
    tipotxt.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String selecciontxt = tipotxt.getSelectedItem().toString();
            if (selecciontxt.equals(TipoAlimentacion.HERBIVORO.toString())) {
                valortxt.setEnabled(true);
            } else {
                valortxt.setEnabled(false);
            }
        }
    });
}
    
    
    
    
    
}
