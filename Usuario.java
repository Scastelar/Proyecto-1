
package proyectoi_prograii;

public class Usuario {
    
    private String cuenta;
    private String password;
    
    public Usuario (String cuenta, String password){
        this.cuenta = cuenta;
        this.password = password;
    }
    
    public String getCuenta(){
        return cuenta;
    }
    
    public String getPassword(){
        return password;
    }
    
    public String toString() {
        return "Username =" + cuenta + ", Contraseña =" + password;
    }
    
}
