import java.util.Scanner;
public class SiTemperatura2 {
    public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Ingrese la temperatura ");
    int temp = scan.nextInt();
    int dinero = scan.nextInt();
    if(temp > 30){
        if(dinero > 5){
            System.out.println("Comprar helado ");
            System.out.println("Comprar limonada ");
        }
    }
   
    System.out.println("Fin del programa ");
    }
}