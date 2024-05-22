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
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import model.Usuario;

/**
 *
 * @author Pedro Alexandre
 */
public class JanelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form janelaLogin
     */
    public JanelaPrincipal(Controller control, Usuario usuario) {
        initComponents();
        Double qtdBtc = usuario.getBtc().getQtd();
        Double qtdEth = usuario.getEth().getQtd();
        Double qtdXrp = usuario.getXrp().getQtd();
        
        this.usuario = usuario;
        this.control = control;
        
        control.preencherExtrato(this);
        this.labelNome.setText("Nome: " + usuario.getNome());
        this.labelCpf.setText("CPF: " + usuario.getCpf());
        this.labelSaldoReais.setText("R$: " + usuario.getReais());
        this.labelSaldoBtc.setText("BTC: " + qtdBtc);
        this.labelSaldoEth.setText("ETH: " + qtdEth);
        this.labelSaldoXrp.setText("XRP: " + qtdXrp);
        this.auxTotal = qtdBtc*control.getCtBtc()+ qtdEth * control.getCtEth() +
                               usuario.getReais() + qtdXrp * control.getCtXrp();
        
        String btcFormatado = control.df.format(control.getCtBtc());
        String ethFormatado = control.df.format(control.getCtEth());
        String xrpFormatado = control.df.format(control.getCtXrp());
        String reaisFormatado = control.df.format(usuario.getReais());
        String totalFormatado = control.df.format(this.auxTotal);
        this.labelValorBtc.setText(btcFormatado);
        this.labelValorEth.setText(ethFormatado);
        this.labelValorXrp.setText(xrpFormatado);
        this.labelSaldoTotal2.setText("Saldo total: R$" + totalFormatado);
        this.labelSaldoEspecifico.setText("Saldo atual: " + qtdBtc + " (R$" +
                            control.df.format(qtdBtc * control.getCtBtc())+")");
    }

    public Controller getControl() {
        return control;
    }

    public void setControl(Controller control) {
        this.control = control;
    }

    public JButton getBotaoLogin() {
        return botaoLogin;
    }

    public void setBotaoLogin(JButton botaoLogin) {
        this.botaoLogin = botaoLogin;
    }

    public JButton getBtComprar() {
        return btComprar;
    }

    public void setBtComprar(JButton btComprar) {
        this.btComprar = btComprar;
    }

    public JTable getTabelaExtrato() {
        return tabelaExtrato;
    }

    public void setTabelaExtrato(JTable tabelaExtrato) {
        this.tabelaExtrato = tabelaExtrato;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public JButton getBtDepositar() {
        return btDepositar;
    }

    public void setBtDepositar(JButton btDepositar) {
        this.btDepositar = btDepositar;
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

    public ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }

    public void setButtonGroup1(ButtonGroup buttonGroup1) {
        this.buttonGroup1 = buttonGroup1;
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

    public JLabel getLabelSaldoBtc() {
        return labelSaldoBtc;
    }

    public void setLabelSaldoBtc(JLabel labelSaldoBtc) {
        this.labelSaldoBtc = labelSaldoBtc;
    }

    public JLabel getLabelSaldoEth() {
        return labelSaldoEth;
    }

    public void setLabelSaldoEth(JLabel labelSaldoEth) {
        this.labelSaldoEth = labelSaldoEth;
    }

    public JLabel getLabelSaldoXrp() {
        return labelSaldoXrp;
    }

    public void setLabelSaldoXrp(JLabel labelSaldoXrp) {
        this.labelSaldoXrp = labelSaldoXrp;
    }
    
    

    public void setDisplayExtrato(JPanel displayExtrato) {
        this.displayExtrato = displayExtrato;
    }

    public JPanel getDisplayTrade() {
        return displayTrade;
    }

    public void setDisplayTrade(JPanel displayTrade) {
        this.displayTrade = displayTrade;
    }

    public JPanel getDisplayVazio() {
        return displayVazio;
    }

    public void setDisplayVazio(JPanel displayVazio) {
        this.displayVazio = displayVazio;
    }

    public JButton getjButton1() {
        return jButton1;
    }

    public void setjButton1(JButton jButton1) {
        this.jButton1 = jButton1;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JProgressBar getjProgressBar1() {
        return indexBtc;
    }

    public void setjProgressBar1(JProgressBar jProgressBar1) {
        this.indexBtc = jProgressBar1;
    }

    public JProgressBar getjProgressBar2() {
        return indexEth;
    }

    public void setjProgressBar2(JProgressBar jProgressBar2) {
        this.indexEth = jProgressBar2;
    }

    public JProgressBar getjProgressBar3() {
        return indexXrp;
    }

    public void setjProgressBar3(JProgressBar jProgressBar3) {
        this.indexXrp = jProgressBar3;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTabbedPane getjTabbedPane1() {
        return jTabbedPane1;
    }

    public void setjTabbedPane1(JTabbedPane jTabbedPane1) {
        this.jTabbedPane1 = jTabbedPane1;
    }

    public JTable getjTable1() {
        return tabelaExtrato;
    }

    public void setjTable1(JTable jTable1) {
        this.tabelaExtrato = jTable1;
    }

    public JLabel getLabelCpf() {
        return labelCpf;
    }

    public void setLabelCpf(JLabel labelCpf) {
        this.labelCpf = labelCpf;
    }

    public JLabel getLabelNome() {
        return labelNome;
    }

    public void setLabelNome(JLabel labelNome) {
        this.labelNome = labelNome;
    }


    public JLabel getLabelSaldoEspecífico() {
        return labelSaldoEspecifico;
    }

    public void setLabelSaldoEspecífico(JLabel labelSaldoEspecífico) {
        this.labelSaldoEspecifico = labelSaldoEspecífico;
    }

    public JLabel getLabelSaldoEspecífico1() {
        return labelSaldoEspecifico1;
    }

    public void setLabelSaldoEspecífico1(JLabel labelSaldoEspecífico1) {
        this.labelSaldoEspecifico1 = labelSaldoEspecífico1;
    }

    public JLabel getLabelSaldoReais() {
        return labelSaldoReais;
    }

    public void setLabelSaldoReais(JLabel labelSaldoReais) {
        this.labelSaldoReais = labelSaldoReais;
    }

    public JLabel getLabelSaldoReais1() {
        return labelSaldoBtc;
    }

    public void setLabelSaldoReais1(JLabel labelSaldoReais1) {
        this.labelSaldoBtc = labelSaldoReais1;
    }

    public JLabel getLabelSaldoReais2() {
        return labelSaldoEth;
    }

    public void setLabelSaldoReais2(JLabel labelSaldoReais2) {
        this.labelSaldoEth = labelSaldoReais2;
    }

    public JLabel getLabelSaldoReais3() {
        return labelSaldoXrp;
    }

    public void setLabelSaldoReais3(JLabel labelSaldoReais3) {
        this.labelSaldoXrp = labelSaldoReais3;
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

    public JLabel getLblBtc() {
        return labelBtc;
    }

    public void setLblBtc(JLabel lblBtc) {
        this.labelBtc = lblBtc;
    }

    public JLabel getLblCotações() {
        return labelCotações;
    }

    public void setLblCotações(JLabel lblCotações) {
        this.labelCotações = lblCotações;
    }

    public JLabel getLblEth() {
        return labelEth;
    }

    public void setLblEth(JLabel lblEth) {
        this.labelEth = lblEth;
    }

    public JLabel getLblValorBitcoin() {
        return labelValorBtc;
    }

    public void setLblValorBitcoin(JLabel lblValorBitcoin) {
        this.labelValorBtc = lblValorBitcoin;
    }

    public JLabel getLblValorEth() {
        return labelValorEth;
    }

    public void setLblValorEth(JLabel lblValorEth) {
        this.labelValorEth = lblValorEth;
    }

    public JLabel getLblValorXrp() {
        return labelValorXrp;
    }

    public void setLblValorXrp(JLabel lblValorXrp) {
        this.labelValorXrp = lblValorXrp;
    }

    public JLabel getLblXrp() {
        return labelXrp;
    }

    public void setLblXrp(JLabel lblXrp) {
        this.labelXrp = lblXrp;
    }

    public JComboBox<String> getOpcMoedaTroca() {
        return opcMoedaTroca;
    }

    public void setOpcMoedaTroca(JComboBox<String> opcMoedaTroca) {
        this.opcMoedaTroca = opcMoedaTroca;
    }

    public JPanel getPainelLogin() {
        return painelLogin;
    }

    public void setPainelLogin(JPanel painelLogin) {
        this.painelLogin = painelLogin;
    }

    public JPanel getPainelMoedas() {
        return painelMoedas;
    }

    public void setPainelMoedas(JPanel painelMoedas) {
        this.painelMoedas = painelMoedas;
    }

    public JTextField getTxtCpf() {
        return txtCpf;
    }

    public void setTxtCpf(JTextField txtCpf) {
        this.txtCpf = txtCpf;
    }

    public JTextField getTxtSenha() {
        return txtSenha;
    }

    public void setTxtSenha(JTextField txtSenha) {
        this.txtSenha = txtSenha;
    }

    public JTextField getTxtValorTroca() {
        return txtValorTroca;
    }

    public void setTxtValorTroca(JTextField txtValorTroca) {
        this.txtValorTroca = txtValorTroca;
    }

    public JTextField getTxtValorTroca1() {
        return txtValorDepSac;
    }

    public void setTxtValorTroca1(JTextField txtValorTroca1) {
        this.txtValorDepSac = txtValorTroca1;
    }

    public JProgressBar getIndexBtc() {
        return indexBtc;
    }

    public void setIndexBtc(JProgressBar indexBtc) {
        this.indexBtc = indexBtc;
    }

    public JProgressBar getIndexEth() {
        return indexEth;
    }

    public JTextField getTxtValorDepSac() {
        return txtValorDepSac;
    }

    public void setTxtValorDepSac(JTextField txtValorDepSac) {
        this.txtValorDepSac = txtValorDepSac;
    }

    public void setIndexEth(JProgressBar indexEth) {
        this.indexEth = indexEth;
    }

    public JProgressBar getIndexXrp() {
        return indexXrp;
    }

    public void setIndexXrp(JProgressBar indexXrp) {
        this.indexXrp = indexXrp;
    }

    public JLabel getLabelValorBtc() {
        return labelValorBtc;
    }

    public void setLabelValorBtc(JLabel labelValorBtc) {
        this.labelValorBtc = labelValorBtc;
    }

    public JLabel getLabelValorEth() {
        return labelValorEth;
    }

    public void setLabelValorEth(JLabel labelValorEth) {
        this.labelValorEth = labelValorEth;
    }
    
    public JLabel getLabelValorXrp() {
        return labelValorXrp;
    }

    public void setLabelValorXrp(JLabel labelValorXrp) {
        this.labelValorXrp = labelValorXrp;
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
        painelMoedas = new javax.swing.JPanel();
        labelCotações = new javax.swing.JLabel();
        labelBtc = new javax.swing.JLabel();
        labelValorBtc = new javax.swing.JLabel();
        labelEth = new javax.swing.JLabel();
        labelValorEth = new javax.swing.JLabel();
        labelXrp = new javax.swing.JLabel();
        indexBtc = new javax.swing.JProgressBar();
        labelValorXrp = new javax.swing.JLabel();
        indexEth = new javax.swing.JProgressBar();
        indexXrp = new javax.swing.JProgressBar();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        labelNome = new javax.swing.JLabel();
        labelCpf = new javax.swing.JLabel();
        labelSaldoTotal2 = new javax.swing.JLabel();
        labelSaldoReais = new javax.swing.JLabel();
        labelSaldoBtc = new javax.swing.JLabel();
        labelSaldoEth = new javax.swing.JLabel();
        labelSaldoXrp = new javax.swing.JLabel();
        labelCarteira = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        displayTrade = new javax.swing.JPanel();
        opcMoedaTroca = new javax.swing.JComboBox<>();
        labelSaldoEspecifico = new javax.swing.JLabel();
        txtValorTroca = new javax.swing.JTextField();
        labelSaldoEspecifico1 = new javax.swing.JLabel();
        labelValorTroca = new javax.swing.JLabel();
        btComprar = new javax.swing.JButton();
        btVender = new javax.swing.JButton();
        displayDepSac = new javax.swing.JPanel();
        txtValorDepSac = new javax.swing.JTextField();
        labelValorTroca1 = new javax.swing.JLabel();
        btDepositar = new javax.swing.JButton();
        btSacar = new javax.swing.JButton();
        displayExtrato = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaExtrato = new javax.swing.JTable();

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
                .addContainerGap(526, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        painelMoedas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        painelMoedas.setEnabled(false);
        painelMoedas.setMaximumSize(new java.awt.Dimension(305, 730));
        painelMoedas.setMinimumSize(new java.awt.Dimension(305, 730));
        painelMoedas.setPreferredSize(new java.awt.Dimension(305, 730));

        labelCotações.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        labelCotações.setText("Cotações");

        labelBtc.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        labelBtc.setText("BTC:");

        labelValorBtc.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        labelValorBtc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelValorBtc.setText("XXXXX");

        labelEth.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        labelEth.setText("ETH:");

        labelValorEth.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        labelValorEth.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelValorEth.setText("XXXXX");

        labelXrp.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        labelXrp.setText("XRP:");

        indexBtc.setValue(100);
        indexBtc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        indexBtc.setFocusable(false);

        labelValorXrp.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        labelValorXrp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelValorXrp.setText("XXXXX");

        indexEth.setValue(100);
        indexEth.setFocusable(false);

        indexXrp.setValue(100);
        indexXrp.setFocusable(false);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/reload.png"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        labelNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelNome.setText("Nome: XXXXXXXXXXXXXXXXXXXXXX");

        labelCpf.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelCpf.setText("CPF: XXX.XXX.XXX-X");

        labelSaldoTotal2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelSaldoTotal2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelSaldoTotal2.setText("Saldo Total: R$ XXX");

        labelSaldoReais.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelSaldoReais.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelSaldoReais.setText("R$: XXX");

        labelSaldoBtc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelSaldoBtc.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelSaldoBtc.setText("BTC: XXX");

        labelSaldoEth.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelSaldoEth.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelSaldoEth.setText("ETH: XXX");

        labelSaldoXrp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelSaldoXrp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelSaldoXrp.setText("XRP: XXX");

        labelCarteira.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        labelCarteira.setText("Carteira");

        javax.swing.GroupLayout painelMoedasLayout = new javax.swing.GroupLayout(painelMoedas);
        painelMoedas.setLayout(painelMoedasLayout);
        painelMoedasLayout.setHorizontalGroup(
            painelMoedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMoedasLayout.createSequentialGroup()
                .addGroup(painelMoedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelMoedasLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(labelCotações))
                    .addGroup(painelMoedasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelMoedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelMoedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(labelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelMoedasLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(painelMoedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelMoedasLayout.createSequentialGroup()
                                        .addGroup(painelMoedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelSaldoEth, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelSaldoBtc, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelSaldoReais, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(108, 108, 108))
                                    .addComponent(labelSaldoTotal2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelSaldoXrp, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(painelMoedasLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(labelCarteira)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelMoedasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelMoedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelMoedasLayout.createSequentialGroup()
                        .addGroup(painelMoedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painelMoedasLayout.createSequentialGroup()
                                .addGroup(painelMoedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelXrp)
                                    .addGroup(painelMoedasLayout.createSequentialGroup()
                                        .addGroup(painelMoedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelEth)
                                            .addComponent(labelBtc))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelValorBtc, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(painelMoedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(indexXrp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(indexBtc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(painelMoedasLayout.createSequentialGroup()
                                .addGroup(painelMoedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelValorXrp, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelValorEth, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(indexEth, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelMoedasLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98))))
        );
        painelMoedasLayout.setVerticalGroup(
            painelMoedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMoedasLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(labelCarteira)
                .addGap(8, 8, 8)
                .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSaldoTotal2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelSaldoReais, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSaldoBtc, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSaldoEth, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSaldoXrp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelCotações)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelMoedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(indexBtc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelMoedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelBtc)
                        .addComponent(labelValorBtc)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelMoedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelMoedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelEth)
                        .addComponent(labelValorEth))
                    .addComponent(indexEth, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelMoedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelMoedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelXrp)
                        .addComponent(labelValorXrp))
                    .addComponent(indexXrp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        opcMoedaTroca.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        opcMoedaTroca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BTC", "ETH", "XRP" }));
        opcMoedaTroca.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                opcMoedaTrocaItemStateChanged(evt);
            }
        });
        opcMoedaTroca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcMoedaTrocaActionPerformed(evt);
            }
        });

        labelSaldoEspecifico.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelSaldoEspecifico.setText("Saldo Atual: X.XXXXX (R$ XXX)");

        txtValorTroca.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        txtValorTroca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorTrocaActionPerformed(evt);
            }
        });

        labelSaldoEspecifico1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelSaldoEspecifico1.setText("Quantidade a ser comprada/vendida:");

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
        btVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVenderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout displayTradeLayout = new javax.swing.GroupLayout(displayTrade);
        displayTrade.setLayout(displayTradeLayout);
        displayTradeLayout.setHorizontalGroup(
            displayTradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayTradeLayout.createSequentialGroup()
                .addGroup(displayTradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(displayTradeLayout.createSequentialGroup()
                        .addGap(415, 415, 415)
                        .addComponent(opcMoedaTroca, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(displayTradeLayout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(labelSaldoEspecifico, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(labelSaldoEspecifico1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(260, Short.MAX_VALUE))
        );
        displayTradeLayout.setVerticalGroup(
            displayTradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayTradeLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(opcMoedaTroca, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(labelSaldoEspecifico, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(labelSaldoEspecifico1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(displayTradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorTroca, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelValorTroca))
                .addGap(53, 53, 53)
                .addGroup(displayTradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btVender, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(189, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Comprar/Vender", displayTrade);

        txtValorDepSac.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        txtValorDepSac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorDepSacActionPerformed(evt);
            }
        });

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
            .addGroup(displayDepSacLayout.createSequentialGroup()
                .addGroup(displayDepSacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(displayDepSacLayout.createSequentialGroup()
                        .addGap(376, 376, 376)
                        .addComponent(labelValorTroca1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValorDepSac, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(displayDepSacLayout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(btDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                        .addComponent(btSacar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(271, Short.MAX_VALUE))
        );
        displayDepSacLayout.setVerticalGroup(
            displayDepSacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayDepSacLayout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addGroup(displayDepSacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorDepSac, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelValorTroca1))
                .addGap(150, 150, 150)
                .addGroup(displayDepSacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSacar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(218, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Depositar/Sacar", displayDepSac);

        displayExtrato.setEnabled(false);

        tabelaExtrato.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        tabelaExtrato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaExtrato.setRowHeight(30);
        tabelaExtrato.setShowGrid(true);
        tabelaExtrato.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(tabelaExtrato);

        javax.swing.GroupLayout displayExtratoLayout = new javax.swing.GroupLayout(displayExtrato);
        displayExtrato.setLayout(displayExtratoLayout);
        displayExtratoLayout.setHorizontalGroup(
            displayExtratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displayExtratoLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 884, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        displayExtratoLayout.setVerticalGroup(
            displayExtratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayExtratoLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Extrato", displayExtrato);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelMoedas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(painelMoedas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        control.atualizaCt(this);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtCpfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCpfFocusGained

    }//GEN-LAST:event_txtCpfFocusGained

    private void txtCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCpfFocusLost

    }//GEN-LAST:event_txtCpfFocusLost

    private void txtCpfPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtCpfPropertyChange

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
        if (control.pedeSenha(this)){
            control.comprar(this);
            control.preencherExtrato(this);
        }
    }//GEN-LAST:event_btComprarActionPerformed

    private void btDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDepositarActionPerformed
        control.depositar(this);
        control.preencherExtrato(this);
    }//GEN-LAST:event_btDepositarActionPerformed

    private void btSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSacarActionPerformed
        if (control.pedeSenha(this)){
        control.sacar(this);
        control.preencherExtrato(this);}
    }//GEN-LAST:event_btSacarActionPerformed

    private void opcMoedaTrocaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_opcMoedaTrocaItemStateChanged
        control.trocaMoedaTrade(this);
    }//GEN-LAST:event_opcMoedaTrocaItemStateChanged

    private void opcMoedaTrocaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcMoedaTrocaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcMoedaTrocaActionPerformed

    private void txtValorTrocaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorTrocaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorTrocaActionPerformed

    private void txtValorDepSacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorDepSacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorDepSacActionPerformed

    private void btVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVenderActionPerformed
        if (control.pedeSenha(this)){
            control.vender(this);
            control.preencherExtrato(this);
        }
    }//GEN-LAST:event_btVenderActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new JanelaPrincipal().setVisible(true);
//            }
//        });
//    }
    
    private Controller control;
    private double auxTotal, auxCtBtc, auxCtEth, auxXrp;
    private Usuario usuario;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoLogin;
    private javax.swing.JButton btComprar;
    private javax.swing.JButton btDepositar;
    private javax.swing.JButton btSacar;
    private javax.swing.JButton btVender;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel displayDepSac;
    private javax.swing.JPanel displayExtrato;
    private javax.swing.JPanel displayTrade;
    private javax.swing.JPanel displayVazio;
    private javax.swing.JProgressBar indexBtc;
    private javax.swing.JProgressBar indexEth;
    private javax.swing.JProgressBar indexXrp;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelBtc;
    private javax.swing.JLabel labelCarteira;
    private javax.swing.JLabel labelCotações;
    private javax.swing.JLabel labelCpf;
    private javax.swing.JLabel labelEth;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelSaldoBtc;
    private javax.swing.JLabel labelSaldoEspecifico;
    private javax.swing.JLabel labelSaldoEspecifico1;
    private javax.swing.JLabel labelSaldoEth;
    private javax.swing.JLabel labelSaldoReais;
    private javax.swing.JLabel labelSaldoTotal2;
    private javax.swing.JLabel labelSaldoXrp;
    private javax.swing.JLabel labelValorBtc;
    private javax.swing.JLabel labelValorEth;
    private javax.swing.JLabel labelValorTroca;
    private javax.swing.JLabel labelValorTroca1;
    private javax.swing.JLabel labelValorXrp;
    private javax.swing.JLabel labelXrp;
    private javax.swing.JComboBox<String> opcMoedaTroca;
    private javax.swing.JPanel painelLogin;
    private javax.swing.JPanel painelMoedas;
    private javax.swing.JTable tabelaExtrato;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtValorDepSac;
    private javax.swing.JTextField txtValorTroca;
    // End of variables declaration//GEN-END:variables
}
