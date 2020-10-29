package usuarios;

import contenedores.UsuariosList;
import herramientas.PedirNumero;
import java.util.ArrayList;
import java.util.Scanner;

public class UsuarioEliminar {

  /**Metodo.*/
  public static void eliminar() {
    ArrayList<Usuario> usuariosArrayList = UsuariosList.usuariosArrayList;
    Scanner leerEntradaTeclado = new Scanner(System.in);
    int tam = usuariosArrayList.size();
    System.out.println("*******ELIMINACION DE USUARIOS*******");
    System.out.println("");
    System.out.println("ingrese el indice que desea eliminar");
    int ind = PedirNumero.pedir();
    if (ind <= tam) {
      usuariosArrayList.remove(ind - 1);
      System.out.println("se elimino el indice indicado");
    } else {
      System.out.println("elemento seleccionado inexistente");
    }
  }
}
