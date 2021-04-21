import java.util.Scanner;
public class Conteo100{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int conteo = 0;
        while (true){
            if (num > 100){
                conteo = conteo + 1;
            }
            else if(num == 0){
                System.out.println(conteo);
                break;
            }
            num = scan.nextInt();
        }
    }
}