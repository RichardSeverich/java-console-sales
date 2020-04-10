package ventas;

import java.util.Scanner;
import java.util.ArrayList;

import usuarios.Usuario;
import items.Item;

public class VentaMostrar {
	public static void mostrar(ArrayList<Venta> arrayVentas) {
		System.out.println("********* Ventas Mostrar *********");
		for (Venta venta : arrayVentas) {
			System.out.println("Venta fecha: " + venta.fecha);
			System.out.println("Venta Cliente: " + venta.cliente.nombres);
			System.out.println("Numero      Nombre     precio     stock     Tipo");
			int contador = 0;
			for (Item item : venta.getProductos()) {
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
}
