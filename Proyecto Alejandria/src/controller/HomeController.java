
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
            this.model.showLibros();
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
