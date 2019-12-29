package menu;

import usuarios.UsuarioSwitch;
import java.util.Scanner;
import items.ItemSwitch;

public class Switch {
	
	public static void mostrar(){
		Scanner leerEntradaTeclado = new Scanner(System.in);
		String opcion = "0";
		
	do {
			Menu.mostrarMenu();
			// Eligiendo una opcion
			opcion = leerEntradaTeclado.nextLine();
		
			switch (opcion) {
				case "1":
                     UsuarioSwitch.mostrar();
					break;
				case "2":
				    ItemSwitch.mostrar();
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
