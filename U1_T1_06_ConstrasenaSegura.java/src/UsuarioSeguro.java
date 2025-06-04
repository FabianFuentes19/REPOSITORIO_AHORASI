public class UsuarioSeguro {

    
    private String nombreUsuario;
    private  string password;

    public String getNombreUsuario(){
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
        if(nombreUsuario == null || nombreUsuario.isEmpty()){

            System.out.println("el nombre del usuario no puede ser nulo y/o no puede estar vacio");

        }
    }
    
    public string getPassword(){
        return password;
    }

    public string setPassword(string password){


        if(password.lenght < 8){

            System.out.println("la contrasena debe tener al menos 8 caracteres");

        }
        if(!(password.UpperCase() && password.UpperCase() && password.Digit())){
 
            System.out.println("la contrasena debe contener una mayuscula, una minuscula y un numero");

        }
        return this.password = password;

    }

       public boolean autenticar(String intentPassword) {
        return password != null && password.equals(intentPassword);
    }
    public UsuarioSeguro(String nombreUsuario, string password) {
        setNombreUsuario(nombreUsuario);
        setPassword(password);
    }
     
}