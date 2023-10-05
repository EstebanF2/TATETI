package TaTeTi;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class Ventana extends javax.swing.JFrame {

    boolean estado = true;
    String siguienteJuego = "O";
    String turno = "X";
    JLabel lbs[] = new JLabel[9];
    int vs[][] = {
                  {0, 1, 2},
                  {3, 4, 5},
                  {6, 7, 8},
                  {0, 4, 8},
                  {2, 4, 6},
                  {0, 3, 6},
                  {1, 4, 7},
                  {2, 5, 8},
                 };

    public Ventana() {
        initComponents();

        this.setLocationRelativeTo(null);
        this.setResizable(false);

        lbs[0] = jLabel_0;
        lbs[1] = jLabel_1;
        lbs[2] = jLabel_2;
        lbs[3] = jLabel_3;
        lbs[4] = jLabel_4;
        lbs[5] = jLabel_5;
        lbs[6] = jLabel_6;
        lbs[7] = jLabel_7;
        lbs[8] = jLabel_8;

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel_0 = new javax.swing.JLabel();
        jLabel_1 = new javax.swing.JLabel();
        jLabel_2 = new javax.swing.JLabel();
        jLabel_3 = new javax.swing.JLabel();
        jLabel_4 = new javax.swing.JLabel();
        jLabel_5 = new javax.swing.JLabel();
        jLabel_6 = new javax.swing.JLabel();
        jLabel_7 = new javax.swing.JLabel();
        jLabel_8 = new javax.swing.JLabel();
        lb_turno = new javax.swing.JLabel();
        reiniciarJuego = new javax.swing.JButton();
        lb_puntajeX = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lb_puntajeO = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cerrar = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TA-TE-TI");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Wide Latin", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("TA-TE-TI");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 300, 30));

        jLabel_0.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_0.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 36)); // NOI18N
        jLabel_0.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_0.setOpaque(true);
        jLabel_0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_0MousePressed(evt);
            }
        });
        jPanel1.add(jLabel_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 60, 50));

        jLabel_1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 36)); // NOI18N
        jLabel_1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_1.setOpaque(true);
        jLabel_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_1MousePressed(evt);
            }
        });
        jPanel1.add(jLabel_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 60, 50));

        jLabel_2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 36)); // NOI18N
        jLabel_2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_2.setOpaque(true);
        jLabel_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_2MousePressed(evt);
            }
        });
        jPanel1.add(jLabel_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 60, 50));

        jLabel_3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_3.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 36)); // NOI18N
        jLabel_3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_3.setOpaque(true);
        jLabel_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_3MousePressed(evt);
            }
        });
        jPanel1.add(jLabel_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 60, 50));

        jLabel_4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_4.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 36)); // NOI18N
        jLabel_4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_4.setOpaque(true);
        jLabel_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_4MousePressed(evt);
            }
        });
        jPanel1.add(jLabel_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 60, 50));

        jLabel_5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_5.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 36)); // NOI18N
        jLabel_5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_5.setOpaque(true);
        jLabel_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_5MousePressed(evt);
            }
        });
        jPanel1.add(jLabel_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 60, 50));

        jLabel_6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_6.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 36)); // NOI18N
        jLabel_6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_6.setOpaque(true);
        jLabel_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_6MousePressed(evt);
            }
        });
        jPanel1.add(jLabel_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 60, 50));

        jLabel_7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_7.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 36)); // NOI18N
        jLabel_7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_7.setOpaque(true);
        jLabel_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_7MousePressed(evt);
            }
        });
        jPanel1.add(jLabel_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 60, 50));

        jLabel_8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_8.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 36)); // NOI18N
        jLabel_8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_8.setOpaque(true);
        jLabel_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_8MousePressed(evt);
            }
        });
        jPanel1.add(jLabel_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 60, 50));

        lb_turno.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lb_turno.setForeground(new java.awt.Color(255, 255, 255));
        lb_turno.setText("Turno de:");
        jPanel1.add(lb_turno, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 150, 40));

        reiniciarJuego.setBackground(new java.awt.Color(255, 255, 255));
        reiniciarJuego.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        reiniciarJuego.setForeground(new java.awt.Color(0, 0, 0));
        reiniciarJuego.setText("Reiniciar juego");
        reiniciarJuego.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        reiniciarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciarJuegoActionPerformed(evt);
            }
        });
        jPanel1.add(reiniciarJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 110, 30));

        lb_puntajeX.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lb_puntajeX.setForeground(new java.awt.Color(0, 0, 0));
        lb_puntajeX.setText("0");
        jPanel1.add(lb_puntajeX, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 30, 20));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("O :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 40, 40));

        lb_puntajeO.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lb_puntajeO.setForeground(new java.awt.Color(0, 0, 0));
        lb_puntajeO.setText("0");
        jPanel1.add(lb_puntajeO, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 30, 20));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("X :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 30, 20));

        cerrar.setBackground(new java.awt.Color(255, 102, 0));
        cerrar.setToolTipText("cerrar");
        cerrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cerrar.setOpaque(true);
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
        });
        jPanel1.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 10, 10));

        fondo.setBackground(new java.awt.Color(51, 102, 255));
        fondo.setOpaque(true);
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 400));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_0MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_0MousePressed
        presionar(0);
    }//GEN-LAST:event_jLabel_0MousePressed

    private void jLabel_1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_1MousePressed
        presionar(1);
    }//GEN-LAST:event_jLabel_1MousePressed

    private void jLabel_2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_2MousePressed
        presionar(2);
    }//GEN-LAST:event_jLabel_2MousePressed

    private void jLabel_3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_3MousePressed
        presionar(3);
    }//GEN-LAST:event_jLabel_3MousePressed

    private void jLabel_4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_4MousePressed
        presionar(4);
    }//GEN-LAST:event_jLabel_4MousePressed

    private void jLabel_5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_5MousePressed
        presionar(5);
    }//GEN-LAST:event_jLabel_5MousePressed

    private void jLabel_6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_6MousePressed
        presionar(6);
    }//GEN-LAST:event_jLabel_6MousePressed

    private void jLabel_7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_7MousePressed
        presionar(7);
    }//GEN-LAST:event_jLabel_7MousePressed

    private void jLabel_8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_8MousePressed
        presionar(8);
    }//GEN-LAST:event_jLabel_8MousePressed

    private void reiniciarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarJuegoActionPerformed
        for (int i = 0; i < lbs.length; i++) {
            lbs[i].setText("");
            lbs[i].setBackground(Color.WHITE);
        }

        turno = siguienteJuego;
        if (siguienteJuego.equals("O")) {
            siguienteJuego = "X";
        } else {
            siguienteJuego = "O";
        }

        lb_turno.setText("Turno de: " + turno);
        estado = true;
    }//GEN-LAST:event_reiniciarJuegoActionPerformed

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_cerrarMouseClicked

    public void presionar(int casilla) {
        //el if es para no presionar una casilla que ya la hallan presionado.
        if (lbs[casilla].getText().equals("") && estado) {
            lbs[casilla].setText(turno);
            cambiarTurno();
            comprobarGanador();
        }
    }

    public void cambiarTurno() {
        if (turno.equals("X")) {
            turno = "O";
        } else {
            turno = "X";
        }
        lb_turno.setText("Turno de: " + turno);
    }

    public void comprobarGanador() {
        for (int i = 0; i < vs.length; i++) {
            if (lbs[vs[i][0]].getText().equals("X")
                    && lbs[vs[i][1]].getText().equals("X")
                    && lbs[vs[i][2]].getText().equals("X")) {

                lbs[vs[i][0]].setBackground(Color.GREEN);
                lbs[vs[i][1]].setBackground(Color.GREEN);
                lbs[vs[i][2]].setBackground(Color.GREEN);

                lb_puntajeX.setText(Integer.toString(Integer.parseInt(lb_puntajeX.getText()) + 1));  //Aumento el score cuando gana X.
                lb_turno.setText("¡¡¡Gano X!!!");
                estado = false;
                finalizoJuego();
            }
            if (lbs[vs[i][0]].getText().equals("O")
                    && lbs[vs[i][1]].getText().equals("O")
                    && lbs[vs[i][2]].getText().equals("O")) {

                lbs[vs[i][0]].setBackground(Color.GREEN);
                lbs[vs[i][1]].setBackground(Color.GREEN);
                lbs[vs[i][2]].setBackground(Color.GREEN);

                lb_puntajeO.setText(Integer.toString(Integer.parseInt(lb_puntajeO.getText()) + 1)); //Aumento el score cuando gana O.
                lb_turno.setText("¡¡¡Gano O!!!");
                estado = false;
                finalizoJuego();

            }
        }

    }

    public void finalizoJuego() {
        if (lb_puntajeO.getText().equals("10")) {
            JOptionPane.showMessageDialog(null, "¡¡¡A GANADO O!!!");
            lb_puntajeO.setText("0");
            lb_puntajeX.setText("0");
        } else if (lb_puntajeX.getText().equals("10")) {
            JOptionPane.showMessageDialog(null, "¡¡¡A GANADO X!!!");
            lb_puntajeX.setText("0");
            lb_puntajeO.setText("0");
        }
    }

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cerrar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_0;
    private javax.swing.JLabel jLabel_1;
    private javax.swing.JLabel jLabel_2;
    private javax.swing.JLabel jLabel_3;
    private javax.swing.JLabel jLabel_4;
    private javax.swing.JLabel jLabel_5;
    private javax.swing.JLabel jLabel_6;
    private javax.swing.JLabel jLabel_7;
    private javax.swing.JLabel jLabel_8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_puntajeO;
    private javax.swing.JLabel lb_puntajeX;
    private javax.swing.JLabel lb_turno;
    private javax.swing.JButton reiniciarJuego;
    // End of variables declaration//GEN-END:variables
}
