/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tarea2;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author PON TU NOMBRE
 */
public class DatosVendedor extends javax.swing.JFrame {

    /**
     * Creates new form DatosVendedor
     */
    String bd = "bd_vendedores";
    String url = "jdbc:mysql://localhost:3306/" + bd + "?useSSL=false&serverTimezone=UTC";
    String user = "root";
    String password = "";
    String user_update = "", codigoVendedor;

    public DatosVendedor() {
        initComponents();
        setResizable(false);
        user_update = Vendedores.user_update;

        setTitle("Datos del Vendedor " + user_update);
        // centrar la interfaz
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        mostrarDatos();
        // poner fondo
        ImageIcon fondo = new ImageIcon("src/imagen/fondo_img.png");
        Icon icono = new ImageIcon(fondo.getImage().getScaledInstance(jLabelFondo.getWidth(), jLabelFondo.getHeight(), Image.SCALE_DEFAULT));
        jLabelFondo.setIcon(icono);
        //para que se noten los cambios
        this.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jLabelCod = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jLabelFor = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelCodigoVendedor = new javax.swing.JLabel();
        input_cant_cod = new javax.swing.JTextField();
        input_cant_min = new javax.swing.JTextField();
        input_cant_for = new javax.swing.JTextField();
        input_nombre = new javax.swing.JTextField();
        input_codigo_vendedor = new javax.swing.JTextField();
        btn_borrar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Datos del Vendedor");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabelCod.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabelCod.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCod.setText("Cantidad venta Call of Duty :");
        getContentPane().add(jLabelCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabelMin.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin.setText("Cantidad venta Minicraft :");
        getContentPane().add(jLabelMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabelFor.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabelFor.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFor.setText("Cantidad venda Fornite :");
        getContentPane().add(jLabelFor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabelNombre.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombre.setText("Nombre : ");
        getContentPane().add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabelCodigoVendedor.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabelCodigoVendedor.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCodigoVendedor.setText("Codigo del Vendedor");
        getContentPane().add(jLabelCodigoVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        input_cant_cod.setBackground(new java.awt.Color(223, 220, 220));
        input_cant_cod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input_cant_codKeyTyped(evt);
            }
        });
        getContentPane().add(input_cant_cod, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 160, -1));

        input_cant_min.setBackground(new java.awt.Color(223, 220, 220));
        input_cant_min.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input_cant_minKeyTyped(evt);
            }
        });
        getContentPane().add(input_cant_min, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 160, -1));

        input_cant_for.setBackground(new java.awt.Color(223, 220, 220));
        input_cant_for.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input_cant_forKeyTyped(evt);
            }
        });
        getContentPane().add(input_cant_for, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 160, -1));

        input_nombre.setBackground(new java.awt.Color(223, 220, 220));
        input_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input_nombreKeyTyped(evt);
            }
        });
        getContentPane().add(input_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 160, -1));

        input_codigo_vendedor.setEditable(false);
        input_codigo_vendedor.setBackground(new java.awt.Color(223, 220, 220));
        input_codigo_vendedor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        input_codigo_vendedor.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        input_codigo_vendedor.setEnabled(false);
        getContentPane().add(input_codigo_vendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 160, -1));

        btn_borrar.setBackground(new java.awt.Color(166, 142, 116));
        btn_borrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_borrar.setText("ELIMINAR VENDEDOR");
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 180, 40));

        btn_actualizar.setBackground(new java.awt.Color(166, 142, 116));
        btn_actualizar.setForeground(new java.awt.Color(255, 255, 255));
        btn_actualizar.setText("ACTUALIZAR");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 180, 40));
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Ponemos iconos en nuestro JFrame
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagen/logo.png"));
        return retValue;
    }

    private void mostrarDatos() {
        jLabelTitulo.setText("Datos del usuario " + user_update);

        try {
            Connection cn = DriverManager.getConnection(url, user, password);
            PreparedStatement pst = cn.prepareStatement("select * from vendedor where Nombre = '" + user_update + "'");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                // almacenamos el codigoVendedor seleccionado
                codigoVendedor = rs.getString("Codigo_vendedor");

                // los datos que estan en la base de datos lo mostramos en los inputs
                input_nombre.setText(rs.getString("Nombre"));
                input_codigo_vendedor.setText(rs.getString("Codigo_vendedor"));
                input_cant_cod.setText(rs.getString("Cant_venta_cod"));
                input_cant_min.setText(rs.getString("Cant_venta_min"));
                input_cant_for.setText(rs.getString("Cant_venta_for"));
            }
            //Vendedores v = new Vendedores();
        } catch (SQLException e) {
            System.err.println("Eror en editar los datos del vendedor");
        }
    }
    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        // TODO add your handling code here:
        String nombre, codigoVendedor, cantCod, cantMin, cantFor;

        nombre = input_nombre.getText().trim();
        codigoVendedor = input_codigo_vendedor.getText().trim();
        cantCod = input_cant_cod.getText().trim();
        cantMin = input_cant_min.getText().trim();
        cantFor = input_cant_for.getText().trim();

        // validamos si los input estan vacios entonces mandamos un mensaje que llene todo los campos
        if (nombre.isEmpty() || codigoVendedor.isEmpty() || cantCod.isEmpty() || cantMin.isEmpty() || cantFor.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Error, Por favor llenar todos los campos");
        } else {
            try {
                Connection cn = DriverManager.getConnection(url, user, password);
                // consulta a la base de datos para que actualice los datos del vendedor seleccionado en la tabla. 
                PreparedStatement pst = cn.prepareStatement("update vendedor set Nombre=?, Cant_venta_cod=?, Cant_venta_min=?, Cant_venta_for=? where Codigo_vendedor = '" + codigoVendedor + "'");
                pst.setString(1, nombre);
                pst.setString(2, cantCod);
                pst.setString(3, cantMin);
                pst.setString(4, cantFor);

                pst.executeUpdate();
                cn.close();

                JOptionPane.showMessageDialog(null, "Actualizacion con éxito");
            } catch (SQLException e) {
                System.err.println("error al editar los datos de cantidades" + e);
            }

            // esto es para actualizar y calcular los campos de totalVentas, comisiones y totalComision
            try {

                int totalVentas, comisionCod, comisionMin, comisionFor, totalComision;

                cantCod = input_cant_cod.getText().trim();
                cantMin = input_cant_min.getText().trim();
                cantFor = input_cant_for.getText().trim();

                totalVentas = (Integer.parseInt(cantCod) * 34500) + (Integer.parseInt(cantMin) * 8800) + (Integer.parseInt(cantFor) * 58200);

                comisionCod = (int) ((Integer.parseInt(cantCod) * 34500) * 0.06);
                comisionMin = (int) ((Integer.parseInt(cantMin) * 8800) * 0.04);
                comisionFor = (int) ((Integer.parseInt(cantFor) * 58200) * 0.09);

                totalComision = comisionCod + comisionMin + comisionFor;

                Connection cn2 = DriverManager.getConnection(url, user, password);
                PreparedStatement pst2 = cn2.prepareStatement("update vendedor set TotalVentas=?, Comision_cod=?, Comision_min=?, Comision_for=?, TotalComision=? where Codigo_vendedor = '" + codigoVendedor + "'");
                pst2.setInt(1, totalVentas);
                pst2.setInt(2, comisionCod);
                pst2.setInt(3, comisionMin);
                pst2.setInt(4, comisionFor);
                pst2.setInt(5, totalComision);

                pst2.executeUpdate();
                cn2.close();
            } catch (SQLException e) {
                System.err.println("error al editar los datos de comisiones y totales" + e);
            }
        }
        dispose();
        new Vendedores().setVisible(true);
    }//GEN-LAST:event_btn_actualizarActionPerformed

    // eliminamos el vendedor
    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
        // TODO add your handling code here:
        Connection cn;
        try {
            cn = DriverManager.getConnection(url, user, password);
            // consulta SQL para eliminar el vendedor
            PreparedStatement pst = cn.prepareStatement("delete from vendedor where Codigo_vendedor='" + codigoVendedor + "'");
            pst.executeUpdate();
            cn.close();
            JOptionPane.showMessageDialog(null, "Se elimino correctamente");
        } catch (SQLException e) {
            System.err.println("Error al eliminar un vendedor " + e);
        }
        dispose();
        new Vendedores().setVisible(true);
    }//GEN-LAST:event_btn_borrarActionPerformed

    private void input_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_nombreKeyTyped
        // TODO add your handling code here:
        // Valido que solo se ingrese letras
        char letra = evt.getKeyChar();
        // si no es una letra lo cancelamos
        if (!Character.isLetter(letra)) {
            evt.consume();
        }
    }//GEN-LAST:event_input_nombreKeyTyped

    private void input_cant_codKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_cant_codKeyTyped
        // TODO add your handling code here:
        // validamos que solo se ingrese numeros
        char numero = evt.getKeyChar();
        if (!Character.isDigit(numero)) {
            evt.consume();
        }
    }//GEN-LAST:event_input_cant_codKeyTyped

    private void input_cant_minKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_cant_minKeyTyped
        // TODO add your handling code here:
        // validamos que solo se ingrese numeros
        char numero = evt.getKeyChar();
        if (!Character.isDigit(numero)) {
            evt.consume();
        }
    }//GEN-LAST:event_input_cant_minKeyTyped

    private void input_cant_forKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_cant_forKeyTyped
        // TODO add your handling code here:
        // validamos que solo se ingrese numeros
        char numero = evt.getKeyChar();
        if (!Character.isDigit(numero)) {
            evt.consume();
        }
    }//GEN-LAST:event_input_cant_forKeyTyped

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_borrar;
    private javax.swing.JTextField input_cant_cod;
    private javax.swing.JTextField input_cant_for;
    private javax.swing.JTextField input_cant_min;
    private javax.swing.JTextField input_codigo_vendedor;
    private javax.swing.JTextField input_nombre;
    private javax.swing.JLabel jLabelCod;
    private javax.swing.JLabel jLabelCodigoVendedor;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelFor;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTitulo;
    // End of variables declaration//GEN-END:variables
}
