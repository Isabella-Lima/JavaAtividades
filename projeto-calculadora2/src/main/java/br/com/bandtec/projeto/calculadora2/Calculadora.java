/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.projeto.calculadora2;


import javax.swing.JOptionPane;
/**
 *
 * @author Isabe
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comBoxCombustivel = new javax.swing.JComboBox<>();
        comBoxMarca = new javax.swing.JComboBox<>();
        inpKm = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        comBoxFreq = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblCombustCU = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblEstaciCU = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        inpGastoEstacSU = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblCombustSU = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblEstaciSU = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblValorCorriCU = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblValorDiarioSU = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblValorFinalCU = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblDia = new javax.swing.JLabel();
        lblValorFreq = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        lblValorMesCU = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        lblValorAnualCU = new javax.swing.JLabel();
        lblValorMesSU = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        lblValorAnualSU = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Calculadora Financeira");

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));
        jPanel1.setForeground(new java.awt.Color(255, 204, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(7, 550));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 792, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        jLabel1.setText("Marca do seu carro:");

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 543, Short.MAX_VALUE)
        );

        jLabel2.setText("Distância de percurso em Km:");

        jLabel3.setText("Combustível usado:");

        comBoxCombustivel.setBackground(new java.awt.Color(255, 255, 255));
        comBoxCombustivel.setForeground(new java.awt.Color(0, 0, 0));
        comBoxCombustivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolher...", "Gasolina", "Álcool", "Etanol", " " }));

        comBoxMarca.setBackground(new java.awt.Color(255, 255, 255));
        comBoxMarca.setForeground(new java.awt.Color(0, 0, 0));
        comBoxMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolher...", "Renault", "Volkswagen", "Fiat", "Peugeot", "Ford", "Citroën", "Outros", "Chevrolet" }));

        inpKm.setBackground(new java.awt.Color(255, 255, 255));
        inpKm.setForeground(new java.awt.Color(0, 0, 0));

        btnCalcular.setText("Calcular:");
        btnCalcular.setActionCommand("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jLabel5.setText("Frequência da rota:");

        comBoxFreq.setBackground(new java.awt.Color(255, 255, 255));
        comBoxFreq.setForeground(new java.awt.Color(0, 0, 0));
        comBoxFreq.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolher...", "Diária", "Semanal", "Mensal" }));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 0));
        jLabel6.setText("SEM A UBER");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 0));
        jLabel7.setText("COM A UBER");

        jLabel8.setText("Gasto com combustível");

        jLabel10.setText("Gasto com estacionamento");

        jLabel12.setText("Gasto com estacionamento por mês:");

        inpGastoEstacSU.setBackground(new java.awt.Color(255, 255, 255));
        inpGastoEstacSU.setForeground(new java.awt.Color(0, 0, 0));

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 0, 0));
        jLabel13.setText("*caso não houver digite 0");

        jLabel9.setText(" por mês:");

        jLabel11.setText("por mês:");

        jLabel14.setText("Gasto com combustível");

        jLabel15.setText("Gasto com estacionamento");

        jLabel16.setText(" por mês:");

        jLabel17.setText("por mês:");

        jLabel18.setText("Preço corrida:");

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 0));
        jLabel19.setText("Valor final diário");

        lblValorDiarioSU.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblValorDiarioSU.setForeground(new java.awt.Color(255, 255, 255));

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 0, 0));
        jLabel20.setText("Valor final diário");

        lblValorFinalCU.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblValorFinalCU.setForeground(new java.awt.Color(255, 255, 255));

        jLabel21.setText("Valor ");

        lblValorFreq.setForeground(new java.awt.Color(255, 255, 255));

        jLabel22.setText("Valor por mês:");

        jLabel23.setText("Valor anual:");

        jLabel24.setText("Valor anual:");

        jLabel25.setText("Valor por mês:");

        jLabel26.setForeground(new java.awt.Color(204, 0, 0));
        jLabel26.setText("*Aqui consideramos que todos os carros tenham a mesma quantidade de km/litro independente do combustível utilizado.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 792, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(comBoxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comBoxCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(inpKm, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(comBoxFreq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(inpGastoEstacSU, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel6)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCombustSU, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(lblEstaciSU, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(lblValorMesSU, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24)
                                    .addComponent(lblValorAnualSU, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(135, 135, 135))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(51, 51, 51))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblValorDiarioSU, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89)))))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCombustCU, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11)
                                    .addComponent(lblEstaciCU, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblValorCorriCU, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblDia, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblValorFreq, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel22)
                                            .addComponent(lblValorMesCU, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel23)
                                            .addComponent(lblValorAnualCU, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblValorFinalCU, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(54, 54, 54))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addGap(27, 27, 27))))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel26)
                .addGap(279, 279, 279))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comBoxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comBoxCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCombustSU, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(lblEstaciSU, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(inpKm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inpGastoEstacSU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblValorDiarioSU, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comBoxFreq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblValorMesSU, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel24)
                                .addGap(18, 18, 18)
                                .addComponent(lblValorAnualSU, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCombustCU, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(lblEstaciCU, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)
                                .addComponent(lblValorCorriCU, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel21)
                                    .addComponent(lblDia, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblValorFinalCU, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblValorFreq, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblValorMesCU, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel23)
                                .addGap(18, 18, 18)
                                .addComponent(lblValorAnualCU, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
              
        
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////COMBOX MARCA////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        
        /*
        ESTRUTURA DE DESIÇÃO PARA SABER QUAL FOI A SELECIOANDA E DAR UM VALOR
        CONFORME SUA ESCOLHA. 
        */
        
        
        Double kmporlitro =0.0;
        
        String marcaSelecionada = String.valueOf(comBoxMarca.getSelectedItem());
        
        
        if (comBoxMarca.getSelectedItem().equals("Escolher...")) {
            JOptionPane.showMessageDialog(null, "Selecione uma opção válida", null, WIDTH);
        
        }else if (marcaSelecionada.equals("Renault")) {
            kmporlitro = 14.4;
        
        } else if (marcaSelecionada.equals("Volkswagen")) {
            kmporlitro = 13.8;
            
        } else if (marcaSelecionada.equals("Fiat")) {
            kmporlitro = 13.2;
            
        } else if (marcaSelecionada.equals("Peugeot")) {
            kmporlitro = 13.9;
           
        } else if (marcaSelecionada.equals("Chevrolet")) {
            kmporlitro = 13.4;
            
        } else if (marcaSelecionada.equals("Ford")) {
            kmporlitro = 13.4;
            
        } else if (marcaSelecionada.equals("Citroën")) {
            kmporlitro = 13.2;
        }
        /*
        COMO EXISTEM UMA GRANDE VARIEDADE DE MARCAS DE CARROS
        EU APENAS COLOQUEI AS PRINCIPAIS, E NA OPÇÃO OUTROS CALCULEI UMA MÉDIA 
        DE TODAS AS OUTRAS MARCAS PARA TER UM VALOR BASE.
        */
         else {
            kmporlitro = 13.6;
        }
        
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        //////////////////////////VALOR COMBUSTÍVEL/////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        
        /*
        ESTRUTURA DE DESIÇÃO PARA SABER QUAL FOI A SELECIOANDA E DAR UM VALOR
        CONFORME SUA ESCOLHA.
        */
        
        Double valorCombPorLitro =0.0;
        
        String combustivelSelecionado = String.valueOf(comBoxCombustivel.getSelectedItem());
        
              
        if (comBoxCombustivel.getSelectedItem().equals("Escolher...")) {
            JOptionPane.showMessageDialog(null, "Selecione uma opção válida", null, WIDTH);
        
        }else if (combustivelSelecionado.equals("Gasolina")) {
            valorCombPorLitro = 4.6;
        
        } else if (combustivelSelecionado.equals("Álcool")) {
            valorCombPorLitro = 2.8;
            
        } else if (combustivelSelecionado.equals("Etanol")) {
            valorCombPorLitro = 2.7;
            
        }
        
        
        ///////////////////////////////////////////////////////////////////////
        //DISTANCIA EM KM PERCORRIDA
        
        
        Double distanciaKm = Double.parseDouble(inpKm.getText());
   
          
        ///////////////////////////////////////////////////////////////////////
        //GASTO ESTACIONAMENTO POR MÊS
        
        
        Double gastoEstSU = Double.parseDouble(inpGastoEstacSU.getText());


        ///////////////////////////////////////////////////////////////////////
        /*FREQUÊNCIA DA ROTA  
        AQUI ESTOU PERGUNTANDO SE A FREQUENCIA COM QUE O CLIENTE FAZ ESSA
        ROTA É DIÁRIA, MENSAL OU ANUAL, PARA CALCULAR ASSIM O GASTO MENSAL DELE.
        */
               
        Integer frequenciaRota = 0;
        
        String freqSelecionada = String.valueOf(comBoxFreq.getSelectedItem());

        
        if (comBoxFreq.getSelectedItem().equals("Escolher...")) {
            JOptionPane.showMessageDialog(null, "Selecione uma opção válida", null, WIDTH);
        
        }else if (freqSelecionada.equals("Diária")) {
            frequenciaRota = 365;
        
        } else if (freqSelecionada.equals("Mensal")) {
            frequenciaRota = 12;
            
        } else if (freqSelecionada.equals("Anual")) {
            frequenciaRota = 1;
        }
        
        
        
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        //////////////////////////////RESULTADOS////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////                                                 
        
        
        /*CALCULANDO E PRINTANDO QUAL SERÁ O GASTO COM COMBUSTÍVEL*/ 
           
            
        Double litrosNecessarios = (distanciaKm / kmporlitro);
        Double gastoCombSU = (litrosNecessarios * valorCombPorLitro);
        Double gastoCombPorFreqSU = (gastoCombSU * frequenciaRota);
        
        
        lblCombustSU.setText(String.valueOf(gastoCombPorFreqSU));
        
              
        ////////////////////////////////////////////////////////////////////////
        
        /*CALCULANDO E PRINTANDO QUAL SERÁ O GASTO COM ESTACIONAMENTO*/ 
            
        Double gastoEstSUFreq = (gastoEstSU * frequenciaRota);
        
        lblEstaciSU.setText(String.valueOf(gastoEstSUFreq));
        
        
        ////////////////////////////////////////////////////////////////////////
        //Valor diário
        
        Double valorDiarioSU = (gastoCombSU + gastoEstSU);
        
        lblValorDiarioSU.setText(String.valueOf(valorDiarioSU));
        
        
        ////////////////////////////////////////////////////////////////////////
        //Valor Mensal
        switch (frequenciaRota) {
            case 1:
                lblValorMesSU.setText(String.valueOf(valorDiarioSU / 365));
                break;
            case 12:
                lblValorMesSU.setText(String.valueOf(valorDiarioSU * 1));
                break;
            case 365:
                lblValorMesSU.setText(String.valueOf(valorDiarioSU * 30));
                break;
            default:
                break;
        }
        
        
        ////////////////////////////////////////////////////////////////////////
        //Valor Anual
        switch (frequenciaRota) {
            case 1:
                lblValorAnualSU.setText(String.valueOf(valorDiarioSU * 1));
                break;
            case 12:
                lblValorAnualSU.setText(String.valueOf(valorDiarioSU * 12));
                break;
            case 365:
                lblValorAnualSU.setText(String.valueOf(valorDiarioSU * 365));
                break;
            default:
                break;
        }


        
        
        
        
    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JComboBox<String> comBoxCombustivel;
    private javax.swing.JComboBox<String> comBoxFreq;
    private javax.swing.JComboBox<String> comBoxMarca;
    private javax.swing.JTextField inpGastoEstacSU;
    private javax.swing.JTextField inpKm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCombustCU;
    private javax.swing.JLabel lblCombustSU;
    private javax.swing.JLabel lblDia;
    private javax.swing.JLabel lblEstaciCU;
    private javax.swing.JLabel lblEstaciSU;
    private javax.swing.JLabel lblValorAnualCU;
    private javax.swing.JLabel lblValorAnualSU;
    private javax.swing.JLabel lblValorCorriCU;
    private javax.swing.JLabel lblValorDiarioSU;
    private javax.swing.JLabel lblValorFinalCU;
    private javax.swing.JLabel lblValorFreq;
    private javax.swing.JLabel lblValorMesCU;
    private javax.swing.JLabel lblValorMesSU;
    // End of variables declaration//GEN-END:variables
}