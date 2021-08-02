package co.edu.utp.misiontic2022.c2.cmaria.ajedrez;

public abstract class Ficha implements Dibujable, ElementoMovil {
    private final Color color;

    public Boolean captura(){
        return null;
    }

    public Ficha(Color color){
        this.color = color;
    }

    private Casilla casilla;


    public Casilla getCasilla() {
        return casilla;
    }

    public void setCasilla(Casilla casilla) {
        this.casilla = casilla;
    }

    @Override
    public String toString() {
        return "Ficha [color=" + color + "]";
    }

    // public abstract Boolean mover();

    
}
