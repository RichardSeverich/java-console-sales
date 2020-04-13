package menu;

import java.util.Scanner;

public class Switch {

	public static void mostrar() {
		Scanner entradaTeclado = new Scanner(System.in);
		int opcion = 0;
		do {
			// Menu
			Menu.mostrar();
			// try catch opcion numerica
			opcion = PedirOpcion.mostrar();
			// Switch
			opcion = ElegirOpcion.mostrar();
		} while (opcion != (4));

	}

}
