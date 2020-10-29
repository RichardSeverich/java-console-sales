package menu;

import herramientas.LimpiarPantalla;
import herramientas.PedirNumero;

public class Switch {

  /**Metodo.*/
  public static void mostrar() {
    int opcion = 0;
    do {
      // Menu
      LimpiarPantalla.limpiar();
      Menu.mostrar();
      // Switch
      opcion = ElegirOpcion.mostrar();
    } while (opcion != (4));
  }
}
