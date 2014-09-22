
package model;


import java.io.File;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.library.Articulo;
import model.library.ArticuloPrestado;
import model.library.Libro;
import model.library.Pelicula;
import model.library.Persona;
import model.library.Revista;
import oracle.jdbc.OracleTypes;



public class InformationStore {
    private Connection _Conection;
    //Inserciones ======================================================================================
    public void initConection() {
        try {
        Class.forName("oracle.jdbc.OracleDriver"); 
        String BaseDeDatos = "jdbc:oracle:thin:@EverestXP:1521:DEMO";  
        _Conection = DriverManager.getConnection(BaseDeDatos, "Alejandria","Alejandria");    
        
        if (_Conection != null) {
            System.out.println("Conexion exitosa!");
        } else {
            System.out.println("Conexion fallida!");
        }
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
    
    public void insertarLibros(Libro pLibro){
        try {
           
            CallableStatement sentencia=_Conection.prepareCall("{call ADDARTICULOLIBRO(?,?,?,?,?,?,?)}");
            //título
            sentencia.setString(1, pLibro.getTitulo());
            //calificación
            sentencia.setInt(2, pLibro.getCalificacion());
            //imagen
            sentencia.setString(3, pLibro.getImagenPortada());
            //Cantidad Total
            sentencia.setInt(4, pLibro.getCantidadTotal());
            //autor
            sentencia.setString(5, pLibro.getAutor());
            //editorial
            sentencia.setString(6, pLibro.getEditorial());
            //Edicion
            sentencia.setString(7, pLibro.getEdicion());
            // Ejecuta el procedimiento almacenado
            sentencia.execute();
            }
         catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Error al insertar libro");
        }        
    }
    
    public void insertarPeliculas(Pelicula pPelicula){
        try {
           
            CallableStatement sentencia=_Conection.prepareCall("{call ADDARTICULOPELICULA(?,?,?,?,?,?,?)}");
            //título
            sentencia.setString(1, pPelicula.getTitulo());
            //calificación
            sentencia.setInt(2, pPelicula.getCalificacion());
            //imagen
            sentencia.setString(3, pPelicula.getImagenPortada());
            //Cantidad Total
            sentencia.setInt(4, pPelicula.getCantidadTotal());
            //Director
            sentencia.setString(5, pPelicula.getDirector());
            //Fecha de estreno
            sentencia.setDate(6, pPelicula.getFechaEstreno());
            //Empresa
            sentencia.setString(7, pPelicula.getEmpresa());
            // Ejecuta el procedimiento almacenado
            sentencia.execute();
            }
         catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al insertar películas");
            
        }        
    }
    
