package usuarios;

import java.util.Scanner;
import java.util.ArrayList;

public class UsuarioSwitch {

	public static ArrayList<Usuario> usuariosArrayList = new ArrayList<Usuario>();

	public static void mostrar() {
		Scanner entradaTeclado = new Scanner(System.in);
		int opcion = 0;
		do {
			UsuarioMenu.mostrarMenu();
			opcion = Integer.parseInt(entradaTeclado.nextLine());
			switch (opcion) {
				case 1:
					UsuarioRegistrar.registrar(usuariosArrayList);
					break;
				case 2:
					UsuarioMostrar.mostrar(usuariosArrayList);
					break;
				case 3:
					UsuarioEliminar.eliminar(usuariosArrayList);
					break;
				case 4:
					UsuarioEditar.editar(usuariosArrayList);
					break;
				case 5:
					System.out.println("Salio de Adm. Usuarios");
					break;
				default:
					System.out.println("Opcion Incorrecta");
			}
		} while (opcion != (5));
	}

	public static ArrayList<Usuario> getArrayUsuarios() {
		return usuariosArrayList;
	}
}
