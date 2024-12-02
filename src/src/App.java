public class App {
    public static void main(String[] args) throws Exception {
        int[] lista = new int[] { 2, 5, 6, 7 };

        int suma = sumaArray(lista);
        System.out.println("Las notas son: ");
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] >= 5) {
                System.out.println("Nota = " + lista[i]);
            } else if (lista[i] < 5) {
                System.out.println("Suspenso = " + lista[i]);
            }
        }
        System.out.println("La suma de todas las notas = " + suma);
    }

    public static int sumaArray(int[] miArray) {
        int suma = 0;
        for (int i = 0; i < miArray.length; i++) {
            suma += miArray[i];
        }
        return suma;
    }

}
