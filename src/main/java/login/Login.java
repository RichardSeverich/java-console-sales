package login;

import herramientas.LimpiarPantalla;
import java.util.Scanner;

public class Login {

  /**Metodo.*/
  public static void mostrar() {
    Scanner entrada = new Scanner(System.in);
    LimpiarPantalla.limpiar();
    String nickname = "";
    String contrasena = "";
    System.out.println("*******INICIO DE SESION*******");
    System.out.println("");
    do {
      System.out.println("Ingresa nickname de usuario");
      nickname = entrada.nextLine();
      System.out.println("Ingrese la contrasena");
      contrasena = entrada.nextLine();
      if (nickname.equalsIgnoreCase("micky") && contrasena.equalsIgnoreCase("micky123")) {
        System.out.println("nickname y contrasena correcto");
      } else {
        System.out.println("usuario o contraseña incorrecto");
      }
    } while (!nickname.equalsIgnoreCase("micky") || !contrasena.equalsIgnoreCase("micky123"));
  }
}
