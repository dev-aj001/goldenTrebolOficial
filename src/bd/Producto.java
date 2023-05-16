
package bd;
/**
 *
 * @author jairi
 */
public class Producto {
    
    private String codigo;
    private String descripcion;
    private String marca;
    private Double precioCom;
    private Double precioVen;
    private String departameto;
    private int ventaPor;
    private String fecha;
    private int existencia;
    private int minimo;

    public Producto() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPrecioCom() {
        return precioCom;
    }

    public void setPrecioCom(Double precioCom) {
        this.precioCom = precioCom;
    }

    public Double getPrecioVen() {
        return precioVen;
    }

    public void setPrecioVen(Double precioVen) {
        this.precioVen = precioVen;
    }

    public String getDepartameto() {
        return departameto;
    }

    public void setDepartameto(String departameto) {
        this.departameto = departameto;
    }

    public int getVentaPor() {
        return ventaPor;
    }

    public void setVentaPor(int ventaPor) {
        this.ventaPor = ventaPor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public int getMinimo() {
        return minimo;
    }

    public void setMinimo(int minimo) {
        this.minimo = minimo;
    }
    
    

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", marca=" + marca + ", precioCom=" + precioCom + ", precioVen=" + precioVen + ", departameto=" + departameto + ", ventaPor=" + ventaPor + ", fecha=" + fecha
                + ", existencia=" + existencia + ", minimo=" + minimo + '}';
    }
}
