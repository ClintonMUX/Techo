/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Atecho;


import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import DClaasFile.zzz;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bellh
 */
public class ARegistrtion extends javax.swing.JFrame {
    zzz conecta = new zzz();
    /**
     * Creates new form ARegistrtion
     */
    public ARegistrtion() {
        initComponents();
    }
      PreparedStatement pst;
      PreparedStatement pst1;
      PreparedStatement pst2;
      PreparedStatement pst3;
      PreparedStatement pst4;
      PreparedStatement pst5;
      ResultSet rs;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        fname = new javax.swing.JTextField();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        lname = new javax.swing.JTextField();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        pnume = new javax.swing.JFormattedTextField();
        kGradientPanel4 = new keeptoo.KGradientPanel();
        email = new javax.swing.JTextField();
        txt_pass3 = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        kGradientPanel5 = new keeptoo.KGradientPanel();
        country = new javax.swing.JTextField();
        kGradientPanel6 = new keeptoo.KGradientPanel();
        city = new javax.swing.JTextField();
        kGradientPanel7 = new keeptoo.KGradientPanel();
        state = new javax.swing.JTextField();
        kGradientPanel8 = new keeptoo.KGradientPanel();
        zip = new javax.swing.JTextField();
        saveButton = new keeptoo.KButton();
        jButton1 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        kGradientPanel15 = new keeptoo.KGradientPanel();
        pass = new javax.swing.JPasswordField();
        n = new keeptoo.KGradientPanel();
        cpass = new javax.swing.JPasswordField();
        txt_pass2 = new javax.swing.JPasswordField();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        kGradientPanel9 = new keeptoo.KGradientPanel();
        uname = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txt_pass = new javax.swing.JPasswordField();
        txt_pass1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Filled_Circle_15px_1.png"))); // NOI18N
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setFocusable(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 40, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 60, 48));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("TECHO");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/494641-PHESOO-113.jpg"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 260, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(170, 170, 170));
        jLabel2.setText("Email");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        jLabel3.setForeground(new java.awt.Color(170, 170, 170));
        jLabel3.setText("First Name");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel6.setForeground(new java.awt.Color(170, 170, 170));
        jLabel6.setText("Last Name");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));

        jLabel7.setForeground(new java.awt.Color(170, 170, 170));
        jLabel7.setText("Phone Number");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        kGradientPanel1.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel1.setkFillBackground(false);
        kGradientPanel1.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fname.setBorder(null);
        fname.setOpaque(false);
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        kGradientPanel1.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 160, 20));

        jPanel3.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 180, 20));

        kGradientPanel2.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel2.setkFillBackground(false);
        kGradientPanel2.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lname.setBorder(null);
        lname.setOpaque(false);
        kGradientPanel2.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 160, 20));

        jPanel3.add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 180, 20));

        kGradientPanel3.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel3.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel3.setkFillBackground(false);
        kGradientPanel3.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnume.setBorder(null);
        try {
            pnume.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        pnume.setOpaque(false);
        pnume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnumeActionPerformed(evt);
            }
        });
        kGradientPanel3.add(pnume, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 160, 20));

        jPanel3.add(kGradientPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 180, 20));

        kGradientPanel4.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel4.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel4.setkFillBackground(false);
        kGradientPanel4.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        email.setBorder(null);
        email.setOpaque(false);
        kGradientPanel4.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 160, 20));

        jPanel3.add(kGradientPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 180, 20));

        txt_pass3.setBorder(null);
        txt_pass3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_pass3KeyReleased(evt);
            }
        });
        jPanel3.add(txt_pass3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 280, 20));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 420, 140));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setForeground(new java.awt.Color(170, 170, 170));
        jLabel8.setText("Zip code");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, -1));

        jLabel9.setForeground(new java.awt.Color(170, 170, 170));
        jLabel9.setText("Country");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel10.setForeground(new java.awt.Color(170, 170, 170));
        jLabel10.setText("City");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        jLabel11.setForeground(new java.awt.Color(170, 170, 170));
        jLabel11.setText("State");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        kGradientPanel5.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel5.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel5.setkFillBackground(false);
        kGradientPanel5.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        country.setBorder(null);
        country.setOpaque(false);
        kGradientPanel5.add(country, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 160, 20));

        jPanel4.add(kGradientPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 180, 20));

        kGradientPanel6.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel6.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel6.setkFillBackground(false);
        kGradientPanel6.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        city.setBorder(null);
        city.setOpaque(false);
        kGradientPanel6.add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 160, 20));

        jPanel4.add(kGradientPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 180, 20));

        kGradientPanel7.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel7.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel7.setkFillBackground(false);
        kGradientPanel7.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        state.setBorder(null);
        state.setOpaque(false);
        kGradientPanel7.add(state, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 160, 20));

        jPanel4.add(kGradientPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 180, 20));

        kGradientPanel8.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel8.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel8.setkFillBackground(false);
        kGradientPanel8.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        zip.setBorder(null);
        zip.setOpaque(false);
        kGradientPanel8.add(zip, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 160, 20));

        jPanel4.add(kGradientPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 180, 20));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 410, 120));

        saveButton.setText("Register");
        saveButton.setkAllowTab(false);
        saveButton.setkEndColor(new java.awt.Color(118, 195, 118));
        saveButton.setkHoverEndColor(new java.awt.Color(22, 92, 22));
        saveButton.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        saveButton.setkHoverStartColor(new java.awt.Color(80, 142, 80));
        saveButton.setkPressedColor(new java.awt.Color(28, 72, 28));
        saveButton.setkStartColor(new java.awt.Color(87, 167, 87));
        saveButton.setOpaque(false);
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        jPanel2.add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 130, 30));
        saveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(150, 150, 150));
        jButton1.setText("Login");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(162, 162, 162)));
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 140, 30));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setOpaque(false);
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setForeground(new java.awt.Color(170, 170, 170));
        jLabel24.setText("Confirm Password");
        jPanel8.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        kGradientPanel15.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel15.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel15.setkFillBackground(false);
        kGradientPanel15.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pass.setBorder(null);
        pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passKeyReleased(evt);
            }
        });
        kGradientPanel15.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 6, 160, 10));

        jPanel8.add(kGradientPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 180, 20));

        n.setBackground(new java.awt.Color(255, 255, 255));
        n.setkEndColor(new java.awt.Color(57, 114, 227));
        n.setkFillBackground(false);
        n.setkStartColor(new java.awt.Color(122, 227, 192));
        n.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cpass.setBorder(null);
        cpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cpassKeyReleased(evt);
            }
        });
        n.add(cpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 6, 160, 10));

        jPanel8.add(n, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 180, 20));

        txt_pass2.setBorder(null);
        txt_pass2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_pass2KeyReleased(evt);
            }
        });
        jPanel8.add(txt_pass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 280, 20));

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 230, 100));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setOpaque(false);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setForeground(new java.awt.Color(170, 170, 170));
        jLabel15.setText("Username");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        kGradientPanel9.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel9.setkEndColor(new java.awt.Color(57, 114, 227));
        kGradientPanel9.setkFillBackground(false);
        kGradientPanel9.setkStartColor(new java.awt.Color(122, 227, 192));
        kGradientPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        uname.setBorder(null);
        uname.setOpaque(false);
        uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameActionPerformed(evt);
            }
        });
        kGradientPanel9.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 160, 20));

        jPanel5.add(kGradientPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 180, 20));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 230, 100));

        jLabel23.setForeground(new java.awt.Color(170, 170, 170));
        jLabel23.setText("Password");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, -1, -1));

        txt_pass.setBorder(null);
        txt_pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_passKeyReleased(evt);
            }
        });
        jPanel2.add(txt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 160, 20));

        txt_pass1.setBorder(null);
        txt_pass1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_pass1KeyReleased(evt);
            }
        });
        jPanel2.add(txt_pass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 280, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        
        if(uname.getText().length()== 0)
        {
            JOptionPane.showMessageDialog(this, "Please type the User Name");
        }
        else if(fname.getText().length()== 0)
        {
            JOptionPane.showMessageDialog(this, "Please type the Password");
        }
        else if(pass.getText().equals(cpass.getText())== false)
        {
            JOptionPane.showMessageDialog(this, "Password not mached");
        }
        else
        {
             String name1 = fname.getText();
             String name2 = lname.getText();
             String num = pnume.getText();
             String em = email.getText();
             String cotry = country.getText();
             String sta = state.getText();
             String ct = city.getText();
             String una = uname.getText();
             String pas = pass.getText();
             int z = Integer.parseInt(zip.getText());
            
            
            int pkc = 0;
            int pku = 0;
            String tna = "null";
            String st = "null";
            conecta.conexao();
            try{
                System.out.println("000!");
                pst = conecta.conn.prepareStatement("insert into main.location(countryname, city, stat, zip_code)values(?, ?,?, ?)");
                pst.setString(1, cotry);
                pst.setString(2, sta);
                pst.setString(3, ct);
                pst.setInt(4, z);
                System.out.println("001!");
                pst.executeUpdate();
                System.out.println("002!");
                conecta.executaSQL("SELECT MAX(loc_id) FROM main.location");
                System.out.println("003!");
                // Retrieve the maximum primary key value
                if (conecta.rs.next()) {
                 pkc = conecta.rs.getInt(1);
                //System.out.println("Last Row Primary Key: " + lastPrimaryKey);
                    System.out.println(pkc);
                }
                  System.out.println(pkc);
                //_______________________________________________________________________________________________

                int date_id =(int)Math.floor(Math.random()*(20-1+1)+ 1);
                int med_id = (int)Math.floor(Math.random()*(20-1+1)+ 1);
                pst1 = conecta.conn.prepareStatement("insert into main.user(username, password, email, date_id, loc_id, med_id)values(?, ?,?, ?,?, ?)");
                pst1.setString(1, una);
                pst1.setString(2, pas);
                pst1.setString(3, em);
                pst1.setInt(4, date_id);
                pst1.setInt(5, pkc);
                pst1.setInt(6, med_id);
                pst1.executeUpdate();
                
                conecta.executaSQL("SELECT MAX(user_id) FROM main.user");
                // Retrieve the maximum primary key value
                if (conecta.rs.next()) {
                   pku = conecta.rs.getInt(1);
                   //System.out.println("Last Row Primary Key: " + lastPrimaryKey);
                   System.out.println(pku);
                }
                  System.out.println(pku);
            //_______________________________________________________________________________________________________
            
                 pst4 = conecta.conn.prepareStatement("select *from main.media where med_id = ?");
                 pst4.setInt(1, med_id);
                 ResultSet rs1 = pst4.executeQuery();
                 if (rs1.next()){tna =rs1.getString("medname");};
                pst2 = conecta.conn.prepareStatement("insert into main.user_med(med_id, user_id, med_name)values(?, ?,?)");
                pst2.setInt(1, med_id);
                pst2.setInt(2, pku);
                pst2.setString(3, tna);
                pst2.executeUpdate();
                System.out.println("FACE2!");

                 
                pst3 = conecta.conn.prepareStatement("insert into main.user_loc(loc_id, user_id, sate)values(?, ?, ?)");
                pst3.setInt(1, pkc);
                pst3.setInt(2, pku);
                pst3.setString(3, sta);
                pst3.executeUpdate();
                
                
                
                System.out.println("DONE!");
            } catch (SQLException ex) {
                Logger.getLogger(ARegistrtion.class.getName()).log(Level.SEVERE, null, ex);
            }
            conecta.desconecta();
              
        }




    }//GEN-LAST:event_saveButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_passKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passKeyReleased
        //if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            //login();
            //}
    }//GEN-LAST:event_txt_passKeyReleased

    private void txt_pass1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pass1KeyReleased
        //if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            //login();
            //}
    }//GEN-LAST:event_txt_pass1KeyReleased

    private void txt_pass2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pass2KeyReleased
        //if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            //login();
            //}
    }//GEN-LAST:event_txt_pass2KeyReleased

    private void txt_pass3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pass3KeyReleased
        //if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            //login();
            //}
    }//GEN-LAST:event_txt_pass3KeyReleased

    private void passKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_passKeyReleased

    private void cpassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpassKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cpassKeyReleased

    private void pnumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnumeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnumeActionPerformed

    private void unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameActionPerformed

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
            java.util.logging.Logger.getLogger(ARegistrtion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ARegistrtion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ARegistrtion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ARegistrtion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ARegistrtion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField city;
    private javax.swing.JTextField country;
    private javax.swing.JPasswordField cpass;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel15;
    private keeptoo.KGradientPanel kGradientPanel2;
    private keeptoo.KGradientPanel kGradientPanel3;
    private keeptoo.KGradientPanel kGradientPanel4;
    private keeptoo.KGradientPanel kGradientPanel5;
    private keeptoo.KGradientPanel kGradientPanel6;
    private keeptoo.KGradientPanel kGradientPanel7;
    private keeptoo.KGradientPanel kGradientPanel8;
    private keeptoo.KGradientPanel kGradientPanel9;
    private javax.swing.JTextField lname;
    private keeptoo.KGradientPanel n;
    private javax.swing.JPasswordField pass;
    private javax.swing.JFormattedTextField pnume;
    private keeptoo.KButton saveButton;
    private javax.swing.JTextField state;
    private javax.swing.JPasswordField txt_pass;
    private javax.swing.JPasswordField txt_pass1;
    private javax.swing.JPasswordField txt_pass2;
    private javax.swing.JPasswordField txt_pass3;
    private javax.swing.JTextField uname;
    private javax.swing.JTextField zip;
    // End of variables declaration//GEN-END:variables
}
