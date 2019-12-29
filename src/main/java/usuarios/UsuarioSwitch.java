package usuarios;

import java.util.Scanner;

public class UsuarioSwitch {
	
	public static void mostrar(){
		Scanner leerEntradaTeclado = new Scanner(System.in);
		String opcion = "0";
		
		// Aca estamos importando al usuario.
		Usuario [] arrayUsuarios = new Usuario[100];
		int contador = 0;
	do {
			UsuarioMenu.mostrarMenu();
			// Eligiendo una opcion
			opcion = leerEntradaTeclado.nextLine();
		
			switch (opcion) {
				case "1":
					arrayUsuarios = UsuarioRegistrar.registrar(arrayUsuarios, contador);
					contador = UsuarioRegistrar.contadorStatic;
					break;
				case "2":
					UsuarioMostrar.mostrar(arrayUsuarios, contador);
					break;
				case "3":
					System.out.println("Entroo Eliminar");
					// Eliminar un elemento array 
					break;
				case "4":
					System.out.println("Entroo Editar");
					break;
				case "5":
					System.out.println("Entroo Salir");
					break;
				default:
					System.out.println("Opcion Incorrecta");
			}
		}while(!opcion.equals("5"));

	}
}
