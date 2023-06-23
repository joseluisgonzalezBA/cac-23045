// Esta clase hereda de la superclase Mamifero
public class Perro extends Mamifero{

  // Hacemos sobreescritura del metodo (anulamos el de la superclase)
  public void expresar(){
    System.out.println("Guau");
  }

  public void moverCola(int veces) {
    System.out.println("Cola movida " + veces + " veces.");
  }
}
