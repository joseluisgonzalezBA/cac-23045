public class Main {
    public static void main(String[] args) {

        // Declaracion de variables (OBLIGATORIA)
        int entero;
        // Inicializacion de variables (OBLIGATORIA)
        entero = 9;

        System.out.println(entero);

        // Declaracion e inicializacion en una sola instruccion
        double altura = 1.78;
        float longitud = 2.6f;
        long distancia = 678;

        int a = 10;
        int b = 3;
        System.out.println(a / b);
        altura = a/b;
        System.out.println(altura);

        // En Java un caracter no es lo mismo que un String
        char letra = 'a';

        boolean casado = true; // true o false

        // Forma antigua de declarar un String
        String frase = "La casa de mi tia Peti";

        // Forma moderna de declarar un String (POO)
        String linea = new String("Hay que comprar cafe.");

        System.out.println(frase);
        System.out.println(linea);
    }
}
