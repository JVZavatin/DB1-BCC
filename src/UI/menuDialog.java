package UI;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author André Schwerz
 */
public class menuDialog extends javax.swing.JFrame {

    public menuDialog() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            initComponents();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
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

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnProdutoras = new javax.swing.JButton();
        btnPaises = new javax.swing.JButton();
        btnDiretores = new javax.swing.JButton();
        btnAtores = new javax.swing.JButton();
        btnGeneros = new javax.swing.JButton();
        btnFilmes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de Filmes");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnProdutoras.setText("PROD.");
        btnProdutoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutorasActionPerformed(evt);
            }
        });

        btnPaises.setText("PAISES");
        btnPaises.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaisesActionPerformed(evt);
            }
        });

        btnDiretores.setText("DIRETORES");
        btnDiretores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiretoresActionPerformed(evt);
            }
        });

        btnAtores.setText("ATORES");
        btnAtores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtoresActionPerformed(evt);
            }
        });

        btnGeneros.setText("GENEROS");
        btnGeneros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerosActionPerformed(evt);
            }
        });

        btnFilmes.setText("FILMES");
        btnFilmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilmesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAtores, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDiretores, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFilmes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnPaises, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProdutoras, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGeneros, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProdutoras, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPaises, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGeneros, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtores, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDiretores, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFilmes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro de Filmes");
        jLabel1.setToolTipText("");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnProdutorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutorasActionPerformed
       // ProdutoraJDialog form = new ProdutoraJDialog(null, true);
        //form.setLocationRelativeTo(null);
        //form.setVisible(true);        
    }//GEN-LAST:event_btnProdutorasActionPerformed

    private void btnDiretoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiretoresActionPerformed
        // TODO add your handling code here:
        DiretorDialog form = new DiretorDialog();
        form.setLocationRelativeTo(null);
        form.setVisible(true); 
    }//GEN-LAST:event_btnDiretoresActionPerformed

    private void btnPaisesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaisesActionPerformed
        PaisDialog form = new PaisDialog();
        form.setLocationRelativeTo(null);
        form.setVisible(true);
    }//GEN-LAST:event_btnPaisesActionPerformed

    private void btnAtoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtoresActionPerformed
        AtorDialog form = new AtorDialog();
        form.setLocationRelativeTo(null);
        form.setVisible(true);
    }//GEN-LAST:event_btnAtoresActionPerformed

    private void btnGenerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerosActionPerformed
        GeneroDialog form = new GeneroDialog();
        form.setLocationRelativeTo(null);
        form.setVisible(true);
    }//GEN-LAST:event_btnGenerosActionPerformed

    private void btnFilmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilmesActionPerformed
        try {
            FilmeDialog form = new FilmeDialog();
            form.setLocationRelativeTo(null);
            form.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(menuDialog.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(menuDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnFilmesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtores;
    private javax.swing.JButton btnDiretores;
    private javax.swing.JButton btnFilmes;
    private javax.swing.JButton btnGeneros;
    private javax.swing.JButton btnPaises;
    private javax.swing.JButton btnProdutoras;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
