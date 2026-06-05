/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package sistemadeventas;

/**
 *
 * @author ASUS
 */
public class FrmPrincipal extends javax.swing.JPanel {

    /**
     * Creates new form FrmPrincipal
     */
public FrmPrincipal() {
    initComponents();

    mostrarUsuarioActivo();

    limpiarCamposLibreria();
    actualizarTablaLibreria();

    limpiarCamposAbarrote();
    actualizarTablaAbarrotes();

    limpiarCamposUsuario();
    actualizarTablaUsuarios();
}
   
private void mostrarUsuarioActivo() {

    if (SistemaDatos.usuarioActivo != null) {
        lblUsuarioActivo.setText(SistemaDatos.usuarioActivo.getNombres());
        lblRolUsuario.setText(SistemaDatos.usuarioActivo.getRol());
    }
}

private void limpiarCamposLibreria() {

    txtCodigoLibreria.setText("");
    txtNombreLibreria.setText("");
    txtCategoriaLibreria.setText("");
    txtPrecioLibreria.setText("");
    txtStockLibreria.setText("");
    txtMarcaLibreria.setText("");
    txtCampaniaEscolar.setText("");

    chkCampaniaEscolar.setSelected(false);

    if (cmbTipoArticulo.getItemCount() > 0) {
        cmbTipoArticulo.setSelectedIndex(0);
    }

    txtCodigoLibreria.requestFocus();
}

private void actualizarTablaLibreria() {

    javax.swing.table.DefaultTableModel modelo =
            (javax.swing.table.DefaultTableModel) tblLibreria.getModel();

    modelo.setRowCount(0);

    for (ProductoLibreria p : SistemaDatos.productoControlador.obtenerProductosLibreria()) {

        modelo.addRow(new Object[]{
            p.getCodigo(),
            p.getNombre(),
            p.getCategoria(),
            p.getPrecio(),
            p.getStock(),
            p.getTipoArticulo(),
            p.getMarca(),
            p.getCampaniaEscolar()
        });
    }
}

private void cargarProductoLibreriaEnFormulario(ProductoLibreria p) {

    txtCodigoLibreria.setText(p.getCodigo());
    txtNombreLibreria.setText(p.getNombre());
    txtCategoriaLibreria.setText(p.getCategoria());
    txtPrecioLibreria.setText(String.valueOf(p.getPrecio()));
    txtStockLibreria.setText(String.valueOf(p.getStock()));
    cmbTipoArticulo.setSelectedItem(p.getTipoArticulo());
    txtMarcaLibreria.setText(p.getMarca());
    txtCampaniaEscolar.setText(p.getCampaniaEscolar());

    chkCampaniaEscolar.setSelected(p.esCampaniaEscolar());
}
private void limpiarCamposAbarrote() {

    txtCodigoAbarrote.setText("");
    txtNombreAbarrote.setText("");
    txtCategoriaAbarrote.setText("");
    txtPrecioAbarrote.setText("");
    txtStockAbarrote.setText("");
    txtFechaVencimiento.setText("");
    txtMarcaAbarrote.setText("");

    if (cmbUnidadMedida.getItemCount() > 0) {
        cmbUnidadMedida.setSelectedIndex(0);
    }

    txtCodigoAbarrote.requestFocus();
}

private void actualizarTablaAbarrotes() {

    javax.swing.table.DefaultTableModel modelo =
            (javax.swing.table.DefaultTableModel) tblAbarrotes.getModel();

    modelo.setRowCount(0);

    for (ProductoAbarrote p : SistemaDatos.productoControlador.obtenerAbarrotes()) {

        modelo.addRow(new Object[]{
            p.getCodigo(),
            p.getNombre(),
            p.getCategoria(),
            p.getPrecio(),
            p.getStock(),
            p.getFechaVencimiento(),
            p.getMarca(),
            p.getUnidadMedida()
        });
    }
}

private void cargarAbarroteEnFormulario(ProductoAbarrote p) {

    txtCodigoAbarrote.setText(p.getCodigo());
    txtNombreAbarrote.setText(p.getNombre());
    txtCategoriaAbarrote.setText(p.getCategoria());
    txtPrecioAbarrote.setText(String.valueOf(p.getPrecio()));
    txtStockAbarrote.setText(String.valueOf(p.getStock()));
    txtFechaVencimiento.setText(p.getFechaVencimiento());
    txtMarcaAbarrote.setText(p.getMarca());
    cmbUnidadMedida.setSelectedItem(p.getUnidadMedida());
}
private void limpiarCamposUsuario() {

    txtIdUsuario.setText("");
    txtNombresUsuario.setText("");
    txtUsuarioRegistro.setText("");
    txtContraseniaUsuario.setText("");

    if (cmbRolUsuario.getItemCount() > 0) {
        cmbRolUsuario.setSelectedIndex(0);
    }

    txtIdUsuario.requestFocus();
}

private void actualizarTablaUsuarios() {

    javax.swing.table.DefaultTableModel modelo =
            (javax.swing.table.DefaultTableModel) tblUsuarios.getModel();

    modelo.setRowCount(0);

    for (Usuario u : SistemaDatos.usuarioControlador.listarUsuarios()) {

        modelo.addRow(new Object[]{
            u.getIdUsuario(),
            u.getNombres(),
            u.getUsuario(),
            u.getRol(),
            u.estadoTexto()
        });
    }
}

private void cargarUsuarioEnFormulario(Usuario u) {

    txtIdUsuario.setText(u.getIdUsuario());
    txtNombresUsuario.setText(u.getNombres());
    txtUsuarioRegistro.setText(u.getUsuario());
    txtContraseniaUsuario.setText(u.getContrasenia());
    cmbRolUsuario.setSelectedItem(u.getRol());
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSuperior = new javax.swing.JPanel();
        lblTextoUsuarioActivo = new javax.swing.JLabel();
        lblUsuarioActivo = new javax.swing.JLabel();
        lblTextoRolUsuario = new javax.swing.JLabel();
        lblRolUsuario = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JButton();
        lblTituloSistema = new javax.swing.JLabel();
        panelClientes = new javax.swing.JTabbedPane();
        panelCaja = new javax.swing.JPanel();
        lblTituloCaja = new javax.swing.JLabel();
        lblMontoInicial = new javax.swing.JLabel();
        txtMontoInicial = new javax.swing.JTextField();
        lblMontoIngreso = new javax.swing.JLabel();
        btnAbrirCaja = new javax.swing.JButton();
        txtMontoIngreso = new javax.swing.JTextField();
        btnRegistrarIngreso = new javax.swing.JButton();
        lblMontoEgreso = new javax.swing.JLabel();
        txtMontoEgreso = new javax.swing.JTextField();
        lblDescripcionMovimiento = new javax.swing.JLabel();
        txtDescripcionMovimiento = new javax.swing.JTextField();
        btnRegistrarEgreso = new javax.swing.JButton();
        lblTextoVentasEfectivo = new javax.swing.JLabel();
        lblVentasEfectivo = new javax.swing.JLabel();
        lblTextoIngresos = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblTextoEgresos = new javax.swing.JLabel();
        lblEgresos = new javax.swing.JLabel();
        lblTextoSaldoActual = new javax.swing.JLabel();
        lblSaldoActual = new javax.swing.JLabel();
        lblTextoCierreEsperado = new javax.swing.JLabel();
        lblCierreEsperado = new javax.swing.JLabel();
        btnVerCaja = new javax.swing.JButton();
        btnCerrarCaja = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblTituloClientes = new javax.swing.JLabel();
        lblIdCliente = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        lblDocumentoCliente = new javax.swing.JLabel();
        txtDocumentoCliente = new javax.swing.JTextField();
        lblNombresCliente = new javax.swing.JLabel();
        txtNombresCliente = new javax.swing.JTextField();
        lblTelefonoCliente = new javax.swing.JLabel();
        txtTelefonoCliente = new javax.swing.JTextField();
        lblDireccionCliente = new javax.swing.JLabel();
        txtDireccionCliente = new javax.swing.JTextField();
        btnGuardarCliente = new javax.swing.JButton();
        btnModificarCliente = new javax.swing.JButton();
        btnBuscarCliente = new javax.swing.JButton();
        btnLimpiarCliente = new javax.swing.JButton();
        scrollClientes = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        panelLibreria = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblLibreria = new javax.swing.JTable();
        lblTituloLibreria = new javax.swing.JLabel();
        lblCodigoLibreria = new javax.swing.JLabel();
        txtCodigoLibreria = new javax.swing.JTextField();
        lblNombreLibreria = new javax.swing.JLabel();
        txtNombreLibreria = new javax.swing.JTextField();
        lblCategoriaLibreria = new javax.swing.JLabel();
        txtCategoriaLibreria = new javax.swing.JTextField();
        lblPrecioLibreria = new javax.swing.JLabel();
        txtPrecioLibreria = new javax.swing.JTextField();
        lblStockLibreria = new javax.swing.JLabel();
        txtStockLibreria = new javax.swing.JTextField();
        lblTipoArticulo = new javax.swing.JLabel();
        cmbTipoArticulo = new javax.swing.JComboBox<>();
        lblMarcaLibreria = new javax.swing.JLabel();
        txtMarcaLibreria = new javax.swing.JTextField();
        chkCampaniaEscolar = new javax.swing.JCheckBox();
        txtCampaniaEscolar = new javax.swing.JTextField();
        btnGuardarLibreria = new javax.swing.JButton();
        btnModificarLibreria = new javax.swing.JButton();
        btnEliminarLibreria = new javax.swing.JButton();
        btnBuscarLibreria = new javax.swing.JButton();
        btnFiltrarTipo = new javax.swing.JButton();
        btnLimpiarLibreria = new javax.swing.JButton();
        panelReportes = new javax.swing.JPanel();
        panelUsuarios = new javax.swing.JPanel();
        lblTituloUsuarios = new javax.swing.JLabel();
        lblIdUsuario = new javax.swing.JLabel();
        txtIdUsuario = new javax.swing.JTextField();
        lblNombresUsuario = new javax.swing.JLabel();
        txtNombresUsuario = new javax.swing.JTextField();
        lblUsuarioRegistro = new javax.swing.JLabel();
        txtUsuarioRegistro = new javax.swing.JTextField();
        lblContraseniaUsuario = new javax.swing.JLabel();
        txtContraseniaUsuario = new javax.swing.JTextField();
        lblRolUsuarioRegistro = new javax.swing.JLabel();
        cmbRolUsuario = new javax.swing.JComboBox<>();
        btnGuardarUsuario = new javax.swing.JButton();
        btnModificarUsuario = new javax.swing.JButton();
        btnDarBajaUsuario = new javax.swing.JButton();
        btnBuscarUsuario = new javax.swing.JButton();
        btnLimpiarUsuario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        panelMinimarket = new javax.swing.JPanel();
        lblTituloMinimarket = new javax.swing.JLabel();
        lblCodigoAbarrote = new javax.swing.JLabel();
        txtCodigoAbarrote = new javax.swing.JTextField();
        lblNombreAbarrote = new javax.swing.JLabel();
        txtNombreAbarrote = new javax.swing.JTextField();
        lblCategoriaAbarrote = new javax.swing.JLabel();
        txtCategoriaAbarrote = new javax.swing.JTextField();
        lblPrecioAbarrote = new javax.swing.JLabel();
        txtPrecioAbarrote = new javax.swing.JTextField();
        lblStockAbarrote = new javax.swing.JLabel();
        txtStockAbarrote = new javax.swing.JTextField();
        lblFechaVencimiento = new javax.swing.JLabel();
        txtFechaVencimiento = new javax.swing.JTextField();
        lblMarcaAbarrote = new javax.swing.JLabel();
        txtMarcaAbarrote = new javax.swing.JTextField();
        lblUnidadMedida = new javax.swing.JLabel();
        cmbUnidadMedida = new javax.swing.JComboBox<>();
        btnGuardarAbarrote = new javax.swing.JButton();
        btnModificarAbarrote = new javax.swing.JButton();
        btnEliminarAbarrote = new javax.swing.JButton();
        btnBuscarAbarrote = new javax.swing.JButton();
        btnStockBajo = new javax.swing.JButton();
        btnVerVencidos = new javax.swing.JButton();
        btnLimpiarAbarrote = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAbarrotes = new javax.swing.JTable();
        panelVentas = new javax.swing.JPanel();
        lblTituloVentas = new javax.swing.JLabel();
        lblIdVentaTexto = new javax.swing.JLabel();
        lblIdVenta = new javax.swing.JLabel();
        lblFechaVenta = new javax.swing.JLabel();
        txtFechaVenta = new javax.swing.JTextField();
        lblDocumentoVenta = new javax.swing.JLabel();
        txtDocumentoClienteVenta = new javax.swing.JTextField();
        btnBuscarClienteVenta = new javax.swing.JButton();
        lblNombreClienteTexto = new javax.swing.JLabel();
        lblNombreClienteVenta = new javax.swing.JLabel();
        lblCodigoProductoVenta = new javax.swing.JLabel();
        txtCodigoProductoVenta = new javax.swing.JTextField();
        btnBuscarProductoVenta = new javax.swing.JButton();
        lblNombreProductoTexto = new javax.swing.JLabel();
        lblNombreProductoVenta = new javax.swing.JLabel();
        lblPrecioProductoTexto = new javax.swing.JLabel();
        lblPrecioProductoVenta = new javax.swing.JLabel();
        lblStockProductoTexto = new javax.swing.JLabel();
        lblStockProductoVenta = new javax.swing.JLabel();
        lblCantidadVenta = new javax.swing.JLabel();
        txtCantidadVenta = new javax.swing.JTextField();
        btnNuevaVenta = new javax.swing.JButton();
        btnAgregarProductoVenta = new javax.swing.JButton();
        btnQuitarProductoVenta = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblDetalleVenta = new javax.swing.JTable();
        lblTotalVentaTexto = new javax.swing.JLabel();
        lblTotalVenta = new javax.swing.JLabel();
        lblPagoCliente = new javax.swing.JLabel();
        txtPagoCliente = new javax.swing.JTextField();
        lblVueltoTexto = new javax.swing.JLabel();
        lblVuelto = new javax.swing.JLabel();
        btnCalcularTotal = new javax.swing.JButton();
        btnProcesarPago = new javax.swing.JButton();
        btnRegistrarVenta = new javax.swing.JButton();
        btnGenerarComprobante = new javax.swing.JButton();
        btnCancelarVenta = new javax.swing.JButton();

        lblTextoUsuarioActivo.setText("Usuario activo:");

        lblUsuarioActivo.setText("---");

        lblTextoRolUsuario.setText("Rol:");

        lblRolUsuario.setText("---");

        btnCerrarSesion.setText("Cerrar sesión");
        btnCerrarSesion.addActionListener(this::btnCerrarSesionActionPerformed);

        javax.swing.GroupLayout panelSuperiorLayout = new javax.swing.GroupLayout(panelSuperior);
        panelSuperior.setLayout(panelSuperiorLayout);
        panelSuperiorLayout.setHorizontalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuperiorLayout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblTextoUsuarioActivo)
                        .addComponent(btnCerrarSesion))
                    .addGroup(panelSuperiorLayout.createSequentialGroup()
                        .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRolUsuario)
                            .addComponent(lblTextoRolUsuario)
                            .addComponent(lblUsuarioActivo))
                        .addGap(70, 70, 70))))
        );
        panelSuperiorLayout.setVerticalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuperiorLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(lblTextoUsuarioActivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsuarioActivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTextoRolUsuario)
                .addGap(5, 5, 5)
                .addComponent(lblRolUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrarSesion)
                .addContainerGap())
        );

        lblTituloSistema.setText("Sistema Minimarket y Librería");

        lblTituloCaja.setText("Control de caja");

        lblMontoInicial.setText("Monto inicial:");

        txtMontoInicial.setText("Para ingresar el dinero inicial");

        lblMontoIngreso.setText("Monto ingreso:");

        btnAbrirCaja.setText("Abrir caja");

        txtMontoIngreso.setText("Para registrar ingreso manual");

        btnRegistrarIngreso.setText("Registrar ingreso");

        lblMontoEgreso.setText("Monto egreso:");

        txtMontoEgreso.setText("Para registrar salida de dinero");

        lblDescripcionMovimiento.setText("Descripción:");

        txtDescripcionMovimiento.setText("Motivo del egreso o ingreso");

        btnRegistrarEgreso.setText("Registrar egreso");

        lblTextoVentasEfectivo.setText("Ventas en efectivo:");

        lblVentasEfectivo.setText("0.00");

        lblTextoIngresos.setText("Ingresos:");

        jLabel1.setText("0.00");

        lblTextoEgresos.setText("Egresos:");

        lblEgresos.setText("0.00");

        lblTextoSaldoActual.setText("Saldo actual:");

        lblSaldoActual.setText("0.00");

        lblTextoCierreEsperado.setText("Cierre esperado:");

        lblCierreEsperado.setText("0.00");

        btnVerCaja.setText("Ver caja");

        btnCerrarCaja.setText("Cerrar caja");

        javax.swing.GroupLayout panelCajaLayout = new javax.swing.GroupLayout(panelCaja);
        panelCaja.setLayout(panelCajaLayout);
        panelCajaLayout.setHorizontalGroup(
            panelCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCajaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCajaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRegistrarEgreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAbrirCaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(21, 21, 21))
                    .addGroup(panelCajaLayout.createSequentialGroup()
                        .addGroup(panelCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTextoSaldoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTextoIngresos))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelCajaLayout.createSequentialGroup()
                        .addGroup(panelCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTituloCaja)
                            .addGroup(panelCajaLayout.createSequentialGroup()
                                .addComponent(lblMontoInicial)
                                .addGap(18, 18, 18)
                                .addComponent(txtMontoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCajaLayout.createSequentialGroup()
                                .addGroup(panelCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMontoEgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDescripcionMovimiento)
                                    .addComponent(lblTextoVentasEfectivo)
                                    .addComponent(lblTextoEgresos)
                                    .addComponent(lblMontoIngreso))
                                .addGroup(panelCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelCajaLayout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addGroup(panelCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDescripcionMovimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtMontoEgreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(panelCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtMontoIngreso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                                .addComponent(btnRegistrarIngreso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                    .addGroup(panelCajaLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(lblVentasEfectivo))
                                    .addGroup(panelCajaLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(lblEgresos))))
                            .addGroup(panelCajaLayout.createSequentialGroup()
                                .addComponent(lblTextoCierreEsperado, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(panelCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelCajaLayout.createSequentialGroup()
                                        .addComponent(btnVerCaja)
                                        .addGap(67, 67, 67)
                                        .addComponent(btnCerrarCaja))
                                    .addComponent(lblCierreEsperado)
                                    .addComponent(lblSaldoActual)
                                    .addComponent(jLabel1))))
                        .addContainerGap(159, Short.MAX_VALUE))))
        );
        panelCajaLayout.setVerticalGroup(
            panelCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCajaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloCaja)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMontoInicial)
                    .addComponent(txtMontoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(btnAbrirCaja)
                .addGap(21, 21, 21)
                .addGroup(panelCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMontoIngreso)
                    .addComponent(txtMontoIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistrarIngreso)
                .addGap(15, 15, 15)
                .addGroup(panelCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMontoEgreso)
                    .addComponent(txtMontoEgreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescripcionMovimiento)
                    .addComponent(txtDescripcionMovimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(btnRegistrarEgreso)
                .addGap(18, 18, 18)
                .addGroup(panelCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTextoVentasEfectivo)
                    .addComponent(lblVentasEfectivo))
                .addGap(18, 18, 18)
                .addGroup(panelCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTextoEgresos)
                    .addComponent(lblEgresos))
                .addGap(18, 18, 18)
                .addGroup(panelCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTextoCierreEsperado)
                    .addComponent(lblCierreEsperado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTextoIngresos)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addGroup(panelCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTextoSaldoActual)
                    .addComponent(lblSaldoActual))
                .addGap(28, 28, 28)
                .addGroup(panelCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCerrarCaja)
                    .addComponent(btnVerCaja))
                .addGap(38, 38, 38))
        );

        panelClientes.addTab("Caja", panelCaja);

        lblTituloClientes.setText("Gestión de clientes");

        lblIdCliente.setText("ID cliente:");

        txtIdCliente.setText("Para ingresar el ID");

        lblDocumentoCliente.setText("DNI/RUC:");

        txtDocumentoCliente.setText("Para ingresar DNI o RUC");

        lblNombresCliente.setText("Nombres:");

        txtNombresCliente.setText("Para ingresar nombres");

        lblTelefonoCliente.setText("Teléfono:");

        txtTelefonoCliente.setText("Para ingresar teléfono");

        lblDireccionCliente.setText("Dirección:");

        txtDireccionCliente.setText("Para ingresar dirección");

        btnGuardarCliente.setText("Guardar");

        btnModificarCliente.setText("Modificar");

        btnBuscarCliente.setText("Buscar");

        btnLimpiarCliente.setText("Limpiar");

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "DNI/RUC", "Nombres", "Teléfono", "Dirección"
            }
        ));
        scrollClientes.setViewportView(tblClientes);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDocumentoCliente)
                            .addComponent(lblNombresCliente)
                            .addComponent(lblTelefonoCliente)
                            .addComponent(lblDireccionCliente))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombresCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDocumentoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTituloClientes)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnGuardarCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnModificarCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscarCliente)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpiarCliente)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(scrollClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloClientes)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdCliente)
                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDocumentoCliente)
                    .addComponent(txtDocumentoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombresCliente)
                    .addComponent(txtNombresCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefonoCliente)
                    .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccionCliente)
                    .addComponent(txtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarCliente)
                    .addComponent(btnModificarCliente)
                    .addComponent(btnBuscarCliente)
                    .addComponent(btnLimpiarCliente))
                .addGap(3, 3, 3)
                .addComponent(scrollClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        panelClientes.addTab("Clientes", jPanel3);

        tblLibreria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Categoría", "Precio", "Stock", "Tipo artículo", "Marca", "Campaña"
            }
        ));
        jScrollPane3.setViewportView(tblLibreria);

        lblTituloLibreria.setText("Gestión de productos de librería");

        lblCodigoLibreria.setText("Código:");

        txtCodigoLibreria.setText("Para ingresar el código del artículo");

        lblNombreLibreria.setText("Nombre:");

        txtNombreLibreria.setText("Para ingresar el nombre del artículo");

        lblCategoriaLibreria.setText("Categoría:");

        txtCategoriaLibreria.setText("Para ingresar la categoría");

        lblPrecioLibreria.setText("Precio:");

        txtPrecioLibreria.setText("Para ingresar el precio");

        lblStockLibreria.setText("Stock:");

        txtStockLibreria.setText("Para ingresar el stock");

        lblTipoArticulo.setText("Tipo de artículo:");

        cmbTipoArticulo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cuaderno", "Lapicero", "Lápiz", "Colores", "Folder", "Hojas", "Cartulina", "Mochila", "Otro" }));

        lblMarcaLibreria.setText("Marca:");

        txtMarcaLibreria.setText("Para ingresar la marca");

        chkCampaniaEscolar.setText("Campaña escolar");

        btnGuardarLibreria.setText("Guardar");
        btnGuardarLibreria.addActionListener(this::btnGuardarLibreriaActionPerformed);

        btnModificarLibreria.setText("Modificar");

        btnEliminarLibreria.setText("Eliminar");

        btnBuscarLibreria.setText("Buscar");

        btnFiltrarTipo.setText("Filtrar tipo");

        btnLimpiarLibreria.setText("Limpiar");

        javax.swing.GroupLayout panelLibreriaLayout = new javax.swing.GroupLayout(panelLibreria);
        panelLibreria.setLayout(panelLibreriaLayout);
        panelLibreriaLayout.setHorizontalGroup(
            panelLibreriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLibreriaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLibreriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTituloLibreria)
                    .addGroup(panelLibreriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLibreriaLayout.createSequentialGroup()
                            .addGroup(panelLibreriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLibreriaLayout.createSequentialGroup()
                                    .addComponent(chkCampaniaEscolar)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtCampaniaEscolar))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLibreriaLayout.createSequentialGroup()
                                    .addComponent(lblMarcaLibreria)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtMarcaLibreria, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLibreriaLayout.createSequentialGroup()
                                    .addComponent(lblTipoArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cmbTipoArticulo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLibreriaLayout.createSequentialGroup()
                                    .addComponent(lblCodigoLibreria, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCodigoLibreria, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLibreriaLayout.createSequentialGroup()
                                    .addGroup(panelLibreriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblNombreLibreria)
                                        .addComponent(lblCategoriaLibreria, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblPrecioLibreria)
                                        .addComponent(lblStockLibreria))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panelLibreriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNombreLibreria)
                                        .addComponent(txtCategoriaLibreria)
                                        .addComponent(txtPrecioLibreria)
                                        .addComponent(txtStockLibreria))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGuardarLibreria))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLibreriaLayout.createSequentialGroup()
                            .addComponent(btnLimpiarLibreria)
                            .addGap(18, 18, 18)
                            .addComponent(btnModificarLibreria)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnEliminarLibreria)
                            .addGap(18, 18, 18)
                            .addComponent(btnBuscarLibreria)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnFiltrarTipo))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLibreriaLayout.setVerticalGroup(
            panelLibreriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLibreriaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloLibreria)
                .addGap(18, 18, 18)
                .addGroup(panelLibreriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoLibreria)
                    .addComponent(txtCodigoLibreria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLibreriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreLibreria)
                    .addComponent(txtNombreLibreria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLibreriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategoriaLibreria)
                    .addComponent(txtCategoriaLibreria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLibreriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPrecioLibreria)
                    .addComponent(txtPrecioLibreria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLibreriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStockLibreria)
                    .addComponent(txtStockLibreria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLibreriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTipoArticulo)
                    .addComponent(cmbTipoArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLibreriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMarcaLibreria)
                    .addComponent(txtMarcaLibreria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLibreriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkCampaniaEscolar)
                    .addComponent(txtCampaniaEscolar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarLibreria))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLibreriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificarLibreria)
                    .addComponent(btnEliminarLibreria)
                    .addComponent(btnBuscarLibreria)
                    .addComponent(btnFiltrarTipo)
                    .addComponent(btnLimpiarLibreria))
                .addGap(34, 34, 34))
        );

        panelClientes.addTab("Librería", panelLibreria);

        javax.swing.GroupLayout panelReportesLayout = new javax.swing.GroupLayout(panelReportes);
        panelReportes.setLayout(panelReportesLayout);
        panelReportesLayout.setHorizontalGroup(
            panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
        );
        panelReportesLayout.setVerticalGroup(
            panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        panelClientes.addTab("Reportes", panelReportes);

        lblTituloUsuarios.setText("Gestión de usuarios");

        lblIdUsuario.setText("ID usuario:");

        txtIdUsuario.addActionListener(this::txtIdUsuarioActionPerformed);

        lblNombresUsuario.setText("Nombres:");

        txtNombresUsuario.addActionListener(this::txtNombresUsuarioActionPerformed);

        lblUsuarioRegistro.setText("Usuario:");

        lblContraseniaUsuario.setText("Contraseña:");

        lblRolUsuarioRegistro.setText("Rol:");

        cmbRolUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Cajero" }));
        cmbRolUsuario.addActionListener(this::cmbRolUsuarioActionPerformed);

        btnGuardarUsuario.setText("Guardar");
        btnGuardarUsuario.addActionListener(this::btnGuardarUsuarioActionPerformed);

        btnModificarUsuario.setText("Modificar");
        btnModificarUsuario.addActionListener(this::btnModificarUsuarioActionPerformed);

        btnDarBajaUsuario.setText("Dar de baja");
        btnDarBajaUsuario.addActionListener(this::btnDarBajaUsuarioActionPerformed);

        btnBuscarUsuario.setText("Buscar");
        btnBuscarUsuario.addActionListener(this::btnBuscarUsuarioActionPerformed);

        btnLimpiarUsuario.setText("Limpiar");
        btnLimpiarUsuario.addActionListener(this::btnLimpiarUsuarioActionPerformed);

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombres", "Usuario", "Rol", "Estado"
            }
        ));
        jScrollPane1.setViewportView(tblUsuarios);

        javax.swing.GroupLayout panelUsuariosLayout = new javax.swing.GroupLayout(panelUsuarios);
        panelUsuarios.setLayout(panelUsuariosLayout);
        panelUsuariosLayout.setHorizontalGroup(
            panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelUsuariosLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblIdUsuario)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelUsuariosLayout.createSequentialGroup()
                        .addGroup(panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTituloUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelUsuariosLayout.createSequentialGroup()
                                .addGroup(panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombresUsuario)
                                    .addComponent(lblUsuarioRegistro)
                                    .addComponent(lblRolUsuarioRegistro)
                                    .addComponent(lblContraseniaUsuario))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbRolUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIdUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                    .addComponent(txtNombresUsuario, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtUsuarioRegistro)
                                    .addComponent(txtContraseniaUsuario)))
                            .addGroup(panelUsuariosLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelUsuariosLayout.createSequentialGroup()
                                        .addComponent(btnLimpiarUsuario)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnModificarUsuario)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnGuardarUsuario)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnBuscarUsuario)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnDarBajaUsuario)))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelUsuariosLayout.setVerticalGroup(
            panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloUsuarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdUsuario)
                    .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombresUsuario)
                    .addComponent(txtNombresUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsuarioRegistro)
                    .addComponent(txtUsuarioRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblContraseniaUsuario)
                    .addComponent(txtContraseniaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRolUsuarioRegistro)
                    .addComponent(cmbRolUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificarUsuario)
                    .addComponent(btnBuscarUsuario)
                    .addComponent(btnDarBajaUsuario)
                    .addComponent(btnLimpiarUsuario)
                    .addComponent(btnGuardarUsuario))
                .addGap(33, 33, 33))
        );

        panelClientes.addTab("Usuarios", panelUsuarios);

        lblTituloMinimarket.setText("Gestión de productos de minimarket");

        lblCodigoAbarrote.setText("Código:");

        txtCodigoAbarrote.setText("Para ingresar el código del producto");

        lblNombreAbarrote.setText("Nombre:");

        txtNombreAbarrote.setText("Para ingresar el nombre del producto");

        lblCategoriaAbarrote.setText("Categoría:");

        txtCategoriaAbarrote.setText("Para ingresar la categoría");

        lblPrecioAbarrote.setText("Precio:");

        txtPrecioAbarrote.setText("Para ingresar el precio");

        lblStockAbarrote.setText("Stock:");

        txtStockAbarrote.setText("Para ingresar el stock");

        lblFechaVencimiento.setText("Fecha vencimiento:");

        txtFechaVencimiento.setText("Para ingresar la fecha de vencimiento");

        lblMarcaAbarrote.setText("Marca:");

        txtMarcaAbarrote.setText("Para ingresar la marca");

        lblUnidadMedida.setText("Unidad medida:");

        cmbUnidadMedida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unidad", "Kg", "Litro", "Caja", "Paquete" }));

        btnGuardarAbarrote.setText("Guardar");
        btnGuardarAbarrote.addActionListener(this::btnGuardarAbarroteActionPerformed);

        btnModificarAbarrote.setText("Modificar");
        btnModificarAbarrote.addActionListener(this::btnModificarAbarroteActionPerformed);

        btnEliminarAbarrote.setText("Eliminar");
        btnEliminarAbarrote.addActionListener(this::btnEliminarAbarroteActionPerformed);

        btnBuscarAbarrote.setText("Buscar");
        btnBuscarAbarrote.addActionListener(this::btnBuscarAbarroteActionPerformed);

        btnStockBajo.setText("Stock bajo");
        btnStockBajo.addActionListener(this::btnStockBajoActionPerformed);

        btnVerVencidos.setText("Ver vencidos");
        btnVerVencidos.addActionListener(this::btnVerVencidosActionPerformed);

        btnLimpiarAbarrote.setText("Limpiar");

        tblAbarrotes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código ", "Nombre", "Categoría", "Precio", "Stock", "Fecha vencimiento", "Marca", "Unidad"
            }
        ));
        jScrollPane2.setViewportView(tblAbarrotes);

        javax.swing.GroupLayout panelMinimarketLayout = new javax.swing.GroupLayout(panelMinimarket);
        panelMinimarket.setLayout(panelMinimarketLayout);
        panelMinimarketLayout.setHorizontalGroup(
            panelMinimarketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMinimarketLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMinimarketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMinimarketLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(panelMinimarketLayout.createSequentialGroup()
                        .addGroup(panelMinimarketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTituloMinimarket, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelMinimarketLayout.createSequentialGroup()
                                .addGroup(panelMinimarketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelMinimarketLayout.createSequentialGroup()
                                        .addGroup(panelMinimarketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblCategoriaAbarrote, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblPrecioAbarrote, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblStockAbarrote, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblMarcaAbarrote, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblUnidadMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblCodigoAbarrote, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(lblFechaVencimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblNombreAbarrote, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelMinimarketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFechaVencimiento, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtCodigoAbarrote)
                                    .addComponent(txtNombreAbarrote)
                                    .addComponent(txtCategoriaAbarrote)
                                    .addComponent(txtPrecioAbarrote)
                                    .addComponent(txtStockAbarrote)
                                    .addComponent(txtMarcaAbarrote)
                                    .addComponent(cmbUnidadMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelMinimarketLayout.createSequentialGroup()
                        .addGroup(panelMinimarketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMinimarketLayout.createSequentialGroup()
                                .addComponent(btnGuardarAbarrote)
                                .addGap(18, 18, 18)
                                .addComponent(btnModificarAbarrote)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminarAbarrote)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarAbarrote)
                                .addGap(18, 18, 18)
                                .addComponent(btnStockBajo))
                            .addGroup(panelMinimarketLayout.createSequentialGroup()
                                .addComponent(btnVerVencidos)
                                .addGap(44, 44, 44)
                                .addComponent(btnLimpiarAbarrote)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelMinimarketLayout.setVerticalGroup(
            panelMinimarketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMinimarketLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblTituloMinimarket)
                .addGap(18, 18, 18)
                .addGroup(panelMinimarketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblUnidadMedida)
                    .addGroup(panelMinimarketLayout.createSequentialGroup()
                        .addGroup(panelMinimarketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigoAbarrote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCodigoAbarrote))
                        .addGap(18, 18, 18)
                        .addGroup(panelMinimarketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreAbarrote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombreAbarrote))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelMinimarketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCategoriaAbarrote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCategoriaAbarrote))
                        .addGap(24, 24, 24)
                        .addGroup(panelMinimarketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecioAbarrote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPrecioAbarrote))
                        .addGap(18, 18, 18)
                        .addGroup(panelMinimarketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStockAbarrote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblStockAbarrote))
                        .addGap(18, 18, 18)
                        .addGroup(panelMinimarketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFechaVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFechaVencimiento))
                        .addGap(18, 18, 18)
                        .addGroup(panelMinimarketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMarcaAbarrote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMarcaAbarrote))
                        .addGap(18, 18, 18)
                        .addComponent(cmbUnidadMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(panelMinimarketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarAbarrote)
                    .addComponent(btnModificarAbarrote)
                    .addComponent(btnEliminarAbarrote)
                    .addComponent(btnBuscarAbarrote)
                    .addComponent(btnStockBajo))
                .addGap(18, 18, 18)
                .addGroup(panelMinimarketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVerVencidos)
                    .addComponent(btnLimpiarAbarrote))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelClientes.addTab("Minimarket", panelMinimarket);

        lblTituloVentas.setText("Registro de ventas");

        lblIdVentaTexto.setText("Venta N°:");

        lblIdVenta.setText("---");

        lblFechaVenta.setText("Fecha:");

        txtFechaVenta.setText("Para ingresar la fecha");

        lblDocumentoVenta.setText("DNI/RUC cliente:");

        txtDocumentoClienteVenta.setText("Documento del cliente");

        btnBuscarClienteVenta.setText("Buscar cliente");

        lblNombreClienteTexto.setText("Cliente:");

        lblNombreClienteVenta.setText("---");

        lblCodigoProductoVenta.setText("Código producto:");

        txtCodigoProductoVenta.setText("Código del producto");

        btnBuscarProductoVenta.setText("Buscar producto");

        lblNombreProductoTexto.setText("Producto:");

        lblNombreProductoVenta.setText("---");

        lblPrecioProductoTexto.setText("Precio:");

        lblPrecioProductoVenta.setText("0.00");

        lblStockProductoTexto.setText("Stock:");

        lblStockProductoVenta.setText("0");

        lblCantidadVenta.setText("Cantidad:");

        txtCantidadVenta.setText("Cantidad a vender");

        btnNuevaVenta.setText("Nueva venta");

        btnAgregarProductoVenta.setText("Agregar producto");

        btnQuitarProductoVenta.setText("Quitar producto");

        tblDetalleVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código ", "Producto", "Sección", "Cantidad", "Precio", "Subtotal"
            }
        ));
        jScrollPane5.setViewportView(tblDetalleVenta);

        lblTotalVentaTexto.setText("Total:");

        lblTotalVenta.setText("0.00");

        lblPagoCliente.setText("Pago cliente:");

        txtPagoCliente.setText("Dinero recibido");

        lblVueltoTexto.setText("Vuelto:");

        lblVuelto.setText("0.00");

        btnCalcularTotal.setText("Calcular total");

        btnProcesarPago.setText("Procesar pago");

        btnRegistrarVenta.setText("Registrar venta");

        btnGenerarComprobante.setText("Generar comprobante");

        btnCancelarVenta.setText("Cancelar");

        javax.swing.GroupLayout panelVentasLayout = new javax.swing.GroupLayout(panelVentas);
        panelVentas.setLayout(panelVentasLayout);
        panelVentasLayout.setHorizontalGroup(
            panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVentasLayout.createSequentialGroup()
                .addGroup(panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(panelVentasLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelVentasLayout.createSequentialGroup()
                                    .addComponent(lblNombreClienteTexto)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblNombreClienteVenta))
                                .addGroup(panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelVentasLayout.createSequentialGroup()
                                        .addComponent(lblCodigoProductoVenta)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCodigoProductoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(107, 107, 107)
                                        .addComponent(btnBuscarProductoVenta))
                                    .addGroup(panelVentasLayout.createSequentialGroup()
                                        .addGroup(panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblTituloVentas)
                                            .addGroup(panelVentasLayout.createSequentialGroup()
                                                .addComponent(lblIdVentaTexto)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblIdVenta))
                                            .addGroup(panelVentasLayout.createSequentialGroup()
                                                .addGroup(panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lblDocumentoVenta)
                                                    .addComponent(lblFechaVenta))
                                                .addGap(18, 18, 18)
                                                .addGroup(panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtFechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtDocumentoClienteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(103, 103, 103)
                                        .addComponent(btnBuscarClienteVenta)))
                                .addGroup(panelVentasLayout.createSequentialGroup()
                                    .addComponent(lblNombreProductoTexto)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblNombreProductoVenta))
                                .addGroup(panelVentasLayout.createSequentialGroup()
                                    .addGroup(panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelVentasLayout.createSequentialGroup()
                                            .addComponent(lblPrecioProductoTexto)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblPrecioProductoVenta))
                                        .addGroup(panelVentasLayout.createSequentialGroup()
                                            .addComponent(lblStockProductoTexto)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblStockProductoVenta)))
                                    .addGap(101, 101, 101)
                                    .addComponent(lblCantidadVenta)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCantidadVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panelVentasLayout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(btnNuevaVenta)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAgregarProductoVenta)
                            .addGap(50, 50, 50)
                            .addComponent(btnQuitarProductoVenta)))
                    .addGroup(panelVentasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelVentasLayout.createSequentialGroup()
                                .addComponent(lblTotalVentaTexto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTotalVenta)
                                .addGap(54, 54, 54)
                                .addComponent(lblPagoCliente)
                                .addGap(18, 18, 18)
                                .addComponent(txtPagoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelVentasLayout.createSequentialGroup()
                                .addGroup(panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnCalcularTotal)
                                    .addGroup(panelVentasLayout.createSequentialGroup()
                                        .addComponent(lblVueltoTexto)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblVuelto)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnProcesarPago)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRegistrarVenta))
                            .addGroup(panelVentasLayout.createSequentialGroup()
                                .addComponent(btnGenerarComprobante)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelarVenta)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelVentasLayout.setVerticalGroup(
            panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVentasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloVentas)
                .addGap(18, 18, 18)
                .addGroup(panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdVentaTexto)
                    .addComponent(lblIdVenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaVenta)
                    .addComponent(txtFechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarClienteVenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDocumentoVenta)
                    .addComponent(txtDocumentoClienteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreClienteTexto)
                    .addComponent(lblNombreClienteVenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoProductoVenta)
                    .addComponent(txtCodigoProductoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarProductoVenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreProductoTexto)
                    .addComponent(lblNombreProductoVenta))
                .addGroup(panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelVentasLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblStockProductoTexto)
                            .addComponent(lblStockProductoVenta))
                        .addGap(1, 1, 1)
                        .addGroup(panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrecioProductoTexto)
                            .addComponent(lblPrecioProductoVenta)))
                    .addGroup(panelVentasLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCantidadVenta)
                            .addComponent(txtCantidadVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevaVenta)
                    .addComponent(btnAgregarProductoVenta)
                    .addComponent(btnQuitarProductoVenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalVentaTexto)
                    .addComponent(lblTotalVenta)
                    .addComponent(lblPagoCliente)
                    .addComponent(txtPagoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVueltoTexto)
                    .addComponent(lblVuelto))
                .addGap(18, 18, 18)
                .addGroup(panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcularTotal)
                    .addComponent(btnProcesarPago)
                    .addComponent(btnRegistrarVenta))
                .addGap(18, 18, 18)
                .addGroup(panelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenerarComprobante)
                    .addComponent(btnCancelarVenta))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelClientes.addTab("Ventas", panelVentas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTituloSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(panelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 264, Short.MAX_VALUE)
                        .addComponent(panelClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTituloSistema)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panelClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 595, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdUsuarioActionPerformed

    private void txtNombresUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresUsuarioActionPerformed

    private void cmbRolUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRolUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbRolUsuarioActionPerformed

    private void btnGuardarAbarroteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarAbarroteActionPerformed
String codigo = txtCodigoAbarrote.getText().trim();
String nombre = txtNombreAbarrote.getText().trim();
String categoria = txtCategoriaAbarrote.getText().trim();
String precioTexto = txtPrecioAbarrote.getText().trim();
String stockTexto = txtStockAbarrote.getText().trim();
String fechaVencimiento = txtFechaVencimiento.getText().trim();
String marca = txtMarcaAbarrote.getText().trim();
String unidadMedida = cmbUnidadMedida.getSelectedItem().toString();

if (codigo.isEmpty() || nombre.isEmpty() || categoria.isEmpty()
        || precioTexto.isEmpty() || stockTexto.isEmpty()
        || fechaVencimiento.isEmpty() || marca.isEmpty()) {

    javax.swing.JOptionPane.showMessageDialog(this,
            "Complete los datos del producto de minimarket.");
    return;
}

try {

    double precio = Double.parseDouble(precioTexto);
    int stock = Integer.parseInt(stockTexto);

    if (precio <= 0 || stock < 0) {
        javax.swing.JOptionPane.showMessageDialog(this,
                "El precio debe ser mayor a 0 y el stock no puede ser negativo.");
        return;
    }

    try {
        java.time.LocalDate.parse(fechaVencimiento);
    } catch (java.time.format.DateTimeParseException e) {
        javax.swing.JOptionPane.showMessageDialog(this,
                "La fecha debe tener este formato: 2026-06-05");
        return;
    }

    ProductoAbarrote producto = new ProductoAbarrote(
            codigo,
            nombre,
            categoria,
            precio,
            stock,
            fechaVencimiento,
            marca,
            unidadMedida
    );

    boolean registrado = SistemaDatos.productoControlador.agregarProducto(producto);

    if (registrado) {
        javax.swing.JOptionPane.showMessageDialog(this,
                "Producto de minimarket registrado correctamente.");

        actualizarTablaAbarrotes();
        limpiarCamposAbarrote();
        SistemaDatos.guardarDatos();

    } else {
        javax.swing.JOptionPane.showMessageDialog(this,
                "Ya existe un producto con ese código.");
    }

} catch (NumberFormatException e) {

    javax.swing.JOptionPane.showMessageDialog(this,
            "Ingrese precio y stock con valores numéricos.");
}        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarAbarroteActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
int opcion = javax.swing.JOptionPane.showConfirmDialog(this,
        "¿Desea cerrar sesión?",
        "Cerrar sesión",
        javax.swing.JOptionPane.YES_NO_OPTION);

if (opcion == javax.swing.JOptionPane.YES_OPTION) {

    SistemaDatos.guardarDatos();
    SistemaDatos.cerrarSesion();

    javax.swing.JFrame ventanaLogin = new javax.swing.JFrame("Sistema Minimarket y Librería");

    ventanaLogin.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    ventanaLogin.setContentPane(new FrmLogin());
    ventanaLogin.pack();
    ventanaLogin.setLocationRelativeTo(null);
    ventanaLogin.setVisible(true);

    java.awt.Window ventanaActual = javax.swing.SwingUtilities.getWindowAncestor(this);

    if (ventanaActual != null) {
        ventanaActual.dispose();
    }
}        // TODO add your handling code here:
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnGuardarLibreriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarLibreriaActionPerformed
String codigo = txtCodigoLibreria.getText().trim();
String nombre = txtNombreLibreria.getText().trim();
String categoria = txtCategoriaLibreria.getText().trim();
String precioTexto = txtPrecioLibreria.getText().trim();
String stockTexto = txtStockLibreria.getText().trim();
String tipoArticulo = cmbTipoArticulo.getSelectedItem().toString();
String marca = txtMarcaLibreria.getText().trim();
String campania = txtCampaniaEscolar.getText().trim();

if (codigo.isEmpty() || nombre.isEmpty() || categoria.isEmpty()
        || precioTexto.isEmpty() || stockTexto.isEmpty() || marca.isEmpty()) {

    javax.swing.JOptionPane.showMessageDialog(this,
            "Complete los datos del producto de librería.");
    return;
}

try {

    double precio = Double.parseDouble(precioTexto);
    int stock = Integer.parseInt(stockTexto);

    if (precio <= 0 || stock < 0) {
        javax.swing.JOptionPane.showMessageDialog(this,
                "El precio debe ser mayor a 0 y el stock no puede ser negativo.");
        return;
    }

    if (chkCampaniaEscolar.isSelected() && campania.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this,
                "Ingrese el nombre de la campaña escolar.");
        return;
    }

    if (!chkCampaniaEscolar.isSelected()) {
        campania = "";
    }

    ProductoLibreria producto = new ProductoLibreria(
            codigo,
            nombre,
            categoria,
            precio,
            stock,
            tipoArticulo,
            marca,
            campania
    );

    boolean registrado = SistemaDatos.productoControlador.agregarProducto(producto);

    if (registrado) {
        javax.swing.JOptionPane.showMessageDialog(this,
                "Producto de librería registrado correctamente.");

        actualizarTablaLibreria();
        limpiarCamposLibreria();
        SistemaDatos.guardarDatos();

    } else {
        javax.swing.JOptionPane.showMessageDialog(this,
                "Ya existe un producto con ese código.");
    }

} catch (NumberFormatException e) {

    javax.swing.JOptionPane.showMessageDialog(this,
            "Ingrese precio y stock con valores numéricos.");
}        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarLibreriaActionPerformed

    private void btnBuscarAbarroteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAbarroteActionPerformed
