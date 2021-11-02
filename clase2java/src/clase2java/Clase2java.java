
package clase2java;

import java.util.Scanner;

public class Clase2java {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su contrasena: ");
        String pass = scanner.nextLine();
        Ingreso ing = new Ingreso();
        ing.setUsuario(nombre);
        ing.setPass(pass);
        System.out.println(ing.Validar());
     
//         if ("Valentin".equals(nombre)) {
//            System.out.println ("Bienvenido " + nombre);
//
//         } else {
//            System.out.println("El usuario es incorrecto");
//        }
    }
}
