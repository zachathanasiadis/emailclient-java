/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package emailclient;
import java.awt.*;
import javax.mail.*;
import java.io.*;
import java.net.URISyntaxException;
import javax.swing.*;
import javax.mail.internet.*;
import javax.swing.event.*;
/**
 *
 * @author kosta
 */
public class ViewMail extends javax.swing.JFrame {

    /**
     * Creates new form ViewMail
     */
    DefaultListModel<String> listModel = new DefaultListModel<>();
    private boolean isClicked1 = false;
    private boolean isClicked2= false;
    private boolean isClicked3 = false;
    public static String replyText;
    public static Message messagerefwd;
    public static String replyTo;
    public static String replySubject;
    public static String forwardedSubject;
    public static String forwardedText;
    File selectedDirectory;
    Message message = Inbox.selectedMailCode;
    String messageContent = "";
    String senderAddressViewMail = null;
    boolean isStarred;
    boolean isRead;
    Flags flags;
    public ViewMail() {
        initComponents();
        jButton8.setVisible(false);
        jScrollPane2.setVisible(false);
        setLocationRelativeTo(null);
        setTitle("Email Client");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        try{
            Recipients();
            jLabel1.setText(message.getSubject());
                        jLabel1.setText(message.getSubject());
            if ((message.getSubject()).length() > 40) {
                jLabel1.setToolTipText(message.getSubject()); 
            } else {
                jLabel1.setToolTipText(null); 
            }
            Address[] address = message.getFrom();
            for (Address realAddress: address){
                senderAddressViewMail = realAddress.toString();
            }
            jLabel4.setText(senderAddressViewMail);
            jLabel3.setText(message.getSentDate().toString().replace(" EEST", "").trim()); 
            messageContent= getText(message);
            jEditorPane1.setText(messageContent);
            boolean hasAttachmentBool = hasAttachments(message);
            if (hasAttachmentBool){
                jList1.setModel(listModel);
                jButton8.setVisible(true);
                jScrollPane2.setVisible(true);
            }
            flags = message.getFlags();
            isStarred = flags.contains(Flags.Flag.FLAGGED);
            isRead =flags.contains(Flags.Flag.SEEN);
            if (isStarred){
                jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/yellow star.png")));
                jButton3.setToolTipText("Remove from Favorites");
            }else{
                jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/star (correct)_1.png"))); 
                jButton3.setToolTipText("Add to Favorites");
            }
            if (isRead){
                jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/openEnvelope.png"))); 
                jButton5.setToolTipText("Mark as Unread");
            }else{
                jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/read resized.png")));
                jButton5.setToolTipText("Mark as Read");
            }
        }catch (MessagingException | IOException e) {
                e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jButton1.setBackground(new java.awt.Color(64, 56, 98));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/reply.png"))); // NOI18N
        jButton1.setText("Reply");
        jButton1.setFocusPainted(false);
        jButton1.setMaximumSize(new java.awt.Dimension(150, 35));
        jButton1.setMinimumSize(new java.awt.Dimension(150, 35));
        jButton1.setPreferredSize(new java.awt.Dimension(150, 35));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(64, 56, 98));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/forward.png"))); // NOI18N
        jButton2.setText("Forward");
        jButton2.setFocusPainted(false);
        jButton2.setMaximumSize(new java.awt.Dimension(150, 35));
        jButton2.setMinimumSize(new java.awt.Dimension(150, 35));
        jButton2.setPreferredSize(new java.awt.Dimension(150, 35));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(242, 242, 242));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/star (correct)_1.png"))); // NOI18N
        jButton3.setToolTipText("Add to Favorites");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(242, 242, 242));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/important.png"))); // NOI18N
        jButton4.setToolTipText("Important");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(242, 242, 242));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/openEnvelope.png"))); // NOI18N
        jButton5.setToolTipText("Mark as Unread");
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(242, 242, 242));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bin resized.png"))); // NOI18N
        jButton6.setToolTipText("Delete");
        jButton6.setBorder(null);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(242, 242, 242));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/download resized.png"))); // NOI18N
        jButton7.setToolTipText("Download");
        jButton7.setBorder(null);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("date/time");

        jButton8.setBackground(new java.awt.Color(64, 56, 98));
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Download Attachments");
        jButton8.setFocusPainted(false);
        jButton8.setMaximumSize(new java.awt.Dimension(164, 35));
        jButton8.setMinimumSize(new java.awt.Dimension(164, 35));
        jButton8.setPreferredSize(new java.awt.Dimension(164, 35));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("senderName");

        jEditorPane1.setEditable(false);
        jEditorPane1.setContentType("text/html"); // NOI18N
        jEditorPane1.addHyperlinkListener(new javax.swing.event.HyperlinkListener() {
            public void hyperlinkUpdate(javax.swing.event.HyperlinkEvent evt) {
                jEditorPane1HyperlinkUpdate(evt);
            }
        });
        jScrollPane1.setViewportView(jEditorPane1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setText("Subject");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setLayoutOrientation(javax.swing.JList.HORIZONTAL_WRAP);
        jList1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jList1.setVisibleRowCount(1);
        jScrollPane2.setViewportView(jList1);

        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("To:");
        jLabel2.setMaximumSize(new java.awt.Dimension(315, 16));
        jLabel2.setMinimumSize(new java.awt.Dimension(315, 16));
        jLabel2.setPreferredSize(new java.awt.Dimension(315, 16));

        jComboBox1.setBackground(new java.awt.Color(242, 242, 242));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "To:", "Cc:", "Bcc:" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean hasAttachments(Message msg) throws MessagingException, IOException {
	if (msg.isMimeType("multipart/mixed")) {
	    Multipart mp = (Multipart)msg.getContent();
            for (int i = 0; i < mp.getCount(); i++) {
                MimeBodyPart bodyPart = (MimeBodyPart) mp.getBodyPart(i);
                if (bodyPart.getDisposition() != null && bodyPart.getDisposition().equalsIgnoreCase(Part.ATTACHMENT)) {
                    String fileName = bodyPart.getFileName();
                    listModel.addElement(fileName);
                }
            }
            if (mp.getCount() > 1)
		return true;
	}
	return false;
    }
     
    private boolean textIsHtml = false;

    /**
     * Return the primary text content of the message.
     */
    private String getText(Part p) throws
                MessagingException, IOException {
        if (p.isMimeType("text/*")) {
            String s = (String)p.getContent();
            textIsHtml = p.isMimeType("text/html");
            return s;
        }

        if (p.isMimeType("multipart/alternative")) {
            // prefer html text over plain text
            Multipart mp = (Multipart)p.getContent();
            String text = null;
            for (int i = 0; i < mp.getCount(); i++) {
                Part bp = mp.getBodyPart(i);
                if (bp.isMimeType("text/plain")) {
                    if (text == null)
                        text = getText(bp);
                } else if (bp.isMimeType("text/html")) {
                    String s = getText(bp);
                    if (s != null)
                        return s;
                } else {
                    return getText(bp);
                }
            }
            return text;
        } else if (p.isMimeType("multipart/*")) {
            Multipart mp = (Multipart)p.getContent();
            for (int i = 0; i < mp.getCount(); i++) {
                String s = getText(mp.getBodyPart(i));
                if (s != null)
                    return s;
            }
        }
        return null;
    }
    
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
            flags = message.getFlags();
            isStarred = flags.contains(Flags.Flag.FLAGGED);
            if (!isStarred) {
                flags.add(Flags.Flag.FLAGGED); 
                message.setFlags(flags, true);
                jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/yellow star.png")));
                jButton3.setToolTipText("Remove from Favorites");
                Flags updatedFlags = message.getFlags();
                System.out.println(updatedFlags);
                System.out.println("ine starred");
            }else {
                flags.remove(Flags.Flag.FLAGGED); 
                message.setFlags(flags, true);
                jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/star (correct)_1.png"))); 
                jButton3.setToolTipText("Add to Favorites");
                Flags updatedFlags = message.getFlags();
                System.out.println(updatedFlags);
                System.out.println("den ine starred");
            }   
        }catch (MessagingException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        isClicked2 = !isClicked2;
        if (isClicked2) {
            jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/important filled.png"))); 
            jButton4.setToolTipText("Not Important");
        } else {
            jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/important.png"))); 
            jButton4.setToolTipText("Important");
        } 
    }//GEN-LAST:event_jButton4ActionPerformed
    
    

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try{
            flags = message.getFlags();
            isRead = flags.contains(Flags.Flag.SEEN);
            if (!isRead) {
                flags.add(Flags.Flag.SEEN); 
                message.setFlags(flags, true);
                jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/openEnvelope.png"))); 
                jButton5.setToolTipText("Mark as Unread");
                Flags updatedFlags = message.getFlags();
                System.out.println(updatedFlags);
            }else {
                flags.remove(Flags.Flag.SEEN); 
                message.setFlags(flags, true);
                jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/read resized.png")));
                jButton5.setToolTipText("Mark as Read");
                Flags updatedFlags = message.getFlags();
                System.out.println(updatedFlags);
            }   
        }catch (MessagingException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        JFileChooser Folder = new JFileChooser();
            Folder.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            Integer opt = Folder.showSaveDialog(this);     
            if (opt == JFileChooser.APPROVE_OPTION){
                selectedDirectory = Folder.getSelectedFile();
                try{
                    Multipart mp = (Multipart)message.getContent();
                    for (int i = 0; i < mp.getCount(); i++) {
                        MimeBodyPart bodyPart = (MimeBodyPart) mp.getBodyPart(i);
                        if (bodyPart.getDisposition() != null && bodyPart.getDisposition().equalsIgnoreCase(Part.ATTACHMENT)) {
                            String fileName = bodyPart.getFileName();
                            if (selectedDirectory!= null){
                                bodyPart.saveFile(new File (selectedDirectory + "\\"+ fileName));
                            }
                        }
                    }
                    JOptionPane.showMessageDialog(
                        null,
                        "Attachment(s) have been downloaded successfully!",
                        "Success",
                        JOptionPane.INFORMATION_MESSAGE
                    );    
                }catch (MessagingException | IOException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(
                    null,
                    "An error occurred while downloading attachment(s).",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                    );
                }   
            }  
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jEditorPane1HyperlinkUpdate(javax.swing.event.HyperlinkEvent evt) {//GEN-FIRST:event_jEditorPane1HyperlinkUpdate
        // TODO add your handling code here:
        if(evt.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
           if(Desktop.isDesktopSupported()) {
               try {
                   Desktop.getDesktop().browse(evt.getURL().toURI());
               } catch (URISyntaxException | IOException e) {
                   e.printStackTrace();
               }
           }
        }
    }//GEN-LAST:event_jEditorPane1HyperlinkUpdate

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        SendMail.isReply = true;
        try{
            messagerefwd= message;
            replyTo = (senderAddressViewMail.replaceAll(".*<(.*?)(?=>)>.*", "$1"));
            replySubject = ("Re: " + message.getSubject());
            replyText =("\n\n-------- Original message --------\n"+ messageContent.replaceAll("(?m)^", "> "));
            SendMail sendmail = new SendMail();
            sendmail.setVisible(true);
        }catch (MessagingException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        SendMail.isForwarded = true;
        try{
            messagerefwd= message;
            forwardedSubject = ("Fwd: " + message.getSubject());
            forwardedText = String.format(
            "\n\n---------- Forwarded message ----------\n" +
            "Subject: %s\nDate: %s\nFrom: %s\nTo: %s\n",
            message.getSubject(),
            message.getSentDate(),
            message.getFrom()[0],
            formatAddressList(
            message.getRecipients(Message.RecipientType.TO))+"\n\n\n" +messageContent);
            SendMail sendmail = new SendMail();
            sendmail.setVisible(true);
        }catch (MessagingException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    
    private void Recipients(){
        String selectedItem = jComboBox1.getSelectedItem().toString();
    
        if ("To:".equals(selectedItem)) {
            try {
                jLabel2.setToolTipText(null);
                Address[] toRecipients = message.getRecipients(Message.RecipientType.TO);
                if (toRecipients != null) {
                    StringBuilder toText = new StringBuilder("To: ");
                    for (int i = 0; i < toRecipients.length; i++) {
                        Address recipient = toRecipients[i];
                        toText.append(recipient.toString());
                        if (i < toRecipients.length - 1) {
                            toText.append(", ");
                        }
                    }
                    jLabel2.setText(toText.toString());
                    if (jLabel2.getText().length() > 45) {
                        jLabel2.setToolTipText(toText.toString()); 
                    } else {
                        jLabel2.setToolTipText(null); 
                    }
                } else {
                    jLabel2.setText("To:");
                }
            } catch (MessagingException e) {
                e.printStackTrace();
            }
        } else if ("Cc:".equals(selectedItem)) {
            try {
                jLabel2.setToolTipText(null);
                Address[] ccRecipients = message.getRecipients(Message.RecipientType.CC);
                if (ccRecipients != null) {
                    StringBuilder ccText = new StringBuilder("Cc: ");
                    for (int i = 0; i < ccRecipients.length; i++) {
                        Address recipient = ccRecipients[i];
                        ccText.append(recipient.toString());
                        if (i < ccRecipients.length - 1) {
                            ccText.append(", ");
                        }
}
                    jLabel2.setText(ccText.toString());
                    if (jLabel2.getText().length() > 45) {
                        jLabel2.setToolTipText(ccText.toString()); 
                    } else {
                        jLabel2.setToolTipText(null); 
                    }
                } else {
                    jLabel2.setText("Cc:");
                }
            } catch (MessagingException e) {
                e.printStackTrace();
            }
        } else if ("Bcc:".equals(selectedItem)) {
            try {
                jLabel2.setToolTipText(null);
                Address[] bccRecipients = message.getRecipients(Message.RecipientType.BCC);
                if (bccRecipients != null) {
                    StringBuilder bccText = new StringBuilder("Bcc: ");
                    for (int i = 0; i < bccRecipients.length; i++) {
                        Address recipient = bccRecipients[i];
                        bccText.append(recipient.toString());
                        if (i < bccRecipients.length - 1) {
                            bccText.append(", ");
                        }
                    }
                    jLabel2.setText(bccText.toString());
                    if (jLabel2.getText().length() > 45) {
                        jLabel2.setToolTipText(bccText.toString()); 
                    } else {
                        jLabel2.setToolTipText(null); 
                    }
                } else {
                    jLabel2.setText("Bcc:");
                }
            } catch (MessagingException e) {
                e.printStackTrace();
            }
        }
    }
    
    
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        Recipients();
    }//GEN-LAST:event_jComboBox1ActionPerformed
    
    private static String formatAddressList(Address[] addresses) {
        if (addresses == null || addresses.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Address address : addresses) {
            sb.append(address.toString()).append(", ");
        }
        return sb.substring(0, sb.length() - 2); 
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
            java.util.logging.Logger.getLogger(ViewMail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewMail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewMail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewMail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMail().setVisible(true);
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
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