String codigo = txtCodigoAbarrote.getText().trim();

if (codigo.isEmpty()) {
    javax.swing.JOptionPane.showMessageDialog(this,
            "Ingrese el código del producto.");
    return;
}

Producto producto = SistemaDatos.productoControlador.buscarPorCodigo(codigo);

if (producto == null) {
    javax.swing.JOptionPane.showMessageDialog(this,
            "No se encontró un producto con ese código.");
    return;
}

if (!(producto instanceof ProductoAbarrote)) {
    javax.swing.JOptionPane.showMessageDialog(this,
            "El código pertenece a un producto de Librería, no de Minimarket.");
    return;
}

ProductoAbarrote abarrote = (ProductoAbarrote) producto;

cargarAbarroteEnFormulario(abarrote);        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarAbarroteActionPerformed

    private void btnModificarAbarroteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarAbarroteActionPerformed
String codigo = txtCodigoAbarrote.getText().trim();
String nombre = txtNombreAbarrote.getText().trim();
String categoria = txtCategoriaAbarrote.getText().trim();
String precioTexto = txtPrecioAbarrote.getText().trim();
String stockTexto = txtStockAbarrote.getText().trim();
String fechaVencimiento = txtFechaVencimiento.getText().trim();
String marca = txtMarcaAbarrote.getText().trim();
String unidadMedida = cmbUnidadMedida.getSelectedItem().toString();

