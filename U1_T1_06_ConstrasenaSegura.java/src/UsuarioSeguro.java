public class UsuarioSeguro {

    
    private String nombreUsuario;
    private  String password;

    public String getNombreUsuario(){
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
        if(nombreUsuario == null || nombreUsuario.isEmpty()){

            System.out.println("el nombre del usuario no puede ser nulo y/o no puede estar vacio");

        }
    }
    
    public String getPassword(){
        return password;
    }
    public void setPassword(String password) {
     
        if (password.length() < 8) {
            System.out.println("La contrasena debe tener al menos 8 caracteres.");
            return;

            
        }

        boolean mayuscula = false;
        boolean minuscula = false;
        boolean digito = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (c >= 'A' && c <= 'Z') mayuscula = true;
            if (c >= 'a' && c <= 'z') minuscula = true;
            if (c >= '0' && c <= '9') digito = true;
        }

        if (!mayuscula) {
            System.out.println("La contrasena debe contener al menos una letra mayuscula.");
            return;
        }
        if (!minuscula) {
            System.out.println("La contrasena debe contener al menos una letra minuscula.");
            return;
        }
        if (!digito) {
            System.out.println("La contrasena debe contener al menos un digito.");
            return;
        }

        this.password = password;
    }

       public boolean autenticar(String intentPassword) {
        return password != null && password.equals(intentPassword);
    }
    public UsuarioSeguro(String nombreUsuario, String password2) {
        setNombreUsuario(nombreUsuario);
        setPassword(password2);
    }
     
}