package items;

import java.util.ArrayList;

public class ItemMostrar {

	public static void mostrar(ArrayList<Item> itemsArrayList) {
		System.out.println("Numero      Nombre     precio     stock");
		int contador = 0;
		for (Item item : itemsArrayList) {
			String nombre = item.nombre;
			int precio = item.precio;
			int stock = item.stock;
			contador++;

			System.out.println(contador + "        " + nombre + "         " + precio + "         " + stock);

		}

	}
}
