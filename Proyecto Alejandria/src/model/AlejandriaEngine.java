
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
        //dataAccess.loadFiles();
    }
    
    public void initConection(){
        dataAccess.initConection();
        
    
    }
    
    public void addView(interfaceHome pView){
        try{
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
        try{
            for(int counterList=0;counterList<viewList.size();counterList++){
                viewList.get(counterList).showLibros();
            }
        }catch(Exception e){
            
            e.printStackTrace();
        }
    }
    
    public void showPeliculas() {
        try{
            for(int counterList=0;counterList<viewList.size();counterList++){
                viewList.get(counterList).showPeliculas();
            }
        }catch(Exception e){
            
            e.printStackTrace();
        }
    }
    
    public void showRevistas() {
        try{
            for(int counterList=0;counterList<viewList.size();counterList++){
                viewList.get(counterList).showRevistas();
            }
        }catch(Exception e){
            
            e.printStackTrace();
        }
    }
    
    public void showPersonas() {
        try{
            for(int counterList=0;counterList<viewList.size();counterList++){
                viewList.get(counterList).showPersonas();
            }
        }catch(Exception e){
            
            e.printStackTrace();
        }
    }
    
    
}
