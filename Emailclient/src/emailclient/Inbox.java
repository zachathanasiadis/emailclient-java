/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package emailclient;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.*;

/**
 *
 * @author kosta
 */
public class Inbox extends javax.swing.JFrame {

    /**
     * Creates new form Inbox
     */
    public Inbox() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Email Client");
        String email = SignIn.email;
        jLabel1.setText(email.replaceAll("^(.*?)@.*$", "$1"));
        jLabel2.setText(email);
        InboxMail("INBOX");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(738, 469));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Name");

        jLabel2.setText("email");

        jButton1.setBackground(new java.awt.Color(64, 56, 98));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon pencil(2).png"))); // NOI18N
        jButton1.setText("Compose   ");
        jButton1.setToolTipText("");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(230, 230, 230));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/inbox resized_1.png"))); // NOI18N
        jButton2.setText(" Inbox          ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(230, 230, 230));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/star (correct)_1.png"))); // NOI18N
        jButton3.setText("Starred        ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(230, 230, 230));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sent resized.png"))); // NOI18N
        jButton4.setText("Sent           ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(230, 230, 230));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exlamation resized.png"))); // NOI18N
        jButton5.setText("Important  ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(230, 230, 230));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bin resized.png"))); // NOI18N
        jButton6.setText("Deleted     ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(230, 230, 230));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exlamation resized.png"))); // NOI18N
        jButton7.setText("Spam");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jList1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jList1);

        jButton8.setBackground(new java.awt.Color(230, 230, 230));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/download resized.png"))); // NOI18N
        jButton8.setText("Download ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InboxMail(String folderType){
        try{
            Folder inbox = SignIn.store.getFolder(folderType);
            inbox.open(Folder.READ_WRITE); // Open the inbox in read-only mode
            DefaultListModel<String> listModel = new DefaultListModel<>();
            Message[] messages = inbox.getMessages();
            for (Message message : messages) {
                    String subject = message.getSubject();
                    Address[] senderAddresses = message.getFrom();
                    String sentDate = message.getSentDate().toString().replace(" EEST", "").trim();
                        
                    StringBuilder mailTitle = new StringBuilder();
                    for (Address sender : senderAddresses) {
                        String correctSender = sender.toString().split("<")[0].trim();
                        mailTitle.append(correctSender).append(" - ");
                    }
                    mailTitle.append(subject);
                    mailTitle.append(" - ");
                    mailTitle.append(sentDate);
                    listModel.add(0,mailTitle.toString());
                }
            jList1.setModel(listModel);
        }catch (MessagingException e) {
                e.printStackTrace();
        }
    }
   
    private void Sent(){
        try{
            Folder inbox = SignIn.store.getFolder("[Gmail]/Sent Mail");
            inbox.open(Folder.READ_WRITE); // Open the inbox in read-only mode
            DefaultListModel<String> listModel = new DefaultListModel<>();
            Message[] messages = inbox.getMessages();
            for (Message message : messages) {
                    String subject = message.getSubject();
                    Address[] senderAddresses = message.getFrom();
                    String sentDate = message.getSentDate().toString().replace(" EEST", "").trim();

                    StringBuilder mailTitle = new StringBuilder();
                    for (Address sender : senderAddresses) {
                        String correctSender = sender.toString().split("<")[0].trim();
                        mailTitle.append(correctSender).append(" - ");
                    }
                    mailTitle.append(subject);
                    mailTitle.append(" - ");
                    mailTitle.append(sentDate);
                    listModel.add(0,mailTitle.toString());
                }
            jList1.setModel(listModel);
        }catch (MessagingException e) {
                e.printStackTrace();
        }
    } 
    
    private void Starred(){
        try{
            Folder inbox = SignIn.store.getFolder("[Gmail]/Starred");
            inbox.open(Folder.READ_WRITE); // Open the inbox in read-only mode
            DefaultListModel<String> listModel = new DefaultListModel<>();
            Message[] messages = inbox.getMessages();
            for (Message message : messages) {
                    String subject = message.getSubject();
                    Address[] senderAddresses = message.getFrom();
                    String sentDate = message.getSentDate().toString().replace(" EEST", "").trim();
                    StringBuilder mailTitle = new StringBuilder();
                    for (Address sender : senderAddresses) {
                        String correctSender = sender.toString().split("<")[0].trim();
                        mailTitle.append(correctSender).append(" - ");
                    }
                    mailTitle.append(subject);
                    mailTitle.append(" - ");
                    mailTitle.append(sentDate);
                    System.out.println(sentDate);
                    listModel.add(0,mailTitle.toString());
                }
            jList1.setModel(listModel);
        }catch (MessagingException e) {
                e.printStackTrace();
        }
    }
    
    private void Important(){
        try{
            Folder inbox = SignIn.store.getFolder("[Gmail]/Important");
            inbox.open(Folder.READ_WRITE); // Open the inbox in read-only mode
            DefaultListModel<String> listModel = new DefaultListModel<>();
            Message[] messages = inbox.getMessages();
            for (Message message : messages) {
                    String subject = message.getSubject();
                    Address[] senderAddresses = message.getFrom();
                    String sentDate = message.getSentDate().toString().replace(" EEST", "").trim();

                    StringBuilder mailTitle = new StringBuilder();
                    for (Address sender : senderAddresses) {
                        String correctSender = sender.toString().split("<")[0].trim();
                        mailTitle.append(correctSender).append(" - ");
                    }
                    mailTitle.append(subject);
                    mailTitle.append(" - ");
                    mailTitle.append(sentDate);
                    listModel.add(0,mailTitle.toString());
                }
            jList1.setModel(listModel);
        }catch (MessagingException e) {
                e.printStackTrace();
        }
    }
    
    private void Deleted(){
        try{
            Folder inbox = SignIn.store.getFolder("[Gmail]/Trash");
            inbox.open(Folder.READ_WRITE); // Open the inbox in read-only mode
            DefaultListModel<String> listModel = new DefaultListModel<>();
            Message[] messages = inbox.getMessages();
            for (Message message : messages) {
                    String subject = message.getSubject();
                    Address[] senderAddresses = message.getFrom();
                    String sentDate = message.getSentDate().toString().replace(" EEST", "").trim();

                    StringBuilder mailTitle = new StringBuilder();
                    for (Address sender : senderAddresses) {
                        String correctSender = sender.toString().split("<")[0].trim();
                        mailTitle.append(correctSender).append(" - ");
                    }
                    mailTitle.append(subject);
                    mailTitle.append(" - ");
                    mailTitle.append(sentDate);
                    listModel.add(0,mailTitle.toString());
                }
            jList1.setModel(listModel); 
            
        }catch (MessagingException e) {
                e.printStackTrace();
        }
    }
    
    private void Spam(){
        try{
            Folder inbox = SignIn.store.getFolder("[Gmail]/Spam");
            inbox.open(Folder.READ_WRITE); // Open the inbox in read-only mode
            DefaultListModel<String> listModel = new DefaultListModel<>();
            Message[] messages = inbox.getMessages();
            for (Message message : messages) {
                    String subject = message.getSubject();
                    Address[] senderAddresses = message.getFrom();
                    String sentDate = message.getSentDate().toString().replace(" EEST", "").trim();

                    StringBuilder mailTitle = new StringBuilder();
                    for (Address sender : senderAddresses) {
                        String correctSender = sender.toString().split("<")[0].trim();
                        mailTitle.append(correctSender).append(" - ");
                    }
                    mailTitle.append(subject);
                    mailTitle.append(" - ");
                    mailTitle.append(sentDate);
                    listModel.add(0,mailTitle.toString());
                }
            jList1.setModel(listModel); 
            
        }catch (MessagingException e) {
                e.printStackTrace();
        }
    }
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        SendMail sendmail = new SendMail();
        sendmail.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        InboxMail("INBOX");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        InboxMail("[Gmail]/Starred");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        InboxMail("[Gmail]/Sent Mail");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        InboxMail("[Gmail]/Important");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        InboxMail("[Gmail]/Trash");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        InboxMail("[Gmail]/Spam");
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(Inbox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inbox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inbox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inbox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inbox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
