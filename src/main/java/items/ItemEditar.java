package items;

import contenedores.ItemsList;
import herramientas.PedirNumero;
import java.util.ArrayList;
import java.util.Scanner;

public class ItemEditar {

  /**Metodo.*/
  public static void editar() {
    ArrayList<Item> itemsArrayList = ItemsList.itemsArrayList;
    Scanner leerEntradaTeclado = new Scanner(System.in);
    int tamano = itemsArrayList.size();
    System.out.println("*******EDICION DE ITEMS*******");
    System.out.println("");
    System.out.println("ingrese el indice que desea editar");
    int ind = PedirNumero.pedir();
    if (ind < tamano && ind > 0) {
      Item item = new Item();
      // nombre
      System.out.println("Ingrese el nombre");
      item.nombre = leerEntradaTeclado.nextLine();
      // precio
      System.out.println("Ingrese el precio");
      item.precio = PedirNumero.pedir();
      // ingrese stock
      System.out.println("Ingrese el stock");
      item.stock = PedirNumero.pedir();
      itemsArrayList.set(ind - 1, item);
      System.out.println("se edito exitosamente");
    } else if (ind >= tamano) {
      System.out.println("indice invalido");
    }
  }
}
