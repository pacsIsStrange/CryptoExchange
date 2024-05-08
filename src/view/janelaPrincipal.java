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
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
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
        return displayVazio;
    }

    public void setDisplayTrade1(JPanel displayTrade1) {
        this.displayVazio = displayTrade1;
    }

    public JButton getjButton1() {
        return jButton1;
    }

    public void setjButton1(JButton jButton1) {
        this.jButton1 = jButton1;
    }

    public JComboBox<String> getjComboBox1() {
        return opcMoedaTroca;
    }

    public void setjComboBox1(JComboBox<String> jComboBox1) {
        this.opcMoedaTroca = jComboBox1;
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
        return btCompraVenda;
    }

    public void setjToggleButton1(JToggleButton jToggleButton1) {
        this.btCompraVenda = jToggleButton1;
    }

    public JToggleButton getjToggleButton2() {
        return btDepSac;
    }

    public void setjToggleButton2(JToggleButton jToggleButton2) {
        this.btDepSac = jToggleButton2;
    }

    public JToggleButton getjToggleButton3() {
        return btCarteira;
    }

    public void setjToggleButton3(JToggleButton jToggleButton3) {
        this.btCarteira = jToggleButton3;
    }

    public JToggleButton getjToggleButton4() {
        return btExtrato;
    }

    public void setjToggleButton4(JToggleButton jToggleButton4) {
        this.btExtrato = jToggleButton4;
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

    public JToggleButton getBtCarteira() {
        return btCarteira;
    }

    public void setBtCarteira(JToggleButton btCarteira) {
        this.btCarteira = btCarteira;
    }

    public JToggleButton getBtCompraVenda() {
        return btCompraVenda;
    }

    public void setBtCompraVenda(JToggleButton btCompraVenda) {
        this.btCompraVenda = btCompraVenda;
    }

    public JButton getBtComprar() {
        return btComprar;
    }

    public void setBtComprar(JButton btComprar) {
        this.btComprar = btComprar;
    }

    public JToggleButton getBtDepSac() {
        return btDepSac;
    }

    public void setBtDepSac(JToggleButton btDepSac) {
        this.btDepSac = btDepSac;
    }

    public JButton getBtDepositar() {
        return btDepositar;
    }

    public void setBtDepositar(JButton btDepositar) {
        this.btDepositar = btDepositar;
    }

    public JToggleButton getBtExtrato() {
        return btExtrato;
    }

    public void setBtExtrato(JToggleButton btExtrato) {
        this.btExtrato = btExtrato;
    }

    public JButton getBtSacar() {
        return btSacar;
    }

    public void setBtSacar(JButton btSacar) {
        this.btSacar = btSacar;
    }

    public JButton getBtVender() {
        return btVender;
    }

    public void setBtVender(JButton btVender) {
        this.btVender = btVender;
    }

    public JPanel getDisplayCarteira() {
        return displayCarteira;
    }

    public void setDisplayCarteira(JPanel displayCarteira) {
        this.displayCarteira = displayCarteira;
    }

    public JPanel getDisplayDepSac() {
        return displayDepSac;
    }

    public void setDisplayDepSac(JPanel displayDepSac) {
        this.displayDepSac = displayDepSac;
    }

    public JPanel getDisplayExtrato() {
        return displayExtrato;
    }

    public void setDisplayExtrato(JPanel displayExtrato) {
        this.displayExtrato = displayExtrato;
    }

    public JPanel getDisplayVazio() {
        return displayVazio;
    }

    public void setDisplayVazio(JPanel displayVazio) {
        this.displayVazio = displayVazio;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTable getjTable1() {
        return jTable1;
    }

    public void setjTable1(JTable jTable1) {
        this.jTable1 = jTable1;
    }

    public JLabel getLabelCpf() {
        return labelCpf;
    }

    public void setLabelCpf(JLabel labelCpf) {
        this.labelCpf = labelCpf;
    }

    public JLabel getLabelCpf1() {
        return labelCpf1;
    }

    public void setLabelCpf1(JLabel labelCpf1) {
        this.labelCpf1 = labelCpf1;
    }

    public JLabel getLabelNome() {
        return labelNome;
    }

    public void setLabelNome(JLabel labelNome) {
        this.labelNome = labelNome;
    }

    public JLabel getLabelNome1() {
        return labelNome1;
    }

    public void setLabelNome1(JLabel labelNome1) {
        this.labelNome1 = labelNome1;
    }

    public JLabel getLabelSaldoEspecífico() {
        return labelSaldoEspecífico;
    }

    public void setLabelSaldoEspecífico(JLabel labelSaldoEspecífico) {
        this.labelSaldoEspecífico = labelSaldoEspecífico;
    }

    public JLabel getLabelSaldoEspecífico1() {
        return labelSaldoEspecífico1;
    }

    public void setLabelSaldoEspecífico1(JLabel labelSaldoEspecífico1) {
        this.labelSaldoEspecífico1 = labelSaldoEspecífico1;
    }

    public JLabel getLabelSaldoReais() {
        return labelSaldoReais;
    }

    public void setLabelSaldoReais(JLabel labelSaldoReais) {
        this.labelSaldoReais = labelSaldoReais;
    }

    public JLabel getLabelSaldoReais1() {
        return labelSaldoReais1;
    }

    public void setLabelSaldoReais1(JLabel labelSaldoReais1) {
        this.labelSaldoReais1 = labelSaldoReais1;
    }

    public JLabel getLabelSaldoReais2() {
        return labelSaldoReais2;
    }

    public void setLabelSaldoReais2(JLabel labelSaldoReais2) {
        this.labelSaldoReais2 = labelSaldoReais2;
    }

    public JLabel getLabelSaldoReais3() {
        return labelSaldoReais3;
    }

    public void setLabelSaldoReais3(JLabel labelSaldoReais3) {
        this.labelSaldoReais3 = labelSaldoReais3;
    }

    public JLabel getLabelSaldoTotal() {
        return labelSaldoTotal;
    }

    public void setLabelSaldoTotal(JLabel labelSaldoTotal) {
        this.labelSaldoTotal = labelSaldoTotal;
    }

    public JLabel getLabelSaldoTotal1() {
        return labelSaldoTotal1;
    }

    public void setLabelSaldoTotal1(JLabel labelSaldoTotal1) {
        this.labelSaldoTotal1 = labelSaldoTotal1;
    }

    public JLabel getLabelSaldoTotal2() {
        return labelSaldoTotal2;
    }

    public void setLabelSaldoTotal2(JLabel labelSaldoTotal2) {
        this.labelSaldoTotal2 = labelSaldoTotal2;
    }

    public JLabel getLabelValorTroca() {
        return labelValorTroca;
    }

    public void setLabelValorTroca(JLabel labelValorTroca) {
        this.labelValorTroca = labelValorTroca;
    }

    public JLabel getLabelValorTroca1() {
        return labelValorTroca1;
    }

    public void setLabelValorTroca1(JLabel labelValorTroca1) {
        this.labelValorTroca1 = labelValorTroca1;
    }

    public JComboBox<String> getOpcMoedaTroca() {
        return opcMoedaTroca;
    }

    public void setOpcMoedaTroca(JComboBox<String> opcMoedaTroca) {
        this.opcMoedaTroca = opcMoedaTroca;
    }

    public JTextField getTxtValorTroca() {
        return txtValorTroca;
    }

    public void setTxtValorTroca(JTextField txtValorTroca) {
        this.txtValorTroca = txtValorTroca;
    }

    public JTextField getTxtValorTroca1() {
        return txtValorTroca1;
    }

    public void setTxtValorTroca1(JTextField txtValorTroca1) {
        this.txtValorTroca1 = txtValorTroca1;
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
        displayVazio = new javax.swing.JPanel();
        painelBotoes = new javax.swing.JPanel();
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        displayTrade = new javax.swing.JPanel();
        labelSaldoTotal = new javax.swing.JLabel();
        opcMoedaTroca = new javax.swing.JComboBox<>();
        labelSaldoEspecífico = new javax.swing.JLabel();
        txtValorTroca = new javax.swing.JTextField();
        labelSaldoEspecífico1 = new javax.swing.JLabel();
        labelValorTroca = new javax.swing.JLabel();
        btComprar = new javax.swing.JButton();
        btVender = new javax.swing.JButton();
        displayDepSac = new javax.swing.JPanel();
        labelSaldoTotal1 = new javax.swing.JLabel();
        txtValorTroca1 = new javax.swing.JTextField();
        labelValorTroca1 = new javax.swing.JLabel();
        btDepositar = new javax.swing.JButton();
        btSacar = new javax.swing.JButton();
        displayCarteira = new javax.swing.JPanel();
        labelNome = new javax.swing.JLabel();
        labelCpf = new javax.swing.JLabel();
        labelSaldoTotal2 = new javax.swing.JLabel();
        labelSaldoReais = new javax.swing.JLabel();
        labelSaldoReais1 = new javax.swing.JLabel();
        labelSaldoReais2 = new javax.swing.JLabel();
        labelSaldoReais3 = new javax.swing.JLabel();
        displayExtrato = new javax.swing.JPanel();
        labelNome1 = new javax.swing.JLabel();
        labelCpf1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

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

        displayVazio.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout displayVazioLayout = new javax.swing.GroupLayout(displayVazio);
        displayVazio.setLayout(displayVazioLayout);
        displayVazioLayout.setHorizontalGroup(
            displayVazioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 958, Short.MAX_VALUE)
        );
        displayVazioLayout.setVerticalGroup(
            displayVazioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Exchange de Criptomoedas");
        setBounds(new java.awt.Rectangle(0, 0, 1280, 720));
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        painelBotoes.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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
            .addGroup(painelBotoesLayout.createSequentialGroup()
                .addGap(10, 10, 10)
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
                        .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
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
                .addGap(12, 12, 12)
                .addComponent(lblCotações)
                .addGap(116, 116, 116)
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblBtc)
                        .addComponent(lblValorBitcoin)))
                .addGap(116, 116, 116)
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEth)
                        .addComponent(lblValorEth))
                    .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(116, 116, 116)
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblXrp)
                        .addComponent(lblValorXrp))
                    .addComponent(jProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        displayTrade.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelSaldoTotal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelSaldoTotal.setText("Seu saldo: R$ XXX");

        opcMoedaTroca.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        opcMoedaTroca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BTC", "ETH", "XRP" }));

        labelSaldoEspecífico.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelSaldoEspecífico.setText("Saldo Atual: X.XXXXX (R$ XXX)");

        txtValorTroca.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        txtValorTroca.setText("XXXXXX");

        labelSaldoEspecífico1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelSaldoEspecífico1.setText("Quantidade a ser comprada/vendida:");

        labelValorTroca.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelValorTroca.setText("R$");

        btComprar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btComprar.setText("Comprar");
        btComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btComprarActionPerformed(evt);
            }
        });

        btVender.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btVender.setText("Vender");

        javax.swing.GroupLayout displayTradeLayout = new javax.swing.GroupLayout(displayTrade);
        displayTrade.setLayout(displayTradeLayout);
        displayTradeLayout.setHorizontalGroup(
            displayTradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayTradeLayout.createSequentialGroup()
                .addGroup(displayTradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(displayTradeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelSaldoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(displayTradeLayout.createSequentialGroup()
                        .addGap(415, 415, 415)
                        .addComponent(opcMoedaTroca, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(displayTradeLayout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(labelSaldoEspecífico, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(displayTradeLayout.createSequentialGroup()
                        .addGap(381, 381, 381)
                        .addComponent(labelValorTroca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValorTroca, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(displayTradeLayout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addGroup(displayTradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(displayTradeLayout.createSequentialGroup()
                                .addComponent(btComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btVender, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelSaldoEspecífico1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(256, Short.MAX_VALUE))
        );
        displayTradeLayout.setVerticalGroup(
            displayTradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayTradeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelSaldoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(opcMoedaTroca, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(labelSaldoEspecífico, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(labelSaldoEspecífico1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(displayTradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorTroca, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelValorTroca))
                .addGap(53, 53, 53)
                .addGroup(displayTradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btVender, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(147, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Comprar/Vender", displayTrade);

        displayDepSac.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelSaldoTotal1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelSaldoTotal1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSaldoTotal1.setText("Seu saldo: R$ XXXXXX");
        labelSaldoTotal1.setToolTipText("");

        txtValorTroca1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        txtValorTroca1.setText("XXXXXX");

        labelValorTroca1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelValorTroca1.setText("R$");

        btDepositar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btDepositar.setText("Depositar");
        btDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDepositarActionPerformed(evt);
            }
        });

        btSacar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btSacar.setText("Sacar");
        btSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSacarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout displayDepSacLayout = new javax.swing.GroupLayout(displayDepSac);
        displayDepSac.setLayout(displayDepSacLayout);
        displayDepSacLayout.setHorizontalGroup(
            displayDepSacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displayDepSacLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelSaldoTotal1)
                .addGap(290, 290, 290))
            .addGroup(displayDepSacLayout.createSequentialGroup()
                .addGroup(displayDepSacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(displayDepSacLayout.createSequentialGroup()
                        .addGap(374, 374, 374)
                        .addComponent(labelValorTroca1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValorTroca1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(displayDepSacLayout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(btDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                        .addComponent(btSacar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(271, Short.MAX_VALUE))
        );
        displayDepSacLayout.setVerticalGroup(
            displayDepSacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayDepSacLayout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(labelSaldoTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(displayDepSacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorTroca1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelValorTroca1))
                .addGap(101, 101, 101)
                .addGroup(displayDepSacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSacar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(184, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Depositar/Sacar", displayDepSac);

        displayCarteira.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelNome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelNome.setText("Nome: XXXXXXXXXXXXXXXXXXXXXX");

        labelCpf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelCpf.setText("CPF: XXX.XXX.XXX-X");

        labelSaldoTotal2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelSaldoTotal2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSaldoTotal2.setText("Saldo Total: R$ XXX");

        labelSaldoReais.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelSaldoReais.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSaldoReais.setText("R$: XXX");

        labelSaldoReais1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelSaldoReais1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSaldoReais1.setText("BTC: XXX");

        labelSaldoReais2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelSaldoReais2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSaldoReais2.setText("ETH: XXX");

        labelSaldoReais3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelSaldoReais3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSaldoReais3.setText("XRP: XXX");

        javax.swing.GroupLayout displayCarteiraLayout = new javax.swing.GroupLayout(displayCarteira);
        displayCarteira.setLayout(displayCarteiraLayout);
        displayCarteiraLayout.setHorizontalGroup(
            displayCarteiraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayCarteiraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(displayCarteiraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displayCarteiraLayout.createSequentialGroup()
                .addContainerGap(331, Short.MAX_VALUE)
                .addComponent(labelSaldoTotal2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(335, 335, 335))
            .addGroup(displayCarteiraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(displayCarteiraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelSaldoReais, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSaldoReais1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSaldoReais2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSaldoReais3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        displayCarteiraLayout.setVerticalGroup(
            displayCarteiraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayCarteiraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(labelSaldoTotal2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(labelSaldoReais, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(labelSaldoReais1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(labelSaldoReais2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(labelSaldoReais3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Carteira", displayCarteira);
        displayCarteira.getAccessibleContext().setAccessibleName("");
        displayCarteira.getAccessibleContext().setAccessibleDescription("");

        displayExtrato.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        displayExtrato.setEnabled(false);

        labelNome1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelNome1.setText("Nome: XXXXXXXXXXXXXXXXXXXXXX");

        labelCpf1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelCpf1.setText("CPF: XXX.XXX.XXX-X");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Data", "Hora", "+/-", "Valor (R$)", "Moeda", "Cotação", "Taxa", "Saldo (R$)", "Saldo (BTC)", "Saldo (ETH)", "Saldo (XRP)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout displayExtratoLayout = new javax.swing.GroupLayout(displayExtrato);
        displayExtrato.setLayout(displayExtratoLayout);
        displayExtratoLayout.setHorizontalGroup(
            displayExtratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayExtratoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(displayExtratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCpf1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displayExtratoLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 884, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        displayExtratoLayout.setVerticalGroup(
            displayExtratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayExtratoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCpf1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Extrato", displayExtrato);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTabbedPane1)
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

    private void btComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btComprarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btComprarActionPerformed

    private void btDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDepositarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btDepositarActionPerformed

    private void btSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSacarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btSacarActionPerformed

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
    
    private Controller control;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoLogin;
    private javax.swing.JButton btComprar;
    private javax.swing.JButton btDepositar;
    private javax.swing.JButton btSacar;
    private javax.swing.JButton btVender;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel displayCarteira;
    private javax.swing.JPanel displayDepSac;
    private javax.swing.JPanel displayExtrato;
    private javax.swing.JPanel displayTrade;
    private javax.swing.JPanel displayVazio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelCpf;
    private javax.swing.JLabel labelCpf1;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelNome1;
    private javax.swing.JLabel labelSaldoEspecífico;
    private javax.swing.JLabel labelSaldoEspecífico1;
    private javax.swing.JLabel labelSaldoReais;
    private javax.swing.JLabel labelSaldoReais1;
    private javax.swing.JLabel labelSaldoReais2;
    private javax.swing.JLabel labelSaldoReais3;
    private javax.swing.JLabel labelSaldoTotal;
    private javax.swing.JLabel labelSaldoTotal1;
    private javax.swing.JLabel labelSaldoTotal2;
    private javax.swing.JLabel labelValorTroca;
    private javax.swing.JLabel labelValorTroca1;
    private javax.swing.JLabel lblBtc;
    private javax.swing.JLabel lblCotações;
    private javax.swing.JLabel lblEth;
    private javax.swing.JLabel lblValorBitcoin;
    private javax.swing.JLabel lblValorEth;
    private javax.swing.JLabel lblValorXrp;
    private javax.swing.JLabel lblXrp;
    private javax.swing.JComboBox<String> opcMoedaTroca;
    private javax.swing.JPanel painelBotoes;
    private javax.swing.JPanel painelLogin;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtValorTroca;
    private javax.swing.JTextField txtValorTroca1;
    // End of variables declaration//GEN-END:variables
}
