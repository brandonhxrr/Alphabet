package Alphabet;


public class entradaAlfabeto extends javax.swing.JFrame {
    
    int x, y; 
    Alphabet alphabet;
        
    public entradaAlfabeto() {
        this.setTitle("Ingresar alfabeto");
        initComponents();
        alphabet = Menu.alphabet;
        if(alphabet.size != 0){
            jLabel2.setForeground(new java.awt.Color(0, 153, 51));
            jLabel2.setText("Alfabeto actual");
            llenarAlfabeto();
        }else{
            jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        close_btn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        textAlphabet = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaAlphabet = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(816, 500));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(816, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        mainPanel.setMaximumSize(new java.awt.Dimension(816, 500));
        mainPanel.setMinimumSize(new java.awt.Dimension(816, 500));
        mainPanel.setPreferredSize(new java.awt.Dimension(816, 500));
        mainPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                mainPanelMouseDragged(evt);
            }
        });
        mainPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mainPanelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                mainPanelMouseReleased(evt);
            }
        });
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        close_btn.setBackground(new java.awt.Color(255, 255, 255));
        close_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/close_disabled.png"))); // NOI18N
        close_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        close_btn.setBorderPainted(false);
        close_btn.setContentAreaFilled(false);
        close_btn.setFocusable(false);
        close_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                close_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                close_btnMouseExited(evt);
            }
        });
        close_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_btnActionPerformed(evt);
            }
        });
        mainPanel.add(close_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, 40, 40));

        jLabel2.setFont(new java.awt.Font("JetBrains Mono NL", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Tu alfabeto:");
        mainPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, -1));
        mainPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 620, 20));

        textAlphabet.setFont(new java.awt.Font("JetBrains Mono NL", 0, 14)); // NOI18N
        textAlphabet.setText("Ingresa tu alfabeto...");
        textAlphabet.setBorder(null);
        textAlphabet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textAlphabetMouseClicked(evt);
            }
        });
        mainPanel.add(textAlphabet, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 610, -1));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("JetBrains Mono NL", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 51, 51));
        jButton3.setText("Validar alfabeto");
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        mainPanel.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 150, 60));

        jLabel3.setFont(new java.awt.Font("JetBrains Mono NL", 1, 24)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/logo_45.png"))); // NOI18N
        jLabel3.setText("Ingresa tu alfabeto");
        mainPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        areaAlphabet.setEditable(false);
        areaAlphabet.setColumns(20);
        areaAlphabet.setFont(new java.awt.Font("JetBrains Mono NL", 0, 14)); // NOI18N
        areaAlphabet.setForeground(new java.awt.Color(51, 51, 51));
        areaAlphabet.setRows(5);
        jScrollPane1.setViewportView(areaAlphabet);

        mainPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 590, -1));

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 816, 499));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mainPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainPanelMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_mainPanelMousePressed

    private void mainPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainPanelMouseDragged
        this.setLocation(this.getLocation().x + evt.getX()-x, this.getLocation().y + evt.getY()-y );
        this.setOpacity(0.9f);
    }//GEN-LAST:event_mainPanelMouseDragged

    private void mainPanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainPanelMouseReleased
        this.setOpacity(1f);
    }//GEN-LAST:event_mainPanelMouseReleased

    private void close_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_btnMouseEntered
        close_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/close_enabled.png")));
    }//GEN-LAST:event_close_btnMouseEntered

    private void close_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_btnMouseExited
        close_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/close_disabled.png")));
    }//GEN-LAST:event_close_btnMouseExited

    private void close_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_btnActionPerformed
        this.dispose();
    }//GEN-LAST:event_close_btnActionPerformed

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        jButton3.setForeground(new java.awt.Color(0, 153, 51));
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 51), 1, true));
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        jButton3.setForeground(new java.awt.Color(51, 51, 51));
        jButton3.setBorder(null);
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(alphabet.validarAlfabeto(textAlphabet.getText())){
            llenarAlfabeto();
            jLabel2.setForeground(new java.awt.Color(0, 153, 51));
            jLabel2.setText("Alfabeto válido");
            alphabet.valido = true;
        }else{
            jLabel2.setForeground(new java.awt.Color(255, 0, 0));
            jLabel2.setText("Alfabeto inválido");
            areaAlphabet.setText("");
            alphabet.alfabetoM = new String[100];
            alphabet.valido = false;
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void textAlphabetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textAlphabetMouseClicked
        textAlphabet.setText("");
    }//GEN-LAST:event_textAlphabetMouseClicked

    
    void llenarAlfabeto(){
        areaAlphabet.setText("");
            for(int i = 0; i < alphabet.size; i++){
                if(!areaAlphabet.getText().isBlank()){
                    alphabet.alf += "("+alphabet.alfabetoM[i]+")*";
                    areaAlphabet.setText(areaAlphabet.getText()+", "+alphabet.alfabetoM[i]);
                }else{
                    alphabet.alf += "("+alphabet.alfabetoM[i]+")*";
                    areaAlphabet.setText(alphabet.alfabetoM[i]);
                }
                
            }
    }
    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(entradaAlfabeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(entradaAlfabeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(entradaAlfabeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(entradaAlfabeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new entradaAlfabeto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaAlphabet;
    private javax.swing.JButton close_btn;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField textAlphabet;
    // End of variables declaration//GEN-END:variables

}
