

package agendatelefonica;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class FormAgenda extends javax.swing.JFrame {
    DefaultTableModel tmContato = new DefaultTableModel(null, new String[]{"ID", "Nome", "CPF/ CNPJ", "Telefone"});
    List<Contato> contatos;
    ListSelectionModel lsmContato;

    public FormAgenda() {
        initComponents();
        desabilitaDados();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTPesquisar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTTabela = new javax.swing.JTable();
        jBSair = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTCpf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTEndereco = new javax.swing.JTextField();
        jBAlterar = new javax.swing.JButton();
        jBNovo = new javax.swing.JButton();
        jBSalvar = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTBairro = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTNumero = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTTelefone = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda Telefônica");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Agenda Telefônica");

        jTTabela.setModel(tmContato);
        jTTabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); 
        lsmContato = jTTabela.getSelectionModel(); 
        lsmContato.addListSelectionListener(new ListSelectionListener() { 
            public void valueChanged(ListSelectionEvent e) { 
                if (! e.getValueIsAdjusting()){ 
                    jTTabelaLinhaSelecionada(jTTabela); 
                } 
            } 
        });
        jScrollPane1.setViewportView(jTTabela);

        jBSair.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/8414_16x16.png"))); // NOI18N
        jBSair.setText("Sair");
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Informações do Cliente ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("ID: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nome/ Razão Social: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("CPF/ CNPJ: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Endereço: ");

        jBAlterar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/2719_16x16.png"))); // NOI18N
        jBAlterar.setText("Alterar");
        jBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlterarActionPerformed(evt);
            }
        });

        jBNovo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/838_16x16.png"))); // NOI18N
        jBNovo.setText("Novo");
        jBNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNovoActionPerformed(evt);
            }
        });

        jBSalvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/save_16x16.png"))); // NOI18N
        jBSalvar.setText("Salvar");
        jBSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarActionPerformed(evt);
            }
        });

        jBExcluir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/delete_16x16.png"))); // NOI18N
        jBExcluir.setText("Excluir");
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Bairro: ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Número: ");

        jLabel6.setText("Email: ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Telefone: ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTId, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jBNovo)
                        .addGap(25, 25, 25)
                        .addComponent(jBAlterar)
                        .addGap(30, 30, 30)
                        .addComponent(jBSalvar)
                        .addGap(25, 25, 25)
                        .addComponent(jBExcluir)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(jTCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(118, 118, 118))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTTelefone, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(15, 15, 15)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jLabel6))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jTEmail)))))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNovo)
                    .addComponent(jBAlterar)
                    .addComponent(jBExcluir)
                    .addComponent(jBSalvar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jBBuscar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/11362_16x16.png"))); // NOI18N
        jBBuscar.setText("Pesquisar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Resultado da Busca: ");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Buscar por: ID, Nome e CPF");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscar))
                .addGap(12, 12, 12)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jBSair)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNovoActionPerformed
        habilitaDados();
        jTId.setText("");
        jTNome.setText("");
        jTCpf.setText("");
        jTEndereco.setText("");
        jTNumero.setText("");
        jTBairro.setText("");
        jTTelefone.setText("");
        jTEmail.setText("");
        
    }//GEN-LAST:event_jBNovoActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBSairActionPerformed

    private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarActionPerformed
      if (verificaDados()){
          cadastro();
          JOptionPane.showMessageDialog(null, "Contato Salvo com Sucesso!");
          desabilitaDados();
      }
    }//GEN-LAST:event_jBSalvarActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        try {
            listarContatos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Pesquisar Cliente !" + ex);
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        try {
            excluirContato();
            listarContatos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no Botão Excluir!" + ex);

        }
    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarActionPerformed
        try {
            alterarContato();
            listarContatos();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao Alterar Contato!" + ex);
        }
    }//GEN-LAST:event_jBAlterarActionPerformed
   
    protected void listarContatos() throws SQLException{
        ContatoDao dao = new ContatoDao();
        contatos = dao.getLista("%" + jTPesquisar.getText() + "%");
        mostrarPesquisa(contatos);
    }
    public void cadastro() {
        try {
            Contato c1 = new Contato();
            c1.setNome(jTNome.getText());
            c1.setCpf(jTCpf.getText());
            c1.setEndereco(jTEndereco.getText());
            c1.setNumero(jTNumero.getText());
            c1.setBairro(jTBairro.getText());
            c1.setTelefone(jTTelefone.getText());
            c1.setEmail(jTEmail.getText());

            ContatoDao dao = new ContatoDao();
            dao.inserirContato(c1);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problema ao Cadastrar Cliente !" + ex);
        }
    }    
       
    public void desabilitaDados() {
        jTId.setEditable(false);
        jTNome.setEditable(false);
        jTCpf.setEditable(false);
        jTEndereco.setEditable(false);
        jTNumero.setEditable(false);
        jTBairro.setEditable(false);
        jTTelefone.setEditable(false);
        jTEmail.setEditable(false);
    }

    public void habilitaDados() {
        jTId.setEditable(false);
        jTNome.setEditable(true);
        jTCpf.setEditable(true);
        jTEndereco.setEditable(true);
        jTNumero.setEditable(true);
        jTBairro.setEditable(true);
        jTTelefone.setEditable(true);
        jTEmail.setEditable(true);
    }
    
    private void jTTabelaLinhaSelecionada(JTable tabela) {
        if (jTTabela.getSelectedRow() != -1) {
            habilitaDados();
            jTId.setText(String.valueOf(contatos.get(tabela.getSelectedRow()).getId()));
            jTNome.setText(contatos.get(tabela.getSelectedRow()).getNome());
            jTCpf.setText(contatos.get(tabela.getSelectedRow()).getCpf());
            jTTelefone.setText(contatos.get(tabela.getSelectedRow()).getTelefone());
        } else {
            jTId.setText("");
            jTNome.setText("");
            jTCpf.setText("");
            jTTelefone.setText("");
        }
    }
         public boolean verificaDados(){
        if (!jTNome.getText().equals("") && !jTCpf.getText().equals("") && !jTTelefone.getText().equals("")){
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "Campos Nome/ Razão Social, CPF/ CNPJ e Telefone são Obrigatórios !");
            return false;
        }
    }
         
        public void excluirContato() throws SQLException {
        int resp = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir este Contato ?",
                "Confirmação", JOptionPane.YES_NO_OPTION);
        if (resp == JOptionPane.YES_NO_OPTION) {
            ContatoDao dao = new ContatoDao();
            dao.remover(contatos.get(jTTabela.getSelectedRow()));
            mostrarPesquisa(contatos);
        }

    }
        
        public void alterarContato() throws SQLException{
            if (jTTabela.getSelectedRow() != -1){
                if (verificaDados()){
                    Contato c1 = new Contato();
                    ContatoDao dao = new ContatoDao();
                    c1.setId(Long.valueOf(jTId.getText()));
                    c1.setNome(jTNome.getText());
                    c1.setCpf(jTCpf.getText());
                    c1.setEndereco(jTEndereco.getText());
                    c1.setNumero(jTNumero.getText());
                    c1.setBairro(jTBairro.getText());
                    c1.setEmail(jTEmail.getText());
                    c1.setTelefone(jTTelefone.getText());
                    dao.alterar(c1);
                    JOptionPane.showMessageDialog(null, "Dados do Contato Alterados com Sucesso !");
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
            java.util.logging.Logger.getLogger(FormAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAgenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBNovo;
    private javax.swing.JButton jBSair;
    private javax.swing.JButton jBSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTBairro;
    private javax.swing.JTextField jTCpf;
    private javax.swing.JTextField jTEmail;
    private javax.swing.JTextField jTEndereco;
    private javax.swing.JTextField jTId;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTextField jTNumero;
    private javax.swing.JTextField jTPesquisar;
    private javax.swing.JTable jTTabela;
    private javax.swing.JTextField jTTelefone;
    // End of variables declaration//GEN-END:variables

    private void mostrarPesquisa(List<Contato>contatos) {
       while(tmContato.getRowCount()>0){
           tmContato.removeRow(0);
       }
        if (contatos.size()== 0){
            JOptionPane.showMessageDialog(null, "Nenhum Contato Cadastrado!");
        }else{
            String[] linha = new String [] {null, null, null, null};
            for (int i = 0; i < contatos.size(); i++){
                tmContato.addRow(linha);
                tmContato.setValueAt(contatos.get(i).getId(), i, 0);
                tmContato.setValueAt(contatos.get(i).getNome(), i, 1);
                tmContato.setValueAt(contatos.get(i).getCpf(), i, 2);
                tmContato.setValueAt(contatos.get(i).getTelefone(), i, 3);
            }
        }
    }
}
