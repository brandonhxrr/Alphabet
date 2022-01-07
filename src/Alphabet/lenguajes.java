package Alphabet;

import java.util.HashSet;


public class lenguajes extends javax.swing.JFrame {
    
    int x, y; 
    Alphabet alphabet;
        
    public lenguajes() {
        this.setTitle("Generar lenguajes");
        initComponents();
        alphabet = Menu.alphabet;
        
        valida1.setForeground(new java.awt.Color(255, 255, 255));
        valida2.setForeground(new java.awt.Color(255, 255, 255));
        
        if(alphabet.size == 0 || alphabet.valido == false){
            area.setText("Ingresa un alfabeto");
            np1.setEnabled(false);
            np2.setEnabled(false);
            l1.setEnabled(false);
            l2.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        close_btn = new javax.swing.JButton();
        valida2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        np1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        btnCadena1 = new javax.swing.JButton();
        valida1 = new javax.swing.JLabel();
        l1 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        np2 = new javax.swing.JTextField();
        l2 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        valida3 = new javax.swing.JLabel();
        valida4 = new javax.swing.JLabel();

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
        mainPanel.add(valida2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 120, -1));
        mainPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 100, 20));

        np1.setFont(new java.awt.Font("JetBrains Mono NL", 0, 14)); // NOI18N
        np1.setText("Palabras");
        np1.setBorder(null);
        np1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                np1MouseClicked(evt);
            }
        });
        mainPanel.add(np1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 90, -1));

        jLabel3.setFont(new java.awt.Font("JetBrains Mono NL", 1, 24)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-translate-text-48.png"))); // NOI18N
        jLabel3.setText("Generar lenguajes");
        mainPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        area.setEditable(false);
        area.setColumns(20);
        area.setFont(new java.awt.Font("JetBrains Mono NL", 0, 14)); // NOI18N
        area.setForeground(new java.awt.Color(51, 51, 51));
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        mainPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 276, 590, 170));

        btnCadena1.setBackground(new java.awt.Color(255, 255, 255));
        btnCadena1.setFont(new java.awt.Font("JetBrains Mono NL", 0, 14)); // NOI18N
        btnCadena1.setForeground(new java.awt.Color(51, 51, 51));
        btnCadena1.setText("Generar lenguajes");
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
        mainPanel.add(valida1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 150, -1));

        l1.setFont(new java.awt.Font("JetBrains Mono NL", 0, 14)); // NOI18N
        l1.setText("Longitud");
        l1.setBorder(null);
        l1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l1MouseClicked(evt);
            }
        });
        mainPanel.add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 90, -1));
        mainPanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 100, 20));

        np2.setFont(new java.awt.Font("JetBrains Mono NL", 0, 14)); // NOI18N
        np2.setText("Palabras");
        np2.setBorder(null);
        np2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                np2MouseClicked(evt);
            }
        });
        mainPanel.add(np2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 90, -1));

        l2.setFont(new java.awt.Font("JetBrains Mono NL", 0, 14)); // NOI18N
        l2.setText("Longitud");
        l2.setBorder(null);
        l2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l2MouseClicked(evt);
            }
        });
        mainPanel.add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 90, -1));
        mainPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 100, 20));
        mainPanel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 100, 20));

        valida3.setFont(new java.awt.Font("JetBrains Mono NL", 1, 14)); // NOI18N
        valida3.setText("Lenguaje 2");
        mainPanel.add(valida3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 110, -1));

        valida4.setFont(new java.awt.Font("JetBrains Mono NL", 1, 14)); // NOI18N
        valida4.setText("Lenguaje 1");
        mainPanel.add(valida4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 110, -1));

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

    private void btnCadena1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadena1MouseEntered
        btnCadena1.setForeground(new java.awt.Color(0, 153, 51));
        btnCadena1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 51), 1, true));
    }//GEN-LAST:event_btnCadena1MouseEntered

    private void btnCadena1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadena1MouseExited
       btnCadena1.setForeground(new java.awt.Color(51, 51, 51));
       btnCadena1.setBorder(null);
    }//GEN-LAST:event_btnCadena1MouseExited

    private void btnCadena1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadena1ActionPerformed
       boolean x = true;
        if(Integer.parseInt(np1.getText()) > Math.pow(alphabet.size, Integer.parseInt(l1.getText()))){
           x = false;
           valida1.setForeground(new java.awt.Color(255, 0, 0));
            valida1.setText("Inválidos");
            area.setText("No es posible generar  "+ np1.getText()+ " combinaciones de longitud "+ l1.getText() + " con " + alphabet.size+ " elementos en el alfabeto");
       }
       if(Integer.parseInt(np2.getText()) > Math.pow(alphabet.size, Integer.parseInt(l2.getText()))){
           x = false;
           valida2.setForeground(new java.awt.Color(255, 0, 0));
            valida2.setText("Inválidos");
           area.setText( "No es posible generar  "+ np2.getText()+ " combinaciones de longitud "+ l2.getText() + " con " + alphabet.size+ " elementos en el alfabeto");
       }
       if(x){
           valida1.setForeground(new java.awt.Color(0, 153, 51));
            valida2.setForeground(new java.awt.Color(0, 153, 51));
            
            valida1.setText("Válidos");
            valida2.setText("Válidos");
            
           alphabet.L1 = alphabet.generarLenguaje(Integer.parseInt(np1.getText()), Integer.parseInt(l1.getText()) );
           alphabet.L2 = alphabet.generarLenguaje(Integer.parseInt(np2.getText()), Integer.parseInt(l2.getText()) );
           area.setText("LENGUAJE 1 \n");
           
           imprimirLenguaje(alphabet.L1);
           
           area.setText(area.getText()+"\n\nLENGUAJE 2 \n");
           
           imprimirLenguaje(alphabet.L2);
           
           area.setText(area.getText()+"\n\nUNIÓN DE L1 con L2 \n");
           
           imprimirLenguaje(alphabet.unirLenguajes(alphabet.L1, alphabet.L2));
           
           area.setText(area.getText()+"\n\nCONCATENACIÓN DE L1 con L2 \n");
           
           imprimirLenguaje(alphabet.concatenarLenguaje(alphabet.L1, alphabet.L2));
           
           area.setText(area.getText()+"\n\nCONCATENACIÓN DE L2 con L1 \n");
           
           imprimirLenguaje(alphabet.concatenarLenguaje(alphabet.L2, alphabet.L1));
           
           
       }
    }//GEN-LAST:event_btnCadena1ActionPerformed

    private void np1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_np1MouseClicked
        np1.setText("");
    }//GEN-LAST:event_np1MouseClicked

    private void l1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l1MouseClicked
        l1.setText("");
    }//GEN-LAST:event_l1MouseClicked

    private void np2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_np2MouseClicked
        np2.setText("");
    }//GEN-LAST:event_np2MouseClicked

    private void l2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l2MouseClicked
        l2.setText("");
    }//GEN-LAST:event_l2MouseClicked

    void imprimirLenguaje(HashSet<String> leng) {
        for(String pal : leng){
            area.setText(area.getText()+ pal + ", ");
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
            java.util.logging.Logger.getLogger(lenguajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lenguajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lenguajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lenguajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lenguajes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JButton btnCadena1;
    private javax.swing.JButton close_btn;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField l1;
    private javax.swing.JTextField l2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField np1;
    private javax.swing.JTextField np2;
    private javax.swing.JLabel valida1;
    private javax.swing.JLabel valida2;
    private javax.swing.JLabel valida3;
    private javax.swing.JLabel valida4;
    // End of variables declaration//GEN-END:variables

}
