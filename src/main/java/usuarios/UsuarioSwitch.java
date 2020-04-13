package usuarios;

import java.util.Scanner;
import java.util.ArrayList;

import menu.PedirOpcion;

public class UsuarioSwitch {

	public static ArrayList<Usuario> usuariosArrayList = new ArrayList<>();

	public static void mostrar() {
		Scanner entradaTeclado = new Scanner(System.in);
		int opcion = 0;
		do {
			// Menu
			UsuarioMenu.mostrarMenu();
			// try catch
			opcion = PedirOpcion.mostrar();
			// Entrada teclado
			opcion = Integer.parseInt(entradaTeclado.nextLine());
			switch (opcion) {
				case 1:
					usuariosArrayList = UsuarioRegistrar.registrar(usuariosArrayList);
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

	public static void UsuarioPredeterminado() {
		usuariosArrayList = UsuarioPredeterminado.registrar(usuariosArrayList);
	}
}
