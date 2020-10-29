package usuarios;

import contenedores.UsuariosList;
import herramientas.PedirNumero;
import java.util.ArrayList;
import java.util.Scanner;

public class UsuarioRegistrar {

  /**Metodo.*/
  public static void registrar() {
    ArrayList<Usuario> usuariosArrayList = UsuariosList.usuariosArrayList;
    Scanner leerEntradaTeclado = new Scanner(System.in);
    System.out.println("*******REGISTRO DE USUARIOS*******");
    System.out.println("");
    // Añadir usuario
    Usuario usuario = new Usuario();
    // nickname
    System.out.println("Ingrese el nickname de usuario");
    usuario.nickname = leerEntradaTeclado.nextLine();
    // password
    System.out.println("Ingrese la contrasena");
    usuario.password = leerEntradaTeclado.nextLine();
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
    usuariosArrayList.add(usuario);
  }
}
