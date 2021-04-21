import java.util.Scanner;
public class Multiplos5{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int i = 5;
        while (i <= num){
            System.out.println(i);
            i = i + 5;
        }
    }
}