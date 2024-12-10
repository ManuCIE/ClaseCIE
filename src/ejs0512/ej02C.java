package ejs0512;

public class ej02C {

    private int nota;

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        // aqui los ifs
        this.nota = nota;
    }

    public ej02C(int nota) {
        setNota(nota);
    }

    public int imprimirNota() {
        return nota;
    }

}