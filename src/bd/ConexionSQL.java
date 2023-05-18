package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jairi
 */
public class ConexionSQL {
    
    public static Connection mConection;
    public static Statement mStatement;
    public static ResultSet mResultSet;
    
    public static String db;
    public static String pass;
    public static String user;
    
    
    public ConexionSQL(String db, String user, String pass) {
        mConection = null;
        mStatement = null;
        mResultSet = null;
        this.user = user;
        this.db = db;
        this.pass = pass;
    }
    
    public boolean Conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            mConection=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+db, user, pass);
            System.err.println("conectado");
            return mConection != null;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return false;
        }
    }
    
    public void Desconectar(){
        try {
            this.mConection.close();
        } catch (Exception e) {
        }
    }
    
    // Metodos para Añadir
    public boolean AddUser(Usuario mUser){
        try {
            mStatement = mConection.createStatement();
            mStatement.execute("INSERT INTO trebolDB.usuario (nombre, apellidos, edad, rfc, rol, telefono, user, pass) "+
                    " VALUES ('"+mUser.getNombre()+"', '"+mUser.getApellidos()+"', "+String.valueOf(mUser.getEdad())+", '"+mUser.getRFC()+"', '"+mUser.getRol()+"', '"+mUser.getTelefono()+"', '"+mUser.getUser()+"', '"+mUser.getPass()+"');");
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean AddProveedor(Proveedor mProv){
        try {
            mStatement = mConection.createStatement();
            mStatement.execute("INSERT INTO proveedor (nombre, correo, telefono, rfc) "+
                    " VALUES ('"+mProv.getNombre()+"', '"+mProv.getCorreo()+"', '"+mProv.getTelefono()+"', '"+mProv.getRFC()+"');");
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public boolean AddProducto(Producto mProduc){
        try {
            mStatement = mConection.createStatement();
            mStatement.execute("INSERT INTO producto (codigo, descripcion, marca, precioCompra, precioVenta, departamento, ventaPor, fechaCad) "+
                    " VALUES ('"+mProduc.getCodigo()+"', '"+mProduc.getDescripcion()
                    +"', '"+mProduc.getMarca()
                    +"', "+String.valueOf(mProduc.getPrecioCom())
                    +", "+String.valueOf(mProduc.getPrecioVen())
                    +", '"+mProduc.getDepartameto()
                    +"', "+String.valueOf(mProduc.getVentaPor())
                    +", '"+mProduc.getFecha()+"' "+");");
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    
    
    // Metodos para Consultar 1
    
    public Usuario GetUser(String user){
        Usuario mUsuario = null;
        try {
            mStatement = mConection.createStatement();
            mResultSet = mStatement.executeQuery("SELECT * FROM usuario WHERE user = '"+user+"' ");
            
            while(mResultSet.next()){
                mUsuario = new Usuario();
                mUsuario.setIdUsuario(mResultSet.getInt("idUsuario"));
                mUsuario.setNombre(mResultSet.getString("nombre"));
                mUsuario.setApellidos(mResultSet.getString("apellidos"));
                mUsuario.setEdad(mResultSet.getInt("edad"));
                mUsuario.setRFC(mResultSet.getString("rfc"));
                mUsuario.setRol(mResultSet.getString("rol"));
                mUsuario.setTelefono(mResultSet.getString("telefono"));
                mUsuario.setUser(mResultSet.getString("user"));
                mUsuario.setPass(mResultSet.getString("Pass"));
                return mUsuario;
            }
            
        } catch (Exception e) {
        }
        return mUsuario;
    }
    
    public Proveedor GetProveedor(int id){
        Proveedor mProv = null;
        try {
            mStatement = mConection.createStatement();
            mResultSet = mStatement.executeQuery("SELECT * FROM proveedor WHERE idproveedor = "+id+" ");
            
            while(mResultSet.next()){
                mProv = new Proveedor();
                mProv.setIdProveedor(mResultSet.getInt("idProveedor"));
                mProv.setNombre(mResultSet.getString("nombre"));
                mProv.setCorreo(mResultSet.getString("correo"));
                mProv.setTelefono(mResultSet.getString("telefono"));
                mProv.setRFC(mResultSet.getString("RFC"));
                return mProv;
            }
            
        } catch (Exception e) {
        }
        return mProv;
    }
    
    public Producto GetProducto(String codigo){
        Producto mProduc = null;
        try {
            mStatement = mConection.createStatement();
            mResultSet = mStatement.executeQuery("SELECT * FROM producto WHERE codigo = '"+codigo+"' ");
            
            while(mResultSet.next()){
                mProduc = new Producto();
                mProduc.setCodigo(mResultSet.getString("codigo"));
                mProduc.setDescripcion(mResultSet.getString("descripcion"));
                mProduc.setMarca(mResultSet.getString("marca"));
                mProduc.setPrecioCom(mResultSet.getDouble("precioCompra"));
                mProduc.setPrecioVen(mResultSet.getDouble("precioVenta"));
                mProduc.setDepartameto(mResultSet.getString("departamento"));
                mProduc.setVentaPor(mResultSet.getInt("ventaPor"));
                mProduc.setFecha(mResultSet.getDate("fechaCad").toString());
                mProduc.setExistencia(mResultSet.getInt("existencia"));
                mProduc.setMinimo(mResultSet.getInt("minimo"));
                return mProduc;
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return mProduc;
    }
    
    public Configurar GetConfig(int id){
        Configurar mConfig = null;
        try {
            mStatement = mConection.createStatement();
            mResultSet = mStatement.executeQuery("SELECT * FROM config WHERE idconfig = "+id+" ");
            
            while(mResultSet.next()){
                mConfig = new Configurar();
                mConfig.setId(mResultSet.getInt("idconfig"));
                mConfig.setGanancia(mResultSet.getDouble("ganancia"));
                mConfig.setDb(mResultSet.getString("db"));
                mConfig.setSucursal(mResultSet.getString("sucursal"));
                mConfig.setDireccion(mResultSet.getString("direccion"));
                mConfig.setRfc(mResultSet.getString("rfc"));
                mConfig.setCorreo(mResultSet.getString("correo"));
                mConfig.setTel1(mResultSet.getString("tel"));
                mConfig.setTel2(mResultSet.getString("tel2"));
                mConfig.setPagina(mResultSet.getString("pagina"));
                mConfig.setIva(mResultSet.getInt("iva"));
                mConfig.setAlerta(mResultSet.getInt("alerta"));
                mConfig.setDias(mResultSet.getInt("dias"));
                return mConfig;
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return mConfig;
    }
    
    
    // Metodos para Arreglos
    public ArrayList GetUsuarios(){
        ArrayList Usuarios = new ArrayList();
        Usuario mUsuario = null;
        try {
            mStatement = mConection.createStatement();
            mResultSet = mStatement.executeQuery("SELECT * FROM usuario");
            while(mResultSet.next()){
                mUsuario = new Usuario();
                mUsuario.setIdUsuario(mResultSet.getInt("idUsuario"));
                mUsuario.setNombre(mResultSet.getString("nombre"));
                mUsuario.setApellidos(mResultSet.getString("apellidos"));
                mUsuario.setEdad(mResultSet.getInt("edad"));
                mUsuario.setRFC(mResultSet.getString("rfc"));
                mUsuario.setRol(mResultSet.getString("rol"));
                mUsuario.setTelefono(mResultSet.getString("telefono"));
                mUsuario.setUser(mResultSet.getString("user"));
                mUsuario.setPass(mResultSet.getString("Pass"));
                Usuarios.add(mUsuario);
            }
        } catch (Exception e) {
            return null;
        }
        
        return Usuarios;
    }
    
    
    public ArrayList GetProveedores(){
        ArrayList Proveedores = new ArrayList();
        Proveedor mProv = null;
        try {
            mStatement = mConection.createStatement();
            mResultSet = mStatement.executeQuery("SELECT * FROM proveedor");
            while(mResultSet.next()){
                mProv = new Proveedor();
                mProv.setIdProveedor(mResultSet.getInt("idProveedor"));
                mProv.setNombre(mResultSet.getString("nombre"));
                mProv.setCorreo(mResultSet.getString("correo"));
                mProv.setTelefono(mResultSet.getString("telefono"));
                mProv.setRFC(mResultSet.getString("RFC"));
                Proveedores.add(mProv);
            }
        } catch (Exception e) {
            return null;
        }
        
        return Proveedores;
    }
    
    public ArrayList GetProductos(){
        ArrayList Productos = new ArrayList();
        Producto mProduc = null;
        try {
            mStatement = mConection.createStatement();
            mResultSet = mStatement.executeQuery("SELECT * FROM producto");
            while(mResultSet.next()){
                mProduc = new Producto();
                mProduc.setCodigo(mResultSet.getString("codigo"));
                mProduc.setDescripcion(mResultSet.getString("descripcion"));
                mProduc.setMarca(mResultSet.getString("marca"));
                mProduc.setPrecioCom(mResultSet.getDouble("precioCompra"));
                mProduc.setPrecioVen(mResultSet.getDouble("precioVenta"));
                mProduc.setDepartameto(mResultSet.getString("departamento"));
                mProduc.setVentaPor(mResultSet.getInt("ventaPor"));
                mProduc.setFecha(mResultSet.getDate("fechaCad").toString());
                mProduc.setExistencia(mResultSet.getInt("existencia"));
                mProduc.setMinimo(mResultSet.getInt("minimo"));
                Productos.add(mProduc);
            }
        } catch (Exception e) {
            System.out.println("Cargar productos: " + e);
            return null;
        }
        
        return Productos;
    }
    
    // Metodos para eliminar
    public void EliminarUsuario(String user){
        try {
            mStatement = mConection.createStatement();
            mStatement.execute("DELETE FROM usuario WHERE user = '"+user+"'");
            
        } catch (Exception e) {
            
        }
    }
    
    public void EliminarProveedor(int id){
        try {
            mStatement = mConection.createStatement();
            mStatement.execute("DELETE FROM proveedor WHERE idProveedor = "+id);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void EliminarProducto(String codigo){
        try {
            mStatement = mConection.createStatement();
            mStatement.execute("DELETE FROM producto WHERE codigo = '"+codigo+"' ");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    // Metodos para Modificar
    public void ModificarUsuario(Usuario mUsuario){
        try {
            mStatement = mConection.createStatement();
            mStatement.execute("UPDATE usuario SET "
                    +"nombre = '"+mUsuario.getNombre()+"',"
                    +"apellidos = '"+mUsuario.getApellidos()+"',"
                    +"edad = "+mUsuario.getEdad()+","
                    +"rfc = '"+mUsuario.getRFC()+"',"
                    +"rol = '"+mUsuario.getRol()+"',"
                    +"telefono = '"+mUsuario.getTelefono()+"',"
                    +"user = '"+mUsuario.getUser()+"',"
                    +"pass = '"+mUsuario.getPass()+"' "
                    +"WHERE user='"+mUsuario.getUser()+"'"
            );
            
        } catch (Exception e) {
            
        }
    }
    
    public void ModificarProveedor(Proveedor mProv){
        try {
            mStatement = mConection.createStatement();
            mStatement.execute("UPDATE proveedor SET "
                    +"nombre = '"+mProv.getNombre()+"',"
                    +"correo = '"+mProv.getCorreo()+"',"
                    +"telefono = "+mProv.getTelefono()+","
                    +"RFC = '"+mProv.getRFC()+"' "
                    +"WHERE idProveedor="+mProv.getIdProveedor()+""
            );
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void ModificarProducto(Producto mProduc){
        try {
            mStatement = mConection.createStatement();
            mStatement.execute("UPDATE producto SET "
                    +"codigo = '"+mProduc.getCodigo()+"',"
                    +"descripcion = '"+mProduc.getDescripcion()+"',"
                    +"marca = '"+mProduc.getMarca()+"',"
                    +"precioCompra = "+mProduc.getPrecioCom()+" , "
                    +"precioventa = "+mProduc.getPrecioVen()+" , "
                    +"departamento = '"+mProduc.getDepartameto()+"',"
                    +"ventaPor = "+mProduc.getVentaPor()+", "
                    +"fechaCad = '"+mProduc.getFecha()+"' "
                    +"WHERE codigo='"+mProduc.getCodigo()+"'"
            );
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void ModificarProductoExistencia(Producto mProduc){
        try {
            mStatement = mConection.createStatement();
            mStatement.execute("UPDATE producto SET "
                    +"existencia = "+mProduc.getExistencia()+", "
                    +"minimo = "+mProduc.getMinimo()+" "
                    +"WHERE codigo='"+mProduc.getCodigo()+"'"
            );
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void reducirExistencia(String codigo, int numero){
        try {
            mStatement = mConection.createStatement();
            mStatement.execute("UPDATE producto SET "
                    +"existencia = existencia - "+numero+" "
                    +"WHERE codigo='"+codigo+"'"
            );
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void aumentarExistencia(String codigo, int numero){
        try {
            mStatement = mConection.createStatement();
            mStatement.execute("UPDATE producto SET "
                    +"existencia = existencia + "+numero+" "
                    +"WHERE codigo='"+codigo+"'"
            );
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
       
    public void modificarConfiguracion(Configurar mConfig){
        try {
            mStatement = mConection.createStatement();
            mStatement.execute("UPDATE config SET "
                    +"ganancia = "+mConfig.getGanancia()+","
                    +"db = '"+mConfig.getDb()+"',"
                    +"sucursal = '"+mConfig.getSucursal()+"', "
                    +"direccion = '"+mConfig.getDireccion()+"', "
                    +"rfc = '"+mConfig.getRfc()+"',"
                    +"correo = '"+mConfig.getCorreo()+"', "
                    +"tel = '"+mConfig.getTel1()+"', "
                    +"tel2 = '"+mConfig.getTel2()+"', "
                    +"pagina = '"+mConfig.getPagina()+"', "
                    +"iva = "+mConfig.getIva()+", "
                    +"alerta = "+mConfig.getAlerta()+", "
                    +"dias = "+mConfig.getDias()+" "
                    +"WHERE idconfig = 1 "
            );
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
} 
