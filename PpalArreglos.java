import java.util.ArrayList;
public class PpalArreglos{
    public static void main(String[]args){
        //static
        int[] arreglo_enteros = new int[3];
        arreglo_enteros[0] = 1;
        arreglo_enteros[1] = 5;
        arreglo_enteros[2] = 26;
        InvertirArreglo.imprimir(arreglo_enteros);
        String[] arreglo_strings;
        double[] arreglo_double;
        //dinamic
        ArrayList<Integer> edades = new ArrayList<Integer>();
        ArrayList<String> nombres = new ArrayList<String>();
        System.out.println(arreglo_enteros[2]);
        //el 2 es la posición
        arreglo_enteros[1] = 8;
        System.out.println(arreglo_enteros[1]);
        InvertirArreglo.imprimir(arreglo_enteros);
    }
}