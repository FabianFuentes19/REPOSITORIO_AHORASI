import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Introduce el nombre de usuario: ");
        String nombreUsuario = sc.nextLine();

        System.out.print("Introduce la contraseña: ");
        String password = sc.nextLine();

        UsuarioSeguro usuario = new UsuarioSeguro(nombreUsuario, password);


      
        System.out.print("\nIntroduce la contrasena para autenticar: ");
        String intento = sc.nextLine();

        if (usuario.autenticar(intento)) {
            System.out.println("Autenticación exitosa.");
        } else {
            System.out.println("Autenticación fallida.");
        }
        sc.close();
    }
}