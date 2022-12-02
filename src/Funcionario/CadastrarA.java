/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Funcionario;
import DTO.AlunoDTO;
import Dao.AlunoDao;
import javax.swing.JOptionPane;


 
/**
 *
 * @author breno
 */

public class CadastrarA extends javax.swing.JFrame {
    //variáveis
    private String Nome,Codigo,Cpf,Contato,Endereco,Mensalidade,Data,Senha;
    /**enha
     * Creates new form CadastrarA
     */

    public CadastrarA() {
        initComponents();
                setLocationRelativeTo(null);

    }
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jData1 = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        jMensalidade = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jEndereco1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jContato1 = new javax.swing.JFormattedTextField();
        jCpf = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jCodigo = new javax.swing.JTextField();
        jNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSenha = new javax.swing.JPasswordField();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(209, 79, 245));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Cadastrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 230, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(209, 79, 245));
        jLabel9.setText("Senha");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, -1, -1));

        jData1.setBackground(new java.awt.Color(209, 79, 245));
        jData1.setForeground(new java.awt.Color(255, 255, 255));
        try {
            jData1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jData1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(jData1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 160, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(209, 79, 245));
        jLabel10.setText("Data");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, -1, -1));

        jMensalidade.setBackground(new java.awt.Color(209, 79, 245));
        jMensalidade.setForeground(new java.awt.Color(255, 255, 255));
        try {
            jMensalidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##,##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jMensalidade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMensalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMensalidadeActionPerformed(evt);
            }
        });
        getContentPane().add(jMensalidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, 80, -1));

        jLabel8.setBackground(new java.awt.Color(102, 102, 102));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(209, 79, 245));
        jLabel8.setText("Mensalidade");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, -1, -1));

        jEndereco1.setBackground(new java.awt.Color(209, 79, 245));
        jEndereco1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jEndereco1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jEndereco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 260, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(209, 79, 245));
        jLabel7.setText("Endereço");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, -1, -1));

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(209, 79, 245));
        jLabel6.setText("Contato");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        jContato1.setBackground(new java.awt.Color(209, 79, 245));
        jContato1.setForeground(new java.awt.Color(255, 255, 255));
        try {
            jContato1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jContato1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(jContato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 200, -1));

        jCpf.setBackground(new java.awt.Color(209, 79, 245));
        jCpf.setForeground(new java.awt.Color(255, 255, 255));
        try {
            jCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jCpf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(jCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 200, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(209, 79, 245));
        jLabel5.setText("CPF");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(209, 79, 245));
        jLabel3.setText("Código");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        jCodigo.setBackground(new java.awt.Color(209, 79, 245));
        jCodigo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jCodigo.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 200, -1));

        jNome.setBackground(new java.awt.Color(209, 79, 245));
        jNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jNome.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 240, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(209, 79, 245));
        jLabel2.setText("Nome");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        jSenha.setBackground(new java.awt.Color(209, 79, 245));
        jSenha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jSenha.setForeground(new java.awt.Color(255, 255, 255));
        jSenha.setText("jPasswordField1");
        getContentPane().add(jSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, -1, -1));

        jButton4.setBackground(new java.awt.Color(209, 79, 245));
        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Voltar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, -1, -1));

        jButton1.setBackground(new java.awt.Color(209, 79, 245));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 630, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/3.png"))); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     //Cadastrar Aluno
        Nome = jNome.getText();
        Codigo=jCodigo.getText();
        Cpf = jCpf.getText();
        Contato = jContato1.getText();
	Endereco = jEndereco1.getText();
        Mensalidade = jMensalidade.getText();
        Data = jData1.getText();
       Senha = jSenha.getText();


        AlunoDTO objalunodto = new AlunoDTO();
        objalunodto.setNome(Nome);
        objalunodto.setCodigo(Codigo);
        objalunodto.setCpf(Cpf);
        objalunodto.setContato(Contato);
        objalunodto.setEndereco(Endereco);
        objalunodto.setMensalidade(Mensalidade);
        objalunodto.setData(Data);
        objalunodto.setSenha(Senha);
       //mensagem pra campos vazios
        if(jNome.getText().equals("")){
    JOptionPane.showMessageDialog(null,"Campo  obrigatório,o preencha por favor !!","Aviso",JOptionPane.WARNING_MESSAGE);
    return;
}
          if(jCodigo.getText().equals("")){
    JOptionPane.showMessageDialog(null,"Campo  obrigatório,o preencha por favor !!","Aviso",JOptionPane.WARNING_MESSAGE);
    return;
}
        
if(jCpf.getText().equals("   .   .   -  ")){
    JOptionPane.showMessageDialog(null,"Campo  obrigatório,o preencha por favor !!","Aviso",JOptionPane.WARNING_MESSAGE);
    return;
}
if(jContato1.getText().equals("(  )     -    ")){
    JOptionPane.showMessageDialog(null,"Campo  obrigatório,o preencha por favor !!","Aviso",JOptionPane.WARNING_MESSAGE);
    return;
}

if(jEndereco1.getText().equals("")){
    JOptionPane.showMessageDialog(null,"Campo  obrigatório,o preencha por favor !!","Aviso",JOptionPane.WARNING_MESSAGE);
    return;
}
if(jMensalidade.getText().equals("  ,  ")){
    JOptionPane.showMessageDialog(null,"Campo  obrigatório,o preencha por favor !!","Aviso",JOptionPane.WARNING_MESSAGE);
    return;
}
if(jData1.getText().equals("    -  -  ")){
    JOptionPane.showMessageDialog(null,"Campo  obrigatório,o preencha por favor !!","Aviso",JOptionPane.WARNING_MESSAGE);
    return;
}
if(jSenha.getText().equals("")){
    JOptionPane.showMessageDialog(null,"Campo  obrigatório,o preencha por favor !!","Aviso",JOptionPane.WARNING_MESSAGE);
    return;
}

        AlunoDao objalunodao = new AlunoDao();
        objalunodao.cadastar(objalunodto);  
     

      

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //voltar pra tela principal
        new Tela_funcionario() .setVisible(true);

        this.dispose();// TODO add your handling code here:

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       //sair do sistema
        System.exit(0);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMensalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMensalidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMensalidadeActionPerformed
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JTextField jCodigo;
    private javax.swing.JFormattedTextField jContato1;
    private javax.swing.JFormattedTextField jCpf;
    private javax.swing.JFormattedTextField jData1;
    private javax.swing.JTextField jEndereco1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JFormattedTextField jMensalidade;
    private javax.swing.JTextField jNome;
    private javax.swing.JPasswordField jSenha;
    // End of variables declaration//GEN-END:variables
}
