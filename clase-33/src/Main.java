public class Main {
  public static void main(String[] args) {

    // Declaracion de un objeto
    Perro sultan;

    // Instanciacion de un objeto
    sultan = new Perro(); // Perro() es el metodo constructor

    Perro gandulfa = new Perro();

    // Acceso a los atributos y metodos de un objeto
    sultan.ladrar();
    sultan.nombre = "Sultan";

    System.out.println(sultan.nombre);

    gandulfa.ladrar();
    gandulfa.nombre = "Gandulfa";

    Perro poncho = new Perro("Poncho");
    System.out.println(poncho.nombre);

    Gato tato = new Gato();

    // No puedo acceder a un atributo private
    //tato.nombre = "tato";
    //System.out.println(tato.nombre);
    tato.setNombre("tato");
    System.out.println(tato.getNombre());

    // Sin acceso al metodo "private"
    //System.out.println(tato.verificarInicial("Jose"));
  }
}