package items;

import contenedores.ItemsList;
import herramientas.FixMostrar;
import java.util.ArrayList;
import java.util.Scanner;

public class ItemMostrar {

  /**Metodo.*/
  public static void mostrar() {
    Scanner entradaTeclado = new Scanner(System.in);
    ArrayList<Item> itemsArrayList = ItemsList.itemsArrayList;
    System.out.println("Numero      Nombre              precio       stock");
    int contador = 0;
    for (Item item : itemsArrayList) {
      String numero = FixMostrar.fix(String.valueOf(contador), 5);
      String nombre = FixMostrar.fix(item.nombre, 12);
      String precio = FixMostrar.fix(String.valueOf(item.precio),5);
      String stock = FixMostrar.fix(String.valueOf(item.stock),5);
      contador++;
      System.out.println(numero + "       " + nombre + "        " + precio + "        " + stock);
    }
    System.out.println("Presione enter para continuar");
    entradaTeclado.nextLine();
  }
}
