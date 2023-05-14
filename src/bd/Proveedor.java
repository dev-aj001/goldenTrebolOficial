
package bd;


public class Proveedor {
    
    private int idProveedor;
    private String Nombre;
    private String Correo;
    private String Telefono;
    private String RFC;
    
    public Proveedor(){
        
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "idProveedor=" + idProveedor + ", Nombre=" + Nombre + ", Correo=" + Correo + ", Telefono=" + Telefono + ", RFC=" + RFC + '}';
    }
    
    
    
    
}
