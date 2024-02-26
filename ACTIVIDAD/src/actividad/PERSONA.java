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
    }

    public void leer(){
        System.out.print(Nombre+"\n"+Apellido+"\n"+Direccion+"\n"+Telefono+"\n"+FechaNac);
    }

    public void actualizar(){
        System.out.println("Ingrese nuevo nombre: ");
        Nombre = scanner.nextLine();
        System.out.println("Ingrese nuevo apellido: ");
        Apellido = scanner.nextLine();
        System.out.println("Ingrese nueva direccio: ");
        Direccion = scanner.nextLine();
        System.out.println("Ingrese nuevo telefono: ");
        Telefono = scanner.nextLine();
        System.out.println("Ingrese nueva fecha de nacimiento: ");
        FechaNac = scanner.nextLine();
        scanner.close();
    }

}
