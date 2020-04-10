package ventas;

import items.Item;
import java.util.ArrayList;
import usuarios.Usuario;

public class Venta {
	public String fecha;
	public Usuario cliente;
	private ArrayList<Item> listaProductos = new ArrayList<>();

	public Venta() {
		this.listaProductos = new ArrayList<>();
	}

	public void setProducto(Item item) {
		this.listaProductos.add(item);
	}

	public ArrayList<Item> getProductos() {
		return listaProductos;
	}
}