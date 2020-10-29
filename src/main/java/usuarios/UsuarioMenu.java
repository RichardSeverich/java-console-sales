package usuarios;

import herramientas.LimpiarPantalla;

public class UsuarioMenu {

  /**Metodo.*/
  public static void mostrarMenu() {
    // Imprimir Menu
    LimpiarPantalla.limpiar();
    System.out.println("*******MENU USUARIOS*******");
    System.out.println("");
    System.out.println("1. Registrar Usuarios");
    System.out.println("2. Mostrar Usuarios");
    System.out.println("3. Eliminar Usuarios");
    System.out.println("4. Editar Usuarios");
    System.out.println("5. Regresar al menu principal");
  }
}