if (codigo.isEmpty() || nombre.isEmpty() || categoria.isEmpty()
        || precioTexto.isEmpty() || stockTexto.isEmpty()
        || fechaVencimiento.isEmpty() || marca.isEmpty()) {

    javax.swing.JOptionPane.showMessageDialog(this,
            "Complete los datos antes de modificar.");
    return;
}

Producto productoExistente = SistemaDatos.productoControlador.buscarPorCodigo(codigo);

if (productoExistente == null) {
    javax.swing.JOptionPane.showMessageDialog(this,
            "No se encontró el producto para modificar.");
    return;
}

if (!(productoExistente instanceof ProductoAbarrote)) {
    javax.swing.JOptionPane.showMessageDialog(this,
            "Ese código pertenece a Librería, no puede modificarse aquí.");
    return;
}

try {

    double precio = Double.parseDouble(precioTexto);
    int stock = Integer.parseInt(stockTexto);

    if (precio <= 0 || stock < 0) {
        javax.swing.JOptionPane.showMessageDialog(this,
                "El precio debe ser mayor a 0 y el stock no puede ser negativo.");
        return;
    }

    try {
        java.time.LocalDate.parse(fechaVencimiento);
    } catch (java.time.format.DateTimeParseException e) {
        javax.swing.JOptionPane.showMessageDialog(this,
                "La fecha debe tener este formato: 2026-06-05");
        return;
    }

    ProductoAbarrote productoActualizado = new ProductoAbarrote(
            codigo,
            nombre,
            categoria,
            precio,
            stock,
            fechaVencimiento,
            marca,
            unidadMedida
    );

    boolean modificado = SistemaDatos.productoControlador.modificarProducto(
            codigo,
            productoActualizado
    );

    if (modificado) {
        javax.swing.JOptionPane.showMessageDialog(this,
                "Producto modificado correctamente.");

        actualizarTablaAbarrotes();
        limpiarCamposAbarrote();
        SistemaDatos.guardarDatos();
    }

} catch (NumberFormatException e) {

    javax.swing.JOptionPane.showMessageDialog(this,
            "Ingrese precio y stock con valores numéricos.");
}        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarAbarroteActionPerformed

    private void btnEliminarAbarroteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAbarroteActionPerformed
