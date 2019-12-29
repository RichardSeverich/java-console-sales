package items;

import java.util.Scanner;

public class ItemSwitch {
	
	public static void mostrar(){
		Scanner leerEntradaTeclado = new Scanner(System.in);
		String opcion = "0";
		Item [] arrayItems = new Item[100];
		int contador = 0;
	do {
			ItemMenu.mostrarMenu();
			// Eligiendo una opcion
			opcion = leerEntradaTeclado.nextLine();
		
			switch (opcion) {
				case "1":
					arrayItems = ItemRegistrar.registrar(arrayItems, contador);
					contador = ItemRegistrar.contadorStatic;
					break;
				case "2":
					ItemMostrar.mostrar(arrayItems, contador);
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
