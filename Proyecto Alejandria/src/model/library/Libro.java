
package model.library;


public class Libro extends Articulo{
    private String _Editorial;
    private String _Edicion;
    private String _Autor;

    @Override
    public String toString(){
        String result=super.toString()+"Libro: \n";
        result=result+"Autor: "+this._Autor+"\n";
        result=result+"Edición: "+this._Edicion+"\n";
        result=result+"Editorial: "+this._Editorial+"\n";
        return result;
    }
    
    public String getEditorial() {
        return _Editorial;
    }

    public void setEditorial(String _Editorial) {
        this._Editorial = _Editorial;
    }

    public String getEdicion() {
        return _Edicion;
    }

    public void setEdicion(String _Edicion) {
        this._Edicion = _Edicion;
    }

    public String getAutor() {
        return _Autor;
    }

    public void setAutor(String _Autor) {
        this._Autor = _Autor;
    }
    
    
    
    
}
