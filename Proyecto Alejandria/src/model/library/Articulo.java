
package model.library;


public class Articulo {
    private String _Titulo;
    private int _Calificacion; 
    private int _IDgeneral;
    private String _ImagenPortada;
    private String _TipoArticulo;
    private int _CantidadTotal;
    private int _CantidadOcupados;

    public String getTipoArticulo() {
        return _TipoArticulo;
    }

    public void setTipoArticulo(String _TipoArticulo) {
        this._TipoArticulo = _TipoArticulo;
    }
    
    public String getTitulo() {
        return _Titulo;
    }

    public void setTitulo(String _Titulo) {
        this._Titulo = _Titulo;
    }

    public int getCalificacion() {
        return _Calificacion;
    }

    public void setCalificacion(int _Calificacion) {
        this._Calificacion = _Calificacion;
    }

    public int getIDgeneral() {
        return _IDgeneral;
    }

    public void setIDgeneral(int _IDgeneral) {
        this._IDgeneral = _IDgeneral;
    }

    public String getImagenPortada() {
        return _ImagenPortada;
    }

    public void setImagenPortada(String _ImagenPortada) {
        this._ImagenPortada = _ImagenPortada;
    }

    

    public int getCantidadTotal() {
        return _CantidadTotal;
    }

    public void setCantidadTotal(int _CantidadTotal) {
        this._CantidadTotal = _CantidadTotal;
    }

    public int getCantidadOcupados() {
        return _CantidadOcupados;
    }

    public void setCantidadOcupados(int _CantidadOcupados) {
        this._CantidadOcupados = _CantidadOcupados;
    }
    
    
    
    public String toString(){
        String result ="";     
        result=result+"Titulo: "+_Titulo+"\n";
        result=result+"Titulo: "+_Calificacion+"\n";
        result=result+"Titulo: "+_IDgeneral+"\n";
        result=result+"Titulo: "+_ImagenPortada+"\n";
        result=result+"Titulo: "+_TipoArticulo+"\n";
        result=result+"Titulo: "+_CantidadTotal+"\n";
        result=result+"Titulo: "+_CantidadOcupados+"\n";
        return result;
    }
    
}
