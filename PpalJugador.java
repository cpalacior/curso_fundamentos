//recordar cambiar la clase de este codigo//
import java.util.Scanner;
public class PpalJugador{
    public static void main(String[]args){
        Jugador jugador1 = new Jugador();
        Scanner pedi = new Scanner(System.in);
        int salud = pedi.nextInt();
        jugador1.setSalud(salud);
        String nombre = pedi.next();
        jugador1.setNombre(nombre);
        int np = pedi.nextInt();
        jugador1.reducirSalud(np);
        int np2 = pedi.nextInt();
        jugador1.reducirSalud(np2);
        jugador1.getNombre();
        System.out.print(jugador1.getNombre());
        jugador1.getSalud();
        System.out.print(jugador1.getSalud());
    }
}