package ventas;

import herramientas.LimpiarPantalla;

public class VentaMenu {

  /**Metodo.*/
  public static void mostrarMenu() {
    LimpiarPantalla.limpiar();
    System.out.println("*******MENU VENTAS*******");
    System.out.println("");
    System.out.println("1. Registrar venta");
    System.out.println("2. Registrar venta item");
    System.out.println("3. Mostrar ventas");
    System.out.println("4. Eliminar ventas");
    System.out.println("5. Regresar al menu principal");
  }
}
