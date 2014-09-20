
package model.library;


public class ArticuloPrestado {
    private int IDGeneral;
    private int IDPersona;
    private String FechaPrestamo;
    private String FechaDevolucion;
    private int PoseeArticulo;

    public int getIDGeneral() {
        return IDGeneral;
    }

    public void setIDGeneral(int IDGeneral) {
        this.IDGeneral = IDGeneral;
    }

    public int getIDPersona() {
        return IDPersona;
    }

    public void setIDPersona(int IDPersona) {
        this.IDPersona = IDPersona;
    }

    public String getFechaPrestamo() {
        return FechaPrestamo;
    }

    public void setFechaPrestamo(String FechaPrestamo) {
        this.FechaPrestamo = FechaPrestamo;
    }

    public String getFechaDevolucion() {
        return FechaDevolucion;
    }

    public void setFechaDevolucion(String FechaDevolucion) {
        this.FechaDevolucion = FechaDevolucion;
    }

    public int getPoseeArticulo() {
        return PoseeArticulo;
    }

    public void setPoseeArticulo(int PoseeArticulo) {
        this.PoseeArticulo = PoseeArticulo;
    }
    
    
}
