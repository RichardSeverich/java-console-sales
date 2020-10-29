package ventas;

import contenedores.ItemsList;
import contenedores.UsuariosList;
import contenedores.VentaList;
import items.Item;
import java.util.ArrayList;
import usuarios.Usuario;

public class VentaPredeterminada {

  /**Metodo.*/
  public static void registrar() {
    ArrayList<Venta> arrayVentas = VentaList.arrayVentas;
    ArrayList<Usuario> arrayUsuarios = UsuariosList.usuariosArrayList;
    ArrayList<Item> arrayItems = ItemsList.itemsArrayList;

    Venta venta1 = new Venta();
    venta1.fecha = "01-02-2018";
    venta1.cliente = arrayUsuarios.get(2);
    venta1.setProducto(arrayItems.get(2));
    venta1.getProductos().add(arrayItems.get(4));
    arrayVentas.add(venta1);

    Venta venta2 = new Venta();
    venta2.fecha = "01-02-2018";
    venta2.cliente = arrayUsuarios.get(1);
    venta2.setProducto(arrayItems.get(3));
    venta2.getProductos().add(arrayItems.get(3));
    arrayVentas.add(venta2);

    Venta venta3 = new Venta();
    venta3.fecha = "01-02-2018";
    venta3.cliente = arrayUsuarios.get(8);
    venta3.setProducto(arrayItems.get(10));
    venta3.getProductos().add(arrayItems.get(6));
    arrayVentas.add(venta3);

    Venta venta4 = new Venta();
    venta4.fecha = "01-02-2018";
    venta4.cliente = arrayUsuarios.get(5);
    venta4.setProducto(arrayItems.get(2));
    venta4.getProductos().add(arrayItems.get(5));
    arrayVentas.add(venta4);

    Venta venta5 = new Venta();
    venta5.fecha = "01-02-2018";
    venta5.cliente = arrayUsuarios.get(6);
    venta5.setProducto(arrayItems.get(7));
    venta5.getProductos().add(arrayItems.get(2));
    arrayVentas.add(venta5);
  }
}
