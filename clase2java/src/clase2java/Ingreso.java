package clase2java;

public class Ingreso {

    private String usuario, pass;

    private String miUsuario="Valentin";
    private String miPass="123456";
            
            
    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String u) {
        this.usuario = u;
    }

    public String getPass() {
        return this.pass;
    }

    public void setPass(String p) {
        this.pass = p;

    }
    
    public boolean Validar(){
        return miUsuario.equals(this.usuario) && miPass.equals(this.pass);
    }
}
