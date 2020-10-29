package menu;

import herramientas.LimpiarPantalla;
import herramientas.PedirNumero;
import items.ItemSwitch;
import java.util.Scanner;
import usuarios.UsuarioSwitch;
import ventas.VentaSwitch;

public class ElegirOpcion {

  /**Metodo.*/
  public static int mostrar() {
    Scanner entradaTeclado = new Scanner(System.in);
    int opcion = 0;
    opcion = PedirNumero.pedir();
    LimpiarPantalla.limpiar();
    switch (opcion) {
      case 1:
        UsuarioSwitch.mostrar();
        break;
      case 2:
        ItemSwitch.mostrar();
        break;
      case 3:
        VentaSwitch.mostrar();
        break;
      case 4:
        System.out.println("Programa terminado");
        break;
      default:
        System.out.println("Opcion Incorrecta");
    }
    System.out.println("Precione enter para continuar");
    entradaTeclado.nextLine();
    return opcion;
  }
}
