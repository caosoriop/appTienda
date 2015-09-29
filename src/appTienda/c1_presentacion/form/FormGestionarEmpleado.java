/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appTienda.c1_presentacion.form;

import appTienda.c1_presentacion.util.Mensaje;
import appTienda.c2_aplicacion.servicio.GestionarEmpleadoServicio;
import appTienda.c2_aplicacion.servicio.GestionarUsuarioServicio;
import appTienda.c3_dominio.entidad.Empleado;
import appTienda.c3_dominio.entidad.Usuario;
import java.util.ArrayList;
import javax.swing.table.TableColumn;
import mastersoft.modelo.ModeloTabla;
import mastersoft.tabladatos.Columna;
import mastersoft.tabladatos.Fila;
import mastersoft.tabladatos.Tabla;

/**
 *
 * @author Osorio Perez Carlos - hacybeyker@gmail.com
 */
public class FormGestionarEmpleado extends javax.swing.JDialog {

    ArrayList<Empleado>listaEmpleado;
    ArrayList<Usuario>listaUsuario;
    /**
     * Creates new form FormGestionarEmpleado
     * @param parent
     * @param modal
     */
    public FormGestionarEmpleado(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setResizable(false);
        crearTabla();
    }
    
    private void crearTabla() {
        // TODO add your handling code here:
        Tabla tabla = new Tabla();
        tabla.agregarColumna(new Columna("Codigo", "java.lang.Integer"));
        tabla.agregarColumna(new Columna("Nombre", "java.lang.String"));
        tabla.agregarColumna(new Columna("Apellido", "java.lang.String"));
        tabla.agregarColumna(new Columna("Cargo", "java.lang.String"));
        tabla.agregarColumna(new Columna("Usuario", "java.lang.String"));
        tabla.agregarColumna(new Columna("Dni", "java.lang.String"));
        tabla.agregarColumna(new Columna("Direccion", "java.lang.String"));
        tabla.agregarColumna(new Columna("Telefono", "java.lang.String"));
        tabla.agregarColumna(new Columna("Celular", "java.lang.String"));
        tabla.agregarColumna(new Columna("Correo", "java.lang.String"));
        tabla.agregarColumna(new Columna("Activo", "java.lang.String"));
        ModeloTabla modeloTablaEmpleado  = new ModeloTabla(tabla);
        tablaEmpleado.setModel(modeloTablaEmpleado);
        
        TableColumn columna0,columna1,columna2,columna3,columna4,columna5,columna6,columna7,columna8,columna9,columna10;
        //Codigo
        columna0 = tablaEmpleado.getColumnModel().getColumn(0);
        columna0.setPreferredWidth(100);
        columna0.setMaxWidth(100);
        columna0.setMinWidth(100);
        //Nombre
        columna1 = tablaEmpleado.getColumnModel().getColumn(1);
        columna1.setPreferredWidth(150);
        columna1.setMaxWidth(150);
        columna1.setMinWidth(150);
        //Apellido
        columna2 = tablaEmpleado.getColumnModel().getColumn(2);
        columna2.setPreferredWidth(150);
        columna2.setMaxWidth(150);
        columna2.setMinWidth(150);
        //Cargo
        columna3 = tablaEmpleado.getColumnModel().getColumn(3);
        columna3.setPreferredWidth(150);
        columna3.setMaxWidth(150);
        columna3.setMinWidth(150);
        //Usuario
        columna4 = tablaEmpleado.getColumnModel().getColumn(4);
        columna4.setPreferredWidth(150);
        columna4.setMaxWidth(150);
        columna4.setMinWidth(150);
        //Dni
        columna5 = tablaEmpleado.getColumnModel().getColumn(5);
        columna5.setPreferredWidth(80);
        columna5.setMaxWidth(80);
        columna5.setMinWidth(80);
        //Direccion
        columna6 = tablaEmpleado.getColumnModel().getColumn(6);
        columna6.setPreferredWidth(200);
        columna6.setMaxWidth(200);
        columna6.setMinWidth(200);
        //Telefono
        columna7 = tablaEmpleado.getColumnModel().getColumn(7);
        columna7.setPreferredWidth(120);
        columna7.setMaxWidth(120);
        columna7.setMinWidth(120);
        //Celular
        columna8 = tablaEmpleado.getColumnModel().getColumn(8);
        columna8.setPreferredWidth(120);
        columna8.setMaxWidth(120);
        columna8.setMinWidth(120);
        //Correo
        columna9 = tablaEmpleado.getColumnModel().getColumn(9);
        columna9.setPreferredWidth(150);
        columna9.setMaxWidth(150);
        columna9.setMinWidth(150);
        //Activo
        columna10 = tablaEmpleado.getColumnModel().getColumn(10);
        columna10.setPreferredWidth(50);
        columna10.setMaxWidth(50);
        columna10.setMinWidth(50);
        
        tablaEmpleado.removeColumn(columna0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        botonCrear = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textoBuscar = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmpleado = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestionar Empleado");

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        botonCrear.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botonCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appTienda/c5_recursos/iconos/crearx32.png"))); // NOI18N
        botonCrear.setText("Crear");
        botonCrear.setFocusable(false);
        botonCrear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonCrear.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearActionPerformed(evt);
            }
        });
        jToolBar1.add(botonCrear);

        botonModificar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appTienda/c5_recursos/iconos/modificarx32.png"))); // NOI18N
        botonModificar.setText("Modificar");
        botonModificar.setFocusable(false);
        botonModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });
        jToolBar1.add(botonModificar);

        botonEliminar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appTienda/c5_recursos/iconos/eliminarx32.png"))); // NOI18N
        botonEliminar.setText("Eliminar");
        botonEliminar.setFocusable(false);
        botonEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        jToolBar1.add(botonEliminar);

        botonSalir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appTienda/c5_recursos/iconos/salirx32.png"))); // NOI18N
        botonSalir.setText("Salir");
        botonSalir.setFocusable(false);
        botonSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        jToolBar1.add(botonSalir);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Apellido:");

        textoBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        botonBuscar.setBackground(new java.awt.Color(255, 255, 255));
        botonBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appTienda/c5_recursos/iconos/buscarx20.png"))); // NOI18N
        botonBuscar.setText("Buscar");
        botonBuscar.setOpaque(false);
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        tablaEmpleado.setAutoCreateRowSorter(true);
        jScrollPane1.setViewportView(tablaEmpleado);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(textoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonBuscar)
                        .addGap(0, 825, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearActionPerformed
        // TODO add your handling code here:
        FormRegistrarEmpleado formRegistrarEmpleado = new FormRegistrarEmpleado(this);
        formRegistrarEmpleado.setVisible(true);
                
                
    }//GEN-LAST:event_botonCrearActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        // TODO add your handling code here:
        int codigoEmpleado = obtenerCodigoDeLaTabla();
        if(codigoEmpleado == 0)
            return;
        GestionarUsuarioServicio gestionarUsuarioServicio = new GestionarUsuarioServicio();    
        GestionarEmpleadoServicio gestionarEmpleadoServicio = new GestionarEmpleadoServicio();
        try {
            Usuario usuario = gestionarUsuarioServicio.buscar(codigoEmpleado);
            Empleado empleado = gestionarEmpleadoServicio.buscar(codigoEmpleado);
            if(usuario != null && empleado != null){
                FormRegistrarEmpleado formRegistrarEmpleado = new FormRegistrarEmpleado(this, usuario, empleado);
                formRegistrarEmpleado.setVisible(true);
            }
            else{
                Mensaje.Mostrar_MENSAJE_FILANOEXISTE(this);
            }
            crearTabla();
            ponerFocoConSeleccionEnBuscarEmpleado();
        } catch(Exception e){
            //Mensaje.mostrarErrorDeConsulta(this);
        }    
    }//GEN-LAST:event_botonModificarActionPerformed

    private int obtenerCodigoDeLaTabla() {
        int numFila = tablaEmpleado.getSelectedRow();
        if(numFila == -1){
            Mensaje.Mostrar_MENSAJE_FILANOSELECCIONADO(this);
            return 0;
        }
        ModeloTabla modeloTablaEmpleado = (ModeloTabla) tablaEmpleado.getModel();
        return (Integer)modeloTablaEmpleado.getValueAt(numFila, 0); // se retorna el id de la fila seleccionada
    }
    
    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        // TODO add your handling code here:
        if(!textoBuscar.getText().trim().isEmpty()){
            consultarEmpleado(); 
            ponerFocoConSeleccionEnBuscarEmpleado();
        }else{            
            Mensaje.Mostrar_MENSAJE_LLENARCAMPOBUSCAR(this);            
            ponerFocoConSeleccionEnBuscarEmpleado();
        } 
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void ponerFocoConSeleccionEnBuscarEmpleado() {
        textoBuscar.selectAll();        
        textoBuscar.requestFocus();
    }
    
    private void consultarEmpleado() {
        ModeloTabla modeloTablaEmpleado = (ModeloTabla) tablaEmpleado.getModel();
        modeloTablaEmpleado.eliminarTotalFilas();
        String apellido = textoBuscar.getText().trim().toUpperCase();
        try {
            GestionarUsuarioServicio gestionarUsuarioServicio = new GestionarUsuarioServicio();
            listaUsuario = gestionarUsuarioServicio.buscarPorApellido(apellido);
            if(listaUsuario!=null && listaUsuario.size()>0){
                for(Usuario usuario : listaUsuario){
                    Fila fila = new Fila();
                    fila.agregarValorCelda(usuario.getEmpleado().getCodigo());
                    fila.agregarValorCelda(usuario.getEmpleado().getNombre());
                    fila.agregarValorCelda(usuario.getEmpleado().getApellido());
                    fila.agregarValorCelda(usuario.getEmpleado().getCargo().getNombre());
                    fila.agregarValorCelda(usuario.getUsuario());
                    fila.agregarValorCelda(usuario.getEmpleado().getDni());
                    fila.agregarValorCelda(usuario.getEmpleado().getDireccion());
                    fila.agregarValorCelda(usuario.getEmpleado().getTelefono());
                    fila.agregarValorCelda(usuario.getEmpleado().getCelular());
                    fila.agregarValorCelda(usuario.getEmpleado().getCorreo());
                    fila.agregarValorCelda(usuario.getEmpleado().isActivo());                    
                    modeloTablaEmpleado.agregarFila(fila);
                }         
                tablaEmpleado.setModel(modeloTablaEmpleado);
            }else{
                Mensaje.Mostrar_MENSAJE_NOSEENCONTRONINGUNRESULTADO(this);
                ponerFocoConSeleccionEnBuscarEmpleado();
            }
        } catch(Exception e){    
            //
        }
    }
    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonCrear;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable tablaEmpleado;
    private javax.swing.JTextField textoBuscar;
    // End of variables declaration//GEN-END:variables
}