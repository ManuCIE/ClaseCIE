package ejs0512;

public class Nota {

    private int nota;

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Nota(int nota) {
        this.nota = nota;
    }

    public String txtnota = "";
    {
        if (nota >= 0 && nota < 5)

        {
            System.out.println("Suspenso.");
        } else if (nota >= 5 && nota <= 6) {
            System.out.println("Aprobado.");
        } else if (nota > 6 && nota <= 8) {
            System.out.println("Notable.");
        } else if (nota > 8 && nota <= 10) {
            System.out.println("Sobresaliente.");
        }
    }
}
