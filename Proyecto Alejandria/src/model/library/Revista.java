
package model.library;

import java.sql.Date;


public class Revista extends Articulo{
    private Date _FechaSalida;
    private String _Editorial;

    public Date getFechaSalida() {
        return _FechaSalida;
    }

    public void setFechaSalida(Date _FechaSalida) {
        this._FechaSalida = _FechaSalida;
    }

    public String getEditorial() {
        return _Editorial;
    }

    public void setEditorial(String _Editorial) {
        this._Editorial = _Editorial;
    }
    
    public String toString(){
        String result=super.toString()+"Revista: \n";
        result=result+"Fecha de salida: "+this._FechaSalida.toString()+"\n";
        result=result+"Editorial: "+this._Editorial+"\n";
        return result;
        
    } 
    
}
