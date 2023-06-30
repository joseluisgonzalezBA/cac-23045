import utiles.Calculo;

public class Main {
  public static void main(String[] args) {

//    Calculo cal1 = new Calculo();
//    Calculo cal2 = new Calculo();

//    System.out.println(cal1.numero_pi);
//    System.out.println(cal2.numero_pi);
//
//    cal1.numero_pi = 8.1;
//    System.out.println(cal1.numero_pi);
//    System.out.println(cal2.numero_pi);

    double a = Calculo.promedio(8, 10);
    System.out.println("a vale " + a);

    System.out.println("El nº pi es " + Calculo.numero_pi);

    double x = 8.79;
    System.out.println(Math.floor(x));
    System.out.println(Math.ceil(x));
    System.out.println(Math.round(x));

    if ( x <= 10 ){
      System.out.println("Condicion cumplida.");
    }
    else {
      System.out.println("Condicion no cumplida.");
    }

    if (x > 400)
      System.out.println("Es mayor");

    int i = 0;
    while (i < 10) {
      System.out.println(i);
      i++;
    }

    for (int j = 22; j<37 ; j+=5) {
      System.out.println(j);
    }

    switch (i){
      case 0:
        // instrucciones
        break;
      case 1:
        // instrucciones
        break;
      case 2:
        // instrucciones
        break;
      case 3:
        // instrucciones
        break;
      default:
    }

    System.out.println();
    for (int j = 0; j<7 ; j++) {
      if (j == 3)
        continue;
      System.out.println(j);
    }

    System.out.println();
    for (int j = 0; j<7 ; j++) {
      if (j == 3)
        break;
      System.out.println(j);
    }

    int numeros[] = new int[10];

    numeros[4] = 34;

    System.out.println(numeros.length);

    //double nums[] = new double[5];
    double nums[] = {4.2 , 5.1, 8.45, 9.6};

    double[] e = new double[8];

    String palabras[] = {"hola", "que", "tal"};

    System.out.println();
    for(i=0; i < palabras.length ; i++ ){
      System.out.print(palabras[i] + " ");
    }

  }
}