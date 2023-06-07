package utilidades;

import java.util.Scanner;

public class Leer {

    Scanner sc = new Scanner(System.in);

    public int pideUnNumero() {
        System.out.println("Ingresa un numero: ");
        return sc.nextInt();
    }
}
