/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.Controller;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

/**
 *
 * @author Pedro Alexandre
 */
public class JanelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form janelaLogin
     */
    public JanelaPrincipal() {
        initComponents();
        control = new Controller(this);
    }

    public JButton getBotaoLogin() {
        return botaoLogin;
    }

    public void setBotaoLogin(JButton botaoLogin) {
        this.botaoLogin = botaoLogin;
    }

    public ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }

    public void setButtonGroup1(ButtonGroup buttonGroup1) {
        this.buttonGroup1 = buttonGroup1;
    }

    public JPanel getDisplayTrade() {
        return displayTrade;
    }

    public void setDisplayTrade(JPanel displayTrade) {
        this.displayTrade = displayTrade;
    }

    public JPanel getDisplayTrade1() {
        return displayTrade1;
    }

    public void setDisplayTrade1(JPanel displayTrade1) {
        this.displayTrade1 = displayTrade1;
    }

    public JButton getjButton1() {
        return jButton1;
    }

    public void setjButton1(JButton jButton1) {
        this.jButton1 = jButton1;
    }

    public JComboBox<String> getjComboBox1() {
        return jComboBox1;
    }

    public void setjComboBox1(JComboBox<String> jComboBox1) {
        this.jComboBox1 = jComboBox1;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JTextField getTxtSenha() {
        return txtSenha;
    }

    public void setTxtSenha(JTextField txtSenha) {
        this.txtSenha = txtSenha;
    }

    public JProgressBar getjProgressBar1() {
        return jProgressBar1;
    }

    public void setjProgressBar1(JProgressBar jProgressBar1) {
        this.jProgressBar1 = jProgressBar1;
    }

    public JProgressBar getjProgressBar2() {
        return jProgressBar2;
    }

    public void setjProgressBar2(JProgressBar jProgressBar2) {
        this.jProgressBar2 = jProgressBar2;
    }

    public JProgressBar getjProgressBar3() {
        return jProgressBar3;
    }

    public void setjProgressBar3(JProgressBar jProgressBar3) {
        this.jProgressBar3 = jProgressBar3;
    }

    public JSeparator getjSeparator1() {
        return jSeparator1;
    }

    public void setjSeparator1(JSeparator jSeparator1) {
        this.jSeparator1 = jSeparator1;
    }

    public JToggleButton getjToggleButton1() {
        return jToggleButton1;
    }

    public void setjToggleButton1(JToggleButton jToggleButton1) {
        this.jToggleButton1 = jToggleButton1;
    }

    public JToggleButton getjToggleButton2() {
        return jToggleButton2;
    }

    public void setjToggleButton2(JToggleButton jToggleButton2) {
        this.jToggleButton2 = jToggleButton2;
    }

    public JToggleButton getjToggleButton3() {
        return jToggleButton3;
    }

    public void setjToggleButton3(JToggleButton jToggleButton3) {
        this.jToggleButton3 = jToggleButton3;
    }

    public JToggleButton getjToggleButton4() {
        return jToggleButton4;
    }

    public void setjToggleButton4(JToggleButton jToggleButton4) {
        this.jToggleButton4 = jToggleButton4;
    }

    public JLabel getLblBtc() {
        return lblBtc;
    }

    public void setLblBtc(JLabel lblBtc) {
        this.lblBtc = lblBtc;
    }

    public JLabel getLblCotações() {
        return lblCotações;
    }

    public void setLblCotações(JLabel lblCotações) {
        this.lblCotações = lblCotações;
    }

    public JLabel getLblEth() {
        return lblEth;
    }

    public void setLblEth(JLabel lblEth) {
        this.lblEth = lblEth;
    }

    public JLabel getLblValorBitcoin() {
        return lblValorBitcoin;
    }

    public void setLblValorBitcoin(JLabel lblValorBitcoin) {
        this.lblValorBitcoin = lblValorBitcoin;
    }

    public JLabel getLblValorEth() {
        return lblValorEth;
    }

    public void setLblValorEth(JLabel lblValorEth) {
        this.lblValorEth = lblValorEth;
    }

    public JLabel getLblValorXrp() {
        return lblValorXrp;
    }

    public void setLblValorXrp(JLabel lblValorXrp) {
        this.lblValorXrp = lblValorXrp;
    }

    public JLabel getLblXrp() {
        return lblXrp;
    }

    public void setLblXrp(JLabel lblXrp) {
        this.lblXrp = lblXrp;
    }

    public JPanel getPainelBotoes() {
        return painelBotoes;
    }

    public void setPainelBotoes(JPanel painelBotoes) {
        this.painelBotoes = painelBotoes;
    }

    public JPanel getPainelLogin() {
        return painelLogin;
    }

    public void setPainelLogin(JPanel painelLogin) {
        this.painelLogin = painelLogin;
    }

    public JTextField getTxtCpf() {
        return txtCpf;
    }

    public void setTxtCpf(JTextField txtCpf) {
        this.txtCpf = txtCpf;
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelLogin = new javax.swing.JPanel();
        txtCpf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        botaoLogin = new javax.swing.JButton();
        txtSenha = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        displayTrade1 = new javax.swing.JPanel();
        painelBotoes = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jSeparator1 = new javax.swing.JSeparator();
        lblCotações = new javax.swing.JLabel();
        lblBtc = new javax.swing.JLabel();
        lblValorBitcoin = new javax.swing.JLabel();
        lblEth = new javax.swing.JLabel();
        lblValorEth = new javax.swing.JLabel();
        lblXrp = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        lblValorXrp = new javax.swing.JLabel();
        jProgressBar2 = new javax.swing.JProgressBar();
        jProgressBar3 = new javax.swing.JProgressBar();
        jButton1 = new javax.swing.JButton();
        displayTrade = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();

        txtCpf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCpf.setVerifyInputWhenFocusTarget(false);
        txtCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCpfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCpfFocusLost(evt);
            }
        });
        txtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfActionPerformed(evt);
            }
        });
        txtCpf.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtCpfPropertyChange(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/file.png"))); // NOI18N

        botaoLogin.setText("Login");
        botaoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLoginActionPerformed(evt);
            }
        });

        txtSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSenha.setVerifyInputWhenFocusTarget(false);
        txtSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSenhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSenhaFocusLost(evt);
            }
        });
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        txtSenha.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtSenhaPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout painelLoginLayout = new javax.swing.GroupLayout(painelLogin);
        painelLogin.setLayout(painelLoginLayout);
        painelLoginLayout.setHorizontalGroup(
            painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLoginLayout.createSequentialGroup()
                .addGap(506, 506, 506)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLoginLayout.createSequentialGroup()
                .addContainerGap(525, Short.MAX_VALUE)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLoginLayout.createSequentialGroup()
                        .addComponent(botaoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(566, 566, 566))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLoginLayout.createSequentialGroup()
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(525, 525, 525))
                    .addGroup(painelLoginLayout.createSequentialGroup()
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(525, 525, 525))))
        );
        painelLoginLayout.setVerticalGroup(
            painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLoginLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(botaoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(204, Short.MAX_VALUE))
        );

        displayTrade1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout displayTrade1Layout = new javax.swing.GroupLayout(displayTrade1);
        displayTrade1.setLayout(displayTrade1Layout);
        displayTrade1Layout.setHorizontalGroup(
            displayTrade1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 958, Short.MAX_VALUE)
        );
        displayTrade1Layout.setVerticalGroup(
            displayTrade1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Exchange de Criptomoedas");
        setBounds(new java.awt.Rectangle(0, 0, 1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        painelBotoes.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroup1.add(jToggleButton1);
        jToggleButton1.setText("Comprar/Vender criptomoedas");

        buttonGroup1.add(jToggleButton2);
        jToggleButton2.setText("Depositar/Sacar saldo");

        buttonGroup1.add(jToggleButton3);
        jToggleButton3.setText("Consultar saldo da carteira");

        buttonGroup1.add(jToggleButton4);
        jToggleButton4.setText("Consultar extrato de operações");

        lblCotações.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        lblCotações.setText("Cotações");

        lblBtc.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        lblBtc.setText("BTC:");

        lblValorBitcoin.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        lblValorBitcoin.setText("XXXXX");

        lblEth.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        lblEth.setText("ETH:");

        lblValorEth.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        lblValorEth.setText("XXXXX");

        lblXrp.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        lblXrp.setText("XRP:");

        jProgressBar1.setValue(80);
        jProgressBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jProgressBar1.setFocusable(false);

        lblValorXrp.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        lblValorXrp.setText("XXXXX");

        jProgressBar2.setValue(80);
        jProgressBar2.setFocusable(false);

        jProgressBar3.setValue(80);
        jProgressBar3.setFocusable(false);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/reload.png"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelBotoesLayout = new javax.swing.GroupLayout(painelBotoes);
        painelBotoes.setLayout(painelBotoesLayout);
        painelBotoesLayout.setHorizontalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(painelBotoesLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelBotoesLayout.createSequentialGroup()
                            .addComponent(lblBtc)
                            .addGap(18, 18, 18)
                            .addComponent(lblValorBitcoin)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(painelBotoesLayout.createSequentialGroup()
                            .addComponent(lblXrp)
                            .addGap(18, 18, 18)
                            .addComponent(lblValorXrp)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                            .addComponent(jProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(painelBotoesLayout.createSequentialGroup()
                            .addComponent(lblEth)
                            .addGap(18, 18, 18)
                            .addComponent(lblValorEth)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(10, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBotoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBotoesLayout.createSequentialGroup()
                        .addComponent(lblCotações)
                        .addGap(116, 116, 116))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBotoesLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120))))
        );
        painelBotoesLayout.setVerticalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCotações)
                .addGap(29, 29, 29)
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblBtc)
                        .addComponent(lblValorBitcoin)))
                .addGap(29, 29, 29)
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEth)
                        .addComponent(lblValorEth))
                    .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblXrp)
                        .addComponent(lblValorXrp))
                    .addComponent(jProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        displayTrade.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BTC", "ETH", "XRP" }));

        javax.swing.GroupLayout displayTradeLayout = new javax.swing.GroupLayout(displayTrade);
        displayTrade.setLayout(displayTradeLayout);
        displayTradeLayout.setHorizontalGroup(
            displayTradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayTradeLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(850, Short.MAX_VALUE))
        );
        displayTradeLayout.setVerticalGroup(
            displayTradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayTradeLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(639, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(displayTrade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(displayTrade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfActionPerformed

    private void botaoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoLoginActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtCpfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCpfFocusGained
        if (txtCpf.getText().equals("CPF")){
            txtCpf.setText("");
        }
    }//GEN-LAST:event_txtCpfFocusGained

    private void txtCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCpfFocusLost
        if (txtCpf.getText().equals("")){
            txtCpf.setText("CPF");
        }
    }//GEN-LAST:event_txtCpfFocusLost

    private void txtCpfPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtCpfPropertyChange
        if ("enabled".equals(evt.getPropertyName())){
            if (txtCpf.getText().isEmpty()){txtCpf.setText("CPF");}
        }
    }//GEN-LAST:event_txtCpfPropertyChange

    private void txtSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaFocusGained

    private void txtSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaFocusLost

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void txtSenhaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtSenhaPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaPropertyChange

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
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }
    
    private ControllerLogin control;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoLogin;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel displayTrade;
    private javax.swing.JPanel displayTrade1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JLabel lblBtc;
    private javax.swing.JLabel lblCotações;
    private javax.swing.JLabel lblEth;
    private javax.swing.JLabel lblValorBitcoin;
    private javax.swing.JLabel lblValorEth;
    private javax.swing.JLabel lblValorXrp;
    private javax.swing.JLabel lblXrp;
    private javax.swing.JPanel painelBotoes;
    private javax.swing.JPanel painelLogin;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables
}
