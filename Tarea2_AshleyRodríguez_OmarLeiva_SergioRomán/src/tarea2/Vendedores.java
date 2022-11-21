/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tarea2;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.WindowConstants;
//import static tarea2.Vendedores2.user_update;

/**
 *
 * @author PON TU NOMBRE 
 */
public class Vendedores extends javax.swing.JFrame {

    /**
     * Creates new form Vendedores
     */
    String bd = "bd_vendedores";
    String url = "jdbc:mysql://localhost:3306/" + bd + "?useSSL=false&serverTimezone=UTC";
    String user = "root";
    String password = "";

    DefaultTableModel model = new DefaultTableModel();
    public static String user_update = "";

    public Vendedores() {
        initComponents();
        setResizable(false);
        setTitle("Vendedores");
        // centrar la interfaz
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        // poner fondo
        ImageIcon fondo = new ImageIcon("src/imagen/fondo_img.png");
        Icon icono = new ImageIcon(fondo.getImage().getScaledInstance(jLabelFondo.getWidth(), jLabelFondo.getHeight(), Image.SCALE_DEFAULT));
        jLabelFondo.setIcon(icono);
        //para que se noten los cambios
        this.repaint();

        tablaDeVendedores();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVendedores = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaVendedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaVendedores);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 1096, 150));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Presione la fila que desea editar o eliminar");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 310, -1));

        jLabelTitulo.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Vendedores");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1108, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Ponemos iconos en nuestro JFrame
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagen/logo.png"));
        return retValue;
    }

// Tabla de vendedores
    private void tablaDeVendedores() {
        try {
            Connection cn = DriverManager.getConnection(url, user, password);
            PreparedStatement pst = cn.prepareStatement("select Nombre, Cant_venta_cod, Cant_venta_min, Cant_venta_for, TotalVentas, Comision_cod, Comision_min, Comision_for, TotalComision  from vendedor");
            ResultSet rs = pst.executeQuery();
            tablaVendedores = new JTable(model);
            // Esto es para que muestre un scroll si nuestra tabla de vendedores es muy grande
            jScrollPane1.setViewportView(tablaVendedores);

            // Agregamos los columnas y nombres a nuestra tabla de vendedores
            model.addColumn("Nombre");
            model.addColumn("Cantidad Ventas COD");
            model.addColumn("Cantidad Ventas MIN");
            model.addColumn("Cantidad ventas FOR");
            model.addColumn("Total Ventas ($)");
            model.addColumn("Comision Call of Duty");
            model.addColumn("Comision Minecraft");
            model.addColumn("Comision Fornite");
            model.addColumn("Comision Total");

            // si encontro algo en DB se hace el ciclo
            while (rs.next()) {
                Object[] fila = new Object[9];
                for (int i = 0; i < 9; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println(e);
        }

        // Este evento pasara cuendo hace click en una fila y tendra la oportunidad de editar
        tablaVendedores.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = tablaVendedores.rowAtPoint(e.getPoint());
                // la columan 0 es decir donde esta el nombre
                int columna_point = 0;

                if (fila_point > -1) {
                    user_update = String.valueOf(model.getValueAt(fila_point, columna_point));
                    dispose();
                    new DatosVendedor().setVisible(true);
                }
            }
        });
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaVendedores;
    // End of variables declaration//GEN-END:variables
}
