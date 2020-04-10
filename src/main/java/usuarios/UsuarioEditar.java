package usuarios;

import java.util.Scanner;
import java.util.ArrayList;

public class UsuarioEditar {

	public static ArrayList<Usuario> editar(ArrayList<Usuario> arrayUsuarios) {
		Scanner leerEntradaTeclado = new Scanner(System.in);
		int tamano = arrayUsuarios.size();
		System.out.println("ingrese el indice que desea editar");
		int ind = Integer.parseInt(leerEntradaTeclado.nextLine());
		if (ind < tamano) {
			Usuario usuario = new Usuario();
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

			arrayUsuarios.set(ind, usuario);
		} else if (ind >= tamano) {
			System.out.println("indice invalido");
		}
		System.out.println("se edito exitosamente");
		return arrayUsuarios;
	}
}