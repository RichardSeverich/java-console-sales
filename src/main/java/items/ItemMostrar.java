package items;

import java.util.ArrayList;

public class ItemMostrar {

	public static void mostrar(ArrayList<Item> itemsArrayList) {
		System.out.println("Numero      Nombre     precio     stock     Tipo");
		int contador = 0;
		for (Item item : itemsArrayList) {
			String nombre = item.nombre;
			int precio = item.precio;
			int stock = item.stock;
			String tipo = item.tipo;
			contador++;

			System.out.println(
					contador + "        " + nombre + "         " + precio + "         " + stock + "      " + tipo);

		}

	}
}
