package ventas;

import contenedores.ItemsList;
import contenedores.VentaList;
import items.Item;
import java.util.Scanner;
import java.util.ArrayList;

public class VentaItemRegistrar {

  /**Metodo.*/
  public static void registrar() {
    ArrayList<Venta> arrayVentas = VentaList.arrayVentas;
    ArrayList<Item> arrayItems = ItemsList.itemsArrayList;
    Scanner leerEntradaTeclado = new Scanner(System.in);
    System.out.println("******** VENTAS REGISTRAR ITEM *********");
    System.out.println("");
    // Obteniendo indice de la venta
    System.out.println("ingrese indice de la venta");
    int indVenta = Integer.parseInt(leerEntradaTeclado.nextLine());
    Venta venta = arrayVentas.get(indVenta);
    // obteniendo indice del Item
    System.out.println("ingrese el indice del Item");
    int indItem = Integer.parseInt(leerEntradaTeclado.nextLine());
    Item item = arrayItems.get(indItem);
    venta.setProducto(item);
  }
}
