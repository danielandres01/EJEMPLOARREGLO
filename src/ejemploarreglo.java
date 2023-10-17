import java.util.Scanner;

public class ejemploarreglo {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in) ;
        int valor = 0 ;
        int[] arreglo = new int[10];

        for (int i = 0; i <arreglo.length; i++){
            System.out.println("Dame valor " + (i +1));
            valor = t.nextInt();
            arreglo[i] = valor;
        }
        for (int i: arreglo){
            System.out.print(i + "  ");
        }
    }
}





