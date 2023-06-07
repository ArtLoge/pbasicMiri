import utilidades.Operacion;
import utilidades.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Operacion operacion = new Operacion();
    static Scanner sc = new Scanner(System.in);

    public static void main (String[] args) {
/*        int opc = -1;
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
                    System.out.println("res: " + operacion.suma());
                    break;
                case 2:
                    System.out.println("res: " + operacion.resta());
                    break;
                case 3:
                    System.out.println("res: " + operacion.mult());
                    break;
                case 4:
                    System.out.println("res: " + operacion.divi());
                    break;
                case 5:
                    System.out.println("bye!!!");
                    break;
                default:
                    System.out.println("Esa opcion no existe");
                    break;
            }
        }*/

        List<Usuario> usuarios = new ArrayList<>();
        int opc = -1;
        while(opc != 3){
            System.out.println("REGISTRO DE USUARIOS");
            System.out.println("1.Registrar");
            System.out.println("2.Consultar");
            System.out.println("3.Salir");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    Usuario usuario = new Usuario();
                    System.out.println("Escriba el nombre");
                    sc.nextLine();
                    String nombre = sc.nextLine();
                    usuario.setNombre(nombre);
                    System.out.println("Escriba el apellido");
                    String apellido = sc.nextLine();
                    usuario.setApellido(apellido);
                    System.out.println("Escriba el edad");
                    int edad = sc.nextInt();
                    usuario.setEdad(edad);
                    usuarios.add(usuario);
                    break;
                case 2:
                    /*
                    for(int i=0; i< usuarios.size(); i = i+1) {
                        System.out.println("Nombre: " + usuarios.get(i).getNombre() + ", Apellido " + usuarios.get(i).getApellido() + ", edad: " + usuarios.get(i).getEdad());
                    }*/

                    /*
                    for(Usuario user: usuarios){
                        System.out.println("Nombre: " + user.getNombre() + ", Apellido " + user.getApellido() + ", edad: " + user.getEdad());
                    }*/

                    usuarios.forEach(u -> {
                        System.out.println("Nombre: " + u.getNombre() + ", Apellido " + u.getApellido() + ", edad: " + u.getEdad());
                    });
                    break;
                case 3:
                    System.out.println("Pues ya vayase");
                    break;
                default:
                    System.out.println("No es posible eso");
                    break;
            }
        }
    }

}