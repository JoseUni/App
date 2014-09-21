
package aplAlejandria;

import controller.HomeController;
import controller.InitiationController;
import java.sql.*;
import model.AlejandriaEngine;
import model.InformationStore;
import model.library.Libro;
import view.Home;
import view.Initiation;


public class main {
    public static void initApp(){
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //Creacion de los modelos
        AlejandriaEngine model=new AlejandriaEngine();
        //Creacion de los controladores 
        HomeController HomeC=new HomeController(model);
        InitiationController InitC=new InitiationController(model);
        //Creacion de las vistas 
        Home home=new Home(HomeC);
        Initiation init=new Initiation(InitC);
        
        model.addView(init);
        model.addView(home);
       
        init.setVisible(true);
    }
    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        initApp();
        //pruebasApp();
    }
    public static void pruebasApp(){
        InformationStore x=new InformationStore();
        x.initConection();
        Libro newLibro=new Libro();
        newLibro.setAutor("libroll");
        newLibro.setCalificacion(879);
        newLibro.setCantidadOcupados(123);
        newLibro.setCantidadTotal(11);
        newLibro.setEdicion("libroll");
        newLibro.setEditorial("libroll");
        newLibro.setIDgeneral(22);
        newLibro.setImagenPortada("libroll");
        newLibro.setTipoArticulo("cambiado");
        newLibro.setTitulo("libroll");
        
        x.ModificarLibro(newLibro);
        //x.insertarLibros(newLibro);*/
        
        /*Pelicula newPelicula=new Pelicula();
        newPelicula.setTitulo("xxx");
        newPelicula.setCalificacion(10);
        newPelicula.setCantidadOcupados(0);
        newPelicula.setCantidadTotal(10);
        newPelicula.setDirector("xxx");
        newPelicula.setEmpresa("xxx");
        
        newPelicula.setFechaEstreno(new Date(100,0,9));
        newPelicula.setIDgeneral(24);
        newPelicula.setImagenPortada(null);
        newPelicula.setTipoArticulo("Pelicula");
        
        x.ModificarPelicula(newPelicula);
        //x.insertarPeliculas(newPelicula);
        
        /*
            
        Revista newRevista=new Revista();
         newRevista.setTitulo("Revistamodi");
        newRevista.setCalificacion(999);
        newRevista.setCantidadOcupados(0);
        newRevista.setCantidadTotal(98);
        newRevista.setEditorial("EditorialRevisy");
        newRevista.setFechaSalida(new Date(112,10,9));
        
        newRevista.setIDgeneral(25);
        newRevista.setImagenPortada(null);
        newRevista.setTipoArticulo("Revista");
        //x.insertarRevistas(newRevista);
        x.ModificarRevista(newRevista);
        //System.out.println(newRevista.toString());
                
        
        /*Persona newPersona=new Persona();
        newPersona.setNombre("Persona1");
        newPersona.setIDPersona(56);
        newPersona.setEmail("Persona@gmail.com");
        newPersona.setPrimerApellido("pApellidoPersona1");
        newPersona.setSegundoApellido("sApellidoPersona1");
        newPersona.setTelefono("24459202");
        newPersona.setTipo("Estudiante");//Cambiar sql
        newPersona.setTipoTelefono("Casa");
        
        x.insertarPersonas(newPersona);*/
        /*
        ArticuloPrestado newArtPrest=new ArticuloPrestado();
        newArtPrest.setIDGeneral(24);
        newArtPrest.setIDPersona(0);
        
        x.insertarPrestacion(newArtPrest);
        */
        
        
        
        
        
        
        
        
        
        
    }
    
}
