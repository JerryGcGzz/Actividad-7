import java.util.Arrays;

class opcion {
    int cantidad;

    //Metodo para sucesion de numeros primos
    public static int[] getPrimos(int cantidad){
        int a = 0;
        int d = 0;
        int b;
        int [] primos = new int[cantidad];

        for(int n= 2; a<primos.length; n++){
            for(int c=1; c<n; c++){
                b=n%c;
                if(b == 0){
                    d++;
                }
            }
            if(d<2){
                primos[a] = n;
                a++;
            }
            d = 0;
        }
        return primos;
    }

    //Metodo sucesion de fibonicci
    public static int[] getSucesionFibo(int cantidad) {
        int x = 1, y = 0, number;
        int[] fibonicci = new int[cantidad];

        for (int n = 0; n < fibonicci.length; n++) {
            fibonicci[n] = y;
            number = x + y;
            y = x;
            x = number;
        }
        return fibonicci;
    }
}

public class Hola {
    public static void main(String[] args) {

      int cantidad = 10;

      System.out.println("Numeros primos: ");
      for (int x=0; x<cantidad; x++) {
          System.out.print(opcion.getPrimos(cantidad)[x] +", ");

          if(x == cantidad-1){
              System.out.println("..., {hasta n números}");
          }
      }

      System.out.println("Sucesión de Fibonaci: ");
      for (int x=0; x<cantidad; x++){
          System.out.print(opcion.getSucesionFibo(cantidad)[x] +", ");

          if(x == cantidad-1){
              System.out.println(("..., {hasta n números}"));
          }
      }

    }
 }

