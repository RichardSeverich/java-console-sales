package menu;

import java.util.Scanner;

public class PedirOpcion {

	public static int mostrar() {
		Scanner entrada = new Scanner(System.in);
		int opcion = 0;
		// Pidiendo una opcion "correcta"
		boolean repeticion = true;
		while (repeticion) {// Validaciones
			try {
				System.out.println("");
				System.out.println("** INGRESE UNA OPCION NUMERICA PORFAVOR **");
				opcion = entrada.nextInt();
				repeticion = false;
				// hagarra el error
			} catch (Exception e) {
				System.out.println("");
				System.out.println("** OPCION INCORRECTA INGRESE UN NUMERO **");
				System.out.println(e);

				entrada.reset();
				entrada.next();
			}
		}
		return opcion;

	}

}