package items;

import java.util.Scanner;


public class ItemRegistrar {
	
	public static int contadorStatic;
	
	public static Item[] registrar(Item[] arrayItems, int contador){
			Scanner leerEntradaTeclado = new Scanner(System.in);
			System.out.println("Entroo Registrar ");
			Item item = new Item();
			//
			System.out.println("Ingrese el nombre Item");
			item.nombre = leerEntradaTeclado.nextLine();
			//
			System.out.println("Ingrese el precio Item");
			item.precio = Float.parseFloat(leerEntradaTeclado.nextLine());
			//
			System.out.println("Ingrese stock ");
			item.stock = Integer.parseInt(leerEntradaTeclado.nextLine());
			//
			arrayItems[contador] = item;
			contador++;
			contadorStatic = contador;
			return arrayItems;
	}
}
