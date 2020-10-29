package ventas;

import contenedores.VentaList;
import herramientas.FixMostrar;
import items.Item;
import java.util.ArrayList;
import java.util.Scanner;

public class VentaMostrar {

  /**Metodo.*/
  public static void mostrar() {
    Scanner entradaTeclado = new Scanner(System.in);
    ArrayList<Venta> arrayVentas = VentaList.arrayVentas;
    System.out.println("******* MOSTRAR VENTAS *******");
    System.out.println("");
    for (Venta venta : arrayVentas) {
      System.out.print("\n");
      System.out.println("========================================");
      System.out.println("Venta fecha: " + venta.fecha);
      System.out.println("Venta Cliente: " + venta.cliente.nombres);
      System.out.println("========================================");
      System.out.println("Numero      Nombre     precio     stock");
      int contador = 0;
      for (Item item : venta.getProductos()) {
        String numero = FixMostrar.fix(String.valueOf(contador),12);
        String nombre = FixMostrar.fix(item.nombre,12);
        String precio =  FixMostrar.fix(String.valueOf(item.precio),11);
        String stock =  FixMostrar.fix(String.valueOf(item.stock),12);
        contador++;
        System.out.println(numero + nombre + precio + stock);
      }
      System.out.print("\n");
    }
    System.out.println("Presione enter para continuar");
    entradaTeclado.nextLine();
  }
}
