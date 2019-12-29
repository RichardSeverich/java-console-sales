package items;

import java.util.Scanner;

public class ItemMostrar {
	
	public static void mostrar(Item[] arrayItems, int contador){
		System.out.println("Numero      Nombre      Precio    Stock ");
		for(int i=0; i < contador; i=i+1){
			String nombre = arrayItems[i].nombre;
			float precio = arrayItems[i].precio;
			int stock = arrayItems[i].stock;
			System.out.println(i + "           " + nombre + "         " + precio + "         " + stock);
		}

	}
}
