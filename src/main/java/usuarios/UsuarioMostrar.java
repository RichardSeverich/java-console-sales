package usuarios;

import java.util.ArrayList;

public class UsuarioMostrar {

	public static void mostrar(ArrayList<Usuario> usuariosArrayList) {
		System.out.println("Numero      Nombres     Apellidos     Edad     Tipo");

		int contador = 0;
		for (Usuario usuario : usuariosArrayList) {
			String nombres = usuario.nombres;
			String apellidos = usuario.apellidos;
			int edad = usuario.edad;
			String tipo = usuario.tipo;
			contador++;
			System.out.println(
					contador + "        " + nombres + "         " + apellidos + "         " + edad + "      " + tipo);
		}
	}
}
