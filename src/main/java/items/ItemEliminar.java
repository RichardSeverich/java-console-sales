package items;

import contenedores.ItemsList;
import herramientas.PedirNumero;
import java.util.ArrayList;
import java.util.Scanner;

public class ItemEliminar {

  /**Metodo.*/
  public static void eliminar() {
    ArrayList<Item> itemsArrayList = ItemsList.itemsArrayList;
    Scanner leerEntradaTeclado = new Scanner(System.in);
    int tam = itemsArrayList.size();
    System.out.println("*******ELIMINACION DE ITEMS*******");
    System.out.println("");
    System.out.println("ingrese el indice que desea eliminar");
    int ind = PedirNumero.pedir();
    if (ind <= tam) {
      itemsArrayList.remove(ind - 1);
      System.out.println("se elimino el indice indicado");
    } else {
      System.out.println("elemento seleccionado inexistente");
    }
  }
}