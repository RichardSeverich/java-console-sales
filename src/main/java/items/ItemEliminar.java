package items;

import java.util.Scanner;
import java.util.ArrayList;

public class ItemEliminar {

	public static ArrayList<Item> eliminar(ArrayList<Item> arrayItems) {
		Scanner leerEntradaTeclado = new Scanner(System.in);
		int tam = arrayItems.size();
		System.out.println("*******ELIMINACION DE ITEMS*******");
		System.out.println("");
		System.out.println("ingrese el indice que desea eliminar");
		int ind = Integer.parseInt(leerEntradaTeclado.nextLine());
		if (ind < tam) {
			arrayItems.remove(ind);
			System.out.println("se elimino el indice indicado");
		}
		System.out.println("elemento seleccionado inexistente");
		return arrayItems;
	}
}