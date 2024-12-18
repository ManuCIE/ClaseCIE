package ComposicionHerencia;

public class PrincipalDeporte {
    public static void main(String[] args) {

        DeportistaPro deportista = new DeportistaPro("Leo", "Bádminton", 2);
        Deportista aficionado = new Deportista("Paco", "Balonmano");
        Persona normal = new Persona("Roberto");
        System.out.print("El deportista " + deportista.getNombre() + " practica "
                + deportista.getDeporte() + " y");
        deportista.andar();
        System.out.print("El aficionado " + aficionado.getNombre() + " practica "
                + aficionado.getDeporte() + " y");
        aficionado.andar();
        System.out.print("Tu vecino " + normal.getNombre() + " ");
        normal.andar();
        System.out.println("");
        System.out.println(">>><<<");
        Persona david = FactoriaPersonas.crearPersona("Deportista", "David" );
        System.out.print(david.getNombre());
        david.andar();
        Deportista davidVerdadero = (Deportista) david;
        davidVerdadero.andar();
        System.out.println(davidVerdadero.getDeporte());
    }
}


//ESTO ES UNA GRABACIÓN OK