/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pe.edu.upeu.app.gui;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import pe.edu.upeu.app.dao.conx.ConnUsuario;
import pe.edu.upeu.app.util.UtilsX;

/**
 *
 * @author LABORATORIO_2
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    UtilsX obj = new UtilsX();
    Image image;
    Image image2;

    public Login() {
        initComponents();
        this.setTitle("Login SysCenterLife");
        try {
            image = ImageIO.read(obj.getFile("Alarm-Tick-icon.png"));
            image2 = ImageIO.read(obj.getFile("pinguino.jpg"));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        this.setIconImage(image);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setResizable(false);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(new Dimension(screenSize.width / 2, (screenSize.height - 36) / 2));

        Image scaleImage = image2.getScaledInstance(imgX.getWidth(),
                imgX.getHeight(), Image.SCALE_DEFAULT);
        imgX.setIcon(new ImageIcon(scaleImage));

        this.setLocationRelativeTo(null);
        this.setVisible(true);
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
        panelBorder1 = new pe.edu.upeu.app.components.PanelBorder();
        myButton2 = new pe.edu.upeu.app.components.MyButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPasword = new javax.swing.JPasswordField();
        txtUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        imgX = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        panelBorder1.setBackground(new java.awt.Color(0, 102, 102));

        myButton2.setBackground(new java.awt.Color(0, 204, 204));
        myButton2.setForeground(new java.awt.Color(255, 51, 51));
        myButton2.setText("Ingresar");
        myButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton2ActionPerformed(evt);
            }
        });
        panelBorder1.add(myButton2);
        myButton2.setBounds(50, 260, 100, 22);

        jLabel1.setFont(new java.awt.Font("Swis721 Cn BT", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario");
        panelBorder1.add(jLabel1);
        jLabel1.setBounds(10, 100, 90, 18);

        jLabel2.setFont(new java.awt.Font("Swis721 Cn BT", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña");
        panelBorder1.add(jLabel2);
        jLabel2.setBounds(10, 180, 80, 18);
        panelBorder1.add(txtPasword);
        txtPasword.setBounds(10, 210, 170, 22);

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        panelBorder1.add(txtUsuario);
        txtUsuario.setBounds(10, 140, 170, 22);

        jLabel3.setBackground(new java.awt.Color(255, 255, 51));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-seguridad-80.png"))); // NOI18N
        panelBorder1.add(jLabel3);
        jLabel3.setBounds(60, 10, 110, 90);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(102, 255, 204));

        imgX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pinguino.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(imgX, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imgX, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void myButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton2ActionPerformed
         // TODO add your handling code here:
        //GUIMain guim = new GUIMain();
        //guim.setVisible(true);
        //this.dispose();
        try {
            ConnUsuario con= new ConnUsuario();
            String u= txtUsuario.getText();
            String p= txtPasword.getText();
            con.ConectarBasedeDatos();
            
            String SQL = "SELECT id_usuario, user FROM usuario WHERE user='"+u+"' AND clave='"+p+"' ";
            con.resultado = con.sentencia.executeQuery(SQL);
            if(con.resultado.next()){
                setVisible(false);
                GUIMain gm = new GUIMain();
                gm.setVisible(true);
                
                
              
            }else{
            
                JOptionPane.showMessageDialog(null, "usuario o contraseña invalido");
            }
            
            
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, ex.getMessage());
        }
      
    }//GEN-LAST:event_myButton2ActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgX;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private pe.edu.upeu.app.components.MyButton myButton2;
    private pe.edu.upeu.app.components.PanelBorder panelBorder1;
    private javax.swing.JPasswordField txtPasword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
