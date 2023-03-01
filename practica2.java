import java.util.Arrays;

// PROFE ROMPI LOS MAIN PARA PONERLOS EN UNA MISMA CLASS Y PODER CORRERLOS.

public class practica2 {

  public static void main1(String[] args) {
    String pal = "casa";
    char letra = 'a';
    int baul = 0;

    for(int i=0; i<pal.length(); i++){
      if(pal.charAt(i)==letra) {
        baul++;
      }
    }
    System.out.println("La palabra "+pal+" tiene "+baul+" letra/s "+letra);
  }


  public static void main2(String[] args) {
    int num = 123;
    int[] vector = new int[3];

    for(int cont=0; cont<=2; cont++ ) {
      if(cont==0) {
        vector[cont] = num%10/1;
      }
      else {
        vector[cont] = (int)(num%(Math.pow(10, cont+1))/(Math.pow(10, cont)));
      }
    }
    System.out.println(Arrays.toString(vector));

    //         --!>     ESTE ME COSTÓ UNA BANDA xD       <--
  }

  public static void main3(String[] args) {

    int[] vector = {1, 2, 3, 4, 5};
    int xNem = 2;
    int resultado = 0;

    for(int i=0; i<vector.length; i++) {
      if(vector[i]>xNem) {
        resultado = resultado + vector[i];
      }
    }
    System.out.println(resultado);
  }


  public static void main4(String[] args) {
    String frase = "ahola que tal";
    String abecedario = "abcdefghijklmnopqrstuvwxyz ";
    String fraseNueva = "";

    for(int i=0; i<frase.length(); i++) {
      for(int j=0; j<abecedario.length(); j++) {
        if(frase.charAt(i)==abecedario.charAt(j)) {
          if(abecedario.charAt(j)==' ') {
            fraseNueva = fraseNueva + 'b';
          }
          else {
            fraseNueva = fraseNueva + abecedario.charAt(j+2);
          }
        }
      }
    }
    System.out.println(fraseNueva);
  }

  public static void main(String[] args) {
    String[] separado = "3_tristes tigres_del_13".split("_");

    for (int i = 0; i < separado.length; i++) {
      System.out.println(separado[i]);
    }
  }
}

