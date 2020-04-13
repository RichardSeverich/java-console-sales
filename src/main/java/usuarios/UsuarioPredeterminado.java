package usuarios;

import java.util.ArrayList;

public class UsuarioPredeterminado {

	public static ArrayList<Usuario> registrar(ArrayList<Usuario> usuariosArrayList) {

		Usuario usuario = new Usuario();
		usuario.nickname = "admin";
		usuario.password = "admin123";
		usuario.nombres = "micky";
		usuario.apellidos = "aguilar";
		usuario.edad = 25;
		usuario.tipo = "administrador";
		usuariosArrayList.add(0, usuario);

		Usuario usuario1 = new Usuario();
		usuario1.nickname = "admin";
		usuario1.password = "admin123";
		usuario1.nombres = "richard";
		usuario1.apellidos = "paredes";
		usuario1.edad = 30;
		usuario1.tipo = "administrador";
		usuariosArrayList.add(1, usuario1);

		Usuario usuario2 = new Usuario();
		usuario2.nickname = "admin";
		usuario2.password = "admin123";
		usuario2.nombres = "charly";
		usuario2.apellidos = "meneces";
		usuario2.edad = 25;
		usuario2.tipo = "administrador";
		usuariosArrayList.add(2, usuario2);

		Usuario usuario3 = new Usuario();
		usuario3.nickname = "admin";
		usuario3.password = "admin123";
		usuario3.nombres = "miguel";
		usuario3.apellidos = "aguilar";
		usuario3.edad = 25;
		usuario3.tipo = "administrador";
		usuariosArrayList.add(3, usuario3);

		Usuario usuario4 = new Usuario();
		usuario4.nickname = "vende";
		usuario4.password = "vende123";
		usuario4.nombres = "fernando";
		usuario4.apellidos = "borda";
		usuario4.edad = 25;
		usuario4.tipo = "vendedor";
		usuariosArrayList.add(4, usuario4);

		Usuario usuario5 = new Usuario();
		usuario5.nickname = "vende";
		usuario5.password = "vende123";
		usuario5.nombres = "leonardo";
		usuario5.apellidos = "zurita";
		usuario5.edad = 29;
		usuario5.tipo = "vendedor";
		usuariosArrayList.add(5, usuario5);

		Usuario usuario6 = new Usuario();
		usuario6.nickname = "vende";
		usuario6.password = "vende123";
		usuario6.nombres = "roberto";
		usuario6.apellidos = "pinto";
		usuario6.edad = 25;
		usuario6.tipo = "vendedor";
		usuariosArrayList.add(6, usuario6);

		Usuario usuario7 = new Usuario();
		usuario7.nickname = "vende";
		usuario7.password = "vende123";
		usuario7.nombres = "boris";
		usuario7.apellidos = "rojas";
		usuario7.edad = 45;
		usuario7.tipo = "vendedor";
		usuariosArrayList.add(7, usuario7);

		Usuario usuario8 = new Usuario();
		usuario8.nickname = "vendedor";
		usuario8.password = "vendedor123";
		usuario8.nombres = "kevin";
		usuario8.apellidos = "perez";
		usuario8.edad = 55;
		usuario8.tipo = "vendedor";
		usuariosArrayList.add(8, usuario8);

		Usuario usuario9 = new Usuario();
		usuario9.nickname = "vende";
		usuario9.password = "vende123";
		usuario9.nombres = "jose";
		usuario9.apellidos = "lopez";
		usuario9.edad = 30;
		usuario9.tipo = "vendedor";
		usuariosArrayList.add(9, usuario9);

		Usuario usuario10 = new Usuario();
		usuario10.nickname = "vende";
		usuario10.password = "vende123";
		usuario10.nombres = "luis";
		usuario10.apellidos = "velazco";
		usuario10.edad = 29;
		usuario10.tipo = "vendedor";
		usuariosArrayList.add(10, usuario10);

		return usuariosArrayList;
	}
}
