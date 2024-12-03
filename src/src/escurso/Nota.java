package escurso;

public class Nota {

    private double valor;

    public double getValor() {
        return valor;
    }
    // funcion que nos devuelve el valor como FuncionPublica

    public void setValor(double v) {
        if(v>=0 && v<=10)
        valor = v;
    
    }

}
