package Alphabet;


public class entradaCadenas extends javax.swing.JFrame {
    
    int x, y; 
    Alphabet alphabet;
        
    public entradaCadenas() {
        this.setTitle("Validar cadenas");
        initComponents();
        alphabet = Menu.alphabet;
        valida1.setForeground(new java.awt.Color(255, 255, 255));
        valida2.setForeground(new java.awt.Color(255, 255, 255));
        if(alphabet.size == 0 || alphabet.valido == false){
            cadena1.setEnabled(false);
            cadena2.setEnabled(false);
            valida1.setForeground(new java.awt.Color(255, 255, 255));
            area.setText("Ingresa un alfabeto");
            valida2.setForeground(new java.awt.Color(255, 255, 255));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        close_btn = new javax.swing.JButton();
        valida2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cadena1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        cadena2 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btnCadena1 = new javax.swing.JButton();
        valida1 = new javax.swing.JLabel();

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

        valida2.setFont(new java.awt.Font("JetBrains Mono NL", 1, 14)); // NOI18N
        valida2.setForeground(new java.awt.Color(255, 0, 0));
        valida2.setText("Válida");
        mainPanel.add(valida2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, 70, -1));
        mainPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 240, 20));

        cadena1.setFont(new java.awt.Font("JetBrains Mono NL", 0, 14)); // NOI18N
        cadena1.setText("Ingresa la primera cadena");
        cadena1.setBorder(null);
        cadena1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadena1MouseClicked(evt);
            }
        });
        mainPanel.add(cadena1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 230, -1));

        jLabel3.setFont(new java.awt.Font("JetBrains Mono NL", 1, 24)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-symbian-48.png"))); // NOI18N
        jLabel3.setText("Ingresa tus cadenas");
        mainPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        area.setEditable(false);
        area.setColumns(20);
        area.setFont(new java.awt.Font("JetBrains Mono NL", 0, 14)); // NOI18N
        area.setForeground(new java.awt.Color(51, 51, 51));
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        mainPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 276, 590, 170));

        cadena2.setFont(new java.awt.Font("JetBrains Mono NL", 0, 14)); // NOI18N
        cadena2.setText("Ingresa la segunda cadena");
        cadena2.setBorder(null);
        cadena2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadena2MouseClicked(evt);
            }
        });
        mainPanel.add(cadena2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 230, -1));
        mainPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 240, 20));

        btnCadena1.setBackground(new java.awt.Color(255, 255, 255));
        btnCadena1.setFont(new java.awt.Font("JetBrains Mono NL", 0, 14)); // NOI18N
        btnCadena1.setForeground(new java.awt.Color(51, 51, 51));
        btnCadena1.setText("Validar cadenas");
        btnCadena1.setBorder(null);
        btnCadena1.setContentAreaFilled(false);
        btnCadena1.setFocusable(false);
        btnCadena1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCadena1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCadena1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCadena1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCadena1MouseExited(evt);
            }
        });
        btnCadena1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadena1ActionPerformed(evt);
            }
        });
        mainPanel.add(btnCadena1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 150, 60));

        valida1.setFont(new java.awt.Font("JetBrains Mono NL", 1, 14)); // NOI18N
        valida1.setForeground(new java.awt.Color(255, 0, 0));
        valida1.setText("Válida");
        mainPanel.add(valida1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 110, -1));

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

    private void cadena1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadena1MouseClicked
        cadena1.setText("");
    }//GEN-LAST:event_cadena1MouseClicked

    private void cadena2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadena2MouseClicked
        cadena2.setText("");
    }//GEN-LAST:event_cadena2MouseClicked

    private void btnCadena1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadena1MouseEntered
        btnCadena1.setForeground(new java.awt.Color(0, 153, 51));
        btnCadena1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 51), 1, true));
    }//GEN-LAST:event_btnCadena1MouseEntered

    private void btnCadena1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadena1MouseExited
       btnCadena1.setForeground(new java.awt.Color(51, 51, 51));
       btnCadena1.setBorder(null);
    }//GEN-LAST:event_btnCadena1MouseExited

    private void btnCadena1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadena1ActionPerformed
        alphabet.w1 = cadena1.getText();
        alphabet.w2 = cadena2.getText();
        validarCadenas();
    }//GEN-LAST:event_btnCadena1ActionPerformed

    
    void validarCadenas(){
        if(alphabet.validarCadena(alphabet.w1)){
            valida1.setForeground(new java.awt.Color(0, 153, 51));
            valida1.setText("Válida");
        }else{
            valida1.setForeground(new java.awt.Color(255, 0, 0));
            valida1.setText("Inválida");
        }
        if(alphabet.validarCadena(alphabet.w2)){
            valida2.setForeground(new java.awt.Color(0, 153, 51));
            valida2.setText("Válida");
        }else{
            valida2.setForeground(new java.awt.Color(255, 0, 0));
            valida2.setText("Inválida");
        }
        
        if(alphabet.validarCadena(alphabet.w2) && alphabet.validarCadena(alphabet.w1)){
            area.setText("");
            area.setText(area.getText() + "PREFIJOS\n");
            area.setText(area.getText() +"Cadena 1 prefijo de 2: [" + alphabet.validarPrefijo(alphabet.w1, alphabet.w2)+"]\n");
            area.setText(area.getText() +"Cadena 2 prefijo de 1: [" + alphabet.validarPrefijo(alphabet.w2, alphabet.w1)+"]\n");
            area.setText(area.getText() + "\nSUFIJOS\n");
            area.setText(area.getText() +"Cadena 1 sufijo de 2: [" + alphabet.validarSufijo(alphabet.w2, alphabet.w1)+"]\n");
            area.setText(area.getText() +"Cadena 2 sufijo de 1: [" + alphabet.validarSufijo(alphabet.w1, alphabet.w2)+"]\n");
            area.setText(area.getText() + "\nSUBCADENAS\n");
            area.setText(area.getText() +"Cadena 1 subcadena de 2: [" + alphabet.validarSubcadena(alphabet.w2, alphabet.w1)+"]\n");
            area.setText(area.getText() +"Cadena 2 subcadena de 1: [" + alphabet.validarSubcadena(alphabet.w1, alphabet.w2)+"]\n");
            area.setText(area.getText() + "\nSUBCADENAS PROPIAS\n");
            area.setText(area.getText() +"Cadena 1 subcadena propia de 2: [" + alphabet.validarSubcadenaPropia(alphabet.w2, alphabet.w1)+"]\n");
            area.setText(area.getText() +"Cadena 2 subcadena propia de 1: [" + alphabet.validarSubcadenaPropia(alphabet.w1, alphabet.w2)+"]\n");
            area.setText(area.getText() + "\nPREFIJOS PROPIOS\n");
            area.setText(area.getText() +"Cadena 1 prefijo propio de 2: [" + alphabet.validarPrefijoPropio(alphabet.w1, alphabet.w2)+"]\n");
            area.setText(area.getText() +"Cadena 2 prefijo propio de 1: [" + alphabet.validarPrefijoPropio(alphabet.w2, alphabet.w1)+"]\n");
            area.setText(area.getText() + "\nSUFIJOS PROPIOS\n");
            area.setText(area.getText() +"Cadena 1 sufijo propio de 2: [" + alphabet.validarSufijoPropio(alphabet.w2, alphabet.w1)+"]\n");
            area.setText(area.getText() +"Cadena 2 sufijo propio de 1: [" + alphabet.validarSufijoPropio(alphabet.w1, alphabet.w2)+"]\n");
            area.setText(area.getText() + "\nSUBSECUENCIAS\n");
            area.setText(area.getText() +"Cadena 2 subsecuencia de 1: [" + alphabet.validarSubsecuencia(alphabet.w2, alphabet.w1)+"]\n");
            area.setText(area.getText() +"Cadena 1 subsecuencia de 2: [" + alphabet.validarSubsecuencia(alphabet.w1, alphabet.w2)+"]\n");
        }else{
            area.setText("");
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
            java.util.logging.Logger.getLogger(entradaCadenas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(entradaCadenas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(entradaCadenas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(entradaCadenas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new entradaCadenas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JButton btnCadena1;
    private javax.swing.JTextField cadena1;
    private javax.swing.JTextField cadena2;
    private javax.swing.JButton close_btn;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel valida1;
    private javax.swing.JLabel valida2;
    // End of variables declaration//GEN-END:variables

}