String codigo = txtCodigoAbarrote.getText().trim();

if (codigo.isEmpty()) {
    javax.swing.JOptionPane.showMessageDialog(this,
            "Ingrese el código del producto a eliminar.");
    return;
}

Producto producto = SistemaDatos.productoControlador.buscarPorCodigo(codigo);

if (producto == null) {
    javax.swing.JOptionPane.showMessageDialog(this,
            "No se encontró el producto.");
    return;
}

if (!(producto instanceof ProductoAbarrote)) {
    javax.swing.JOptionPane.showMessageDialog(this,
            "Este producto no pertenece a Minimarket.");
    return;
}

int opcion = javax.swing.JOptionPane.showConfirmDialog(this,
        "¿Desea eliminar este producto?",
        "Confirmar eliminación",
        javax.swing.JOptionPane.YES_NO_OPTION);

if (opcion == javax.swing.JOptionPane.YES_OPTION) {

    boolean eliminado = SistemaDatos.productoControlador.eliminarProducto(codigo);

    if (eliminado) {
        javax.swing.JOptionPane.showMessageDialog(this,
                "Producto eliminado correctamente.");

        actualizarTablaAbarrotes();
        limpiarCamposAbarrote();
        SistemaDatos.guardarDatos();
    }
}        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarAbarroteActionPerformed

    private void btnStockBajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStockBajoActionPerformed
