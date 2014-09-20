
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.AlejandriaEngine;
import view.Initiation;


public class InitiationController implements ActionListener{
    Initiation viewInit;
    AlejandriaEngine model;
    
    public InitiationController(AlejandriaEngine pModel) {
        this.model=pModel;
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

    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("initHomeConnection")){
            this.model.initConection();
            this.model.updateViewShowHome();
            
        }
    }
}
