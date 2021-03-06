/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableCellRenderer;
import MODEL.Pais;
import DAO.PaisDAO;
import java.awt.Color;
import javax.swing.JDialog;

/**
 *
 * @author alan
 */
public class PaisDialog extends javax.swing.JDialog {

    /**
     * Creates new form NewJDialog
     */
    /*public GeneroDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
     try {
            loadRecords();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    */
    
    public PaisDialog() {
        //super(modal);
     initComponents();
     try {
            loadRecords();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelGenero = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabelPaisNome = new javax.swing.JLabel();
        txtPaisNome = new java.awt.TextField();
        jLabelPaisSigla = new javax.swing.JLabel();
        txtPaisSigla = new java.awt.TextField();
        jLabelPaisSiglas = new javax.swing.JLabel();
        btnNovoPais = new javax.swing.JButton();
        btnSalvarPais = new javax.swing.JButton();
        btnRemoverPais = new javax.swing.JButton();
        btnCancelarPais = new javax.swing.JButton();
        btnFecharPais = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTablePais = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        PainelGenero.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(254, 254, 254));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "REGISTRO DE PAIS"));
        jPanel10.setToolTipText("");
        jPanel10.setAlignmentX(0.2F);
        jPanel10.setAlignmentY(0.7F);
        jPanel10.setName("Pais_Tab_Panel"); // NOI18N
        jPanel10.setRequestFocusEnabled(false);
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelPaisNome.setText("Nome:");
        jLabelPaisNome.setAlignmentX(1.0F);
        jPanel10.add(jLabelPaisNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 50, 20));

        txtPaisNome.setBackground(java.awt.SystemColor.activeCaptionBorder);
        txtPaisNome.setEnabled(false);
        txtPaisNome.setName("txtNome"); // NOI18N
        txtPaisNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPaisNomeKeyTyped(evt);
            }
        });
        jPanel10.add(txtPaisNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 340, 30));

        jLabelPaisSigla.setText("Sigla:");
        jLabelPaisSigla.setAlignmentX(1.0F);
        jPanel10.add(jLabelPaisSigla, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 40, 20));

        txtPaisSigla.setBackground(java.awt.SystemColor.activeCaptionBorder);
        txtPaisSigla.setEnabled(false);
        txtPaisSigla.setName("txtNome"); // NOI18N
        txtPaisSigla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPaisSiglaKeyTyped(evt);
            }
        });
        jPanel10.add(txtPaisSigla, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 80, 20));

        jLabelPaisSiglas.setText(" Siglas :goo.gl/eToAVX");
        jLabelPaisSiglas.setAlignmentX(1.0F);
        jLabelPaisSiglas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPaisSiglasMouseClicked(evt);
            }
        });
        jPanel10.add(jLabelPaisSiglas, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 160, 20));

        PainelGenero.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 630, 110));

        btnNovoPais.setText("Novo");
        btnNovoPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoPaisActionPerformed(evt);
            }
        });
        PainelGenero.add(btnNovoPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 70, -1));

        btnSalvarPais.setText("Salvar");
        btnSalvarPais.setActionCommand("btnAlterar");
        btnSalvarPais.setPreferredSize(new java.awt.Dimension(90, 29));
        btnSalvarPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarPaisActionPerformed(evt);
            }
        });
        PainelGenero.add(btnSalvarPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 100, 30));

        btnRemoverPais.setText("Remover");
        btnRemoverPais.setActionCommand("btnRemover");
        btnRemoverPais.setEnabled(false);
        btnRemoverPais.setPreferredSize(new java.awt.Dimension(90, 29));
        btnRemoverPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverPaisActionPerformed(evt);
            }
        });
        PainelGenero.add(btnRemoverPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 100, 30));

        btnCancelarPais.setText("Cancelar");
        btnCancelarPais.setActionCommand("btnImprimir");
        btnCancelarPais.setEnabled(false);
        btnCancelarPais.setPreferredSize(new java.awt.Dimension(90, 29));
        btnCancelarPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarPaisActionPerformed(evt);
            }
        });
        PainelGenero.add(btnCancelarPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 100, 30));

        btnFecharPais.setText("Fechar");
        btnFecharPais.setActionCommand("btnFechar");
        btnFecharPais.setPreferredSize(new java.awt.Dimension(90, 29));
        btnFecharPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharPaisActionPerformed(evt);
            }
        });
        PainelGenero.add(btnFecharPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 100, 30));

        JTablePais.setModel(new javax.swing.table.DefaultTableModel(
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
        JTablePais.setName(""); // NOI18N
        jScrollPane1.setViewportView(JTablePais);

        PainelGenero.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 610, 250));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 648, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PainelGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PainelGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarPaisActionPerformed
        
        
         if (txtPaisSigla.getText().length() != 3){ // Evita que um valor '' seja inserido no banco
                        //enableButtons(false, true, true, false);
                        JOptionPane.showMessageDialog(null,"Sigla deve ter 3 caracteres!");
                        
                    } else {
                        //enableButtons(false, true, true, true);
                    
        int dialogResult = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja salvar esse registro?", "Confirmação?", JOptionPane.YES_NO_OPTION);
        
        
            if (dialogResult == JOptionPane.YES_OPTION) {
                try {
                    if (addRecord == true) {
                        addNew();

                    } else {


                        updateRecord();
                    }
                    addRecord = false;

                    txtPaisNome.setEnabled(false);
                    txtPaisSigla.setEnabled(false);

                    txtPaisNome.setBackground(Color.gray);
                    txtPaisSigla.setBackground(Color.gray);

                    enableButtons(true, false, false, false);

                    loadRecords();

                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
         }
    }//GEN-LAST:event_btnSalvarPaisActionPerformed

 
    private void btnRemoverPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverPaisActionPerformed
        if (!txtPaisSigla.getText().isEmpty()) {
            int dialogResult = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja excluir esse registro?", "Confirmação?", JOptionPane.YES_NO_OPTION);

            if (dialogResult == JOptionPane.YES_OPTION) {
                try {
                    deleteRecord();
                    loadRecords();
                    clearInputBoxes();
                    enableButtons(true, false, false, false);
                    
                    txtPaisSigla.setEnabled(false);
                    txtPaisSigla.setBackground(Color.gray);
                    
                    txtPaisNome.setEnabled(false);
                    txtPaisNome.setBackground(Color.gray);
                    
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }//GEN-LAST:event_btnRemoverPaisActionPerformed

    private void btnCancelarPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarPaisActionPerformed
        clearInputBoxes();
        enableButtons(true, false, false, false);
        addRecord = false;
        
        txtPaisNome.setEnabled(false);
        txtPaisSigla.setEnabled(false);
        
        txtPaisNome.setBackground(Color.gray);
        txtPaisSigla.setBackground(Color.gray);
    }//GEN-LAST:event_btnCancelarPaisActionPerformed

    private void btnFecharPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharPaisActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharPaisActionPerformed

    private void btnNovoPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoPaisActionPerformed
        addRecord = true;
    
        clearInputBoxes();
        
        /*if (txtGeneroNome.getText().length()<1 ){ // Evita que um valor '' seja inserido no banco
                        enableButtons(false, true, true, false);  
                    } else {
                        enableButtons(false, true, true, true);
                    }
        */ // não é aaqui
                    
        
        txtPaisNome.setEnabled(true);
        txtPaisSigla.setEnabled(true);
        
        txtPaisNome.setBackground(Color.white);
        txtPaisSigla.setBackground(Color.white);
        
        enableButtons(false, true, true, false);
        
        txtPaisSigla.requestFocus();
    }//GEN-LAST:event_btnNovoPaisActionPerformed

    private void txtPaisSiglaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaisSiglaKeyTyped
       if (txtPaisSigla.getText().length() < 2 ||txtPaisSigla.getText().length() > 2 ){ // limit textfield to 20 characters
           txtPaisSigla.setBackground(Color.red);
           
           //evt.consume();
       } else {
           txtPaisSigla.setBackground(Color.white);
       }
    }//GEN-LAST:event_txtPaisSiglaKeyTyped

    private void txtPaisNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaisNomeKeyTyped
       if (txtPaisNome.getText().length() >= 100 ) // limit textfield to 3 characters
            evt.consume();  
    }//GEN-LAST:event_txtPaisNomeKeyTyped

    private void jLabelPaisSiglasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPaisSiglasMouseClicked
        // TODO add your handling code here:
        // https://goo.gl/eToAVX abrir navegador para o link 
    }//GEN-LAST:event_jLabelPaisSiglasMouseClicked

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
            java.util.logging.Logger.getLogger(PaisDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaisDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaisDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaisDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PaisDialog dialog = new PaisDialog();//new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    boolean addRecord = false;

    private void clearInputBoxes() {
        txtPaisSigla.setText("");
        txtPaisNome.setText("");
    }
    
    private void addNew() throws SQLException {
        Pais p = new Pais();
        p.setSigla(txtPaisSigla.getText());
        p.setNome(txtPaisNome.getText());
        PaisDAO dao = new PaisDAO();
        dao.insert(p);
    }

    private void updateRecord() throws SQLException {
        Pais p = new Pais();
        p.setSigla(txtPaisSigla.getText());
        p.setNome(txtPaisNome.getText());
        Object id = JTablePais.getValueAt(JTablePais.getSelectedRow(), 0);
        PaisDAO dao = new PaisDAO();
        dao.update(p,id.toString());
    }

    private void deleteRecord() throws SQLException {
        PaisDAO dao = new PaisDAO();
        
        dao.remove(txtPaisSigla.getText());
    }
    
    private void loadRecords() throws SQLException {
        String sql = "SELECT Sigla, Nome FROM Filme.Pais ORDER BY Nome";
        ResultSetTableModel tableModel = new ResultSetTableModel(sql);
        JTablePais.setModel(tableModel);
        
        JTablePais.getColumnModel().getColumn(0).setWidth(50);
        JTablePais.getColumnModel().getColumn(0).setMinWidth(50);
        //JTableGenero.getColumnModel().getColumn(0).setMaxWidth(50);
        
        JTablePais.getSelectionModel().addListSelectionListener((ListSelectionEvent event) -> {
            try {
                if (JTablePais.getSelectedRow() >= 0) {
                    Object sigla = JTablePais.getValueAt(JTablePais.getSelectedRow(), 0);
                    Object nome = JTablePais.getValueAt(JTablePais.getSelectedRow(), 1);
                    //Object d = JTableGenero.getValueAt(JTableGenero.getSelectedRow(), 2);

                    txtPaisSigla.setText(sigla.toString());
                    txtPaisNome.setText(nome.toString());
                    
                    
                    
                    txtPaisSigla.setEnabled(true);
                    txtPaisNome.setEnabled(true);//teste
                    
                    txtPaisNome.setBackground(Color.white);
                    txtPaisSigla.setBackground(Color.white);// teste
                    
                    enableButtons(false, true, true, true);
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        });
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(SwingConstants.LEFT);
        JTablePais.getColumnModel().getColumn(0).setCellRenderer(rightRenderer);
    }
    
     public void enableButtons(boolean novo, boolean salvar, boolean cancelar, boolean remover){
        btnNovoPais.setEnabled(novo);
        btnSalvarPais.setEnabled(salvar);
        btnCancelarPais.setEnabled(cancelar);
        btnRemoverPais.setEnabled(remover);
    
     }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTablePais;
    private javax.swing.JPanel PainelGenero;
    private javax.swing.JButton btnCancelarPais;
    private javax.swing.JButton btnFecharPais;
    private javax.swing.JButton btnNovoPais;
    private javax.swing.JButton btnRemoverPais;
    private javax.swing.JButton btnSalvarPais;
    private javax.swing.JLabel jLabelPaisNome;
    private javax.swing.JLabel jLabelPaisSigla;
    private javax.swing.JLabel jLabelPaisSiglas;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.TextField txtPaisNome;
    private java.awt.TextField txtPaisSigla;
    // End of variables declaration//GEN-END:variables
}
