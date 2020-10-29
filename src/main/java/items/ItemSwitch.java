package items;

import herramientas.LimpiarPantalla;
import herramientas.PedirNumero;
import java.util.Scanner;

public class ItemSwitch {

  /**Metodo.*/
  public static void mostrar() {
    Scanner leerEntradaTeclado = new Scanner(System.in);
    int opcion = 0;
    do {
      // Menu
      ItemMenu.mostrarMenu();
      // try catch
      opcion = PedirNumero.pedir();
      LimpiarPantalla.limpiar();
      switch (opcion) {
        case 1:
          ItemRegistrar.registrar();
          break;
        case 2:
          ItemMostrar.mostrar();
          break;
        case 3:
          ItemEliminar.eliminar();
          break;
        case 4:
          ItemEditar.editar();
          break;
        case 5:
          System.out.println("Salio");
          break;
        default:
          System.out.println("Opcion Incorrecta");
      }
    } while (opcion != (5));
  }
}
