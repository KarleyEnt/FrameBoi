/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frameboi;

import java.awt.Color;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;


/**
 *
 * @author Anant
 */
public class First_Medium_Level extends javax.swing.JFrame {

    /**
     * Creates new form First_Medium_Level
     */
    
     
    int i = 0,itemsLeft = 4, ScoreV = 100;
    
    Border border = BorderFactory.createLineBorder(Color.yellow, 2);
 
    Timer timer = new Timer();
    
    int BottleL = 1, condomL = 1, braL = 1, pantyL = 1;
    
    public First_Medium_Level() {
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
                    frm.calculateScore(Time_Field.getText(),ScoreV,uname,"Medium");
                    timer.cancel();
                    timer.purge();
                    JOptionPane.showMessageDialog(null,"Score = " + ScoreV);
                }
                else{
                    i++;
                    Time_Field.setText(Integer.toString(i));
                    Time_Bar.setValue(i);
                    if(ScoreV==0)
                    {
                        timer.cancel();
                        timer.purge();
                        JOptionPane.showMessageDialog(null,"Score = " + ScoreV);                        
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

        jPanel2 = new javax.swing.JPanel();
        Solution = new javax.swing.JButton();
        Hint = new javax.swing.JButton();
        Home = new javax.swing.JButton();
        Time_Field = new javax.swing.JTextField();
        scoreTime = new javax.swing.JLabel();
        scoreLabel = new javax.swing.JLabel();
        Score_Text = new javax.swing.JTextField();
        Time_Bar = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        Bottle = new javax.swing.JLabel();
        panty = new javax.swing.JLabel();
        condom = new javax.swing.JLabel();
        bra = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();
        BraBox = new javax.swing.JCheckBox();
        PantyBox = new javax.swing.JCheckBox();
        BottleBox = new javax.swing.JCheckBox();
        CondomBox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(615, 590));
        setSize(new java.awt.Dimension(615, 590));
        getContentPane().setLayout(null);

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
        Hint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HintMouseClicked(evt);
            }
        });
        Hint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HintActionPerformed(evt);
            }
        });
        jPanel2.add(Hint);
        Hint.setBounds(110, 10, 79, 30);

        Home.setText("Home");
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        jPanel2.add(Home);
        Home.setBounds(520, 10, 70, 30);

        Time_Field.setText("Timer");
        Time_Field.setName("timer_one"); // NOI18N
        Time_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Time_FieldActionPerformed(evt);
            }
        });
        jPanel2.add(Time_Field);
        Time_Field.setBounds(310, 10, 70, 30);

        scoreTime.setText("Time Elapsed :");
        jPanel2.add(scoreTime);
        scoreTime.setBounds(220, 10, 90, 30);

        scoreLabel.setText("Score :");
        scoreLabel.setToolTipText("");
        jPanel2.add(scoreLabel);
        scoreLabel.setBounds(410, 16, 70, 20);

        Score_Text.setText("Score");
        Score_Text.setName("Score_Text"); // NOI18N
        Score_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Score_TextActionPerformed(evt);
            }
        });
        jPanel2.add(Score_Text);
        Score_Text.setBounds(460, 10, 50, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 450, 600, 60);

        Time_Bar.setName("Time_Bar"); // NOI18N
        Time_Bar.setStringPainted(true);
        getContentPane().add(Time_Bar);
        Time_Bar.setBounds(0, 0, 600, 70);

        jPanel1.setLayout(null);

        Bottle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frameboi/water.png"))); // NOI18N
        Bottle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BottleMouseClicked(evt);
            }
        });
        jPanel1.add(Bottle);
        Bottle.setBounds(4, 170, 50, 64);
        Bottle.getAccessibleContext().setAccessibleName("Bottle");

        panty.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frameboi/panties.png"))); // NOI18N
        panty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pantyMouseClicked(evt);
            }
        });
        jPanel1.add(panty);
        panty.setBounds(350, 370, 70, 50);
        panty.getAccessibleContext().setAccessibleName("panty");

        condom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frameboi/pngguru.com-id-vjxye(1).png"))); // NOI18N
        condom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                condomMouseClicked(evt);
            }
        });
        jPanel1.add(condom);
        condom.setBounds(590, 260, 20, 20);
        condom.getAccessibleContext().setAccessibleName("condom");

        bra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frameboi/pngguru.com-id-lhpey(2).png"))); // NOI18N
        bra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                braMouseClicked(evt);
            }
        });
        jPanel1.add(bra);
        bra.setBounds(60, 320, 50, 40);
        bra.getAccessibleContext().setAccessibleName("bra");

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frameboi/bedroom.png"))); // NOI18N
        jPanel1.add(Background);
        Background.setBounds(-110, 0, 710, 450);
        Background.getAccessibleContext().setAccessibleName("Background");

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 600, 450);

        BraBox.setText("Brasserie");
        getContentPane().add(BraBox);
        BraBox.setBounds(10, 500, 100, 40);
        BraBox.getAccessibleContext().setAccessibleName("BraBox");

        PantyBox.setText("Panty");
        getContentPane().add(PantyBox);
        PantyBox.setBounds(170, 510, 93, 24);
        PantyBox.getAccessibleContext().setAccessibleName("PantyBox");

        BottleBox.setText("Bottle");
        getContentPane().add(BottleBox);
        BottleBox.setBounds(280, 510, 70, 24);
        BottleBox.getAccessibleContext().setAccessibleName("BottleBox");

        CondomBox.setText("Condom");
        getContentPane().add(CondomBox);
        CondomBox.setBounds(410, 510, 85, 24);
        CondomBox.getAccessibleContext().setAccessibleName("CondomBox");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BottleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BottleMouseClicked
        // TODO add your handling code here:
        BottleL--;
        Bottle.setVisible(false);
        itemsLeft--;
        ScoreV = ScoreV + 50;
        Score_Text.setText(Integer.toString(ScoreV));
        if(BottleL==0)
        {BottleBox.setSelected(true);}
    }//GEN-LAST:event_BottleMouseClicked

    private void braMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_braMouseClicked
        // TODO add your handling code here:
        braL--;
        bra.setVisible(false);
        itemsLeft--;
        ScoreV = ScoreV + 50;
        Score_Text.setText(Integer.toString(ScoreV));
        if(braL==0)
        {BraBox.setSelected(true);}
    }//GEN-LAST:event_braMouseClicked

    private void pantyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pantyMouseClicked
        // TODO add your handling code here:
        pantyL--;
        panty.setVisible(false);
        itemsLeft--;
        ScoreV = ScoreV + 50;
        Score_Text.setText(Integer.toString(ScoreV));
        if(pantyL==0)
        {PantyBox.setSelected(true);}
    }//GEN-LAST:event_pantyMouseClicked

    private void condomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_condomMouseClicked
        // TODO add your handling code here:
        condomL--;
        condom.setVisible(false);
        itemsLeft--;
        ScoreV = ScoreV + 50;
        Score_Text.setText(Integer.toString(ScoreV));
        if(condomL==0)
        {CondomBox.setSelected(true);}
    }//GEN-LAST:event_condomMouseClicked

    private void Score_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Score_TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Score_TextActionPerformed

    private void Time_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Time_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Time_FieldActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        // TODO add your handling code here:
        new First_Difficulty().setVisible(true);
        dispose();
    }//GEN-LAST:event_HomeActionPerformed

    private void HintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HintActionPerformed
        // TODO add your handling code here:
        ScoreV = ScoreV - 20;
        JOptionPane.showMessageDialog(null, "Items Left: " + itemsLeft);
        
        
 
