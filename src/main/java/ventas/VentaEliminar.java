package ventas;

import java.util.Scanner;
import java.util.ArrayList;

public class VentaEliminar {

	public static ArrayList<Venta> eliminar(ArrayList<Venta> arrayVentas) {
		Scanner leerEntradaTeclado = new Scanner(System.in);
		int tam = arrayVentas.size();
		System.out.println("ingrese el indice que desea eliminar");
		int ind = Integer.parseInt(leerEntradaTeclado.nextLine());
		if (ind < tam) {
			arrayVentas.remove(ind);
			System.out.println("se elimino el indice indicado");
		}
		System.out.println("elemento seleccionado inexistente");
		return arrayVentas;
	}
}