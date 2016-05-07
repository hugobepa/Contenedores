
package contenedores;


public class Persona {
    
    private String codigo;
    private String nombre;
    private String edad;

    public Persona() {
    }

    public Persona(String codigo, String nombre, String edad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    
    
    
    
}
