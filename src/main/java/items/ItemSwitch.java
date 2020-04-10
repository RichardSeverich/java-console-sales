package items;

import java.util.Scanner;
import java.util.ArrayList;

public class ItemSwitch {

	public static ArrayList<Item> itemsArrayList = new ArrayList<Item>();

	public static void mostrar() {
		Scanner entradaTeclado = new Scanner(System.in);
		int opcion = 0;
		do {
			ItemMenu.mostrarMenu();
			opcion = Integer.parseInt(entradaTeclado.nextLine());
			switch (opcion) {
				case 1:
					ItemRegistrar.registrar(itemsArrayList);
					break;
				case 2:
					ItemMostrar.mostrar(itemsArrayList);
					break;
				case 3:
					ItemEliminar.eliminar(itemsArrayList);
					break;
				case 4:
					System.out.println("Entroo Editar");
					break;
				case 5:
					System.out.println("salio de Adm. Items");
					break;
				default:
					System.out.println("Opcion Incorrecta");
			}
		} while (opcion != (5));
	}

	public static ArrayList<Item> getArrayItems() {
		return itemsArrayList;
	}
}
