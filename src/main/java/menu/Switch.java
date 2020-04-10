package menu;

import java.util.Scanner;
import usuarios.UsuarioSwitch;
import items.ItemSwitch;
import ventas.VentaSwitch;
//import items.ItemSwitch;

public class Switch {

	public static void mostrar() {

		Scanner entradaTeclado = new Scanner(System.in);
		int opcion = 0;

		do {
			Menu.mostrar();
			// Eligiendo una opcion
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
					// ReporteSwitch.mostrar();
					break;
				case 5:
					System.out.println("Programa terminado");
					entradaTeclado.close();
					break;
				default:
					System.out.println("Opcion Incorrecta");
			}
		} while (opcion != (5));

	}

}
