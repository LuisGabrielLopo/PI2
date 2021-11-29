/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesGraficas;
import javax.swing.JOptionPane;
import modelos.entidades.Cartoes;
import controle.CartaoControle;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luisg
 */
public class TelaCartao extends javax.swing.JFrame {
    CartaoControle objCartaoControle = new CartaoControle();

    /**
     * Creates new form TelaCartao
     */
    public TelaCartao() {
        initComponents();
        setLocationRelativeTo(null);
    }
    public void limparTela(){
        jTextFieldId.setText("");
        jTextFieldBandeira.setText("");
        jTextFieldNumeroDoCartao.setText("");
        jTextFieldNomeDoTuitular.setText("");
        jTextFieldCCV.setText("");
        jTextFieldLimite.setText("");
        jTextFieldDataDeVencimento.setText("");
        jTextFieldDataDeFechamento.setText("");
        jTextFieldDataDePagamento.setText("");
    }
    private void mostrarListagem() throws Exception {
        try {
            ArrayList<Cartoes> arrayDosCartoes = objCartaoControle.listagem();
            DefaultTableModel model = (DefaultTableModel) jTableTabelaCartao.getModel();
            model.setNumRows(0);
            
            for(int pos = 0; pos < arrayDosCartoes.size(); pos++){
                String[] saida = new String[6];
                Cartoes aux = arrayDosCartoes.get(pos);
                saida[0] = aux.getId() + "";
                saida[1] = aux.getBandeiraDoCartao();
                saida[2] = aux.getNumeroDoCartao();
                saida[3] = aux.getNomeDoTitular();
                saida[4] = aux.getCCV();
                saida[5] = aux.getLimiteDoCartao() + "";
                saida[6] = aux.getDataDeVencimento() + "";
                saida[7] = aux.getDataDeFechamento() + "";
                saida[8] = aux.getDataDePagamento() + "";
                model.addRow(saida);
            }
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
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

        jPanelMenuLateral = new javax.swing.JPanel();
        jButtonIncluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        Listar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jPanelTelaPrincipal = new javax.swing.JPanel();
        bandeiraDoCartaojLabel = new javax.swing.JLabel();
        NumeroDoCartaojLabel = new javax.swing.JLabel();
        NomeDoTitularjLabel = new javax.swing.JLabel();
        cCVjLabel = new javax.swing.JLabel();
        jTextFieldBandeira = new javax.swing.JTextField();
        jTextFieldNumeroDoCartao = new javax.swing.JTextField();
        jTextFieldNomeDoTuitular = new javax.swing.JTextField();
        jTextFieldLimite = new javax.swing.JTextField();
        jTextFieldCCV = new javax.swing.JTextField();
        limiteDoCartaojLabel = new javax.swing.JLabel();
        IdjLabel = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTabelaCartao = new javax.swing.JTable();
        dataDeVencimentojLabel = new javax.swing.JLabel();
        dataDeFechamentojLabel = new javax.swing.JLabel();
        dataDePagamentojLabel = new javax.swing.JLabel();
        jTextFieldDataDeVencimento = new javax.swing.JTextField();
        jTextFieldDataDeFechamento = new javax.swing.JTextField();
        jTextFieldDataDePagamento = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("C'Wallet - Cartões");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelMenuLateral.setBackground(new java.awt.Color(102, 102, 255));

        jButtonIncluir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonIncluir.setText("Confirmar");
        jButtonIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncluirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setText("C'Wallet");

        jButtonEditar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonExcluir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        Listar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Listar.setText("Listar");
        Listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarActionPerformed(evt);
            }
        });

        jButtonSair.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMenuLateralLayout = new javax.swing.GroupLayout(jPanelMenuLateral);
        jPanelMenuLateral.setLayout(jPanelMenuLateralLayout);
        jPanelMenuLateralLayout.setHorizontalGroup(
            jPanelMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLateralLayout.createSequentialGroup()
                .addGroup(jPanelMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMenuLateralLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel1))
                    .addGroup(jPanelMenuLateralLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanelMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanelMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonIncluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Listar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(40, 40, 40))
        );
        jPanelMenuLateralLayout.setVerticalGroup(
            jPanelMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLateralLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(100, 100, 100)
                .addComponent(jButtonIncluir)
                .addGap(50, 50, 50)
                .addComponent(jButtonEditar)
                .addGap(50, 50, 50)
                .addComponent(Listar)
                .addGap(50, 50, 50)
                .addComponent(jButtonExcluir)
                .addGap(50, 50, 50)
                .addComponent(jButtonSair)
                .addContainerGap(377, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelMenuLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        bandeiraDoCartaojLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bandeiraDoCartaojLabel.setText("Bandeira do cartão :");

        NumeroDoCartaojLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        NumeroDoCartaojLabel.setText("Número do cartão :");

        NomeDoTitularjLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        NomeDoTitularjLabel.setText("Nome do TItular :");

        cCVjLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cCVjLabel.setText("CCV :");

        jTextFieldBandeira.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jTextFieldNumeroDoCartao.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jTextFieldNomeDoTuitular.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jTextFieldLimite.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jTextFieldCCV.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        limiteDoCartaojLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        limiteDoCartaojLabel.setText("Limite do cartão :");

        IdjLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        IdjLabel.setText("ID :");

        jTextFieldId.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextFieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdActionPerformed(evt);
            }
        });

        jTableTabelaCartao.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTableTabelaCartao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Bandeira do cartão", "Número do cartão", "Nome do titular", "CCV", "LImite do cartão", "Data de vencimento", "Data de fechamento", "Data de pagamento"
            }
        ));
        jScrollPane1.setViewportView(jTableTabelaCartao);

        dataDeVencimentojLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        dataDeVencimentojLabel.setText("Data de vencimento :");

        dataDeFechamentojLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        dataDeFechamentojLabel.setText("Data de fechamento :");

        dataDePagamentojLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        dataDePagamentojLabel.setText("Data de pagamento :");

        jTextFieldDataDeVencimento.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jTextFieldDataDeFechamento.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jTextFieldDataDePagamento.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanelTelaPrincipalLayout = new javax.swing.GroupLayout(jPanelTelaPrincipal);
        jPanelTelaPrincipal.setLayout(jPanelTelaPrincipalLayout);
        jPanelTelaPrincipalLayout.setHorizontalGroup(
            jPanelTelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTelaPrincipalLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanelTelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanelTelaPrincipalLayout.createSequentialGroup()
                        .addGroup(jPanelTelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelTelaPrincipalLayout.createSequentialGroup()
                                .addGroup(jPanelTelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(limiteDoCartaojLabel)
                                    .addGroup(jPanelTelaPrincipalLayout.createSequentialGroup()
                                        .addComponent(cCVjLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldCCV, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldLimite, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelTelaPrincipalLayout.createSequentialGroup()
                                .addComponent(NomeDoTitularjLabel)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldNomeDoTuitular, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelTelaPrincipalLayout.createSequentialGroup()
                                .addGroup(jPanelTelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelTelaPrincipalLayout.createSequentialGroup()
                                        .addComponent(IdjLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelTelaPrincipalLayout.createSequentialGroup()
                                        .addComponent(bandeiraDoCartaojLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldBandeira, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelTelaPrincipalLayout.createSequentialGroup()
                                        .addComponent(NumeroDoCartaojLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldNumeroDoCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(311, 311, 311)
                                .addGroup(jPanelTelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanelTelaPrincipalLayout.createSequentialGroup()
                                        .addComponent(dataDePagamentojLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldDataDePagamento))
                                    .addGroup(jPanelTelaPrincipalLayout.createSequentialGroup()
                                        .addComponent(dataDeVencimentojLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldDataDeVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelTelaPrincipalLayout.createSequentialGroup()
                                        .addComponent(dataDeFechamentojLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldDataDeFechamento, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 288, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelTelaPrincipalLayout.setVerticalGroup(
            jPanelTelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTelaPrincipalLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanelTelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IdjLabel)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataDeVencimentojLabel)
                    .addComponent(jTextFieldDataDeVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanelTelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bandeiraDoCartaojLabel)
                    .addComponent(jTextFieldBandeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataDeFechamentojLabel)
                    .addComponent(jTextFieldDataDeFechamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanelTelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumeroDoCartaojLabel)
                    .addComponent(jTextFieldNumeroDoCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataDePagamentojLabel)
                    .addComponent(jTextFieldDataDePagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanelTelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeDoTitularjLabel)
                    .addComponent(jTextFieldNomeDoTuitular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanelTelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelTelaPrincipalLayout.createSequentialGroup()
                        .addGroup(jPanelTelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cCVjLabel)
                            .addComponent(jTextFieldCCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(limiteDoCartaojLabel))
                    .addComponent(jTextFieldLimite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        getContentPane().add(jPanelTelaPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 0, 1320, 950));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncluirActionPerformed
        // TODO add your handling code here:
        try {
            int id = Integer.parseInt(jTextFieldId.getText());
            String bandeiraDoCartao = jTextFieldBandeira.getText();
            String numeroDoCartao = jTextFieldNumeroDoCartao.getText();
            String nomeDoTitular = jTextFieldNomeDoTuitular.getText();
            String ccv = jTextFieldCCV.getText();
            double limite = Double.parseDouble(jTextFieldLimite.getText());
            //date dataDeVencimento = ;
            
           // Cartoes objCartao = new Cartoes(id, bandeiraDoCartao, numeroDoCartao, nomeDoTitular, ccv, limite, dataDeVencimento, dataDeFechamento, dataDePagamento);
           // objCartaoControle.incluir(objCartao);
            limparTela();
            mostrarListagem();
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
        
  
    }//GEN-LAST:event_jButtonIncluirActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        // TODO add your handling code here:
        try {
            String str  = jTextFieldId.getText();
            int id = Integer.parseInt(str);
            if(str.length() == 0) {
                throw new Exception("O Identificador esta VAZIO!");
            }
            Cartoes objCartoes = objCartaoControle.consultarPorId(id);
            if (objCartoes == null) {
                throw new Exception("Cartão não existe no sistema");
            }
            
            String bandeiraDoCartao = jTextFieldBandeira.getText();
            String numeroDoCartao = jTextFieldNumeroDoCartao.getText();
            String nomeDoTitular = jTextFieldNomeDoTuitular.getText();
            String ccv = jTextFieldCCV.getText();
            double limite = Double.parseDouble(jTextFieldLimite.getText());
            //Cartoes objCartoes1 = new Cartoes(id, bandeiraDoCartao, numeroDoCartao, nomeDoTitular, ccv, limite);
            
            //objCartaoControle.alterar(objCartoes1);
            limparTela();
            mostrarListagem();
           
        } catch (Exception e) {
        }
     
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jTextFieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // TODO add your handling code here:
        try {
            String str = jTextFieldId.getText();
            int id  = Integer.parseInt(str);
            if (str.length() == 0){
                throw new Exception("O identificador está vazio");
                
            }
            objCartaoControle.apagarPorId(id);
            limparTela();
            mostrarListagem();
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void ListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarActionPerformed
        // TODO add your handling code here:
        try {
            String str = jTextFieldId.getText();
            int id = Integer.parseInt(str);
            if (str.length() == 0){
                throw new Exception("O Identifcador está vazio!");
            }
            Cartoes objCartao = objCartaoControle.consultarPorId(id);
            if (objCartao == null){
                throw new Exception ("Cartão não existe no sistema ");
                
            }
            jTextFieldId.setText(objCartao.getId() + "" );
            jTextFieldBandeira.setText(objCartao.getBandeiraDoCartao()+ "");
            jTextFieldNumeroDoCartao.setText(objCartao.getNumeroDoCartao() + "");
            jTextFieldNomeDoTuitular.setText(objCartao.getNomeDoTitular() + "");
            jTextFieldCCV.setText(objCartao.getCCV()+ "");
            jTextFieldLimite.setText(objCartao.getLimiteDoCartao()+"");
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
    }//GEN-LAST:event_ListarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCartao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCartao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCartao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCartao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCartao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IdjLabel;
    private javax.swing.JButton Listar;
    private javax.swing.JLabel NomeDoTitularjLabel;
    private javax.swing.JLabel NumeroDoCartaojLabel;
    private javax.swing.JLabel bandeiraDoCartaojLabel;
    private javax.swing.JLabel cCVjLabel;
    private javax.swing.JLabel dataDeFechamentojLabel;
    private javax.swing.JLabel dataDePagamentojLabel;
    private javax.swing.JLabel dataDeVencimentojLabel;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonIncluir;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelMenuLateral;
    private javax.swing.JPanel jPanelTelaPrincipal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTabelaCartao;
    private javax.swing.JTextField jTextFieldBandeira;
    private javax.swing.JTextField jTextFieldCCV;
    private javax.swing.JTextField jTextFieldDataDeFechamento;
    private javax.swing.JTextField jTextFieldDataDePagamento;
    private javax.swing.JTextField jTextFieldDataDeVencimento;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldLimite;
    private javax.swing.JTextField jTextFieldNomeDoTuitular;
    private javax.swing.JTextField jTextFieldNumeroDoCartao;
    private javax.swing.JLabel limiteDoCartaojLabel;
    // End of variables declaration//GEN-END:variables
}