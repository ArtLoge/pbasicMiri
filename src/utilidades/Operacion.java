package utilidades;

public class Operacion {

    Leer leer = new Leer();

    public int suma () {
        int a = leer.pideUnNumero();
        int b = leer.pideUnNumero();
        return sumaDosNumeros(a, b);
    }

    public int resta () {
        int a = leer.pideUnNumero();
        int b = leer.pideUnNumero();
        return restDosNumeros(a, b);
    }
    public int mult () {
        int a = leer.pideUnNumero();
        int b = leer.pideUnNumero();
        return multDosNumeros(a, b);
    }
    public double divi () {
        int a = leer.pideUnNumero();
        int b = leer.pideUnNumero();
        return divDosNumeros(a, b);
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
