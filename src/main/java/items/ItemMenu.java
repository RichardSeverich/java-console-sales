package items;

import herramientas.LimpiarPantalla;

public class ItemMenu {

  /**Metodo.*/
  public static void mostrarMenu() {
    LimpiarPantalla.limpiar();
    System.out.println("*******MENU ITEMS*******");
    System.out.println("");
    System.out.println("1. Registrar Items");
    System.out.println("2. Mostrar Items");
    System.out.println("3. Eliminar Items");
    System.out.println("4. Editar Items");
    System.out.println("5. Regresar al menu principal");
  }
}
