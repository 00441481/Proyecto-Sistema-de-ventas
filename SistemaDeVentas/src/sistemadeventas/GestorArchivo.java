package sistemadeventas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class GestorArchivo {

    private final String archivoUsuarios = "usuarios.txt";
    private final String archivoClientes = "clientes.txt";
    private final String archivoAbarrotes = "productos_abarrotes.txt";
    private final String archivoLibreria = "productos_libreria.txt";
    private final String archivoVentas = "ventas.txt";

    public void guardarUsuarios(ArrayList<Usuario> listaUsuarios) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoUsuarios))) {

            for (Usuario u : listaUsuarios) {
                bw.write(u.getIdUsuario() + ";"
                        + u.getNombres() + ";"
                        + u.getUsuario() + ";"
                        + u.getContrasenia() + ";"
                        + u.getRol() + ";"
                        + u.isEstado());
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error al guardar usuarios: " + e.getMessage());
        }
    }

    public ArrayList<Usuario> leerUsuarios() {

        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        File archivo = new File(archivoUsuarios);

        if (!archivo.exists()) {
            return listaUsuarios;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(archivoUsuarios))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(";");

                if (datos.length == 6) {
                    Usuario u = new Usuario(datos[0], datos[1], datos[2], datos[3], datos[4]);
                    u.setEstado(Boolean.parseBoolean(datos[5]));
                    listaUsuarios.add(u);
                }
            }

        } catch (IOException e) {
            System.out.println("Error al leer usuarios: " + e.getMessage());
        }

        return listaUsuarios;
    }

    public void guardarClientes(ArrayList<Cliente> listaClientes) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoClientes))) {

            for (Cliente c : listaClientes) {
                bw.write(c.getIdCliente() + ";"
                        + c.getDocumento() + ";"
                        + c.getNombres() + ";"
                        + c.getTelefono() + ";"
                        + c.getDireccion());
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error al guardar clientes: " + e.getMessage());
        }
    }

    public ArrayList<Cliente> leerClientes() {

        ArrayList<Cliente> listaClientes = new ArrayList<>();
        File archivo = new File(archivoClientes);

        if (!archivo.exists()) {
            return listaClientes;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(archivoClientes))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(";");

                if (datos.length == 5) {
                    Cliente c = new Cliente(datos[0], datos[1], datos[2], datos[3], datos[4]);
                    listaClientes.add(c);
                }
            }

        } catch (IOException e) {
            System.out.println("Error al leer clientes: " + e.getMessage());
        }

        return listaClientes;
    }

    public void guardarProductos(ArrayList<Producto> listaProductos) {

        try (BufferedWriter bwAbarrotes = new BufferedWriter(new FileWriter(archivoAbarrotes));
             BufferedWriter bwLibreria = new BufferedWriter(new FileWriter(archivoLibreria))) {

            for (Producto p : listaProductos) {

                if (p instanceof ProductoAbarrote) {

                    ProductoAbarrote a = (ProductoAbarrote) p;

                    bwAbarrotes.write(a.getCodigo() + ";"
                            + a.getNombre() + ";"
                            + a.getCategoria() + ";"
                            + a.getPrecio() + ";"
                            + a.getStock() + ";"
                            + a.getFechaVencimiento() + ";"
                            + a.getMarca() + ";"
                            + a.getUnidadMedida());
                    bwAbarrotes.newLine();
                }

                if (p instanceof ProductoLibreria) {

                    ProductoLibreria l = (ProductoLibreria) p;

                    bwLibreria.write(l.getCodigo() + ";"
                            + l.getNombre() + ";"
                            + l.getCategoria() + ";"
                            + l.getPrecio() + ";"
                            + l.getStock() + ";"
                            + l.getTipoArticulo() + ";"
                            + l.getMarca() + ";"
                            + l.getCampaniaEscolar());
                    bwLibreria.newLine();
                }
            }

        } catch (IOException e) {
            System.out.println("Error al guardar productos: " + e.getMessage());
        }
    }

    public ArrayList<Producto> leerProductos() {

        ArrayList<Producto> listaProductos = new ArrayList<>();

        leerAbarrotes(listaProductos);
        leerLibreria(listaProductos);

        return listaProductos;
    }

    private void leerAbarrotes(ArrayList<Producto> listaProductos) {

        File archivo = new File(archivoAbarrotes);

        if (!archivo.exists()) {
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(archivoAbarrotes))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(";");

                if (datos.length == 8) {

                    ProductoAbarrote a = new ProductoAbarrote(
                            datos[0],
                            datos[1],
                            datos[2],
                            Double.parseDouble(datos[3]),
                            Integer.parseInt(datos[4]),
                            datos[5],
                            datos[6],
                            datos[7]);

                    listaProductos.add(a);
                }
            }

        } catch (IOException | NumberFormatException e) {
            System.out.println("Error al leer abarrotes: " + e.getMessage());
        }
    }

    private void leerLibreria(ArrayList<Producto> listaProductos) {

        File archivo = new File(archivoLibreria);

        if (!archivo.exists()) {
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(archivoLibreria))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(";");

                if (datos.length == 8) {

                    ProductoLibreria l = new ProductoLibreria(
                            datos[0],
                            datos[1],
                            datos[2],
                            Double.parseDouble(datos[3]),
                            Integer.parseInt(datos[4]),
                            datos[5],
                            datos[6],
                            datos[7]);

                    listaProductos.add(l);
                }
            }

        } catch (IOException | NumberFormatException e) {
            System.out.println("Error al leer productos de librería: " + e.getMessage());
        }
    }

    public void guardarVentas(ArrayList<Venta> listaVentas) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoVentas))) {

            for (Venta v : listaVentas) {

                String documentoCliente = "";
                String nombreCliente = "";

                if (v.getCliente() != null) {
                    documentoCliente = v.getCliente().getDocumento();
                    nombreCliente = v.getCliente().getNombres();
                }

                bw.write(v.getIdVenta() + ";"
                        + v.getFecha() + ";"
                        + documentoCliente + ";"
                        + nombreCliente + ";"
                        + v.getEstado() + ";"
                        + v.getMetodoPago() + ";"
                        + v.calcularTotal() + ";"
                        + v.getPagoCliente() + ";"
                        + v.getVuelto());
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error al guardar ventas: " + e.getMessage());
        }
    }

    public void generarBackup() {

        try {

            String fecha = LocalDateTime.now()
                    .format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));

            File carpetaBackup = new File("backup_sistema_" + fecha);
            carpetaBackup.mkdir();

            copiarSiExiste(archivoUsuarios, carpetaBackup);
            copiarSiExiste(archivoClientes, carpetaBackup);
            copiarSiExiste(archivoAbarrotes, carpetaBackup);
            copiarSiExiste(archivoLibreria, carpetaBackup);
            copiarSiExiste(archivoVentas, carpetaBackup);

            System.out.println("Backup generado correctamente.");

        } catch (IOException e) {
            System.out.println("Error al generar backup: " + e.getMessage());
        }
    }

    private void copiarSiExiste(String nombreArchivo, File carpetaDestino) throws IOException {

        File archivoOrigen = new File(nombreArchivo);

        if (archivoOrigen.exists()) {

            File archivoDestino = new File(carpetaDestino, nombreArchivo);

            Files.copy(
                    archivoOrigen.toPath(),
                    archivoDestino.toPath(),
                    StandardCopyOption.REPLACE_EXISTING);
        }
    }
}