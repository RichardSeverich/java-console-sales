import items.ItemPredeterminado;
import login.Login;
import menu.Switch;
import usuarios.UsuarioPredeterminado;
import usuarios.UsuarioSwitch;
import ventas.VentaPredeterminada;

public class Main {

  /**Metodo.*/
  public static void main(String[] args) {
    UsuarioPredeterminado.registrar();
    ItemPredeterminado.registrar();
    VentaPredeterminada.registrar();
    Login.mostrar();
    Switch.mostrar();
  }
}
