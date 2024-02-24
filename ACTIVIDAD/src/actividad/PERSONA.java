package actividad;

import java.util.Scanner;


public class PERSONA {

    String Nombre = "";
    String Apellido = "";
    String Direccion = "";
    String Telefono = "";
    String FechaNac = "";

    Scanner scanner = new Scanner(System.in);

    public void crear() {
        System.out.println("Ingrese su nombre: ");
        Nombre = scanner.nextLine();
        System.out.println("Ingrese su apellido: ");
        Apellido = scanner.nextLine();
        System.out.println("Ingrese su direccio: ");
        Direccion = scanner.nextLine();
        System.out.println("Ingrese su telefono: ");
        Telefono = scanner.nextLine();
        System.out.println("Ingrese su fecha de nacimiento: ");
        FechaNac = scanner.nextLine();
        scanner.close();
        System.out.print(Nombre+" "+Apellido+" "+Direccion+" "+Telefono+" "+FechaNac);
    }

}
