package ventas;

import contenedores.ItemsList;
import contenedores.UsuariosList;
import contenedores.VentaList;
import herramientas.LimpiarPantalla;
import herramientas.PedirNumero;
import items.Item;
import java.util.ArrayList;
import java.util.Scanner;
import usuarios.Usuario;
import usuarios.UsuarioSwitch;

public class VentaSwitch {

  /**Metodo.*/
  public static void mostrar() {
    Scanner leerEntradaTeclado = new Scanner(System.in);
    int opcion = 0;
    do {
      // Menu
      VentaMenu.mostrarMenu();
      // Try Catch
      opcion = PedirNumero.pedir();
      LimpiarPantalla.limpiar();
      switch (opcion) {
        case 1:
          VentaRegistrar.registrar();
          break;
        case 2:
          VentaItemRegistrar.registrar();
          break;
        case 3:
          VentaMostrar.mostrar();
          break;
        case 4:
          VentaEliminar.eliminar();
          break;
        case 5:
          System.out.println("salio de ventas");
          break;
        default:
          System.out.println("Opcion Incorrecta");
      }
    } while (opcion != (5));
  }
}
