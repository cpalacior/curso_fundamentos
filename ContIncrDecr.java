import java.util.Scanner;
public class ContIncrDecr{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        double i = 0.0;
        int x = 0;
        double n = scan.nextDouble();
        while (n != 0){
            if(n > i){
                x = x + 1;
                System.out.println("+1");
            }
            else if (n < i){
                x = x - 1;
                System.out.println("-1");
            }
            i = n;
            n = scan.nextDouble();
        }
        System.out.println("Contador: "+ x);
    }
}