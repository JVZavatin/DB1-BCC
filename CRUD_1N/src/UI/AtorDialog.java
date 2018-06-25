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
import MODEL.Ator;
import DAO.PaisDAO;
import DAO.AtorDAO;
import java.awt.Color;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author alan
 */
public class AtorDialog extends javax.swing.JDialog {
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");

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
    
    public AtorDialog() {
        //super(modal);
     initComponents();
     try {
            loadRecords();
            fillCBBPais();
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
        jLabelAtorNome = new javax.swing.JLabel();
        txtAtorNome = new java.awt.TextField();
        jLabelAtorData = new javax.swing.JLabel();
        txtAtorData = new javax.swing.JFormattedTextField();
        cbbPais = new javax.swing.JComboBox<>();
        jLabelAtorPais = new javax.swing.JLabel();
        btnNovoAtor = new javax.swing.JButton();
        btnSalvarAtor = new javax.swing.JButton();
        btnRemoverAtor = new javax.swing.JButton();
        btnCancelarAtor = new javax.swing.JButton();
        btnFecharAtor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableAtor = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        PainelGenero.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(254, 254, 254));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "REGISTRO DE ATORES"));
        jPanel10.setToolTipText("");
        jPanel10.setAlignmentX(0.2F);
        jPanel10.setAlignmentY(0.7F);
        jPanel10.setName("Pais_Tab_Panel"); // NOI18N
        jPanel10.setRequestFocusEnabled(false);
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelAtorNome.setText("Nome:");
        jLabelAtorNome.setAlignmentX(1.0F);
        jPanel10.add(jLabelAtorNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 50, 20));

        txtAtorNome.setBackground(java.awt.SystemColor.activeCaptionBorder);
        txtAtorNome.setEnabled(false);
        txtAtorNome.setName("txtNome"); // NOI18N
        txtAtorNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAtorNomeKeyTyped(evt);
            }
        });
        jPanel10.add(txtAtorNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 470, 20));

        jLabelAtorData.setText("Data:");
        jLabelAtorData.setAlignmentX(1.0F);
        jPanel10.add(jLabelAtorData, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 40, 20));

        txtAtorData.setBackground(java.awt.SystemColor.activeCaptionBorder);
        try {
            txtAtorData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtAtorData.setEnabled(false);
        txtAtorData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAtorDataActionPerformed(evt);
            }
        });
        jPanel10.add(txtAtorData, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 110, -1));

        cbbPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel10.add(cbbPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 180, -1));

        jLabelAtorPais.setText("Pais");
        jLabelAtorPais.setAlignmentX(1.0F);
        jPanel10.add(jLabelAtorPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 40, 20));

        PainelGenero.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 630, 140));

        btnNovoAtor.setText("Novo");
        btnNovoAtor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoAtorActionPerformed(evt);
            }
        });
        PainelGenero.add(btnNovoAtor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 70, -1));

        btnSalvarAtor.setText("Salvar");
        btnSalvarAtor.setActionCommand("btnAlterar");
        btnSalvarAtor.setPreferredSize(new java.awt.Dimension(90, 29));
        btnSalvarAtor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAtorActionPerformed(evt);
            }
        });
        PainelGenero.add(btnSalvarAtor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 100, 30));

        btnRemoverAtor.setText("Remover");
        btnRemoverAtor.setActionCommand("btnRemover");
        btnRemoverAtor.setEnabled(false);
        btnRemoverAtor.setPreferredSize(new java.awt.Dimension(90, 29));
        btnRemoverAtor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverAtorActionPerformed(evt);
            }
        });
        PainelGenero.add(btnRemoverAtor, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 100, 30));

        btnCancelarAtor.setText("Cancelar");
        btnCancelarAtor.setActionCommand("btnImprimir");
        btnCancelarAtor.setEnabled(false);
        btnCancelarAtor.setPreferredSize(new java.awt.Dimension(90, 29));
        btnCancelarAtor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarAtorActionPerformed(evt);
            }
        });
        PainelGenero.add(btnCancelarAtor, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 100, 30));

        btnFecharAtor.setText("Fechar");
        btnFecharAtor.setActionCommand("btnFechar");
        btnFecharAtor.setPreferredSize(new java.awt.Dimension(90, 29));
        btnFecharAtor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharAtorActionPerformed(evt);
            }
        });
        PainelGenero.add(btnFecharAtor, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 100, 30));

        JTableAtor.setModel(new javax.swing.table.DefaultTableModel(
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
        JTableAtor.setName(""); // NOI18N
        jScrollPane1.setViewportView(JTableAtor);

        PainelGenero.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 610, 240));

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

    private void btnSalvarAtorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAtorActionPerformed
        //Date enteredDate = (Date)dateField.getValue(); pegandod valores de um formatted text field data com simple date format
        
         if (txtAtorData.getText().length()<7){ // Evita que um valor '' seja inserido no banco
                        
                        JOptionPane.showMessageDialog(null,"Data invalida!");
                        
                    } else {
             
             
              if (txtAtorNome.getText().length()<1){ 
                        
                        JOptionPane.showMessageDialog(null,"Nome vazio!");
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

                        txtAtorNome.setEnabled(false);
                        txtAtorData.setEnabled(false);

                        txtAtorNome.setBackground(Color.gray);
                        txtAtorData.setBackground(Color.gray);

                        enableButtons(true, false, false, false);
                        clearInputBoxes();
                        enableFields(false);

                        loadRecords();

                    } catch (IOException | ClassNotFoundException | SQLException ex) {
                        System.out.println(ex.getMessage());
                   
                }
            }
        }
         }
    
    }//GEN-LAST:event_btnSalvarAtorActionPerformed

 
    private void btnRemoverAtorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverAtorActionPerformed
        if (!txtAtorData.getText().isEmpty()) {
            int dialogResult = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja excluir esse registro?", "Confirmação?", JOptionPane.YES_NO_OPTION);

            if (dialogResult == JOptionPane.YES_OPTION) {
                try {
                    deleteRecord();
                    loadRecords();
                    clearInputBoxes();
                    enableButtons(true, false, false, false);
                    
                    txtAtorData.setEnabled(false);
                    txtAtorData.setBackground(Color.gray);
                    
                    txtAtorNome.setEnabled(false);
                    txtAtorNome.setBackground(Color.gray);
                    
                    //cbbPais.setEnabled(false);
                    //cbbPais.setBackground(Color.gray);
                    
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }//GEN-LAST:event_btnRemoverAtorActionPerformed

    private void btnCancelarAtorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarAtorActionPerformed
        clearInputBoxes();
        enableButtons(true, false, false, false);
        addRecord = false;
        
        txtAtorNome.setEnabled(false);
        txtAtorData.setEnabled(false);
        
        txtAtorNome.setBackground(Color.gray);
        txtAtorData.setBackground(Color.gray);
    }//GEN-LAST:event_btnCancelarAtorActionPerformed

    private void btnFecharAtorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharAtorActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharAtorActionPerformed

    private void btnNovoAtorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoAtorActionPerformed
        addRecord = true;
    
        clearInputBoxes();
        
        /*if (txtGeneroNome.getText().length()<1 ){ // Evita que um valor '' seja inserido no banco
                        enableButtons(false, true, true, false);  
                    } else {
                        enableButtons(false, true, true, true);
                    }
        */ // não é aaqui
                    
        
        txtAtorNome.setEnabled(true);
        txtAtorData.setEnabled(true);
        cbbPais.setEnabled(true);
        
        txtAtorNome.setBackground(Color.white);
        txtAtorData.setBackground(Color.white);
        cbbPais.setBackground(Color.white);
        
        enableButtons(false, true, true, false);
        
        txtAtorNome.requestFocus();
    }//GEN-LAST:event_btnNovoAtorActionPerformed

    private void txtAtorNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAtorNomeKeyTyped
       if (txtAtorNome.getText().length() >= 100 ) // limit textfield to 3 characters
            evt.consume();  
    }//GEN-LAST:event_txtAtorNomeKeyTyped

    private void txtAtorDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAtorDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAtorDataActionPerformed

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
            java.util.logging.Logger.getLogger(AtorDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtorDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtorDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtorDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AtorDialog dialog = new AtorDialog();//new javax.swing.JFrame(), true);
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
        txtAtorData.setText("");
        txtAtorNome.setText("");
       
    }
    
    private void addNew() throws SQLException, ClassNotFoundException, IOException{
       
        PaisDAO paisDAO = new PaisDAO();
        
        Ator a= new Ator();
        AtorDAO atorDAO = new AtorDAO();
        
        a.setNome(txtAtorNome.getText());
        
        Date data = null;
        String sData= txtAtorData.getText();
        try {
        data = formatter.parse(sData);
               
        }catch (ParseException e) {    
        }
                
        a.setDataNasc(data);    
        a.setPais(paisDAO.find((String) cbbPais.getSelectedItem()));
        
        atorDAO.insert(a);
    }

    private void updateRecord() throws SQLException {
        Ator a = new Ator();
        //Pais p = new Pais();
        PaisDAO paisDAO = new PaisDAO();
        
        
        
        Date data = null;
        String sData= txtAtorData.getText();
        try {
        data = formatter.parse(sData);
               
        }catch (ParseException e) {    
        }
        
        a.setNome(txtAtorNome.getText());        
        a.setDataNasc(data);
        a.setPais(paisDAO.find((String)cbbPais.getSelectedItem()));
        
        //Object id = JTableAtor.getValueAt(JTableAtor.getSelectedRow(), 0);
        AtorDAO atorDAO = new AtorDAO();
        atorDAO.update(a);//(p,id.toString());
    }

    private void deleteRecord() throws SQLException {
        AtorDAO atorDAO = new AtorDAO();
        atorDAO.remove(txtAtorNome.getText());
    }
    
    private void loadRecords() throws SQLException {
        
        String sql = "SELECT A.NomeAtor as Nome, A.DataNascimento as 'Nascido em ', A.Pais_Sigla as 'Sigla do Pais' FROM Filme.Ator as A , Filme.Pais as P WHERE A.Pais_Sigla = P.Sigla;";
        ResultSetTableModel tableModel = new ResultSetTableModel(sql);
        JTableAtor.setModel(tableModel);
        
          //Hiding column "id" and equipe_id 
        //JTableAtor.removeColumn(JTableAtor.getColumnModel().getColumn(0));
        //JTableAtor.removeColumn(JTableAtor.getColumnModel().getColumn(1));
        
         //Adjusting columns 
        JTableAtor.getColumnModel().getColumn(0).setMinWidth(120);//"Nome
        JTableAtor.getColumnModel().getColumn(1).setMinWidth(200);//"Nascido em
        JTableAtor.getColumnModel().getColumn(2).setMaxWidth(50); //"Sigla do pais"
        //JTableAtor.getColumnModel().getColumn(3).setMaxWidth(40); //"status"
       
        JTableAtor.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent event) {
                try {
                    if (JTableAtor.getSelectedRow() >= 0) {
                        Object nome = JTableAtor.getModel().getValueAt(JTableAtor.getSelectedRow(), 0);
                        Object dataNasc = JTableAtor.getModel().getValueAt(JTableAtor.getSelectedRow(), 1);
                        //Object equipe_id = JTableAtor.getModel().getValueAt(JTableAtor.getSelectedRow(), 2);
                        Object pais_sigla = JTableAtor.getModel().getValueAt(JTableAtor.getSelectedRow(), 2);
                        //Object status = JTableAtor.getModel().getValueAt(JTableAtor.getSelectedRow(), 5).toString();
                        //String data= nome.toString();
                        //String teste=data.replace(0, 0);
                        txtAtorNome.setText(nome.toString());
                        txtAtorData.setText(dataNasc.toString().replace('-','/'));
                        //txtAtorData.setText("1111/11/11");
                        cbbPais.setSelectedItem(pais_sigla.toString());
                        
                        //EquipeDAO eDao = new EquipeDAO();
                        //Equipe e = eDao.find(Integer.parseInt(equipe_id.toString()));
                        //txtEquipeNome.setText(e.getNome());             
                        
                        //CBStatus.setSelected(status.equals("true"));
                        
                        enableButtons(false, true, true, true);
                        enableFields(true);
                    }
                } catch (NumberFormatException ex) {
                    //                } catch (IOException | ClassNotFoundException | NumberFormatException | SQLException ex) {

                    System.out.println(ex.getMessage());
                }
            }
        });

        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(SwingConstants.LEFT);
        JTableAtor.getColumnModel().getColumn(0).setCellRenderer(rightRenderer);
    }
    
    
    private void fillCBBPais() throws SQLException {
        PaisDAO dao = new PaisDAO();
        List<Pais> paises = dao.list();
        cbbPais.removeAllItems();
        for(Pais p : paises){
            cbbPais.addItem(p.getSigla());
        }        
    }
    
     public void enableButtons(boolean novo, boolean salvar, boolean cancelar, boolean remover){
        btnNovoAtor.setEnabled(novo);
        btnSalvarAtor.setEnabled(salvar);
        btnCancelarAtor.setEnabled(cancelar);
        btnRemoverAtor.setEnabled(remover);
    
     }
     
     private void enableFields(boolean flag) {
        cbbPais.setEnabled(flag);
        txtAtorData.setEnabled(flag);
        txtAtorNome.setEnabled(flag);
        //btnBuscaEquipe.setEnabled(flag);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableAtor;
    private javax.swing.JPanel PainelGenero;
    private javax.swing.JButton btnCancelarAtor;
    private javax.swing.JButton btnFecharAtor;
    private javax.swing.JButton btnNovoAtor;
    private javax.swing.JButton btnRemoverAtor;
    private javax.swing.JButton btnSalvarAtor;
    private javax.swing.JComboBox<String> cbbPais;
    private javax.swing.JLabel jLabelAtorData;
    private javax.swing.JLabel jLabelAtorNome;
    private javax.swing.JLabel jLabelAtorPais;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField txtAtorData;
    private java.awt.TextField txtAtorNome;
    // End of variables declaration//GEN-END:variables
}