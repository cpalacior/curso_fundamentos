import java.util.Scanner;
public class Helado{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int temperatura = scan.nextInt();
        if(temperatura > 27){
            System.out.println("Comprar helado cerveza");
        }
    }
}