package items;

import java.util.Scanner;
import java.util.ArrayList;

public class ItemRegistrar {

	// public static int contadorStatic;

	public static void registrar(ArrayList<Item> itemsArrayList) {
		Scanner leerEntradaTeclado = new Scanner(System.in);
		System.out.println("*******REGISTRO DE ITEMS*******");
		System.out.println("");
		// Añadir item
		Item item = new Item();
		// Nombres
		System.out.println("Ingrese el nombre de Item");
		item.nombre = leerEntradaTeclado.nextLine();
		// Precio
		System.out.println("Ingrese el Precio");
		item.precio = Integer.parseInt(leerEntradaTeclado.nextLine());
		// Stock
		System.out.println("Ingrese Stock ");
		item.stock = Integer.parseInt(leerEntradaTeclado.nextLine());

		itemsArrayList.add(item);
	}
}
