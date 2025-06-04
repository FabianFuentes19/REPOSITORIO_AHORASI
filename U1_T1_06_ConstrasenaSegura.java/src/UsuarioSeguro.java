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

    public String setPassword(String password){


        if(password.length() < 8){

            System.out.println("la contrasena debe tener al menos 8 caracteres");

        }
boolean hasUpper = false;
boolean hasLower = false;
boolean hasDigit = false;
for (char c : password.toCharArray()) {
    if (Character.isUpperCase(c)) hasUpper = true;
    if (Character.isLowerCase(c)) hasLower = true;
    if (Character.isDigit(c)) hasDigit = true;
}
if (!(hasUpper && hasLower && hasDigit)) {
    System.out.println("la contrasena debe contener una mayuscula, una minuscula y un numero");
}
        return this.password = password;

    }

       public boolean autenticar(String intentPassword) {
        return password != null && password.equals(intentPassword);
    }
    public UsuarioSeguro(String nombreUsuario, String password2) {
        setNombreUsuario(nombreUsuario);
        setPassword(password2);
    }
     
}