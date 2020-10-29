package usuarios;

import contenedores.UsuariosList;
import herramientas.LimpiarPantalla;
import herramientas.PedirNumero;
import java.util.ArrayList;
import java.util.Scanner;

public class UsuarioSwitch {

  /**Metodo.*/
  public static void mostrar() {
    Scanner leerEntradaTeclado = new Scanner(System.in);
    int opcion = 0;
    do {
      // Menu
      UsuarioMenu.mostrarMenu();
      // try catch
      opcion = PedirNumero.pedir();
      LimpiarPantalla.limpiar();
      switch (opcion) {
        case 1:
          UsuarioRegistrar.registrar();
          break;
        case 2:
          UsuarioMostrar.mostrar();
          break;
        case 3:
          UsuarioEliminar.eliminar();
          break;
        case 4:
          UsuarioEditar.editar();
          break;
        case 5:
          System.out.println("Salio de Adm. Usuarios");
          break;
        default:
          System.out.println("Opcion Incorrecta");
      }
    } while (opcion != (5));
  }
}
