package login;

import java.awt.Color;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        TextPrompt textName  = new TextPrompt(" Email", txtNombre);
        TextPrompt textPassword  = new TextPrompt(" Contraseña", txtPassword);
        this.setTitle("Inicio de sesión");
        setIconImage(new ImageIcon( getClass().getResource( "/images/iconApp.jpg" ) ).getImage());
        
        
        txtNombre.setBorder( new EmptyBorder(10,10,10,10) );
        txtPassword.setBorder( new EmptyBorder(10,10,10,10) );
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new javax.swing.JPanel();
        loginContainer = new javax.swing.JPanel();
        lblTit1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnRecuperarPassword = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(15, 76, 117));
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        container.setBackground(new java.awt.Color(15, 76, 117));
        container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginContainer.setBackground(new java.awt.Color(50, 130, 184));
        loginContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTit1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblTit1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTit1.setText("Bienvenidos");
        loginContainer.add(lblTit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 8, 270, 50));

        txtNombre.setForeground(new java.awt.Color(153, 153, 153));
        txtNombre.setActionCommand("<Not Set>");
        txtNombre.setAlignmentX(1.0F);
        txtNombre.setAlignmentY(1.0F);
        txtNombre.setBorder(null);
        txtNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNombre.setOpaque(true);
        loginContainer.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 240, 30));

        txtPassword.setBorder(null);
        txtPassword.setPreferredSize(new java.awt.Dimension(64, 22));
        loginContainer.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 240, 30));

        btnLogin.setBackground(new java.awt.Color(204, 204, 255));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnLogin.setText("Iniciar sesión");
        btnLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        btnLogin.setBorderPainted(false);
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        loginContainer.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 240, 30));

        btnRecuperarPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRecuperarPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRecuperarPassword.setText("¿Perdiste tu contraseña?");
        btnRecuperarPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRecuperarPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRecuperarPasswordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRecuperarPasswordMouseExited(evt);
            }
        });
        loginContainer.add(btnRecuperarPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 220, 270, -1));

        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRegistrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRegistrar.setText("¿No tienes una cuenta? Registrate aquí");
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginContainer.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 250, 280, -1));

        container.add(loginContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 280, 300));

        getContentPane().add(container, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnRecuperarPasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRecuperarPasswordMouseEntered
        btnRecuperarPassword.setForeground(Color.white);
    }//GEN-LAST:event_btnRecuperarPasswordMouseEntered

    private void btnRecuperarPasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRecuperarPasswordMouseExited
        btnRecuperarPassword.setForeground(Color.black);
    }//GEN-LAST:event_btnRecuperarPasswordMouseExited

  
    public static void main(String args[]) {
        

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel btnRecuperarPassword;
    private javax.swing.JLabel btnRegistrar;
    private javax.swing.JPanel container;
    private javax.swing.JLabel lblTit1;
    private javax.swing.JPanel loginContainer;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables

    
}
