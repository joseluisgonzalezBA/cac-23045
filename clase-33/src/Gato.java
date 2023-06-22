public class Gato {
  private String nombre;

  public void maullar(){
    System.out.println("¡Miau!");
  }

  Gato(){}

  Gato(String nombre){
    this.nombre = nombre;
  }

  // ENCAPSULAMIENTO
  // Getter (para nombre)
  public String getNombre(){
    return this.nombre;
  }

  // Setter (para nombre)
  public void setNombre(String nombre){
    if (verificarInicial(nombre)) {
      this.nombre = nombre;
    }
  }

  private boolean verificarInicial(String texto){
    char letra = texto.charAt(0);
    return (letra >= 'A' && letra <= 'Z');
  }
}
