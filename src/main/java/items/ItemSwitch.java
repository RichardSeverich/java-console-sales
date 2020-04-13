package items;

import java.util.Scanner;
import java.util.ArrayList;

import menu.PedirOpcion;

public class ItemSwitch {

	public static ArrayList<Item> itemsArrayList = new ArrayList<Item>();

	public static void mostrar() {
		Scanner entradaTeclado = new Scanner(System.in);
		int opcion = 0;
		do {
			// Menu
			ItemMenu.mostrarMenu();
			// try catch
			opcion = PedirOpcion.mostrar();
			// Entrada teclado
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
					System.out.println("Salio de Adm. Items");
					break;
				default:
					System.out.println("Opcion Incorrecta");
			}
		} while (opcion != (4));
	}

	public static ArrayList<Item> getArrayItems() {
		return itemsArrayList;
	}

	public static void ItemPredeterminado() {
		itemsArrayList = ItemPredeterminado.registrar(itemsArrayList);
	}
}
