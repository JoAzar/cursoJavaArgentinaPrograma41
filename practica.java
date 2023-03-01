public class practica {

  public static void main(String[] args) {
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
}
