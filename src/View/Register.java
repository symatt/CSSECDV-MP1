
package View;

import java.awt.Color;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;
import java.util.*;

public class Register extends javax.swing.JPanel {

    public Frame frame;
    
    public Register() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registerBtn = new javax.swing.JButton();
        passwordFld = new javax.swing.JPasswordField();
        usernameFld = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        confpassFld = new javax.swing.JPasswordField();
        backBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        securityQ1 = new javax.swing.JComboBox<>();
        securityQ2 = new javax.swing.JComboBox<>();
        securityA1 = new javax.swing.JTextField();
        securityA2 = new javax.swing.JTextField();
        passStrength = new javax.swing.JProgressBar();
        passToolTip = new javax.swing.JTextArea();
        passToolTip.setVisible(false);
        passStrengthLabel = new javax.swing.JTextField();

        setAutoscrolls(true);

        registerBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        registerBtn.setText("REGISTER");
        registerBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        passwordFld.setBackground(new java.awt.Color(240, 240, 240));
        passwordFld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passwordFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "PASSWORD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        passwordFld.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFldFocusLost(evt);
            }
        });
        passwordFld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordFldKeyReleased(evt);
            }
        });

        usernameFld.setBackground(new java.awt.Color(240, 240, 240));
        usernameFld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        usernameFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "USERNAME", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        usernameFld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usernameFldKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SECURITY Svcs");
        jLabel1.setToolTipText("");

        confpassFld.setBackground(new java.awt.Color(240, 240, 240));
        confpassFld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        confpassFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        confpassFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "CONFIRM PASSWORD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        backBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backBtn.setText("<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Choose 2 different questions that only you can answer.");

        securityQ1.setBackground(new java.awt.Color(240, 240, 240));
        securityQ1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Security Question 1" }));
        securityQ1.setToolTipText("Security Question 1");
        securityQ1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        securityQ2.setBackground(new java.awt.Color(240, 240, 240));
        securityQ2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Security Question 2" }));
        securityQ2.setToolTipText("Security Question 2");
        securityQ2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        securityA1.setBackground(new java.awt.Color(240, 240, 240));
        securityA1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        securityA1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        securityA1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "ANSWER 1", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        securityA2.setBackground(new java.awt.Color(240, 240, 240));
        securityA2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        securityA2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        securityA2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "ANSWER 2", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        passStrength.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        passToolTip.setEditable(false);
        passToolTip.setColumns(20);
        passToolTip.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passToolTip.setLineWrap(true);
        passToolTip.setRows(10);
        passToolTip.setText("-Password should be 8-32 characters long.\n-Password should include atleast 1 uppercase and 1 lowercase letter.\n-Password should include 1 number and 1 symbol.");
        passToolTip.setToolTipText("");
        passToolTip.setWrapStyleWord(true);

        passStrengthLabel.setEditable(false);
        passStrengthLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        passStrengthLabel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passStrengthLabel.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(322, 322, 322)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(confpassFld, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(securityA2)
                            .addComponent(securityA1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(securityQ1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usernameFld, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(securityQ2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passwordFld)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(passStrength, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(passStrengthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(passToolTip, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(usernameFld, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(passwordFld, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passStrengthLabel)
                            .addComponent(passStrength, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(confpassFld, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(passToolTip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(securityQ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(securityA1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(securityQ2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(securityA2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        boolean registerable = true;
        
        // if passwords match
        if (!passwordFld.getText().equals(confpassFld.getText())) {
            registerable = false;
            JOptionPane.showMessageDialog(null, "Error: Passwords do not match.", "Error: Registration", JOptionPane.OK_OPTION);
        }
        
        // if security questions are index 0
        else if (securityQ1.getSelectedIndex() == 0 || securityQ2.getSelectedIndex() == 0) {
            registerable = false;
            JOptionPane.showMessageDialog(null, "Error: Please select valid security questions.", "Error: Registration", JOptionPane.OK_OPTION);
        }

        // if security questions are different
        else if (securityQ1.getSelectedIndex() == securityQ2.getSelectedIndex()) {
            registerable = false;
            JOptionPane.showMessageDialog(null, "Error: Please select two different security questions.", "Error: Registration", JOptionPane.OK_OPTION);
        }
        
        // if security questions were answered
        else if (securityA1.getText().length() == 0 || securityA2.getText().length() == 0) {
            registerable = false;
            JOptionPane.showMessageDialog(null, "Error: Please answer the security questions.", "Error: Registration", JOptionPane.OK_OPTION);
        }
        
        // if fields are not empty
        else if (passwordFld.getText().length() == 0 || confpassFld.getText().length() == 0 || usernameFld.getText().length() == 0) {
            registerable = false;
            JOptionPane.showMessageDialog(null, "Error: Please do not leave the fields blank.", "Error: Registration", JOptionPane.OK_OPTION);
        }
        
        // if password is strong enough
        switch(frame.main.checkPassStrength(passwordFld.getText())) {
            case "Strong":
                break;
            default:
                registerable = false;
                JOptionPane.showMessageDialog(null, "Error: Password is too weak.", "Error: Registration", JOptionPane.OK_OPTION);
                break;
        }
        
            
        if(registerable) {
            
            frame.main.sqlite.addUser(usernameFld.getText(), passwordFld.getText(), securityQ1.getSelectedIndex(), securityA1.getText(), securityQ2.getSelectedIndex(), securityA2.getText());
            frame.main.sqlite.addLogs("REGISTER", usernameFld.getText(), "User successfully registered.");
            JOptionPane.showMessageDialog(null, "Registration Successful", "Success: Registration", JOptionPane.OK_OPTION);
            usernameFld.setText("");
            passwordFld.setText("");
            confpassFld.setText("");
            passStrength.setValue(0);
            passStrengthLabel.setText("");
            securityQ1.setSelectedIndex(0);
            securityA1.setText("");
            securityQ2.setSelectedIndex(0);
            securityA2.setText("");
            
            frame.loginNav();
        }
    }//GEN-LAST:event_registerBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        usernameFld.setText("");
        passwordFld.setText("");
        confpassFld.setText("");
        passStrength.setValue(0);
        passStrengthLabel.setText("");
        securityQ1.setSelectedIndex(0);
        securityA1.setText("");
        securityQ2.setSelectedIndex(0);
        securityA2.setText("");
        frame.loginNav();
    }//GEN-LAST:event_backBtnActionPerformed

    private void usernameFldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameFldKeyReleased
        if(frame.main.sqlite.doesUserExist(usernameFld.getText())) {
            JOptionPane.showMessageDialog(null, "Error: Username already exists.", "Error: Registration", JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_usernameFldKeyReleased

    private void passwordFldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFldKeyReleased
        String inputPassword = passwordFld.getText();
        String strength = frame.main.checkPassStrength(inputPassword);
        System.out.println(strength);

        switch(strength) {
            case "Strong":
                passStrength.setValue(100);
                passStrength.setForeground(new Color(17, 107, 20));
                passStrengthLabel.setForeground(new Color(17, 107, 20));
                break;
            case "Good":
                passStrength.setValue(60);
                passStrength.setForeground(Color.blue);
                passStrengthLabel.setForeground(Color.blue);
                break;
            case "Fair":
                passStrength.setValue(30);
                passStrength.setForeground(Color.orange);
                passStrengthLabel.setForeground(Color.orange);
                break;
            case "Weak":
                passStrength.setValue(20);
                passStrength.setForeground(Color.red);
                passStrengthLabel.setForeground(Color.red);
                break;
            default:
                passStrength.setValue(0);
                passStrength.setForeground(Color.red);
                passStrengthLabel.setForeground(Color.gray);
                break;
        }
        
        passStrengthLabel.setText(strength);
        revalidate();
    }//GEN-LAST:event_passwordFldKeyReleased

    private void passwordFldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFldFocusGained
//        System.out.println("password field focused");
        passToolTip.setVisible(true);
        List<String> ques = frame.main.sqlite.getSecQues();
        ques.add(0, "Security Question 1");
        String[] secquesArr = new String[ques.size()];
        String[] q1 = ques.toArray(secquesArr);
        
        List<String> ques2 = frame.main.sqlite.getSecQues();
        ques2.add(0, "Security Question 2");
        String[] secquesArr2 = new String[ques2.size()];
        String[] q2 = ques2.toArray(secquesArr2);
        
        securityQ1.setModel(new javax.swing.DefaultComboBoxModel<>(q1));
        securityQ2.setModel(new javax.swing.DefaultComboBoxModel<>(q2));
        revalidate();
    }//GEN-LAST:event_passwordFldFocusGained

    private void passwordFldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFldFocusLost
//        System.out.println("password field lost");
        passToolTip.setVisible(false);
        revalidate();
    }//GEN-LAST:event_passwordFldFocusLost
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField confpassFld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar passStrength;
    private javax.swing.JTextField passStrengthLabel;
    private javax.swing.JTextArea passToolTip;
    private javax.swing.JTextField passwordFld;
    private javax.swing.JButton registerBtn;
    private javax.swing.JTextField securityA1;
    private javax.swing.JTextField securityA2;
    private javax.swing.JComboBox<String> securityQ1;
    private javax.swing.JComboBox<String> securityQ2;
    private javax.swing.JTextField usernameFld;
    // End of variables declaration//GEN-END:variables
}
