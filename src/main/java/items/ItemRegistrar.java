package items;

import contenedores.ItemsList;
import herramientas.PedirNumero;
import java.util.ArrayList;
import java.util.Scanner;

public class ItemRegistrar {

  /**Metodo.*/
  public static void registrar() {
    ArrayList<Item> itemsArrayList = ItemsList.itemsArrayList;
    Scanner leerEntradaTeclado = new Scanner(System.in);
    System.out.println("*******REGISTRO DE ITEMS*******");
    System.out.println("");
    // Añadir item
    Item item = new Item();
    // Nombres
    System.out.println("Ingrese el nombre de Item");
    item.nombre = leerEntradaTeclado.nextLine();
    // Precio
    System.out.println("Ingrese el Precio");
    item.precio = PedirNumero.pedir();
    // Stock
    System.out.println("Ingrese Stock ");
    item.stock = PedirNumero.pedir();
    itemsArrayList.add(item);
  }
}
