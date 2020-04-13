package ventas;

import java.util.ArrayList;

import items.Item;

public class VentaMostrar {
	public static void mostrar(ArrayList<Venta> arrayVentas) {
		System.out.println("******* MOSTRAR VENTAS *******");
		System.out.println("");
		for (Venta venta : arrayVentas) {
			System.out.println("Venta fecha: " + venta.fecha);
			System.out.println("Venta Cliente: " + venta.cliente.nombres);
			System.out.println("Numero      Nombre     precio     stock");
			int contador = 0;
			for (Item item : venta.getProductos()) {
				String nombre = item.nombre;
				int precio = item.precio;
				int stock = item.stock;
				contador++;
				System.out.println(contador + "        " + nombre + "         " + precio + "         " + stock);
			}
		}
	}
}
