public class UsoPersona {
    public static void main(String[] args) {

        Persona paula = new Persona();
        paula.edad = 17;
        paula.nombre = "Paula";
        paula.altura = 1.57;
        System.out.println(paula.nombre + ", " + paula.edad + ". Altura: " + paula.altura + "cm");
        System.out.println("Es mayor de edad: " + paula.esMayor18());

        Persona manu = new Persona();
        manu.edad = 28;
        manu.nombre = "Manu";
        manu.altura = 1.73;
        System.out.println(manu.nombre + ", " + manu.edad + ". Altura: " + manu.altura + "cm");
        System.out.println("Es mayor de edad: " + manu.esMayor18());
    }
    // token githubclaveusuario: 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
}
