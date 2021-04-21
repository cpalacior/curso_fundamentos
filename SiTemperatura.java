import java.util.Scanner;
public class SiTemperatura {
    public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Ingrese la temperatura ");
    int temp = scan.nextInt();
    if(temp > 30){
        System.out.println("Comprar helado ");
        System.out.println("Comprar limonada ");
    }
    else {
        System.out.println("Comprar tinto ");
    }
    System.out.println("Fin del programa ");
    }
}