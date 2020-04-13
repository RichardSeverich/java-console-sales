package ventas;

import java.util.Scanner;
import java.util.ArrayList;

import usuarios.Usuario;
import usuarios.UsuarioSwitch;
import items.Item;
import items.ItemSwitch;
import menu.PedirOpcion;

public class VentaSwitch {

	public static ArrayList<Venta> arrayVentas = new ArrayList<>();

	public static void mostrar() {
		Scanner entradaTeclado = new Scanner(System.in);
		int opcion = 0;

		ArrayList<Usuario> arrayUsuarios = UsuarioSwitch.getArrayUsuarios();
		ArrayList<Item> arrayItems = ItemSwitch.getArrayItems();

		do {
			// Menu
			VentaMenu.mostrarMenu();
			// Try Catch
			opcion = PedirOpcion.mostrar();
			// Entrada teclado
			opcion = Integer.parseInt(entradaTeclado.nextLine());
			switch (opcion) {
				case 1:
					arrayVentas = VentaRegistrar.registrar(arrayVentas, arrayUsuarios);
					break;
				case 2:
					VentaItemRegistrar.registrar(arrayItems, arrayVentas);
					break;
				case 3:
					VentaMostrar.mostrar(arrayVentas);
					break;
				case 4:
					arrayVentas = VentaEliminar.eliminar(arrayVentas);
					break;
				case 5:
					System.out.println("salio de ventas");
					break;
				default:
					System.out.println("Opcion Incorrecta");
			}
		} while (opcion != (5));
	}

	public static ArrayList<Venta> getArrayVenta() {
		return arrayVentas;

	}
}