    public void insertarRevistas(Revista pRevista){
        try {
           
            CallableStatement sentencia=_Conection.prepareCall("{call ADDARTICULOREVISTA(?,?,?,?,?,?)}");
            //título
            sentencia.setString(1, pRevista.getTitulo());
            //calificación
            sentencia.setInt(2, pRevista.getCalificacion());
            //imagen
            sentencia.setString(3, pRevista.getImagenPortada());
            //Cantidad Total
            sentencia.setInt(4, pRevista.getCantidadTotal());
            //Fecha Salida
            sentencia.setDate(5, pRevista.getFechaSalida());
            //editorial
            sentencia.setString(6, pRevista.getEditorial());
            // Ejecuta el procedimiento almacenado
            sentencia.execute();
            }
         catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al insertar revistas");
            
        }        
    }
    // (pNombre VARCHAR, pApellidoP VARCHAR, pApellidoS VARCHAR, pTipPersona varchar, pTelefono NUMBER, pTipTel varchar, pCorreo Varchar)
    public void insertarPersonas(Persona pPersona){
        try {
            CallableStatement sentencia=_Conection.prepareCall("{call ADDPERSONAS(?,?,?,?,?,?,?)}");
            //
            sentencia.setString(1, pPersona.getNombre());
            sentencia.setString(2, pPersona.getPrimerApellido());
            sentencia.setString(3, pPersona.getSegundoApellido());
            sentencia.setString(4, pPersona.getTipo());
            sentencia.setString(5, pPersona.getTelefono());
            sentencia.setString(6, pPersona.getTipoTelefono());
            sentencia.setString(7, pPersona.getEmail());
            sentencia.execute();
            }
         catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al insertar Personas");
            
        }    
    }
    
    public void insertarPrestacion(ArticuloPrestado pArticuloPrestado){
        try {
           
            CallableStatement sentencia=_Conection.prepareCall("{call INSERTPRESTADO(?,?)}");
            //IdGeneral
            sentencia.setInt(1, pArticuloPrestado.getIDGeneral());
            //IdPersona
            sentencia.setInt(2, pArticuloPrestado.getIDPersona());
            
            sentencia.execute();
            }
         catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al hacer prestación");
            
            }    
    }
    
    //Consultas ======================================================================================
    //falta implementar
    public ArrayList<Articulo> consultaArticulosNoPrestado(){return null;
        
    }
    //falta implementar
    public ArrayList<Articulo> consultaArticulosPrestado(){return null;

    }
    
    public ArrayList<Libro> consultaLibroTitulo (String pTitulo){
    ArrayList<Libro> resultado = new ArrayList<>();
        try {
                CallableStatement sentencia=_Conection.prepareCall("{?=call Consulta_Libros_T(?)}");
                sentencia.registerOutParameter(1, OracleTypes.CURSOR);  
                sentencia.setString(2,pTitulo);                                      
                sentencia.executeQuery();//Realizar la llamada
                ResultSet datoRecibido = (ResultSet)sentencia.getObject (1);
                Libro LibroTemp;
                while (datoRecibido.next ()){
                    LibroTemp = new Libro();
                    //nuevaPersona.setNombre(datoRecibido.getString("NOMBRE"));
                    LibroTemp.setEditorial(datoRecibido.getString("EDITORIAL"));
                    LibroTemp.setTipoArticulo(datoRecibido.getString("TIPART"));
                    LibroTemp.setTitulo(datoRecibido.getString("TITULO"));
                    LibroTemp.setCalificacion(datoRecibido.getInt("CALIDFICAION"));
                    LibroTemp.setIDgeneral(datoRecibido.getInt("IDGENERAL"));
                    LibroTemp.setImagenPortada(datoRecibido.getString("IMAGENPARTAD"));
                    LibroTemp.setCantidadTotal(datoRecibido.getInt("CANTIDADTOTAL"));
                    LibroTemp.setCantidadOcupados(datoRecibido.getInt("CANTIDADOCUPADOS"));
                    LibroTemp.setEdicion(datoRecibido.getString("EDICION"));
                    resultado.add(LibroTemp);
                }
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        return resultado;
    }
    
    public String ConsultaCorreoPersona (int pCodigoPersona){
        String Correo = null;
        try {
                CallableStatement sentencia=_Conection.prepareCall("{?=call Consulta_Correo(?)}");
                sentencia.registerOutParameter(1, OracleTypes.CURSOR);  
                sentencia.setInt(2,pCodigoPersona);                                      
                sentencia.executeQuery();//Realizar la llamada
                ResultSet datoRecibido = (ResultSet)sentencia.getObject (1);
                while (datoRecibido.next ()){
                    Correo = datoRecibido.getString("CORREO");
                }
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        return Correo;
    }
    
    public String ConsultaTipoTelefono (int pCodigoTel)
    {
        String TipoTelefono = null;
        try {
            CallableStatement sentencia=_Conection.prepareCall("{?=call Consulta_TipoTelefono(?)}");
            sentencia.registerOutParameter(1, OracleTypes.CURSOR);  
            sentencia.setInt(2,pCodigoTel);                                      
            sentencia.executeQuery();//Realizar la llamada
            ResultSet datoRecibido = (ResultSet)sentencia.getObject (1);
            while (datoRecibido.next ()){
                TipoTelefono = datoRecibido.getString("TIPTEL");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return TipoTelefono;
    }
    
    public Persona ConsultaTelefonoPersona (int pCodigoPersona){
        Persona PersonaTemp = new Persona();
        try {
                CallableStatement sentencia=_Conection.prepareCall("{?=call Consulta_Telefono(?)}");
                sentencia.registerOutParameter(1, OracleTypes.CURSOR);  
                sentencia.setInt(2,pCodigoPersona);                                      
                sentencia.executeQuery();//Realizar la llamada

                ResultSet datoRecibido = (ResultSet)sentencia.getObject (1);
                while (datoRecibido.next ()){
                    PersonaTemp.setTelefono(datoRecibido.getString("TELEFONO"));
                    PersonaTemp.setTipoTelefono(datoRecibido.getString("TIPTEL"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        return PersonaTemp;
    }
    
    public String ConsultaTipoPersona (int pTipoPersona){
        String TipoPersonaTemp = null;
        try {
                CallableStatement sentencia=_Conection.prepareCall("{?=call Consulta_TipoPersona(?)}");
                sentencia.registerOutParameter(1, OracleTypes.CURSOR);  
                sentencia.setInt(2,pTipoPersona);                                      
                sentencia.executeQuery();//Realizar la llamada
                System.out.println("Objeto: " + sentencia);
                ResultSet datoRecibido = (ResultSet)sentencia.getObject (1);
                while (datoRecibido.next ()){
                    TipoPersonaTemp = datoRecibido.getString("TIPPER");
                }
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        return TipoPersonaTemp;
    }
    
    public ArrayList<Persona> consultaPersonas(){//return null;
    ArrayList<Persona> resultado=new ArrayList<>();
            try {
                CallableStatement sentencia=_Conection.prepareCall("{?=call Consulta_Todas_Personas()}");
                sentencia.registerOutParameter(1, OracleTypes.CURSOR);  
                //sentencia.setString(2,cliente1);                                            
                sentencia.executeQuery();//Realizar la llamada
                
                ResultSet datoRecibido = (ResultSet)sentencia.getObject (1);
                Persona nuevaPersona;
                Persona TelefonoPersona;
                while (datoRecibido.next ()){
                    nuevaPersona=new Persona();
                    nuevaPersona.setNombre(datoRecibido.getString("NOMBRE"));
                    nuevaPersona.setPrimerApellido(datoRecibido.getString ("PAPELLIDO"));
                    nuevaPersona.setSegundoApellido(datoRecibido.getString ("SAPELLIDO"));
                    int IDPersonaTemp = datoRecibido.getInt("IDPERSONA");
                    nuevaPersona.setIDPersona(IDPersonaTemp);
                    int TipoPersonaTemp = datoRecibido.getInt("TIPPER");
                    TelefonoPersona = ConsultaTelefonoPersona (IDPersonaTemp);
                    nuevaPersona.setTelefono(TelefonoPersona.getTelefono());
                    nuevaPersona.setEmail(ConsultaCorreoPersona (IDPersonaTemp));
                    nuevaPersona.setTipoTelefono(ConsultaTipoTelefono (Integer.parseInt(TelefonoPersona.getTipoTelefono())));
                    nuevaPersona.setTipo(ConsultaTipoPersona (TipoPersonaTemp));
                    
                    resultado.add(nuevaPersona);
                }
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }   
            return resultado;
    }
    //falta implementar
    public ArrayList<Pelicula> consultaPeliculas(){return null;

    }
    //falta implementar
    public ArrayList<Revista> consultaRevistas(){return null;

    }
    
    public ArrayList<Libro> consultaLibros() throws ClassNotFoundException {
            ArrayList<Libro> resultado=new ArrayList<>();
            try {
                CallableStatement sentencia=_Conection.prepareCall("{?=call Consulta_Libros()}");
                sentencia.registerOutParameter(1, OracleTypes.CURSOR);                           
                //sentencia.setString(2,cliente1);                                            
                sentencia.executeQuery();//Realizar la llamada
                System.out.println("Objeto: " + sentencia);
                ResultSet datoRecibido = (ResultSet)sentencia.getObject (1);
                Libro nuevoLibro;
                
                while (datoRecibido.next ()){
                    System.out.println("1");
                    nuevoLibro=new Libro();
                    nuevoLibro.setIDgeneral(datoRecibido.getInt ("IDGENERAL"));
                    nuevoLibro.setTitulo(datoRecibido.getString ("TITULO"));
                    nuevoLibro.setCalificacion(datoRecibido.getInt ("CALIFICACION"));
                    nuevoLibro.setTipoArticulo("Libro");
                    nuevoLibro.setCantidadTotal(datoRecibido.getInt ("CANTIDADTOTAL"));
                    nuevoLibro.setCantidadOcupados(datoRecibido.getInt ("CANTIDADOCUPADOS"));
                    nuevoLibro.setImagenPortada(datoRecibido.getString ("IMAGENPORTAD"));
                    nuevoLibro.setEditorial(datoRecibido.getString ("EDITORIAL"));
                    nuevoLibro.setEdicion(datoRecibido.getString ("EDICION"));
                    nuevoLibro.setAutor(datoRecibido.getString ("AUTOR"));
                    resultado.add(nuevoLibro);
                }
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }        return resultado;
    }
    
    //Modificaciones==================================================================================
    public void ModificarLibro(Libro pLibro){
        try {
            CallableStatement sentencia=_Conection.prepareCall("{call MODIFICALIBRO(?,?,?,?,?,?,?,?)}");
            //IdGeneral
            sentencia.setString(1, pLibro.getTitulo());
            sentencia.setInt(2, pLibro.getCalificacion());
            sentencia.setString(3, pLibro.getImagenPortada());
            sentencia.setString(4, pLibro.getAutor());
            sentencia.setString(5, pLibro.getEditorial());
            sentencia.setString(6, pLibro.getEdicion());
            sentencia.setInt(7, pLibro.getIDgeneral());
            sentencia.setInt(8, pLibro.getCantidadTotal());
            sentencia.execute();
            }
         catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al Modificar Libro");
            
            }  
    }
    
    public void ModificarPelicula(Pelicula pPelicula){
        try {
            System.out.println(pPelicula);
            CallableStatement sentencia=_Conection.prepareCall("{call MODIFICAPELICULA(?,?,?,?,?,?,?,?)}");
            //IdGeneral
            sentencia.setString(1, pPelicula.getTitulo());
            sentencia.setInt(2, pPelicula.getCalificacion());
            sentencia.setString(3, pPelicula.getImagenPortada());
            sentencia.setString(4, pPelicula.getDirector());
            sentencia.setDate(5, pPelicula.getFechaEstreno());
            sentencia.setString(6, pPelicula.getEmpresa());
            sentencia.setInt(7, pPelicula.getIDgeneral());
            sentencia.setInt(8, pPelicula.getCantidadTotal());
            sentencia.execute();
            
            
            }
         catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al Modificar Película");
            
            }  
    }
    
    public void ModificarRevista(Revista pRevista){
        try {
            CallableStatement sentencia=_Conection.prepareCall("{call MODIFICAREVISTA(?,?,?,?,?,?,?)}");
            //IdGeneral
            sentencia.setString(1, pRevista.getTitulo());
            sentencia.setInt(2, pRevista.getCalificacion());
            sentencia.setString(3, pRevista.getImagenPortada());
            sentencia.setDate(4, pRevista.getFechaSalida());
            sentencia.setString(5, pRevista.getEditorial());
            sentencia.setInt(6, pRevista.getIDgeneral());
            sentencia.setInt(7, pRevista.getCantidadTotal());
            sentencia.execute();
            }
         catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al Modificar Revista");
            
            }  
    }
    //Getters
    public Connection getConection() {
        return _Conection;
    }
    //Cargar Personas
    
    public void loadFiles() {
        ArrayList<Persona> lista=CargarInfoPersonas.CargarInfoPersonas("C:\\Documents and Settings\\Adriana\\My Documents\\NetBeansProjects\\App\\Proyecto Alejandria\\src\\model\\library\\files\\Personas.txt");
        for(int contador=0; contador<lista.size();contador++){
            this.insertarPersonas(lista.get(contador));
        }
        //otros inserts
        
    }
    
}
