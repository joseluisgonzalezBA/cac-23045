public class Main {
  public static void main(String[] args) {

    Mamifero beto = new Mamifero();

    beto.cumplirAnios();
    beto.cumplirAnios();
    beto.cumplirAnios();
    beto.comer(20.0);
    beto.trasladar(10.0);
    beto.respirar();
    System.out.println();
    System.out.println("Beto (Mamifero)");
    System.out.println("---------------");
    System.out.println("Edad: "+beto.getEdad());
    System.out.println("Peso: "+beto.getPeso());

    Animal enrique = new Perro();
    System.out.println();
    System.out.println("Enrique (Animal)");
    System.out.println("----------------");
    System.out.println("Edad: "+ enrique.getEdad());
    System.out.println("Peso: "+ enrique.getPeso());

    Animal juancho = new Gato();
    System.out.println();
    System.out.println("Juancho (Animal)");
    System.out.println("----------------");
    System.out.println("Edad: "+ juancho.getEdad());
    System.out.println("Peso: "+ juancho.getPeso());

    //juancho.setPelaje("blanco");

    // Polimorfismo
    //Ambos objetos son de clase Animal, pero se expresan distinto
    System.out.println();
    System.out.print("Enrique dice: ");
    enrique.expresar(); // Dice "Guau"
    System.out.print("Juancho dice: ");
    juancho.expresar(); // Dice "Miau"

    Perro bobby = new Perro();
    System.out.println();
    System.out.println("Bobby (Perro)");
    System.out.println("-------------");
    bobby.moverCola(3);
    bobby.expresar();
    bobby.respirar();

    System.out.println();
    System.out.println("Atributos de la clase Animal");
    System.out.println("----------------------------");
    System.out.println("Cantidad de animales: " + Animal.cantidad);
    System.out.println("Cantidad de respiraciones: " + Animal.cantRespiraciones);
  }
}