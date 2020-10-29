package usuarios;

import contenedores.UsuariosList;
import herramientas.PedirNumero;
import java.util.ArrayList;
import java.util.Scanner;

public class UsuarioEditar {

  /**Metodo.*/
  public static void editar() {
    ArrayList<Usuario> usuariosArrayList = UsuariosList.usuariosArrayList;
    Scanner leerEntradaTeclado = new Scanner(System.in);
    int tamano = usuariosArrayList.size();
    System.out.println("*******EDICION DE USUARIOS*******");
    System.out.println("");
    System.out.println("ingrese el indice que desea editar");
    int ind = PedirNumero.pedir();
    if (ind < tamano && ind > 0) {
      Usuario usuario = new Usuario();
      // nickname
      System.out.println("Ingrese el nickname de usuario");
      usuario.nickname = leerEntradaTeclado.nextLine();
      // Nombres
      System.out.println("Ingrese el nombre Usuario");
      usuario.nombres = leerEntradaTeclado.nextLine();
      // Apellidos
      System.out.println("Ingrese el Apellidos Usuario");
      usuario.apellidos = leerEntradaTeclado.nextLine();
      // Edad
      System.out.println("Ingrese edad ");
      usuario.edad = PedirNumero.pedir();
      // Tipo
      System.out.println("Igrese tipo");
      usuario.tipo = leerEntradaTeclado.nextLine();
      usuariosArrayList.set(ind - 1, usuario);
      System.out.println("se edito exitosamente");
    } else if (ind >= tamano) {
      System.out.println("indice invalido");
    }
  }
}
