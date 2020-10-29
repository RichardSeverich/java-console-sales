package items;

import contenedores.ItemsList;
import java.util.ArrayList;

public class ItemPredeterminado {

  /**Metodo.*/
  public static void registrar() {
    ArrayList<Item> itemsArrayList = ItemsList.itemsArrayList;
    Item item = new Item();
    item.nombre = "martillo";
    item.precio = 20;
    item.stock = 1;
    itemsArrayList.add(0, item);

    Item item1 = new Item();
    item1.nombre = "zapato";
    item1.precio = 40;
    item1.stock = 2;
    itemsArrayList.add(1, item1);

    Item item2 = new Item();
    item2.nombre = "lija";
    item2.precio = 5;
    item2.stock = 1;
    itemsArrayList.add(2, item2);

    Item item3 = new Item();
    item3.nombre = "pantalon";
    item3.precio = 60;
    item3.stock = 1;
    itemsArrayList.add(item3);

    Item item4 = new Item();
    item4.nombre = "taladro";
    item4.precio = 320;
    item4.stock = 1;
    itemsArrayList.add(4, item4);

    Item item5 = new Item();
    item5.nombre = "cinta";
    item5.precio = 13;
    item5.stock = 1;
    itemsArrayList.add(5, item5);

    Item item6 = new Item();
    item6.nombre = "cable";
    item6.precio = 100;
    item6.stock = 2;
    itemsArrayList.add(6, item6);

    Item item7 = new Item();
    item7.nombre = "tubo";
    item7.precio = 25;
    item7.stock = 1;
    itemsArrayList.add(7, item7);

    Item item8 = new Item();
    item8.nombre = "clefa";
    item8.precio = 10;
    item8.stock = 1;
    itemsArrayList.add(8, item8);

    Item item9 = new Item();
    item9.nombre = "cola monopol";
    item9.precio = 85;
    item9.stock = 1;
    itemsArrayList.add(9, item9);

    Item item10 = new Item();
    item10.nombre = "tapa de tubo";
    item10.precio = 10;
    item10.stock = 1;
    itemsArrayList.add(10, item10);

    Item item11 = new Item();
    item11.nombre = "alargador";
    item11.precio = 15;
    item11.stock = 1;
    itemsArrayList.add(11, item11);
  }
}
