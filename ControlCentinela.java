import java.util.Scanner;
public class ControlCentinela{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int cont = 0;
        System.out.println("Ingrese numero");
        int num = scan.nextInt();
        while(num != 0){
            if(num > 0){
                cont = cont + num;
                System.out.println(cont);
                num = scan.nextInt();
            }
            else if(num < 0){
                cont = cont + num;
                System.out.println(cont);
                num = scan.nextInt();
            }
        }
        System.out.println("Fin programa");
    }
}