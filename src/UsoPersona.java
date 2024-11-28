public class UsoPersona {
    public static void main(String[] args) {

        Persona paula = new Persona();
        paula.edad = 20;
        paula.nombre = "Paula";
        paula.altura = 1.57;
        System.out.println(paula.nombre + ", " + paula.edad + ". Altura: " + paula.altura + "cm");

        Persona manu = new Persona();
        manu.edad = 28;
        manu.nombre = "Manu";
        manu.altura = 1.73;
        System.out.println(manu.nombre + ", " + manu.edad + ". Altura: " + manu.altura + "cm");
        System.out.println("Esta prueba es para subir esta modificación a GitHub desde VS");

    }

}
