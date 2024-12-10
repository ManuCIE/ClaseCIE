package ComposicionHerencia;

public class Principal {

    public static void main(String[] args) {
        Monitor m1 = new Monitor("LG", 200);
        System.out.println("MONITOR");
        System.out.println("Marca:");

        System.out.println("> " + m1.getMarca());

        System.out.println("Precio:");

        System.out.println("> " + m1.getPrecio());

        System.out.println("***************");
        CPU c1 = new CPU("IBM", "i7", 475);
        System.out.println("CPU");
        System.out.println("Marca:");

        System.out.println("> " + c1.getMarca());

        System.out.println("Procesador:");

        System.out.println("> " + c1.getProcesador());

        System.out.println("Precio:");

        System.out.println("> " + c1.getPrecio());

        System.out.println("***************");
        Ordenador o = new Ordenador(m1, c1);
        System.out.println("TOTAL:");

        System.out.println("> " + o.sumaPrecios());
    }
}