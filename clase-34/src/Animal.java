// Esta clase abstracta no se puede instanciar (crear objetos)
// Para instanciar un objeto de esta clase se debe usar el constructor de una subclase
public abstract  class Animal {

  // Este atributo estatico pertenece a la clase (no se hereda a los objetos)
  public static int cantidad = 0;
  static int cantRespiraciones = 0;
  private int edad;
  double peso;

  Animal (){
    this.edad = 0;
    cantidad++;
  }

  public void respirar(){
    cantRespiraciones++;
  }

  public void comer(double comida){
    peso += comida / 10;
  }

  public void cumplirAnios(){
    edad++;
  }

  public void trasladar(double distancia){
    peso -= distancia / 10;
  }

  public int getEdad() {
    return edad;
  }

  public double getPeso() {
    return peso;
  }

  // Este metodo abstracto no se define en la clase
  // Obliga a ser implementado en las subclases
  public abstract void expresar();
}
