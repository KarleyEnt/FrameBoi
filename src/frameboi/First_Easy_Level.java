/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frameboi;

import java.awt.Color;
import java.awt.TextField;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author Anant
 */
public class First_Easy_Level extends javax.swing.JFrame {

    /**
     * Creates new form First_Easy_Level
     */
    
    First_Login f_l = new First_Login();
    
    int i = 0,itemsLeft = 4, ScoreV = 100;
    
    Border border = BorderFactory.createLineBorder(Color.yellow, 2);
 
    Timer timer = new Timer();
    
    int CoinsL = 2, KeyL = 1, HBL = 1;
    
    
    public First_Easy_Level() {
        initComponents();

        TimerTask task;
        task = new TimerTask()
        {
            public void run()
            {
                if(i==100 || itemsLeft == 0)
                {
                    score_page frm = new score_page();
                    String uname = First_Login_Page.getUsername();
                    frm.calculateScore(timer_field.getText(),ScoreV,uname,"Easy");
                    timer.cancel();
                    timer.purge();
                }
                else{
                    i++;
                    timer_field.setText(Integer.toString(i));
                    Time_Bar.setValue(i);
                    if(ScoreV==0)
                    {
                        timer.cancel();
                        timer.purge();
                        JOptionPane.showMessageDialog(null, ScoreV);                        
                        Score_Text.setText(Integer.toString(ScoreV));
                    }
                    else
                    {
                        ScoreV = ScoreV - 1;
                        Score_Text.setText(Integer.toString(ScoreV));
                    }
                }
            }
        };
        timer.scheduleAtFixedRate(task, 2000, 1000);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Solution = new javax.swing.JButton();
        Hint = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        timer_field = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Score_Text = new javax.swing.JTextField();
        Key = new javax.swing.JLabel();
        Coins_Two = new javax.swing.JLabel();
        Coins = new javax.swing.JLabel();
        H_Bag = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();
        Time_Bar = new javax.swing.JProgressBar();
        CoinsBox = new javax.swing.JCheckBox();
        HandBox = new javax.swing.JCheckBox();
        KeyBox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jPanel2.setLayout(null);

        Solution.setText("Solution");
        Solution.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SolutionActionPerformed(evt);
            }
        });
        jPanel2.add(Solution);
        Solution.setBounds(10, 10, 90, 30);

        Hint.setText("Hint");
        Hint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HintActionPerformed(evt);
            }
        });
        jPanel2.add(Hint);
        Hint.setBounds(110, 10, 79, 30);

        jButton3.setText("Home");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(580, 10, 70, 30);

        timer_field.setText("Timer");
        timer_field.setName("timer_one"); // NOI18N
        timer_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timer_fieldActionPerformed(evt);
            }
        });
        jPanel2.add(timer_field);
        timer_field.setBounds(310, 10, 70, 30);

        jLabel2.setText("Time Elapsed :");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(220, 10, 90, 30);

        jLabel1.setText("Score :");
        jLabel1.setToolTipText("");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(410, 16, 70, 20);

        Score_Text.setText("Score");
        Score_Text.setName("Score_Text"); // NOI18N
        Score_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Score_TextActionPerformed(evt);
            }
        });
        jPanel2.add(Score_Text);
        Score_Text.setBounds(460, 10, 50, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 480, 660, 60);

        Key.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frameboi/key.png"))); // NOI18N
        Key.setName("Key"); // NOI18N
        Key.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KeyMouseClicked(evt);
            }
        });
        jPanel1.add(Key);
        Key.setBounds(590, 360, 20, 30);

        Coins_Two.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frameboi/coins(1).png"))); // NOI18N
        Coins_Two.setName("Coins_Two"); // NOI18N
        Coins_Two.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Coins_TwoMouseClicked(evt);
            }
        });
        jPanel1.add(Coins_Two);
        Coins_Two.setBounds(610, 350, 20, 20);
        Coins_Two.getAccessibleContext().setAccessibleName("Coins_Two");

        Coins.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frameboi/coins(1).png"))); // NOI18N
        Coins.setName("Coins"); // NOI18N
        Coins.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CoinsMouseClicked(evt);
            }
        });
        jPanel1.add(Coins);
        Coins.setBounds(30, 270, 16, 16);
        Coins.getAccessibleContext().setAccessibleName("Coins");
        Coins.getAccessibleContext().setAccessibleDescription("");

        H_Bag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frameboi/hand-bag(1).png"))); // NOI18N
        H_Bag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                H_BagMouseClicked(evt);
            }
        });
        jPanel1.add(H_Bag);
        H_Bag.setBounds(310, 200, 64, 70);

        Background.setIcon(new javax.swing.ImageIcon("/home/aakash/FrameBoi/src/frameboi/mystery_easy.jpg")); // NOI18N
        jPanel1.add(Background);
        Background.setBounds(0, 60, 650, 420);

        Time_Bar.setName("Time_Bar"); // NOI18N
        Time_Bar.setStringPainted(true);
        jPanel1.add(Time_Bar);
        Time_Bar.setBounds(-4, -6, 660, 70);

        CoinsBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CoinsBox.setText("Coins");
        CoinsBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CoinsBoxActionPerformed(evt);
            }
        });

        HandBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        HandBox.setText("Hand Bag");

        KeyBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        KeyBox.setText("Key");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(CoinsBox)
                .addGap(158, 158, 158)
                .addComponent(HandBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(KeyBox)
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(KeyBox)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CoinsBox)
                        .addComponent(HandBox))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        f_l.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void timer_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timer_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timer_fieldActionPerformed

    private void H_BagMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_H_BagMouseClicked
        // TODO add your handling code here:
        HBL--;
        H_Bag.setVisible(false);
        itemsLeft--;
        ScoreV = ScoreV + 50;
        Score_Text.setText(Integer.toString(ScoreV));
        if(HBL==0)
        {HandBox.setSelected(true);}
    }//GEN-LAST:event_H_BagMouseClicked

    private void KeyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KeyMouseClicked
        // TODO add your handling code here:
        KeyL--;
        Key.setVisible(false);
        itemsLeft--;
        ScoreV = ScoreV + 50;
        Score_Text.setText(Integer.toString(ScoreV));
        if(KeyL==0)
        {KeyBox.setSelected(true);}
    }//GEN-LAST:event_KeyMouseClicked

    private void HintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HintActionPerformed
        // TODO add your handling code here:
              ScoreV = ScoreV - 20;
              JOptionPane.showMessageDialog(null, "Items Left: " + itemsLeft);
    }//GEN-LAST:event_HintActionPerformed

    private void SolutionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SolutionActionPerformed
        ScoreV = 0;
        Score_Text.setText("0");
        H_Bag.setBorder(border);
        Key.setBorder(border);
        Coins.setBorder(border);
        Coins_Two.setBorder(border);
    }//GEN-LAST:event_SolutionActionPerformed

    private void Score_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Score_TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Score_TextActionPerformed

    private void CoinsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CoinsMouseClicked
        // TODO add your handling code here:
        CoinsL--;
        Coins.setVisible(false);
        itemsLeft--;
        ScoreV = ScoreV + 50;
        Score_Text.setText(Integer.toString(ScoreV));
        if(CoinsL==0)
        {CoinsBox.setSelected(true);}
    }//GEN-LAST:event_CoinsMouseClicked

    private void Coins_TwoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Coins_TwoMouseClicked
        // TODO add your handling code here:
        CoinsL--;       
        Coins_Two.setVisible(false);
        itemsLeft--;
        ScoreV = ScoreV + 50;
        Score_Text.setText(Integer.toString(ScoreV));
         if(CoinsL==0)
        {CoinsBox.setSelected(true);}
    }//GEN-LAST:event_Coins_TwoMouseClicked

    private void CoinsBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CoinsBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CoinsBoxActionPerformed

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
            java.util.logging.Logger.getLogger(First_Easy_Level.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(First_Easy_Level.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(First_Easy_Level.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(First_Easy_Level.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new First_Easy_Level().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Coins;
    private javax.swing.JCheckBox CoinsBox;
    private javax.swing.JLabel Coins_Two;
    private javax.swing.JLabel H_Bag;
    private javax.swing.JCheckBox HandBox;
    private javax.swing.JButton Hint;
    private javax.swing.JLabel Key;
    private javax.swing.JCheckBox KeyBox;
    private javax.swing.JTextField Score_Text;
    private javax.swing.JButton Solution;
    private javax.swing.JProgressBar Time_Bar;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField timer_field;
    // End of variables declaration//GEN-END:variables
}
