package ComposicionHerencia;

public class Principal2 {
    public static void main(String[] args) {

        Turista t1 = new Turista("Leorio");
        Maleta m1 = new Maleta("Samsonite", 35);
        Maleta m2 = new Maleta("Benzi", 18);
        t1.setMaleta(m1);
        t1.setMaleta2(m2);

        System.out.println("Turista: " + t1.getNombre() + ".");
        System.out.println("Maleta: " + m1.getPeso() + ". Peso: " + m1.getPeso() + ".");
        System.out.println("Maleta: " + m2.getModelo() + ". Peso: " + m2.getPeso() + ".");
        System.out.println("El peso total es: " + t1.sumaPeso() + ".");

        System.out.println(t1.sumaPeso());
        System.out.println(t1.sumaPeso(4));
    }

}
