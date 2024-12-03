package semana2;

import escurso.Nota;

public class NotaGetSet {
    public static void main(String[] args) {

        Nota nota1 = new Nota();
        // nota1.valor = 7; ya no podemos asignar el valor así: usamos get set
        nota1.setValor(700);

        System.out.println(nota1.getValor());
    }
}