javax.swing.table.DefaultTableModel modelo =
        (javax.swing.table.DefaultTableModel) tblAbarrotes.getModel();

modelo.setRowCount(0);

for (Producto p : SistemaDatos.productoControlador.obtenerStockBajo()) {

    if (p instanceof ProductoAbarrote) {

        ProductoAbarrote a = (ProductoAbarrote) p;

        modelo.addRow(new Object[]{
            a.getCodigo(),
            a.getNombre(),
            a.getCategoria(),
            a.getPrecio(),
            a.getStock(),
            a.getFechaVencimiento(),
            a.getMarca(),
            a.getUnidadMedida()
        });
    }
}        // TODO add your handling code here:
    }//GEN-LAST:event_btnStockBajoActionPerformed

    private void btnVerVencidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerVencidosActionPerformed
javax.swing.table.DefaultTableModel modelo =
        (javax.swing.table.DefaultTableModel) tblAbarrotes.getModel();

modelo.setRowCount(0);

for (ProductoAbarrote a : SistemaDatos.productoControlador.obtenerProductosVencidos()) {

    modelo.addRow(new Object[]{
        a.getCodigo(),
        a.getNombre(),
        a.getCategoria(),
        a.getPrecio(),
        a.getStock(),
        a.getFechaVencimiento(),
        a.getMarca(),
        a.getUnidadMedida()
    });
}        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerVencidosActionPerformed

    private void btnGuardarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarUsuarioActionPerformed
