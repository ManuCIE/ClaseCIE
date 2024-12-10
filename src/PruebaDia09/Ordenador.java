package PruebaDia09;

public class Ordenador {

    private boolean encendido;

    public boolean estaEncendido() {
        return encendido;
    }

    public void encender() {
        // esto es igual a if (encendido!=true)
        if (!encendido)
            encendido = true;
    }

    public void apagar() {
        // esto es igual a if (encendido=true)
        if (encendido)
            encendido = false;
    }

    public Ordenador(boolean encendido) {
        this.encendido = encendido;
    }

}