//        Imgcodecs.imwrite(filePath+"sonuc.jpg", source);
//        System.out.println("Complated.");
    }//GEN-LAST:event_HintActionPerformed

    private void SolutionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SolutionActionPerformed
        ScoreV = 0;
        Score_Text.setText("0");
        Bottle.setBorder(border);
        condom.setBorder(border);
        bra.setBorder(border);
        panty.setBorder(border);
    }//GEN-LAST:event_SolutionActionPerformed

    private void HintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HintMouseClicked
        // TODO add your handling code here:
      
    }//GEN-LAST:event_HintMouseClicked

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
            java.util.logging.Logger.getLogger(First_Medium_Level.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(First_Medium_Level.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(First_Medium_Level.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(First_Medium_Level.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new First_Medium_Level().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Bottle;
    private javax.swing.JCheckBox BottleBox;
    private javax.swing.JCheckBox BraBox;
    private javax.swing.JCheckBox CondomBox;
    private javax.swing.JButton Hint;
    private javax.swing.JButton Home;
    private javax.swing.JCheckBox PantyBox;
    private javax.swing.JTextField Score_Text;
    private javax.swing.JButton Solution;
    private javax.swing.JProgressBar Time_Bar;
    private javax.swing.JTextField Time_Field;
    private javax.swing.JLabel bra;
    private javax.swing.JLabel condom;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel panty;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JLabel scoreTime;
    // End of variables declaration//GEN-END:variables
}
