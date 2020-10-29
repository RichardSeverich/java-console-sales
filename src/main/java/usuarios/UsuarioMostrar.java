package usuarios;

import contenedores.UsuariosList;
import herramientas.FixMostrar;
import java.util.ArrayList;
import java.util.Scanner;

public class UsuarioMostrar {

  /**Metodo.*/
  public static void mostrar() {
    Scanner entradaTeclado = new Scanner(System.in);
    ArrayList<Usuario> usuariosArrayList = UsuariosList.usuariosArrayList;
    System.out.println("Numero      Nickname        Nombres       Apellidos       Edad       Tipo");
    int contador = 0;
    for (Usuario usuario : usuariosArrayList) {
      String numero = FixMostrar.fix(String.valueOf(contador), 12);
      String nickname = FixMostrar.fix(usuario.nickname,16);
      String nombres = FixMostrar.fix(usuario.nombres,14);
      String apellidos = FixMostrar.fix(usuario.apellidos,16);
      String edad = FixMostrar.fix(String.valueOf(usuario.edad),12);
      String tipo = FixMostrar.fix(usuario.tipo,8);
      contador++;
      System.out.println(numero + nickname + nombres + apellidos + edad + tipo);
    }
    System.out.println("Presione enter para continuar");
    entradaTeclado.nextLine();
  }
}
