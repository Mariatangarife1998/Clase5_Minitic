package co.edu.utp.misiontic2022.c2.cmaria.ajedrez;

public interface Dibujable {
    public void pintar();
    public default void posicionar(Integer x, Integer y);
}
