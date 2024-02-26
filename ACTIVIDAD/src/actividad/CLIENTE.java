package actividad;

import java.util.Scanner;

public class CLIENTE {

    String nit = "";
    Scanner scanner = new Scanner(System.in);

    public void ingresarNit() {
        System.out.println("Ingrese su nit: ");
        nit = scanner.nextLine();
        // System.out.print(nit);
        System.out.println("nit ingresado correctamente");
    }

    public static void main(String[] args) {
        CLIENTE objP = new CLIENTE();
        objP.ingresarNit();
    }

}