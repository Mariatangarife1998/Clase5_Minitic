package co.edu.utp.misiontic2022.c2.cmaria.ajedrez;

public class Tablero implements Dibujable {
    @Override
    public void pintar() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void posicionar(Integer x, Integer y) {
        // TODO Auto-generated method stub
        
    }

    private Casilla[] casillas;

    public Tablero(){
        casillas = new Casilla[64];
        // System.out.println(casillas);
        for (int i = 0; i < casillas.length; i++) {
            int fila =i/8 ;
            int columna =i%8 ;
            casillas[i] = new Casilla(fila, columna);
            System.out.println(i + ": " + casillas[i]);

        }
    }

    public void ubicarFicha(Integer fila, Integer columna, Ficha ficha ){
        // int indice = 8 * fila + columna;
        casillas[8 * fila + columna].ubicarFicha(ficha);
    }

    public Boolean enrroque(){
        return null;
    }

    public Boolean jaque(){
        return null;
    }

    public Boolean jaqueMate(){
        return null;
    }

    public Boolean tablas(){
        return null;
    }
}
