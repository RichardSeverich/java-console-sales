package menu;

import java.util.Scanner;
import usuarios.UsuarioSwitch;
import items.ItemSwitch;
import ventas.VentaSwitch;

public class ElegirOpcion {

	public static int mostrar() {
		// Eligiendo una opcion
		Scanner entradaTeclado = new Scanner(System.in);
		int opcion = 0;
		opcion = Integer.parseInt(entradaTeclado.nextLine());

		switch (opcion) {
			case 1:
				UsuarioSwitch.mostrar();
				break;
			case 2:
				ItemSwitch.mostrar();
				break;
			case 3:
				VentaSwitch.mostrar();
				break;
			case 4:
				System.out.println("Programa terminado");
				entradaTeclado.close();
				break;
			default:
				System.out.println("Opcion Incorrecta");
		}
		return opcion;
	}
}
