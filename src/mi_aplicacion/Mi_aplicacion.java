
package mi_aplicacion;

public class Mi_aplicacion {
 
    public static void main(String[] args) {
       Juego jugador = new Juego(0,3,"ak45","Juan","Netbeans");
       Juego jugador1 = new Juego(0,3,"ak45","Pedro","Netbeans");
        System.out.println("Soy "+jugador.personaje);
        System.out.println(jugador1.personaje);
        System.out.println(jugador.mostrar_vidas());
 
    }
 
}
 