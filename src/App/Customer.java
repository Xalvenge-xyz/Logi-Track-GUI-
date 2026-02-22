
package App;

import config.config;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import net.proteanit.sql.DbUtils;
import session.AuthFrame;
import session.session;


/**
 *
 * @author mc37n
 */
public class Customer extends AuthFrame  {

    int yMouse, xMouse;
    public Customer() {
        if(!authorized) return; 
        initComponents();
        lblUser.setText("Welcome, " + session.getName());
        config con = new config();
        loadTotalorder();
        loadTotadelivered();
        dashboardtable();
        loadUserData();
        totalpending();
        totalintransit();
        ordertbl();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        dashboard = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        userspnl = new javax.swing.JPanel();
        userbtn = new javax.swing.JLabel();
        totalorder = new javax.swing.JLabel();
        deliverpnl = new javax.swing.JPanel();
        deliverbtn = new javax.swing.JLabel();
        totaldelivered = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dashboardtbl = new javax.swing.JTable();
        searchtbl = new javax.swing.JTextField();
        order = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        sendername = new javax.swing.JTextField();
        receivername = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        senderaddress = new javax.swing.JTextField();
        packagedesc = new javax.swing.JTextField();
        receiveraddress = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        weight = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        payment = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        placeorder = new javax.swing.JPanel();
        placeorderbtn = new javax.swing.JLabel();
        deliverytype = new javax.swing.JComboBox<>();
        tracking = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        Pending = new javax.swing.JPanel();
        pending = new javax.swing.JLabel();
        pendingtotal = new javax.swing.JLabel();
        intransit = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        intransittotal = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ordertable = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        reciept = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        settings = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        pfp = new javax.swing.JPanel();
        lblProfilePic = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        contact = new javax.swing.JLabel();
        role = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        update = new javax.swing.JPanel();
        updatebtn = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        pfp1 = new javax.swing.JPanel();
        btnChangePic3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        cancelpnl = new javax.swing.JPanel();
        cancelbt = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        surnametxt = new javax.swing.JTextField();
        emailtxt = new javax.swing.JTextField();
        contacttxt = new javax.swing.JTextField();
        addresstxt = new javax.swing.JTextField();
        cpass = new javax.swing.JPasswordField();
        role1 = new javax.swing.JLabel();
        id1 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        savepnl = new javax.swing.JPanel();
        save = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel10000 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 153, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LogiTrack");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 190, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Dashboard");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 110, 30));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Order");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 110, -1));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Tracking");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 110, -1));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Reciept");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 110, -1));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Settings");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 110, -1));

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Logout");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 110, -1));

        lblUser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 190, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 190, 390));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(810, 31));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(30, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("•");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(780, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        dashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel17.setBackground(new java.awt.Color(153, 0, 0));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userspnl.setBackground(new java.awt.Color(255, 102, 51));
        userspnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userbtn.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        userbtn.setForeground(new java.awt.Color(255, 255, 255));
        userbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userbtn.setText("Orders");
        userbtn.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        userbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userbtnMouseClicked(evt);
            }
        });
        userspnl.add(userbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 20));

        totalorder.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        totalorder.setForeground(new java.awt.Color(255, 255, 255));
        totalorder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userspnl.add(totalorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 23, 230, 20));

        jPanel17.add(userspnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, 50));

        deliverpnl.setBackground(new java.awt.Color(255, 102, 51));
        deliverpnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        deliverbtn.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        deliverbtn.setForeground(new java.awt.Color(255, 255, 255));
        deliverbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deliverbtn.setText("Delivered");
        deliverpnl.add(deliverbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 236, -1));

        totaldelivered.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        totaldelivered.setForeground(new java.awt.Color(255, 255, 255));
        totaldelivered.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deliverpnl.add(totaldelivered, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 22, 236, 20));

        jPanel17.add(deliverpnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, 50));

        dashboardtbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(dashboardtbl);

        jPanel17.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 520, 240));

        searchtbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchtblActionPerformed(evt);
            }
        });
        searchtbl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchtblKeyTyped(evt);
            }
        });
        jPanel17.add(searchtbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 177, 28));

        dashboard.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 630, 390));

        jTabbedPane1.addTab("Dashboard", dashboard);

        order.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(153, 0, 0));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Create Order");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jPanel8.setBackground(new java.awt.Color(255, 102, 51));
        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        sendername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendernameActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Serif", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Sendrs Name");

        jLabel12.setFont(new java.awt.Font("Serif", 1, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Receiver Name");

        jLabel11.setFont(new java.awt.Font("Serif", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Delivery type");

        jLabel19.setFont(new java.awt.Font("Serif", 1, 13)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Sendrs Address");

        senderaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senderaddressActionPerformed(evt);
            }
        });

        packagedesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packagedescActionPerformed(evt);
            }
        });

        receiveraddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receiveraddressActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Serif", 1, 13)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Receiver Address");

        jLabel21.setFont(new java.awt.Font("Serif", 1, 13)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Payment");

        jLabel22.setFont(new java.awt.Font("Serif", 1, 13)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Weight");

        payment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Online Payment", "Cash on Delivery" }));

        jLabel23.setFont(new java.awt.Font("Serif", 1, 13)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Package Description");

        placeorder.setBackground(new java.awt.Color(255, 0, 51));

        placeorderbtn.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        placeorderbtn.setForeground(new java.awt.Color(255, 255, 255));
        placeorderbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        placeorderbtn.setText("Place Order");
        placeorderbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                placeorderbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout placeorderLayout = new javax.swing.GroupLayout(placeorder);
        placeorder.setLayout(placeorderLayout);
        placeorderLayout.setHorizontalGroup(
            placeorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(placeorderbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
        );
        placeorderLayout.setVerticalGroup(
            placeorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(placeorderbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        deliverytype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Standard", "Express" }));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(packagedesc, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel10)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sendername)
                                .addComponent(receivername)
                                .addComponent(weight, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(receiveraddress)
                    .addComponent(senderaddress)
                    .addComponent(payment, 0, 213, Short.MAX_VALUE)
                    .addComponent(deliverytype, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(placeorder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel19))
                .addGap(5, 5, 5)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sendername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senderaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel20))
                .addGap(1, 1, 1)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(receivername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(receiveraddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22))
                .addGap(5, 5, 5)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(payment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel11))
                .addGap(1, 1, 1)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(packagedesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deliverytype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(placeorder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 510, 300));

        order.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 420));

        jTabbedPane1.addTab("Order", order);

        tracking.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(153, 0, 0));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pending.setBackground(new java.awt.Color(255, 102, 51));

        pending.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        pending.setForeground(new java.awt.Color(255, 255, 255));
        pending.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pending.setText("Pending");

        pendingtotal.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        pendingtotal.setForeground(new java.awt.Color(255, 255, 255));
        pendingtotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout PendingLayout = new javax.swing.GroupLayout(Pending);
        Pending.setLayout(PendingLayout);
        PendingLayout.setHorizontalGroup(
            PendingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pending, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
            .addComponent(pendingtotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PendingLayout.setVerticalGroup(
            PendingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PendingLayout.createSequentialGroup()
                .addComponent(pending)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pendingtotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.add(Pending, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 160, 50));

        intransit.setBackground(new java.awt.Color(255, 102, 51));

        jLabel25.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Intransit");

        intransittotal.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        intransittotal.setForeground(new java.awt.Color(255, 255, 255));
        intransittotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout intransitLayout = new javax.swing.GroupLayout(intransit);
        intransit.setLayout(intransitLayout);
        intransitLayout.setHorizontalGroup(
            intransitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
            .addComponent(intransittotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        intransitLayout.setVerticalGroup(
            intransitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(intransitLayout.createSequentialGroup()
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(intransittotal, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel11.add(intransit, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, 50));

        ordertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(ordertable);

        jPanel11.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 570, 240));
        jPanel11.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 220, -1));

        tracking.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 380));

        jTabbedPane1.addTab("Tracking", tracking);

        reciept.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Reciept is Under maintenance");
        jPanel20.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 420));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pngtree-3d-rendered-illustrations-of-warehousing-transportation-and-delivery-logistics-picture-image_5810054 (2).jpg"))); // NOI18N
        jPanel20.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 650, 430));

        reciept.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 410));

        jTabbedPane1.addTab("Reciept", reciept);

        settings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(153, 0, 0));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pfp.setBackground(new java.awt.Color(255, 51, 51));

        lblProfilePic.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout pfpLayout = new javax.swing.GroupLayout(pfp);
        pfp.setLayout(pfpLayout);
        pfpLayout.setHorizontalGroup(
            pfpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pfpLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblProfilePic, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pfpLayout.setVerticalGroup(
            pfpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pfpLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblProfilePic, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel9.add(pfp, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        jLabel13.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Profile");
        jPanel9.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 80, -1));

        id.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));
        jPanel9.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 140, 30));

        name.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jPanel9.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 200, 20));

        email.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jPanel9.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 220, 20));

        contact.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jPanel9.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 220, 20));

        role.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jPanel9.add(role, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 220, 20));

        jLabel28.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel28.setText("LOGITRACK");
        jPanel9.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        address.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jPanel9.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 220, 20));

        jLabel30.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel30.setText("Name:");
        jPanel9.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 50, -1));

        jLabel31.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel31.setText("Email:");
        jPanel9.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 50, -1));

        jLabel32.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel32.setText("Contact:");
        jPanel9.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 80, -1));

        jLabel33.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel33.setText("Address:");
        jPanel9.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 70, -1));

        jLabel34.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel34.setText("Role:");
        jPanel9.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 70, -1));

        jLabel17.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("ID:");
        jPanel9.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 299, 50, 30));

        updatebtn.setFont(new java.awt.Font("Serif", 1, 13)); // NOI18N
        updatebtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updatebtn.setText("Update");
        updatebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updatebtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout updateLayout = new javax.swing.GroupLayout(update);
        update.setLayout(updateLayout);
        updateLayout.setHorizontalGroup(
            updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        updateLayout.setVerticalGroup(
            updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel9.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 100, -1));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/612a6c87df7ddf72492ef367b1aca87d.jpg"))); // NOI18N
        jPanel9.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 530, 260));

        settings.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 420));

        jTabbedPane1.addTab("Settings", settings);

        jPanel10.setBackground(new java.awt.Color(153, 0, 0));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pfp1.setBackground(new java.awt.Color(255, 51, 51));

        btnChangePic3.setFont(new java.awt.Font("Serif", 1, 13)); // NOI18N
        btnChangePic3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnChangePic3.setText("Change");
        btnChangePic3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangePic3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pfp1Layout = new javax.swing.GroupLayout(pfp1);
        pfp1.setLayout(pfp1Layout);
        pfp1Layout.setHorizontalGroup(
            pfp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pfp1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnChangePic3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pfp1Layout.setVerticalGroup(
            pfp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnChangePic3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jPanel10.add(pfp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        jLabel14.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Profile");
        jPanel10.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 80, -1));

        jLabel29.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel29.setText("LOGITRACK");
        jPanel10.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        jLabel35.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel35.setText("Name:");
        jPanel10.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 50, -1));

        jLabel36.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel36.setText("Email:");
        jPanel10.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 50, -1));

        jLabel37.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel37.setText("Contact:");
        jPanel10.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 80, -1));

        jLabel38.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel38.setText("Confirm Password");
        jPanel10.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 130, -1));

        jLabel39.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel39.setText("Surname:");
        jPanel10.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 70, -1));

        jLabel41.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel41.setText("Address:");
        jPanel10.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 70, -1));

        jLabel42.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel42.setText("Password");
        jPanel10.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 70, -1));

        cancelbt.setFont(new java.awt.Font("Serif", 1, 13)); // NOI18N
        cancelbt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancelbt.setText("Back");
        cancelbt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelbtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout cancelpnlLayout = new javax.swing.GroupLayout(cancelpnl);
        cancelpnl.setLayout(cancelpnlLayout);
        cancelpnlLayout.setHorizontalGroup(
            cancelpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cancelpnlLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cancelbt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        cancelpnlLayout.setVerticalGroup(
            cancelpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cancelpnlLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cancelbt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel10.add(cancelpnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 50, 20));
        jPanel10.add(nametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 120, -1));
        jPanel10.add(surnametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 120, -1));
        jPanel10.add(emailtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 120, -1));
        jPanel10.add(contacttxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 120, -1));

        addresstxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addresstxtActionPerformed(evt);
            }
        });
        jPanel10.add(addresstxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 120, -1));

        cpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpassActionPerformed(evt);
            }
        });
        jPanel10.add(cpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 120, -1));

        role1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jPanel10.add(role1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 120, 20));

        id1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        id1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel10.add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 60, 30));
        jPanel10.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 120, -1));

        save.setFont(new java.awt.Font("Serif", 1, 13)); // NOI18N
        save.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        save.setText("Save");
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout savepnlLayout = new javax.swing.GroupLayout(savepnl);
        savepnl.setLayout(savepnlLayout);
        savepnlLayout.setHorizontalGroup(
            savepnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, savepnlLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        savepnlLayout.setVerticalGroup(
            savepnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, savepnlLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel10.add(savepnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 50, 20));

        jLabel43.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel43.setText("Address:");
        jPanel10.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 70, -1));

        jLabel18.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("ID:");
        jPanel10.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 299, 30, 30));

        jLabel10000.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/612a6c87df7ddf72492ef367b1aca87d.jpg"))); // NOI18N
        jPanel10.add(jLabel10000, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 530, 260));

        jTabbedPane1.addTab("update", jPanel10);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 630, 420));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked

           int confirm = JOptionPane.showConfirmDialog(
            this,
            "Are you sure you want to logout?",
            "Logout",
            JOptionPane.YES_NO_OPTION
            );

    if (confirm == JOptionPane.YES_OPTION) {

        session.clear();

         MainUI UI = new MainUI();
        this.dispose();
        UI.setVisible(true);
    }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        //waniy labot
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse,y - yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jPanel3.setBackground(Color. red);
        jLabel1.setForeground(Color.white);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        jPanel3.setBackground(Color. white);
        jLabel1.setForeground(Color.red);
    }//GEN-LAST:event_jLabel1MouseExited

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        jPanel5.setBackground(new Color(159, 159, 166));
        jLabel3.setForeground(Color.white);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        jPanel5.setBackground(Color.white);
        jLabel3.setForeground(Color.black);
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        jPanel6.setBackground(new Color(159, 159, 166));
        jLabel4.setForeground(Color.white);
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        jPanel6.setBackground(Color.white);
        jLabel4.setForeground(Color.black);
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        jPanel13.setBackground(new Color(159, 159, 166));
        jLabel5.setForeground(Color.white);
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        jPanel13.setBackground(Color.white);
        jLabel5.setForeground(Color.black);
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        jPanel14.setBackground(new Color(159, 159, 166));
        jLabel6.setForeground(Color.white);
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        jPanel14.setBackground(Color.white);
        jLabel6.setForeground(Color.black);
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        jPanel15.setBackground(new Color(159, 159, 166));
        jLabel7.setForeground(Color.white);
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        jPanel15.setBackground(Color.white);
        jLabel7.setForeground(Color.black);
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        jPanel16.setBackground(Color.red);
        jLabel8.setForeground(Color.white);
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        jPanel16.setBackground(Color.white);
        jLabel8.setForeground(Color.black);
    }//GEN-LAST:event_jLabel8MouseExited

    private void userbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userbtnMouseClicked

    }//GEN-LAST:event_userbtnMouseClicked

    private void searchtblKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtblKeyTyped
    String search = searchtbl.getText().trim();
    String sql;

    String baseQuery = "SELECT order_id AS id, " +
                       "customer_name AS name, " +
                       "pickup_address AS pickup_address, " +
                       "dropoff_address AS drop_off, " +
                       "status AS status, " +
                       "order_date AS date " +
                       "FROM tbl_orders";

    if (search.isEmpty()) {
        sql = baseQuery;
    } else {
        sql = baseQuery + " WHERE " +
              "order_id LIKE ? OR " +
              "customer_name LIKE ? OR " +
              "pickup_address LIKE ? OR " +
              "dropoff_address LIKE ? OR " +
              "status LIKE ? OR " +
              "order_date LIKE ?";
    }

    try (Connection con = config.connectDB();
         PreparedStatement pst = con.prepareStatement(sql)) {

        if (!search.isEmpty()) {
            String like = "%" + search + "%";
            for (int i = 1; i <= 6; i++) {
                pst.setString(i, like);
            }
        }

        try (ResultSet rs = pst.executeQuery()) {
            dashboardtbl.setModel(DbUtils.resultSetToTableModel(rs));
            dashboardtbl.setDefaultEditor(Object.class, null);
            pst.close();
            con.close();
        }

    } catch (Exception e) {
        e.printStackTrace();
        System.out.println("Search error: " + e.getMessage());
    }
    }//GEN-LAST:event_searchtblKeyTyped

    private void searchtblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtblActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchtblActionPerformed

    private void sendernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sendernameActionPerformed

    private void senderaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senderaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senderaddressActionPerformed

    private void packagedescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packagedescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_packagedescActionPerformed

    private void receiveraddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receiveraddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_receiveraddressActionPerformed

    private void updatebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatebtnMouseClicked
        jTabbedPane1.setSelectedIndex(5);
    }//GEN-LAST:event_updatebtnMouseClicked

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
        
         String newName = nametxt.getText().trim();
    String newLastname = surnametxt.getText().trim();
    String newEmail = emailtxt.getText().trim();
    String newContact = contacttxt.getText().trim();
    String newAddress = addresstxt.getText().trim();
    String newPass = new String(password.getPassword()).trim();
    String confirmPass = new String(cpass.getPassword()).trim();

    int fieldCount = 0;
    if (!newName.isEmpty()) fieldCount++;
    if (!newLastname.isEmpty()) fieldCount++;
    if (!newEmail.isEmpty()) fieldCount++;
    if (!newContact.isEmpty()) fieldCount++;
    if (!newAddress.isEmpty()) fieldCount++;
    if (!newPass.isEmpty()) fieldCount++;

    if (fieldCount == 0) {
        JOptionPane.showMessageDialog(this, "No fields to update!");
        return;
    }

    if (!newPass.isEmpty() && !newPass.equals(confirmPass)) {
        JOptionPane.showMessageDialog(this, "Password and Confirm Password do not match");
        return;
    }

    StringBuilder sql = new StringBuilder("UPDATE tbl_accounts SET ");

    if (!newName.isEmpty()) sql.append("acc_name=?, ");
    if (!newLastname.isEmpty()) sql.append("acc_lname=?, ");
    if (!newEmail.isEmpty()) sql.append("acc_email=?, ");
    if (!newContact.isEmpty()) sql.append("acc_contact=?, ");
    if (!newAddress.isEmpty()) sql.append("acc_address=?, ");
    if (!newPass.isEmpty()) sql.append("acc_pass=?, ");

    sql.setLength(sql.length() - 2); // remove last comma
    sql.append(" WHERE acc_id=?");

    Object[] params = new Object[fieldCount + 1];
    int index = 0;

    if (!newName.isEmpty()) params[index++] = newName;
    if (!newLastname.isEmpty()) params[index++] = newLastname;
    if (!newEmail.isEmpty()) params[index++] = newEmail;
    if (!newContact.isEmpty()) params[index++] = newContact;
    if (!newAddress.isEmpty()) params[index++] = newAddress;
    if (!newPass.isEmpty()) params[index++] = config.hashPassword(newPass);

    params[index] = session.getId();

    // ===== UPDATE SAFELY =====
    try (Connection con = config.connectDB();
         PreparedStatement pst = con.prepareStatement(sql.toString())) {

        for (int i = 0; i < params.length; i++) {
            pst.setObject(i + 1, params[i]);
        }

        int updated = pst.executeUpdate();

        if (updated > 0) {
            JOptionPane.showMessageDialog(this, "Profile updated successfully!");
            loadUserData(); // refresh labels
        } else {
            JOptionPane.showMessageDialog(this, "No changes were made.");
        }

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error updating profile: " + e.getMessage());
    }
    }//GEN-LAST:event_saveMouseClicked
    
    private void btnChangePic3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChangePic3MouseClicked
        JFileChooser chooser = new JFileChooser();
    chooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter(
        "Image files", "jpg", "png", "jpeg", "gif"
    ));

    int result = chooser.showOpenDialog(this);
    if(result == JFileChooser.APPROVE_OPTION){
        String path = chooser.getSelectedFile().getAbsolutePath();

        // Save path to DB
        try {
            config db = new config();
            Connection con = db.connectDB();

            String sql = "UPDATE tbl_accounts SET acc_picture=? WHERE acc_id=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, path);
            pst.setInt(2, session.getId());
            pst.executeUpdate();

            pst.close();
            con.close();

            // Reload picture
            loadUserData();
            JOptionPane.showMessageDialog(this,"Profile picture updated!");
        } catch(Exception ex){
            JOptionPane.showMessageDialog(this,"Error: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
    }//GEN-LAST:event_btnChangePic3MouseClicked

    private void addresstxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addresstxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addresstxtActionPerformed

    private void cpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpassActionPerformed

    private void cancelbtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelbtMouseClicked
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_cancelbtMouseClicked

    private void placeorderbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_placeorderbtnMouseClicked

        // ===== Collect input values =====
      String Sendername = sendername.getText().trim();
      String Receivername = receivername.getText().trim();
      String Senderaddress = senderaddress.getText().trim();
      String Receiveraddress = receiveraddress.getText().trim();
      String Packagedesc = packagedesc.getText().trim();

      String Payment = payment.getSelectedItem().toString();
      String Delivery = deliverytype.getSelectedItem().toString();

      // ===== Basic validation =====
      if (Sendername.isEmpty() || Receivername.isEmpty() || Senderaddress.isEmpty() ||
          Receiveraddress.isEmpty() || Packagedesc.isEmpty() || weight.getText().trim().isEmpty()) {
          JOptionPane.showMessageDialog(this, "Please fill all required fields!");
          return;
      }

      // ===== Parse weight =====
      double packageWeight = 0;
      try {
          packageWeight = Double.parseDouble(weight.getText().trim());
      } catch (NumberFormatException e) {
          JOptionPane.showMessageDialog(this, "Invalid weight value!");
          return;
      }

      // ===== Estimate fee (optional simple calculation) =====
      double estimatedFee = packageWeight * 50; // Example: 50 currency units per kg

      // ===== SQL Insert =====
      String sql = "INSERT INTO tbl_orders " +
                   "(customer_name, pickup_address, dropoff_address, package_desc, weight, payment_method, receiver_name, delivery_type, estimated_fee) " +
                   "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

      try (Connection con = new config().connectDB();
           PreparedStatement pst = con.prepareStatement(sql)) {

          pst.setString(1, Sendername);
          pst.setString(2, Senderaddress);
          pst.setString(3, Receiveraddress);
          pst.setString(4, Packagedesc);
          pst.setDouble(5, packageWeight); // Use the parsed double, not JTextField
          pst.setString(6, Payment);
          pst.setString(7, Receivername);
          pst.setString(8, Delivery);
          pst.setDouble(9, estimatedFee);

          int inserted = pst.executeUpdate();

          if (inserted > 0) {
              JOptionPane.showMessageDialog(this, "Order placed successfully!");

              // ===== Clear fields after insertion =====
              sendername.setText("");
              receivername.setText("");
              senderaddress.setText("");
              receiveraddress.setText("");
              packagedesc.setText("");
              weight.setText("");
              payment.setSelectedIndex(0);
              deliverytype.setSelectedIndex(0);

              // Refresh table if you have one
              dashboardtable();
              ordertbl();
              totalpending();
              totalintransit();
              loadTotalorder();
          } else {
              JOptionPane.showMessageDialog(this, "Failed to place order!");
          }

      } catch (Exception e) {
          e.printStackTrace();
          JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
      }


    }//GEN-LAST:event_placeorderbtnMouseClicked
private void loadTotalorder() {

    try {
        Connection con = config.connectDB();
        String sql = "SELECT COUNT(*) AS total FROM tbl_orders";
        PreparedStatement pst = con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            int totalorders = rs.getInt("total");
            totalorder.setText(String.valueOf(totalorders));
            pst.close();
            con.close();
        }

    } catch (Exception e) {
        System.out.println(e);
    }
}

