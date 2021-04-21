import java.util.Scanner;
public class Acumulaciones{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese numero");
        int n = scan.nextInt();
        int acumula = 0;
        int i = 0;
        while(i < n){
            System.out.println("Ingrese numero para sumar");
            int num = scan.nextInt();
            acumula = acumula + num;
        }
        System.out.println(acumula); 
        System.out.println("Fin programa");
    }
}
