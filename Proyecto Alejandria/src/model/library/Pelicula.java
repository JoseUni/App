
package model.library;

import java.sql.Date;


public class Pelicula extends Articulo{
    private Date _FechaEstreno;
    private String _Empresa;
    private String _Director;

    public String getDirector() {
        return _Director;
    }

    public Date getFechaEstreno() {
        return _FechaEstreno;
    }

    public void setFechaEstreno(Date _FechaEstreno) {
        this._FechaEstreno = _FechaEstreno;
    }

    public void setDirector(String _Director) {
        this._Director = _Director;
    }

    public String getEmpresa() {
        return _Empresa;
    }

    public void setEmpresa(String _Empresa) {
        this._Empresa = _Empresa;
    }
    
    @Override
    public String toString(){
        String result=super.toString()+"Pelicula: \n";
        result=result+"Director: "+this._Director+"\n";
        result=result+"Fecha de estreno: "+this._FechaEstreno.toString()+"\n";
        result=result+"Empresa: "+this._Empresa+"\n";
        return result;
    }
    
}
