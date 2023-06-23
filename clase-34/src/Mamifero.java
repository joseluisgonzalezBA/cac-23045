// Esta clase hereda de la superclase Animal
public class Mamifero extends Animal{

  // Atributo propio de esta clase (no heredada)
  private String pelaje;

  Mamifero(){
    super(); // Llama al constructor de la superclase
    this.peso = 1.0;
  }

  public void trasladar(double distancia){
    peso -= distancia/1000;
  }

  public String getPelaje() {
    return pelaje;
  }

  public void setPelaje(String pelaje) {
    this.pelaje = pelaje;
  }

  // Implementa el metodo abstracto de la superclase
  public void expresar(){}
}
