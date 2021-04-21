import java.util.Scanner;
public class Supermercado{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int type = scan.nextInt();
        int cantidad = scan.nextInt();
        
        if(type == 1){
            int puntos = 5;
            int total = cantidad * puntos;
            System.out.println(total);
        }
        else if(type == 2){
            int puntos = 10;
            int total = cantidad * puntos;
            System.out.println(total);
        }
        else if(type == 3){
            int puntos = 15;
            int total = cantidad * puntos;
            System.out.println(total);
        }
    }
}