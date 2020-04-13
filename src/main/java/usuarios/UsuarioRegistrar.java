package usuarios;

import java.util.Scanner;
import java.util.ArrayList;

public class UsuarioRegistrar {

	// public static int contadorStatic;

	public static ArrayList<Usuario> registrar(ArrayList<Usuario> usuariosArrayList) {
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
		usuario.edad = Integer.parseInt(leerEntradaTeclado.nextLine());
		// Tipo
		System.out.println("Igrese tipo");
		usuario.tipo = leerEntradaTeclado.nextLine();

		usuariosArrayList.add(usuario);

		return usuariosArrayList;
	}
}
