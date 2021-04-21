import java.util.Scanner;
public class Mesada{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String nombre = scan.next();
        int mesada = scan.nextInt();
        while(true){
            if(mesada >= 500){
                System.out.println(nombre + " eres mi angel");
                break;
            }
            else{
                System.out.println(nombre + " me decepcionas");
            }
            mesada = scan.nextInt();
        }
    }
}