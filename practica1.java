import java.util.Scanner;

public class practica1 {
    public static void main(String[] args) {
      String[] separado = "3_tristes tigres_del_13".split("_");

      for (int i = 0; i < separado.length; i++) {
        System.out.println(separado[i]);
      }
    }
}