package ComposicionHerencia;

public class Turista {
    private String nombre;
    private Maleta maleta;
    private Maleta maleta2;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Maleta getMaleta() {
        return maleta;
    }

    public void setMaleta(Maleta maleta) {
        this.maleta = maleta;
    }

    public Maleta getMaleta2() {
        return maleta2;
    }

    public void setMaleta2(Maleta maleta2) {
        this.maleta2 = maleta2;
    }

    public Turista(String nombre) {
        this.nombre = nombre;

    }

    public double sumaPeso() {
        double suma = 0;
        if (maleta != null)
            suma = suma + maleta.getPeso();
        if (maleta2 != null)
            suma = suma + maleta2.getPeso();
        return maleta.getPeso() + maleta2.getPeso();
    }

    public double sumaPeso(double sobrePeso) {

        return sumaPeso() + sobrePeso;
    }

    public double sumaPeso(String tipoCarcasa) {
        double suma = sumaPeso();
        if (tipoCarcasa.equals("ligera")) {
            suma = suma + 2;
        } else {
            suma = suma + 4;
        }
        return suma;
    }

}
