package login;

import java.util.Scanner;

public class Login {

	public static void mostrar() {
		Scanner entrada = new Scanner(System.in);
		String nickname = "";
		String contrasena = "";

		do {
			System.out.println("Ingresa nickname de usuario");
			nickname = entrada.nextLine();
			System.out.println("Ingrese la contrasena");
			contrasena = entrada.nextLine();

			if (nickname.equalsIgnoreCase("admin") && contrasena.equalsIgnoreCase("admin123")) {
				System.out.println("nickname y contrasena correcto");
			} else {
				System.out.println("usuario o contraseña incorrecto");
			}

		} while (!nickname.equalsIgnoreCase("admin") || !contrasena.equalsIgnoreCase("admin123"));

	}

}