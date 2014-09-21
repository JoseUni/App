
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.AlejandriaEngine;
import view.Initiation;


public class HomeController implements ActionListener{
    Initiation viewInit;
    AlejandriaEngine model;

    public HomeController(AlejandriaEngine pModel) {
        this.model=pModel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("ButtonLibros")){
            System.out.println("ButtonLibros");
            this.model.showLibros();
        }
        else if(e.getActionCommand().equals("ButtonPeliculas")){
            System.out.println("ButtonPeliculas");
            this.model.showPeliculas();
        }
        else if(e.getActionCommand().equals("ButtonRevistas")){
            System.out.println("ButtonRevistas");
            this.model.showRevistas();
        }
        else if(e.getActionCommand().equals("ButtonPersonas")){
            System.out.println("ButtonPersonas");
            this.model.showPersonas();
        }
        else if(e.getActionCommand().equals("ButtonBuscar")){
            System.out.println("ButtonBuscar");
        }
        
    }
    
    
    
    public Initiation getViewInit() {
        return viewInit;
    }

    public void setViewInit(Initiation viewInit) {
        this.viewInit = viewInit;
    }

    public AlejandriaEngine getModel() {
        return model;
    }

    public void setModel(AlejandriaEngine model) {
        this.model = model;
    }
}