private void loadTotadelivered() {

    try {
        Connection con = config.connectDB();
        String sql = "SELECT COUNT(*) AS total FROM tbl_orders WHERE status = 'Delivered'";
        PreparedStatement pst = con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            int totalorders = rs.getInt("total");
            totaldelivered.setText(String.valueOf(totalorders));
            pst.close();
            con.close();
        }

    } catch (Exception e) {
        System.out.println(e);
    }
}

    void dashboardtable() {
     String sql =  
             "SELECT order_id AS id, " +
                   "customer_name AS name, " +
                   "pickup_address AS pickup_address, " +
                   "dropoff_address AS drop_off, " +
                   "status AS status, " +
                   "order_date AS date " +
                   "FROM tbl_orders";
     config conf = new config();
     conf.displayData(sql, dashboardtbl);
     

 }

private void loadUserData() {
    
    String sql = "SELECT acc_id, acc_name, acc_lname, acc_email, acc_contact, acc_address, acc_role, acc_picture FROM tbl_accounts WHERE acc_id=?";
    
    try (Connection con = new config().connectDB();
         PreparedStatement pst = con.prepareStatement(sql)) {

        pst.setInt(1, session.getId());
        try (ResultSet rs = pst.executeQuery()) {

            if (rs.next()) {
                String fullName = rs.getString("acc_name") + " " + rs.getString("acc_lname");
                name.setText(fullName);
                email.setText(rs.getString("acc_email"));
                contact.setText(rs.getString("acc_contact"));
                address.setText(rs.getString("acc_address"));
                role.setText(rs.getString("acc_role"));
                id.setText(rs.getString("acc_id"));
                id1.setText(rs.getString("acc_id"));
                role1.setText(rs.getString("acc_role"));

                // Load profile picture safely
                String path = rs.getString("acc_picture");
                if (path != null && !path.isEmpty()) {
                    ImageIcon icon = new ImageIcon(path);
                    Image original = icon.getImage();

                    Image img1 = original.getScaledInstance(
                            lblProfilePic.getWidth(),
                            lblProfilePic.getHeight(),
                            Image.SCALE_SMOOTH
                    );
                    lblProfilePic.setIcon(new ImageIcon(img1));
                }
            }
            pst.close();
            con.close();
        }

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error loading data: " + e.getMessage());
    }
}

    private void totalpending(){
            try {
            Connection con = config.connectDB();
            String sql = "SELECT COUNT(*) AS total FROM tbl_orders WHERE status = 'Pending'";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                int totalorders = rs.getInt("total");
                pendingtotal.setText(String.valueOf(totalorders));
                pst.close();
                con.close();
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    private void totalintransit(){
        try {
            Connection con = config.connectDB();
            String sql = "SELECT COUNT(*) AS total FROM tbl_orders WHERE status = 'Intransit'";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                int totalorders = rs.getInt("total");
                intransittotal.setText(String.valueOf(totalorders));
                pst.close();
                con.close();
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
   public void ordertbl() {

    String sql = "SELECT order_id AS id, " +
                 "customer_name AS name, " +
                 "pickup_address AS pickup_address, " +
                 "dropoff_address AS drop_off, " +
                 "status AS status, " +
                 "order_date AS date, " +
                 "'Cancel' AS action " +
                 "FROM tbl_orders " +
                 "WHERE status IN ('Pending','Intransit')";

    config conf = new config();
    conf.displayData(sql, ordertable);

    addCancelButton();
}


    private void addCancelButton() {

    int actionColumn = 6;

    // prevent duplicate renderer after refresh
    if (ordertable.getColumnModel().getColumnCount() > actionColumn) {

        ordertable.getColumnModel()
                  .getColumn(actionColumn)
                  .setCellRenderer(new ButtonRenderer());

        ordertable.getColumnModel()
                  .getColumn(actionColumn)
                  .setCellEditor(
                      new ButtonEditor(new JCheckBox(), ordertable, this)
                  );
    }
}


    // Renderer class
    public class ButtonRenderer extends JButton implements TableCellRenderer {

    public ButtonRenderer() {
        setText("Cancel");
    }

    @Override
    public Component getTableCellRendererComponent(
            JTable table, Object value,
            boolean isSelected, boolean hasFocus,
            int row, int column) {

        return this;
    }
}


    // Editor class
    public class ButtonEditor extends DefaultCellEditor {

    private JButton button;
    private JTable table;
    private Customer parent;

    public ButtonEditor(JCheckBox checkBox, JTable table, Customer parent) {
        super(checkBox);

        this.table = table;
        this.parent = parent;

        button = new JButton("Cancel");

        button.addActionListener(e -> handleCancel());
    }

    @Override
    public Component getTableCellEditorComponent(
            JTable table, Object value,
            boolean isSelected, int row, int column) {

        return button;
    }

    private void handleCancel() {

        int row = table.getEditingRow(); // safer than getSelectedRow()

        if (row < 0) return;

        String orderID = table.getValueAt(row, 0).toString();

        int confirm = JOptionPane.showConfirmDialog(
                null,
                "Cancel this order?",
                "Confirm",
                JOptionPane.YES_NO_OPTION
        );

        if (confirm != JOptionPane.YES_OPTION) {
            fireEditingCanceled();
            return;
        }

        cancelOrder(orderID);
        fireEditingStopped();
    }

    private void cancelOrder(String orderID) {

        try (Connection con = config.connectDB()) {

            String sql = "UPDATE tbl_orders " +
                         "SET status = 'Cancelled' " +
                         "WHERE order_id = ? " +
                         "AND status IN ('Pending','Intransit')";

            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, orderID);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Order Cancelled!");

            // ✅ REFRESH TABLE
            parent.ordertbl();
            parent.dashboardtable();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
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
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pending;
    private javax.swing.JLabel address;
    private javax.swing.JTextField addresstxt;
    private javax.swing.JLabel btnChangePic3;
    private javax.swing.JLabel cancelbt;
    private javax.swing.JPanel cancelpnl;
    private javax.swing.JLabel contact;
    private javax.swing.JTextField contacttxt;
    private javax.swing.JPasswordField cpass;
    private javax.swing.JPanel dashboard;
    private javax.swing.JTable dashboardtbl;
    private javax.swing.JLabel deliverbtn;
    private javax.swing.JPanel deliverpnl;
    private javax.swing.JComboBox<String> deliverytype;
    private javax.swing.JLabel email;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JLabel id;
    private javax.swing.JLabel id1;
    private javax.swing.JPanel intransit;
    private javax.swing.JLabel intransittotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel10000;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblProfilePic;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nametxt;
    private javax.swing.JPanel order;
    private javax.swing.JTable ordertable;
    private javax.swing.JTextField packagedesc;
    private javax.swing.JPasswordField password;
    private javax.swing.JComboBox<String> payment;
    private javax.swing.JLabel pending;
    private javax.swing.JLabel pendingtotal;
    private javax.swing.JPanel pfp;
    private javax.swing.JPanel pfp1;
    private javax.swing.JPanel placeorder;
    private javax.swing.JLabel placeorderbtn;
    private javax.swing.JTextField receiveraddress;
    private javax.swing.JTextField receivername;
    private javax.swing.JPanel reciept;
    private javax.swing.JLabel role;
    private javax.swing.JLabel role1;
    private javax.swing.JLabel save;
    private javax.swing.JPanel savepnl;
    private javax.swing.JTextField searchtbl;
    private javax.swing.JTextField senderaddress;
    private javax.swing.JTextField sendername;
    private javax.swing.JPanel settings;
    private javax.swing.JTextField surnametxt;
    private javax.swing.JLabel totaldelivered;
    private javax.swing.JLabel totalorder;
    private javax.swing.JPanel tracking;
    private javax.swing.JPanel update;
    private javax.swing.JLabel updatebtn;
    private javax.swing.JLabel userbtn;
    private javax.swing.JPanel userspnl;
    private javax.swing.JTextField weight;
    // End of variables declaration//GEN-END:variables
}