String id = txtIdUsuario.getText().trim();
String nombres = txtNombresUsuario.getText().trim();
String usuario = txtUsuarioRegistro.getText().trim();
String contrasenia = txtContraseniaUsuario.getText().trim();
String rol = cmbRolUsuario.getSelectedItem().toString();

if (id.isEmpty() || nombres.isEmpty() || usuario.isEmpty() || contrasenia.isEmpty()) {
    javax.swing.JOptionPane.showMessageDialog(this,
            "Complete todos los datos del usuario.");
    return;
}

if (!rol.equalsIgnoreCase("Administrador") && !rol.equalsIgnoreCase("Cajero")) {
    javax.swing.JOptionPane.showMessageDialog(this,
            "El rol solo puede ser Administrador o Cajero.");
    return;
}

Usuario nuevoUsuario = new Usuario(id, nombres, usuario, contrasenia, rol);

boolean registrado = SistemaDatos.usuarioControlador.agregarUsuario(nuevoUsuario);

if (registrado) {
    javax.swing.JOptionPane.showMessageDialog(this,
            "Usuario registrado correctamente.");

    actualizarTablaUsuarios();
    limpiarCamposUsuario();
    SistemaDatos.guardarDatos();

} else {
    javax.swing.JOptionPane.showMessageDialog(this,
            "Ya existe un usuario con ese ID o nombre de usuario.");
}        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarUsuarioActionPerformed

    private void btnBuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarUsuarioActionPerformed
