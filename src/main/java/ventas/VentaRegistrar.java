package ventas;

import contenedores.UsuariosList;
import contenedores.VentaList;
import java.util.Scanner;
import usuarios.Usuario;

public class VentaRegistrar {

  /**Metodo.*/
  public static void registrar() {
    System.out.println("******* VENTAS REGISTRAR *******");
    System.out.println("");
    // obteniendo fecha
    System.out.println("Ingrese fecha de venta: ");
    Scanner leerEntradaTeclado = new Scanner(System.in);
    Venta venta = new Venta();
    venta.fecha = leerEntradaTeclado.nextLine();
    // obteniendo indice del cliente
    System.out.println("ingrese indice del cliente");
    int indCliente = leerEntradaTeclado.nextInt();
    venta.cliente = UsuariosList.usuariosArrayList.get(indCliente);
    VentaList.arrayVentas.add(venta);
  }
}
