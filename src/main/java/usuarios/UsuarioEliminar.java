package usuarios;

import java.util.Scanner;
import java.util.ArrayList;

public class UsuarioEliminar {

	public static ArrayList<Usuario> eliminar(ArrayList<Usuario> arrayUsuarios) {
		Scanner leerEntradaTeclado = new Scanner(System.in);
		int tam = arrayUsuarios.size();
		System.out.println("*******ELIMINACION DE USUARIOS*******");
		System.out.println("");
		System.out.println("ingrese el indice que desea eliminar");
		int ind = Integer.parseInt(leerEntradaTeclado.nextLine());
		if (ind < tam) {
			arrayUsuarios.remove(ind);
			System.out.println("se elimino el indice indicado");
		}
		System.out.println("elemento seleccionado inexistente");
		return arrayUsuarios;
	}
}