import java.util.Scanner;
public class Switche{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la nota: ");
        int nota = scan.nextInt();
        switch(nota){
            case 10:
                System.out.print("Teso");
                break;
            case 9:
                System.out.print("Tesito");
                break;
            case 8:
                System.out.print("Vas bien");
                break;
            default:
                System.out.print("Puedes mejorar");
                break;
        }
    }
}