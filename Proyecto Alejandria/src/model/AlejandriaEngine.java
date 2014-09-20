
package model;

import java.util.ArrayList;
import model.library.Libro;
import view.interfaces.interfaceHome;


public class AlejandriaEngine {
    InformationStore dataAccess;
    ArrayList<interfaceHome> viewList;
    
    public AlejandriaEngine(){
        dataAccess=new InformationStore();
        viewList=new ArrayList();
    }
    
    public void initConection(){
        dataAccess.initConection();
    
    }
    
    public void addView(interfaceHome pView){
        try{
            System.out.println("add");
            viewList.add(pView);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    //Actualizacion de cambios
    public void  updateViewShowHome(){
        try{
            for(int counterList=0;counterList<viewList.size();counterList++){
                viewList.get(counterList).showHome();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    //Accesos a base de datos

    public InformationStore getDataAccess() {
        return dataAccess;
    }

    public ArrayList<interfaceHome> getViewList() {
        return viewList;
    }

    public void showLibros() {
        ArrayList<Libro> listaLibros;
        try{
            listaLibros=this.dataAccess.consultaLibros();
            for(int counterList=0;counterList<viewList.size();counterList++){
                viewList.get(counterList).showLibros(listaLibros);
            }
        }catch(Exception e){
            System.out.println("Problem Libros");
            e.printStackTrace();
        }
    }
    
    
}