String id = txtIdUsuario.getText().trim();
String usuarioTexto = txtUsuarioRegistro.getText().trim();

Usuario usuarioEncontrado = null;

if (!id.isEmpty()) {
    usuarioEncontrado = SistemaDatos.usuarioControlador.buscarPorId(id);
} else if (!usuarioTexto.isEmpty()) {
    usuarioEncontrado = SistemaDatos.usuarioControlador.buscarPorUsuario(usuarioTexto);
} else {
    javax.swing.JOptionPane.showMessageDialog(this,
            "Ingrese el ID o el usuario a buscar.");
    return;
}

if (usuarioEncontrado == null) {
    javax.swing.JOptionPane.showMessageDialog(this,
            "No se encontró el usuario.");
    return;
}

cargarUsuarioEnFormulario(usuarioEncontrado);        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarUsuarioActionPerformed

    private void btnModificarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarUsuarioActionPerformed
String id = txtIdUsuario.getText().trim();
String nombres = txtNombresUsuario.getText().trim();
String usuario = txtUsuarioRegistro.getText().trim();
String contrasenia = txtContraseniaUsuario.getText().trim();
String rol = cmbRolUsuario.getSelectedItem().toString();

if (id.isEmpty() || nombres.isEmpty() || usuario.isEmpty() || contrasenia.isEmpty()) {
    javax.swing.JOptionPane.showMessageDialog(this,
            "Complete todos los datos antes de modificar.");
    return;
}

Usuario existente = SistemaDatos.usuarioControlador.buscarPorId(id);

if (existente == null) {
    javax.swing.JOptionPane.showMessageDialog(this,
            "No se encontró el usuario para modificar.");
    return;
}

Usuario usuarioRepetido = SistemaDatos.usuarioControlador.buscarPorUsuario(usuario);

if (usuarioRepetido != null && !usuarioRepetido.getIdUsuario().equalsIgnoreCase(id)) {
    javax.swing.JOptionPane.showMessageDialog(this,
            "Ese nombre de usuario ya está siendo usado.");
    return;
}

boolean modificado = SistemaDatos.usuarioControlador.modificarUsuario(
        id,
        nombres,
        usuario,
        contrasenia,
        rol
);

if (modificado) {
    javax.swing.JOptionPane.showMessageDialog(this,
            "Usuario modificado correctamente.");

    actualizarTablaUsuarios();
    limpiarCamposUsuario();
    SistemaDatos.guardarDatos();
}        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarUsuarioActionPerformed

    private void btnDarBajaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDarBajaUsuarioActionPerformed
String id = txtIdUsuario.getText().trim();

if (id.isEmpty()) {
    javax.swing.JOptionPane.showMessageDialog(this,
            "Ingrese el ID del usuario.");
    return;
}

Usuario usuarioEncontrado = SistemaDatos.usuarioControlador.buscarPorId(id);

if (usuarioEncontrado == null) {
    javax.swing.JOptionPane.showMessageDialog(this,
            "No se encontró el usuario.");
    return;
}

if (SistemaDatos.usuarioActivo != null
        && SistemaDatos.usuarioActivo.getIdUsuario().equalsIgnoreCase(id)) {

    javax.swing.JOptionPane.showMessageDialog(this,
            "No puedes dar de baja al usuario que está usando el sistema.");
    return;
}

int opcion = javax.swing.JOptionPane.showConfirmDialog(this,
        "¿Desea dar de baja a este usuario?",
        "Confirmar baja",
        javax.swing.JOptionPane.YES_NO_OPTION);

if (opcion == javax.swing.JOptionPane.YES_OPTION) {

    boolean dadoDeBaja = SistemaDatos.usuarioControlador.darBajaUsuario(id);

    if (dadoDeBaja) {
        javax.swing.JOptionPane.showMessageDialog(this,
                "Usuario dado de baja correctamente.");

        actualizarTablaUsuarios();
        limpiarCamposUsuario();
        SistemaDatos.guardarDatos();
    }
}        // TODO add your handling code here:
    }//GEN-LAST:event_btnDarBajaUsuarioActionPerformed

    private void btnLimpiarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarUsuarioActionPerformed
