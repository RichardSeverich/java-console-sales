package items;

import java.util.ArrayList;

public class ItemPredeterminado {

	public static ArrayList<Item> registrar(ArrayList<Item> ItemsArrayList) {

		Item item = new Item();
		item.nombre = "martillo";
		item.precio = 20;
		item.stock = 1;
		ItemsArrayList.add(0, item);

		Item item1 = new Item();
		item.nombre = "zapato";
		item.precio = 40;
		item.stock = 2;
		ItemsArrayList.add(1, item1);

		Item item2 = new Item();
		item.nombre = "lija";
		item.precio = 5;
		item.stock = 1;
		ItemsArrayList.add(2, item2);

		Item item3 = new Item();
		item.nombre = "pantalon";
		item.precio = 60;
		item.stock = 1;
		ItemsArrayList.add(item3);

		Item item4 = new Item();
		item.nombre = "taladro";
		item.precio = 320;
		item.stock = 1;
		ItemsArrayList.add(4, item4);

		Item item5 = new Item();
		item.nombre = "cinta";
		item.precio = 13;
		item.stock = 1;
		ItemsArrayList.add(5, item5);

		Item item6 = new Item();
		item.nombre = "cable";
		item.precio = 100;
		item.stock = 2;
		ItemsArrayList.add(6, item6);

		Item item7 = new Item();
		item.nombre = "tubo";
		item.precio = 25;
		item.stock = 1;
		ItemsArrayList.add(7, item7);

		Item item8 = new Item();
		item.nombre = "clefa";
		item.precio = 10;
		item.stock = 1;
		ItemsArrayList.add(8, item8);

		Item item9 = new Item();
		item.nombre = "cola monopol";
		item.precio = 85;
		item.stock = 1;
		ItemsArrayList.add(9, item9);

		Item item10 = new Item();
		item.nombre = "tapa de tubo";
		item.precio = 10;
		item.stock = 1;
		ItemsArrayList.add(10, item10);

		Item item11 = new Item();
		item.nombre = "alargador";
		item.precio = 15;
		item.stock = 1;
		ItemsArrayList.add(11, item11);

		return ItemsArrayList;
	}
}
