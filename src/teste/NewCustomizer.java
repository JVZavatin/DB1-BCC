/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.sql.SQLException;
import java.util.List;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author a1511335
 */
public class NewCustomizer extends javax.swing.JPanel implements java.beans.Customizer {
    
    private Object bean;

    /**
     * Creates new customizer NewCustomizer
     */
    public NewCustomizer() {
        initComponents();
    }
    
    public void setObject(Object bean) {
        this.bean = bean;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the FormEditor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        Filme = new javax.swing.JPanel();
        try {
            jScrollPane1 =(javax.swing.JScrollPane)java.beans.Beans.instantiate(getClass().getClassLoader(), "teste.NewCustomizer_jScrollPane1");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        JTableFilmes = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtNome = new java.awt.TextField();
        txtAno = new java.awt.TextField();
        jLabelNome = new javax.swing.JLabel();
        jLabelDiretor = new javax.swing.JLabel();
        CBPais = new javax.swing.JComboBox<>();
        jLabelAno = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabelAtores = new javax.swing.JLabel();
        Novo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("Atores", jPanel2);

        Filme.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTableFilmes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(JTableFilmes);

        Filme.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 5, 630, 230));

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "REGISTRO DE FILMES"));
        jPanel1.setToolTipText("");
        jPanel1.setAlignmentX(0.2F);
        jPanel1.setAlignmentY(0.7F);
        jPanel1.setName("Filmes_Tab_Panel"); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNome.setName("txtNome"); // NOI18N
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 220, 20));
        txtNome.getAccessibleContext().setAccessibleName("txtNome");
        txtNome.getAccessibleContext().setAccessibleDescription("");

        txtAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnoActionPerformed(evt);
            }
        });
        jPanel1.add(txtAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 70, -1));
        txtAno.getAccessibleContext().setAccessibleName("Ano");

        jLabelNome.setText("Nome:");
        jLabelNome.setAlignmentX(1.0F);
        jPanel1.add(jLabelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 20));
        jLabelNome.getAccessibleContext().setAccessibleName("Nome:");

        jLabelDiretor.setText("Diretor :");
        jLabelDiretor.setAlignmentX(1.0F);
        jLabelDiretor.setName(""); // NOI18N
        jPanel1.add(jLabelDiretor, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 70, 20));
        jLabelDiretor.getAccessibleContext().setAccessibleName("jLabelDiretor");

        CBPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CBPais.setEnabled(false);
        CBPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBPaisActionPerformed(evt);
            }
        });
        jPanel1.add(CBPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 210, -1));

        jLabelAno.setText("Ano :");
        jLabelAno.setAlignmentX(1.0F);
        jPanel1.add(jLabelAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 70, 20));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 220, 70));

        jLabelAtores.setText("Atores :");
        jLabelAtores.setAlignmentX(1.0F);
        jLabelAtores.setName(""); // NOI18N
        jPanel1.add(jLabelAtores, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 70, 20));
        jLabelAtores.getAccessibleContext().setAccessibleName("Atores");

        Filme.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 630, 140));
        jPanel1.getAccessibleContext().setAccessibleName("REGISTRO DE FILMES");

        Novo.setText("Novo");
        Filme.add(Novo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        btnSalvar.setText("Salvar");
        btnSalvar.setActionCommand("btnAlterar");
        btnSalvar.setEnabled(false);
        btnSalvar.setPreferredSize(new java.awt.Dimension(90, 29));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        Filme.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 100, 30));

        btnRemover.setText("Remover");
        btnRemover.setActionCommand("btnRemover");
        btnRemover.setEnabled(false);
        btnRemover.setPreferredSize(new java.awt.Dimension(90, 29));
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });
        Filme.add(btnRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 100, 30));

        btnCancelar.setText("Cancelar");
        btnCancelar.setActionCommand("btnImprimir");
        btnCancelar.setEnabled(false);
        btnCancelar.setPreferredSize(new java.awt.Dimension(90, 29));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        Filme.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 100, 30));

        btnFechar.setText("Fechar");
        btnFechar.setActionCommand("btnFechar");
        btnFechar.setPreferredSize(new java.awt.Dimension(90, 29));
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });
        Filme.add(btnFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 100, 30));

        jTabbedPane1.addTab("Filme", Filme);
        Filme.getAccessibleContext().setAccessibleName("Filme_Tab");

        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 575));
        jTabbedPane1.getAccessibleContext().setAccessibleName("jPanelTabs");
        jTabbedPane1.getAccessibleContext().setAccessibleDescription("");

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnoActionPerformed

    private void CBPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBPaisActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        int dialogResult = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja salvar esse registro?", "Confirmação?", JOptionPane.YES_NO_OPTION);

        if (dialogResult == JOptionPane.YES_OPTION) {
            try {
                if (addRecord == true) {
                    addNew();
                } else {
                    updateRecord();
                }
                addRecord = false;

                txtSigla.setEnabled(false);
                txtNome.setEnabled(false);

                enableButtons(true, false, false, false);

                loadRecords();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed

        if (!txtSigla.getText().isEmpty()) {
            int dialogResult = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja excluir esse registro?", "Confirmação?", JOptionPane.YES_NO_OPTION);

            if (dialogResult == JOptionPane.YES_OPTION) {
                try {
                    deleteRecord();
                    loadRecords();
                    clearInputBoxes();
                    enableButtons(true, false, false, false);

                    txtNome.setEnabled(false);

                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        clearInputBoxes();
        enableButtons(true, false, false, false);
        addRecord = false;
        txtSigla.setEnabled(false);
        txtNome.setEnabled(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    
    private void loadRecords() throws SQLException {
        String sql = "SELECT Nome, Ano, Diretor_NomeDiretor FROM Filme ORDER BY Nome";
        ResultSetTableModel tableModel = new ResultSetTableModel(sql);
        JTableFilmes.setModel(tableModel);
        
        JTableFilmes.getColumnModel().getColumn(0).setWidth(50);
        JTableFilmes.getColumnModel().getColumn(0).setMinWidth(50);
        JTableFilmes.getColumnModel().getColumn(0).setMaxWidth(50);
        
        JTableFilmes.getSelectionModel().addListSelectionListener((ListSelectionEvent event) -> {
            try {
                if (JTableFilmes.getSelectedRow() >= 0) {
                    Object n = JTableFilmes.getValueAt(JTableFilmes.getSelectedRow(), 0);
                    Object a = JTableFilmes.getValueAt(JTableFilmes.getSelectedRow(), 1);
                    Object d = JTableFilmes.getValueAt(JTableFilmes.getSelectedRow(), 2);

                    txtNome.setText(n.toString());
                    txtAno.setText(a.toString());
                    txtDiretor.setText(d.toString());
                    
                    
                    txtNome.setEnabled(true);
                    enableButtons(false, true, true, true);
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        });
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(SwingConstants.LEFT);
        JTableFilmes.getColumnModel().getColumn(0).setCellRenderer(rightRenderer);
    }
    
     public void enableButtons(boolean novo, boolean salvar, boolean cancelar, boolean remover){
        btnNovo.setEnabled(novo);
        btnSalvar.setEnabled(salvar);
        btnCancelar.setEnabled(cancelar);
        btnRemover.setEnabled(remover);
    }
     
    private void fillCBPais() throws SQLException {
        PaisDAO dao = new PaisDAO();
        List<Pais> paises = dao.list();
        CBPais.removeAllItems();
        for(Pais p : paises){
            CBPais.addItem(p.getSigla());
        }
    } // METODO PARA PREENCHER A COMBOBOX DE DIRETORES
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBPais;
    private javax.swing.JPanel Filme;
    private javax.swing.JTable JTableFilmes;
    private javax.swing.JButton Novo;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabelAno;
    private javax.swing.JLabel jLabelAtores;
    private javax.swing.JLabel jLabelDiretor;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private java.awt.TextField txtAno;
    private java.awt.TextField txtNome;
    // End of variables declaration//GEN-END:variables
}