limpiarCamposUsuario();
actualizarTablaUsuarios();        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrirCaja;
    private javax.swing.JButton btnAgregarProductoVenta;
    private javax.swing.JButton btnBuscarAbarrote;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarClienteVenta;
    private javax.swing.JButton btnBuscarLibreria;
    private javax.swing.JButton btnBuscarProductoVenta;
    private javax.swing.JButton btnBuscarUsuario;
    private javax.swing.JButton btnCalcularTotal;
    private javax.swing.JButton btnCancelarVenta;
    private javax.swing.JButton btnCerrarCaja;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnDarBajaUsuario;
    private javax.swing.JButton btnEliminarAbarrote;
    private javax.swing.JButton btnEliminarLibreria;
    private javax.swing.JButton btnFiltrarTipo;
    private javax.swing.JButton btnGenerarComprobante;
    private javax.swing.JButton btnGuardarAbarrote;
    private javax.swing.JButton btnGuardarCliente;
    private javax.swing.JButton btnGuardarLibreria;
    private javax.swing.JButton btnGuardarUsuario;
    private javax.swing.JButton btnLimpiarAbarrote;
    private javax.swing.JButton btnLimpiarCliente;
    private javax.swing.JButton btnLimpiarLibreria;
    private javax.swing.JButton btnLimpiarUsuario;
    private javax.swing.JButton btnModificarAbarrote;
    private javax.swing.JButton btnModificarCliente;
    private javax.swing.JButton btnModificarLibreria;
    private javax.swing.JButton btnModificarUsuario;
    private javax.swing.JButton btnNuevaVenta;
    private javax.swing.JButton btnProcesarPago;
    private javax.swing.JButton btnQuitarProductoVenta;
    private javax.swing.JButton btnRegistrarEgreso;
    private javax.swing.JButton btnRegistrarIngreso;
    private javax.swing.JButton btnRegistrarVenta;
    private javax.swing.JButton btnStockBajo;
    private javax.swing.JButton btnVerCaja;
    private javax.swing.JButton btnVerVencidos;
    private javax.swing.JCheckBox chkCampaniaEscolar;
    private javax.swing.JComboBox<String> cmbRolUsuario;
    private javax.swing.JComboBox<String> cmbTipoArticulo;
    private javax.swing.JComboBox<String> cmbUnidadMedida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblCantidadVenta;
    private javax.swing.JLabel lblCategoriaAbarrote;
    private javax.swing.JLabel lblCategoriaLibreria;
    private javax.swing.JLabel lblCierreEsperado;
    private javax.swing.JLabel lblCodigoAbarrote;
    private javax.swing.JLabel lblCodigoLibreria;
    private javax.swing.JLabel lblCodigoProductoVenta;
    private javax.swing.JLabel lblContraseniaUsuario;
    private javax.swing.JLabel lblDescripcionMovimiento;
    private javax.swing.JLabel lblDireccionCliente;
    private javax.swing.JLabel lblDocumentoCliente;
    private javax.swing.JLabel lblDocumentoVenta;
    private javax.swing.JLabel lblEgresos;
    private javax.swing.JLabel lblFechaVencimiento;
    private javax.swing.JLabel lblFechaVenta;
    private javax.swing.JLabel lblIdCliente;
    private javax.swing.JLabel lblIdUsuario;
    private javax.swing.JLabel lblIdVenta;
    private javax.swing.JLabel lblIdVentaTexto;
    private javax.swing.JLabel lblMarcaAbarrote;
    private javax.swing.JLabel lblMarcaLibreria;
    private javax.swing.JLabel lblMontoEgreso;
    private javax.swing.JLabel lblMontoIngreso;
    private javax.swing.JLabel lblMontoInicial;
    private javax.swing.JLabel lblNombreAbarrote;
    private javax.swing.JLabel lblNombreClienteTexto;
    private javax.swing.JLabel lblNombreClienteVenta;
    private javax.swing.JLabel lblNombreLibreria;
    private javax.swing.JLabel lblNombreProductoTexto;
    private javax.swing.JLabel lblNombreProductoVenta;
    private javax.swing.JLabel lblNombresCliente;
    private javax.swing.JLabel lblNombresUsuario;
    private javax.swing.JLabel lblPagoCliente;
    private javax.swing.JLabel lblPrecioAbarrote;
    private javax.swing.JLabel lblPrecioLibreria;
    private javax.swing.JLabel lblPrecioProductoTexto;
    private javax.swing.JLabel lblPrecioProductoVenta;
    private javax.swing.JLabel lblRolUsuario;
    private javax.swing.JLabel lblRolUsuarioRegistro;
    private javax.swing.JLabel lblSaldoActual;
    private javax.swing.JLabel lblStockAbarrote;
    private javax.swing.JLabel lblStockLibreria;
    private javax.swing.JLabel lblStockProductoTexto;
    private javax.swing.JLabel lblStockProductoVenta;
    private javax.swing.JLabel lblTelefonoCliente;
    private javax.swing.JLabel lblTextoCierreEsperado;
    private javax.swing.JLabel lblTextoEgresos;
    private javax.swing.JLabel lblTextoIngresos;
    private javax.swing.JLabel lblTextoRolUsuario;
    private javax.swing.JLabel lblTextoSaldoActual;
    private javax.swing.JLabel lblTextoUsuarioActivo;
    private javax.swing.JLabel lblTextoVentasEfectivo;
    private javax.swing.JLabel lblTipoArticulo;
    private javax.swing.JLabel lblTituloCaja;
    private javax.swing.JLabel lblTituloClientes;
    private javax.swing.JLabel lblTituloLibreria;
    private javax.swing.JLabel lblTituloMinimarket;
    private javax.swing.JLabel lblTituloSistema;
    private javax.swing.JLabel lblTituloUsuarios;
    private javax.swing.JLabel lblTituloVentas;
    private javax.swing.JLabel lblTotalVenta;
    private javax.swing.JLabel lblTotalVentaTexto;
    private javax.swing.JLabel lblUnidadMedida;
    private javax.swing.JLabel lblUsuarioActivo;
    private javax.swing.JLabel lblUsuarioRegistro;
    private javax.swing.JLabel lblVentasEfectivo;
    private javax.swing.JLabel lblVuelto;
    private javax.swing.JLabel lblVueltoTexto;
    private javax.swing.JPanel panelCaja;
    private javax.swing.JTabbedPane panelClientes;
    private javax.swing.JPanel panelLibreria;
    private javax.swing.JPanel panelMinimarket;
    private javax.swing.JPanel panelReportes;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JPanel panelUsuarios;
    private javax.swing.JPanel panelVentas;
    private javax.swing.JScrollPane scrollClientes;
    private javax.swing.JTable tblAbarrotes;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTable tblDetalleVenta;
    private javax.swing.JTable tblLibreria;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtCampaniaEscolar;
    private javax.swing.JTextField txtCantidadVenta;
    private javax.swing.JTextField txtCategoriaAbarrote;
    private javax.swing.JTextField txtCategoriaLibreria;
    private javax.swing.JTextField txtCodigoAbarrote;
    private javax.swing.JTextField txtCodigoLibreria;
    private javax.swing.JTextField txtCodigoProductoVenta;
    private javax.swing.JTextField txtContraseniaUsuario;
    private javax.swing.JTextField txtDescripcionMovimiento;
    private javax.swing.JTextField txtDireccionCliente;
    private javax.swing.JTextField txtDocumentoCliente;
    private javax.swing.JTextField txtDocumentoClienteVenta;
    private javax.swing.JTextField txtFechaVencimiento;
    private javax.swing.JTextField txtFechaVenta;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtIdUsuario;
    private javax.swing.JTextField txtMarcaAbarrote;
    private javax.swing.JTextField txtMarcaLibreria;
    private javax.swing.JTextField txtMontoEgreso;
    private javax.swing.JTextField txtMontoIngreso;
    private javax.swing.JTextField txtMontoInicial;
    private javax.swing.JTextField txtNombreAbarrote;
    private javax.swing.JTextField txtNombreLibreria;
    private javax.swing.JTextField txtNombresCliente;
    private javax.swing.JTextField txtNombresUsuario;
    private javax.swing.JTextField txtPagoCliente;
    private javax.swing.JTextField txtPrecioAbarrote;
    private javax.swing.JTextField txtPrecioLibreria;
    private javax.swing.JTextField txtStockAbarrote;
    private javax.swing.JTextField txtStockLibreria;
    private javax.swing.JTextField txtTelefonoCliente;
    private javax.swing.JTextField txtUsuarioRegistro;
    // End of variables declaration//GEN-END:variables
}
