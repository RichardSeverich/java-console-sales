package ventas;

import contenedores.VentaList;
import herramientas.PedirNumero;
import java.util.ArrayList;
import java.util.Scanner;

public class VentaEliminar {

  /**Metodo.*/
  public static void eliminar() {
    ArrayList<Venta> arrayVentas = VentaList.arrayVentas;
    Scanner leerEntradaTeclado = new Scanner(System.in);
    int tam = arrayVentas.size();
    System.out.println("******* ELIMINACION DE VENTAS *******");
    System.out.println("");
    System.out.println("ingrese el indice que desea eliminar");
    int ind = PedirNumero.pedir();
    if (ind < tam) {
      arrayVentas.remove(ind);
      System.out.println("se elimino el indice indicado");
    } else {
      System.out.println("elemento seleccionado inexistente");
    }
  }
}
