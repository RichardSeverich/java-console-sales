package ventas;

import java.util.Scanner;
import java.util.ArrayList;

import usuarios.Usuario;

public class VentaRegistrar {
	public static ArrayList<Venta> registrar(ArrayList<Venta> arrayVentas, ArrayList<Usuario> arrayUsuarios) {
		Scanner leerEntradaTeclado = new Scanner(System.in);
		System.out.println("******* VENTAS REGISTRAR *******");
		System.out.println("");
		// obteniendo fecha
		System.out.println("Ingrese fecha de venta: ");
		String fecha = leerEntradaTeclado.nextLine();
		// obteniendo indice del cliente
		System.out.println("ingrese indice del cliente");
		int indCliente = Integer.parseInt(leerEntradaTeclado.nextLine());
		Usuario cliente = arrayUsuarios.get(indCliente);
		// Registrando la venta
		Venta venta = new Venta();
		venta.fecha = fecha;
		venta.cliente = cliente;
		arrayVentas.add(venta);
		return arrayVentas;
	}
}
