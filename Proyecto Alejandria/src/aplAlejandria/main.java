
package aplAlejandria;

import controller.HomeController;
import controller.InitiationController;
//import java.sql.CallableStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;
import static jdk.nashorn.internal.objects.NativeFunction.call;
import model.AlejandriaEngine;
import model.InformationStore;
import model.library.Libro;
import oracle.jdbc.OracleTypes;
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
        //initApp();
        InformationStore x=new InformationStore();
        /*x.initConection();
        Libro newLibro=new Libro();
        newLibro.setAutor("autor1");
        newLibro.setCalificacion(1);
        newLibro.setCantidadOcupados(0);
        newLibro.setCantidadTotal(5);
        newLibro.setEdicion("EdicioN1");
        newLibro.setEditorial("Editorial1");
        newLibro.setIDgeneral(5);
        newLibro.setImagenPortada("imagen");
        newLibro.setTipoArticulo(0);
        newLibro.setTitulo("Titulo1");
        x.insertarLibros(newLibro);*/
        Date t;
        t=Date.valueOf("1990-11-26");
        System.out.println(t);
        
    }
    
}
