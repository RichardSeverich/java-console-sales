package ventas;

import java.util.Scanner;
import java.util.ArrayList;

import items.Item;

public class VentaItemRegistrar {

	public static void registrar(ArrayList<Item> arrayItems, ArrayList<Venta> arrayVentas) {
		Scanner leerEntradaTeclado = new Scanner(System.in);
		System.out.println("******** VENTAS REGISTRAR ITEM *********");
		System.out.println("");
		// Obteniendo indice de la venta
		System.out.println("ingrese indice de la venta");
		int indVenta = Integer.parseInt(leerEntradaTeclado.nextLine());
		Venta venta = arrayVentas.get(indVenta);
		// obteniendo indice del Item
		System.out.println("ingrese el indice del Item");
		int indItem = Integer.parseInt(leerEntradaTeclado.nextLine());
		Item item = arrayItems.get(indItem);
		venta.setProducto(item);
	}
}
