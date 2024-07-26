
package proyectoi_prograii;

import javax.swing.JOptionPane;


public class cuentasStratego {
    
    private Usuario cuentas[];
    private int contador;
    
    public cuentasStratego(int contador){
        cuentas = new Usuario[100];
        this.contador = 0;
    }
    
   private Usuario buscar(String cuenta) {
    for (Usuario usuario : cuentas) {
        if (usuario != null && usuario.getCuenta().equals(cuenta)) {
            return usuario;
        }
    }
    return null;
}
   
    public boolean agregarCuenta (String account, String password1){
        if (password1.length() != 5){
            JOptionPane.showMessageDialog(null, "La contraseña debe ser de 5 caracteres.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (buscar(account)==null){
            for(int pos=0; pos < cuentas.length; pos++){
                if(cuentas[pos]==null){
                    cuentas[pos]= new Usuario(account,password1);
                   System.out.println("Cuenta agregada: " + account);
                    imprimirCuentas(); 
                    return true;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Usuario ya existente.", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }
     
    public boolean validarCuenta (String account, String password1){
        Usuario usuario = buscar(account);
        if (buscar(account)!=null){
        } 
                for(int pos=0; pos < cuentas.length; pos++){
                    if(cuentas[pos]!=null){
                        if (usuario.getPassword().equals(password1)){
                        JOptionPane.showMessageDialog(null, "Ingreso a la cuenta exitoso.");
                        return true;
                        }
                    }
                }
            JOptionPane.showMessageDialog(null, "Usuario o contraseña inválidos.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
            
    }
    
    /*
    public boolean validarCuenta (String account, String password1){
        Usuario usuario = buscar(account);
        if (usuario == null){
           return false;
        }
        if (usuario.getPassword().equals(password1)){
            JOptionPane.showMessageDialog(null, "Ingreso a la cuenta exitoso.");
            return true;
        }
        JOptionPane.showMessageDialog(null, "Usuario o contraseña inválidos.", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    */
    public void imprimirCuentas() {
        System.out.println("Cuentas almacenadas:");
        for (Usuario usuario : cuentas) {
            if (usuario != null) {
                System.out.println(usuario);
            }
        }
    }
    
    
}
