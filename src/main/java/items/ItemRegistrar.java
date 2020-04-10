package items;

import java.util.Scanner;
import java.util.ArrayList;

public class ItemRegistrar {

	// public static int contadorStatic;

	public static void registrar(ArrayList<Item> itemsArrayList) {
		Scanner leerEntradaTeclado = new Scanner(System.in);
		System.out.println("Entroo Registrar ");
		// Añadir usuario
		Item item = new Item();
		// Nombres
		System.out.println("Ingrese el nombre de Item");
		item.nombre = leerEntradaTeclado.nextLine();
		// Apellidos
		System.out.println("Ingrese el Precio");
		item.precio = Integer.parseInt(leerEntradaTeclado.nextLine());
		// Edad
		System.out.println("Ingrese Stock ");
		item.stock = Integer.parseInt(leerEntradaTeclado.nextLine());
		// Tipo
		System.out.println("Igrese tipo");
		item.tipo = leerEntradaTeclado.nextLine();

		itemsArrayList.add(item);
	}
}
