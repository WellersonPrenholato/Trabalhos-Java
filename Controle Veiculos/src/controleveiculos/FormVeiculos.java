//ALUNO: WELLERSON PRENHOLATO DE JESUS
//ATIVIDADE EXTRA
package controleveiculos;

import controleveiculos.logica.Veiculo;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import controleveiculos.logica.Veiculo;


public class FormVeiculos extends javax.swing.JFrame {

    DefaultTableModel tmVeiculo = new DefaultTableModel(null, new String[]{"Placa", "Modelo", "Cor"});
    List<Veiculo> veiculos;
    ListSelectionModel lsmVeiculo;

    public FormVeiculos() {
        initComponents();
        desabilitaDados();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTPesquisar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTTabela = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jBNovo = new javax.swing.JButton();
        jBEditar = new javax.swing.JButton();
        jBSalvar = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTPlaca = new javax.swing.JTextField();
        jTModelo = new javax.swing.JTextField();
        jTCor = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de Veículos");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        setResizable(false);

        jPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel.setToolTipText("");
        jPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Informe a Placa do Veículo :");

        jTTabela.setModel(tmVeiculo);
        jTTabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); 
        lsmVeiculo = jTTabela.getSelectionModel(); 
        lsmVeiculo.addListSelectionListener(new ListSelectionListener() { 
            public void valueChanged(ListSelectionEvent e) { 
                if (! e.getValueIsAdjusting()){ 
                    jTTabelaLinhaSelecionada(jTTabela); 
                } 
            } 
        });
        jScrollPane1.setViewportView(jTTabela);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("  Controle de Veículos  ");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jBNovo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/838_16x16.png"))); // NOI18N
        jBNovo.setText("Novo");
        jBNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNovoActionPerformed(evt);
            }
        });

        jBEditar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/2719_16x16.png"))); // NOI18N
        jBEditar.setText("Alterar");
        jBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarActionPerformed(evt);
            }
        });

        jBSalvar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/save_16x16.png"))); // NOI18N
        jBSalvar.setText("Salvar");
        jBSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarActionPerformed(evt);
            }
        });

        jBExcluir.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/delete_16x16.png"))); // NOI18N
        jBExcluir.setText("Excluir");
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });

        jBBuscar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/11362_16x16.png"))); // NOI18N
        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jBSair.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/8414_16x16.png"))); // NOI18N
        jBSair.setText("Sair");
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Informações do Veículo: ");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setText("Insira o Modelo: ");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setText("Insira a Placa: ");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setText("Insira a Cor: ");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Obs: A Placa NÃO pode ser Alterada.");

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelLayout.createSequentialGroup()
                            .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13)
                                .addComponent(jTPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jBNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanelLayout.createSequentialGroup()
                                    .addGap(55, 55, 55)
                                    .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12))
                                    .addGap(60, 60, 60)
                                    .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTCor, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel14)))
                                .addGroup(jPanelLayout.createSequentialGroup()
                                    .addGap(5, 5, 5)
                                    .addComponent(jBEditar)
                                    .addGap(18, 18, 18)
                                    .addComponent(jBSalvar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBExcluir))))
                        .addGroup(jPanelLayout.createSequentialGroup()
                            .addComponent(jTPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(jBBuscar))))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(16, 16, 16)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNovo)
                    .addComponent(jBSalvar)
                    .addComponent(jBEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBExcluir))
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscar))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNovoActionPerformed
        habilitaDados();
        jTPlaca.setText("");
        jTModelo.setText("");
        jTCor.setText("");
    }//GEN-LAST:event_jBNovoActionPerformed

    private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarActionPerformed
        if (verificaDados()) {
            cadastro();
            JOptionPane.showMessageDialog(null, "Veículo Salvo com Sucesso!");
            desabilitaDados();
        }
    }//GEN-LAST:event_jBSalvarActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBSairActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        try {
            listarVeiculos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no Campo de Pesquisa !" + ex);
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        try {
            excluirVeiculo();
            listarVeiculos();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Problema ao Excluir Veículo !" + ex);
        }
        
    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
        try {
            alterarVeiculo();
            listarVeiculos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problema ao Editar Veículo !" + ex);
        }
    }//GEN-LAST:event_jBEditarActionPerformed

    public void excluirVeiculo() throws SQLException {
        int resp = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir este Veículo ?",
                "Confirmação", JOptionPane.YES_NO_OPTION);
        if (resp == JOptionPane.YES_NO_OPTION) {
            Veiculo_IAE IAE = new Veiculo_IAE();
            IAE.excluir(veiculos.get(jTTabela.getSelectedRow()));
            mostraPesquisa(veiculos);
        }        
    }


    public void desabilitaDados() {
        jTPlaca.setEditable(false);
        jTModelo.setEditable(false);
        jTCor.setEditable(false);
    }

    public void habilitaDados() {
        jTPlaca.setEditable(true);
        jTModelo.setEditable(true);
        jTCor.setEditable(true);
    }

    public void listarVeiculos() throws SQLException {
        Veiculo_IAE IAE = new Veiculo_IAE();
        veiculos = IAE.getLista("%" + jTPesquisar.getText() + "%");
        mostraPesquisa(veiculos);
    }
    
    public void cadastro() {
        try {
            Veiculo v1 = new Veiculo();
            v1.setPlaca(jTPlaca.getText());
            v1.setModelo(jTModelo.getText());
            v1.setCor(jTCor.getText());

            Veiculo_IAE IAE = new Veiculo_IAE();
            IAE.inserirVeiculo(v1);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problema no Cadastro de Veículo !" + ex);
        }
    }    
        
    
    public boolean verificaDados(){
        if (!jTPlaca.getText().equals("")){
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "Campo Placa nao preenchido !");
            return false;
        }
    }
    
    private void jTTabelaLinhaSelecionada(JTable tabela) {
        if (jTTabela.getSelectedRow() != -1) {
            habilitaDados();
            jTPlaca.setText(String.valueOf(veiculos.get(tabela.getSelectedRow()).getPlaca()));
            jTModelo.setText(veiculos.get(tabela.getSelectedRow()).getModelo());
            jTCor.setText(veiculos.get(tabela.getSelectedRow()).getCor());
        } else {
            jTPlaca.setText("");
            jTModelo.setText("");
            jTCor.setText("");
        }
    }
    
    private void alterarVeiculo() throws SQLException{
        if (jTTabela.getSelectedRow() != -1) {
            if (verificaDados()) {
                Veiculo v1 = new Veiculo();
                Veiculo_IAE IAE = new Veiculo_IAE();
                
                v1.setPlaca(jTPlaca.getText());
                v1.setModelo(jTModelo.getText());
                v1.setCor(jTCor.getText());
                IAE.alterar(v1);
                JOptionPane.showMessageDialog(null, "Veiculo Editado com Sucesso !");

            }
        }

    }

    
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(FormVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormVeiculos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBNovo;
    private javax.swing.JButton jBSair;
    private javax.swing.JButton jBSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTCor;
    private javax.swing.JTextField jTModelo;
    private javax.swing.JTextField jTPesquisar;
    private javax.swing.JTextField jTPlaca;
    private javax.swing.JTable jTTabela;
    // End of variables declaration//GEN-END:variables

    private void mostraPesquisa(List<Veiculo> veiculos) {
        while (tmVeiculo.getRowCount() > 0) {
            tmVeiculo.removeRow(0);
        }

        if (veiculos.size() == 0) {
            JOptionPane.showMessageDialog(null, "Nenhum Veículo Cadastrado !");
        } else {
            String[] linha = new String[]{null, null, null};
            for (int i = 0; i < veiculos.size(); i++) {
                tmVeiculo.addRow(linha);
                tmVeiculo.setValueAt(veiculos.get(i).getPlaca(), i, 0);
                tmVeiculo.setValueAt(veiculos.get(i).getModelo(), i, 1);
                tmVeiculo.setValueAt(veiculos.get(i).getCor(), i, 2);
            }
        }
    }
}
