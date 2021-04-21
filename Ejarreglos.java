import java.util.Scanner;
public class Ejarreglos{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int tamaño = scan.nextInt();
        int[] arr_int = new int[tamaño];
        int i = 0;
        while(i < tamaño){
            arr_int[i] = 5;
            System.out.println(arr_int[i]);
            i = i + 1;
        }
        // el usuario cambia todos los arreglos
        while(i < tamaño){
            arr_int[i] = scan.nextInt();
            System.out.println(arr_int[i]);
            i = i + 1;
        }
    }
}