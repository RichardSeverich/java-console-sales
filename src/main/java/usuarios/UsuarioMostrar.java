package usuarios;

import java.util.Scanner;

public class UsuarioMostrar {
	
	public static void mostrar(Usuario[] arrayUsuarios, int contador){
		System.out.println("Numero      Nombres     Apellidos     Edad     Tipo");
		for(int i=0; i < contador; i=i+1){
			// Rescato los valores del array y los guardo en variables
			String nombres = arrayUsuarios[i].nombres;
			String apellidos = arrayUsuarios[i].apellidos;
			int edad = arrayUsuarios[i].edad;
			String tipo = arrayUsuarios[i].tipo;	
			System.out.println(i + "           " + nombres + "         " + apellidos + "         " + edad + "      " + tipo);
		}

	}
}
