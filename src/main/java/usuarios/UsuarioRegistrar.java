package usuarios;

import java.util.Scanner;


public class UsuarioRegistrar {
	
	public static int contadorStatic;
	
	public static Usuario[] registrar(Usuario[] arrayUsuarios, int contador){
			Scanner leerEntradaTeclado = new Scanner(System.in);
			System.out.println("Entroo Registrar ");
			// Añadir usuario
			Usuario usuario = new Usuario();
			// Nombres
			System.out.println("Ingrese el nombre Usuario");
			usuario.nombres = leerEntradaTeclado.nextLine();
			// Apellidos
			System.out.println("Ingrese el Apellidos Usuario");
			usuario.apellidos = leerEntradaTeclado.nextLine();
			// Edad
			System.out.println("Ingrese edad ");
			usuario.edad = Integer.parseInt(leerEntradaTeclado.nextLine());
			// Tipo
			System.out.println("Igrese tipo");
			usuario.tipo = leerEntradaTeclado.nextLine();
			// Añadir al array de usuarios:
			arrayUsuarios[contador] = usuario;
			contador++;
			contadorStatic = contador;
			return arrayUsuarios;
	}
}
