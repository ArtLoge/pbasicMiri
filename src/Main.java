import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main (String[] args) {
        int opc = -1;
        while(opc != 5) {
            System.out.println("CALCULADORA :D!");
            System.out.println("1.Suma");
            System.out.println("2.Resta");
            System.out.println("3.Multiplicacion");
            System.out.println("4.Division");
            System.out.println("5.Salir");
            System.out.println("Digite la opcion deseada: ");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    suma();
                    break;
                case 2:
                    resta();
                    break;
                case 3:
                    mult();
                    break;
                case 4:
                    divi();
                    break;
                case 5:
                    System.out.println("bye!!!");
                    break;
                default:
                    System.out.println("Esa opcion no existe");
                    break;
            }
        }
    }

    private static int suma () {
        int a = pideUnNumero();
        int b = pideUnNumero();
        return sumaDosNumeros(a, b);
    }

    private static int resta () {
        int a = pideUnNumero();
        int b = pideUnNumero();
        return restDosNumeros(a, b);
    }
    private static int mult () {
        int a = pideUnNumero();
        int b = pideUnNumero();
        return multDosNumeros(a, b);
    }
    private static double divi () {
        int a = pideUnNumero();
        int b = pideUnNumero();
        return divDosNumeros(a, b);
    }

    private static int pideUnNumero() {
        System.out.println("Ingresa un numero: ");
        return sc.nextInt();
    }

    private static int sumaDosNumeros(int a, int b) {
        return (a + b);
    }
    private static int restDosNumeros(int a, int b) {
        return (a - b);
    }
    private static int multDosNumeros(int a, int b) {
        return (a * b);
    }
    private static double divDosNumeros(int a, int b) {
        return (a / b);
    }
}